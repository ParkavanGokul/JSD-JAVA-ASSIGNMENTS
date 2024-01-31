public class LOOPING_CONSTRUCTS {
    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //for-each loop
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.println(num);
        }

        // while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //do-while loop
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j <= 111);

    }
}
