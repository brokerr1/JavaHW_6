package Java.HomeWork.JavaHW_6.data;


public class Notebook {
    private String firm;
    private String model;
    private String ram;
    private String ssd;
    private String os;
    private String color;
    private Integer cost;

    public Notebook(String firm,String model,String ram,String ssd,String os,String color,Integer cost){
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
        return String.format("Ноутбук:%s %s Цвет: %s ОС: %s ОЗУ: %s Диск: %s Цена: %d",firm, model, color, os, ram, ssd, cost);
    }
    
    public String getColor() {
        return color;
    }
    public Integer getCost() {
        return cost;
    }
    public String getFirm() {
        return firm;
    }
    public String getModel() {
        return model;
    }
    public String getOs() {
        return os;
    }
    public String getRam() {
        return ram;
    }
    public String getSsd() {
        return ssd;
    }
}