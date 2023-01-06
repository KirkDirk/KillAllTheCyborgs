/**
 * Класс "Киборг"
 */
public abstract class ClsCyborg<E extends NtrfWeapon> {
    /** Поле класса "Киборг" - модель */
    private String cbrgModel; 
    /** Поле класса "Киборг" - роботоспособность */
    private int cbrgCapasity;
    /** Поле класса "Киборг" - оружие1 */
    private int cbrgInitiative;
    /** Оружие1 */
    private E cbrgWeapon1;
    
    /**
     * Конструктор класса "Киборг"
     * @param cbrgModel - модель
     * @param cbrgCapasity - роботоспособность
     * @param cbrgInitiative - инициатива
     * @param cbrgWeapon1 - оружие1
     */
    public ClsCyborg(String cbrgModel, int cbrgCapasity, int cbrgInitiative, E cbrgWeapon1) {
        this.cbrgModel = cbrgModel;
        this.cbrgCapasity = cbrgCapasity;
        this.cbrgInitiative = cbrgInitiative;
        this.cbrgWeapon1 = cbrgWeapon1;
    }
    @Override
    public String toString() {
        return String.format("Киборг %s [РС: %d, И: %d, О: %s]", cbrgModel, cbrgCapasity, cbrgInitiative, cbrgWeapon1.toString());
    }
    public String getCbrgModel() {
        return cbrgModel;
    }
    public int getCbrgCapasity() {
        return cbrgCapasity;
    }
    public int getCbrgInitiative() {
        return cbrgInitiative;
    }
    public E getCbrgWeapon1() {
        return cbrgWeapon1;
    }
    public void setCbrgModel(String cbrgModel) {
        this.cbrgModel = cbrgModel;
    }
    public void setCbrgCapasity(int cbrgCapasity) {
        this.cbrgCapasity = cbrgCapasity;
    }
    public void setCbrgInitiative(int cbrgInitiative) {
        this.cbrgInitiative = cbrgInitiative;
    }
    public void setCbrgWeapon1(E cbrgWeapon1) {
        this.cbrgWeapon1 = cbrgWeapon1;
    }
}