public String backAround(String str) {
    String last = str.substring(str.length() - 1);
    return last + str + last;
}

/* In the backAround method, my goal is to take the last character of the input string str and add it to both the front and back of the string.
First, I extract the last character of the string using str.substring(str.length() - 1). This gives me the last character and stores it in the variable last.
Next, I create the new string by concatenating last, the original string str, and last again.
Finally, I return this new string.*/