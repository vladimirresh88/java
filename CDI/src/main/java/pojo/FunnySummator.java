package pojo;

import anotation.Anatations;

import javax.enterprise.inject.Produces;

public class FunnySummator {
    @Produces
    String s1 = "Hello ";
    @Produces
    @Anatations.SecondStringAnotation
    String s2 = "i'm funny summator";
    @Produces
    int i1 =  5;
    @Produces
    double getDouble(){
        return  (i1 +10)/2;
    }
    @Produces
    Name getName() {return new Name("FunnySum");}
}
