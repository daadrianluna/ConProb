package conprob;
import java.util.ArrayList;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.Instance;
 
/**
 * Clase encargada de definir la estructura del Dataset manualmente.
 * Crea los atributos y sus respectivas etiquetas para Weka.
 */
public class NuevoData {
    
   // Lista de arreglos donde se almacenan las etiquetas de cada atributo 
    
   private ArrayList<String> tradeTypeLabels = new ArrayList<String>();
   private ArrayList<String> tradePositionLabels = new ArrayList<String>();
   private ArrayList<String> cajaMillonariaLabels = new ArrayList<String>();
   private ArrayList<String> fylLabels = new ArrayList<String>();
   private ArrayList<String> bbLabels = new ArrayList<String>();
   private ArrayList<String> beforeTrendLabels = new ArrayList<String>();
   private ArrayList<String> areaBreakoutLabels = new ArrayList<String>();
   private ArrayList<String> expectationLabels = new ArrayList<String>();
   private ArrayList<String> areaEntryLabels = new ArrayList<String>();
   private ArrayList<String> classLabels = new ArrayList<String>();
 
    /**
     * Crea y devuelve un objeto Instances (dataset) con la estructura y los atributos
     * definidos, listo para usarse con algoritmos de Weka.
     * 
     * @return El dataset estructurado sin datos (solo cabeceras/atributos).
     */
    public Instances crearData(){
        
        // Lleno y agrego las etiquetas a cada elemento de la lista
        
        // Etiquetas del atributo 1: Tipo de trade
        this.tradeTypeLabels.add("V1");
        this.tradeTypeLabels.add("V2");
        this.tradeTypeLabels.add("V2/V3");
        this.tradeTypeLabels.add("T1");
        
        // Etiquetas del atributo 2: Posicion del trade
        this.tradePositionLabels.add("1");
        this.tradePositionLabels.add("2");
        this.tradePositionLabels.add("3");
        
        // Etiquetas del atributo 3: Caja millonaria
        this.cajaMillonariaLabels.add("-30");
        this.cajaMillonariaLabels.add("30");
        this.cajaMillonariaLabels.add("40");
        
        // Etiquetas del atributo 4: Impulso de la FYL
        this.fylLabels.add("Fuerte");
        this.fylLabels.add("Normal");
        this.fylLabels.add("Bajo");
        
        // Etiquetas del atributo 5: Impulso de las BB
        this.bbLabels.add("Normal");
        this.bbLabels.add("Bajo");
        this.bbLabels.add("Fuerte");
        
        // Etiquetas del atributo 6: Antes de iniciar la tendencia
        this.beforeTrendLabels.add("Consolidacion y cambio");
        this.beforeTrendLabels.add("Consolidacion y continuacion");
        this.beforeTrendLabels.add("Cambio de tendencia");
        this.beforeTrendLabels.add("Continuacion de la tendencia");
        
        // Etiquetas del atributo 7: Previos rompimientos
        this.areaBreakoutLabels.add("Si");
        this.areaBreakoutLabels.add("No");
        
        // Etiquetas del atributo 8: Expectativa a favor
        this.expectationLabels.add("No");
        this.expectationLabels.add("Si");
        
        // Etiquetas del atributo 9: Area en la entrada
        this.areaEntryLabels.add("Si");
        this.areaEntryLabels.add("No");
        
        // Etiquetas del atributo 10: CLASE (Resultado del trade)
        this.classLabels.add("Negativo");
        this.classLabels.add("Positivo");
        this.classLabels.add("?");
        
        // Creacion de atributos: los argumentos son el nombre del atributo y la lista de etiquetas
        Attribute num1 = new Attribute("Que tipo de trade es?", tradeTypeLabels);
        Attribute num2 = new Attribute("Que posicion de trade en la tendencia es?", tradePositionLabels);
        Attribute num3 = new Attribute("Caja millonaria", cajaMillonariaLabels);
        Attribute num4 = new Attribute("Impulso de la FYL", fylLabels);
        Attribute num5 = new Attribute("Impulso en las BB", bbLabels);
        Attribute num6 = new Attribute("Antes de iniciar la tendencia...", beforeTrendLabels);
        Attribute num7 = new Attribute("Hubo un previo rompimiento de areas.", areaBreakoutLabels);
        Attribute num8 = new Attribute("La expectativa esta a favor... ", expectationLabels);
        Attribute num9 = new Attribute("En la entrada al trade existe un area? ", areaEntryLabels);
        Attribute cls = new Attribute("Es un trade...", classLabels);
        
        // Creacion de lista de atributos para posteriormente crear el dataset
        ArrayList<Attribute> atributos = new ArrayList<Attribute>();
        
        atributos.add(num1);
        atributos.add(num2);
        atributos.add(num3);
        atributos.add(num4);
        atributos.add(num5);
        atributos.add(num6);
        atributos.add(num7);
        atributos.add(num8);
        atributos.add(num9);
        atributos.add(cls);
       
        // Creo el dataset agregando el nombre, la lista de atributos y la capacidad de memoria
        Instances dataset = new Instances("Test-dataset", atributos, 3);      
      
        // Agregar instancia dummy para inicializar estructura
        double[] valores = new double[dataset.numAttributes()];
        
        // Seleccionamos un valor dummy para la clase
        valores[9]=2; // Valor "?"
         
        Instance inst = new DenseInstance(1.0, valores);
        dataset.add(inst);
        
        return dataset;
    }
}
