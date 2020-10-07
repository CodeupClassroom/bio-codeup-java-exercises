package oopLecture.madlib;

/**
 * Primary class that represents the entire program
 */
public class MadLibGame {

    private MadLibAnswer madlibAnswer;
    private MadLib madlib;

    private void outputWelcome() {
        IoUtils.output("Welcome to the Mad Lib game!");
        IoUtils.output("The first step is to create a Mad Lib. You will be prompted to enter a few things to do this.");
    }

    private void generateMadLib() {
        this.madlib =  MadLibUtils.createMadLib(
                "Please enter a sentence with three words missing. You should use a single underscore for each missing word...",
                "Please enter a word or phrase type for the first missing word...",
                "Please enter another word or phrase type for the second missing word...",
                "Please enter a final word or phrase type for the third missing word...");
    }

    private void outputMadLibDetails() {
        IoUtils.output("The Mad Lib you created has the following structure...");
        IoUtils.output(madlib.getMadLibSummary());
    }

    private void generateUserMadLib() {
        IoUtils.output("Now that a Mad Lib has been created, try out silly answers!");
        this.madlibAnswer = MadLibUtils.fillInMadLib(madlib);
    }

    private void outputUserMadLib() {
        IoUtils.output(this.madlibAnswer.returnUserVersion());
    }

    private void outputClosingMsg() {
        IoUtils.output("\nThat was crazy!");
    }

    private static void run() {
        MadLibGame madLibGame = new MadLibGame();
        madLibGame.outputWelcome();
        madLibGame.generateMadLib();
        madLibGame.outputMadLibDetails();
        madLibGame.generateUserMadLib();
        madLibGame.outputUserMadLib();
        madLibGame.outputClosingMsg();
    }

    // entry point of application
    public static void main(String[] args) {
        MadLibGame.run();
    }

}
