package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83874a;
    @NonNull
    public final LinearLayoutCompat btnGoHome;
    @NonNull
    public final LinearLayoutCompat btnPrintReceipt;
    @NonNull
    public final ImageView ivSuccess;
    @NonNull
    public final DtacFontTextView tvCheckSimStock;

    public FragmentMrtrChangeSimSuccessBinding(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f83874a = nestedScrollView;
        this.btnGoHome = linearLayoutCompat;
        this.btnPrintReceipt = linearLayoutCompat2;
        this.ivSuccess = imageView;
        this.tvCheckSimStock = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrChangeSimSuccessBinding bind(@NonNull View view) {
        int i = R.id.btnGoHome;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.btnPrintReceipt;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.ivSuccess;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tvCheckSimStock;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new FragmentMrtrChangeSimSuccessBinding((NestedScrollView) view, linearLayoutCompat, linearLayoutCompat2, imageView, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrChangeSimSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83874a;
    }
}