package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.C7118a;

/* renamed from: GK */
/* loaded from: classes4.dex */
public class C0447GK extends AbstractC13999tS {

    /* renamed from: s */
    public static final boolean f1889s = true;

    /* renamed from: e */
    public final int f1890e;

    /* renamed from: f */
    public final int f1891f;

    /* renamed from: g */
    public final TimeInterpolator f1892g;

    /* renamed from: h */
    public AutoCompleteTextView f1893h;

    /* renamed from: i */
    public final View.OnClickListener f1894i;

    /* renamed from: j */
    public final View.OnFocusChangeListener f1895j;

    /* renamed from: k */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f1896k;

    /* renamed from: l */
    public boolean f1897l;

    /* renamed from: m */
    public boolean f1898m;

    /* renamed from: n */
    public boolean f1899n;

    /* renamed from: o */
    public long f1900o;

    /* renamed from: p */
    public AccessibilityManager f1901p;

    /* renamed from: q */
    public ValueAnimator f1902q;

    /* renamed from: r */
    public ValueAnimator f1903r;

    /* renamed from: GK$a */
    /* loaded from: classes4.dex */
    public class C0448a extends AnimatorListenerAdapter {
        public C0448a() {
            C0447GK.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0447GK.this.m22419r();
            C0447GK.this.f1903r.start();
        }
    }

