public class StringsLec {

    public static void main(String[] args) {
        String message = "Hello";
//        message = message.replace('e','a');
        System.out.println(message); // prints "Hello"
        message = message + " World!";
        System.out.println(message); // prints "Hello, World!"

        String dbEmail = "fer@codeup.com";
        String email = "Fer@Codeup.Com";
        if(email.equalsIgnoreCase(dbEmail)){
            System.out.println("email = " + email);
            System.out.println("they match");
        }


    }

}
