import java.util.Objects;

public class Transaction
{
    private String sourceName;
    private String destinationName;
    private Long transactionSum;

    public Transaction(String sourceName, String destinationName, Long transactionSum)
    {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.transactionSum = transactionSum;
    }

    public String getSourceName()
    {
        return sourceName;
    }

    public void setSourceName(String sourceName)
    {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName)
    {
        this.destinationName = destinationName;
    }

    public Long getTransactionSum() {
        return transactionSum;
    }

    public void setTransactionSum(Long transactionSum)
    {
        this.transactionSum = transactionSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;

        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null)
        {
            return true;
        }if ( destinationName != null ? !destinationName.equals(that.destinationName) : that.destinationName != null)
        {
            return false;
        }
        return transactionSum != null ? transactionSum.equals(that.transactionSum) : that.transactionSum == null;


    }

    @Override
    public int hashCode() {
        int result = sourceName != null ? sourceName.hashCode() : 0;
        result = 31 * result + (destinationName != null ? destinationName.hashCode() : 0);
        result = 31 * result + (transactionSum != null ? transactionSum.hashCode() : 0);
        return result;
    }
}