public class Army extends Soldier {

  Army(String name, String rank, int serialNumber) {
    super(name, rank, serialNumber);
  }

  public void speak() {
    System.out.println("Dying to Live!");
  }
}