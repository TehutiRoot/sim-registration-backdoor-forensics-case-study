package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rh */
/* loaded from: classes5.dex */
public class C9712rh {
    public static String ThreeDS2ServiceInstance(Throwable th2) {
        StringBuilder sb = new StringBuilder();
        sb.append(th2);
        while (th2.getCause() != null) {
            th2 = th2.getCause();
            sb.append("; caused by: ");
            sb.append(th2);
        }
        return sb.toString();
    }

    public static String ThreeDS2ServiceInstance(Throwable th2, Class cls) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (th2 != null) {
            if (!z) {
                sb.append("; caused by: ");
            }
            sb.append(th2);
            sb.append(" at ");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append("...omitted...");
                        break;
                    }
                    sb.append(stackTraceElement);
                    sb.append("; ");
                    i++;
                }
            }
            th2 = th2.getCause();
            z = false;
        }
        return sb.toString();
    }
}