package com.jspider.project.bms;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="movie_meta")
public class MovieMeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Mid;
    @Column(name="genere",nullable = false,length = 60)
    private String genere;
    @Column(name="formate",nullable = false,length = 40)
    private String formate;
    @Column(name="rating",nullable = false)
    private float rating;
    @Column(name="release_date")
    private LocalDate releaseDate;

    public Long getMid() {
        return Mid;
    }

    public void setMid(Long mid) {
        Mid = mid;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getFormate() {
        return formate;
    }

    public void setFormate(String formate) {
        this.formate = formate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "MovieMeta{" +
                "Mid=" + Mid +
                ", genere='" + genere + '\'' +
                ", formate='" + formate + '\'' +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
