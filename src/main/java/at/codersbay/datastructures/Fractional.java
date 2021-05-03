package at.codersbay.datastructures;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    private Integer numerator;
    private Integer denominator;


    public Fractional(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (numerator == null || denominator == null) {
            throw new IllegalArgumentException();
        }
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }
    }

    public Integer getNumerator() {
        // TODO implement to fix tests in FractionalTest1
        return numerator;
    }

    public Integer getDenominator() {
        // TODO implement to fix tests in FractionalTest1
        return denominator;
    }

    public Float asFloat() {
        // TODO implement to fix tests in FractionalTest2

        return Float.valueOf(numerator) / Float.valueOf(denominator);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO implement to fix tests in FractionalTest3

        Float res = this.asFloat();
        Fractional object = (Fractional) obj;
        if (res.equals(object.asFloat())){
            return true;
        } else {
            return false;
        }
    }

    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4

        other = new Fractional(numerator * other.numerator,denominator * other.denominator);
        return other;
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4

    return new Fractional(numerator * other, denominator);
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5
        return new Fractional(other.denominator * numerator, other.numerator * denominator);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5
        return new Fractional(numerator, other * denominator);
    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6

        return new Fractional(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6

        if (other.equals(0)) {
            return new Fractional(numerator, denominator);
        }
        other = numerator * denominator;
        return new Fractional(numerator + other, denominator);
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator);
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7

        if (other.equals(0)) {
            return new Fractional(numerator, denominator);
        }

        other = numerator * denominator;
        return new Fractional(numerator - other, denominator);
    }
}