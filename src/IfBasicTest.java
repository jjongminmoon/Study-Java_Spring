import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        // Q. x의 값이 0보다 큰 경우에만 출력하시오.
        int x=10;
        if(x>0) {
            System.out.println("양수입니다.");
        }

        // Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하시오.
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=scan.nextInt();

        if(num%7==0) System.out.println("7의 배수입니다.");

        // Q. 나이를 입력 받아 19세 이상이면 성인임을 출력하시오.
        System.out.print("나이를 입력하세요: ");
        int age=scan.nextInt();

        if(age>=19) System.out.println("성인입니다.");

        System.out.println("종료");
    }
}
