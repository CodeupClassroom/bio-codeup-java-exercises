public class DoorTest {
    public static void main(String[] args) {
//        Door metalDoor = new Door("metal");
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
//        metalDoor.close();
//        metalDoor.open();
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());

//        SlidingDoor backGlassSlidingDoor = new SlidingDoor("back glass");
//        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
//        backGlassSlidingDoor.close();
//        backGlassSlidingDoor.open();
//        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());

//        LockingDoor backDoor = new LockingDoor("back");
//        backDoor.open();
//        System.out.println("backDoor.isOpen() = " + backDoor.isOpen());
//        System.out.println("backDoor.isLocked() = " + backDoor.isLocked());
//        backDoor.unlock();
//        backDoor.unlock();
//        backDoor.open();
//        backDoor.lock();
//        backDoor.open();
//        backDoor.close();
//        System.out.println("backDoor.isOpen() = " + backDoor.isOpen());
//        System.out.println("backDoor.isLocked() = " + backDoor.isLocked());
        Door[] doors = new Door[3];
        doors[0] = new LockingDoor("front");
        doors[1] = new LockingDoor("back");
        doors[2] = new SlidingDoor("front glass");

        for (Door door: doors) {
            door.open();
        }
    }
}
