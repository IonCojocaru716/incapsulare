package com.company;

 class Bucatarie {
   private String frigider;
   private String  masa;
   private int cani;
   private int farfurii;

    public void setCani(int cani) {
        this.cani = cani;
    }
    public void setFrigider(String frigider){
        this.frigider=frigider;
    }
    public void setMasa(String masa){
        this.masa=masa;
    }
    public void setFarfurii(int farfurii) {
        this.farfurii=farfurii;
    }
    public String getFrigider(){
        return frigider;
    }
    public String getMasa(){
        return masa;
    }
    public  int getCani(){
        return  cani;
    }
    public int getFarfurii(){
        return farfurii;
    }
}

