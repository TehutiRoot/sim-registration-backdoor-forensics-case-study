package p000;

import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: T32 */
/* loaded from: classes4.dex */
public class T32 {

    /* renamed from: a */
    public final View f6236a;

    /* renamed from: b */
    public int f6237b;

    /* renamed from: c */
    public int f6238c;

    /* renamed from: d */
    public int f6239d;

    /* renamed from: e */
    public int f6240e;

    /* renamed from: f */
    public boolean f6241f = true;

    /* renamed from: g */
    public boolean f6242g = true;

    public T32(View view) {
        this.f6236a = view;
    }

    /* renamed from: a */
    public void m66383a() {
        View view = this.f6236a;
        ViewCompat.offsetTopAndBottom(view, this.f6239d - (view.getTop() - this.f6237b));
        View view2 = this.f6236a;
        ViewCompat.offsetLeftAndRight(view2, this.f6240e - (view2.getLeft() - this.f6238c));
    }

    /* renamed from: b */
    public int m66382b() {
        return this.f6237b;
    }

    /* renamed from: c */
    public int m66381c() {
        return this.f6240e;
    }

    /* renamed from: d */
    public int m66380d() {
        return this.f6239d;
    }

    /* renamed from: e */
    public boolean m66379e() {
        return this.f6242g;
    }

    /* renamed from: f */
    public boolean m66378f() {
        return this.f6241f;
    }

    /* renamed from: g */
    public void m66377g() {
        this.f6237b = this.f6236a.getTop();
        this.f6238c = this.f6236a.getLeft();
    }

    /* renamed from: h */
    public void m66376h(boolean z) {
        this.f6242g = z;
    }

    /* renamed from: i */
    public boolean m66375i(int i) {
        if (this.f6242g && this.f6240e != i) {
            this.f6240e = i;
            m66383a();
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m66374j(int i) {
        if (this.f6241f && this.f6239d != i) {
            this.f6239d = i;
            m66383a();
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m66373k(boolean z) {
        this.f6241f = z;
    }
}