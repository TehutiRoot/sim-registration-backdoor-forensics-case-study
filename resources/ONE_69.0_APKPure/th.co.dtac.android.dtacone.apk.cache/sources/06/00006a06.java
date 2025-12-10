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
import androidx.core.graphics.AbstractC3980a;

/* loaded from: classes2.dex */
public class BlendModeColorFilterCompat {

    /* renamed from: androidx.core.graphics.BlendModeColorFilterCompat$a */
    /* loaded from: classes2.dex */
    public static class C3972a {
        @DoNotInline
        /* renamed from: a */
        public static ColorFilter m57330a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    @Nullable
    public static ColorFilter createBlendModeColorFilterCompat(int i, @NonNull BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object m57288a = AbstractC3980a.C3982b.m57288a(blendModeCompat);
            if (m57288a == null) {
                return null;
            }
            return C3972a.m57330a(i, m57288a);
        }
        PorterDuff.Mode m57289a = AbstractC3980a.m57289a(blendModeCompat);
        if (m57289a == null) {
            return null;
        }
        return new PorterDuffColorFilter(i, m57289a);
    }
}