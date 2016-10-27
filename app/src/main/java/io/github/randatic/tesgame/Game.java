package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/17/16.
 */
public class Game {
    private Map map;
    private Character player;
    private String[] events;

    public Game () {
        events = new String[] {"Welcome to Souls!", "Have fun!", "Don\'t die!", "Testing", "Last line"};
        player = new Character();
        map = new Map(player);
    }

    public void addEvent(String e) {
        for(int i = 0;i < events.length-1; i++) {
            events[i] = events[i+1];
        }
        events[events.length-1] = e;
    }

    public void movePlayer(int direction) {
        map.movePlayer(direction, player);
    }


    public Character getPlayer() {
        return player;
    }
    public Map getMap() {
        return map;
    }
    public String getEventString() {
        String eventString = "";

        for (String e : events) {
            eventString += e + "\n";
        }
        return eventString;
    }

    public void Action() {

      /*  if ()
*/
    }

}
