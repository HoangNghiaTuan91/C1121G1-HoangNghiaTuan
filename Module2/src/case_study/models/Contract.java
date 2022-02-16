package case_study.models;

public class Contract {
    private String idContract;
    private String idBooking;
    private double amountOfDeposit;
    private double totalPay;
    private String idCustomer;

    public Contract(String idContract, String idBooking, double amountOfDeposit, double totalPay, String idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.amountOfDeposit = amountOfDeposit;
        this.totalPay = totalPay;
        this.idCustomer = idCustomer;
    }

    public Contract() {
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getAmountOfDeposit() {
        return amountOfDeposit;
    }

    public void setAmountOfDeposit(double amountOfDeposit) {
        this.amountOfDeposit = amountOfDeposit;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", amountOfDeposit=" + amountOfDeposit +
                ", totalPay=" + totalPay +
                ", idCustomer=" + idCustomer +
                '}';
    }

    public String getContractString() {
        return getIdContract() + "," + getIdBooking() + "," + getAmountOfDeposit() + "," + getTotalPay() + "," + getIdCustomer();
    }
}

