
import java.util.Scanner;

public class scanner_test {
    public static void main(String[] args) {
        
        
        //float fever = 36.5F;
        //String name = "조석환";
        //int age = 26;

        Float fever;
        String name;
        int age;

        Scanner scan = new Scanner(System.in);

        fever = scan.nextFloat();
        name = scan.next();
        age = scan.nextInt();

        System.out.printf("%s은 %d세이고, 적정체온은 %f도 이다.", name, age, fever);
    }

    
}
