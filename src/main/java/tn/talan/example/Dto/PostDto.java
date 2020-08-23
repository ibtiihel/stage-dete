package tn.talan.example.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PostDto  {
    private Long postId;

    private String title;


    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateAjout;

    private String localisation;

    private double prix;

    private int nbreLike;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbreLike() {
        return nbreLike;
    }

    public void setNbreLike(int nbreLike) {
        this.nbreLike = nbreLike;
    }
}
