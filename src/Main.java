public class Main {
    public static void main(String[] args) {

         // Объявляем переменные для входных данных и параметров программы
        int ticketCost = 13676; // Стоимость билета
        int milesPer20 = 1; // Количество миль за каждые 20 рублей

        // Рассчитываем количество бонусных миль
        int totalMiles = ticketCost / 20 * milesPer20;


        // Выводим результат на экран
        System.out.println("При стоимости билета в " + ticketCost + " рублей должно начислиться " + totalMiles + " миль.");


    }
}
