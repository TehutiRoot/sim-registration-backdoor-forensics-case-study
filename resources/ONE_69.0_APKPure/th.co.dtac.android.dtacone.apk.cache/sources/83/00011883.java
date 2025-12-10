package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.PackageRowAllTwolineAdvisoryBinding */
/* loaded from: classes7.dex */
public final class PackageRowAllTwolineAdvisoryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84658a;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final DtacFontTextView packageItem;
    @NonNull
    public final View view;

    public PackageRowAllTwolineAdvisoryBinding(ConstraintLayout constraintLayout, CardView cardView, DtacFontTextView dtacFontTextView, View view) {
        this.f84658a = constraintLayout;
        this.cardView = cardView;
        this.packageItem = dtacFontTextView;
        this.view = view;
    }

    @NonNull
    public static PackageRowAllTwolineAdvisoryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.packageItem;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view))) != null) {
                return new PackageRowAllTwolineAdvisoryBinding((ConstraintLayout) view, cardView, dtacFontTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PackageRowAllTwolineAdvisoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PackageRowAllTwolineAdvisoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.package_row_all_twoline_advisory, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84658a;
    }
}