public class CK2x5 {
    public static void main(String[] args) throws Exception {

        /** Создание группы киборгов */
        Group<ClsCyborg> groupCyborgs = new Group<>();

        /** Наполнение группы киборгов из 3 единиц рандомными видами*/
        for (int i = 0; i < 3; i++) {
            int rand = (int)(Math.random()*3);
            if (rand == 0) { groupCyborgs.addCyborg(new CbrgT200()); }
            else if (rand == 1) { groupCyborgs.addCyborg(new CbrgT700()); }
            else { groupCyborgs.addCyborg(new CbrgT1000()); }
        }
        groupCyborgs.forEach(item -> System.out.println(item));
                
        /** Создание группы людей */
        Group<ClsHuman> groupHumans = new Group<>();

        /** Наполнение группы людей из 5 единиц рандомными видами*/
        for (int i = 0; i < 5; i++) {
            groupHumans.addHuman(new hmnRandom());
        }
        groupHumans.forEach(item -> System.out.println(item));

    }
}
