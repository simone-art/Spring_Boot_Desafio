package com.example.springBootDesafio.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native",strategy="native")
    private Long id;

    @Column
    private String content;

    @Column
    private int words;

    @Column
    private int characters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public int getCharacters() {
        return characters;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content1 = (Content) o;
        return words == content1.words && characters == content1.characters && Objects.equals(id, content1.id) && Objects.equals(content, content1.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, words, characters);
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", words=" + words +
                ", characters=" + characters +
                '}';
    }
}
