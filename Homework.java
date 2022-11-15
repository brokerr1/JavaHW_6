package Java.HomeWork.JavaHW_6;

import Java.HomeWork.JavaHW_6.data.Notebook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать множество ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - значение, Объем ЖД - значение, Операционная система - значение, Цвет - значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        Map<String, String> map = new HashMap<>(); //фильтры
        map.put("ram", "8");
        map.put("ssd", "512");
        map.put("os", "win");
        map.put("color", "black");
        List<Notebook> notebookslist = hw.initListNotebooks(); //список ноутбуков
        System.out.println("Cписок ноутбуков:\n" + notebookslist);
        List<Notebook> filternotebook = hw.filter(map, notebookslist); //отфильтрованные ноутбуки
        System.out.println("\nОтфильтрованные ноутбуки:\n" + filternotebook);
    }


    public List<Notebook> initListNotebooks(){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("asus", "5089", "8", "256", "win", "black", 10999));
        notebooks.add(new Notebook("aser", "6941", "8", "512", "linux", "gray", 20999));
        notebooks.add(new Notebook("lenovo", "9431", "4", "256", "win", "gray", 30999));
        notebooks.add(new Notebook("asus", "6815", "8", "512", "win", "black", 15999));
        notebooks.add(new Notebook("lenovo", "9844", "4", "512", "linux", "black", 40999));
        notebooks.add(new Notebook("asus", "1864", "8", "512", "win", "white", 9999));
        notebooks.add(new Notebook("asus", "5089", "8", "256", "win", "black", 33999));
        notebooks.add(new Notebook("aser", "6941", "8", "256", "win", "gray", 12999));
        notebooks.add(new Notebook("lenovo", "9431", "4", "256", "win", "gray", 25999));
        notebooks.add(new Notebook("asus", "6815", "8", "512", "win", "black", 11999));
        notebooks.add(new Notebook("lenovo", "9844", "4", "512", "linux", "black", 16999));
        notebooks.add(new Notebook("asus", "1864", "8", "512", "win", "white", 17999));
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> map, List<Notebook> notebooks){
        List<Notebook> filternotebooks = new ArrayList<>();
        for (int i = 0; i < notebooks.size(); i++) {
            if (notebooks.get(i).getColor() == map.get("color")){
                if (notebooks.get(i).getOs() == map.get("os")){
                    if (notebooks.get(i).getRam() == map.get("ram")){
                        if (notebooks.get(i).getSsd() == map.get("ssd")){
                        filternotebooks.add(notebooks.get(i));
                        //System.out.println(notebooks.get(i));
                        }
                    }
                }
            }
        }

        return filternotebooks;
    }

}