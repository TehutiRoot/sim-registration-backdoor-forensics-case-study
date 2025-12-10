package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class PathInterpolatorCompat {

    /* renamed from: androidx.core.view.animation.PathInterpolatorCompat$a */
    /* loaded from: classes2.dex */
    public static class C4201a {
        @DoNotInline
        /* renamed from: a */
        public static PathInterpolator m56590a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @DoNotInline
        /* renamed from: b */
        public static PathInterpolator m56589b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @DoNotInline
        /* renamed from: c */
        public static PathInterpolator m56588c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return C4201a.m56588c(path);
    }

    @NonNull
    public static Interpolator create(float f, float f2) {
        return C4201a.m56590a(f, f2);
    }

    @NonNull
    public static Interpolator create(float f, float f2, float f3, float f4) {
        return C4201a.m56589b(f, f2, f3, f4);
    }
}
