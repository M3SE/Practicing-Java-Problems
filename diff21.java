public int diff21(int n) {
    if (n <= 21) {
        return 21 - n;
    } else {
        return (n - 21) * 2;
    }
}

/* The method takes an integer parameter n and if n is less than or equal to 21, it returns the difference 21 - n.
Then if n is greater than 21, it returns double the difference (n - 21) * 2. */