public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract  Account getAccont(String accountName);
}
