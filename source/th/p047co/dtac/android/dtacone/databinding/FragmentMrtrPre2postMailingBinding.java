package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postMailingBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postMailingBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83853a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacEditText edtBirthDay;
    @NonNull
    public final DtacClearableEditText edtName;
    @NonNull
    public final DtacClearableEditText edtSureName;
    @NonNull
    public final ToggleButton languageSelect;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final DtacFontTextView tvMailingTitle;
    @NonNull
    public final DtacFontTextView tvMsisdn;
    @NonNull
    public final DtacFontTextView tvProfileTitle;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentMrtrPre2postMailingBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacEditText dtacEditText, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, ToggleButton toggleButton, NestedScrollView nestedScrollView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83853a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.edtBirthDay = dtacEditText;
        this.edtName = dtacClearableEditText;
        this.edtSureName = dtacClearableEditText2;
        this.languageSelect = toggleButton;
        this.scrollView = nestedScrollView2;
        this.tvMailingTitle = dtacFontTextView;
        this.tvMsisdn = dtacFontTextView2;
        this.tvProfileTitle = dtacFontTextView3;
        this.tvTitle = dtacFontTextView4;
    }

    @NonNull
    public static FragmentMrtrPre2postMailingBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtBirthDay;
            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
            if (dtacEditText != null) {
                i = R.id.edtName;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.edtSureName;
                    DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText2 != null) {
                        i = R.id.languageSelect;
                        ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                        if (toggleButton != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                            i = R.id.tv_mailing_title;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvMsisdn;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvProfileTitle;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tvTitle;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            return new FragmentMrtrPre2postMailingBinding(nestedScrollView, dtacFontButton, dtacEditText, dtacClearableEditText, dtacClearableEditText2, toggleButton, nestedScrollView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPre2postMailingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postMailingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_mailing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83853a;
    }
}
