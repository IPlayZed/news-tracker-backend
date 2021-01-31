package hu.iplayzed.news_tracker.models;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

@Entity
@Table
@Configurable
public class TopHeadlinesReply {
    @Id
    @Column(unique = true)
    private UUID requestUUID;
    @NotNull
    @Column
    private String statusCode;
    @NotNull
    @Column
    private int totalResults;
    @ElementCollection
    @Column
    private Set<Article> articles = new TreeSet<>();

    public TopHeadlinesReply(UUID requestUUID, String statusCode, int totalResults, Set<Article> articles) {
        this.requestUUID = requestUUID;
        this.statusCode = statusCode;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public TopHeadlinesReply() {

    }

    public UUID getRequestUUID() {
        return requestUUID;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
