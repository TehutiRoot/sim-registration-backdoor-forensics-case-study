package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f51136a;

    /* renamed from: b */
    public final TextInputLayout f51137b;

    /* renamed from: c */
    public final EditText f51138c;

    /* renamed from: d */
    public TextWatcher f51139d;

    /* renamed from: e */
    public TextView f51140e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes4.dex */
    public class C7113b extends TextWatcherAdapter {
        public C7113b() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                String m43673d = ChipTextInputComboView.this.m43673d(editable);
                Chip chip = ChipTextInputComboView.this.f51136a;
                if (TextUtils.isEmpty(m43673d)) {
                    m43673d = ChipTextInputComboView.this.m43673d("00");
                }
                chip.setText(m43673d);
                return;
            }
            ChipTextInputComboView.this.f51136a.setText(ChipTextInputComboView.this.m43673d("00"));
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public void m43674c(InputFilter inputFilter) {
        InputFilter[] filters = this.f51138c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f51138c.setFilters(inputFilterArr);
    }

    /* renamed from: d */
    public final String m43673d(CharSequence charSequence) {
        return C19580dU1.m31827a(getResources(), charSequence);
    }

    /* renamed from: e */
    public TextInputLayout m43672e() {
        return this.f51137b;
    }

    /* renamed from: f */
    public void m43671f(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f51136a, accessibilityDelegateCompat);
    }

    /* renamed from: g */
    public void m43670g(CharSequence charSequence) {
        String m43673d = m43673d(charSequence);
        this.f51136a.setText(m43673d);
        if (!TextUtils.isEmpty(m43673d)) {
            this.f51138c.removeTextChangedListener(this.f51139d);
            this.f51138c.setText(m43673d);
            this.f51138c.addTextChangedListener(this.f51139d);
        }
    }

    /* renamed from: h */
    public final void m43669h() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f51138c.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f51136a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m43669h();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.f51136a.setChecked(z);
        EditText editText = this.f51138c;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f51136a;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.f51138c);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f51136a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f51136a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f51136a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f51136a = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f51137b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f51138c = editText;
        editText.setVisibility(4);
        C7113b c7113b = new C7113b();
        this.f51139d = c7113b;
        editText.addTextChangedListener(c7113b);
        m43669h();
        addView(chip);
        addView(textInputLayout);
        this.f51140e = (TextView) findViewById(R.id.material_label);
        editText.setId(ViewCompat.generateViewId());
        ViewCompat.setLabelFor(this.f51140e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}