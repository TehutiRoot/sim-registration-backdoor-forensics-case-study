package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemNadOutboundListBinding */
/* loaded from: classes7.dex */
public final class ItemNadOutboundListBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84443a;
    @NonNull
    public final OneFontTextView beforePaymentBillItemTextView;
    @NonNull
    public final OneFontTextView beforePaymentBillValueItemTextView;
    @NonNull
    public final ConstraintLayout billPaymentLayout;
    @NonNull
    public final Guideline centerGuideline;
    @NonNull
    public final ImageView contactStatusImageView;
    @NonNull
    public final OneFontTextView contactStatusItemTextView;
    @NonNull
    public final OneFontTextView overdueBillItemTextView;
    @NonNull
    public final ConstraintLayout overdueBillLayout;
    @NonNull
    public final OneFontTextView overdueBillValueItemTextView;
    @NonNull
    public final OneFontTextView serviceNumberIdTitleTextView;
    @NonNull
    public final OneFontTextView serviceNumberValueTextView;
    @NonNull
    public final Guideline startGuideline;

    public ItemNadOutboundListBinding(CardView cardView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, Guideline guideline2) {
        this.f84443a = cardView;
        this.beforePaymentBillItemTextView = oneFontTextView;
        this.beforePaymentBillValueItemTextView = oneFontTextView2;
        this.billPaymentLayout = constraintLayout;
        this.centerGuideline = guideline;
        this.contactStatusImageView = imageView;
        this.contactStatusItemTextView = oneFontTextView3;
        this.overdueBillItemTextView = oneFontTextView4;
        this.overdueBillLayout = constraintLayout2;
        this.overdueBillValueItemTextView = oneFontTextView5;
        this.serviceNumberIdTitleTextView = oneFontTextView6;
        this.serviceNumberValueTextView = oneFontTextView7;
        this.startGuideline = guideline2;
    }

    @NonNull
    public static ItemNadOutboundListBinding bind(@NonNull View view) {
        int i = R.id.beforePaymentBillItemTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.beforePaymentBillValueItemTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.billPaymentLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.centerGuideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.contactStatusImageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.contactStatusItemTextView;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.overdueBillItemTextView;
                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView4 != null) {
                                    i = R.id.overdueBillLayout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.overdueBillValueItemTextView;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            i = R.id.serviceNumberIdTitleTextView;
                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView6 != null) {
                                                i = R.id.serviceNumberValueTextView;
                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView7 != null) {
                                                    i = R.id.startGuideline;
                                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                    if (guideline2 != null) {
                                                        return new ItemNadOutboundListBinding((CardView) view, oneFontTextView, oneFontTextView2, constraintLayout, guideline, imageView, oneFontTextView3, oneFontTextView4, constraintLayout2, oneFontTextView5, oneFontTextView6, oneFontTextView7, guideline2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNadOutboundListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNadOutboundListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_nad_outbound_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84443a;
    }
}