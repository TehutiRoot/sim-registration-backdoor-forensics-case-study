package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class ViewBoundsCheck {

    /* renamed from: a */
    public final InterfaceC4943b f37091a;

    /* renamed from: b */
    public C4942a f37092b = new C4942a();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ViewBounds {
    }

    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$a */
    /* loaded from: classes2.dex */
    public static class C4942a {

        /* renamed from: a */
        public int f37093a = 0;

        /* renamed from: b */
        public int f37094b;

        /* renamed from: c */
        public int f37095c;

        /* renamed from: d */
        public int f37096d;

        /* renamed from: e */
        public int f37097e;

        /* renamed from: a */
        public void m53150a(int i) {
            this.f37093a = i | this.f37093a;
        }

        /* renamed from: b */
        public boolean m53149b() {
            int i = this.f37093a;
            if ((i & 7) != 0 && (i & m53148c(this.f37096d, this.f37094b)) == 0) {
                return false;
            }
            int i2 = this.f37093a;
            if ((i2 & 112) != 0 && (i2 & (m53148c(this.f37096d, this.f37095c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f37093a;
            if ((i3 & 1792) != 0 && (i3 & (m53148c(this.f37097e, this.f37094b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f37093a;
            if ((i4 & 28672) != 0 && (i4 & (m53148c(this.f37097e, this.f37095c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public int m53148c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void m53147d() {
            this.f37093a = 0;
        }

        /* renamed from: e */
        public void m53146e(int i, int i2, int i3, int i4) {
            this.f37094b = i;
            this.f37095c = i2;
            this.f37096d = i3;
            this.f37097e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4943b {
        /* renamed from: a */
        View mo53145a(int i);

        /* renamed from: b */
        int mo53144b();

        /* renamed from: c */
        int mo53143c();

        /* renamed from: d */
        int mo53142d(View view);

        /* renamed from: e */
        int mo53141e(View view);
    }

    public ViewBoundsCheck(InterfaceC4943b interfaceC4943b) {
        this.f37091a = interfaceC4943b;
    }

    /* renamed from: a */
    public View m53152a(int i, int i2, int i3, int i4) {
        int i5;
        int mo53144b = this.f37091a.mo53144b();
        int mo53143c = this.f37091a.mo53143c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View mo53145a = this.f37091a.mo53145a(i);
            this.f37092b.m53146e(mo53144b, mo53143c, this.f37091a.mo53142d(mo53145a), this.f37091a.mo53141e(mo53145a));
            if (i3 != 0) {
                this.f37092b.m53147d();
                this.f37092b.m53150a(i3);
                if (this.f37092b.m53149b()) {
                    return mo53145a;
                }
            }
            if (i4 != 0) {
                this.f37092b.m53147d();
                this.f37092b.m53150a(i4);
                if (this.f37092b.m53149b()) {
                    view = mo53145a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m53151b(View view, int i) {
        this.f37092b.m53146e(this.f37091a.mo53144b(), this.f37091a.mo53143c(), this.f37091a.mo53142d(view), this.f37091a.mo53141e(view));
        if (i != 0) {
            this.f37092b.m53147d();
            this.f37092b.m53150a(i);
            return this.f37092b.m53149b();
        }
        return false;
    }
}
