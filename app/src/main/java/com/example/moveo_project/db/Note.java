package com.example.moveo_project.db;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.ColorInt;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;

@Entity
@SuppressWarnings("serial")
public class Note implements Serializable {


    @PrimaryKey(autoGenerate = true)
   public  int uid;

    @ColumnInfo(name = "title")
   public  String noteTitle;

   @ColumnInfo(name = "body")
   public String notebody;

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "email")
    public String email;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @ColumnInfo(name = "lat")
    public Double lat;

    @ColumnInfo(name = "lon")
    public Double lon;




    public Note(String title, String body, String date , String email) {
        this.noteTitle = title;
        this.notebody = body;
        this.email = email;
        this.date = date;
    }

    public Note(Parcel in) {
        noteTitle = in.readString();
        notebody = in.readString();
        email = in.readString();
        date = in.readString();
        lon = in.readDouble();
        lat = in.readDouble();
    }

    public Note() {
    }
    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public void setNotebody(String notebody) {
        this.notebody = notebody;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getUid() {
        return uid;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public String getNotebody() {
        return notebody;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }
/*
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(uid);
        dest.writeString(noteTitle);
        dest.writeString(notebody);
        dest.writeString(date);
        dest.writeString(email);
        dest.writeDouble(lat);
        dest.writeDouble(lon);
    }

    public static final Parcelable.Creator<Note> CREATOR = new Parcelable.Creator<Note>()
    {
        public Note createFromParcel(Parcel in)
        {
            return new Note(in);
        }
        public Note[] newArray(int size)
        {
            return new Note[size];
        }
    };


////    public Date getDate() { return date; }
////
////    public void setDate(Date date) { this.date = date; }
//
//    public long getNote_id() {
//        return note_id;
//    }
//
//    public void setNote_id(long note_id) {
//        this.note_id = note_id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }

//    DatabaseReference usersRef = ref.child("users");
//
//    Map<String, User> users = new HashMap<>();
//users.put("alanisawesome", new User("June 23, 1912", "Alan Turing"));
//users.put("gracehop", new User("December 9, 1906", "Grace Hopper"));
//
//usersRef.setValueAsync(users);

*/
}