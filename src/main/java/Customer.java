import java.util.ArrayList;

public class Customer {

    //properties

    private String name;
    private int wallet;
    

    //constructor

    public Customer (String name, int wallet) {
        this.name = name;
        this.wallet = wallet;

    }

    //Getters & Setter

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet(){
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    //Methods

    public void buyArtwork(Gallery gallery, Artwork artwork) {

        ArrayList<Artwork> stock = gallery.getStock();

            for (Artwork i : stock) {
                if (i.getTitle().equals(artwork.getTitle())){
                    wallet -= i.getPrice();
                    int till = gallery.getTill();
                    till += artwork.getPrice();
                    gallery.setTill(till);

                }

            }

    }



}
