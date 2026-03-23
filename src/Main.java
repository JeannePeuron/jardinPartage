//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main() {

    Plant tulip = new Plant("Tulipe");
    Plant rose = new Plant("Rose");
    Plant daisy = new Plant("Pâquerette");
    Plant lavender = new Plant("Lavande");

    tulip.addWater(4);
    rose.addWater(6);
    daisy.addWater(2);
    lavender.addWater(8);

    tulip.passDay();
    rose.passDay();
    daisy.passDay();
    lavender.passDay();

    tulip.passDay();
    rose.passDay();
    daisy.passDay();
    lavender.passDay();

    tulip.addWater(2);
    rose.passDay();
    daisy.passDay();
    lavender.passDay();

    System.out.println(tulip.getSummary());
    System.out.println(rose.getSummary());
    System.out.println(daisy.getSummary());
    System.out.println(lavender.getSummary());

    GreenHouse greenHouse = new GreenHouse();

    greenHouse.addPlant(tulip);
    greenHouse.addPlant(daisy);
    greenHouse.addPlant(rose);

    greenHouse.waterAll(4);
    greenHouse.passDayForAll();
    greenHouse.passDayForAll();

    greenHouse.getPlantsInDifficulty();
    greenHouse.countByStatus();


}
