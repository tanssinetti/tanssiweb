package fi.tanssinetti.www.domain.artist.service;

import fi.tanssinetti.www.domain.artist.entity.Artist;

import java.util.List;

/**
 * Created by Hannu Lohtander on 25.9.2016.
 */
public interface ArtistService {

    Artist getArtist(Integer id);

    List<Artist> getArtists();
}
