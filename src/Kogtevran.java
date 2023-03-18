public class Kogtevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, int power, int transgressing, int mind, int wisdom, int wit, int creation) {
        super(name, power, transgressing);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    public int qualities() {
        return mind + wisdom + wit + creation;
    }
    public void compareStudentKoogtevran(Kogtevran studentKogtevran) {
        int qualities1 = qualities();
        int qualities2 = studentKogtevran.qualities();
        if (qualities1>qualities2) {
            System.out.printf(
                    " Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",
                    getName(),
                    studentKogtevran.getName(),
                    qualities1,
                    qualities2
            );
        } else if (qualities2>qualities1) {
            System.out.printf(
                    " Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",
                    studentKogtevran.getName(),
                    getName(),
                    qualities2,
                    qualities1
            );
        } else {
            System.out.printf(
                    " Когтевранец %s такой же, как когтевранец %s: %d VS %d%n",
                    studentKogtevran.getName(),
                    getName(),
                    qualities1,
                    qualities2
            );
        }
    }
}
