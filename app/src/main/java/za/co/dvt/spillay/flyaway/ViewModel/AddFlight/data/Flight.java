package za.co.dvt.spillay.flyaway.ViewModel.AddFlight.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by SPillay on 2018/02/05.
 */
@Entity(tableName = "Flights")
public class Flight {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "flightId")
    private int flightId;
    private String refrenceNumber;
    private String date;
    private String time;
    private String from;
    private String to;

    //constructor
    public Flight(String refrenceNumber, String date, String time, String from, String to) {
        this.refrenceNumber = refrenceNumber;
        this.date = date;
        this.time = time;
        this.from = from;
        this.to = to;
    }

    //Getters and setters
    public String getRefrenceNumber() {
        return refrenceNumber;
    }

    public void setRefrenceNumber(String refrenceNumber) {
        this.refrenceNumber = refrenceNumber;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @NonNull
    public int getFlightId() {
        return this.flightId;
    }

    public void setFlightId(@NonNull int flightId) {
        this.flightId = flightId;
    }
}
