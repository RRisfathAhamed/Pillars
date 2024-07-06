package com.mora.jobrecommendationapp.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginJobProviderRequestDTO {
    private String userName;
    private String password;
}
