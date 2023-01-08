import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Вид людей с рандомными показателями
 */
public class hmnRandom extends ClsHuman<NtrfWeapon> {
    /** Заданные имена людишек */
    List<String> listHumans =  new ArrayList<String>(Arrays.asList("Ivan", "Boris", "Kyle Reese", "John Connor", "Sara Connor"));


    public hmnRandom(String hmnName, int hmnHealth, int hmnInitiative, NtrfWeapon hmnWeapon1) {
        super(hmnName, hmnHealth, hmnInitiative, hmnWeapon1);
        /** Выбираем имя человека. И удаляем его из списка, чтобы не повторялись */
        Random random = new Random();
        int index = random.nextInt(listHumans.size());
        hmnName = listHumans.get(index);
        listHumans.remove(hmnName);
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

    public hmnRandom() {
        this("", 0, 0, null);
    }
        
}
