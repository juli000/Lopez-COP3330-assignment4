/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Julio Lopez
 */

package ucf.assignments;

public class Controller {

    public void addList() {
        /*
            creates new list within main file
            use input fields
         */
    }

    public void removeList() {
        /*
           If a list is selected
           And user is not within the table view
           And user presses delete it will remove the list
         */
    }

    public void editTitle() {
        /*
            If user double-clicks on the name of a list item
            Then they will be prompted to enter a new title
            Reload all lists
         */
    }

    public void promptListUpdate() {
        /*
            If user double-clicks on the file within tableview
            Then they will be prompted to enter a new item
            This will allow them to either create or delete an item
            Reload all items
         */
    }

    public void editItem() {
        /*
            If user double-clicks on the row within tableview
            Then they will be prompted to enter all fields again
            Reload all items
         */
    }

    public void completeItem() {
        /*
            If button Complete Item is pressed then the rows under the cursor
            will be highlighted and user will click to complete
         */
    }

    public void showCompleted() {
        /*
            While toggle button is pressed it will show only completed items
            Go through the column completed and determine whether it should be shown
         */
    }

    public void showNotCompleted() {
        /*
            While toggle button is pressed it will show only completed items
            Go through the column completed and determine whether it should be shown
         */
    }

    public void saveIndividualList() {
        /*
            If the save list button is pressed the current selected list
            will be saved to external storage
         */
    }

    public void saveAllList() {
        /*
            If the save all button is pressed then all lists will be saved within one file
            will be saved to external storage
         */
    }

    public void uploadList() {
    /*
    Since a a list of lists will contain seperate .csv it does not matter whether they decide to upload one or more
    all they would have to do is upload all of them at once if they wanted more
    Update view to display newly uploaded lists
     */
    }

    public void updateView(){
        /*
            Will reload all lists as well as the table view
         */
    }
}
