package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class PopupWindowCompat {

    /* renamed from: a */
    public static Method f34408a;

    /* renamed from: b */
    public static boolean f34409b;

    /* renamed from: c */
    public static Method f34410c;

    /* renamed from: d */
    public static boolean f34411d;

    /* renamed from: e */
    public static Field f34412e;

    /* renamed from: f */
    public static boolean f34413f;

    /* renamed from: androidx.core.widget.PopupWindowCompat$a */
    /* loaded from: classes2.dex */
    public static class C4225a {
        @DoNotInline
        /* renamed from: a */
        public static void m56479a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.PopupWindowCompat$b */
    /* loaded from: classes2.dex */
    public static class C4226b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56478a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m56477b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56476c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56475d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4226b.m56478a(popupWindow);
        }
        if (!f34413f) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f34412e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34413f = true;
        }
        Field field = f34412e;
        if (field != null) {
            try {
                return ((Boolean) field.get(popupWindow)).booleanValue();
            } catch (IllegalAccessException unused2) {
                return false;
            }
        }
        return false;
    }

    public static int getWindowLayoutType(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4226b.m56477b(popupWindow);
        }
        if (!f34411d) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", null);
                f34410c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f34411d = true;
        }
        Method method = f34410c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, null)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void setOverlapAnchor(@NonNull PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C4226b.m56476c(popupWindow, z);
            return;
        }
        if (!f34413f) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f34412e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34413f = true;
        }
        Field field = f34412e;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C4226b.m56475d(popupWindow, i);
            return;
        }
        if (!f34409b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f34408a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f34409b = true;
        }
        Method method = f34408a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        C4225a.m56479a(popupWindow, view, i, i2, i3);
    }
}
