package com.etiya.ecommercepair3.business.dtos.responses.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListAddressResponse {
    private Integer id;
    private String description;
    private Integer streetId;
    private Integer customerId;
}
