import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    private Customer customer;

    @BeforeEach

    public void setUp() {customer = new Customer("Mike", 10000);}

    @Test
    public void canGetArtwork(){
        //Arrange
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo Da Vinci", 3750, "nftTagMona");
        Artwork saturn = new Artwork("Saturn Devouring His Son", "Fransico Goya", 25000, "nftTagSaturn");
        Artwork sunFlowers = new Artwork("Sun Flowers", "Pablo Picasso", 5000, "nftTagSunFlowers");

        Gallery gallery = new Gallery("Nadia and Sara's Gallery");

        gallery.addArtwork(monaLisa);
        gallery.addArtwork(saturn);
        gallery.addArtwork(sunFlowers);

        //Act
        customer.buyArtwork(gallery, monaLisa);

        //Assert
        assertThat(customer.getWallet()).isEqualTo(6250);
        assertThat(gallery.getTill()).isEqualTo(3750);
    }

}
