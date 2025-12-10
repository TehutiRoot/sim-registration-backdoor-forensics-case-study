package p000;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;

/* renamed from: HT1 */
/* loaded from: classes.dex */
public class HT1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static HT1 f2227k;

    /* renamed from: l */
    public static HT1 f2228l;

    /* renamed from: a */
    public final View f2229a;

    /* renamed from: b */
    public final CharSequence f2230b;

    /* renamed from: c */
    public final int f2231c;

    /* renamed from: d */
    public final Runnable f2232d = new Runnable() { // from class: FT1
        @Override // java.lang.Runnable
        public final void run() {
            HT1.m68095a(HT1.this);
        }
    };

    /* renamed from: e */
    public final Runnable f2233e = new Runnable() { // from class: GT1
        @Override // java.lang.Runnable
        public final void run() {
            HT1.this.m68092d();
        }
    };

    /* renamed from: f */
    public int f2234f;

    /* renamed from: g */
    public int f2235g;

    /* renamed from: h */
    public IT1 f2236h;

    /* renamed from: i */
    public boolean f2237i;

    /* renamed from: j */
    public boolean f2238j;

    public HT1(View view, CharSequence charSequence) {
        this.f2229a = view;
        this.f2230b = charSequence;
        this.f2231c = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        m68093c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m68095a(HT1 ht1) {
        ht1.m68091e();
    }

    /* renamed from: g */
    public static void m68089g(HT1 ht1) {
        HT1 ht12 = f2227k;
        if (ht12 != null) {
            ht12.m68094b();
        }
        f2227k = ht1;
        if (ht1 != null) {
            ht1.m68090f();
        }
    }

    /* renamed from: h */
    public static void m68088h(View view, CharSequence charSequence) {
        HT1 ht1 = f2227k;
        if (ht1 != null && ht1.f2229a == view) {
            m68089g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            HT1 ht12 = f2228l;
            if (ht12 != null && ht12.f2229a == view) {
                ht12.m68092d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new HT1(view, charSequence);
    }

    /* renamed from: b */
    public final void m68094b() {
        this.f2229a.removeCallbacks(this.f2232d);
    }

    /* renamed from: c */
    public final void m68093c() {
        this.f2238j = true;
    }

    /* renamed from: d */
    public void m68092d() {
        if (f2228l == this) {
            f2228l = null;
            IT1 it1 = this.f2236h;
            if (it1 != null) {
                it1.m67909c();
                this.f2236h = null;
                m68093c();
                this.f2229a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f2227k == this) {
            m68089g(null);
        }
        this.f2229a.removeCallbacks(this.f2233e);
    }

    /* renamed from: e */
    public final /* synthetic */ void m68091e() {
        m68087i(false);
    }

    /* renamed from: f */
    public final void m68090f() {
        this.f2229a.postDelayed(this.f2232d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void m68087i(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (!ViewCompat.isAttachedToWindow(this.f2229a)) {
            return;
        }
        m68089g(null);
        HT1 ht1 = f2228l;
        if (ht1 != null) {
            ht1.m68092d();
        }
        f2228l = this;
        this.f2237i = z;
        IT1 it1 = new IT1(this.f2229a.getContext());
        this.f2236h = it1;
        it1.m67907e(this.f2229a, this.f2234f, this.f2235g, this.f2237i, this.f2230b);
        this.f2229a.addOnAttachStateChangeListener(this);
        if (this.f2237i) {
            j2 = 2500;
        } else {
            if ((ViewCompat.getWindowSystemUiVisibility(this.f2229a) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.f2229a.removeCallbacks(this.f2233e);
        this.f2229a.postDelayed(this.f2233e, j2);
    }

    /* renamed from: j */
    public final boolean m68086j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f2238j && Math.abs(x - this.f2234f) <= this.f2231c && Math.abs(y - this.f2235g) <= this.f2231c) {
            return false;
        }
        this.f2234f = x;
        this.f2235g = y;
        this.f2238j = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2236h != null && this.f2237i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2229a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m68093c();
                m68092d();
            }
        } else if (this.f2229a.isEnabled() && this.f2236h == null && m68086j(motionEvent)) {
            m68089g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2234f = view.getWidth() / 2;
        this.f2235g = view.getHeight() / 2;
        m68087i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m68092d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
