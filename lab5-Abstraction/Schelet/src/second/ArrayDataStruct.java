package second;

import first.Task;
import java.util.ArrayList;

public abstract class ArrayDataStruct {

    public ArrayList<Task> list;

    public ArrayDataStruct() {
        this.list = new ArrayList<>();
    }

    public abstract ArrayList<Task> getTasks();

    /**
     * Removes a Task from the Container.
     *
     * @return the removed Task, if the Container is not empty;
     *         null, otherwise
     */
    public abstract Task pop();

    /**
     * Inserts a Task in the Container.
     *
     * @param task the inserted Task
     */
    public void push(Task task){
        list.add(list.size(), task);
    }

    /**
     * Returns the number of elements from the Container.
     *
     * @return The number of elements in this container.
     */
    public int size(){
        return list.size();
    }

    /**
     * Verifies if the Container is empty or not.
     *
     * @return true,  if the Container is empty
     *         false, otherwise
     */
    public boolean isEmpty(){
        if(list.size() == 0)
            return true;
        else
            return false;
    }

    /**
     * Transfers all the elements that exist in a Container in this Container.
     *
     * @param container the Container from which we should transfer elements.
     *                  After the transfer, container.size() == 0
     */
    public void transferFrom(Container container){
        while(!container.isEmpty())
            this.push(container.pop());
        }
}
