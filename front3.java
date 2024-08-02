public String front3(String str) {
    String front;

    if (str.length() >= 3) {
        front = str.substring(0, 3);
    }
    else {
        front = str;
    }

    return front + front + front;
}

/*In the front3 method, I want to create a new string by repeating the first three characters of the input string three times.
If the input string has fewer than three characters, I repeat the entire string three times instead.
I check if the length of the string is at least 3. If it is, I take the first three characters and store them in the variable front.
If the string is shorter than 3 characters, I just use the whole string as front.
Finally, I return the result of concatenating front three times. */