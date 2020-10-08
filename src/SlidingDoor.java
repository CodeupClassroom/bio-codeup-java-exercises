public final class SlidingDoor extends Door {
    public SlidingDoor(String description) {
        super(description);
    }

    public void open() {
        System.out.printf("Attempting to slide open the %s door.\n", this.description);
        super.open();
    }

    public void close() {
        System.out.printf("Attempting to slide close the %s door.\n", this.description);
        super.close();
    }
}
