package loc.abondarev;

@Singelton
public class ConsoleAnnouncer implements Announcer {
    @IngectByType
    private Recommendator recommendator;

    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
