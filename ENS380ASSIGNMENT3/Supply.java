package ENS380ASSIGNMENT3;
import java.util.regex.*;

public class Supply{
    private String type;
    private int quantity;

    public Supply(String type, int quantity){
        this.type = type;
        this.quantity = quantity;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    public String getType() {
        return type;
    }
}

