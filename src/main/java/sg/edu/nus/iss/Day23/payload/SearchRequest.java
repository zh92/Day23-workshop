package sg.edu.nus.iss.Day23.payload;

public class SearchRequest {
    
    private Integer id;

    public SearchRequest() {
    }
    
    public SearchRequest(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
