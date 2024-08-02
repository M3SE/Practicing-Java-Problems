public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile && bSmile) {
        return true;
    }
    if (!aSmile && !bSmile) {
        return true;
    }
    return false;
}

/* (aSmile && bSmile) checks if both monkeys are smiling.
   (!aSmile && !bSmile) checks if neither monkey is smiling.
   Using the logical OR operator (||), the method returns true if either both monkeys are smiling or neither is smiling. */