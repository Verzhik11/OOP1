public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int power, int transgressing, int nobility, int honor, int bravery) {
        super(name, power, transgressing);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int qualities() {
        return nobility + honor + bravery;
    }
    public void compareStudentGriffindors(Griffindor studentGriffindors) {
        int qualities1 = qualities();
        int qualities2 = studentGriffindors.qualities();
        if (qualities1>qualities2) {
            System.out.printf(
                    " Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    studentGriffindors.getName(),
                    getName(),
                    qualities1,
                    qualities2
            );
        } else if (qualities2>qualities1) {
            System.out.printf(
                    " Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    studentGriffindors.getName(),
                    getName(),
                    qualities2,
                    qualities1
            );
        } else {
            System.out.printf(
                    " Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    studentGriffindors.getName(),
                    getName(),
                    qualities1,
                    qualities2
            );
        }


    }


}
