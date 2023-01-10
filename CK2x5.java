import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CK2x5 {
    public static void main(String[] args) throws Exception {
        
        /** Создание группы киборгов */
        Group<ClsCyborg> groupCyborgs = new Group<>();

        /** Наполнение группы киборгов из 3 единиц рандомными видами*/
        for (int i = 0; i < 3; i++) {
            int rand = (int)(Math.random()*3);
            if (rand == 0) { groupCyborgs.addUnit(new CbrgT200()); }
            else if (rand == 1) { groupCyborgs.addUnit(new CbrgT700()); }
            else { groupCyborgs.addUnit(new CbrgT1000()); }
        }
        groupCyborgs.forEach(item -> System.out.println(item));
                
        /** Создание группы людей */
        Group<ClsHuman> groupHumans = new Group<>();

        /** Наполнение группы людей из 5 единиц рандомными видами*/
        /** Заданные имена людишек */
        List<String> listHumans =  new ArrayList<String>(Arrays.asList("Ivan", 
            "Boris", 
            "Kyle Reese", 
            "John Connor", 
            "Sara Connor"));
        for (int i = 0; i < 5; i++) {
            /** Выбираем имя человека. И удаляем его из списка, чтобы не повторялись */
            Random random = new Random();
            int index = random.nextInt(listHumans.size());
            String hmnName = listHumans.get(index);
            listHumans.remove(hmnName);
            /** Добавляем человека в группу */
            groupHumans.addUnit(new hmnRandom(hmnName));
        }
        groupHumans.forEach(item -> System.out.println(item));
        System.out.println();
        
    }
}
