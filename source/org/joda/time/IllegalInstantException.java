package org.joda.time;

import org.joda.time.format.DateTimeFormat;

/* loaded from: classes5.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j, String str) {
        String str2;
        String print = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j));
        if (str != null) {
            str2 = " (" + str + ")";
        } else {
            str2 = "";
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + print + str2;
    }

    public static boolean isIllegalInstant(Throwable th2) {
        if (th2 instanceof IllegalInstantException) {
            return true;
        }
        if (th2.getCause() != null && th2.getCause() != th2) {
            return isIllegalInstant(th2.getCause());
        }
        return false;
    }

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }
}
