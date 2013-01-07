package com.mycompany.coredev.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "screen")
public class Screen implements Serializable {
    @Id
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    
    @ManyToMany(fetch=FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
     //   @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(name = "screen_section",
            joinColumns = {@JoinColumn(name="screen_id", referencedColumnName="id")},
            inverseJoinColumns = {@JoinColumn(name="section_id", referencedColumnName="id")})
    private List<Section> sections;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
