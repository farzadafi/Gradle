package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String firstName;
    private String userName;
    private String password;
}
