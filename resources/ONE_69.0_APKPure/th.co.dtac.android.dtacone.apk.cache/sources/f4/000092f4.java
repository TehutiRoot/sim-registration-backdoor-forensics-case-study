package com.google.android.gms.internal.location;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zzbo {

    /* renamed from: a */
    public static final SimpleDateFormat f46188a;

    /* renamed from: b */
    public static final SimpleDateFormat f46189b;

    /* renamed from: c */
    public static final StringBuilder f46190c;

    static {
        Locale locale = Locale.ROOT;
        f46188a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f46189b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f46190c = new StringBuilder(33);
    }

    public static void zza(long j, StringBuilder sb) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (i < 0) {
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            sb.append(j / CoreConstants.MILLIS_IN_ONE_HOUR);
            sb.append(OperatorName.CLOSE_PATH);
            j %= CoreConstants.MILLIS_IN_ONE_HOUR;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append(OperatorName.MOVE_TO);
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(OperatorName.CLOSE_AND_STROKE);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}