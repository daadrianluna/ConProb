
package conprob;
import java.util.ArrayList;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.Instance;
 

public class NuevoData {
    
   //Lista de arreglos donde se alamacenan las etiquetas de cada atributo 
    
   private ArrayList<String> etiquetas1 = new ArrayList<String>();
   private ArrayList<String> etiquetas2 = new ArrayList<String>();
   private ArrayList<String> etiquetas3 = new ArrayList<String>();
   private ArrayList<String> etiquetas4 = new ArrayList<String>();
   private ArrayList<String> etiquetas5 = new ArrayList<String>();
   private ArrayList<String> etiquetas6 = new ArrayList<String>();
   private ArrayList<String> etiquetas7 = new ArrayList<String>();
   private ArrayList<String> etiquetas8 = new ArrayList<String>();
   private ArrayList<String> etiquetas9 = new ArrayList<String>();
   private ArrayList<String> etiquetas10 = new ArrayList<String>();
 
    
public Instances crearData(){
    
    //LLeno y agrego las atiquetas a cada elemento de la lista
    //Etiquetas del atributo 1    
    this.etiquetas1.add("V1");
    this.etiquetas1.add("V2");
    this.etiquetas1.add("V2/V3");
    this.etiquetas1.add("T1");
    
    //Etiquetas del atributo 2
    this.etiquetas2.add("1");
    this.etiquetas2.add("2");
    this.etiquetas2.add("3");
    
    //Etiquetas del atributo 3
    
    this.etiquetas3.add("-30");
    this.etiquetas3.add("30");
    this.etiquetas3.add("40");
    
    // Etiquetas atributo 4
    
    this.etiquetas4.add("Fuerte");
    this.etiquetas4.add("Normal");
    this.etiquetas4.add("Bajo");
    
    //  Etiquetas atributo 5
    
    this.etiquetas5.add("Normal");
    this.etiquetas5.add("Bajo");
    this.etiquetas5.add("Fuerte");
    
    //Etiquetas atrubuto 6
    
    this.etiquetas6.add("Consolidacion y cambio");
    this.etiquetas6.add("Consolidacion y continuacion");
    this.etiquetas6.add("Cambio de tendencia");
    this.etiquetas6.add("Continuacion de la tendencia");
    
    //Etiquetas atributos 7
    
    this.etiquetas7.add("Si");
    this.etiquetas7.add("No");
    
    // Etiquetas de atrubuto 8
    
    this.etiquetas8.add("No");
    this.etiquetas8.add("Si");
    
    //Etiquetas atributo 9
    
    this.etiquetas9.add("Si");
    this.etiquetas9.add("No");
    
    //Etiquetas atributo 10
    
    this.etiquetas10.add("Negativo");
    this.etiquetas10.add("Positivo");
    this.etiquetas10.add("?");
    
    //Creacion de atributos los argumentos es nombre y el segundo para agregar las etiquetas
    
    Attribute num1 = new Attribute("Que tipo de trade es?",etiquetas1);
    Attribute num2 = new Attribute("Que posicion de trade en la tendencia es?",etiquetas2);
    Attribute num3 = new Attribute("Caja millonaria",etiquetas3);
    Attribute num4 = new Attribute("Impulso de la FYL",etiquetas4);
    Attribute num5 = new Attribute("Impulso en las BB",etiquetas5);
    Attribute num6 = new Attribute("Antes de iniciar la tendencia...",etiquetas6);
    Attribute num7 = new Attribute("Hubo un previo rompimiento de areas.",etiquetas7);
    Attribute num8 = new Attribute("La expectativa esta a favor... ",etiquetas8);
    Attribute num9 = new Attribute("En la entrada al trade existe un area? ",etiquetas9);
    Attribute cls = new Attribute("Es un trade...",etiquetas10);
    
    //Creacion de lista de atributos para posteriormente crear el data set con estos atributos
    
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
   
   //creo el data set agregando el nombre la lista de atributos y la memoria en los argumentos 
   Instances dataset = new Instances("Test-dataset", atributos, 3);      
  
   //Agregar instancias 
   
     double[] valores = new double[dataset.numAttributes()];
     
     
     //Para agregar valores a la instancia y seleccionar poner entero del 0-numero opciones
    
     
     valores[9]=2;
     
     Instance inst = new DenseInstance(1.0, valores);
     dataset.add(inst);
     return dataset;



}
    
    
    
    
    
    
    
    
    
    
    
}
