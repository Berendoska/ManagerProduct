package ru.netology;

public class Smart extends Product {
    private String maker;

    public Smart(int id, String name, int cost, String maker) {
        super(id, name, cost);
        this.maker = maker;
    }

        public String getMaker () {
            return maker;
        }

        public void setMaker (String maker){
            this.maker = maker;
        }

    }

