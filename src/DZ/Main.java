package DZ;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car ("Lada", "Granta", 2015, "Россия", "желтого", 1.7, "AT", "Седан", "х350рк178", 5, true, true, true, 170);
        Car audi = new Car ("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0, "AT", "Седан", "ч382зз178", 5, true, false, true, 250);
        Car bmw = new Car ("BMW", "Z8", 2021, "Германии", "черный", 3.0,"AT", "Седан", "x232зз178", 4, false, false, true, 250);
        Car kia = new Car ("Kia", "Sportage", 2018, "Южной Корее", "красный", 2.4,"МT", "Универсал", "х843нк178", 5, true, true, true, 180);
        Car hyundai = new Car ("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6,"МT", "хетчбэк", "в857пк178", 5, true, false, true, 170);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}