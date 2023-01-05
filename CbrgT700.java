/**
 * Вид "Т700" класса "Киборг"
 */
public class CbrgT700 extends ClsCyborg<NtrfWeapon> {
    /**
     * Конструктор вида "Т700" класса "Киборг"
     * @param cbrgModel - модель = Т700
     * @param cbrgCapasity - роботоспособность = 700
     * @param cbrgInitiative - инициатива = 70
     * @param cbrgWeapon1 - оружие
     */
    public CbrgT700(String cbrgModel, int cbrgCapasity, int cbrgInitiative, NtrfWeapon cbrgWeapon1) {
        super("T700", 700, 70, new RflAK());
    }
     
    @Override
    public String toString() {
        return "Т700" + super.toString();
    }
}
