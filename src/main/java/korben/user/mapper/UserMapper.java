package korben.user.mapper;

import korben.user.models.User;
import korben.user.models.dto.UserDTO;
public class UserMapper {
    
    public UserDTO toDTO(User document) {
        UserDTO dto = new UserDTO();

        dto.setBirth_date(document.getBirth_date());
        dto.setGender(document.getGender());
        dto.setCustom_gender(document.getCustom_gender());
        dto.setName(document.getName());
        dto.setBio(document.getBio());
        dto.setCity(document.getCity());

        return dto;
    }
}
