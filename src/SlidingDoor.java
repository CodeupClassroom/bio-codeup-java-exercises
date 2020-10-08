public class SlidingDoor extends Door {
    public SlidingDoor(String description) {
        super(description);
    }

    public void open() {
        System.out.println("Attempting to slide open the door.");
        super.open();
    }

    public void close() {
        System.out.println("Attempting to slide close the door.");
        super.close();
    }
}
