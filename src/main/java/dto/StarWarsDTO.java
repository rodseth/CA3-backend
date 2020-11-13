
package dto;

public class StarWarsDTO {
    
        
    private String value;
    private String starWarsRef;
    
    public StarWarsDTO (String value, String starWarsRef){
    this.value = getValue();
    this.starWarsRef = "http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote";
    }

    public StarWarsDTO() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStarWarsRef() {
        return starWarsRef;
    }

    public void setStarWarsRef(String starWarsRef) {
        this.starWarsRef = starWarsRef;
    }
    



    
}

