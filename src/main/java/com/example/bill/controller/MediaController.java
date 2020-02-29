package com.example.bill.controller;

import com.example.bill.entities.Media;
import com.example.bill.mapper.MediaMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class MediaController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    MediaMapper mediaMapper;

    @GetMapping("/medias")
    public String list(Media media, Map<String, Object> map) {

        List<Media> medias = mediaMapper.getMedias(media);

        map.put("medias", medias);

        return "media/list";
    }

    @GetMapping("/media/{vid}")
    public String view(@PathVariable("vid") Integer vid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {


        Media media = mediaMapper.getMediaByPid(vid);

        map.put("media", media);

        return "media/" + type;
    }

    @PostMapping("/media")
    public String add(Media media) {

        mediaMapper.addMedia(media);

        return "redirect:/medias";
    }

    @GetMapping("/media")
    public String toAddPage() {
        return "media/add";
    }

    @DeleteMapping("/media/{vid}" )
    public String delete(@PathVariable("vid") Integer vid) {

        logger.info("_del_mediaById_:" + vid);

        mediaMapper.deleteMediaByPid(vid);

        return "redirect:/medias";
    }

    @PutMapping("/media")
    public String update(Media media) {

        logger.info("_update_media_:" + media);

        mediaMapper.updateMedia(media);

        return "redirect:medias";
    }
}
