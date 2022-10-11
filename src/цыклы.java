public class цыклы {

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int monthNumber = 1;
        int sum = 0;
        while (sum < 2_459_000) {
            sum += 15_000;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей \n", monthNumber, sum);
            monthNumber++;
        }

        //Задание 2
        System.out.println("Задание 2");
        int x = 1;
        while (x <= 10){
            System.out.print(x++ + " ");
        }
        System.out.println();
        for (int i = 10; i >=1 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int brithRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population += brithRate;
            population -= deathRate;
            System.out.printf("Год %d, численность %d /n", i, population);
        }
    }
}
