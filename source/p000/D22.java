package p000;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: D22 */
/* loaded from: classes2.dex */
public abstract class D22 {

    /* renamed from: a */
    public static boolean f898a = true;

    /* renamed from: b */
    public static Method f899b;

    /* renamed from: c */
    public static boolean f900c;

    /* renamed from: a */
    public static int m68698a(ViewGroup viewGroup, int i) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i);
            return childDrawingOrder;
        }
        if (!f900c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f899b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f900c = true;
        }
        Method method = f899b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static A22 m68697b(ViewGroup viewGroup) {
        return new C23239z22(viewGroup);
    }

    /* renamed from: c */
    public static void m68696c(ViewGroup viewGroup, boolean z) {
        if (f898a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f898a = false;
            }
        }
    }

    /* renamed from: d */
    public static void m68695d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m68696c(viewGroup, z);
        }
    }
}
