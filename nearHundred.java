public boolean nearHundred(int n) {
    return ((Math.abs(100 - n) <= 10) ||
            (Math.abs(200 - n) <= 10));
}

/* The method takes an integer parameter n it returns true if the absolute difference between n and 100 is less than or equal to 10.
It'll also return true if the absolute difference between n and 200 is less than or equal to 10
if neither of these conditions is met, it returns false. */