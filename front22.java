public String front22(String str) {
    int take = 2;
    if (take > str.length()) {
        take = str.length();
    }

    String front = str.substring(0, take);
    return front + str + front;
}

/* In the front22 method, my goal is to take the first two characters of the input string
str and add them to both the front and back of the string. If the string has fewer than two characters, I use the whole string.
I set the number of characters to take as 2 (take = 2) if the length of str is less than 2, I adjust take to be the length of str
I extract the first take characters of the string using str.substring(0, take) and store this in the variable front.
Finally, I return the new string formed by concatenating front, the original string str, and front again. */