public class Puffendui extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int power, int transgressing, int industriousness, int loyalty, int honesty) {
        super(name, power, transgressing);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int qualities() {
        return industriousness + loyalty + honesty;
    }
    public void compareStudentPuffendui(Puffendui studentPuffendui) {
        int qualities1 = qualities();
        int qualities2 = studentPuffendui.qualities();
        if (qualities1>qualities2) {
            System.out.printf(
                    " Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    getName(),
                    studentPuffendui.getName(),
                    qualities1,
                    qualities2
            );
        } else if (qualities2>qualities1) {
            System.out.printf(
                    " Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    studentPuffendui.getName(),
                    getName(),
                    qualities2,
                    qualities1
            );
        } else {
            System.out.printf(
                    " Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n",
                    studentPuffendui.getName(),
                    getName(),
                    qualities1,
                    qualities2
            );
        }
    }

}
