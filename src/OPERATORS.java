public class OPERATORS {
    int a = 10, b = 5;
    double c = 3.14, d = 2.71;
    char e = 'A', f = 'B';
    boolean g = true, h = false;
    public void arithmetic() {
        System.out.println("Arithmetic operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));
    }

    public void assignment() {
        System.out.println("Assignment operators:");
        int x = a;
        System.out.println("x = a = " + x);
        x += b;
        System.out.println("x += b = " + x);
        x -= b;
        System.out.println("x -= b = " + x);
        x *= b;
        System.out.println("x *= b = " + x);
        x /= b;
        System.out.println("x /= b = " + x);
        x %= b;
        System.out.println("x %= b = " + x);
    }

    public void relational() {
        System.out.println("Relational operators:");
        System.out.println("a < b = " + (a < b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("c < d = " + (c < d));
        System.out.println("c > d = " + (c > d));
        System.out.println("c <= d = " + (c <= d));
        System.out.println("c >= d = " + (c >= d));
        System.out.println("c == d = " + (c == d));
        System.out.println("c != d = " + (c != d));
        System.out.println("e < f = " + (e < f));
        System.out.println("e > f = " + (e > f));
        System.out.println("e <= f = " + (e <= f));
        System.out.println("e >= f = " + (e >= f));
        System.out.println("e == f = " + (e == f));
        System.out.println("e != f = " + (e != f));
    }

    public void logical() {
        System.out.println("Logical operators:");
        System.out.println("g && h = " + (g && h));
        System.out.println("g || h = " + (g || h));
        System.out.println("!g = " + (!g));
        System.out.println("!h = " + (!h));
    }


    public void unary() {
        System.out.println("Unary operators:");
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));
        System.out.println("~a = " + (~a));
    }

    public void bitwise() {
        System.out.println("Bitwise operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));
    }

    public void ternary() {
        System.out.println("Ternary operator:");
        int max = (a > b) ? a : b;
        System.out.println("max of a and b = " + max);
    }


    public static void main(String[] args) {
        OPERATORS obj = new OPERATORS();
        obj.arithmetic();
        obj.assignment();
        obj.relational();
        obj.logical();
        obj.unary();
        obj.bitwise();
        obj.ternary();
    }
}
