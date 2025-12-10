package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5110e {

    /* renamed from: a */
    public static Method f37941a;

    /* renamed from: b */
    public static boolean f37942b;

    /* renamed from: c */
    public static Field f37943c;

    /* renamed from: d */
    public static boolean f37944d;

    /* renamed from: a */
    public abstract void mo22732a(View view);

    /* renamed from: b */
    public final void m52534b() {
        if (!f37942b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f37941a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f37942b = true;
        }
    }

    /* renamed from: c */
    public abstract float mo22731c(View view);

    /* renamed from: d */
    public abstract void mo22730d(View view);

    /* renamed from: e */
    public abstract void mo803e(View view, Matrix matrix);

    /* renamed from: f */
    public void mo429f(View view, int i, int i2, int i3, int i4) {
        m52534b();
        Method method = f37941a;
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
    public abstract void mo22729g(View view, float f);

    /* renamed from: h */
    public void mo52533h(View view, int i) {
        if (!f37944d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f37943c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f37944d = true;
        }
        Field field = f37943c;
        if (field != null) {
            try {
                f37943c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public abstract void mo802i(View view, Matrix matrix);

    /* renamed from: j */
    public abstract void mo801j(View view, Matrix matrix);
}