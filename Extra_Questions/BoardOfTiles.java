// Consider a board of size "2 * N" and tiles of size "2 * 1". You have to count the number of ways in which tiling of this board is possible. You may place the tiles vertically or horizontally, as per your choice.

// Example: input: 3 output: 3 , input: 4 output: 5 , input: 5 output: 8

public class BoardOfTiles {
    public static int fn(int n)
    {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return fn(n-1)+fn(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fn(5));
    }
}
