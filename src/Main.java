public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int contribution = 15000;
        int amountSavings = 0;
        int month = 0;
        while (amountSavings < 2459000) {
            month = month + 1;
            amountSavings = contribution * month;

        }
        System.out.println("Месяц " + month + ", сумма накоплений равна" + amountSavings + " рублей.");
        //Task 2
        System.out.println("Task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        int population = 12000000;
        float birthRate = 0.017f;
        float mortalityRate = 0.008f;
        int year = 1;
        while (year <= 10) {
            population = population + (int) (population * birthRate * year) - (int) (population * mortalityRate * year);
            System.out.println("Год " + year + " ,численность населения составляет " + population);
            year++;
        }
        //Task 4
        System.out.println("Task 4");
        contribution = 15000;
        amountSavings = 0;
        month = 0;
        while (amountSavings < 12000000) {
            month++;
            amountSavings = (contribution * month) + (int) (0.07 * contribution * month);
            System.out.println("Месяц " + month + ", сумма накоплений равна" + amountSavings + " рублей.");
        }
        //Task 5
        System.out.println("Task 5");
        contribution = 15000;
        amountSavings = 0;
        month = 0;
        while (amountSavings < 12000000) {
            month++;
            amountSavings = (contribution * month) + (int) (0.07 * contribution * month);
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна" + amountSavings + " рублей.");
        }
        //Task 6
        System.out.println("Task 6");
        contribution = 15000;
        amountSavings = 0;
        month = 0;
        while (month < 108) {
            month++;
            amountSavings = (contribution * month) + (int) (0.07 * contribution * month);
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна" + amountSavings + " рублей.");
        }
        //Task 7
        System.out.println("Task 7");
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
        while (friday <= 31);
        //Task 8.1
        System.out.println("Task 8.1");
        year = 0;
        int yearNow = 2025;
        int year100=yearNow+100;
        int year200=yearNow-200;
        for (year = year200;year<year100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        //Task 8.2
        System.out.println("Task 8.2");
        year = 0;
        yearNow = 2025;
        year100=yearNow+100;
        year200=yearNow-200;
        while ( year<year100 ) {
        year++;
        if (year%79==0 && year>year200)
        System.out.println(year);
        }

    }
}
