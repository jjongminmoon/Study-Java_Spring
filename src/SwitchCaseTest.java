public class SwitchCaseTest {
    public static void main(String[] args) {
        // Q. switch ~ case 문을 활용하여 요일에 해당하는 활동을 출력하시오.
        String day="Friday";
        switch (day) {
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
