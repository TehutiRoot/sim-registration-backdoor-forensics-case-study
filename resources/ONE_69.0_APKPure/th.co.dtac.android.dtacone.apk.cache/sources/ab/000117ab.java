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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemNadOutboundInvoiceListBinding */
/* loaded from: classes7.dex */
public final class ItemNadOutboundInvoiceListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84442a;
    @NonNull
    public final OneFontTextView billDateItemTextView;
    @NonNull
    public final OneFontTextView dueDateItemTextView;
    @NonNull
    public final OneFontTextView overDueDateItemTextView;
    @NonNull
    public final ImageView paymentStatusItemImageView;
    @NonNull
    public final OneFontTextView paymentStatusItemTextView;

    public ItemNadOutboundInvoiceListBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, ImageView imageView, OneFontTextView oneFontTextView4) {
        this.f84442a = constraintLayout;
        this.billDateItemTextView = oneFontTextView;
        this.dueDateItemTextView = oneFontTextView2;
        this.overDueDateItemTextView = oneFontTextView3;
        this.paymentStatusItemImageView = imageView;
        this.paymentStatusItemTextView = oneFontTextView4;
    }

    @NonNull
    public static ItemNadOutboundInvoiceListBinding bind(@NonNull View view) {
        int i = R.id.billDateItemTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.dueDateItemTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.overDueDateItemTextView;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.paymentStatusItemImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.paymentStatusItemTextView;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            return new ItemNadOutboundInvoiceListBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3, imageView, oneFontTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNadOutboundInvoiceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNadOutboundInvoiceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_nad_outbound_invoice_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84442a;
    }
}