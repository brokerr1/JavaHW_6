package Java.HomeWork.JavaHW_6;

import Java.HomeWork.JavaHW_6.data.Notebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
        
        System.out.println(hw.initListNotebooks());
    }

    public List<Notebook> initListNotebooks(){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("asus", "5089", 8, 256, "win", "black", 10999));
        notebooks.add(new Notebook("aser", "6941", 8, 512, "linux", "gray", 10999));
        notebooks.add(new Notebook("lenovo", "9431", 4, 256, "win", "gray", 10999));
        notebooks.add(new Notebook("asus", "6815", 16, 1024, "win", "black", 10999));
        notebooks.add(new Notebook("lenovo", "9844", 8, 512, "linux", "black", 10999));
        notebooks.add(new Notebook("asus", "1864", 8, 512, "win", "white", 10999));
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        Map<String, String> map = new HashMap<>();
        map.put("ram", "8");
        map.put("ssd", "512");
        map.put("os", "win");
        map.put("color", "black");
        return map;
    }

}