package loc.abondarev;

import javax.annotation.PostConstruct;

public class PolicemanImpl implements Policeman {
    @IngectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    public void makePeopleLeaveRoom() {
        System.out.println("пиф пафб бах бабах, кыш кыш");
    }
}
