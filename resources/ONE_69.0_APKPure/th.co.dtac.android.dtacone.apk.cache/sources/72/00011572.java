package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimSignatureBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimSignatureBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83872a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacFontTextView dtacFontTextView18;
    @NonNull
    public final ImageView imageView18;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final ImageView ivTitleMobileNumber;
    @NonNull
    public final ConstraintLayout layourMobileNumber;
    @NonNull
    public final ConstraintLayout layoutCondition;
    @NonNull
    public final ConstraintLayout layoutTitleMobileNumber;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final ConstraintLayout topBar;
    @NonNull
    public final DtacFontTextView tvChangeSimCondition;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberLabel;
    @NonNull
    public final DtacFontTextView tvSignature;
    @NonNull
    public final DtacFontTextView tvSignatureHelper;
    @NonNull
    public final DtacFontTextView tvSignatureTextHelper;
    @NonNull
    public final DtacFontTextView tvTitleMobileNumber;

    public FragmentMrtrChangeSimSignatureBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FrameLayout frameLayout, ConstraintLayout constraintLayout4, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8) {
        this.f83872a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.dtacFontTextView18 = dtacFontTextView;
        this.imageView18 = imageView;
        this.ivSignature = imageView2;
        this.ivTitleMobileNumber = imageView3;
        this.layourMobileNumber = constraintLayout;
        this.layoutCondition = constraintLayout2;
        this.layoutTitleMobileNumber = constraintLayout3;
        this.signatureBox = frameLayout;
        this.topBar = constraintLayout4;
        this.tvChangeSimCondition = dtacFontTextView2;
        this.tvPhoneNumber = dtacFontTextView3;
        this.tvPhoneNumberLabel = dtacFontTextView4;
        this.tvSignature = dtacFontTextView5;
        this.tvSignatureHelper = dtacFontTextView6;
        this.tvSignatureTextHelper = dtacFontTextView7;
        this.tvTitleMobileNumber = dtacFontTextView8;
    }

    @NonNull
    public static FragmentMrtrChangeSimSignatureBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.dtacFontTextView18;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.imageView18;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivSignature;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.ivTitleMobileNumber;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.layourMobileNumber;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = R.id.layoutCondition;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = R.id.layoutTitleMobileNumber;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = R.id.signatureBox;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.topBar;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout4 != null) {
                                                i = R.id.tvChangeSimCondition;
                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView2 != null) {
                                                    i = R.id.tvPhoneNumber;
                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView3 != null) {
                                                        i = R.id.tvPhoneNumberLabel;
                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView4 != null) {
                                                            i = R.id.tvSignature;
                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView5 != null) {
                                                                i = R.id.tvSignatureHelper;
                                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView6 != null) {
                                                                    i = R.id.tvSignatureTextHelper;
                                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView7 != null) {
                                                                        i = R.id.tvTitleMobileNumber;
                                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView8 != null) {
                                                                            return new FragmentMrtrChangeSimSignatureBinding((NestedScrollView) view, dtacFontButton, dtacFontTextView, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, constraintLayout3, frameLayout, constraintLayout4, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrChangeSimSignatureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimSignatureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_signature, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83872a;
    }
}