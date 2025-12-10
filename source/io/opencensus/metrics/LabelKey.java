package io.opencensus.metrics;

import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class LabelKey {
    public static LabelKey create(String str, String str2) {
        return new C17174z8(str, str2);
    }

    public abstract String getDescription();

    public abstract String getKey();
}
