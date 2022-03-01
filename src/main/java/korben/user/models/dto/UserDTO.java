package korben.user.models.dto;

import korben.user.models.Gender;
import lombok.Data;
import java.time.LocalDate;

@Data
public class UserDTO {

    private LocalDate birth_date;
    private Gender gender;
    private String custom_gender;
    private String name;
    private String bio;
    private String city;

    public Integer getGender() {
        return gender.getValue();
    }
}
