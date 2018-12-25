package ming.knife.enums;

/**
 * @author Ming
 *
 */
public interface EnumInterface {
    /**
     * 获取枚举中定义的键
     * 
     * @return 键
     */
    Integer getCode();

    /**
     * 获取枚举中定义的值
     * 
     * @return 值，描述
     */
    String getMessage();
}
