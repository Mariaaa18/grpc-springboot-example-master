package via.sdj3.grpcspringbootx.model;

public class Animal {
    private Date date;
    private double weight;
    private int registrationNumber;
    private String origin;

    private int  prod_ref;

    public Animal(Date date, double weight, int registrationNumber, String origin,int prod_ref) {
        this.date = date;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.origin = origin;
        this.prod_ref=prod_ref;
    }

    public Date getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRegistrationNumber(int registrationNumber) {

        this.registrationNumber = registrationNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getProd_ref() {
        return prod_ref;
    }

    public void setProd_ref(int prod_ref) {
        this.prod_ref = prod_ref;
    }
}
