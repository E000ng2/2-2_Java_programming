package lab.p1;

public class p1_1 {
    public static void main(String[] args) {
        String[] names = {"Sonata", "Avante","모름"};
        int[] years = {2021,2023,-1};

        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++)
        {
            cars[i] = new Car(names[i], years[i]);
            System.out.printf("이름 : %s, 년도 : %d, 가격 : %d\n", cars[i].name, cars[i].year, cars[i].price);
        }
        
    }   
}

class Car {
    String name;
    int year;
    int price;

    Car(String name, int year)
    {
        if (year <= 0)
        {
            year = 0;
        }
        this.name = name;
        this.year = year;

    }

    Car(String name)
    {
        this(name, 0);
    }

    Car()
    {
        this("모름", 0);
    }

    int Carprice(int year)
    {
        this.price = 0;
        if (year != 0)
        {
            this.price = 1000-(2024-year)*100;
        }
        return this.price;
    }



}