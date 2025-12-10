package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;
import org.joda.time.DateTimeConstants;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class TimeUtils {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;

    /* renamed from: a */
    public static final Object f34125a = new Object();

    /* renamed from: b */
    public static char[] f34126b = new char[24];

    /* renamed from: a */
    public static int m57055a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m57054b(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        int i11;
        long j2 = j;
        if (f34126b.length < i) {
            f34126b = new char[i];
        }
        char[] cArr = f34126b;
        int i12 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i12 == 0) {
            int i13 = i - 1;
            while (i13 > 0) {
                cArr[0] = TokenParser.f74560SP;
            }
            cArr[0] = '0';
            return 1;
        }
        if (i12 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i14 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / DateTimeConstants.SECONDS_PER_DAY;
            floor -= DateTimeConstants.SECONDS_PER_DAY * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / DateTimeConstants.SECONDS_PER_HOUR;
            floor -= i3 * DateTimeConstants.SECONDS_PER_HOUR;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i4 = floor - (i15 * 60);
            i5 = i15;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int m57055a = m57055a(i2, 1, false, 0);
            if (m57055a > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int m57055a2 = m57055a + m57055a(i3, 1, z5, 2);
            if (m57055a2 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int m57055a3 = m57055a2 + m57055a(i5, 1, z6, 2);
            if (m57055a3 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int m57055a4 = m57055a3 + m57055a(i4, 1, z7, 2);
            if (m57055a4 > 0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            i6 = 0;
            for (int m57055a5 = m57055a4 + m57055a(i14, 2, true, i11) + 1; m57055a5 < i; m57055a5++) {
                cArr[i6] = TokenParser.f74560SP;
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i16 = i6 + 1;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int m57053c = m57053c(cArr, i2, 'd', i16, false, 0);
        if (m57053c != i16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int m57053c2 = m57053c(cArr, i3, 'h', m57053c, z2, i7);
        if (m57053c2 != i16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int m57053c3 = m57053c(cArr, i5, 'm', m57053c2, z3, i8);
        if (m57053c3 != i16) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int m57053c4 = m57053c(cArr, i4, 's', m57053c3, z4, i9);
        if (z && m57053c4 != i16) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        int m57053c5 = m57053c(cArr, i14, 'm', m57053c4, true, i10);
        cArr[m57053c5] = 's';
        return m57053c5 + 1;
    }

    /* renamed from: c */
    public static int m57053c(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((z && i3 >= 3) || i > 99) {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            } else {
                i4 = i2;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            cArr[i4 + 1] = c;
            return i4 + 2;
        }
        return i2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, StringBuilder sb) {
        synchronized (f34125a) {
            sb.append(f34126b, 0, m57054b(j, 0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        synchronized (f34125a) {
            printWriter.print(new String(f34126b, 0, m57054b(j, i)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }
}
