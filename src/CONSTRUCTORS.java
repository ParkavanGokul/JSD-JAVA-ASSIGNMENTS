import java.util.Scanner;

public class CONSTRUCTORS {
        int a = 5;
        int b = 7;
        CONSTRUCTORS(){
            System.out.println("Hello  , I am Constructor!");
        }
        void mul(int a, int b) {
            int c = a * b;
            System.out.println(c);
        }

        int add(int a, int b) {
            int c = a + b;
            return c;
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);

            //int x = sc.nextInt();
            //int y = sc.nextInt();

            CONSTRUCTORS cc = new CONSTRUCTORS();
            //cc.mul(cc.a,cc.b);

            System.out.println(cc.add(cc.a,cc.b));
            int z = cc.add(cc.a,cc.b);
            System.out.println(z);



        }

}

