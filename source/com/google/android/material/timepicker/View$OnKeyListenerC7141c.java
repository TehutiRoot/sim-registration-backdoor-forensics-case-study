package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes4.dex */
public class View$OnKeyListenerC7141c implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f51227a;

    /* renamed from: b */
    public final ChipTextInputComboView f51228b;

    /* renamed from: c */
    public final C20044gT1 f51229c;

    /* renamed from: d */
    public boolean f51230d = false;

    public View$OnKeyListenerC7141c(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, C20044gT1 c20044gT1) {
        this.f51227a = chipTextInputComboView;
        this.f51228b = chipTextInputComboView2;
        this.f51229c = c20044gT1;
    }

    /* renamed from: a */
    public void m43590a() {
        TextInputLayout m43685e = this.f51227a.m43685e();
        TextInputLayout m43685e2 = this.f51228b.m43685e();
        EditText editText = m43685e.getEditText();
        EditText editText2 = m43685e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    /* renamed from: b */
    public final void m43589b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    /* renamed from: c */
    public final void m43588c(int i) {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.f51228b;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f51227a;
        if (i == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
        this.f51229c.f62179f = i;
    }

    /* renamed from: d */
    public final boolean m43587d(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            m43588c(12);
            return true;
        }
        m43589b(editText);
        return false;
    }

    /* renamed from: e */
    public final boolean m43586e(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            m43588c(10);
            return true;
        }
        m43589b(editText);
        return false;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m43588c(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean m43587d;
        if (this.f51230d) {
            return false;
        }
        this.f51230d = true;
        EditText editText = (EditText) view;
        if (this.f51229c.f62179f == 12) {
            m43587d = m43586e(i, keyEvent, editText);
        } else {
            m43587d = m43587d(i, keyEvent, editText);
        }
        this.f51230d = false;
        return m43587d;
    }
}
