package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeMrtrInputImeiBinding */
/* loaded from: classes7.dex */
public final class OneIncludeMrtrInputImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84583a;
    @NonNull
    public final RelativeLayout btnNext;
    @NonNull
    public final OneCustomClearableEditText etInputImei;
    @NonNull
    public final ProgressBar progressClickLogin;
    @NonNull
    public final OneFontTextView tvBtnNext;

    public OneIncludeMrtrInputImeiBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, OneCustomClearableEditText oneCustomClearableEditText, ProgressBar progressBar, OneFontTextView oneFontTextView) {
        this.f84583a = linearLayout;
        this.btnNext = relativeLayout;
        this.etInputImei = oneCustomClearableEditText;
        this.progressClickLogin = progressBar;
        this.tvBtnNext = oneFontTextView;
    }

    @NonNull
    public static OneIncludeMrtrInputImeiBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.etInputImei;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.progressClickLogin;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.tvBtnNext;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneIncludeMrtrInputImeiBinding((LinearLayout) view, relativeLayout, oneCustomClearableEditText, progressBar, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeMrtrInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeMrtrInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_mrtr_input_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84583a;
    }
}