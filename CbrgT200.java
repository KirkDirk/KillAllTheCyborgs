/**
 * Вид "Т200" класса "Киборг"
 */
public class CbrgT200 extends ClsCyborg<NtrfWeapon> {
    /**
     * Конструктор вида "Т200" класса "Киборг"
     * @param cbrgModel - модель = Т200
     * @param cbrgCapasity - роботоспособность = 200
     * @param cbrgInitiative - инициатива = 20
     * @param cbrgWeapon1 - оружие
     */
    public CbrgT200(String cbrgModel, int cbrgCapasity, int cbrgInitiative, NtrfWeapon cbrgWeapon1) {
        super("T200", 200, 30, new RflAK());
    }
     
    @Override
    public String toString() {
        return "Т200" + super.toString();
    }
}
