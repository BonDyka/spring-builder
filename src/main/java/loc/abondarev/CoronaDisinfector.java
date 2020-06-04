package loc.abondarev;

@Deprecated
public class CoronaDisinfector {
    @IngectByType
    private Announcer announcer;
    @IngectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!!!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Можете рискнуть вернутся в комнату!");
    }

    private void disinfect(Room room) {
        System.out.println("Молитва: корона изыди!!!");
    }
}
