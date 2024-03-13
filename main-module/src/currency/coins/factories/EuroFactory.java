package currency.coins.factories;

import currency.coins.EuroCoin;

public class EuroFactory
{
    // --- CONSTANTS

    public static final double ONECENT_VALUE = 0.01;
    public static final double ONECENT_DIAMETER = 16.25;

    public static final double TWOCENT_VALUE = 0.02;
    public static final double TWOCENT_DIAMETER = 18.75;

    /* TODO:
     * Define all remaining values and diameters constants.
     * Check: https://www.bcl.lu/en/Banknotes-and-Coins/billets_pieces/car_pieces/car_tec/index.html
     */

    // --- GENERATION METHODS

    public static EuroCoin getOneCentCoin()
    {
        return new EuroCoin(
                ONECENT_VALUE, ONECENT_DIAMETER
        );
    }

    public static EuroCoin getTwoCentCoin()
    {
        return new EuroCoin(
                TWOCENT_VALUE, TWOCENT_DIAMETER
        );
    }

    /* TODO:
     * Implement all remaining coin generation values.
     */
}
