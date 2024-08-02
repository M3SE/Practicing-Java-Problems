public boolean parrotTrouble(boolean talking, int hour) {
    return (talking && (hour < 7 || hour > 20));
}

/* The method takes two parameters: talking (a boolean) indicating if the parrot is talking, and hour (an integer)
representing the current hour in 24-hour format returns true if talking is true and the hour is less than 7 or greater than 20.
If the parrot is not talking or the hour is between 7 and 20 (inclusive), the method returns false. */
