package tn.talan.example.Dto;

public class CategoryDto {

    private  Long id;

    private String nom;

    private PostDto post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   public PostDto getPost() {
        return post;
    }

    public void setPost(PostDto post) {
        this.post = post;
    }
}
