import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza cyfre: ");
        int a = scan.nextInt();
        System.out.println("Podaj druga cyfre: ");
        int b = scan.nextInt();
        if(a<b){
            System.out.println(a + " jest mniejsze od " + b);
        }else if(a==b){
            System.out.println(a + " jest rowne " + b);
        }else{
            System.out.println(a + " jest większa od " + b);
        }
        System.out.println("Orzeł czy reszka?");
        int[] orzelReszka = {0,1};
        System.out.println("orzel(1) czy reszka(0)?");
        int c = scan.nextInt();
        Random random = new Random();
        int randomOrzelReszka = random.nextInt(orzelReszka.length);
        System.out.println(orzelReszka[randomOrzelReszka]);
        if(c==randomOrzelReszka){
            System.out.println("Trafiles!");
        }else{
            System.out.println("Nie trafiles!!");
        }

    }
}

