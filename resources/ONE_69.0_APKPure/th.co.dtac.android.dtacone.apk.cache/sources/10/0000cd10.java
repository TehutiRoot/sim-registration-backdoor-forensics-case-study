package io.opencensus.tags;

import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class TagKey {
    public static final int MAX_LENGTH = 255;

    /* renamed from: a */
    public static boolean m30511a(String str) {
        if (!str.isEmpty() && str.length() <= 255 && StringUtils.isPrintableString(str)) {
            return true;
        }
        return false;
    }

    public static TagKey create(String str) {
        Utils.checkArgument(m30511a(str), "Invalid TagKey name: %s", str);
        return new C10201f9(str);
    }

    public abstract String getName();
}