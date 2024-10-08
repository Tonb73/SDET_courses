public class BoltActionGun extends Gun implements IBoltAction{

    private boolean integralMagazine; //Является ли магазин встроенным или внешним
    private boolean bayonet; //есть ли штык нож

    private int currentRounds = 0; //Текущее кол-во патронов в магазине

    private boolean isCharged = false; //Взведено ли оружие
    public BoltActionGun(String mf, String model, int capacity, boolean intMag, boolean bt) {
        super(mf, model, capacity);
        integralMagazine = intMag;
        bayonet = bt;
    }

    @Override
    public void shoot() {
        if((currentRounds > 0 && isCharged)){
            System.out.println("Bang");
            isCharged = false;
        }
        else{
            if(currentRounds == 0){
                System.out.println("Кончились патроны, необходимо перезарядиться!");
            }
            if(!isCharged){
                System.out.println("Небходимо взвести курок!");
            }
        }
    }

    @Override
    public void reload() throws InterruptedException {
        charge();
        if(integralMagazine){
            for(int i = currentRounds; i <= getMagCap(); i++){
                System.out.println("Патроны в магазине: " + i );
                currentRounds++;
                    Thread.sleep(200);

            }
        }
        if(!integralMagazine){
            currentRounds = getMagCap();
            System.out.println("Вставлен новый магазин. Теперь патронов: " + currentRounds);
        }
    }

    @Override
    public void charge() {
        if(currentRounds > 0) {
            currentRounds--;
        }
        System.out.println("Курок был взведен!");
        isCharged = true;
    }

    public void buttStroke(){
        if(!bayonet) {
            System.out.println("Удар прикладом!");
        }else{
            System.out.println("Удар штыком!");
        }
    }
}
