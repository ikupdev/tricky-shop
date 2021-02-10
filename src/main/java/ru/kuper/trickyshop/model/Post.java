package ru.kuper.trickyshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Post {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
