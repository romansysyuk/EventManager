package lviv.first.Dao;

import lviv.first.entity.Event;

import java.util.Date;
import java.util.List;

/**
 * Created by kobeb on 24.05.2016.
 */
public interface EventDao extends AbstractDao<Event>{

    public List<Event> findByDate(Date date);

    public List<Event> findByName(String name);

    public List<Event> findBetweenTwoDates(Date startDate, Date endDate);







}
