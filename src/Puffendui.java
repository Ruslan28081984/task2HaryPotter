public class Puffendui extends Hogwarts {

    int industriousness;
    int loyalty;
    int honesty;

    public Puffendui(int industriousness, int loyalty, int honesty) {
        if (industriousness < 0 || industriousness > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (loyalty < 0 || loyalty > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (honesty < 0 || honesty > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Puffendui studentSecond) { // почему здесь тогда не вписали первого студента?
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " сильный, как и  " + studentSecond.fullName);
        }

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
}
