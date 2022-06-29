import java.util.Scanner;

public class gugu {
    public static void main (String[] args) {

        int ap;
        int dui;
        int result;

        Scanner scan = new Scanner(System.in);
        System.out.println("원하시는 구구단의 앞자리를 입력해주세요\n :");
        ap = scan.nextInt();
        scan.close();

        for(dui = 1; dui < 11; dui++) {
            
            result = ap * dui;
            System.out.printf("%d 곱하기 %d의 결과는 %d입니다.\n",ap, dui, result);
        }


        System.out.println("구구단 출력 완료."); 

    }
    
}
