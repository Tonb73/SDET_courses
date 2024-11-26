
/**
 * Класс оружие со свойствами <b>manufacturer</b>, <b>model</b>, <b>magCap</b>,<b>gunCount</b>  .
 * @autor Tonby73
 * @version 1
 */
public abstract class Gun {

    /** Поле производитель */
    private String manufacturer;

    /** Поле модель */
    private String model;

    /** Поле Емкость магазина */
    private int magCap;

    /** Поле Подсчет экземпляров оружия */
    private static int gunCount = 0;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param mf - производитель
     * @param model - модель
     * @param capacity - емкость магазина
     */
    public Gun(String mf, String model, int capacity){
        this.manufacturer = mf;
        this.model = model;
        this.magCap = capacity;
        gunCount++;
    }

    /**
     * Метод демонстрации информации об объекте через консоль
     */
    public void showGunInfo(){

        System.out.println("Производитель:" + manufacturer);
        System.out.println("Модель:" + model);
        System.out.println("Емкость магазина:" + magCap);
    }

    /**
     * Метод получения значения поля {@link Gun#gunCount}
     * @return возвращает  кол-во экземпляров оружия
     */
    public static int getGunCount() {
        return gunCount;
    }

    /**
     * Метод получения значения поля {@link Gun#manufacturer}
     * @return возвращает наименования производителя
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Метод получения значения поля {@link Gun#model}
     * @return возвращает наименования модели
     */
    public String getModel() {
        return model;
    }

    /**
     * Метод получения значения поля {@link Gun#magCap}
     * @return возвращает емкость магазина
     */
    public int getMagCap() {
        return magCap;
    }
}
