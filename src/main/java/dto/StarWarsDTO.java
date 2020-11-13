
package dto;

public class StarWarsDTO {
    
        
    private String value;
    
    
    public StarWarsDTO (String value){
    this.value = getValue();
    
    }

    public StarWarsDTO() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    }


