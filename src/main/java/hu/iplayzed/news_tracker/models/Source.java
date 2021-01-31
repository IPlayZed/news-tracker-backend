package hu.iplayzed.news_tracker.models;

import javax.persistence.Embeddable;

@Embeddable
public class Source {
    private String id;
    private String name;

    public Source(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Source() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
