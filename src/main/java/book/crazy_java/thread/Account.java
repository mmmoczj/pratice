package book.crazy_java.thread;

public class Account {
    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.balance = balance;
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public void draw(double drawAmount) {
        if (balance >= drawAmount) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "取钱成功!吐出钞票:" + drawAmount);
            balance -= drawAmount;
            System.out.println("余额为:" + balance);
        } else {
            System.out.println("取钱失败,余额不足!");
        }
    }

    public int hashCode() {
        return this.accountNo.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.accountNo.equals(accountNo);
        }
        return false;
    }

    public static class DrawThread extends Thread {
        private Account account;
        private double drawAmount;

        public DrawThread(String name, Account account, double drawAmount) {
            super(name);
            this.account = account;
            this.drawAmount = drawAmount;
        }

        @Override
        public void run() {
            account.draw(this.drawAmount);
        }
    }

    public static void main(String[] args) {
        Account acct = new Account("123456", 1000);
        new DrawThread("甲", acct, 800).start();
        new DrawThread("乙", acct, 800).start();
    }
}
