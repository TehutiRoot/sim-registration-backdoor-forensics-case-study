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
    public Interpolator f9303c;

    /* renamed from: d */
    public ViewPropertyAnimatorListener f9304d;

    /* renamed from: e */
    public boolean f9305e;

    /* renamed from: b */
    public long f9302b = -1;

    /* renamed from: f */
    public final ViewPropertyAnimatorListenerAdapter f9306f = new C2122a();

    /* renamed from: a */
    public final ArrayList f9301a = new ArrayList();

    /* renamed from: androidx.appcompat.view.ViewPropertyAnimatorCompatSet$a */
    /* loaded from: classes.dex */
    public class C2122a extends ViewPropertyAnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f9307a = false;

        /* renamed from: b */
        public int f9308b = 0;

        public C2122a() {
        }

        /* renamed from: a */
        public void m64423a() {
            this.f9308b = 0;
            this.f9307a = false;
            ViewPropertyAnimatorCompatSet.this.m64424a();
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            int i = this.f9308b + 1;
            this.f9308b = i;
            if (i == ViewPropertyAnimatorCompatSet.this.f9301a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f9304d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(null);
                }
                m64423a();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            if (this.f9307a) {
                return;
            }
            this.f9307a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f9304d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(null);
            }
        }
    }

    /* renamed from: a */
    public void m64424a() {
        this.f9305e = false;
    }

    public void cancel() {
        if (!this.f9305e) {
            return;
        }
        Iterator it = this.f9301a.iterator();
        while (it.hasNext()) {
            ((ViewPropertyAnimatorCompat) it.next()).cancel();
        }
        this.f9305e = false;
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f9305e) {
            this.f9301a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f9301a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.f9301a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.f9305e) {
            this.f9302b = j;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.f9305e) {
            this.f9303c = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f9305e) {
            this.f9304d = viewPropertyAnimatorListener;
        }
        return this;
    }

    public void start() {
        if (this.f9305e) {
            return;
        }
        Iterator it = this.f9301a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
            long j = this.f9302b;
            if (j >= 0) {
                viewPropertyAnimatorCompat.setDuration(j);
            }
            Interpolator interpolator = this.f9303c;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(interpolator);
            }
            if (this.f9304d != null) {
                viewPropertyAnimatorCompat.setListener(this.f9306f);
            }
            viewPropertyAnimatorCompat.start();
        }
        this.f9305e = true;
    }
}