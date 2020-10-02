public class StringsLec {

    public static void main(String[] args) {
        String message = "Hello";
//        message = message.replace('e','a');
        System.out.println(message); // prints "Hello"
        message = message + " World!";
        System.out.println(message); // prints "Hello, World!"

        String dbEmail = "fer@codeup.com";
        String email = "Fer@Codeup.Com".toLowerCase();
        String studentEmail = "fergmail.com";

//        if(email.equalsIgnoreCase(dbEmail)){
//            System.out.println("email = " + email);
//            System.out.println("they match");
//        }

        if(studentEmail.endsWith("@codeup.com")) {
            System.out.println("You can see the grades sheet");
        } else{
            System.out.println("You are not allowed to see this file");
        }

        if(studentEmail.startsWith("fer".toLowerCase())){
            System.out.println("You can see your grades sheet");
        }

        System.out.println(email.charAt(0) == 'f');

        System.out.println(email.indexOf("@"));
        System.out.println(studentEmail.indexOf("@"));

        if (email.indexOf("@") > 0) {
            System.out.println("Email validation passed");
        } else {
            System.out.println("Email validation failed");
        }

        System.out.println("first index = " + email.indexOf("o"));
        System.out.println("last index = " + email.lastIndexOf("o"));

    }

}
