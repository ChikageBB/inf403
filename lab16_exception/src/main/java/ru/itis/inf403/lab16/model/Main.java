package ru.itis.inf403.lab16.model;

public class Main  {
    public static void main  (String[] args) {

       int countCars = 10;
       int probability = 20;
       int distance = 1000;
       int currentDistance = 0;
       int speed = 100;

       Car[] cars = new Car[countCars];
       for (int i = 0; i < countCars; i++){
           cars[i] = new Car();
       }


        int currentCarIndex = 0;

       try{
           while (currentDistance < distance){
               Car currentCar = cars[currentCarIndex];
               if (!currentCar.isBroken){
                   try{
                       currentDistance += speed;
                       System.out.println("Автомобиль " + currentCarIndex + " проехал " + currentDistance + " КМ ");
                       currentCar.check(probability);
                   }catch (Exception e){
                       System.out.println("Автомобиль " + currentCarIndex + " сломался на " + currentDistance + " КМ ");
                       currentCar.isBroken = true;
                       currentCarIndex++;

                       if (currentCarIndex > 10){
                           throw new Exception("Экспедиция провалилась: закончились машины");
                       }else{
                           transferCrew(cars, currentCar.crew, currentCarIndex, 5 );
                       }
                   }
               }
           }
           System.out.println("Экспедиция прошла успешно!!!");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public static void transferCrew(Car[] cars, int countCrew, int numberCar, int seatPerCar) throws Exception{

        int remainingCrew = countCrew;
        for (int i = numberCar; i < 10; i++){
            Car currentCar = cars[i];
            if (!currentCar.isBroken && currentCar.seat <= 5){
                int availableSeats = currentCar.seat - currentCar.crew;
                int crewToTransfer = Math.min(availableSeats, remainingCrew);
                currentCar.crew += crewToTransfer;
                remainingCrew -= crewToTransfer;

                if (remainingCrew == 0){break;}
            }
        }

        if (remainingCrew > 0){
            throw  new Exception("Экспедиция провалилась: не хватило мест для пересадки экипажа");
        }
    }
}
