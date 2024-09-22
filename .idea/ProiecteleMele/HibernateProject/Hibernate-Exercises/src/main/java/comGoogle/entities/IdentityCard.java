package comGoogle.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "identityCards")
public class IdentityCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String series;

    @Temporal(TemporalType.DATE)
    private Date issueDate;

    @Temporal(TemporalType.DATE)
    private Date expiryDate;

    private String issuedBy;

    public int getId() {
        return id;
    }

    public IdentityCard setId(int id) {
        this.id = id;
        return this;
    }

    public String getSeries() {
        return series;
    }

    public IdentityCard setSeries(String series) {
        this.series = series;
        return this;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public IdentityCard setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public IdentityCard setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public IdentityCard setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }
}
