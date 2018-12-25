package ming.knife.enums;

/**
 * @author Ming
 *
 */
public enum MonthEnum implements EnumInterface {
    // 一月,二月,三月,四月,五月,六月,七月,八月,九月,十月,十一月,十二月
    JANUARY(1, "一月"), FEBRUARY(2, "二月"), MARCH(3, "三月"), APRIL(4, "四月"), MAY(5, "五月"), JUNE(6, "六月"), JULY(7,
            "七月"), AUGUST(8, "八月"), SEPTEMBER(9, "九月"), OCTOBER(10, "十月"), NOVEMBER(11, "十一月"), DECEMBER(12, "十二月");

    private Integer code;
    private String message;

    MonthEnum(Integer code, String message) {
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
