public class Main {
    public static void main(String[] args) {

        AbstractFactory bankFactory = FactoryProducer.getFactory("Bank");
        Bank sberBank = bankFactory.getBank("PSBBank");
        sberBank.bankName();

    }
}