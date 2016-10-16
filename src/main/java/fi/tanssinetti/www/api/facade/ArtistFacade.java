package fi.tanssinetti.www.api.facade;

import fi.tanssinetti.www.domain.artist.entity.Artist;
import fi.tanssinetti.www.domain.artist.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Hannu Lohtander on 25.9.2016.
 */
@Component
public class ArtistFacade {

    @Autowired
    ArtistService artistService;

    public Artist getArtist(Integer id) {
        return artistService.getArtist(id);
    }

}
