package conprob;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSink;
import weka.core.converters.ConverterUtils.DataSource;
import java.io.InputStream;
import java.io.File;

/**
 * Clase encargada de manejar el núcleo lógico del modelo predictivo (Weka).
 * 
 * ARQUITECTURA Y FLUJO:
 * 1. Entrenamiento: Al llamarse getPrediccion(), la clase carga el dataset histórico 
 *    (Tradesdataset.arff) que contiene casos pasados de operaciones y sus resultados.
 * 2. Algoritmo: Utiliza el clasificador J48 (Árbol de Decisión) para encontrar patrones 
 *    matemáticos entre las 9 características del trade y su resultado final.
 * 3. Inyección: Toma los datos seleccionados por el usuario en la GUI, crea una nueva 
 *    instancia "en blanco" usando el esquema (testo.arff) y le pide al árbol que la clasifique.
 * 4. Resultado: Devuelve el resultado ("Positivo" o "Negativo") para que la vista lo muestre.
 */
public class Prediccion {
    
    /**
     * Entrena el modelo y predice el resultado basado en los datos ingresados en la interfaz.
     * 
     * @return El resultado de la clasificación en formato String.
     * @throws Exception Si ocurre un error leyendo los datos o construyendo el modelo.
     */
    public String getPrediccion() throws Exception {
        
        // 1. Cargar el dataset de entrenamiento (Tradesdataset.arff) y prueba (test.arff)
        // Utilizamos getResourceAsStream para leer desde src/main/resources/data dentro del JAR.
        InputStream trainingStream = getClass().getResourceAsStream("/data/Tradesdataset.arff");
        InputStream testStream = getClass().getResourceAsStream("/data/testo.arff"); // testo.arff contiene el schema
        
        if (trainingStream == null || testStream == null) {
            throw new Exception("No se encontraron los archivos de datos ARFF en la ruta /data/");
        }

        DataSource ds = new DataSource(trainingStream);
        DataSource sin = new DataSource(testStream);
        
        Instances dataset = sin.getDataSet();
        
        // 2. Crear una nueva instancia con los datos ingresados por el usuario
        double[] valores = new double[dataset.numAttributes()];

        // Asignar los valores desde los comboboxes de la ventana principal
        valores[0] = VentanaMain.index1;
        valores[1] = VentanaMain.index2;
        valores[2] = VentanaMain.index3;
        valores[3] = VentanaMain.index4;
        valores[4] = VentanaMain.index5;
        valores[5] = VentanaMain.index6;
        valores[6] = VentanaMain.index7;
        valores[7] = VentanaMain.index8;
        valores[8] = VentanaMain.index9;
       
        Instance inst = new DenseInstance(1.0, valores);
        dataset.add(inst);
        
        // Dejamos en blanco la etiqueta de la clase (atributo 9) para que el modelo la prediga
        dataset.instance(0).setMissing(9);
        System.out.println("Instancia a predecir:\n" + dataset.toString());

        // 3. Preparar las instancias de entrenamiento
        Instances ins = ds.getDataSet();
        // Elegimos el último atributo como la clase a predecir
        ins.setClassIndex(ins.numAttributes() - 1);
        
        // 4. Entrenar el clasificador (Árbol de Decisiones J48)
        J48 cls = new J48();
        Instances test = ins;
        cls.buildClassifier(ins);
        
        System.out.println("Modelo generado:\n" + cls.toString());
        
        // 5. Evaluar el modelo
        Evaluation eval = new Evaluation(ins);
        eval.evaluateModel(cls, test);
        System.out.println(eval.toSummaryString("\nResultados de la Evaluación\n=======================\n", false));
        System.out.println(eval.toMatrixString());
        
        // Guardamos un resumen en una variable estática para mostrarlo en la UI
        VentanaMain.info = eval.toSummaryString();
         
        // 6. Clasificar la nueva instancia
        Instances unlabeled = dataset;
        unlabeled.setClassIndex(unlabeled.numAttributes() - 1);
        
        // Crear una copia donde se guardará el nuevo dataset etiquetado
        Instances labeled = new Instances(unlabeled);
        
        // Clasificar y etiquetar instancias
        for (int i = 0; i < unlabeled.numInstances(); i++){
            double clsLabel = cls.classifyInstance(unlabeled.instance(i));
            labeled.instance(i).setClassValue(clsLabel);
        }
        
        // 7. Guardar el archivo etiquetado (opcional, en el directorio de ejecución actual)
        try {
            File outputFile = new File("labeled_output.arff");
            DataSink.write(outputFile.getAbsolutePath(), labeled);
            System.out.println("Archivo etiquetado guardado en: " + outputFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("No se pudo guardar el archivo etiquetado: " + e.getMessage());
        }
   
        System.out.println("Resultado predicho: " + labeled.instance(0).toString(9));
        return labeled.instance(0).toString(9);
    }
}
