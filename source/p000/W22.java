package p000;

import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: W22 */
/* loaded from: classes4.dex */
public class W22 {

    /* renamed from: a */
    public final View f7105a;

    /* renamed from: b */
    public int f7106b;

    /* renamed from: c */
    public int f7107c;

    /* renamed from: d */
    public int f7108d;

    /* renamed from: e */
    public int f7109e;

    /* renamed from: f */
    public boolean f7110f = true;

    /* renamed from: g */
    public boolean f7111g = true;

    public W22(View view) {
        this.f7105a = view;
    }

    /* renamed from: a */
    public void m65704a() {
        View view = this.f7105a;
        ViewCompat.offsetTopAndBottom(view, this.f7108d - (view.getTop() - this.f7106b));
        View view2 = this.f7105a;
        ViewCompat.offsetLeftAndRight(view2, this.f7109e - (view2.getLeft() - this.f7107c));
    }

    /* renamed from: b */
    public int m65703b() {
        return this.f7106b;
    }

    /* renamed from: c */
    public int m65702c() {
        return this.f7109e;
    }

    /* renamed from: d */
    public int m65701d() {
        return this.f7108d;
    }

    /* renamed from: e */
    public boolean m65700e() {
        return this.f7111g;
    }

    /* renamed from: f */
    public boolean m65699f() {
        return this.f7110f;
    }

    /* renamed from: g */
    public void m65698g() {
        this.f7106b = this.f7105a.getTop();
        this.f7107c = this.f7105a.getLeft();
    }

    /* renamed from: h */
    public void m65697h(boolean z) {
        this.f7111g = z;
    }

    /* renamed from: i */
    public boolean m65696i(int i) {
        if (this.f7111g && this.f7109e != i) {
            this.f7109e = i;
            m65704a();
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m65695j(int i) {
        if (this.f7110f && this.f7108d != i) {
            this.f7108d = i;
            m65704a();
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m65694k(boolean z) {
        this.f7110f = z;
    }
}
