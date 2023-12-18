package HW1;
public class PieceWorker extends Employee{
    private double wage;
    private double prieces;

    public PieceWorker(String firstName,String lastName,String socialSecurityNumber,double wage,double prieces)
    {
        super(firstName,lastName,socialSecurityNumber);
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        this.wage=wage;
        if(prieces < 0.0)
            throw new IllegalArgumentException("Prieces must be >= 0.0");
        this.prieces=prieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        this.wage = wage;
    }

    public double getPrieces() {
        return prieces;
    }

    public void setPrieces(double prieces) {
        if(prieces < 0.0)
            throw new IllegalArgumentException("Prieces must be >= 0.0");
        this.prieces = prieces;
    }
    
    @Override
    public double earnings() {
        return getPrieces() * getWage();
    }
    

    @Override
    public String toString() {
        
        return String.format("Piece worker: %s%n%s: $%,.2f; %s %,.2f",
                super.toString(),"wage",getWage(),"pieces produced",getPrieces());
        
    }
}
