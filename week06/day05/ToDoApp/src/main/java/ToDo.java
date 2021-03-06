import java.time.LocalDate;

/**
 * Created by georgezsiga on 4/21/17.
 */
public class ToDo extends ToDoList {
  private static int idCounter = 1;
  private int id;
  private String toDo;
  private LocalDate createdAt, completedAt;
  private static LocalDate nullDate = LocalDate.of(1111, 11, 11);

  public ToDo(String toDo) {
    this.id = idCounter++;
    this.toDo = toDo;
    this.createdAt = LocalDate.now();
    this.completedAt = nullDate;
  }

  public ToDo(String toDo, LocalDate createdAt, LocalDate completedAt) {
    this.id = idCounter++;
    this.toDo = toDo;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
  }

  public int getId() {
    return id;
  }

  public LocalDate getCompletedAt() {
    return completedAt;
  }

  public static LocalDate getNullDate() {
    return nullDate;
  }

  public String getToDo() {
    return toDo;
  }

  public void setToDo(String toDo) {
    this.toDo = toDo;
  }

  public void setCompletedAt(LocalDate completedAt) {
    this.completedAt = completedAt;
  }

  public String toFile() {
    return id + ";" + toDo + ";" + createdAt + ";" + completedAt;
  }

  @Override
  public String toString() {
    if (completedAt.equals(nullDate))
      return id + " (" + createdAt + ") - " + toDo + " - this task is not completed yet";
    return id + " (" + createdAt + ") - " + toDo + " - completed: " + completedAt;
  }
}
