package io.opencensus.tags;

import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class TagValue {
    public static final int MAX_LENGTH = 255;

    /* renamed from: a */
    public static boolean m30510a(String str) {
        if (str.length() <= 255 && StringUtils.isPrintableString(str)) {
            return true;
        }
        return false;
    }

    public static TagValue create(String str) {
        Utils.checkArgument(m30510a(str), "Invalid TagValue: %s", str);
        return new C10272g9(str);
    }

    public abstract String asString();
}