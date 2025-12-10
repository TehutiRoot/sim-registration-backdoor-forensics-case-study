package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.PackageRowChangePackBinding */
/* loaded from: classes7.dex */
public final class PackageRowChangePackBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84659a;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final TextView packageItem;
    @NonNull
    public final View view;

    public PackageRowChangePackBinding(ConstraintLayout constraintLayout, CardView cardView, TextView textView, View view) {
        this.f84659a = constraintLayout;
        this.cardView = cardView;
        this.packageItem = textView;
        this.view = view;
    }

    @NonNull
    public static PackageRowChangePackBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.packageItem;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view))) != null) {
                return new PackageRowChangePackBinding((ConstraintLayout) view, cardView, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PackageRowChangePackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PackageRowChangePackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.package_row_change_pack, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84659a;
    }
}