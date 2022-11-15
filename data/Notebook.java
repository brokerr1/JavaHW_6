package Java.HomeWork.JavaHW_6.data;


public class Notebook {
    private String firm;
    private String model;
    private int ram;
    private int ssd;
    private String os;
    private String color;
    private int cost;

    public Notebook(String firm,String model,int ram,int ssd,String os,String color,int cost){
        this.firm = firm;
        this.model = model;
        this.ram =ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Ноутбук:%s %s Цвет: %s ОС: %s ОЗУ: %d Диск: %d Цена: %d",firm, model, color, os, ram, ssd, cost);
    }
    
}