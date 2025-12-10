package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o60  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C21357o60 implements InterfaceC21185n60 {

    /* renamed from: b */
    public static Class f72559b;

    /* renamed from: c */
    public static boolean f72560c;

    /* renamed from: d */
    public static Method f72561d;

    /* renamed from: e */
    public static boolean f72562e;

    /* renamed from: f */
    public static Method f72563f;

    /* renamed from: g */
    public static boolean f72564g;

    /* renamed from: a */
    public final View f72565a;

    public C21357o60(View view) {
        this.f72565a = view;
    }

    /* renamed from: b */
    public static InterfaceC21185n60 m25967b(View view, ViewGroup viewGroup, Matrix matrix) {
        m25966c();
        Method method = f72561d;
        if (method != null) {
            try {
                return new C21357o60((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m25966c() {
        if (!f72562e) {
            try {
                m25965d();
                Method declaredMethod = f72559b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f72561d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f72562e = true;
        }
    }

    /* renamed from: d */
    public static void m25965d() {
        if (!f72560c) {
            try {
                f72559b = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f72560c = true;
        }
    }

    /* renamed from: e */
    public static void m25964e() {
        if (!f72564g) {
            try {
                m25965d();
                Method declaredMethod = f72559b.getDeclaredMethod("removeGhost", View.class);
                f72563f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f72564g = true;
        }
    }

    /* renamed from: f */
    public static void m25963f(View view) {
        m25964e();
        Method method = f72563f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // p000.InterfaceC21185n60
    public void setVisibility(int i) {
        this.f72565a.setVisibility(i);
    }

    @Override // p000.InterfaceC21185n60
    /* renamed from: a */
    public void mo25968a(ViewGroup viewGroup, View view) {
    }
}
