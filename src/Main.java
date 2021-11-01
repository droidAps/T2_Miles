public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_000;                        // стоимость билета
        int amountPerMile = 20;                          // сумма, соответствующая 1-ой бонусной миле
        int bonusMiles = ticketPrice / amountPerMile;    // количество бонусных миль, исходя из стоимости билета
        System.out.println(bonusMiles);
    }
}
