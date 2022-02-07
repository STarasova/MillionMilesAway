public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int oneBonusMilePrice = 20;
        int bonusMiles = ticketPrice / oneBonusMilePrice;
        return bonusMiles;
    }

}
