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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83896a;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final DtacFontTextView tvHeader;
    @NonNull
    public final DtacFontTextView tvMessageSimStock;
    @NonNull
    public final DtacFontTextView tvSubMessage;

    public FragmentMrtrMnpSuccessBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83896a = constraintLayout;
        this.btnGoHome = dtacFontButton;
        this.imageIconSuccess = imageView;
        this.tvHeader = dtacFontTextView;
        this.tvMessageSimStock = dtacFontTextView2;
        this.tvSubMessage = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMrtrMnpSuccessBinding bind(@NonNull View view) {
        int i = R.id.btn_go_home;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.imageIconSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvHeader;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvMessageSimStock;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvSubMessage;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            return new FragmentMrtrMnpSuccessBinding((ConstraintLayout) view, dtacFontButton, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83896a;
    }
}