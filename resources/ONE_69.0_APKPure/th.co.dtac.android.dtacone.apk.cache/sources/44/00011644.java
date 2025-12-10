package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84083a;
    @NonNull
    public final OneFontButton buttonBackHome;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final ConstraintLayout layoutRemarkTrueCompany;
    @NonNull
    public final OneFontTextView textHeaderSuccess;
    @NonNull
    public final OneFontTextView textMobileNumber;
    @NonNull
    public final OneFontTextView tvMessageSimStock;
    @NonNull
    public final OneFontTextView tvRemarkDesc;
    @NonNull
    public final OneFontTextView tvRemarkTitle;
    @NonNull
    public final OneFontTextView tvSIMSerial;

    public FragmentOneMnpSuccessBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, ImageView imageView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84083a = constraintLayout;
        this.buttonBackHome = oneFontButton;
        this.imageIconSuccess = imageView;
        this.layoutRemarkTrueCompany = constraintLayout2;
        this.textHeaderSuccess = oneFontTextView;
        this.textMobileNumber = oneFontTextView2;
        this.tvMessageSimStock = oneFontTextView3;
        this.tvRemarkDesc = oneFontTextView4;
        this.tvRemarkTitle = oneFontTextView5;
        this.tvSIMSerial = oneFontTextView6;
    }

    @NonNull
    public static FragmentOneMnpSuccessBinding bind(@NonNull View view) {
        int i = R.id.buttonBackHome;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.imageIconSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layoutRemarkTrueCompany;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.textHeaderSuccess;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.textMobileNumber;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.tvMessageSimStock;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.tvRemarkDesc;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    i = R.id.tvRemarkTitle;
                                    OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView5 != null) {
                                        i = R.id.tvSIMSerial;
                                        OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView6 != null) {
                                            return new FragmentOneMnpSuccessBinding((ConstraintLayout) view, oneFontButton, imageView, constraintLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
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
    public static FragmentOneMnpSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84083a;
    }
}