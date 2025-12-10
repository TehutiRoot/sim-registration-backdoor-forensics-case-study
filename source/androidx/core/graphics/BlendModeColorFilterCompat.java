package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.AbstractC3998a;

/* loaded from: classes2.dex */
public class BlendModeColorFilterCompat {

    /* renamed from: androidx.core.graphics.BlendModeColorFilterCompat$a */
    /* loaded from: classes2.dex */
    public static class C3990a {
        @DoNotInline
        /* renamed from: a */
        public static ColorFilter m57380a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    @Nullable
    public static ColorFilter createBlendModeColorFilterCompat(int i, @NonNull BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object m57338a = AbstractC3998a.C4000b.m57338a(blendModeCompat);
            if (m57338a == null) {
                return null;
            }
            return C3990a.m57380a(i, m57338a);
        }
        PorterDuff.Mode m57339a = AbstractC3998a.m57339a(blendModeCompat);
        if (m57339a == null) {
            return null;
        }
        return new PorterDuffColorFilter(i, m57339a);
    }
}
