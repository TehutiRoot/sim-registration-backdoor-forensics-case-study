package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class DrawableCompat {

    /* renamed from: a */
    public static Method f33952a;

    /* renamed from: b */
    public static boolean f33953b;

    /* renamed from: c */
    public static Method f33954c;

    /* renamed from: d */
    public static boolean f33955d;

    /* renamed from: androidx.core.graphics.drawable.DrawableCompat$a */
    /* loaded from: classes2.dex */
    public static class C3983a {
        @DoNotInline
        /* renamed from: a */
        public static int m57287a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m57286b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static Drawable m57285c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m57284d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m57283e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.DrawableCompat$b */
    /* loaded from: classes2.dex */
    public static class C3984b {
        @DoNotInline
        /* renamed from: a */
        public static void m57282a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57281b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        /* renamed from: c */
        public static ColorFilter m57280c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57279d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m57278e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m57277f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m57276g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m57275h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m57274i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.DrawableCompat$c */
    /* loaded from: classes2.dex */
    public static class C3985c {
        @DoNotInline
        /* renamed from: a */
        public static int m57273a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57272b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        C3984b.m57282a(drawable, theme);
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        return C3984b.m57281b(drawable);
    }

    public static void clearColorFilter(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            clearColorFilter(C3983a.m57285c((InsetDrawable) drawable));
        } else if (drawable instanceof WrappedDrawable) {
            clearColorFilter(((WrappedDrawable) drawable).getWrappedDrawable());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable m57286b = C3983a.m57286b(drawableContainerState, i);
                if (m57286b != null) {
                    clearColorFilter(m57286b);
                }
            }
        }
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        return C3983a.m57287a(drawable);
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        return C3984b.m57280c(drawable);
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3985c.m57273a(drawable);
        }
        if (!f33955d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f33954c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f33955d = true;
        }
        Method method = f33954c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception unused2) {
                f33954c = null;
                return 0;
            }
        }
        return 0;
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        C3984b.m57279d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        return C3983a.m57284d(drawable);
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z) {
        C3983a.m57283e(drawable, z);
    }

    public static void setHotspot(@NonNull Drawable drawable, float f, float f2) {
        C3984b.m57278e(drawable, f, f2);
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        C3984b.m57277f(drawable, i, i2, i3, i4);
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3985c.m57272b(drawable, i);
        }
        if (!f33953b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f33952a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f33953b = true;
        }
        Method method = f33952a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f33952a = null;
            }
        }
        return false;
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i) {
        C3984b.m57276g(drawable, i);
    }

    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        C3984b.m57275h(drawable, colorStateList);
    }

    public static void setTintMode(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        C3984b.m57274i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        if (drawable instanceof WrappedDrawable) {
            return (T) ((WrappedDrawable) drawable).getWrappedDrawable();
        }
        return drawable;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof TintAwareDrawable)) {
            return new C22633v72(drawable);
        }
        return drawable;
    }
}