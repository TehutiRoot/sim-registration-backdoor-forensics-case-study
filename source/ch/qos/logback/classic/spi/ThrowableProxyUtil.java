package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class ThrowableProxyUtil {
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;

    /* renamed from: a */
    public static int m51572a(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i = 0;
        if (stackTraceElementProxyArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
                i++;
                length--;
            }
        }
        return i;
    }

    public static String asString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb = new StringBuilder(2048);
        m51571b(sb, null, 1, iThrowableProxy);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m51571b(StringBuilder sb, String str, int i, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        m51568e(sb, str, i, iThrowableProxy);
        sb.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb, i, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                m51571b(sb, CoreConstants.SUPPRESSED, i + 1, iThrowableProxy2);
            }
        }
        m51571b(sb, CoreConstants.CAUSED_BY, i, iThrowableProxy.getCause());
    }

    public static void build(ThrowableProxy throwableProxy, Throwable th2, ThrowableProxy throwableProxy2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        throwableProxy.f39663e = throwableProxy2 != null ? m51572a(stackTrace, throwableProxy2.getStackTraceElementProxyArray()) : -1;
        throwableProxy.f39662d = m51570c(stackTrace);
    }

    /* renamed from: c */
    public static StackTraceElementProxy[] m51570c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new StackTraceElementProxy[0];
        }
        int length = stackTraceElementArr.length;
        StackTraceElementProxy[] stackTraceElementProxyArr = new StackTraceElementProxy[length];
        for (int i = 0; i < length; i++) {
            stackTraceElementProxyArr[i] = new StackTraceElementProxy(stackTraceElementArr[i]);
        }
        return stackTraceElementProxyArr;
    }

    /* renamed from: d */
    public static void m51569d(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
    }

    /* renamed from: e */
    public static void m51568e(StringBuilder sb, String str, int i, IThrowableProxy iThrowableProxy) {
        indent(sb, i - 1);
        if (str != null) {
            sb.append(str);
        }
        m51569d(sb, iThrowableProxy);
    }

    public static void indent(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('\t');
        }
    }

    public static void subjoinFirstLine(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb.append(CoreConstants.CAUSED_BY);
        }
        m51569d(sb, iThrowableProxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            sb.append(CoreConstants.WRAPPED_BY);
        }
        m51569d(sb, iThrowableProxy);
    }

    public static void subjoinPackagingData(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
        ClassPackagingData classPackagingData;
        if (stackTraceElementProxy == null || (classPackagingData = stackTraceElementProxy.getClassPackagingData()) == null) {
            return;
        }
        sb.append(!classPackagingData.isExact() ? " ~[" : " [");
        sb.append(classPackagingData.getCodeLocation());
        sb.append(':');
        sb.append(classPackagingData.getVersion());
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void subjoinSTEP(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
        sb.append(stackTraceElementProxy.toString());
        subjoinPackagingData(sb, stackTraceElementProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb, int i, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        for (int i2 = 0; i2 < stackTraceElementProxyArray.length - commonFrames; i2++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i2];
            indent(sb, i);
            subjoinSTEP(sb, stackTraceElementProxy);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(sb, i);
            sb.append("... ");
            sb.append(commonFrames);
            sb.append(" common frames omitted");
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void subjoinSTEPArray(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        subjoinSTEPArray(sb, 1, iThrowableProxy);
    }
}
