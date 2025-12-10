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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemNadOutboundConvergenceListBinding */
/* loaded from: classes7.dex */
public final class ItemNadOutboundConvergenceListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84441a;
    @NonNull
    public final ImageView invoiceImageView;
    @NonNull
    public final OneFontTextView invoiceTypeTextView;
    @NonNull
    public final OneFontTextView invoiceValueTextView;

    public ItemNadOutboundConvergenceListBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84441a = constraintLayout;
        this.invoiceImageView = imageView;
        this.invoiceTypeTextView = oneFontTextView;
        this.invoiceValueTextView = oneFontTextView2;
    }

    @NonNull
    public static ItemNadOutboundConvergenceListBinding bind(@NonNull View view) {
        int i = R.id.invoiceImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.invoiceTypeTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.invoiceValueTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    return new ItemNadOutboundConvergenceListBinding((ConstraintLayout) view, imageView, oneFontTextView, oneFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNadOutboundConvergenceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNadOutboundConvergenceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_nad_outbound_convergence_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84441a;
    }
}