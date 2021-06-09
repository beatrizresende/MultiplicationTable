import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
Scanner sc = new Scanner(System. in);
System.out.println("What number would you like to see the multiplication table of?");
int num = sc.nextInt();
sc.close();

if(num >= 0){
    for(int i=1; i<=10; i++){
        int result = num*i;
        System.out.println(num + " x " + i + " = " + result);
    }
} else {
    System.out.println("Choose a positive number");
}
}
}