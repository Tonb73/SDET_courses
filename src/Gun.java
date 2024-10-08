public abstract class Gun {
    private String manufacturer; //Страна производитель
    private String model; //Модель оружия

    private int magCap; //Емкость магазина

    private static int gunCount = 0; // Подсчет экземпляров оружия

    public Gun(String mf, String model, int capacity){
        this.manufacturer = mf;
        this.model = model;
        this.magCap = capacity;
        gunCount++;
    }

    public void showGunInfo(){

        System.out.println("Производитель:" + manufacturer);
        System.out.println("Модель:" + model);
        System.out.println("Емкость магазина:" + magCap);
    }

    public static int getGunCount() { //геттер для получения кол-во экземпляров оружия
        return gunCount;
    }

    public String getManufacturer() { //геттер для производителя
        return manufacturer;
    }

    public String getModel() { //геттер для модели
        return model;
    }

    public int getMagCap() { //геттер для емкости магазина
        return magCap;
    }
}
