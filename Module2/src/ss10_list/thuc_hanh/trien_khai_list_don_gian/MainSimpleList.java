package ss10_list.thuc_hanh.trien_khai_list_don_gian;

public class MainSimpleList {
    public static void main(String[] args) {
        SimpleList<Integer> listInteger = new SimpleList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+ listInteger.get(1));
        System.out.println("element 2: "+ listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
