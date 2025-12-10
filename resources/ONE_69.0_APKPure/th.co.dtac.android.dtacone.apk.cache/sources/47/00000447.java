package p000;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;

/* renamed from: EU1 */
/* loaded from: classes.dex */
public class EU1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static EU1 f1372k;

    /* renamed from: l */
    public static EU1 f1373l;

    /* renamed from: a */
    public final View f1374a;

    /* renamed from: b */
    public final CharSequence f1375b;

    /* renamed from: c */
    public final int f1376c;

    /* renamed from: d */
    public final Runnable f1377d = new Runnable() { // from class: CU1
        @Override // java.lang.Runnable
        public final void run() {
            EU1.m68649a(EU1.this);
        }
    };

    /* renamed from: e */
    public final Runnable f1378e = new Runnable() { // from class: DU1
        @Override // java.lang.Runnable
        public final void run() {
            EU1.this.m68646d();
        }
    };

    /* renamed from: f */
    public int f1379f;

    /* renamed from: g */
    public int f1380g;

    /* renamed from: h */
    public FU1 f1381h;

    /* renamed from: i */
    public boolean f1382i;

    /* renamed from: j */
    public boolean f1383j;

    public EU1(View view, CharSequence charSequence) {
        this.f1374a = view;
        this.f1375b = charSequence;
        this.f1376c = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        m68647c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m68649a(EU1 eu1) {
        eu1.m68645e();
    }

    /* renamed from: g */
    public static void m68643g(EU1 eu1) {
        EU1 eu12 = f1372k;
        if (eu12 != null) {
            eu12.m68648b();
        }
        f1372k = eu1;
        if (eu1 != null) {
            eu1.m68644f();
        }
    }

    /* renamed from: h */
    public static void m68642h(View view, CharSequence charSequence) {
        EU1 eu1 = f1372k;
        if (eu1 != null && eu1.f1374a == view) {
            m68643g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            EU1 eu12 = f1373l;
            if (eu12 != null && eu12.f1374a == view) {
                eu12.m68646d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new EU1(view, charSequence);
    }

    /* renamed from: b */
    public final void m68648b() {
        this.f1374a.removeCallbacks(this.f1377d);
    }

    /* renamed from: c */
    public final void m68647c() {
        this.f1383j = true;
    }

    /* renamed from: d */
    public void m68646d() {
        if (f1373l == this) {
            f1373l = null;
            FU1 fu1 = this.f1381h;
            if (fu1 != null) {
                fu1.m68421c();
                this.f1381h = null;
                m68647c();
                this.f1374a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1372k == this) {
            m68643g(null);
        }
        this.f1374a.removeCallbacks(this.f1378e);
    }

    /* renamed from: e */
    public final /* synthetic */ void m68645e() {
        m68641i(false);
    }

    /* renamed from: f */
    public final void m68644f() {
        this.f1374a.postDelayed(this.f1377d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void m68641i(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (!ViewCompat.isAttachedToWindow(this.f1374a)) {
            return;
        }
        m68643g(null);
        EU1 eu1 = f1373l;
        if (eu1 != null) {
            eu1.m68646d();
        }
        f1373l = this;
        this.f1382i = z;
        FU1 fu1 = new FU1(this.f1374a.getContext());
        this.f1381h = fu1;
        fu1.m68419e(this.f1374a, this.f1379f, this.f1380g, this.f1382i, this.f1375b);
        this.f1374a.addOnAttachStateChangeListener(this);
        if (this.f1382i) {
            j2 = 2500;
        } else {
            if ((ViewCompat.getWindowSystemUiVisibility(this.f1374a) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.f1374a.removeCallbacks(this.f1378e);
        this.f1374a.postDelayed(this.f1378e, j2);
    }

    /* renamed from: j */
    public final boolean m68640j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f1383j && Math.abs(x - this.f1379f) <= this.f1376c && Math.abs(y - this.f1380g) <= this.f1376c) {
            return false;
        }
        this.f1379f = x;
        this.f1380g = y;
        this.f1383j = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1381h != null && this.f1382i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1374a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m68647c();
                m68646d();
            }
        } else if (this.f1374a.isEnabled() && this.f1381h == null && m68640j(motionEvent)) {
            m68643g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1379f = view.getWidth() / 2;
        this.f1380g = view.getHeight() / 2;
        m68641i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m68646d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}