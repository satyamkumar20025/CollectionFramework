package BankingApplication_Project;

public class ATMService {

    // Login using account and pin
    public boolean login(Account account, int pin) {
        if (account.getpin() == pin) {   // अभी getpin() हमेशा 0 देता है, इसे सुधारना होगा
            System.out.println("Login customer successful");
            return true;
        } else {
            System.out.println("Not login customer");
            return false;
        }
    }

    // Check balance of given account
    public void checkBalance(Account account) {
        System.out.println("Available balance: " + account.getBalance());
    }
}