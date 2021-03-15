/* 
6250110001  Kampee Kantangkun
6250110002  Natthakarn khunsaman
6250110004  Norapich Pongsuwan
6250110005  Panathanan Patcharaprasertsuk
6250110009  Ratchanon  Songmeuang  
*/

public class Coffee extends Product {
    private String type;

    public Coffee (String productName, String type, double productPrice, int productAmount) {
        super(productName, productPrice, productAmount);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
