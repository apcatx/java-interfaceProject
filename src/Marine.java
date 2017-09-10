public class Marine extends Soldier {

  Marine(String name, String rank, int serialNumber) {
    super(name, rank, serialNumber);
  }

  public void speak() {
    System.out.println("Hoorah!");
  }
}