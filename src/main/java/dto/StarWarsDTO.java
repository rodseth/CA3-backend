
package dto;

public class StarWarsDTO {
    
        
    private String starWarsQuote;
    private String starWarsRef;
    
    
    public StarWarsDTO (String starWarsQuote, String starWarsRef){
    this.starWarsQuote = getStarWarsQuote();
    this.starWarsRef = "http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote";
    
    }

    public StarWarsDTO() {
    }

    public String getStarWarsQuote() {
        return starWarsQuote;
    }

    public void setStarWarsQuote(String starWarsQuote) {
        this.starWarsQuote = starWarsQuote;
    }
    
    }


