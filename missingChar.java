public String missingChar(String str, int n) {
    String front = str.substring(0, n);

    String back = str.substring(n+1, str.length());

    return front + back;
}

/* To remove a character at index n from the string str, I split the string into two parts: before and after the character at n.
I then join these two parts together, skipping the character at n. */