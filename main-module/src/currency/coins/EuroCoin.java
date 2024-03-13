package currency.coins;

public class EuroCoin
{
    private final double value;      // Value (EUR)
    private final double diameter;   // Diameter in mm

    // --- CONSTRUCTOR

    public EuroCoin(double value, double diameter)
    {
        this.value = value;
        this.diameter = diameter;
    }

    // --- GETTERS

    public double getValue() { return value; }
    public double getDiameter() { return diameter; }
}
