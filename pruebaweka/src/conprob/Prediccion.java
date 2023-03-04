
package conprob;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSink;

public class Prediccion {
    
    VentanaMain ventana = new VentanaMain();


    
    public String getPrediccion()throws Exception{
        DataSource ds = new DataSource("src/conprob/Tradesdataset.arff");
       
        DataSource sin = new DataSource("src/conprob/test.arff");
        
        Instances dataset = sin.getDataSet();
        ///// Crear un data set en memoria
        double[] valores = new double[dataset.numAttributes()];

        //Para agregar valores a la instancia y seleccionar poner entero del 0-numero opciones

        valores[0]=VentanaMain.index1;
        valores[1]=VentanaMain.index2;
        valores[2]=VentanaMain.index3;
        valores[3]=VentanaMain.index4;
        valores[4]=VentanaMain.index5;
        valores[5]=VentanaMain.index6;
        valores[6]=VentanaMain.index7;
        valores[7]=VentanaMain.index8;
        valores[8]=VentanaMain.index9;
       
        
        Instance inst = new DenseInstance(1.0, valores);
        dataset.add(inst);
        dataset.instance(0).setMissing(9);///////// set missing para dejar en blanco la etiqueta de la clase de la instancia.
        System.out.println(dataset.toString());


        
        //Creo las instancias apartir del dataset y las almaceno en la variable ins
        Instances ins = ds.getDataSet();
        //Eligo la ultima instancia de mis intacias como clase index
        ins.setClassIndex(ins.numAttributes()-1);
        //creo un clasificador arbol de decisiones J48
        J48 cls = new J48();

        //creo intancias para entrenar
        Instances test = ins;
      
        //construyo un arbol de desiciones apartir de mis instancias
        cls.buildClassifier(ins);
        
        //imprimo en consola el arbol
        System.out.println(cls.toString());
        //creo un evaluador
        Evaluation eval = new Evaluation(ins);
        
        eval.evaluateModel(cls, test);
        System.out.println(eval.toSummaryString("\nResults\n\n", false));
        System.out.println(eval.toMatrixString());
        VentanaMain.info = eval.toSummaryString();
         
        //Clsificar instancias 
        
        //Seleccionar el dataset a clasificar y etiquetar
        Instances unlabeled =  dataset;
        unlabeled.setClassIndex(unlabeled.numAttributes() - 1);
        
        //crear la copia donde se guardara el nuevo data set
        
        Instances labeled = new Instances(unlabeled);
        
        //clasificar y etiquetar instancias
        
        for (int i = 0; i < unlabeled.numInstances(); i++){
            double clsLabel = cls.classifyInstance(unlabeled.instance(i));
            labeled.instance(i).setClassValue(clsLabel);
        }
        
        // guardamos el archivo
        DataSink.write("src/pruebaweka/labeled.arff", labeled);
   
       System.out.println(labeled.instance(0).toString(9));
       return labeled.instance(0).toString(9);
}
    
    
    
}
