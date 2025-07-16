package com.example.buysell.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Указывает, что значение id будет автоматически .
    @Column(name = "id")                            //генерироваться базой данных
    private Long id;                           // Стратегия AUTO позволяет базе данных выбрать подходящий
    @Column(name = "title")                     //способ генерации, а именно автоинкремент
    private String title;
    @Column(name = "description", columnDefinition = "text") // б.я. текстом, т.е.
    private String description;           //  колонкой без ограничений по символам
    @Column(name = "price")
    private int price;
    @Column(name = "city")
    private String city;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "product")
    private List<Image> images = new ArrayList<>();
    private Long previewImageId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private User user;
    private LocalDateTime dateOfCreated;

    @PrePersist
    private void init() {
        dateOfCreated = LocalDateTime.now();
    }

    public void addImageToProduct(Image image){
        image.setProduct(this);
        images.add(image);
    }

}
