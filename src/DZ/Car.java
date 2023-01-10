package DZ;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsAmount;
    private boolean typeTires;
    private Key key;
    private Transport setCar;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private static final int DEFAULT_SEATS = 5;


    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume, String transmission, String bodyType, String registrationNumber,
               int seatsAmount, boolean typeTires, boolean remoteStart, boolean keyless, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }
        setRegistrationNumber(registrationNumber);
        if (seatsAmount <= 0) {
            this.seatsAmount = DEFAULT_SEATS;
        } else {
            this.seatsAmount = seatsAmount;
        }
        this.typeTires = typeTires;
        setKey(remoteStart, keyless);
        setCar(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    class Key {
        private final boolean remoteStart;
        private final boolean keyless;

        public Key(boolean remoteStart, boolean keyless) {
            this.remoteStart = remoteStart;
            this.keyless = keyless;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeyless() {
            return keyless;
        }

        @Override
        public String toString() {
            return ", удаленный запуск = " + remoteStart +
                    ", бесключевой доступ = " + keyless;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public boolean isTypeTires() {
        return typeTires;
    }

    public void setTypeTires(boolean typeTires) {
        this.typeTires = typeTires;
    }

    public void setKey(Boolean keyless, Boolean remoteStart) {
        this.key = new Key(keyless, remoteStart);
    }

    public void setCar(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.setCar = new Transport(brand, model, productionYear, productionCountry, color, maxSpeed) {
        };
    }

    @Override
    public String toString() {
        return "Машина: " + setCar +
                ", мощность двигателя = " + engineVolume +
                ", трансмиссия = " + transmission + '\'' +
                ", тип кузова = " + bodyType + '\'' +
                ", регистрационный номер = " + registrationNumber + '\'' +
                ", количество мест = " + seatsAmount +
                ", летние шины = " + typeTires +
                ", key=" + key;
    }
}
