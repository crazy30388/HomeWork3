public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte apple = 10;
        System.out.println("Значение переменной с типом byte равно " + apple);
        short cherry = 10000;
        System.out.println("Значение переменной с типом short равно " + cherry);
        int nails = 2124763902;
        System.out.println("Значение переменной с типом int равно " + nails);
        long hair = 3435432546746539876L;
        System.out.println("Значение переменной с типом long равно " + hair);
        float weight = 3.4F;
        System.out.println("Значение переменной с типом float равно " + weight);
        double time = 60.4;
        System.out.println("Значение переменной с типом double равно " + time);

        // Задача 2
        System.out.println("Задача 2");
        double dou = 27.12;
        System.out.println(dou);
        long in = 987678965549L;
        System.out.println(in);
        byte by = 2;
        System.out.println(by);
        short sho = 786;
        System.out.println(sho);
        boolean a = 10 > 20;
        System.out.println(a);
        short sho1 = 569;
        System.out.println(sho1);
        short sho2 = -159;
        System.out.println(sho2);
        short sho3 = 27897;
        System.out.println(sho3);
        byte by2 = 67;
        System.out.println(by2);

        // Задача 3
        System.out.println("Задача 3");
        byte a1 = 23;
        short b = 27;
        int c = 30;
        int general = a1 + b + c;
        System.out.println(general);
        int student = 480 / general;
        System.out.println("На каждого ученика рассчитано " + student + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte bottle = 16;
        int minute20 = bottle * 20 / 2;
        System.out.println("За 20 минут машина произвела бутылок " + minute20 + " штук");
        int dAy1 = 24*60;
        System.out.println(dAy1);
        int day1 = bottle * dAy1 / 2;
        System.out.println("За сутки машина произвела бутылок " + day1 + " штук");
        int dAy3 = 72 * 60;
        System.out.println(dAy3);
        int day3 = bottle * dAy3 / 2;
        System.out.println("За 3 дня машина произвела бутылок " + day3 + " штук");
        int dAy30 = 30 * 24 * 60;
        System.out.println(dAy30);
        int day30 = bottle * dAy30 / 2;
        System.out.println("За 1 месяц машина произвела бутылок " + day30 + " штук");

        // Задача 5
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte oneClassCans = 6;
        int classes = totalCans / oneClassCans;
        byte white = 2;
        int whiteCans = classes * white;
        byte brown = 4;
        int brownCans = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans +
                " банок белой краски и " + brownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        short bananas = 5 * 80;
        short milk = 200 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int breakfast = bananas + milk + iceCream + eggs;
        System.out.println("Вес спорт-завтрака " + breakfast + " грамм");
        float breakfastKg = (float) breakfast / 1000;
        System.out.println("Вес спорт-завтрака " + breakfastKg + " кг");

        // Задача 7
        System.out.println("Задача 7");
        short wheigtSport = 7 * 1000;
        short wheigtMin = 250;
        short wheigtMax = 500;
        int dayMin = wheigtSport / wheigtMin;
        System.out.println(dayMin + " дней уйдет на похудение, если спортсмен будет терять по " +
                "250 гр каждый день");
        int dayMax = wheigtSport / wheigtMax;
        System.out.println(dayMax + " дней уйдет на похудение, если спортсмен будет терять по " +
                "500 гр каждый день");
        int dayAverage = dayMin + dayMax / 2;
        System.out.println(dayAverage + " дней может потребоваться в среднем, чтобы добиться" +
                " результата похудения");

        // Задача 8
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashs10 = masha + (masha * 10 /100);
        int denis10 = denis + (denis * 10 / 100);
        int kristina10 = kristina + (kristina * 10 / 100);
        System.out.println("После увеличения на 10% Маша будет получать " + mashs10 + " рублей," +
                " Денис " + denis10 + " рублей, Кристина " + kristina10 + " рублей");
        int beforePromotion1 = masha * 12;
        int beforePromotion2 = denis * 12;
        int beforePromotion3 = kristina * 12;
        System.out.println("Годовой доход до повышения на 10% у Маши составит " + beforePromotion1 +
                " рублей, у Дениса " + beforePromotion2 + " рублей. у Кристины " + beforePromotion3 +
                " рублей");
        int afterPromotion1 = mashs10 * 12;
        int afterPromotion2 = denis10 * 12;
        int afterPromotion3 = kristina10 * 12;
        int difference1 = afterPromotion1 - beforePromotion1;
        int difference2 = afterPromotion2 - beforePromotion2;
        int difference3 = afterPromotion3 - beforePromotion3;
        System.out.println("Маша теперь получает " + afterPromotion1 + " рублей, годовой" +
                " доход вырос на " + difference1 + " рублей. Денис теперь " +
                "получает " + afterPromotion2 + " рублей, годовой доход вырос" +
                "на " + difference2 + " рублей, Кристина теперь получает " +  afterPromotion3 +
                " рублей, годовой доход вырос на " + difference3 + " рублей");
    }
}