package com.example.bill.mapper;


import com.example.bill.entities.Media;

import java.util.List;

public interface MediaMapper {

    List<Media> getMedias(Media media);

    Media getMediaByPid(Integer vid);

    int addMedia(Media media);

    int deleteMediaByPid(Integer vid);

    int updateMedia(Media media);
}
