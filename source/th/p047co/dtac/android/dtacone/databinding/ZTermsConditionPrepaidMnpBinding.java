package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZTermsConditionPrepaidMnpBinding */
/* loaded from: classes7.dex */
public final class ZTermsConditionPrepaidMnpBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84703a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ImageView iconDtac;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final DtacFontTextView tvTermsCondition;
    @NonNull
    public final DtacFontTextView tvTitle;

    public ZTermsConditionPrepaidMnpBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, ImageView imageView, NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84703a = relativeLayout;
        this.btnOk = dtacFontButton;
        this.iconDtac = imageView;
        this.scrollView = nestedScrollView;
        this.tvTermsCondition = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static ZTermsConditionPrepaidMnpBinding bind(@NonNull View view) {
        int i = R.id.btn_ok;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.icon_dtac;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.scrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = R.id.tvTermsCondition;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvTitle;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new ZTermsConditionPrepaidMnpBinding((RelativeLayout) view, dtacFontButton, imageView, nestedScrollView, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZTermsConditionPrepaidMnpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZTermsConditionPrepaidMnpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_terms_condition_prepaid_mnp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84703a;
    }
}
