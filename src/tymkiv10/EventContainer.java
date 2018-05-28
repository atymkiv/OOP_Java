package tymkiv10;

import java.util.ArrayList;
import java.util.LinkedList;

public class EventContainer {
    private static ArrayList<EventEntity> allEvents = new ArrayList<>();

    public EventContainer(){}

    public EventContainer(ArrayList<EventEntity> events){
        this.allEvents = events;
    }

    public ArrayList<EventEntity> getAllEvents() {
        return allEvents;
    }
    public void addEvent(EventEntity event){
        allEvents.add(event);
    }

    public static void setAllEvents(ArrayList<EventEntity> allEvents) {
        EventContainer.allEvents = allEvents;
    }
}
