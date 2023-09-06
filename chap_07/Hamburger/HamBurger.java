package chap_07.Hamburger;

import java.util.ArrayList;
import java.util.List;

public class HamBurger {
    public String name;


    public HamBurger() {
         this.name="햄버거";
    }

    public HamBurger(String name){
        this.name = name;
    }


    public void cook(){
            System.out.println(this.name +"을 만듭니다.");
            System.out.println("빵 사이에 들어갈 재료는? ");
            String[] arr = {"양상추", "패티", "피클"};

            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
        }


    }


}
