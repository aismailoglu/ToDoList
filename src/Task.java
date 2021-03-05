import java.util.Date;

public class Task {

    String taskName;
    String projectName;
    String Status;
    String taskDate; //todo make it date later

    public Task(String taskName, String projectName, String status, String taskDate) {
        this.taskName = taskName;
        this.projectName = projectName;
        this.Status = status;
        this.taskDate = taskDate;
    }
/*
     @return The Task name.

 */
    public String getTaskName() {
        return taskName;
    }
    /*
         @return The Description.
     */
    public String getProjectName() {
        return projectName;
    }
    /*
         @return The Task Status.
     */
    public String getStatus() {
        return Status;
    }
    /*
         @return The Task Date.

     */
    public String getTaskDate() {
        return taskDate;
    }
    /*
         @Set The Task name.
     */
    public void setTaskName(String setTaskName) {
        taskName = setTaskName;
    }
    /*
         @return The Task description.
     */
    public void setProjectName(String setProjectName) {
        projectName = setProjectName;
    }
    /*
         @Set The Task Status.
     */
    public void setStatus(String setStatus) {
        Status = setStatus;
    }
    /*
         @Set The Task Date.
     */
    public void setTaskDate(String setTaskDate) {
        taskDate = setTaskDate;
    }


    @Override
    public String toString() { //todo add the other stuff
        return taskName + "-" + projectName;
    }
}
