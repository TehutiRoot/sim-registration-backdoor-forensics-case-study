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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSuccessPackageSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentSuccessPackageSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84204a;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final DtacFontButton btnPackageSummary;
    @NonNull
    public final DtacFontTextView dtacFontTextView51;
    @NonNull
    public final DtacFontTextView dtacFontTextView52;
    @NonNull
    public final ImageView imageView26;

    public FragmentSuccessPackageSummaryBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, ImageView imageView) {
        this.f84204a = constraintLayout;
        this.btnGoHome = dtacFontButton;
        this.btnPackageSummary = dtacFontButton2;
        this.dtacFontTextView51 = dtacFontTextView;
        this.dtacFontTextView52 = dtacFontTextView2;
        this.imageView26 = imageView;
    }

    @NonNull
    public static FragmentSuccessPackageSummaryBinding bind(@NonNull View view) {
        int i = R.id.btnGoHome;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnPackageSummary;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.dtacFontTextView51;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.dtacFontTextView52;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.imageView26;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            return new FragmentSuccessPackageSummaryBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, dtacFontTextView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSuccessPackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSuccessPackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_success_package_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84204a;
    }
}
