package DZ;

public class Bus  extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public static void Busses (String[] args) {

    Bus gaz = new Bus("Газ", "Сибирь", 2017, "Россиия", "коричневый", 150);
    Bus mercedes = new Bus("Mercedes", "Viano", 2012, "Германия", "черный", 195);
    Bus volkswagen = new Bus("Volkswagen", "Transporter", 2019, "Германия", "красный", 182);
        System.out.println(gaz);
        System.out.println(mercedes);
        System.out.println(volkswagen);
}
}
