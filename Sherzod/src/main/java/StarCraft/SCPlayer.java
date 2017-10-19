package StarCraft;

/**
 * Created by Sherzod on 10/19/2017.
 */
public class SCPlayer {
    String nickName;
    int point;
    League league;
    Race race;

    public SCPlayer(String nickName, League league, int point ) {
        this.nickName = nickName;
        this.point = point;
        this.league = league;
    }
}
enum League {
    PRO,DIAMAND,PLATINUM,GOLD,SILVER,BRONZE,PRACTICE
}
enum Race {
    TERRAN,PROTOSS,ZERG
}





