package ch.qos.logback.core.helpers;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ThrowableToStringArray {
    /* renamed from: a */
    public static void m51528a(List list, Throwable th2, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int m51527b = m51527b(stackTrace, stackTraceElementArr);
        list.add(m51526c(th2, stackTraceElementArr));
        for (int i = 0; i < stackTrace.length - m51527b; i++) {
            list.add("\tat " + stackTrace[i].toString());
        }
        if (m51527b != 0) {
            list.add("\t... " + m51527b + " common frames omitted");
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            m51528a(list, cause, stackTrace);
        }
    }

    /* renamed from: b */
    public static int m51527b(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i = 0;
        if (stackTraceElementArr2 == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            i++;
            length--;
        }
        return i;
    }

    /* renamed from: c */
    public static String m51526c(Throwable th2, StackTraceElement[] stackTraceElementArr) {
        String str = (stackTraceElementArr != null ? CoreConstants.CAUSED_BY : "") + th2.getClass().getName();
        if (th2.getMessage() != null) {
            return str + ": " + th2.getMessage();
        }
        return str;
    }

    public static String[] convert(Throwable th2) {
        LinkedList linkedList = new LinkedList();
        m51528a(linkedList, th2, null);
        return (String[]) linkedList.toArray(new String[0]);
    }
}