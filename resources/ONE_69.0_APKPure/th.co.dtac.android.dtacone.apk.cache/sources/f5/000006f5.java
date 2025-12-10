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
import com.google.android.material.textfield.C7107a;

/* renamed from: HK */
/* loaded from: classes4.dex */
public class C0510HK extends AbstractC17054xS {

    /* renamed from: s */
    public static final boolean f2347s = true;

    /* renamed from: e */
    public final int f2348e;

    /* renamed from: f */
    public final int f2349f;

    /* renamed from: g */
    public final TimeInterpolator f2350g;

    /* renamed from: h */
    public AutoCompleteTextView f2351h;

    /* renamed from: i */
    public final View.OnClickListener f2352i;

    /* renamed from: j */
    public final View.OnFocusChangeListener f2353j;

    /* renamed from: k */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f2354k;

    /* renamed from: l */
    public boolean f2355l;

    /* renamed from: m */
    public boolean f2356m;

    /* renamed from: n */
    public boolean f2357n;

    /* renamed from: o */
    public long f2358o;

    /* renamed from: p */
    public AccessibilityManager f2359p;

    /* renamed from: q */
    public ValueAnimator f2360q;

    /* renamed from: r */
    public ValueAnimator f2361r;

    /* renamed from: HK$a */
    /* loaded from: classes4.dex */
    public class C0511a extends AnimatorListenerAdapter {
        public C0511a() {
            C0510HK.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0510HK.this.m533r();
            C0510HK.this.f2361r.start();
        }
    }

