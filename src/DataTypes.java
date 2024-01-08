public class DataTypes {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'T';
        byte bt = -128;
        short s = 6457;
        int i = 894738375;
        float f = 23.736f;
        double d = 48765.83643;

        System.out.println("Boolean b = " + b);
        System.out.println("Charecter c = " + c);
        System.out.println("Byte b = " + bt);
        System.out.println("Short s = " + s);
        System.out.println("Integer i = " + i);
        System.out.println("Float f = " + f);
        System.out.println("Double d = " + d + "\n");

        System.out.println("Using format specifier");
        System.out.printf("Boolean b = %b\n" , b);
        System.out.printf("Charecter c = %c\n" , c);
        System.out.printf("Byte b = %d\n" , bt);
        System.out.printf("Short s = %d\n" , s);
        System.out.printf("Integer i = %d\n" , i);
        System.out.printf("Float f = %.2f\n" , f);
        System.out.printf("Double d = %.3f\n" , d);
    }
}