    public C0447GK(C7118a c7118a) {
        super(c7118a);
        this.f1894i = new View.OnClickListener() { // from class: CK
            {
                C0447GK.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0447GK.m68272B(C0447GK.this, view);
            }
        };
        this.f1895j = new View.OnFocusChangeListener() { // from class: DK
            {
                C0447GK.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C0447GK.m68252y(C0447GK.this, view, z);
            }
        };
        this.f1896k = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: EK
            {
                C0447GK.this = this;
            }

            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C0447GK.m68254w(C0447GK.this, z);
            }
        };
        this.f1900o = Long.MAX_VALUE;
        this.f1891f = MotionUtils.resolveThemeDuration(c7118a.getContext(), R.attr.motionDurationShort3, 67);
        this.f1890e = MotionUtils.resolveThemeDuration(c7118a.getContext(), R.attr.motionDurationShort3, 50);
        this.f1892g = MotionUtils.resolveThemeInterpolator(c7118a.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    /* renamed from: A */
    public static /* synthetic */ void m68273A(C0447GK c0447gk) {
        c0447gk.m68260N();
    }

    /* renamed from: B */
    public static /* synthetic */ void m68272B(C0447GK c0447gk, View view) {
        c0447gk.m68264J(view);
    }

    /* renamed from: D */
    public static AutoCompleteTextView m68270D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: F */
    private void m68268F() {
        this.f1903r = m68269E(this.f1891f, 0.0f, 1.0f);
        ValueAnimator m68269E = m68269E(this.f1890e, 1.0f, 0.0f);
        this.f1902q = m68269E;
        m68269E.addListener(new C0448a());
    }

    /* renamed from: J */
    public /* synthetic */ void m68264J(View view) {
        m68257Q();
    }

    /* renamed from: K */
    public /* synthetic */ void m68263K(View view, boolean z) {
        this.f1897l = z;
        m22419r();
        if (!z) {
            m68259O(false);
            this.f1898m = false;
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m68255v(C0447GK c0447gk) {
        c0447gk.m68266H();
    }

    /* renamed from: w */
    public static /* synthetic */ void m68254w(C0447GK c0447gk, boolean z) {
        c0447gk.m68262L(z);
    }

    /* renamed from: x */
    public static /* synthetic */ void m68253x(C0447GK c0447gk, ValueAnimator valueAnimator) {
        c0447gk.m68265I(valueAnimator);
    }

    /* renamed from: y */
    public static /* synthetic */ void m68252y(C0447GK c0447gk, View view, boolean z) {
        c0447gk.m68263K(view, z);
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m68251z(C0447GK c0447gk, View view, MotionEvent motionEvent) {
        return c0447gk.m68261M(view, motionEvent);
    }

    /* renamed from: E */
    public final ValueAnimator m68269E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f1892g);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zK
            {
                C0447GK.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0447GK.m68253x(C0447GK.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: G */
    public final boolean m68267G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f1900o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final /* synthetic */ void m68266H() {
        boolean isPopupShowing = this.f1893h.isPopupShowing();
        m68259O(isPopupShowing);
        this.f1898m = isPopupShowing;
    }

    /* renamed from: I */
    public final /* synthetic */ void m68265I(ValueAnimator valueAnimator) {
        this.f80119d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: L */
    public final /* synthetic */ void m68262L(boolean z) {
        int i;
        AutoCompleteTextView autoCompleteTextView = this.f1893h;
        if (autoCompleteTextView != null && !AbstractC1534VQ.m65851a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.f80119d;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            ViewCompat.setImportantForAccessibility(checkableImageButton, i);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ boolean m68261M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (m68267G()) {
                this.f1898m = false;
            }
            m68257Q();
            m68256R();
        }
        return false;
    }

    /* renamed from: N */
    public final /* synthetic */ void m68260N() {
        m68256R();
        m68259O(false);
    }

    /* renamed from: O */
    public final void m68259O(boolean z) {
        if (this.f1899n != z) {
            this.f1899n = z;
            this.f1903r.cancel();
            this.f1902q.start();
        }
    }

    /* renamed from: P */
    public final void m68258P() {
        this.f1893h.setOnTouchListener(new View.OnTouchListener() { // from class: AK
            {
                C0447GK.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C0447GK.m68251z(C0447GK.this, view, motionEvent);
            }
        });
        if (f1889s) {
            this.f1893h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: BK
                {
                    C0447GK.this = this;
                }

                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C0447GK.m68273A(C0447GK.this);
                }
            });
        }
        this.f1893h.setThreshold(0);
    }

    /* renamed from: Q */
    public final void m68257Q() {
        if (this.f1893h == null) {
            return;
        }
        if (m68267G()) {
            this.f1898m = false;
        }
        if (!this.f1898m) {
            if (f1889s) {
                m68259O(!this.f1899n);
            } else {
                this.f1899n = !this.f1899n;
                m22419r();
            }
            if (this.f1899n) {
                this.f1893h.requestFocus();
                this.f1893h.showDropDown();
                return;
            }
            this.f1893h.dismissDropDown();
            return;
        }
        this.f1898m = false;
    }

    /* renamed from: R */
    public final void m68256R() {
        this.f1898m = true;
        this.f1900o = System.currentTimeMillis();
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: a */
    public void mo22436a(Editable editable) {
        if (this.f1901p.isTouchExplorationEnabled() && AbstractC1534VQ.m65851a(this.f1893h) && !this.f80119d.hasFocus()) {
            this.f1893h.dismissDropDown();
        }
        this.f1893h.post(new Runnable() { // from class: FK
            {
                C0447GK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0447GK.m68255v(C0447GK.this);
            }
        });
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: c */
    public int mo22434c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: d */
    public int mo22433d() {
        if (f1889s) {
            return R.drawable.mtrl_dropdown_arrow;
        }
        return R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: e */
    public View.OnFocusChangeListener mo22432e() {
        return this.f1895j;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: f */
    public View.OnClickListener mo22431f() {
        return this.f1894i;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: h */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener mo22429h() {
        return this.f1896k;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: i */
    public boolean mo22428i(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: j */
    public boolean mo22427j() {
        return true;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: k */
    public boolean mo22426k() {
        return this.f1897l;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: l */
    public boolean mo22425l() {
        return true;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: m */
    public boolean mo22424m() {
        return this.f1899n;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: n */
    public void mo22423n(EditText editText) {
        this.f1893h = m68270D(editText);
        m68258P();
        this.f80116a.setErrorIconDrawable((Drawable) null);
        if (!AbstractC1534VQ.m65851a(editText) && this.f1901p.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.f80119d, 2);
        }
        this.f80116a.setEndIconVisible(true);
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: o */
    public void mo22422o(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!AbstractC1534VQ.m65851a(this.f1893h)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: p */
    public void mo22421p(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.f1901p.isEnabled() && !AbstractC1534VQ.m65851a(this.f1893h)) {
            if (accessibilityEvent.getEventType() == 32768 && this.f1899n && !this.f1893h.isPopupShowing()) {
                z = true;
            } else {
                z = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                m68257Q();
                m68256R();
            }
        }
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: s */
    public void mo897s() {
        m68268F();
        this.f1901p = (AccessibilityManager) this.f80118c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: t */
    public boolean mo22418t() {
        return true;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: u */
    public void mo22417u() {
        AutoCompleteTextView autoCompleteTextView = this.f1893h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f1889s) {
                this.f1893h.setOnDismissListener(null);
            }
        }
    }
}
