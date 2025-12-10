package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public final class zzje implements Serializable {
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Pattern zzair = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private final long value;
    private final boolean zzais;
    private final int zzait;

    public zzje(long j) {
        this(false, 0L, null);
    }

    private static void zza(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public static zzje zzap(String str) throws NumberFormatException {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        int i5;
        String str2;
        String str3;
        Matcher matcher = zzair.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Invalid date/time format: ".concat(valueOf);
            } else {
                str3 = new String("Invalid date/time format: ");
            }
            throw new NumberFormatException(str3);
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            z = true;
        } else {
            z = false;
        }
        String group = matcher.group(9);
        if (group != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !z) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(valueOf2);
            } else {
                str2 = new String("Invalid date/time format, cannot specify time zone shift without specifying time: ");
            }
            throw new NumberFormatException(str2);
        }
        if (z) {
            int parseInt4 = Integer.parseInt(matcher.group(5));
            int parseInt5 = Integer.parseInt(matcher.group(6));
            int parseInt6 = Integer.parseInt(matcher.group(7));
            if (matcher.group(8) != null) {
                z3 = z;
                i = (int) (Integer.parseInt(matcher.group(8).substring(1)) / Math.pow(10.0d, matcher.group(8).substring(1).length() - 3));
                i3 = parseInt5;
                i4 = parseInt6;
            } else {
                z3 = z;
                i3 = parseInt5;
                i4 = parseInt6;
                i = 0;
            }
            i2 = parseInt4;
        } else {
            z3 = z;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.set(parseInt, parseInt2, parseInt3, i2, i3, i4);
        gregorianCalendar.set(14, i);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (z3 && z2) {
            if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                i5 = 0;
            } else {
                int parseInt7 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                if (matcher.group(10).charAt(0) == '-') {
                    i5 = -parseInt7;
                } else {
                    i5 = parseInt7;
                }
                timeInMillis -= i5 * 60000;
            }
            num = Integer.valueOf(i5);
        } else {
            num = null;
        }
        return new zzje(true ^ z3, timeInMillis, num);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzje)) {
            return false;
        }
        zzje zzjeVar = (zzje) obj;
        if (this.zzais == zzjeVar.zzais && this.value == zzjeVar.value && this.zzait == zzjeVar.zzait) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j;
        long j2 = this.value;
        if (this.zzais) {
            j = 1;
        } else {
            j = 0;
        }
        return Arrays.hashCode(new long[]{j2, j, this.zzait});
    }

    public final String toString() {
        return zzij();
    }

    public final String zzij() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.setTimeInMillis(this.value + (this.zzait * 60000));
        zza(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        zza(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        zza(sb, gregorianCalendar.get(5), 2);
        if (!this.zzais) {
            sb.append('T');
            zza(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            zza(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            zza(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                zza(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.zzait;
            if (i == 0) {
                sb.append(Matrix.MATRIX_TYPE_ZERO);
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                zza(sb, i / 60, 2);
                sb.append(':');
                zza(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    private zzje(boolean z, long j, Integer num) {
        int offset;
        this.zzais = z;
        this.value = j;
        if (z) {
            offset = 0;
        } else {
            offset = num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        }
        this.zzait = offset;
    }
}
