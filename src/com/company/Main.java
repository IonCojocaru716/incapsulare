package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bucatarie mea = new Bucatarie();
      // System.out.println(mea.getCuloare);


        mea.setCani(20);
        mea.setMasa("din_lemn");
        mea.setFarfurii(16);
        mea.setFrigider("LG");
        System.out.println("eu am  :" + mea.getCani() + " cani !");
        System.out.println("eu am :" +mea.getFarfurii() +" farfurii !");
        System.out.println("masa mea e : " + mea.getMasa());
        System.out.println("frigiderul meu e : " + mea.getFrigider());



    }

}
