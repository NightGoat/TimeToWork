package nightgoat.timesheet.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "days", indices = {@Index(value = {"date", "came", "gone", "worked_time"})})
public class DayEntity {

    @PrimaryKey
    @ColumnInfo(name = "date")
    @NonNull
    private final String date;

    private String note;

    @ColumnInfo(name = "came")
    private String timeCame;

    @ColumnInfo(name = "gone")
    private String timeGone;

    @ColumnInfo(name = "worked_time")
    private String timeWorked;

    public DayEntity(@NonNull String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayEntity dayEntity = (DayEntity) o;
        return date.equals(dayEntity.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    @NonNull
    public String getDate() {
        return date;
    }

    public String getTimeCame() {
        return timeCame;
    }

    public String getTimeGone() {
        return timeGone;
    }

    public String getTimeWorked() {
        return timeWorked;
    }

    void setTimeWorked(String timeWorked) {
        this.timeWorked = timeWorked;
    }

    public void setTimeCame(String timeCame) {
        this.timeCame = timeCame;
    }

    public void setTimeGone(String timeGone) {
        this.timeGone = timeGone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
