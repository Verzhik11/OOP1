public class Main {
    public static void main(String[] args) {
        Griffindor [] griffindors = {
                new Griffindor("Гарри Поттер", 85, 50, 90, 90, 90),
                new Griffindor("Гермиона Грейнджер", 60, 50, 80, 70, 80),
                new Griffindor("Рон Уизли", 40, 50, 80, 80, 50)
        };
        Puffendui[] puffenduis = {
                new Puffendui("Захария Смит", 60, 60, 65, 70, 55),
                new Puffendui("Седрик Диггори", 78, 70, 85, 80, 80),
                new Puffendui("Джастин Финч-Флетчли", 50, 40, 75, 73, 70),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 65, 60, 45, 40, 30, 56),
                new Kogtevran("Падма Патил", 58, 34, 26, 25, 56, 70),
                new Kogtevran("Маркус Белби", 40, 35, 55, 46, 60, 44),
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 85, 65, 75, 80, 90, 50, 60),
                new Slizerin("Грэхэм Монтегю", 75, 60, 60, 70, 50, 40, 65),
                new Slizerin("Грегори Гойл", 65, 70, 55, 80, 45, 60, 50),
        };
        PrintStudent printStudent = new PrintStudent();
        printStudent.print(griffindors);
        printStudent.print(puffenduis);
        printStudent.print(kogtevrans);
        printStudent.print(slizerins);
        System.out.println();

        griffindors[0].compareStudentHogwarts(slizerins[0]);
        griffindors[1].compareStudentGriffindors(griffindors[2]);
        slizerins[1].compareStudentSlizerin(slizerins[2]);
        kogtevrans[2].compareStudentKoogtevran(kogtevrans[0]);
        puffenduis[0].compareStudentPuffendui(puffenduis[1]);



    }
}