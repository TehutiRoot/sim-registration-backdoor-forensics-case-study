package th.p047co.dtac.android.dtacone.widget.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberWatcher;
import th.p047co.dtac.android.dtacone.view.activity.BaseActivity;
import th.p047co.dtac.android.dtacone.widget.view.CustomTelEditText;

/* renamed from: th.co.dtac.android.dtacone.widget.view.CustomTelEditText */
/* loaded from: classes9.dex */
public class CustomTelEditText extends LinearLayout {

    /* renamed from: a */
    public EditText f107413a;

    /* renamed from: b */
    public BaseActivity f107414b;

    public CustomTelEditText(Context context) {
        super(context, null);
        m1450c();
    }

    /* renamed from: b */
    public final void m1451b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.z_phone_number_phone_book, (ViewGroup) this, false);
        EditText editText = (EditText) inflate.findViewById(R.id.z_tel_edt_phone_number);
        this.f107413a = editText;
        editText.setRawInputType(3);
        inflate.findViewById(R.id.z_tel_iv_phone_book).setOnTouchListener(new View.OnTouchListener() { // from class: OA
            {
                CustomTelEditText.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m1449d;
                m1449d = CustomTelEditText.this.m1449d(view, motionEvent);
                return m1449d;
            }
        });
        addView(inflate);
    }

    /* renamed from: c */
    public final void m1450c() {
        if (!isInEditMode()) {
            m1451b();
            this.f107413a.addTextChangedListener(new PhoneNumberWatcher(this.f107413a));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean m1449d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            m1448e();
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public final void m1448e() {
        BaseActivity baseActivity = this.f107414b;
        if (baseActivity != null) {
            baseActivity.accessContactForRead(this);
        }
    }

    public EditText getEditText() {
        return this.f107413a;
    }

    public String getText() {
        EditText editText = this.f107413a;
        if (editText != null) {
            return editText.getText().toString();
        }
        return "";
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i, i2);
        }
    }

    public void setActivity(BaseActivity baseActivity) {
        this.f107414b = baseActivity;
    }

    public void setText(String str) {
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
        EditText editText = this.f107413a;
        if (editText != null && removeAllSpecialCharacter != null) {
            editText.setText(removeAllSpecialCharacter);
        }
    }

    public CustomTelEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m1450c();
    }

    public CustomTelEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1450c();
    }

    @TargetApi(21)
    public CustomTelEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1450c();
    }
}