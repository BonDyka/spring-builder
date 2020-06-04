package loc.abondarev;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        CoronaDisinfector coronaDisinfector = ObjectFactory.getInstance().createObject(CoronaDisinfector.class);
        ApplicationContext context = Application.run("loc.abondarev", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDisinfector coronaDisinfector = context.getObject(CoronaDisinfector.class);
        coronaDisinfector.start(new Room());
    }
}
