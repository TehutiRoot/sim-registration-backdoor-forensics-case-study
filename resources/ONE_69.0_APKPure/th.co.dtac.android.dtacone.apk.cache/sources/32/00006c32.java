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
    public static Method f34496a;

    /* renamed from: b */
    public static boolean f34497b;

    /* renamed from: c */
    public static Method f34498c;

    /* renamed from: d */
    public static boolean f34499d;

    /* renamed from: e */
    public static Field f34500e;

    /* renamed from: f */
    public static boolean f34501f;

    /* renamed from: androidx.core.widget.PopupWindowCompat$a */
    /* loaded from: classes2.dex */
    public static class C4207a {
        @DoNotInline
        /* renamed from: a */
        public static void m56429a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.PopupWindowCompat$b */
    /* loaded from: classes2.dex */
    public static class C4208b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56428a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m56427b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56426c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56425d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4208b.m56428a(popupWindow);
        }
        if (!f34501f) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f34500e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34501f = true;
        }
        Field field = f34500e;
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
            return C4208b.m56427b(popupWindow);
        }
        if (!f34499d) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", null);
                f34498c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f34499d = true;
        }
        Method method = f34498c;
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
            C4208b.m56426c(popupWindow, z);
            return;
        }
        if (!f34501f) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f34500e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34501f = true;
        }
        Field field = f34500e;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C4208b.m56425d(popupWindow, i);
            return;
        }
        if (!f34497b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f34496a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f34497b = true;
        }
        Method method = f34496a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        C4207a.m56429a(popupWindow, view, i, i2, i3);
    }
}