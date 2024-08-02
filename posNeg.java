public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
        return (a < 0 && b < 0);
    }
    else {
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
}

/* The method takes three parameters: two integers a and b, and a boolean negative.
If negative is true, it checks if both a and b are negative.
If negative is false, it checks if one of a or b is positive and the other is negative.
It returns true if the respective condition is met, otherwise, it returns false. */