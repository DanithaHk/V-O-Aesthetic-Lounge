package lk.ijse.voaestheticlounge.service;

import lk.ijse.voaestheticlounge.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
    void deleteUser(Long id);
    void updateUserRole(Long id, String newRole);
}
