import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Description:
 * date: 2021/12/21 14:04
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    String name;
    String email;
    String password;
}
