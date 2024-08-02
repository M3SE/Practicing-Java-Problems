public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
        return true;
    }

    return false;
}

/* With this it was pretty simple for me "!weekday" checks if it is not a weekday it will be true. Vacations checks if you are on vacations.
The "||" checks if either is a weekday or vaction is true the method will return true meaning you can sleep in.
 */
