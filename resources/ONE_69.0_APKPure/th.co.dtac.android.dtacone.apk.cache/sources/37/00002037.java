package androidx.camera.core.resolutionselector;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AspectRatioStrategy {
    public static final int FALLBACK_RULE_AUTO = 1;
    public static final int FALLBACK_RULE_NONE = 0;

    /* renamed from: a */
    public final int f11547a;

    /* renamed from: b */
    public final int f11548b;
    @NonNull
    public static final AspectRatioStrategy RATIO_4_3_FALLBACK_AUTO_STRATEGY = new AspectRatioStrategy(0, 1);
    @NonNull
    public static final AspectRatioStrategy RATIO_16_9_FALLBACK_AUTO_STRATEGY = new AspectRatioStrategy(1, 1);

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface AspectRatioFallbackRule {
    }

    public AspectRatioStrategy(int i, int i2) {
        this.f11547a = i;
        this.f11548b = i2;
    }

    public int getFallbackRule() {
        return this.f11548b;
    }

    public int getPreferredAspectRatio() {
        return this.f11547a;
    }
}