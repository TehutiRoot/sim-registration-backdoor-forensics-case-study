package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FileSize {
    public static final long GB_COEFFICIENT = 1073741824;
    public static final long KB_COEFFICIENT = 1024;
    public static final long MB_COEFFICIENT = 1048576;

    /* renamed from: b */
    public static final Pattern f40176b = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);

    /* renamed from: a */
    public final long f40177a;

    public FileSize(long j) {
        this.f40177a = j;
    }

    public static FileSize valueOf(String str) {
        long j;
        Matcher matcher = f40176b.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("String value [" + str + "] is not in the expected format.");
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        long longValue = Long.valueOf(group).longValue();
        if (group2.equalsIgnoreCase("")) {
            j = 1;
        } else if (group2.equalsIgnoreCase("kb")) {
            j = 1024;
        } else if (group2.equalsIgnoreCase("mb")) {
            j = 1048576;
        } else if (!group2.equalsIgnoreCase("gb")) {
            throw new IllegalStateException("Unexpected " + group2);
        } else {
            j = 1073741824;
        }
        return new FileSize(longValue * j);
    }

    public long getSize() {
        return this.f40177a;
    }

    public String toString() {
        long j = this.f40177a;
        long j2 = j / 1024;
        if (j2 == 0) {
            return this.f40177a + " Bytes";
        }
        long j3 = j / 1048576;
        if (j3 == 0) {
            return j2 + " KB";
        }
        long j4 = j / 1073741824;
        if (j4 == 0) {
            return j3 + " MB";
        }
        return j4 + " GB";
    }
}
