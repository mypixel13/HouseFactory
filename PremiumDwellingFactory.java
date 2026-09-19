public class PremiumDwellingFactory implements DwellingFactory {

    @Override
    public House createHouse() {
        return new LuxuryHouse();
    }

    @Override
    public Garage createGarage() {
        return new ModernGarage();
    }
}
