package case_study.utils;

public class Validate {
    public static boolean validateIDNameOfServiceVilla(String a) {
        final String ID_NAME_SERVICE_VILLA_REGEX = "^[S][V]{2}[L][-]\\d{4}";
        if (a.matches(ID_NAME_SERVICE_VILLA_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again as format SVVL-0000");
            return false;
        }
    }

    public static boolean validateIDNameOfServiceHouse(String a) {
        final String ID_NAME_SERVICE_HOUSE_REGEX = "^[S][V][H][O][-]\\d{4}";
        if (a.matches(ID_NAME_SERVICE_HOUSE_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again as format SVHO-0000");
            return false;
        }
    }

    public static boolean validateIDNameOfServiceRoom(String a) {
        final String ID_NAME_SERVICE_ROOM_REGEX = "^[S][V][R][O][-]\\d{4}";
        if (a.matches(ID_NAME_SERVICE_ROOM_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again as format SVRO-0000");
            return false;
        }
    }


    public static boolean validateServiceName(String nameService) {
        final String SERVICE_NAME_REGEX = "^[A-Z][a-z0-9\\s]*$";

        if (nameService.matches(SERVICE_NAME_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again as format Abc123!");
            return false;
        }

    }

    public static boolean validateRentalType(String typeRent) {
        final String RENTAL_TYPE_REGEX = "^[A-Z][A-z]*";

        if (typeRent.matches(RENTAL_TYPE_REGEX)) {
            return true;
        } else {
            System.err.println("Wrong text format! Please enter again!");
            return false;
        }

    }


    public static boolean validateIdCard(String idCard) {
        final String ID_CARD_REGEX = "\\d{9}";
        if (idCard.matches(ID_CARD_REGEX)) {
            return true;
        } else {
            System.err.println("ID card must be in 9-digit! Please enter again! ");
            return false;
        }
    }

    public static boolean validateMaximumPeople(int maxPeople) {
        if (maxPeople > 0 && maxPeople < 20) {
            return true;
        } else {
            System.err.println("People must be greater than 0 and less than 20! Please enter again!");
            return false;
        }
    }

    public static boolean validateNumberFloor(int numberFloor) {
        if (numberFloor > 0) {
            return true;
        } else {
            System.err.println("Number of floor must be greater than 0! Please enter again!");
            return false;
        }
    }

    public static boolean validateRoomRate(int roomRate) {
        if (roomRate > 0) {
            return true;
        } else {
            System.err.println("Room rate must be greater than 0! Please enter again!");
            return false;
        }
    }

    public static boolean validateArea(double area) {
        if (area > 30) {
            return true;
        } else {
            System.err.println("Area must be greater than 30!! Please enter again!");
            return false;
        }
    }

    public static boolean validatePoolArea(double poolArea) {
        if (poolArea > 30) {
            return true;
        } else {
            System.err.println("Pool area must be greater than 30!! Please enter again!");
            return false;
        }
    }

    public static boolean validateDateFormat(String date) {
        final String DATE_FORMAT_REGEX = "^(([1-2][\\d])|(0+[1-9])|(3+[0-1]))[/]+((0+[1-9])|(1+[0-2]))+[/]+[\\d]{4}$";
        try {
            if (!date.matches(DATE_FORMAT_REGEX)) {
                throw new DateFormatException("Wrong format, please enter again.");
            }
        } catch (DateFormatException e) {
            System.err.println(e.getMessage() + "(dd/mm/yyyy)");
            return false;
        }
        return true;
    }
}
