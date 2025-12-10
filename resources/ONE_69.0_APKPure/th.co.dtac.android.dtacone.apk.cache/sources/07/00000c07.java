package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.textfield.C7107a;

/* renamed from: Mi1 */
/* loaded from: classes4.dex */
public class C18089Mi1 extends AbstractC17054xS {

    /* renamed from: e */
    public int f3942e;

    /* renamed from: f */
    public EditText f3943f;

    /* renamed from: g */
    public final View.OnClickListener f3944g;

    public C18089Mi1(C7107a c7107a, int i) {
        super(c7107a);
        this.f3942e = R.drawable.design_password_eye;
        this.f3944g = new View.OnClickListener() { // from class: Li1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18089Mi1.m67348v(C18089Mi1.this, view);
            }
        };
        if (i != 0) {
            this.f3942e = i;
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m67348v(C18089Mi1 c18089Mi1, View view) {
        c18089Mi1.m67345y(view);
    }

    /* renamed from: x */
    public static boolean m67346x(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public /* synthetic */ void m67345y(View view) {
        EditText editText = this.f3943f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (m67347w()) {
            this.f3943f.setTransformationMethod(null);
        } else {
            this.f3943f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f3943f.setSelection(selectionEnd);
        }
        m533r();
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: b */
    public void mo549b(CharSequence charSequence, int i, int i2, int i3) {
        m533r();
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: c */
    public int mo548c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: d */
    public int mo547d() {
        return this.f3942e;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: f */
    public View.OnClickListener mo545f() {
        return this.f3944g;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: l */
    public boolean mo539l() {
        return true;
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: m */
    public boolean mo538m() {
        return !m67347w();
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: n */
    public void mo537n(EditText editText) {
        this.f3943f = editText;
        m533r();
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: s */
    public void mo532s() {
        if (m67346x(this.f3943f)) {
            this.f3943f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p000.AbstractC17054xS
    /* renamed from: u */
    public void mo530u() {
        EditText editText = this.f3943f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: w */
    public final boolean m67347w() {
        EditText editText = this.f3943f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }
}