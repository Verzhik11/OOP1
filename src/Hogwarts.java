public abstract class Hogwarts {
    private String name;
    private int power;
    private int transgressing;

    public Hogwarts(String name, int power, int transgressing) {
        this.name = name;
        this.power = power;
        this.transgressing = transgressing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgressing() {
        return transgressing;
    }

    public void setTransgressing(int transgressing) {
        this.transgressing = transgressing;
    }
    private int magic() {
        return power + transgressing;
    }

    public void compareStudentHogwarts(Hogwarts studentHogwarts) {
        int magic1 = magic();
        int magic2 = studentHogwarts.magic();
        if (magic1>magic2) {
            System.out.printf(
                    " Студент %s лучше, чем студент %s: %d VS %d%n",
                    getName(),
                    studentHogwarts.getName(),
                    magic1,
                    magic2
            );
        } else if (magic2>magic1) {
            System.out.printf(
                    " Студент %s лучше, чем студент %s: %d VS %d%n",
                    studentHogwarts.getName(),
                    getName(),
                    magic2,
                    magic1
            );
        } else {
            System.out.printf(
                    " Студент %s такой же, как студент %s: %d VS %d%n",
                    studentHogwarts.getName(),
                    getName(),
                    magic1,
                    magic2
            );
        }


    }

}
