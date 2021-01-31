package hu.iplayzed.news_tracker.models;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

@Entity
@Table
@Configurable
public class TopHeadlines {
    @Id
    private UUID requestUUID;
    @NotNull
    private String statusCode;
    @NotNull
    private int totalResults;
    @ElementCollection
    private Set<Article> articles = new TreeSet<>();

    public TopHeadlines(UUID requestUUID, String statusCode, int totalResults, Set<Article> articles) {
        this.requestUUID = requestUUID;
        this.statusCode = statusCode;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public TopHeadlines() {

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
