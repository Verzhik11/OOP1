public class PrintStudent {
    public void print(Griffindor[] griffindors) {
        for (Griffindor i : griffindors) {
            Griffindor griffindor = i;
            System.out.println(
                    "Имя: " + griffindor.getName() + " |" +
                            " Сила: " + griffindor.getPower() + " |" +
                            " Трансгрессия: " + griffindor.getTransgressing() + " |" +
                            " Благородность: " + griffindor.getNobility() + " |" +
                            " Честь: " + griffindor.getHonor() + " |" +
                            " Храборость: " + griffindor.getBravery()
            );
        }
        System.out.println();
    }

    public void print(Puffendui[] puffenduis) {
        for (Puffendui i : puffenduis) {
            Puffendui puffendui = i;
            System.out.println(
                    "Имя: " + puffendui.getName() + " |" +
                            " Сила: " + puffendui.getPower() + " |" +
                            " Трудолюбие: " + puffendui.getIndustriousness() + " |" +
                            " Верность: " + puffendui.getLoyalty() + " |" +
                            " Честность: " + puffendui.getHonesty()
            );

        }
        System.out.println();
    }

    public void print(Kogtevran[] kogtevrans) {
        for (Kogtevran i : kogtevrans) {
            Kogtevran kogtevran = i;
            System.out.println(
                    "Имя: " + kogtevran.getName() + " |" +
                            " Сила: " + kogtevran.getPower() + " |" +
                            " Ум: " + kogtevran.getMind() + " |" +
                            " Мудрость: " + kogtevran.getWisdom() + " |" +
                            " Остроумность: " + kogtevran.getWit() + " |" +
                            " Творчество: " + kogtevran.getWit()
            );

        }
        System.out.println();
    }

    public void print(Slizerin[] slizerins) {
        for (Slizerin i : slizerins) {
            Slizerin slizerin = i;
            System.out.println(
                    "Имя: " + slizerin.getName() + " |" +
                            " Сила: " + slizerin.getPower() + " |" +
                            " Хитрость: " + slizerin.getCunning() + " |" +
                            " Решительность: " + slizerin.getDetermination() + " |" +
                            " Амбициозность: " + slizerin.getAmbition() + " |" +
                            " Находчивость: " + slizerin.getResourcefulness() + " |" +
                            " Жажда власти: " + slizerin.getLustForPower()
            );

        }
    }

}
