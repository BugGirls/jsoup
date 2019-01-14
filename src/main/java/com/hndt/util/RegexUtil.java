package com.hndt.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Hystar
 * @date 2019/1/7
 */
public class RegexUtil {

    /**
     * 年月日时分
     */
    public static final String TIME_EXCLUDE_MIN = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}";

    /**
     * 年月日时分秒
     */
    public static final String TIME = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";

    /**
     * 提取字符串中的时间
     *
     * @param str
     * @param regex
     * @return
     */
    public static String regexTime(String str, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }

}
