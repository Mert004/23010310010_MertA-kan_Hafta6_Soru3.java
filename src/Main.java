import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz : ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        int i = 1;
        while (i <= sayi) {
            faktoriyel *= i;
            i++;
        }
        
        System.out.println(sayi + "! = " + faktoriyel);
    }

	}


