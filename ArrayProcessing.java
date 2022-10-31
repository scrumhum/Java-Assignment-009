import java.util.Scanner;
public class ArrayProcessing {
    public int[] Array1; //create array for 5 objects
    public Scanner scan; //scanner object

    ArrayProcessing() {
        this.Array1 = new int[5];
        this.scan = new Scanner(System.in);
        getNumbers(); //call method
        processNumbers(); //call method
    }
public static void main(String[]args){
        new ArrayProcessing();
}
    public void getNumbers() {
        System.out.println("Enter 5 integers");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = scan.nextInt();
        } // assign each integer to an array element

    }

    public void processNumbers() {

        while (again()) {
            int result = printMenu();
            if (result == 1) {
                add();
            } else if (result == 2) {
                mult();
            } else if (result == 3) {
                print();
            } else if (result == 4) {
                reverse();
            } else {
                System.out.println("Input not valid");

            }
        }
    }
    private int printMenu() {
        System.out.println("Choose an option to perform:\n" +
                "1) Add numbers\n" +
                "2) Multiply numbers\n" +
                "3) Print numbers\n" +
                "4) Print number in reverse\n");
        return scan.nextInt();
    }
            public void add () {
                System.out.println("Printing Sum: ");
                int add = 0;
            for (int i : Array1) {
                add += i;
            }
                System.out.println(add);

        }
            public void mult () {
                System.out.println("Printing Product: ");
                int mult = 1;
            for (int i : Array1) {
                mult *= i;
            }
                System.out.println(mult);

        }
            public void print () {
            for (int i : Array1) {
                System.out.println("Printing array: ");
                System.out.println(i);
                {

                }
            }
        }
            public void reverse () {
        System.out.println("Print reversed: ");
            for (int i = Array1.length - 1; i >= 0; i--) {
                System.out.println(Array1[i]);
            }
                System.out.println(Array1);
        }
        public boolean again(){
            System.out.println("""
                    Choose: 
                    1) Choose another option
                    2) Exit
                    """);
            return scan.nextInt() !=2 ;
        }
        }