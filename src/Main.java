import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        /*

            Blockchain - chain of Blocks
            Block - Hash of previous block + Transactions chained together.

         */

        Transaction initialTransaction = new Transaction("Smith", "Joe", 100L);
        Transaction secondTransaction = new Transaction("Tiphareth", "Malkuth", 1000L);
        Transaction thirdTransaction = new Transaction("Raphael", "Metatron", 1800L);
        Transaction fourthTransaction = new Transaction("Binah", "Kether", 7777L);

        System.out.println(initialTransaction.hashCode());
        System.out.println(secondTransaction.hashCode());
        System.out.println(thirdTransaction.hashCode());
        System.out.println(fourthTransaction.hashCode());

        Block initialBlock = new Block(0, Arrays.asList(initialTransaction, secondTransaction));
        System.out.println(initialBlock.hashCode());
        Block secondBlock = new Block(initialBlock.hashCode(), Arrays.asList(thirdTransaction));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(fourthTransaction));

        initialBlock.hashCode();
    }
}
