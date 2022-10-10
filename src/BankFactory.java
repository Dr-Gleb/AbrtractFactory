public class BankFactory extends AbstractFactory{
    final String PSB = "PSBBank";
    final String SBERBANK = "SberBank";
    @Override
    Bank getBank(String bankName) {
        if(PSB.equals(bankName)){
            return new PSBBank();
        }
        else if(SBERBANK.equals(bankName)){
            return new SberBank();
        }
        else return null;
    }

    @Override
    Account getAccont(String accountName) {
        return null;
    }
}
