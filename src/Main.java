public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int ageLegal = 20;
        if (ageLegal >= 18 ) {
        System.out.println("Поздравляем Вас с совершеннолетием");
    }
        int ageNotLegal = 17;
        if (ageNotLegal < 18) {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил и нужно немного подождать");}


        // Задание 2
        System.out.println("Задание 2");
        int ageSchool = 7;
        if (ageSchool >= 7) {
            System.out.println("Ребёнок ходит в школу, если его возраст равен или больше 7 лет");}

        int ageStudent = 20;
        if (ageStudent >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");}

        int ageWork = 25;
        if (ageWork >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");}


        // Задание 3
        System.out.println("Задание 3");
        int totalNotFreeSeats = 102;
        if (totalNotFreeSeats >= 102) {
            System.out.println("В вагоне нет свободных мест");}

        int freeSitSeats = 60;
        if (freeSitSeats <= 60) {
            System.out.println("В вагоне есть свободное сидячее место");}

        int freeStandSeats = totalNotFreeSeats-freeSitSeats;
        if (freeStandSeats <= 42) {
            System.out.println("В вагоне есть свободное стоячее место");}


        // Задание 4
        System.out.println("Задание 4");
        int age2Legal = 20;
        if (age2Legal >= 18 ) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        } else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил и нужно немного подождать");}

        int age3Legal = 17;
        if (age3Legal >= 18 ) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        } else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил и нужно немного подождать");}


        // Задание 5
        System.out.println("Задание 5");
        int age2Student = 7;
        if (age2Student >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");
        } else {
            System.out.println("Ребёнок ходит в школу, если его возраст равен или больше 7 лет");
        }

        int age3Student = 20;
        if (age3Student >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");
        } else {
            System.out.println("Ребёнок ходит в школу, если его возраст равен или больше 7 лет");
        }

        int age2Work = 25;
        if (age2Work >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");
        } else {
            System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");
        }


        // Задание 6
        System.out.println("Задание 6");
        int total2NotFreeSeats = 102;
        if (total2NotFreeSeats >= 102) {
            System.out.println("В вагоне нет свободных мест");
        } else {
            System.out.println("В вагоне есть сободные места");
        }

        int free2SitSeats = 60;
        if (free2SitSeats <= 60) {
            System.out.println("В вагоне есть свободное сидячее место");
        } else {
            System.out.println("В вагоне нет свободного сидячего места");
        }

        int free2StandSeats = totalNotFreeSeats-freeSitSeats;
        if (free2StandSeats <= 42) {
            System.out.println("В вагоне есть свободное стоячее место");
        } else {
            System.out.println("В вагоне нет свободного стоячего места");
        }


        // Задание 7
        System.out.println("Задание 7");
        int age = 4;
        boolean needGoToKinderg = age <= 6 && age > 2;
        if (needGoToKinderg) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }

        int age2 = 9;
        boolean needGoToSchool = age2 <= 18 && age2 > 7;
        if (needGoToSchool) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }

        int age3 = 23;
        boolean needGoToUniversity = age3 <= 24 && age3 > 18;
        if (needGoToUniversity) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        }

        int age4 = 35;
        boolean needGoToWork = age4 > 24;
        if (needGoToWork) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }

        // Задание 8
        System.out.println("Задание 8");
        int age5 = 3;
        boolean canNotGoAlone = age5 <= 5;
        if (canNotGoAlone) {
            System.out.println("Если ребёнку " + age5 + ", то ему нельзя кататься на аттракционе");
        }

        int age6 = 7;
        boolean canGoWithAdult = age6 <= 14 && age6 > 5;
        if (canGoWithAdult) {
            System.out.println("Если ребёнку " + age6 + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        }

        int age7 = 17;
        boolean canGoAlone = age7  > 14;
        if (canGoAlone) {
            System.out.println("Если ребёнку " + age7 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задание 9
        System.out.println("Задание 9");
        int one = 5;
        int two = 7;
        int three = 1;
        if (one >= two && one >= three)
            System.out.println(one + " - наибольшее число");

         else if (two >= one && two >= three)
            System.out.println(two + " - наибольшее число");

         else
             System.out.println(three + " - наибольшее число");
   }
}