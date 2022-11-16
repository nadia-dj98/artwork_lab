import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Nadia and Sara's Gallery");
    }

    @Test
    public void canGetArtworkCount(){
        //Arrange
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo Da Vinci", 375000, "nftTagMona");
        gallery.addArtwork(monaLisa);
        //Act + Assert
        assertThat(gallery.getArtworkCount()).isEqualTo(1);
    }


    @Test
    public void canAddArtwork(){
        //Arrange
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo Da Vinci", 375000, "nftTagMona");
        Artwork saturn = new Artwork("Saturn Devouring His Son", "Fransico Goya", 25000, "nftTagSaturn");
        Artwork sunFlowers = new Artwork("Sun Flowers", "Pablo Picasso", 5000, "nftTagSunFlowers");
        //Act
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(saturn);
        gallery.addArtwork(sunFlowers);
        //Assert
        assertThat(gallery.getArtworkCount()).isEqualTo(3);
    }




}
