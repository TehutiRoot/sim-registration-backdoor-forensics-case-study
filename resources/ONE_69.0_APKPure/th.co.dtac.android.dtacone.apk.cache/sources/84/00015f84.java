package p000;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: vl */
/* loaded from: classes2.dex */
public abstract class AbstractC16929vl {

    /* renamed from: a */
    public static Method f108204a;

    /* renamed from: b */
    public static Method f108205b;

    /* renamed from: c */
    public static boolean f108206c;

    /* renamed from: a */
    public static void m853a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i != 28) {
            if (!f108206c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f108204a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                    f108205b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f108206c = true;
            }
            if (z) {
                try {
                    Method method2 = f108204a;
                    if (method2 != null) {
                        method2.invoke(canvas, null);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            if (!z && (method = f108205b) != null) {
                method.invoke(canvas, null);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}