public class SmallHouseCreator extends HouseCreator {

    @Override
    public House createHouse() {
        return new SmallHouse();
    }
}