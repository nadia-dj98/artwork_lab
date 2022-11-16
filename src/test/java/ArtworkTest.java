import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtworkTest {

    Artwork starryNight; //creating artwork object to test

    @BeforeEach
    public void setUp() {
        starryNight = new Artwork("Starry Night", "Van Gogh", 1000, "nftTag1");
    }

    @Test
    public void hasTitle(){
        String title = starryNight.getTitle();
        assertThat(title).isEqualTo("Starry Night");
    }

    @Test
    public void hasArtist(){
        String artist = starryNight.getArtist();
        assertThat(artist).isEqualTo("Van Gogh");
    }

    @Test
    public void hasPrice(){
        int price = starryNight.getPrice();
        assertThat(price).isEqualTo(1000);
    }

    @Test
    public void hasNft(){
        String nft = starryNight.getNft();
        assertThat(nft).isEqualTo("nftTag1");
    }

    @Test

    public void canSetTitle() {
        starryNight.setTitle("The Scream");
        assertThat(starryNight.getTitle()).isEqualTo("The Scream");
    }

    public void canSetPrice() {
        starryNight.setPrice(50000);
        assertThat(starryNight.getPrice()).isEqualTo(50000);
    }

}