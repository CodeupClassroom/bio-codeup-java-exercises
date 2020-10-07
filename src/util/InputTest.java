package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        if (input.yesNo())
//            System.out.println("This returned a true");
//        else
//            System.out.println("It actually said no");

        System.out.println(input.getInt(120,350));
    }
}
