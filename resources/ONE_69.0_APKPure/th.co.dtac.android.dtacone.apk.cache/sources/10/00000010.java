package p000;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: A32 */
/* loaded from: classes2.dex */
public abstract class A32 {

    /* renamed from: a */
    public static boolean f15a = true;

    /* renamed from: b */
    public static Method f16b;

    /* renamed from: c */
    public static boolean f17c;

    /* renamed from: a */
    public static int m69331a(ViewGroup viewGroup, int i) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i);
            return childDrawingOrder;
        }
        if (!f17c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f16b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f17c = true;
        }
        Method method = f16b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static InterfaceC22967x32 m69330b(ViewGroup viewGroup) {
        return new C22794w32(viewGroup);
    }

    /* renamed from: c */
    public static void m69329c(ViewGroup viewGroup, boolean z) {
        if (f15a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f15a = false;
            }
        }
    }

    /* renamed from: d */
    public static void m69328d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m69329c(viewGroup, z);
        }
    }
}