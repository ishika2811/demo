package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {

    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        String[] items = electronicsItems.split(", ");
        List<String> itemList = new ArrayList<>();
        for (String item : items) {
            if (!itemList.contains(item)) {
                itemList.add(item);
            }
        }
        return itemList;
    }

    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).equals(searchItem)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        Iterator<String> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals(removeItem)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
ElectronicListService e=new ElectronicListService();

    }
}