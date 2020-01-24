package pojo;

import anotation.Anatations;
import interfaces.iPerson;

@Anatations.CoFoundersAnotation
public class CoFounders implements iPerson {
    private String name;

    @Override
    public String getName() {
        this.name = "CoFounders";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
