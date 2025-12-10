package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogChangeMainPackageBinding */
/* loaded from: classes7.dex */
public final class OneDialogChangeMainPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84440a;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final Guideline contentGuideline;
    @NonNull
    public final Guideline contentGuideline2;
    @NonNull
    public final FrameLayout frameLayout2;
    @NonNull
    public final ConstraintLayout layoutPackage;
    @NonNull
    public final LinearLayout okCancelBox;
    @NonNull
    public final OneFontTextView tvMainPackage;
    @NonNull
    public final OneFontTextView tvPackageLabel;
    @NonNull
    public final OneFontTextView tvStartDt;
    @NonNull
    public final OneFontTextView tvTitleConfirmShop;

    public OneDialogChangeMainPackageBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, Guideline guideline, Guideline guideline2, FrameLayout frameLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84440a = constraintLayout;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.contentGuideline = guideline;
        this.contentGuideline2 = guideline2;
        this.frameLayout2 = frameLayout;
        this.layoutPackage = constraintLayout2;
        this.okCancelBox = linearLayout;
        this.tvMainPackage = oneFontTextView;
        this.tvPackageLabel = oneFontTextView2;
        this.tvStartDt = oneFontTextView3;
        this.tvTitleConfirmShop = oneFontTextView4;
    }

    @NonNull
    public static OneDialogChangeMainPackageBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnOk;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.contentGuideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.contentGuideline2;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = R.id.frameLayout2;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.layoutPackage;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = R.id.ok_cancel_box;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.tvMainPackage;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null) {
                                        i = R.id.tvPackageLabel;
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            i = R.id.tvStartDt;
                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView3 != null) {
                                                i = R.id.tvTitleConfirmShop;
                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView4 != null) {
                                                    return new OneDialogChangeMainPackageBinding((ConstraintLayout) view, oneFontButton, oneFontButton2, guideline, guideline2, frameLayout, constraintLayout, linearLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                                                }
                                            }
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
    public static OneDialogChangeMainPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogChangeMainPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_change_main_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84440a;
    }
}
