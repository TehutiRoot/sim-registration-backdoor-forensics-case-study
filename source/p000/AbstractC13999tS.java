package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C7118a;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: tS */
/* loaded from: classes4.dex */
public abstract class AbstractC13999tS {

    /* renamed from: a */
    public final TextInputLayout f80116a;

    /* renamed from: b */
    public final C7118a f80117b;

    /* renamed from: c */
    public final Context f80118c;

    /* renamed from: d */
    public final CheckableImageButton f80119d;

    public AbstractC13999tS(C7118a c7118a) {
        this.f80116a = c7118a.f51092a;
        this.f80117b = c7118a;
        this.f80118c = c7118a.getContext();
        this.f80119d = c7118a.m43714t();
    }

    /* renamed from: c */
    public int mo22434c() {
        return 0;
    }

    /* renamed from: d */
    public int mo22433d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo22432e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo22431f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo22430g() {
        return null;
    }

    /* renamed from: h */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener mo22429h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo22428i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo22427j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo22426k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo22425l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo22424m() {
        return false;
    }

    /* renamed from: r */
    public final void m22419r() {
        this.f80117b.m43764O(false);
    }

    /* renamed from: t */
    public boolean mo22418t() {
        return false;
    }

    /* renamed from: s */
    public void mo897s() {
    }

    /* renamed from: u */
    public void mo22417u() {
    }

    /* renamed from: a */
    public void mo22436a(Editable editable) {
    }

    /* renamed from: n */
    public void mo22423n(EditText editText) {
    }

    /* renamed from: q */
    public void mo22420q(boolean z) {
    }

    /* renamed from: o */
    public void mo22422o(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* renamed from: p */
    public void mo22421p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: b */
    public void mo22435b(CharSequence charSequence, int i, int i2, int i3) {
    }
}
