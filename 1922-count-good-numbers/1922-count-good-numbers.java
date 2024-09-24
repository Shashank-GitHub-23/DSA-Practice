class Solution {
    private static final long MOD = 1000000007;  // Yeh large number ke saath kaam karte waqt overflow avoid karta hai

    // Recursive function jo (base^exp) % MOD calculate karta hai
    private long modPow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;  // Base case: kisi bhi number ka 0th power 1 hota hai
        }
        // Recursive call: half exponent calculate karte hain
        long half = modPow(base, exp / 2, mod);
        long halfSquared = (half * half) % mod;  // Squared result ko mod ke saath rakha
        if (exp % 2 == 0) {
            return halfSquared;  // Agar exponent even hai toh return (half^2)
        } else {
            return (halfSquared * base) % mod;  // Agar odd hai toh ek baar base multiply karenge aur mod lenge
        }
    }

    public int countGoodNumbers(long n) {
        long evenPlace = (n + 1) / 2;  // Even indices count: har alternate index (0, 2, 4,...)
        long oddPlace = n / 2;         // Odd indices count: har alternate index (1, 3, 5,...)

        // Recursive call: 5^evenPlace % MOD, kyunki even indices pe hum 5 digits rakh sakte hain (0, 2, 4, 6, 8)
        long n1 = modPow(5, evenPlace, MOD);
        // Recursive call: 4^oddPlace % MOD, kyunki odd indices pe hum 4 digits rakh sakte hain (2, 3, 5, 7)
        long n2 = modPow(4, oddPlace, MOD);

        // Final result n1 * n2 ke mod ke saath, kyunki dono number bohot bade ho sakte hain
        long ans = (n1 * n2) % MOD;

        return (int) ans;  // Result ko return karenge, but int form mein kyunki problem ne int result maanga hai
    }
}
