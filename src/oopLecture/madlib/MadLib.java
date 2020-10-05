package oopLecture.madlib;

/**
 * A class that represents a new madlib.
 */
public class MadLib {

    private String sentence;
    private String wordType1;
    private String wordType2;
    private String wordType3;

    public MadLib(String sentence, String wordType1, String wordType2, String wordType3) {
        this.setSentence(sentence);
        this.wordType1 = wordType1;
        this.wordType2 = wordType2;
        this.wordType3 = wordType3;
    }

    public String getMadLibSummary() {
        String convertedSentence = sentence.replace("%s", "{%s}");
        return String.format(convertedSentence, wordType1, wordType2, wordType3);
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence.replace("_", "%s");
    }

    public String getWordType1() {
        return wordType1;
    }

    public void setWordType1(String wordType1) {
        this.wordType1 = wordType1;
    }

    public String getWordType2() {
        return wordType2;
    }

    public void setWordType2(String wordType2) {
        this.wordType2 = wordType2;
    }

    public String getWordType3() {
        return wordType3;
    }

    public void setWordType3(String wordType3) {
        this.wordType3 = wordType3;
    }

    static void main(String[] args) {
        MadLib ml = new MadLib("Hello _ _ _.", "adjective", "adjective", "noun");
        System.out.println(ml.getMadLibSummary());
    }
}
