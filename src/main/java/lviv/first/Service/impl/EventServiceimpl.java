package lviv.first.Service.impl;

import lviv.first.Dao.EventDao;
import lviv.first.Service.EventService;
import lviv.first.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service
public class EventServiceimpl implements EventService {
    @Autowired
    private EventDao eventDao;

    @Transactional

    public void add(String eventName, String eventDesc, Date eventDate) {
        Event event = new Event(eventDate, eventDesc, eventName);
        eventDao.add(event);

    }

    public void edit(int id, String eventName, String eventDesc, Date eventDate) {
        Event event = eventDao.findById(id);
        if (eventName != null) {
            event.setEventName(eventName);
        }
        if (eventDesc != null) {
            event.setEventDate(eventDate);
        }
        if (eventDate != null) {
            event.setEventDate(eventDate);
        }

    }

    public void delete(int id) {
        Event event = eventDao.findById(id);
        eventDao.delete(event);

    }

    public List<Event> findByName(String name) {
        return eventDao.findByName(name);
    }

    public List<Event> findByDate(Date date) {
        return eventDao.findByDate(date);
    }
}
