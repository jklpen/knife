package ming.knife.enums;

/**
 * @author Ming
 *
 */
public enum GenderEnum implements EnumInterface {
    // 男,女
    MALE(0, "男"), FEMALE(1, "女");

    private Integer code;
    private String message;

    GenderEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
