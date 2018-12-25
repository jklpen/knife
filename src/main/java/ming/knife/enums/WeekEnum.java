package ming.knife.enums;

/**
 * @author Ming
 *
 */
public enum WeekEnum implements EnumInterface {
    // 周一,周二,周三，周四，周五，周六，周日
    MONDAY(1, "周一"), TUESDAY(2, "周二"), WEDNESDAY(3, "周三"), THURSDAY(4, "周四"), FRIDAY(5, "周五"), SATURDAY(6,
            "周六"), SUNDAY(7, "周日");

    private Integer code;
    private String message;

    WeekEnum(Integer code, String message) {
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
