public boolean or35(int n) {
    return (n % 3 == 0) || (n % 5 == 0);
}

/* In the or35 method, my goal is to check if the number n is a multiple of 3 or 5.
I use the modulus operator % to check if n is divisible by 3 (n % 3 == 0) I also check if n is divisible by 5 (n % 5 == 0).
If either condition is true (using the logical OR operator ||), the method returns true otherwise, it returns false.
So, this method returns true if the number n is a multiple of either 3 or 5. */