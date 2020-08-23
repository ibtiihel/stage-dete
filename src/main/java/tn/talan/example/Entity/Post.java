package tn.talan.example.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;


    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateAjout;

    private String localisation;

    private double prix;

    private int nbreLike;



    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Category> category;



    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setNbreLike(int nbreLike) {
        this.nbreLike = nbreLike;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public String getLocalisation() {
        return localisation;
    }

    public double getPrix() {
        return prix;
    }

    public int getNbreLike() {
        return nbreLike;
    }

    public List<Category> getCategory() {
        return category;
    }




}
