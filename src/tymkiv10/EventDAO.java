package tymkiv10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public class EventDAO implements Externalizable{
    private ArrayList<EventEntity> container;
    EventEntity event;
    public EventDAO(){

    }
    public void setEventContainer(ArrayList<EventEntity> eventContainer){
        this.container = eventContainer;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(container);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.container = (ArrayList<EventEntity>)in.readObject();
    }

    public ArrayList<EventEntity> getContainer() {
        return container;
    }
}
