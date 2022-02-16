package case_study.service.implement;

import case_study.controllers.FuramaController;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.IFacility;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.util.*;

public class FacilityServiceImplement implements IFacility {
    static String villaFilePath = "src/case_study/data/villa.csv";
    static String houseFilePath = "src/case_study/data/house.csv";
    static String roomFilePath = "src/case_study/data/room.csv";


    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your option: \n 1. Add new Villa \n 2. Add new House \n 3. Add new Room \n 4. Back to main menu ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                FuramaController.displayFacilityManagement();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

    @Override
    public void display() {
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
            System.out.println("Villa " + villa.getKey() + "number of uses " + villa.getValue());
        }
        for (Map.Entry<House, Integer> house : houseMap.entrySet()) {
            System.out.println("House " + house.getKey() + "number of uses " + house.getValue());
        }
        for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
            System.out.println("Room " + room.getKey() + "number of uses " + room.getValue());
        }
//        Set<Villa> villaSet = villaMap.keySet();
//        for (Villa villaKey : villaSet) {
//            System.out.println(villaKey.toString());
//        }
//        Set<House> houseSet = houseMap.keySet();
//        for (House houseKey : houseSet) {
//            System.out.println(houseKey.toString());
//        }
//        Set<Room> roomSet = roomMap.keySet();
//        for (Room roomKey : roomSet) {
//            System.out.println(roomKey.toString());
//        }
    }

    @Override
    public void edit() {
    }

    public void addVilla() {
        try {
            Scanner sc = new Scanner(System.in);
            Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
            Set<Villa> villaSet = villaMap.keySet();
            String idNameOfService;
            boolean flag;
            do {
                flag = true;
                do {
                    System.out.println("Please enter name of service's ID:");
                    idNameOfService = sc.nextLine();

                } while (!Validate.validateIDNameOfServiceVilla(idNameOfService));
                for (Villa villa : villaSet) {
                    if (idNameOfService.equals(villa.getIdNameOfService())) {
                        System.out.println("Villa ID name is exist!");
                        flag = false;
                        break;
                    }
                }
            } while (!flag);

            String nameOfService;
            do {
                System.out.println("Please enter name of service: ");
                nameOfService = sc.nextLine();
            } while (!Validate.validateServiceName(nameOfService));
            double villaArea;
            do {
                System.out.println("Please enter villa's area: ");
                villaArea = Double.parseDouble(sc.nextLine());
            } while (!Validate.validateArea(villaArea));
            int villaRate;
            do {
                System.out.println("Please enter villa's rate: ");
                villaRate = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateRoomRate(villaRate));
            int villaMaxPeople;
            do {
                System.out.println("Please enter villa's maximum of people: ");
                villaMaxPeople = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateMaximumPeople(villaMaxPeople));
            String villaTypeRent;
            do {
                System.out.println("Please enter villa's type of rent: ");
                villaTypeRent = sc.nextLine();
            } while (!Validate.validateRentalType(villaTypeRent));
            System.out.println("Enter villa standard: \n 1. 2 bed-rooms \n 2. 3 bed-rooms \n 3. 4 bed-rooms \n 4. President Suite Villa");
            int choiceOfVillaStandard = Integer.parseInt(sc.nextLine());
            String villaStandard = "";
            switch (choiceOfVillaStandard) {
                case 1:
                    villaStandard = "2 bed-rooms";
                    break;
                case 2:
                    villaStandard = "3 bed-rooms";
                    break;
                case 3:
                    villaStandard = "4 bed-rooms";
                    break;
                case 4:
                    villaStandard = "President Suite Villa";
                    break;
            }
            double villaPool;
            do {
                System.out.println("Please enter villa's pool area:  ");
                villaPool = Double.parseDouble(sc.nextLine());
            } while (!Validate.validatePoolArea(villaPool));
            System.out.println("Please enter villa's number of floor:  ");
            int villaFloor = Integer.parseInt(sc.nextLine());
            Villa villa = new Villa(idNameOfService, nameOfService, villaArea, villaRate, villaMaxPeople, villaTypeRent, villaStandard, villaPool, villaFloor);
            villaMap.put(villa, 0);
            ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void addHouse() {
        try {
            Scanner sc = new Scanner(System.in);
            Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
            Set<House> houseSet = houseMap.keySet();
            String idNameOfService;
            boolean flag;
            do {
                flag = true;
                do {
                    System.out.println("Please enter name of service's ID:");
                    idNameOfService = sc.nextLine();

                } while (!Validate.validateIDNameOfServiceHouse(idNameOfService));
                for (House house : houseSet) {
                    if (idNameOfService.equals(house.getIdNameOfService())) {
                        System.out.println("Villa ID name is exist!");
                        flag = false;
                        break;
                    }
                }
            } while (!flag);

            String nameOfService;
            do {

                System.out.println("Please enter name of service: ");
                nameOfService = sc.nextLine();
            } while (!Validate.validateServiceName(nameOfService));
            double houseArea;
            do {
                System.out.println("Please enter house's area: ");
                houseArea = Double.parseDouble(sc.nextLine());
            } while (!Validate.validateArea(houseArea));
            int houseRate;
            do {
                System.out.println("Please enter house's rate: ");
                houseRate = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateRoomRate(houseRate));
            int houseMaxPeople;
            do {
                System.out.println("Please enter house's maximum of people: ");
                houseMaxPeople = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateMaximumPeople(houseMaxPeople));
            String houseTypeRent;
            do {
                System.out.println("Please enter house's type of rent: ");
                houseTypeRent = sc.nextLine();
            } while (!Validate.validateRentalType(houseTypeRent));
            System.out.println("Enter house standard: \n 1. 1 bed-rooms \n 2. 2 bed-rooms \n 3. 3 bed-rooms \n 4. Bungalow");
            int choiceOfHouseStandard = Integer.parseInt(sc.nextLine());
            String houseStandard = "";
            switch (choiceOfHouseStandard) {
                case 1:
                    houseStandard = "1 bed-rooms";
                    break;
                case 2:
                    houseStandard = "2 bed-rooms";
                    break;
                case 3:
                    houseStandard = "3 bed-rooms";
                    break;
                case 4:
                    houseStandard = "Bungalow";
                    break;
            }
            int houseFloor;
            do {
                System.out.println("Please enter house's number of floor:  ");
                houseFloor = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateNumberFloor(houseFloor));
            House house = new House(idNameOfService, nameOfService, houseArea, houseRate, houseMaxPeople, houseTypeRent, houseStandard, houseFloor);
            houseMap.put(house, 0);
            ReadAndWrite.WriteHouseToCSV(houseMap, houseFilePath, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void addRoom() {
        try {
            Scanner sc = new Scanner(System.in);
            Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
            Set<Room> roomSet = roomMap.keySet();
            String idNameOfService;
            boolean flag;
            do {
                flag = true;
                do {
                    System.out.println("Please enter name of service's ID:");
                    idNameOfService = sc.nextLine();

                } while (!Validate.validateIDNameOfServiceRoom(idNameOfService));
                for (Room room : roomSet) {
                    if (idNameOfService.equals(room.getIdNameOfService())) {
                        System.out.println("Villa ID name is exist!");
                        flag = false;
                        break;
                    }
                }
            } while (!flag);
            String nameOfService;
            do {
                System.out.println("Please enter name of service: ");
                nameOfService = sc.nextLine();
            } while (!Validate.validateServiceName(nameOfService));
            double roomArea;
            do {
                System.out.println("Please enter room's area: ");
                roomArea = Double.parseDouble(sc.nextLine());
            } while (!Validate.validateArea(roomArea));
            int roomRate;
            do {
                System.out.println("Please enter room's rate: ");
                roomRate = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateRoomRate(roomRate));
            int roomMaxPeople;
            do {
                System.out.println("Please enter room's maximum of people: ");
                roomMaxPeople = Integer.parseInt(sc.nextLine());
            } while (!Validate.validateMaximumPeople(roomMaxPeople));
            String roomTypeRent;
            do {
                System.out.println("Please enter room's rental type: ");
                roomTypeRent = sc.nextLine();
            } while (!Validate.validateRentalType(roomTypeRent));
            System.out.println("Enter free room-service: \n 1. On-bed breakfast \n 2. Shuttle bus \n 3. Free cocktail \n 4. 60 minutes foot massage");
            int choiceOfFreeRoomService = Integer.parseInt(sc.nextLine());
            String freeRoomService = "";
            switch (choiceOfFreeRoomService) {
                case 1:
                    freeRoomService = "On-bed breakfast";
                    break;
                case 2:
                    freeRoomService = "Shuttle bus";
                    break;
                case 3:
                    freeRoomService = "Free cocktail";
                    break;
                case 4:
                    freeRoomService = "60 minutes foot massage";
                    break;
            }
            Room room = new Room(idNameOfService, nameOfService, roomArea, roomRate, roomMaxPeople, roomTypeRent, freeRoomService);
            roomMap.put(room, 0);
            ReadAndWrite.WriteRoomToCSV(roomMap, roomFilePath, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void displayForMaintaining() {
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);
        for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
            if (villa.getValue() >= 5) {
                System.out.println("Villa " + villa.getKey().getIdNameOfService() + " need to be maintained");
            }
        }
        for (Map.Entry<House, Integer> house : houseMap.entrySet()) {
            if (house.getValue() >= 5) {
                System.out.println("House " + house.getKey().getIdNameOfService() + " need to be maintained");
            }
        }
        for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
            if (room.getValue() >= 5) {
                System.out.println("Room " + room.getKey().getIdNameOfService() + " need to be maintained");
            }
        }
//        Set<Villa> villaSet = villaMap.keySet();
//        for (Villa villaKey : villaSet) {
//            if (villaMap.get(villaKey) > 5) {
//                System.out.println(villaKey.toString());
//            }
//        }
//        Set<House> houseSet = houseMap.keySet();
//        for (House houseKey : houseSet) {
//            if (houseMap.get(houseKey) > 5) {
//                System.out.println(houseKey.toString());
//            }
//        }
//        Set<Room> roomSet = roomMap.keySet();
//        for (Room roomKey : roomSet) {
//            if (roomMap.get(roomKey) > 5) {
//                System.out.println(roomKey.toString());
//            }
//        }
    }


    public void addTimesOfUsing(String idNameOfService) {
        Map<Villa, Integer> villaMap = ReadAndWrite.getVillaMap(villaFilePath);
        Map<House, Integer> houseMap = ReadAndWrite.getHouseMap(houseFilePath);
        Map<Room, Integer> roomMap = ReadAndWrite.getRoomMap(roomFilePath);

        for (Map.Entry<Villa, Integer> entry : villaMap.entrySet()) {
            if (entry.getKey().getIdNameOfService().equals(idNameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteVillaToCSV(villaMap, villaFilePath, false);
        }
        for (Map.Entry<House, Integer> entry : houseMap.entrySet()) {
            if (entry.getKey().getIdNameOfService().equals(idNameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteHouseToCSV(houseMap, houseFilePath, false);
        }
        for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
            if (entry.getKey().getIdNameOfService().equals(idNameOfService)) {
                entry.setValue(entry.getValue() + 1);
            }
            ReadAndWrite.WriteRoomToCSV(roomMap, roomFilePath, false);
        }
    }
}
