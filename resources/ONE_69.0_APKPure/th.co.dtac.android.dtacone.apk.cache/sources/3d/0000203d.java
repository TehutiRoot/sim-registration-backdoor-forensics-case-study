package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ResolutionStrategy {
    public static final int FALLBACK_RULE_CLOSEST_HIGHER = 2;
    public static final int FALLBACK_RULE_CLOSEST_HIGHER_THEN_LOWER = 1;
    public static final int FALLBACK_RULE_CLOSEST_LOWER = 4;
    public static final int FALLBACK_RULE_CLOSEST_LOWER_THEN_HIGHER = 3;
    public static final int FALLBACK_RULE_NONE = 0;
    @NonNull
    public static final ResolutionStrategy HIGHEST_AVAILABLE_STRATEGY = new ResolutionStrategy();

    /* renamed from: a */
    public Size f11557a;

    /* renamed from: b */
    public int f11558b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface ResolutionFallbackRule {
    }

    public ResolutionStrategy() {
        this.f11557a = null;
        this.f11558b = 0;
    }

    @Nullable
    public Size getBoundSize() {
        return this.f11557a;
    }

    public int getFallbackRule() {
        return this.f11558b;
    }

    public ResolutionStrategy(@NonNull Size size, int i) {
        this.f11557a = size;
        this.f11558b = i;
    }
}