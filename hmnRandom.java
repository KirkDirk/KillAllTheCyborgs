import java.util.Random;

/**
 * Вид людей с рандомными показателями
 */
public class hmnRandom extends ClsHuman<NtrfWeapon> {

    public hmnRandom(String hmnName, int hmnHealth, int hmnInitiative, NtrfWeapon hmnWeapon1) {
        super(hmnName, hmnHealth, hmnInitiative, hmnWeapon1);
        /** Выбираем имя человека */
        final String[] nameHumans = {"Ivan", "Boris", "Kyle Reese", "John Connor", "Sara Connor"};
        Random random = new Random();
        int index = random.nextInt(nameHumans.length);
        hmnName = nameHumans[index];
        /** Устанавливаем значение очков жизни */
        hmnHealth = (int)(Math.random()*200+100);
        /** Устанавливаем значение инициативы */
        hmnInitiative = (int)(Math.random()*10+15);
        /** Берем в руки оружие */
        hmnWeapon1 = new RflAK();
        super.setHmnName(hmnName);
        super.setHmnHealth(hmnHealth);
        super.setHmnInitiative(hmnInitiative);
        super.setHmnWeapon1(hmnWeapon1);
    }
    
}
