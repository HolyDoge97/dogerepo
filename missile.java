
import java.util.Scanner;

import java.util.ArrayList;

public class missile {
    public static void main (String[] args) {

        String nati;
        ArrayList ifna = new ArrayList<>();

        ifna.add("미국");
        ifna.add("영국");
        ifna.add("호주");
        ifna.add("인도");

        // System.out.println(ifna);

        System.out.println("어느나라에 미사일을 쏘실건가요?");
        System.out.println("참고로, 저희나라의 동맹국에는 미국, 영국, 호주, 인도가 있습니다.");

        Scanner scn = new Scanner(System.in);

        nati = scn.next();
        scn.close();

        /*
        ArrayList nata = new ArrayList<>();
        nata = nati;
        */

        if (nati.indexOf(미국||영국||호주||인도)) {
            System.out.printf("%s\n 이 나라들은 저희 동맹입니다. 미치셨습니까?", nati);

        }else {

                System.out.println("우하하 발싸발싸");
            }
            
    }
}