    public C0510HK(C7107a c7107a) {
        super(c7107a);
        this.f2352i = new View.OnClickListener() { // from class: DK
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0510HK.m68148B(C0510HK.this, view);
            }
        };
        this.f2353j = new View.OnFocusChangeListener() { // from class: EK
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C0510HK.m68128y(C0510HK.this, view, z);
            }
        };
        this.f2354k = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: FK
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C0510HK.m68130w(C0510HK.this, z);
            }
        };
        this.f2358o = Long.MAX_VALUE;
        this.f2349f = MotionUtils.resolveThemeDuration(c7107a.getContext(), R.attr.motionDurationShort3, 67);
        this.f2348e = MotionUtils.resolveThemeDuration(c7107a.getContext(), R.attr.motionDurationShort3, 50);
        this.f2350g = MotionUtils.resolveThemeInterpolator(c7107a.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    /* renamed from: A */
    public static /* synthetic */ void m68149A(C0510HK c0510hk) {
        c0510hk.m68136N();
    }

    /* renamed from: B */
    public static /* synthetic */ void m68148B(C0510HK c0510hk, View view) {
        c0510hk.m68140J(view);
    }

    /* renamed from: D */
    public static AutoCompleteTextView m68146D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: F */
    private void m68144F() {
        this.f2361r = m68145E(this.f2349f, 0.0f, 1.0f);
        ValueAnimator m68145E = m68145E(this.f2348e, 1.0f, 0.0f);
        this.f2360q = m68145E;
        m68145E.addListener(new C0511a());
    }

    /* renamed from: J */
    public /* synthetic */ void m68140J(View view) {
        m68133Q();
    }

    /* renamed from: K */
    public /* synthetic */ void m68139K(View view, boolean z) {
        this.f2355l = z;
        m533r();
        if (!z) {
            m68135O(false);
            this.f2356m = false;
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m68131v(C0510HK c0510hk) {
        c0510hk.m68142H();
    }

    /* renamed from: w */
    public static /* synthetic */ void m68130w(C0510HK c0510hk, boolean z) {
        c0510hk.m68138L(z);
    }

    /* renamed from: x */
    public static /* synthetic */ void m68129x(C0510HK c0510hk, ValueAnimator valueAnimator) {
        c0510hk.m68141I(valueAnimator);
    }

    /* renamed from: y */
    public static /* synthetic */ void m68128y(C0510HK c0510hk, View view, boolean z) {
        c0510hk.m68139K(view, z);
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m68127z(C0510HK c0510hk, View view, MotionEvent motionEvent) {
        return c0510hk.m68137M(view, motionEvent);
    }

    /* renamed from: E */
    public final ValueAnimator m68145E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f2350g);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: AK
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0510HK.m68129x(C0510HK.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    /* renamed from: G */
    public final boolean m68143G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f2358o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final /* synthetic */ void m68142H() {
        boolean isPopupShowing = this.f2351h.isPopupShowing();
        m68135O(isPopupShowing);
        this.f2356m = isPopupShowing;
    }

    /* renamed from: I */
    public final /* synthetic */ void m68141I(ValueAnimator valueAnimator) {
        this.f108752d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: L */
    public final /* synthetic */ void m68138L(boolean z) {
        int i;
        AutoCompleteTextView autoCompleteTextView = this.f2351h;
        if (autoCompleteTextView != null && !AbstractC1594WQ.m65760a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.f108752d;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            ViewCompat.setImportantForAccessibility(checkableImageButton, i);
        }
    }

    /* renamed from: M */
    public final /* synthetic */ boolean m68137M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (m68143G()) {
                this.f2356m = false;
            }
            m68133Q();
            m68132R();
        }
        return false;
    }

    /* renamed from: N */
    public final /* synthetic */ void m68136N() {
        m68132R();
        m68135O(false);
    }

    /* renamed from: O */
    public final void m68135O(boolean z) {
        if (this.f2357n != z) {
            this.f2357n = z;
            this.f2361r.cancel();
            this.f2360q.start();
        }
    }

    /* renamed from: P */
    public final void m68134P() {
        this.f2351h.setOnTouchListener(new View.OnTouchListener() { // from class: BK
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C0510HK.m68127z(C0510HK.this, view, motionEvent);
            }
        });
        if (f2347s) {
            this.f2351h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: CK
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C0510HK.m68149A(C0510HK.this);
                }
            });
        }
        this.f2351h.setThreshold(0);
    }

    /* renamed from: Q */
    public final void m68133Q() {
        if (this.f2351h == null) {
            return;
        }
        if (m68143G()) {
            this.f2356m = false;
        }
        if (!this.f2356m) {
            if (f2347s) {
                m68135O(!this.f2357n);
            } else {
                this.f2357n = !this.f2357n;
                m533r();
            }
            if (this.f2357n) {
                this.f2351h.requestFocus();
                this.f2351h.showDropDown();
                return;
            }
            this.f2351h.dismissDropDown();
            return;
        }
        this.f2356m = false;
    }

    /* renamed from: R */
    public final void m68132R() {
        this.f2356m = true;
        this.f2358o = System.currentTimeMillis();
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: a */
    public void mo550a(Editable editable) {
        if (this.f2359p.isTouchExplorationEnabled() && AbstractC1594WQ.m65760a(this.f2351h) && !this.f108752d.hasFocus()) {
            this.f2351h.dismissDropDown();
        }
        this.f2351h.post(new Runnable() { // from class: GK
            @Override // java.lang.Runnable
            public final void run() {
                C0510HK.m68131v(C0510HK.this);
            }
        });
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: c */
    public int mo548c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: d */
    public int mo547d() {
        if (f2347s) {
            return R.drawable.mtrl_dropdown_arrow;
        }
        return R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: e */
    public View.OnFocusChangeListener mo546e() {
        return this.f2353j;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: f */
    public View.OnClickListener mo545f() {
        return this.f2352i;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: h */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener mo543h() {
        return this.f2354k;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: i */
    public boolean mo542i(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: j */
    public boolean mo541j() {
        return true;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: k */
    public boolean mo540k() {
        return this.f2355l;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: l */
    public boolean mo539l() {
        return true;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: m */
    public boolean mo538m() {
        return this.f2357n;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: n */
    public void mo537n(EditText editText) {
        this.f2351h = m68146D(editText);
        m68134P();
        this.f108749a.setErrorIconDrawable((Drawable) null);
        if (!AbstractC1594WQ.m65760a(editText) && this.f2359p.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.f108752d, 2);
        }
        this.f108749a.setEndIconVisible(true);
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: o */
    public void mo536o(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!AbstractC1594WQ.m65760a(this.f2351h)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: p */
    public void mo535p(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.f2359p.isEnabled() && !AbstractC1594WQ.m65760a(this.f2351h)) {
            if (accessibilityEvent.getEventType() == 32768 && this.f2357n && !this.f2351h.isPopupShowing()) {
                z = true;
            } else {
                z = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                m68133Q();
                m68132R();
            }
        }
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: s */
    public void mo532s() {
        m68144F();
        this.f2359p = (AccessibilityManager) this.f108751c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: t */
    public boolean mo531t() {
        return true;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: u */
    public void mo530u() {
        AutoCompleteTextView autoCompleteTextView = this.f2351h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f2347s) {
                this.f2351h.setOnDismissListener(null);
            }
        }
    }
}