package ch.qos.logback.core.pattern;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes.dex */
public class SpacePadder {

    /* renamed from: a */
    public static final String[] f39982a = {HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder sb, String str, int i) {
        int length = str != null ? str.length() : 0;
        if (length < i) {
            spacePad(sb, i - length);
        }
        if (str != null) {
            sb.append(str);
        }
    }

    public static final void rightPad(StringBuilder sb, String str, int i) {
        int length = str != null ? str.length() : 0;
        if (str != null) {
            sb.append(str);
        }
        if (length < i) {
            spacePad(sb, i - length);
        }
    }

    public static final void spacePad(StringBuilder sb, int i) {
        while (i >= 32) {
            sb.append(f39982a[5]);
            i -= 32;
        }
        for (int i2 = 4; i2 >= 0; i2--) {
            if (((1 << i2) & i) != 0) {
                sb.append(f39982a[i2]);
            }
        }
    }
}