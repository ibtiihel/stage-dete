package tn.talan.example.Entity;
import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String nom;

    @ManyToOne(optional = false)
    @JoinColumn(name ="post")
    private Post post;

    public String getNom() {
        return nom;
    }

   public Post getPost() {
        return post;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Long getCatId() {
        return id;
    }

    public void setCatId(Long catId) {
        this.id = id;
    }
}
