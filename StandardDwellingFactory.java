public class StandardDwellingFactory implements DwellingFactory {

    @Override
    public House createHouse() {
        return new SmallHouse();
    }

    @Override
    public Garage createGarage() {
        return new ClassicGarage();
    }
}
