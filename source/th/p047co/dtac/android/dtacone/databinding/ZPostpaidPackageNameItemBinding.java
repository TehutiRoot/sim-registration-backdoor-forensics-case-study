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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPostpaidPackageNameItemBinding */
/* loaded from: classes7.dex */
public final class ZPostpaidPackageNameItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84686a;
    @NonNull
    public final ConstraintLayout cardView;
    @NonNull
    public final View divider;
    @NonNull
    public final ImageView imageView15;
    @NonNull
    public final DtacFontTextView tvPackageName;

    public ZPostpaidPackageNameItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84686a = constraintLayout;
        this.cardView = constraintLayout2;
        this.divider = view;
        this.imageView15 = imageView;
        this.tvPackageName = dtacFontTextView;
    }

    @NonNull
    public static ZPostpaidPackageNameItemBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.imageView15;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvPackageName;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ZPostpaidPackageNameItemBinding(constraintLayout, constraintLayout, findChildViewById, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZPostpaidPackageNameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPostpaidPackageNameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_postpaid_package_name_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84686a;
    }
}
