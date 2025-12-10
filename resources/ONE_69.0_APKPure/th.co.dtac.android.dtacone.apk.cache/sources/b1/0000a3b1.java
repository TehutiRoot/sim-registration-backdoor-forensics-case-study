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
public class View$OnKeyListenerC7130c implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f51239a;

    /* renamed from: b */
    public final ChipTextInputComboView f51240b;

    /* renamed from: c */
    public final C19580dU1 f51241c;

    /* renamed from: d */
    public boolean f51242d = false;

    public View$OnKeyListenerC7130c(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, C19580dU1 c19580dU1) {
        this.f51239a = chipTextInputComboView;
        this.f51240b = chipTextInputComboView2;
        this.f51241c = c19580dU1;
    }

    /* renamed from: a */
    public void m43577a() {
        TextInputLayout m43672e = this.f51239a.m43672e();
        TextInputLayout m43672e2 = this.f51240b.m43672e();
        EditText editText = m43672e.getEditText();
        EditText editText2 = m43672e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    /* renamed from: b */
    public final void m43576b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    /* renamed from: c */
    public final void m43575c(int i) {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.f51240b;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f51239a;
        if (i == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
        this.f51241c.f61255f = i;
    }

    /* renamed from: d */
    public final boolean m43574d(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            m43575c(12);
            return true;
        }
        m43576b(editText);
        return false;
    }

    /* renamed from: e */
    public final boolean m43573e(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            m43575c(10);
            return true;
        }
        m43576b(editText);
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
            m43575c(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean m43574d;
        if (this.f51242d) {
            return false;
        }
        this.f51242d = true;
        EditText editText = (EditText) view;
        if (this.f51241c.f61255f == 12) {
            m43574d = m43573e(i, keyEvent, editText);
        } else {
            m43574d = m43574d(i, keyEvent, editText);
        }
        this.f51242d = false;
        return m43574d;
    }
}