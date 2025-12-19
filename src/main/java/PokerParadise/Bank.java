package PokerParadise;

public class Bank {
    private static int wallet = 100;
    private static int wager = 0;

    public static void ponyUp(int cash){
        System.out.println("You have " + getBalance());

        if (wallet - cash >= 0 && cash >= 0) {
            wager = cash;
            wallet -= wager;

            System.out.println("You just wagered: " + cash);
            System.out.println("You have " + wallet);
        }
    }
    public static void doubleUp(){
        wallet -= wager;
        wager *= 2;
    }

    public static void win(){
        wallet += wager * 2;
        wager = 0;
    }
    public static void tie(){
        wallet += wager;
        wager = 0;
    }
    public static void lose(){
        wager = 0;
    }

    public static int getBalance(){
        return wallet;
    }
}
