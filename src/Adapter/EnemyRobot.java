package Adapter;

public class EnemyRobot {
    public void smashWithHands() {
        System.out.println("Enemy Robot Causes Damage With Its Hands");
    }

    public void walkForward() {
        System.out.println("Enemy Robot Walks Forward");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
