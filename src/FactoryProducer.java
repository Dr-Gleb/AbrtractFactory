public class FactoryProducer {
    final static String BANKNAME="Bank";
    final static String ACCOUNT="Account";
    public static AbstractFactory getFactory(String factory){
        if(BANKNAME.equals(factory)){
            return new BankFactory();
        }
        else return null;
    }
}
