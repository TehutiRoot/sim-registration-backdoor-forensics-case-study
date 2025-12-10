package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class DrawableUtils {

    /* renamed from: a */
    public static final int[] f9672a = {16842912};

    /* renamed from: b */
    public static final int[] f9673b = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    /* renamed from: androidx.appcompat.widget.DrawableUtils$a */
    /* loaded from: classes.dex */
    public static class C2199a {

        /* renamed from: a */
        public static final boolean f9674a;

        /* renamed from: b */
        public static final Method f9675b;

        /* renamed from: c */
        public static final Field f9676c;

        /* renamed from: d */
        public static final Field f9677d;

        /* renamed from: e */
        public static final Field f9678e;

        /* renamed from: f */
        public static final Field f9679f;

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L4a java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L52
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L4a java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L52
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3e java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L46
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3b
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L31
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2f
                r8 = 1
                goto L58
            L2f:
                goto L56
            L31:
                r7 = r1
                goto L56
            L34:
                r6 = r1
            L36:
                r7 = r6
                goto L56
            L38:
                r6 = r1
                goto L36
            L3b:
                r6 = r1
                goto L36
            L3e:
                r5 = r1
            L40:
                r6 = r5
                goto L36
            L42:
                r5 = r1
            L44:
                r6 = r5
                goto L36
            L46:
                r5 = r1
            L48:
                r6 = r5
                goto L36
            L4a:
                r4 = r1
                r5 = r4
                goto L40
            L4e:
                r4 = r1
                r5 = r4
                goto L44
            L52:
                r4 = r1
                r5 = r4
                goto L48
            L56:
                r3 = r1
                r8 = 0
            L58:
                if (r8 == 0) goto L67
                androidx.appcompat.widget.DrawableUtils.C2199a.f9675b = r4
                androidx.appcompat.widget.DrawableUtils.C2199a.f9676c = r5
                androidx.appcompat.widget.DrawableUtils.C2199a.f9677d = r6
                androidx.appcompat.widget.DrawableUtils.C2199a.f9678e = r7
                androidx.appcompat.widget.DrawableUtils.C2199a.f9679f = r3
                androidx.appcompat.widget.DrawableUtils.C2199a.f9674a = r0
                goto L73
            L67:
                androidx.appcompat.widget.DrawableUtils.C2199a.f9675b = r1
                androidx.appcompat.widget.DrawableUtils.C2199a.f9676c = r1
                androidx.appcompat.widget.DrawableUtils.C2199a.f9677d = r1
                androidx.appcompat.widget.DrawableUtils.C2199a.f9678e = r1
                androidx.appcompat.widget.DrawableUtils.C2199a.f9679f = r1
                androidx.appcompat.widget.DrawableUtils.C2199a.f9674a = r2
            L73:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.C2199a.<clinit>():void");
        }

        /* renamed from: a */
        public static Rect m64295a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f9674a) {
                try {
                    Object invoke = f9675b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f9676c.getInt(invoke), f9677d.getInt(invoke), f9678e.getInt(invoke), f9679f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.INSETS_NONE;
        }
    }

    /* renamed from: androidx.appcompat.widget.DrawableUtils$b */
    /* loaded from: classes.dex */
    public static class C2200b {
        @DoNotInline
        /* renamed from: a */
        public static Insets m64294a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static void m64297a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            m64296b(drawable);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m64296b(drawable);
        }
    }

    /* renamed from: b */
    public static void m64296b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f9673b);
        } else {
            drawable.setState(f9672a);
        }
        drawable.setState(state);
    }

    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        return true;
    }

    @NonNull
    public static Rect getOpticalBounds(@NonNull Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets m64294a = C2200b.m64294a(drawable);
            i = m64294a.left;
            i2 = m64294a.top;
            i3 = m64294a.right;
            i4 = m64294a.bottom;
            return new Rect(i, i2, i3, i4);
        }
        return C2199a.m64295a(DrawableCompat.unwrap(drawable));
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
