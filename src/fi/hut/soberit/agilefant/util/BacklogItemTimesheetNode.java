package fi.hut.soberit.agilefant.util;

import fi.hut.soberit.agilefant.business.TimesheetBusiness;
import fi.hut.soberit.agilefant.model.BacklogItem;

/**
 * A class representing a backlog item node in the timesheet tree.
 * Fetches the hour entries associated with this backlog item.
 * @author Vesa Pirila
 *
 */
public class BacklogItemTimesheetNode extends TimesheetNode {
    private BacklogItem backlogItem;
    
    /**
     * 
     * @param backlogItem The backlog item to be stored in this node
     * @param tsb The timesheetBusiness instance to enable getting the hour entries by backlog item id
     */
    public BacklogItemTimesheetNode(BacklogItem backlogItem, TimesheetBusiness tsb){
        this.backlogItem = backlogItem;
        hourEntries = tsb.getFilteredHourEntries(backlogItem);
    }
    
    /**
     * Get the BacklogItem of the node. Used at least to get the node's name. 
     */
    public BacklogItem getBacklogItem(){
        return this.backlogItem;
    }
    
    /**
     * {@inheritDoc}
     */
    public void print(){
        System.out.println("  "+this.backlogItem.getName() + " " + this.getHourTotal());
    }
}
