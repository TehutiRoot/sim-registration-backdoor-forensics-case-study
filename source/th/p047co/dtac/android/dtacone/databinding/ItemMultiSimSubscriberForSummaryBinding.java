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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMultiSimSubscriberForSummaryBinding */
/* loaded from: classes7.dex */
public final class ItemMultiSimSubscriberForSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84331a;
    @NonNull
    public final ConstraintLayout layoutItemSubscriber;
    @NonNull
    public final DtacFontTextView tvItemAct;
    @NonNull
    public final DtacFontTextView tvItemSubscriberValue;
    @NonNull
    public final View vSeparateLine;

    public ItemMultiSimSubscriberForSummaryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view) {
        this.f84331a = constraintLayout;
        this.layoutItemSubscriber = constraintLayout2;
        this.tvItemAct = dtacFontTextView;
        this.tvItemSubscriberValue = dtacFontTextView2;
        this.vSeparateLine = view;
    }

    @NonNull
    public static ItemMultiSimSubscriberForSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.tvItemAct;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvItemSubscriberValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
                return new ItemMultiSimSubscriberForSummaryBinding(constraintLayout, constraintLayout, dtacFontTextView, dtacFontTextView2, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMultiSimSubscriberForSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMultiSimSubscriberForSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_multi_sim_subscriber_for_summary, viewGroup, false);
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
