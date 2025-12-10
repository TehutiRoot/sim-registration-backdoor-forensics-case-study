package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ViewPropertyAnimatorCompatSet {

    /* renamed from: c */
    public Interpolator f9215c;

    /* renamed from: d */
    public ViewPropertyAnimatorListener f9216d;

    /* renamed from: e */
    public boolean f9217e;

    /* renamed from: b */
    public long f9214b = -1;

    /* renamed from: f */
    public final ViewPropertyAnimatorListenerAdapter f9218f = new C2140a();

    /* renamed from: a */
    public final ArrayList f9213a = new ArrayList();

    /* renamed from: androidx.appcompat.view.ViewPropertyAnimatorCompatSet$a */
    /* loaded from: classes.dex */
    public class C2140a extends ViewPropertyAnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f9219a = false;

        /* renamed from: b */
        public int f9220b = 0;

        public C2140a() {
        }

        /* renamed from: a */
        public void m64472a() {
            this.f9220b = 0;
            this.f9219a = false;
            ViewPropertyAnimatorCompatSet.this.m64473a();
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            int i = this.f9220b + 1;
            this.f9220b = i;
            if (i == ViewPropertyAnimatorCompatSet.this.f9213a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f9216d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(null);
                }
                m64472a();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            if (this.f9219a) {
                return;
            }
            this.f9219a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f9216d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(null);
            }
        }
    }

    /* renamed from: a */
    public void m64473a() {
        this.f9217e = false;
    }

    public void cancel() {
        if (!this.f9217e) {
            return;
        }
        Iterator it = this.f9213a.iterator();
        while (it.hasNext()) {
            ((ViewPropertyAnimatorCompat) it.next()).cancel();
        }
        this.f9217e = false;
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f9217e) {
            this.f9213a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f9213a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.f9213a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.f9217e) {
            this.f9214b = j;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.f9217e) {
            this.f9215c = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f9217e) {
            this.f9216d = viewPropertyAnimatorListener;
        }
        return this;
    }

    public void start() {
        if (this.f9217e) {
            return;
        }
        Iterator it = this.f9213a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
            long j = this.f9214b;
            if (j >= 0) {
                viewPropertyAnimatorCompat.setDuration(j);
            }
            Interpolator interpolator = this.f9215c;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(interpolator);
            }
            if (this.f9216d != null) {
                viewPropertyAnimatorCompat.setListener(this.f9218f);
            }
            viewPropertyAnimatorCompat.start();
        }
        this.f9217e = true;
    }
}
