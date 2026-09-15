interface Chargeable {
    void chargeFee();
}

class Consultant implements Chargeable {

    public void chargeFee() {
        System.out.println("Consultant charges a consultation fee.");
    }

    public static void main(String[] args) {
        Consultant c = new Consultant();
        c.chargeFee();
    }
}