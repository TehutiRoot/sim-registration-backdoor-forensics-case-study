package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class CallerData {
    public static final String CALLER_DATA_NA = "?#?:?" + CoreConstants.LINE_SEPARATOR;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];
    public static final int LINE_NA = -1;

    /* renamed from: NA */
    public static final String f39639NA = "?";

    /* renamed from: a */
    public static boolean m51585a(String str, String str2, List list) {
        return str.equals(str2) || str.equals("org.apache.log4j.Category") || str.startsWith("org.slf4j.Logger") || m51584b(str, list);
    }

    /* renamed from: b */
    public static boolean m51584b(String str, List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static StackTraceElement[] extract(Throwable th2, String str, int i, List<String> list) {
        if (th2 == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int i2 = -1;
        for (int i3 = 0; i3 < stackTrace.length; i3++) {
            if (m51585a(stackTrace[i3].getClassName(), str, list)) {
                i2 = i3 + 1;
            } else if (i2 != -1) {
                break;
            }
        }
        if (i2 == -1) {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int length = stackTrace.length - i2;
        if (i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        for (int i4 = 0; i4 < i; i4++) {
            stackTraceElementArr[i4] = stackTrace[i2 + i4];
        }
        return stackTraceElementArr;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement(f39639NA, f39639NA, f39639NA, -1);
    }
}
