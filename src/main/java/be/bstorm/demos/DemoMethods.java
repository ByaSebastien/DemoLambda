package be.bstorm.demos;

import be.bstorm.models.Person;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoMethods {

    /*
    1 : Ou allons nous en avoir besoin? (public,protected,private)
    2 : Est elle lié d'instance ou non ? utils ou non (static ou rien)
    3 : Me revoit elle une donnée ? si oui de quel type (void,int,bool,Person,...)
    4 : Donnons lui un nom qui a du sens
    5 : A t'elle besoin de donnée pour fonctionner? (param) de quel type? (int nb,bool isOk,Person p)
    6 : Algorithme attendus
     */

    private String name;
    private List<Person> people = new ArrayList<>();

    public String getName(){
        return name;
    }

//    public boolean estPair(int nb){
////        String n = this.getName();
//        return nb % 2 == 0;
//    }
//
//    public boolean estPair(int[] nb){
////        String n = this.getName();
//        boolean sontIlsTousPair = true;
//        for(int n : nb){
//            if(n % 2 != 0){
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean estPair(int... nb){
//        String n = this.getName();
        boolean sontIlsTousPair = true;
        for(int n : nb){
            if(n % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public boolean estPair(double nb){
//        String n = this.getName();
        return nb % 2 == 0;
    }

    public void addPerson(Person p){
        people.add(p);
    }

    @Override
    public String toString() {
        return super.toString() + " DemoMethods [name=" + name + ", people=" + people + "]";
    }

}
