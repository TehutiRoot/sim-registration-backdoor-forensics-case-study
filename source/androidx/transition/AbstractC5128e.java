package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5128e {

    /* renamed from: a */
    public static Method f37853a;

    /* renamed from: b */
    public static boolean f37854b;

    /* renamed from: c */
    public static Field f37855c;

    /* renamed from: d */
    public static boolean f37856d;

    /* renamed from: a */
    public abstract void mo931a(View view);

    /* renamed from: b */
    public final void m52583b() {
        if (!f37854b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f37853a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f37854b = true;
        }
    }

    /* renamed from: c */
    public abstract float mo930c(View view);

    /* renamed from: d */
    public abstract void mo929d(View view);

    /* renamed from: e */
    public abstract void mo140e(View view, Matrix matrix);

    /* renamed from: f */
    public void mo52582f(View view, int i, int i2, int i3, int i4) {
        m52583b();
        Method method = f37853a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: g */
    public abstract void mo928g(View view, float f);

    /* renamed from: h */
    public void mo52581h(View view, int i) {
        if (!f37856d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f37855c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f37856d = true;
        }
        Field field = f37855c;
        if (field != null) {
            try {
                f37855c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public abstract void mo139i(View view, Matrix matrix);

    /* renamed from: j */
    public abstract void mo138j(View view, Matrix matrix);
}
