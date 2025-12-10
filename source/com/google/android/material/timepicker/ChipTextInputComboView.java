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
    public final Chip f51124a;

    /* renamed from: b */
    public final TextInputLayout f51125b;

    /* renamed from: c */
    public final EditText f51126c;

    /* renamed from: d */
    public TextWatcher f51127d;

    /* renamed from: e */
    public TextView f51128e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes4.dex */
    public class C7124b extends TextWatcherAdapter {
        public C7124b() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                String m43686d = ChipTextInputComboView.this.m43686d(editable);
                Chip chip = ChipTextInputComboView.this.f51124a;
                if (TextUtils.isEmpty(m43686d)) {
                    m43686d = ChipTextInputComboView.this.m43686d("00");
                }
                chip.setText(m43686d);
                return;
            }
            ChipTextInputComboView.this.f51124a.setText(ChipTextInputComboView.this.m43686d("00"));
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public void m43687c(InputFilter inputFilter) {
        InputFilter[] filters = this.f51126c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f51126c.setFilters(inputFilterArr);
    }

    /* renamed from: d */
    public final String m43686d(CharSequence charSequence) {
        return C20044gT1.m31125a(getResources(), charSequence);
    }

    /* renamed from: e */
    public TextInputLayout m43685e() {
        return this.f51125b;
    }

    /* renamed from: f */
    public void m43684f(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f51124a, accessibilityDelegateCompat);
    }

    /* renamed from: g */
    public void m43683g(CharSequence charSequence) {
        String m43686d = m43686d(charSequence);
        this.f51124a.setText(m43686d);
        if (!TextUtils.isEmpty(m43686d)) {
            this.f51126c.removeTextChangedListener(this.f51127d);
            this.f51126c.setText(m43686d);
            this.f51126c.addTextChangedListener(this.f51127d);
        }
    }

    /* renamed from: h */
    public final void m43682h() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f51126c.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f51124a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m43682h();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.f51124a.setChecked(z);
        EditText editText = this.f51126c;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f51124a;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.f51126c);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f51124a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f51124a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f51124a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f51124a = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f51125b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f51126c = editText;
        editText.setVisibility(4);
        C7124b c7124b = new C7124b();
        this.f51127d = c7124b;
        editText.addTextChangedListener(c7124b);
        m43682h();
        addView(chip);
        addView(textInputLayout);
        this.f51128e = (TextView) findViewById(R.id.material_label);
        editText.setId(ViewCompat.generateViewId());
        ViewCompat.setLabelFor(this.f51128e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
