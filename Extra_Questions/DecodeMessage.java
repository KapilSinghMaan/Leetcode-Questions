// Alice and Bob need to send secret messages to each other and are discussing ways to encode their messages:

// ALICE :  "Let's just use a very simple code: We'll assign 'A' the codeword 1, 'B' will be 2, and so on down to 'Z' beig assigned 26."

// BOB : "That's a stupid code, Alice. Suppose I send you the word 'BEAN' encoded as 25114. You could decode that in many different ways!"

// ALICE : "Sure you could, but what words would you get? Other than 'BEAN' you'd get 'BEAAD', 'YAAD', 'YAN', 'YKD' and 'BEKD'. I think you would be able to figure out the correct decoding. And why would you send me the word 'BEAN' anyway?"

// BOB : "OK, maybe that's a bad example, but I bet you that if you got a string of length 5000 there would be tons of different decodings and with that many you would find at least two different ones that would make sense."

// ALICE : "How many different decodings?"

// BOB : "Jillions!"

// For some reason, Alice is still unconvinced by Bob's argument, so she requires a program that will determine how many decodings there can be for a given string using her code.

// For each input set, print all possible decodings for the input string.

public class DecodeMessage {
    public static void fn(String str, int idx, String Output) {
        if (idx >= str.length()) {
            System.out.println(Output);
            return;
        }
        int singleDigit = str.charAt(idx) - '0';
        if (singleDigit >= 1 && singleDigit <= 9) {
            fn(str, idx + 1, Output + (char) ('A' + singleDigit - 1));
        }
        if (idx + 1 < str.length()) {
            int doubleDigit = Integer.parseInt(str.substring(idx, idx + 2));
            if (doubleDigit >= 10 && doubleDigit <= 26) {
                fn(str, idx + 2, Output + (char) ('A' + doubleDigit - 1));
            }
        }
    }

    public static void main(String[] args) {
        fn("25114", 0, "");
    }
}
