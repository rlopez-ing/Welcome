public class Main {

    public static void main (String[] args){
        int cadence = 0;
        int speed = 0;
        int gear = 0;

        // Types the var
        boolean result = false;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

        // Integer literals
        int decimalValue = 26;
        int hexadecimalValue = 0x1a;
        int binaryValue = 0b11010;

        // Floating-point literals
        double d1 = 123.4;
        double d2 = 1.234e2;
        float f1 = 123.4f;

        // Arrays.
        int[] anArray;
        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Welcome Java \n");

        System.out.println("Element at index 0: " + anArray[9]);
        System.out.println("Longitud: " + anArray.length);

        String[][] number = {
                { "Row 1", "Uno", "Dos" },
                { "Row 2", "Uno" }
        };
        System.out.println(number[0][0] + " " + number[0][2]);
        System.out.println(number[1][0] + " " + number[1][1]);

        System.out.println("Completado Satisfactoriamente!...");
    }

}
