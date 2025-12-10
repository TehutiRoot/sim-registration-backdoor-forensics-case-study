package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.transition.AbstractC5128e;

/* renamed from: t32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22210t32 {

    /* renamed from: a */
    public static final AbstractC5128e f79981a;

    /* renamed from: b */
    public static final Property f79982b;

    /* renamed from: c */
    public static final Property f79983c;

    /* renamed from: t32$a */
    /* loaded from: classes2.dex */
    public static class C13970a extends Property {
        public C13970a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(AbstractC22210t32.m22528c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            AbstractC22210t32.m22523h(view, f.floatValue());
        }
    }

    /* renamed from: t32$b */
    /* loaded from: classes2.dex */
    public static class C13971b extends Property {
        public C13971b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return ViewCompat.getClipBounds(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            ViewCompat.setClipBounds(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f79981a = new E32();
        } else if (i >= 23) {
            f79981a = new D32();
        } else if (i >= 22) {
            f79981a = new B32();
        } else {
            f79981a = new C23242z32();
        }
        f79982b = new C13970a(Float.class, "translationAlpha");
        f79983c = new C13971b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m22530a(View view) {
        f79981a.mo931a(view);
    }

    /* renamed from: b */
    public static Z22 m22529b(View view) {
        return new Y22(view);
    }

    /* renamed from: c */
    public static float m22528c(View view) {
        return f79981a.mo930c(view);
    }

    /* renamed from: d */
    public static InterfaceC19117b42 m22527d(View view) {
        return new C18939a42(view);
    }

    /* renamed from: e */
    public static void m22526e(View view) {
        f79981a.mo929d(view);
    }

    /* renamed from: f */
    public static void m22525f(View view, Matrix matrix) {
        f79981a.mo140e(view, matrix);
    }

    /* renamed from: g */
    public static void m22524g(View view, int i, int i2, int i3, int i4) {
        f79981a.mo52582f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    public static void m22523h(View view, float f) {
        f79981a.mo928g(view, f);
    }

    /* renamed from: i */
    public static void m22522i(View view, int i) {
        f79981a.mo52581h(view, i);
    }

    /* renamed from: j */
    public static void m22521j(View view, Matrix matrix) {
        f79981a.mo139i(view, matrix);
    }

    /* renamed from: k */
    public static void m22520k(View view, Matrix matrix) {
        f79981a.mo138j(view, matrix);
    }
}
