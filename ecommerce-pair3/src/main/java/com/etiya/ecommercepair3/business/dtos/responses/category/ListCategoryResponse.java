package com.etiya.ecommercepair3.business.dtos.responses.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCategoryResponse {
    private Integer id;
    private String name;
}
