package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.textfield.C7118a;

/* renamed from: Ph1 */
/* loaded from: classes4.dex */
public class C18243Ph1 extends AbstractC13999tS {

    /* renamed from: e */
    public int f4814e;

    /* renamed from: f */
    public EditText f4815f;

    /* renamed from: g */
    public final View.OnClickListener f4816g;

    public C18243Ph1(C7118a c7118a, int i) {
        super(c7118a);
        this.f4814e = R.drawable.design_password_eye;
        this.f4816g = new View.OnClickListener() { // from class: Oh1
            {
                C18243Ph1.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18243Ph1.m66763v(C18243Ph1.this, view);
            }
        };
        if (i != 0) {
            this.f4814e = i;
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m66763v(C18243Ph1 c18243Ph1, View view) {
        c18243Ph1.m66760y(view);
    }

    /* renamed from: x */
    public static boolean m66761x(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public /* synthetic */ void m66760y(View view) {
        EditText editText = this.f4815f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (m66762w()) {
            this.f4815f.setTransformationMethod(null);
        } else {
            this.f4815f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f4815f.setSelection(selectionEnd);
        }
        m22419r();
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: b */
    public void mo22435b(CharSequence charSequence, int i, int i2, int i3) {
        m22419r();
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: c */
    public int mo22434c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: d */
    public int mo22433d() {
        return this.f4814e;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: f */
    public View.OnClickListener mo22431f() {
        return this.f4816g;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: l */
    public boolean mo22425l() {
        return true;
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: m */
    public boolean mo22424m() {
        return !m66762w();
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: n */
    public void mo22423n(EditText editText) {
        this.f4815f = editText;
        m22419r();
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: s */
    public void mo897s() {
        if (m66761x(this.f4815f)) {
            this.f4815f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p000.AbstractC13999tS
    /* renamed from: u */
    public void mo22417u() {
        EditText editText = this.f4815f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: w */
    public final boolean m66762w() {
        EditText editText = this.f4815f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }
}
