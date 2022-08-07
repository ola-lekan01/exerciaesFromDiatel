package Chapter10.Employee;

import Chapter8.Date.Date;

public class PieceWorker extends Employee{
    private final double wagesPerPiece;
    private final double wagesProduced;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wagesPerPiece, double wagesProduced) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wagesPerPiece <= 0.0)
            throw new IllegalArgumentException("Wages Per Piece Must be greater than 0.0");

        if (wagesProduced <= 0)
            throw new IllegalArgumentException("Wages produced must be greater than 0.0");

        this.wagesProduced = wagesProduced;
        this.wagesPerPiece = wagesPerPiece;
    }

    public double getWagesPerPiece() {
        return wagesPerPiece;
    }

    public double getWagesProduced() {
        return wagesProduced;
    }

    @Override
    public double getPaymentAmount(){
        return wagesPerPiece * wagesProduced;
    }

    public String toString(){
        return String.format("%sWages Per Piece: %.2f%nWages Produced: %.2f%nEarnings: %.2f%n", super.toString(), wagesPerPiece , wagesProduced, getPaymentAmount());
    }
}
