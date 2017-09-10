public abstract class Soldier implements HandToHand, Weapon {

  public String name;
  public String rank;
  public int serialNumber;


  Soldier(String name, String rank, int serialNumber) {
    this.name = name;
    this.rank = rank;
    this.serialNumber = serialNumber;
  }

  void sleep(){
    System.out.println("Zzzzz");
  }

  void eat() {
    System.out.println("nom nom nom");
  }

  void move() {
    System.out.println("push forward");
  }

  public void punch() {
    System.out.println("knuckle sandwich!");
  }

  public void kick() {
    System.out.println("Haul Ass!");
  }

  public void gun(){
    System.out.println("sharp shooter");
  }

  public void knife() {
    System.out.println("shank");
  }


  @Override
  public void assault(){
    System.out.println("attaaaack!");
  }

  public abstract void speak();
}