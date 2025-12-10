package io.opencensus.tags;

import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class TagValue {
    public static final int MAX_LENGTH = 255;

    /* renamed from: a */
    public static boolean m30170a(String str) {
        if (str.length() <= 255 && StringUtils.isPrintableString(str)) {
            return true;
        }
        return false;
    }

    public static TagValue create(String str) {
        Utils.checkArgument(m30170a(str), "Invalid TagValue: %s", str);
        return new C10280g9(str);
    }

    public abstract String asString();
}
