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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentWithDeviceSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentWithDeviceSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84331a;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final DtacFontTextView dtacFontTextView5;
    @NonNull
    public final ImageView imageView14;
    @NonNull
    public final DtacFontTextView textView3;

    public FragmentWithDeviceSuccessBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, ImageView imageView, DtacFontTextView dtacFontTextView2) {
        this.f84331a = constraintLayout;
        this.btnGoHome = dtacFontButton;
        this.dtacFontTextView5 = dtacFontTextView;
        this.imageView14 = imageView;
        this.textView3 = dtacFontTextView2;
    }

    @NonNull
    public static FragmentWithDeviceSuccessBinding bind(@NonNull View view) {
        int i = R.id.btn_go_home;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.dtacFontTextView5;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.imageView14;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.textView3;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new FragmentWithDeviceSuccessBinding((ConstraintLayout) view, dtacFontButton, dtacFontTextView, imageView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentWithDeviceSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWithDeviceSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_with_device_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84331a;
    }
}