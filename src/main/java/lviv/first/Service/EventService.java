package lviv.first.Service;

import lviv.first.entity.Event;

import java.util.Date;
import java.util.List;


public interface EventService {

    public void add(String eventName, String eventDesc, Date eventDate);

    public void edit(int id, String eventName, String eventDesc, Date eventDate);

    public void delete(int id);

    List<Event> findByName(String name);

    List<Event> findByDate(Date date);


}
