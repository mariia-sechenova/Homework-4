public class Main {
    //task 1
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Task 1");
            System.out.println("Поздравляем, ты можешь покупать алкоголь!");
        }
        if (age < 18) {
            System.out.println("Сочувствую, нужно немного подожодать и ты сможешь покупать алкоголь :(");
        }


        //task 2
        System.out.println("Task 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task 3
        System.out.println("Task 3");
        int capacity = 102;
        int seats = 60;
        int soldTickets = 1;
        if (soldTickets >= capacity) {
            System.out.println("Вагон полностью забит");
        }
        if (soldTickets < capacity && soldTickets > seats) {
            System.out.println("Есть стоячее место в вагоне");
        }
        if (soldTickets < capacity && soldTickets <= seats) {
            System.out.println("Есть сидячее место в вагоне");
        }

        //task 4
        System.out.println("Task 4");
        if (age >= 18) {
            System.out.println("Поздравляем, ты можешь покупать алкоголь!");
        } else {
            System.out.println("Сочувствую, нужно немного подожодать и ты сможешь покупать алкоголь :(");
        }

        //task 5
        System.out.println("Task 5");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task 6
        System.out.println("Task 6");
        if (soldTickets >= capacity) {
            System.out.println("Вагон полностью забит");
        }
        if (soldTickets < capacity && soldTickets > seats) {
            System.out.println("Есть стоячее место в вагоне");
        } else {
            System.out.println("Есть сидячее место в вагоне");
        }

        //task 7
        System.out.println("Task 7");
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        //task 8
        System.out.println("Task 8");
        int ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Ты не можешь кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого");
        }
        else System.out.println("Ты можешь кататься без сопровождения взрослого");

    //task 9
     System.out.println("Task 9");
        int one = 46;
        int two = 13;
        int free = 0;
        if (one > two && one > free) {
            System.out.println("Число " + one + " наибольшее");
        }
        else if (two > one && two > free) {
            System.out.println("Число " + two + " наибольшее");
        }
        else System.out.println("Число " + free + " наибольшее");
    }
}
