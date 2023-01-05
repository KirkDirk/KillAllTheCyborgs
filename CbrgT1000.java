/**
 * Вид "Т1000" класса "Киборг"
 */
public class CbrgT1000 extends ClsCyborg<NtrfWeapon>{
    /**
     * Конструктор вида "Т1000" класса "Киборг"
     * @param cbrgModel - модель = Т1000
     * @param cbrgCapasity - роботоспособность = 1000
     * @param cbrgInitiative - инициатива = 50
     * @param cbrgWeapon1 - оружие
     */
    public CbrgT1000(String cbrgModel, int cbrgCapasity, int cbrgInitiative, NtrfWeapon cbrgWeapon1) {
        super("T1000", 1000, 50, new RflAK());
    }
     
    @Override
    public String toString() {
        return "Т1000" + super.toString();
    }
    
}
