interface Chargeable {
    void chargeFee();
}

class Consultant implements Chargeable {

    int hours;
    double feePerHour;

    Consultant(int hours, double feePerHour) {
        this.hours = hours;
        this.feePerHour = feePerHour;
    }

    public void chargeFee() {
        double totalFee = hours * feePerHour;

        System.out.println("Consultation Hours: " + hours);
        System.out.println("Fee Per Hour: ₹" + feePerHour);
        System.out.println("Total Consultation Fee: ₹" + totalFee);
    }

    public static void main(String[] args) {
        Consultant c = new Consultant(5, 1000);
        c.chargeFee();
    }
}