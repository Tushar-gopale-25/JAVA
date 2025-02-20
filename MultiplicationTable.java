public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 10; 
        int i = 1;
        
        System.out.println("Multiplication Table for " + number);
        
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
