
import java.util.List;
import java.util.Objects;

public class Block
{
    private int previousHash;
    private List<Transaction> transactionsList;

    public Block(int previousHash, List<Transaction> transactionsList)
    {
        this.previousHash = previousHash;
        this.transactionsList = transactionsList;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List <Transaction> transactionsList) {
        this.transactionsList = transactionsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return previousHash == block.previousHash &&
                Objects.equals(transactionsList, block.transactionsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousHash, transactionsList);
    }
}