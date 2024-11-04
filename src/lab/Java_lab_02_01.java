package lab;

class Car {
    String model;
    int year;

    //생성자 오버로딩
    Car(String model, int year) //모델명과 연식 둘다 받는 경우
    {
        this.model = model;
        this.year = year;
        System.out.println("안녕!1");
    }

    Car(String model) // 모델명만 받는 경우
    {
        this(model, 2023);
        // this.model = model;
        // this.year = 2023; // this 생략 가능
    }

    Car() // 아무것도 받지 않는 경우
    {
        this("미정", 2023);
        // this.model = "미정"; // this 생략 가능
        // this.year = 2023; // this 생략 가능
    }

    void displayInfo()
    {
        displayInfo(false); // displatInfo(boolean showPrice)함수 호출
    }

    void displayInfo(boolean showPrice)
    {   System.out.println("모델 명 : " + this.model);
        System.out.println("연식 : " + this.year);

        // showPrice(true) -> 가격 포함
        // showPrice(false) -> 가격 미포함

        if (showPrice)
        {
            System.out.println("가격 : " + this.calculatePrice());
        }
    }

    int calculatePrice()
    {
        int price = 1000;
        price = 1000 - (2024 - this.year)*100;

        if (price < 0) // price가 음수가 될 경우
        {
            price = 0;
        }

        return price;
    }
}

public class Java_lab_02_01 {
    public static void main(String[] args) {

        //1

        // Car c1 = new Car("Sonata", 2020);
        // Car c2 = new Car("Avante");
        // Car c3 = new Car();
        
        // System.out.println("======c1 정보======");
        // c1.displayInfo();
        // c1.displayInfo(true);

        // System.out.println("======c2 정보======");
        // c2.displayInfo();
        // c2.displayInfo(true);

        // System.out.println("======c3 정보======");
        // c3.displayInfo();
        // c3.displayInfo(true);

        // 2

        // Car[] cars = new Car[3];

        // cars[0] = new Car("Sonata", 2020);
        // cars[1] = new Car("Avante");
        // cars[2] = new Car();

        // for(int i = 0; i < cars.length; i++)
        // {
        //     System.out.printf("==== c%d====\n", i+1);
        //     cars[i].displayInfo();
        //     cars[i].displayInfo(true);
        // }

        //3
        
        Car [] cars = new Car[3];
        String[] models = {"Sonata", "Avante", "미정"};
        int[] years = {2020, -1, -1};

        for(int i = 0; i < cars.length; i++)
        {
            if(years[i] != -1)
            {
                cars[i] = new Car(models[i], years[i]);
            }
            else
            {
                cars[i] = new Car(models[i]);
            }

        }

        for(int i = 0; i < cars.length; i++)
        {
            System.out.printf("==== c%d====\n", i+1);
            cars[i].displayInfo();
            cars[i].displayInfo(true);
        }

    }
    
}
