package com.shariaty.melobit.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.transform.Result;

public class MelobitData {
    int total;
    public List<Result> results;
    public String id;
    public Album album;
    public List<Artist> artists = new ArrayList<Artist>();;
    public Audio audio;
    public boolean copyrighted;
    public boolean localized;
    public String downloadCount;
    public int duration;
    public boolean hasVideo;
    public String title;
    public Image image;
    public Date releaseDate;

    public int followersCount;
    public String fullName;
    public String type;
    public String sumSongsDownloadsCount;



    public class Album{
        public String name;
        public List<Artist> artists = new ArrayList<Artist>();;
        public Image image;
        public Date releaseDate;
        public String id;
    }

    public class Artist{
        public String id;
        public int followersCount;
        public String fullName;
        public String type;
        public String sumSongsDownloadsCount;
        public Image image;
    }

    public class Audio{
        public Medium medium;
        public High high;
    }

    public class Cover{
        public String url;
    }

    public class CoverSmall{
        public String url;
    }

    public class High{
        public String fingerprint;
        public String url;
    }

    public class Image{
        public ThumbnailSmall thumbnail_small;
        public Thumbnail thumbnail;
        public CoverSmall cover_small;
        public Cover cover;
        public Slider slider;

    }

    public class Medium{
        public String fingerprint;
        public String url;
    }

    public class Slider{
        public String url;
    }

    public class Thumbnail{
        public String url;
    }

    public class ThumbnailSmall{
        public String url;
    }

}
