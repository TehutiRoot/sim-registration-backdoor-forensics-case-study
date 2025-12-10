package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class ViewBoundsCheck {

    /* renamed from: a */
    public final InterfaceC4925b f37179a;

    /* renamed from: b */
    public C4924a f37180b = new C4924a();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ViewBounds {
    }

    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$a */
    /* loaded from: classes2.dex */
    public static class C4924a {

        /* renamed from: a */
        public int f37181a = 0;

        /* renamed from: b */
        public int f37182b;

        /* renamed from: c */
        public int f37183c;

        /* renamed from: d */
        public int f37184d;

        /* renamed from: e */
        public int f37185e;

        /* renamed from: a */
        public void m53101a(int i) {
            this.f37181a = i | this.f37181a;
        }

        /* renamed from: b */
        public boolean m53100b() {
            int i = this.f37181a;
            if ((i & 7) != 0 && (i & m53099c(this.f37184d, this.f37182b)) == 0) {
                return false;
            }
            int i2 = this.f37181a;
            if ((i2 & 112) != 0 && (i2 & (m53099c(this.f37184d, this.f37183c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f37181a;
            if ((i3 & 1792) != 0 && (i3 & (m53099c(this.f37185e, this.f37182b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f37181a;
            if ((i4 & 28672) != 0 && (i4 & (m53099c(this.f37185e, this.f37183c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public int m53099c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void m53098d() {
            this.f37181a = 0;
        }

        /* renamed from: e */
        public void m53097e(int i, int i2, int i3, int i4) {
            this.f37182b = i;
            this.f37183c = i2;
            this.f37184d = i3;
            this.f37185e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ViewBoundsCheck$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4925b {
        /* renamed from: a */
        View mo53096a(int i);

        /* renamed from: b */
        int mo53095b();

        /* renamed from: c */
        int mo53094c();

        /* renamed from: d */
        int mo53093d(View view);

        /* renamed from: e */
        int mo53092e(View view);
    }

    public ViewBoundsCheck(InterfaceC4925b interfaceC4925b) {
        this.f37179a = interfaceC4925b;
    }

    /* renamed from: a */
    public View m53103a(int i, int i2, int i3, int i4) {
        int i5;
        int mo53095b = this.f37179a.mo53095b();
        int mo53094c = this.f37179a.mo53094c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View mo53096a = this.f37179a.mo53096a(i);
            this.f37180b.m53097e(mo53095b, mo53094c, this.f37179a.mo53093d(mo53096a), this.f37179a.mo53092e(mo53096a));
            if (i3 != 0) {
                this.f37180b.m53098d();
                this.f37180b.m53101a(i3);
                if (this.f37180b.m53100b()) {
                    return mo53096a;
                }
            }
            if (i4 != 0) {
                this.f37180b.m53098d();
                this.f37180b.m53101a(i4);
                if (this.f37180b.m53100b()) {
                    view = mo53096a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m53102b(View view, int i) {
        this.f37180b.m53097e(this.f37179a.mo53095b(), this.f37179a.mo53094c(), this.f37179a.mo53093d(view), this.f37179a.mo53092e(view));
        if (i != 0) {
            this.f37180b.m53098d();
            this.f37180b.m53101a(i);
            return this.f37180b.m53100b();
        }
        return false;
    }
}