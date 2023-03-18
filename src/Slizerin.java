public class Slizerin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int power, int transgressing, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, power, transgressing);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public int qualities() {
        return cunning + resourcefulness + determination + ambition + lustForPower;
    }
    public void compareStudentSlizerin(Slizerin studentSlizerin) {
        int qualities1 = qualities();
        int qualities2 = studentSlizerin.qualities();
        if (qualities1>qualities2) {
            System.out.printf(
                    " Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n",
                    getName(),
                    studentSlizerin.getName(),
                    qualities1,
                    qualities2
            );
        } else if (qualities2>qualities1) {
            System.out.printf(
                    " Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n",
                    studentSlizerin.getName(),
                    getName(),
                    qualities2,
                    qualities1
            );
        } else {
            System.out.printf(
                    " Слизеренец %s такой же, как слизеренец %s: %d VS %d%n",
                    studentSlizerin.getName(),
                    getName(),
                    qualities1,
                    qualities2
            );
        }
    }
}
