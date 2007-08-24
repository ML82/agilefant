package fi.hut.soberit.agilefant.db;

import fi.hut.soberit.agilefant.model.Backlog;
import fi.hut.soberit.agilefant.model.EffortHistory;
import java.sql.Date;

/**
 * Interface for a DAO of a EffortHistory data model
 * 
 * @see GenericDAO
 */
public interface EffortHistoryDAO extends GenericDAO<EffortHistory>{
	
	/**
	 * Get effort history object by date and date
	 * @param date the date for the effort history
	 * @param backlog the backlog of the effort history
	 * @return effort history object for given date and backlog
	 */
	public EffortHistory getByDateAndBacklog(Date date, Backlog backlog);
	
	/**
	 * Get the most recent effort history (the nearest object  
	 * backwards from the given date)
	 * @param date the date to start the search for
	 * @param backlog the backlog of the effort history
	 * @return the effort history object nearest to the date
	 */
	public EffortHistory getMostRecent(Date date, Backlog backlog);
	
	/**
	 * Get the latest effort history (the nearest object  
	 * forward from the given date)
	 * @param startDate the date to start the search for
	 * @param endDate the and date to start the search form
	 * @param backlog the backlog of the effort history
	 * @return the effort history object nearest to the date forwards
	 */
	public EffortHistory getLatest(Date startDate, Date endDate, 
			Backlog backlog);
}
