//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BoltActionGun boltActionRifle = new BoltActionGun("Российская империя","M1891",5,true,true);

        boltActionRifle.reload();
        boltActionRifle.shoot();
        boltActionRifle.shoot();
        boltActionRifle.charge();
        boltActionRifle.shoot();
        boltActionRifle.charge();
        boltActionRifle.shoot();
        boltActionRifle.reload();
        boltActionRifle.showGunInfo();

        MachineGunGun machineGun = new MachineGunGun("США", "BAR",30,100);
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.cool();
        machineGun.reload();
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.showGunInfo();

    }
}