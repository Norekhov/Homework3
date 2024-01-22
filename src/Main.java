public class Main {
    public static void main(String[] args) {
        {
            System.out.println("ЗАДАЧА 1");
            int a = 100;
            byte b = 96;
            short c = 150;
            long d = 1000L;
            float e = 2.43f;
            double f = 100.9563;

            System.out.println("Значение переменной " + " a " + " с типом int равно " + a);
            System.out.println("Значение переменной " + " b " + " с типом byte равно " + b);
            System.out.println("Значение переменной " + " c " + " с типом short равно " + c);
            System.out.println("Значение переменной " + " d " + " с типом long равно " + d);
            System.out.println("Значение переменной " + " e " + " с типом float равно " + e);
            System.out.println("Значение переменной " + " f " + " с типом double равно " + f);
        }
        {
            //ЗАДАЧА 2
            float one = 27.12f;
            long two = 987678965549L;
            float three = 2.786f;
            short four = 569;
            short five = -159;
            int six = 27897;
            byte seven = 67;
        }
        {
            System.out.println("ЗАДАЧА 3");
            int oneClass = 23;
            int twoClass = 27;
            int threeClass = 30;
            int allSheetPaper = 480;
            int allStudent = oneClass + twoClass + threeClass;
            int sheetPaperForOneStudent = allSheetPaper / allStudent;
            System.out.println("На каждого ученика расчитано " + sheetPaperForOneStudent + " листов бумаги.");
        }
        {
            System.out.println("ЗАДАЧА 4");
            int productivityIn2Minutes = 16;
            int productivityTime = 2;
            int initalSpeed = productivityIn2Minutes / productivityTime;
            int time = 20;
            int productivityIn20Minutes = initalSpeed * time;
            System.out.println("За " + " 20 минут " + " машина произвела " + productivityIn20Minutes + " штук бутылок");


            int minutesInOneHour = 60;
            int hourInOneDay = 24;
            int timeInOneDay = minutesInOneHour * hourInOneDay;
            int productivityInOneDay = initalSpeed * timeInOneDay;
            System.out.println("За " + " 1 день " + " машина произвела " + productivityInOneDay + " штук бутылок");

            int timeInThreeDays = timeInOneDay * 3;
            int productivityInThreeDays = initalSpeed * timeInThreeDays;
            System.out.println("За " + " 3 дня " + " машина произвела " + productivityInThreeDays + " штук бутылок");

            int daysInOneMonth = 30;
            int timeInOneMonth = daysInOneMonth * timeInOneDay;
            int productivityInOneMonth = initalSpeed * timeInOneMonth;
            System.out.println("За " + " 1 месяц " + " машина произвела " + productivityInOneMonth + " штук бутылок");
        }
        {
            System.out.println("ЗАДАЧА 5");
            byte allPaintCans = 120;
            byte whitePaintCansForOneClass = 2;
            byte brownPaintCansForOneClass = 4;
            int allPaintCansForOneClass = whitePaintCansForOneClass + brownPaintCansForOneClass;
            int allClassRoom = allPaintCans / allPaintCansForOneClass;
            int allWhitePaintCans = allClassRoom * whitePaintCansForOneClass;
            int allBrownPaintCans = allClassRoom * brownPaintCansForOneClass;
            System.out.println("В школе, где " + allClassRoom + " классов, нужно " + allWhitePaintCans + " банок белой краски и " + allBrownPaintCans + " банок коричневой краски.");
        }
        {
            System.out.println("ЗАДАЧА 6");
            byte banana = 5;
            byte weightOneBanana = 80;

            byte milk = 2;
            byte weightOneMilk = 105;

            byte iceCream = 2;
            byte weightOneIceCream = 100;

            byte eggs = 4;
            byte weightOneEgg = 70;

            int allWeight = (banana * weightOneBanana) + (milk * weightOneMilk) + (iceCream * weightOneIceCream) + (eggs * weightOneEgg);
            System.out.println("Общий вес продуктов составлет " + allWeight + " грамм.");

            float grammInOneKilo = 1000f;
            float allWeightInKilo = allWeight / grammInOneKilo;
            System.out.println("Общий вес продуктов составлет " + allWeightInKilo + " килограмм.");
        }
        {
            System.out.println("ЗАДАЧА 7");
            byte excessWeight = 7;
            short weightLossOne = 250;
            short weightLossTwo = 500;
            short grammInOneKilo = 1000;
            int excessWeightInGramm = excessWeight * grammInOneKilo;
            int daysWeightLossOne = excessWeightInGramm / weightLossOne;
            int daysWeightLossTwo = excessWeightInGramm / weightLossTwo;
            int averageDaysWeightLoss = (daysWeightLossOne + daysWeightLossTwo) / 2;
            System.out.println("Спортсмену потребуется " + daysWeightLossOne + " дней, если будет худеть по 250 грамм.");
            System.out.println("Спортсмену потребуется " + daysWeightLossTwo + " дней, если будет худеть по 500 грамм.");
            System.out.println("Спортсмену потребуется в среднем " + averageDaysWeightLoss + " день для похудения.");
        }
        {
            System.out.println("ЗАДАЧА 8");
            int masha = 67760;
            int denis = 83690;
            int kristina = 76230;

            double mashaNew = masha * 0.1 + masha;
            double denisNew = denis * 0.1 + denis;
            double kristinaNew = kristina * 0.1 + kristina;

            byte monthInYear = 12;

            int allMasha = masha * monthInYear;
            int allDenis = denis * monthInYear;
            int allKristina = kristina * monthInYear;

            double allMashaNew = mashaNew * monthInYear;
            double allDenisNew = denisNew * monthInYear;
            double allKristinaNew = kristinaNew * monthInYear;

            double differenceMasha = allMashaNew - allMasha;
            double differenceDenis = allDenisNew - allDenis;
            double differenceKristina = allKristinaNew - allKristina;

            System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
            System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
            System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
        }
        }


    }