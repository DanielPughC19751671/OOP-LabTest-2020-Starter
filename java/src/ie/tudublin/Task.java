package ie.tudublin;
/*Using Imports*/
import processing.data.TableRow;

  
/*create Task class.*/
public class Task {
	    //Declare & Inisialise instance variabls.

        private String task;
        private int start;
        private int end;
    	

        //Generate setters and getters
        public String getTask() {
            return task;
        }//end getter
    
        public void setTask(String task) {
            this.task = task;
        }//end setter
    
        public int getStart() {
            return start;
        }//end getter
    
        public void setStart(int start) {
            this.start = start;
        }//end setter
    
        public int getEnd() {
            return end;
        }//end getter
    
        public void setEnd(int end) {
            this.end = end;
        }//end setter
    	

        //Create constructor.
        public Task(String task, int start, int end) {
            this.task = task;
            this.start = start;
            this.end = end;
        }//end constructor 

        public Task(TableRow r)
        {
            this(r.getString("Task"), r.getInt("Start"), r.getInt("End"));
        }//end paramaterised constructor.

        @Override
        public String toString() {
            return "Task [end=" + end + ", start=" + start + ", task=" + task + "]";
        }//end toString.
        

}//end class.


    
