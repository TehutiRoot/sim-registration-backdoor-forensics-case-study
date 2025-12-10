package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.PackageRowShowOnlyBinding */
/* loaded from: classes7.dex */
public final class PackageRowShowOnlyBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84663a;
    @NonNull
    public final DtacFontTextView itemName;

    public PackageRowShowOnlyBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView) {
        this.f84663a = constraintLayout;
        this.itemName = dtacFontTextView;
    }

    @NonNull
    public static PackageRowShowOnlyBinding bind(@NonNull View view) {
        int i = R.id.itemName;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new PackageRowShowOnlyBinding((ConstraintLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PackageRowShowOnlyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PackageRowShowOnlyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.package_row_show_only, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84663a;
    }
}