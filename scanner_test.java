
import java.util.Scanner;

public class scanner_test {
    public static void main(String[] args) {
        
        
        //float fever = 36.5F;
        //String name = "조석환";
        //int age = 26;

        Float fever;  // 실수형 체온
        String name;  // 문자열형 이름
        int age;      // 정수형 나이

        Scanner scan = new Scanner(System.in);   // Scanner Class를 불러와 scan이라는 객체(변수)에 지정. (System.in)은 무언가를 읽어들일때 사용하는 메소드.

        fever = scan.nextFloat();  //실수형으로 입력 받음
        name = scan.next();        // 문자열형으로 입력 받음
        age = scan.nextInt();      // 정수형으로 입력 받음

        scan.close()  // scanner 종료. close하지 않으면 Resource Leak라며 경고 나옴

        System.out.printf("%s은 %d세이고, 적정체온은 %f도 이다.", name, age, fever);
    }

    
}
