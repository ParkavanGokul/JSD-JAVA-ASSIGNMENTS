public class VARIABLES {
    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;
    float f = 3.14f;
    double d = 2.71828;
    char c = 'A';
    boolean bool = true;
    String str = new String("HELLO PRIMITIVE DATATYPES OF VARIABLES");
    public void display() {
        System.out.println("The values of the primitive data types are:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String : " + str);
    }

    public static void main(String[] args) {
        VARIABLES obj = new VARIABLES();
        obj.display();
    }
}


