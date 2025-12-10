package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: u60  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C22455u60 implements InterfaceC22282t60 {

    /* renamed from: b */
    public static Class f107608b;

    /* renamed from: c */
    public static boolean f107609c;

    /* renamed from: d */
    public static Method f107610d;

    /* renamed from: e */
    public static boolean f107611e;

    /* renamed from: f */
    public static Method f107612f;

    /* renamed from: g */
    public static boolean f107613g;

    /* renamed from: a */
    public final View f107614a;

    public C22455u60(View view) {
        this.f107614a = view;
    }

    /* renamed from: b */
    public static InterfaceC22282t60 m1257b(View view, ViewGroup viewGroup, Matrix matrix) {
        m1256c();
        Method method = f107610d;
        if (method != null) {
            try {
                return new C22455u60((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m1256c() {
        if (!f107611e) {
            try {
                m1255d();
                Method declaredMethod = f107608b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f107610d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f107611e = true;
        }
    }

    /* renamed from: d */
    public static void m1255d() {
        if (!f107609c) {
            try {
                f107608b = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f107609c = true;
        }
    }

    /* renamed from: e */
    public static void m1254e() {
        if (!f107613g) {
            try {
                m1255d();
                Method declaredMethod = f107608b.getDeclaredMethod("removeGhost", View.class);
                f107612f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f107613g = true;
        }
    }

    /* renamed from: f */
    public static void m1253f(View view) {
        m1254e();
        Method method = f107612f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // p000.InterfaceC22282t60
    public void setVisibility(int i) {
        this.f107614a.setVisibility(i);
    }

    @Override // p000.InterfaceC22282t60
    /* renamed from: a */
    public void mo1258a(ViewGroup viewGroup, View view) {
    }
}