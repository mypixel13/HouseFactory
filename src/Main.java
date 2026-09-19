public class Main {

    public static void main(String[] args) {

        HouseCreator smallCreator = new SmallHouseCreator();
        House smallHouse = smallCreator.createHouse();
        smallHouse.build();

        HouseCreator luxuryCreator = new LuxuryHouseCreator();
        House luxuryHouse = luxuryCreator.createHouse();
        luxuryHouse.build();
    }
}