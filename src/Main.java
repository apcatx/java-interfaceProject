public class Main {

    public static void main(String[] args) {

        Soldier armySoldier  = new Army("Mr. Green", "officer", 1 );
        Soldier marineSoldier = new Marine("Mr. Blue", "captain", 2);

        armySoldier.eat();
        armySoldier.gun();
        armySoldier.kick();
        armySoldier.punch();
        armySoldier.sleep();
        armySoldier.speak();
        armySoldier.knife();
        armySoldier.move();
        armySoldier.assault();

        marineSoldier.eat();
        marineSoldier.gun();
        marineSoldier.kick();
        marineSoldier.punch();
        marineSoldier.sleep();
        marineSoldier.speak();
        marineSoldier.knife();
        marineSoldier.move();
        marineSoldier.assault();
    }
}