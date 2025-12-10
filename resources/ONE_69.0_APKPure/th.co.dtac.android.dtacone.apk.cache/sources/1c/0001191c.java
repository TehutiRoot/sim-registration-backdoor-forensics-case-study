package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZTermsConditionDialogBinding */
/* loaded from: classes7.dex */
public final class ZTermsConditionDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84811a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final DtacCheckBox chkAccept;
    @NonNull
    public final AppCompatImageView ivScrollDown;
    @NonNull
    public final RecyclerView rvTermCondition;
    @NonNull
    public final DtacFontTextView termsConditionTvConsentVersion;
    @NonNull
    public final DtacFontTextView tvTitle;

    public ZTermsConditionDialogBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, DtacCheckBox dtacCheckBox, AppCompatImageView appCompatImageView, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84811a = relativeLayout;
        this.btnOk = dtacFontButton;
        this.chkAccept = dtacCheckBox;
        this.ivScrollDown = appCompatImageView;
        this.rvTermCondition = recyclerView;
        this.termsConditionTvConsentVersion = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static ZTermsConditionDialogBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.chkAccept;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.ivScrollDown;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.rvTermCondition;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.terms_condition_tv_consent_version;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvTitle;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                return new ZTermsConditionDialogBinding((RelativeLayout) view, dtacFontButton, dtacCheckBox, appCompatImageView, recyclerView, dtacFontTextView, dtacFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZTermsConditionDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZTermsConditionDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_terms_condition_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84811a;
    }
}