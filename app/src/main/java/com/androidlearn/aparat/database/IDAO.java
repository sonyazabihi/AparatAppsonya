package com.androidlearn.aparat.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.androidlearn.aparat.models.Video;

import java.util.List;

@Dao
public interface IDAO {

    @Insert
    long insert(Video video);

    @Delete
    void delete(Video video);


    @Update
    void update(Video video);


    @Query ( "select * from  tbl_video" )
    List<Video>  getvideolist();

}
