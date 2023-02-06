public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
    // 1
        var dog = 8.0;
        var cat = 3.6; //3,6 кота? Живодерство...
        var paper = 763789;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

    //2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

    //3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);
        System.out.println(" ");

    }

    public static void task2() {
    //4
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

    //5
        var frog = 3.5;
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);
        System.out.println(" ");


    }

    public static void task3() {
    //6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sumWeight = boxer1 + boxer2;
        System.out.println(sumWeight);
        var deltaWeight = boxer1 - boxer2;
        System.out.println(deltaWeight);

    //7
        deltaWeight = boxer2 - boxer1;
        System.out.println(deltaWeight);
        deltaWeight = boxer2 % boxer1;
        System.out.println(deltaWeight);
        System.out.println(" ");

    //8.1
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var  employees = totalHours/hoursPerEmployee;
        System.out.println("Всего работников в компании — " + employees + " человек.");
        employees = employees + 94;
        totalHours = employees * hoursPerEmployee;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");

    }
}