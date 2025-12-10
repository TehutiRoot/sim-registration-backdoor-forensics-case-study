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
import th.p047co.dtac.android.dtacone.widget.view.DtacEditTextColor;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrInputImeiBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrInputImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84348a;
    @NonNull
    public final RelativeLayout btnNext;
    @NonNull
    public final DtacEditTextColor etInputImei;
    @NonNull
    public final ProgressBar progressClickLogin;
    @NonNull
    public final DtacFontTextView tvBtnNext;

    public IncludeMrtrInputImeiBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, DtacEditTextColor dtacEditTextColor, ProgressBar progressBar, DtacFontTextView dtacFontTextView) {
        this.f84348a = linearLayout;
        this.btnNext = relativeLayout;
        this.etInputImei = dtacEditTextColor;
        this.progressClickLogin = progressBar;
        this.tvBtnNext = dtacFontTextView;
    }

    @NonNull
    public static IncludeMrtrInputImeiBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.etInputImei;
            DtacEditTextColor dtacEditTextColor = (DtacEditTextColor) ViewBindings.findChildViewById(view, i);
            if (dtacEditTextColor != null) {
                i = R.id.progressClickLogin;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.tvBtnNext;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new IncludeMrtrInputImeiBinding((LinearLayout) view, relativeLayout, dtacEditTextColor, progressBar, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeMrtrInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_input_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84348a;
    }
}