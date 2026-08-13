package conprob;

public class Test {
    public static void main(String[] args) {
        System.out.println("Starting test...");
        // Set some default dummy values
        VentanaMain.index1 = 0;
        VentanaMain.index2 = 0;
        VentanaMain.index3 = 0;
        VentanaMain.index4 = 0;
        VentanaMain.index5 = 0;
        VentanaMain.index6 = 0;
        VentanaMain.index7 = 0;
        VentanaMain.index8 = 0;
        VentanaMain.index9 = 0;
        
        Prediccion p = new Prediccion();
        try {
            String res = p.getPrediccion();
            System.out.println("Result: " + res);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
