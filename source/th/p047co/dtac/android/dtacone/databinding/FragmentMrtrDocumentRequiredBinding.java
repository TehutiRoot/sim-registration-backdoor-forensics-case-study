package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrDocumentRequiredBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrDocumentRequiredBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83779a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final ImageView iconAccount;
    @NonNull
    public final ImageView imageView19;
    @NonNull
    public final LinearLayout linearLayout7;
    @NonNull
    public final LinearLayout linearLayout8;
    @NonNull
    public final LinearLayout linearLayout9;
    @NonNull
    public final LinearLayout profileBox;
    @NonNull
    public final View view4;
    @NonNull
    public final View view5;
    @NonNull
    public final DtacFontTextView zTvRetailerProfileMobileNumber;
    @NonNull
    public final DtacFontTextView zTvRetailerProfileRtrName;

    public FragmentMrtrDocumentRequiredBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, View view, View view2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83779a = constraintLayout;
        this.btnNext = dtacFontButton;
        this.iconAccount = imageView;
        this.imageView19 = imageView2;
        this.linearLayout7 = linearLayout;
        this.linearLayout8 = linearLayout2;
        this.linearLayout9 = linearLayout3;
        this.profileBox = linearLayout4;
        this.view4 = view;
        this.view5 = view2;
        this.zTvRetailerProfileMobileNumber = dtacFontTextView;
        this.zTvRetailerProfileRtrName = dtacFontTextView2;
    }

    @NonNull
    public static FragmentMrtrDocumentRequiredBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.icon_account;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.imageView19;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.linearLayout7;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.linearLayout8;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.linearLayout9;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.profileBox;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view4))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view5))) != null) {
                                    i = R.id.z_tv_retailer_profile_mobile_number;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.z_tv_retailer_profile_rtr_name;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            return new FragmentMrtrDocumentRequiredBinding((ConstraintLayout) view, dtacFontButton, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, findChildViewById, findChildViewById2, dtacFontTextView, dtacFontTextView2);
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
    public static FragmentMrtrDocumentRequiredBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrDocumentRequiredBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_document_required, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83779a;
    }
}
