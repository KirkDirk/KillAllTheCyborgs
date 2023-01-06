/**
 * Класс "Люди"
 */
public abstract class ClsHuman <F extends NtrfWeapon> {
    /** Поле "Имя" класса "Люди" */
    private String hmnName;
    /** Поле "Очки жизни" класса "Люди" */
    private int hmnHealth;
    /** Поле "Инициатива" класса "Люди" */
    private int hmnInitiative;
    /** Поле "Оружие" класса "Люди" */
    private F hmnWeapon1;
    
    /**
     * Конструктор класса "Люди"
     * @param hmnName - имя
     * @param hmnHealth - очки жизни
     * @param hmnInitiative - инициатива
     * @param hmnWeapon1 - оружие
     */
    public ClsHuman(String hmnName, int hmnHealth, int hmnInitiative, F hmnWeapon1) {
        this.hmnName = hmnName;
        this.hmnHealth = hmnHealth;
        this.hmnInitiative = hmnInitiative;
        this.hmnWeapon1 = hmnWeapon1;
    }
    @Override
    public String toString() {
        return String.format("Боец %s [РС: %d, И: %d, О: %s]", hmnName, hmnHealth, hmnInitiative, hmnWeapon1.toString());
    }
    public String getHmnName() {
        return hmnName;
    }
    public int getHmnHealth() {
        return hmnHealth;
    }
    public int getHmnInitiative() {
        return hmnInitiative;
    }
    public F getHmnWeapon1() {
        return hmnWeapon1;
    }
    public void setHmnName(String hmnName) {
        this.hmnName = hmnName;
    }
    public void setHmnHealth(int hmnHealth) {
        this.hmnHealth = hmnHealth;
    }
    public void setHmnInitiative(int hmnInitiative) {
        this.hmnInitiative = hmnInitiative;
    }
    public void setHmnWeapon1(F hmnWeapon1) {
        this.hmnWeapon1 = hmnWeapon1;
    }
    


}
