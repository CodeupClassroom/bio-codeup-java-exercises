public class DoorTest {
    public static void main(String[] args) {
//        Door metalDoor = new Door("metal");
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
//        metalDoor.close();
//        metalDoor.open();
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());

        SlidingDoor backGlassSlidingDoor = new SlidingDoor("back glass");
        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
        backGlassSlidingDoor.close();
        backGlassSlidingDoor.open();
        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());

    }
}
