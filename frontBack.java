public String frontBack(String str) {
    if (str.length() <= 1) return str;

    String mid = str.substring(1, str.length()-1);


    return str.charAt(str.length()-1) + mid + str.charAt(0);
}

/* If the string length is 1 or less, return the string as it is.
I got the middle part of the string (excluding the first and last characters) using substring(1, str.length() - 1).
Concatenate the last character, the middle part, and the first character to form the new string and return the new string. */