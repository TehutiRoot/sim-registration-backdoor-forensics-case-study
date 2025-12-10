package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.C7142d;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;

/* renamed from: com.google.android.material.timepicker.d */
/* loaded from: classes4.dex */
public class C7142d implements TimePickerView.InterfaceC7136f, InterfaceC20904lT1 {

    /* renamed from: a */
    public final LinearLayout f51231a;

    /* renamed from: b */
    public final C20044gT1 f51232b;

    /* renamed from: c */
    public final TextWatcher f51233c = new C7143a();

    /* renamed from: d */
    public final TextWatcher f51234d = new C7144b();

    /* renamed from: e */
    public final ChipTextInputComboView f51235e;

    /* renamed from: f */
    public final ChipTextInputComboView f51236f;

    /* renamed from: g */
    public final View$OnKeyListenerC7141c f51237g;

    /* renamed from: h */
    public final EditText f51238h;

    /* renamed from: i */
    public final EditText f51239i;

    /* renamed from: j */
    public MaterialButtonToggleGroup f51240j;

    /* renamed from: com.google.android.material.timepicker.d$a */
    /* loaded from: classes4.dex */
    public class C7143a extends TextWatcherAdapter {
        public C7143a() {
            C7142d.this = r1;
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C7142d.this.f51232b.m31116j(0);
                    return;
                }
                C7142d.this.f51232b.m31116j(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.d$b */
    /* loaded from: classes4.dex */
    public class C7144b extends TextWatcherAdapter {
        public C7144b() {
            C7142d.this = r1;
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C7142d.this.f51232b.m31118h(0);
                    return;
                }
                C7142d.this.f51232b.m31118h(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.d$c */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7145c implements View.OnClickListener {
        public View$OnClickListenerC7145c() {
            C7142d.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7142d.this.mo43584b(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* renamed from: com.google.android.material.timepicker.d$d */
    /* loaded from: classes4.dex */
    public class C7146d extends AbstractC1635Wp {

        /* renamed from: e */
        public final /* synthetic */ C20044gT1 f51244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7146d(Context context, int i, C20044gT1 c20044gT1) {
            super(context, i);
            C7142d.this = r1;
            this.f51244e = c20044gT1;
        }

        @Override // p000.AbstractC1635Wp, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(this.f51244e.m31123c(), String.valueOf(this.f51244e.m31122d())));
        }
    }

    /* renamed from: com.google.android.material.timepicker.d$e */
    /* loaded from: classes4.dex */
    public class C7147e extends AbstractC1635Wp {

        /* renamed from: e */
        public final /* synthetic */ C20044gT1 f51246e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7147e(Context context, int i, C20044gT1 c20044gT1) {
            super(context, i);
            C7142d.this = r1;
            this.f51246e = c20044gT1;
        }

        @Override // p000.AbstractC1635Wp, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f51246e.f62178e)));
        }
    }

    public C7142d(LinearLayout linearLayout, C20044gT1 c20044gT1) {
        this.f51231a = linearLayout;
        this.f51232b = c20044gT1;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f51235e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f51236f = chipTextInputComboView2;
        ((TextView) chipTextInputComboView.findViewById(R.id.material_label)).setText(resources.getString(R.string.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(R.id.material_label)).setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (c20044gT1.f62176c == 0) {
            m43575k();
        }
        View$OnClickListenerC7145c view$OnClickListenerC7145c = new View$OnClickListenerC7145c();
        chipTextInputComboView2.setOnClickListener(view$OnClickListenerC7145c);
        chipTextInputComboView.setOnClickListener(view$OnClickListenerC7145c);
        chipTextInputComboView2.m43687c(c20044gT1.m31121e());
        chipTextInputComboView.m43687c(c20044gT1.m31120f());
        this.f51238h = chipTextInputComboView2.m43685e().getEditText();
        this.f51239i = chipTextInputComboView.m43685e().getEditText();
        this.f51237g = new View$OnKeyListenerC7141c(chipTextInputComboView2, chipTextInputComboView, c20044gT1);
        chipTextInputComboView2.m43684f(new C7146d(linearLayout.getContext(), R.string.material_hour_selection, c20044gT1));
        chipTextInputComboView.m43684f(new C7147e(linearLayout.getContext(), R.string.material_minute_selection, c20044gT1));
        m43580f();
    }

    /* renamed from: a */
    public static /* synthetic */ void m43585a(C7142d c7142d, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        c7142d.m43579g(materialButtonToggleGroup, i, z);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC7136f
    /* renamed from: b */
    public void mo43584b(int i) {
        boolean z;
        this.f51232b.f62179f = i;
        ChipTextInputComboView chipTextInputComboView = this.f51235e;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f51236f;
        if (i == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
        m43574l();
    }

    /* renamed from: d */
    public final void m43582d() {
        this.f51238h.addTextChangedListener(this.f51234d);
        this.f51239i.addTextChangedListener(this.f51233c);
    }

    /* renamed from: e */
    public void m43581e() {
        this.f51235e.setChecked(false);
        this.f51236f.setChecked(false);
    }

    /* renamed from: f */
    public void m43580f() {
        m43582d();
        m43576j(this.f51232b);
        this.f51237g.m43590a();
    }

    /* renamed from: g */
    public final /* synthetic */ void m43579g(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2;
        if (!z) {
            return;
        }
        if (i == R.id.material_clock_period_pm_button) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.f51232b.m31115k(i2);
    }

    /* renamed from: h */
    public final void m43578h() {
        this.f51238h.removeTextChangedListener(this.f51234d);
        this.f51239i.removeTextChangedListener(this.f51233c);
    }

    @Override // p000.InterfaceC20904lT1
    public void hide() {
        View focusedChild = this.f51231a.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild);
        }
        this.f51231a.setVisibility(8);
    }

    /* renamed from: i */
    public void m43577i() {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.f51235e;
        boolean z2 = false;
        if (this.f51232b.f62179f == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f51236f;
        if (this.f51232b.f62179f == 10) {
            z2 = true;
        }
        chipTextInputComboView2.setChecked(z2);
    }

    @Override // p000.InterfaceC20904lT1
    public void invalidate() {
        m43576j(this.f51232b);
    }

    /* renamed from: j */
    public final void m43576j(C20044gT1 c20044gT1) {
        m43578h();
        Locale locale = this.f51231a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(c20044gT1.f62178e));
        String format2 = String.format(locale, "%02d", Integer.valueOf(c20044gT1.m31122d()));
        this.f51235e.m43683g(format);
        this.f51236f.m43683g(format2);
        m43582d();
        m43574l();
    }

    /* renamed from: k */
    public final void m43575k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f51231a.findViewById(R.id.material_clock_period_toggle);
        this.f51240j = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: mT1
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i, boolean z) {
                C7142d.m43585a(C7142d.this, materialButtonToggleGroup2, i, z);
            }
        });
        this.f51240j.setVisibility(0);
        m43574l();
    }

    /* renamed from: l */
    public final void m43574l() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f51240j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.f51232b.f62180g == 0) {
            i = R.id.material_clock_period_am_button;
        } else {
            i = R.id.material_clock_period_pm_button;
        }
        materialButtonToggleGroup.check(i);
    }

    @Override // p000.InterfaceC20904lT1
    public void show() {
        this.f51231a.setVisibility(0);
        mo43584b(this.f51232b.f62179f);
    }
}
