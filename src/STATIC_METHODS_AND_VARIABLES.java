public class STATIC_METHODS_AND_VARIABLES
{
        //static function can access only static variables
        //non static function can access both static and non static variables
        //static function and variables are object independent
        int i=5;
        static int j=10;
        static void showCall()
        {
            System.out.println(j);
        }
        void show()
        {
            System.out.println(i+" "+j);
        }
        public static void main(String[] args) {
            STATIC_METHODS_AND_VARIABLES se=new STATIC_METHODS_AND_VARIABLES();
            STATIC_METHODS_AND_VARIABLES se2=new STATIC_METHODS_AND_VARIABLES();
            se.i++;
            se.j++;
            System.out.println(se.i);//non static
            System.out.println(se2.i);
            System.out.println(se.j);
            System.out.println(j);
            showCall();
            se2.show();

        }

}

