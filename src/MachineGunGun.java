import javax.annotation.processing.SupportedSourceVersion;

public class MachineGunGun extends Gun implements IMachineGun{

    private int currentRounds = 0; //Текущее кол-во патронов в магазине
    private int shootedRounds = 0; //Текущее кол-во отстреляных патронов в магазине

    private final int explosionAmount = 100; //кол-во выстреленных патронов, нужных для взрыва ствола
    private final long sleepParam = 10000;

    private boolean isExploded = false;

    private int rateOfFire; //Темп срельбы


    public MachineGunGun(String mf, String model, int capacity, int fireRate) {
        super(mf, model, capacity);
        rateOfFire = fireRate;
    }

    @Override
    public void shoot() throws InterruptedException {
        while (currentRounds > 0 && !isExploded){
            System.out.println("Pew pew!");
            Thread.sleep(sleepParam/(rateOfFire));
            currentRounds-=10;
            shootedRounds+=10;
            if(shootedRounds > explosionAmount){
                isExploded = true;
                System.out.println("POW!");
            }
        }
        if(currentRounds <= 0){
            System.out.println("Кончились патроны, необходимо перезарядиться!");
        }
        if (isExploded){
            System.out.println("Ствол взорвался из-за перегрева! Необходимо было чаще охлаждать оружие!");
        }

    }

    @Override
    public void reload() {
        if(!isExploded){
            currentRounds = getMagCap();
            System.out.println("Вставлен новый магазин. Теперь патронов: " + currentRounds);
        }

    }

    @Override
    public void cool() {
        if(!isExploded){
            shootedRounds = 0;
            System.out.println("Оружие охлаждено. Можно стрелять!");
        }

    }


}
