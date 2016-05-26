package lviv.first.Dao;

import lviv.first.entity.Event;

import java.util.Date;
import java.util.List;


public interface EventDao extends AbstractDao<Event>{

    public List<Event> findByDate(Date date);

    public List<Event> findByName(String name);

    public List<Event> findBetweenTwoDates(Date startDate, Date endDate);







}
