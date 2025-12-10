package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimSubscriberListBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimSubscriberListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83911a;
    @NonNull
    public final RecyclerView rvAllSubscriber;
    @NonNull
    public final DtacFontTextView tvAllSubscriberTitle;
    @NonNull
    public final DtacFontTextView tvAllSubscriberUnit;
    @NonNull
    public final DtacFontTextView tvAllSubscriberValue;

    public FragmentMrtrMultiSimSubscriberListBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83911a = constraintLayout;
        this.rvAllSubscriber = recyclerView;
        this.tvAllSubscriberTitle = dtacFontTextView;
        this.tvAllSubscriberUnit = dtacFontTextView2;
        this.tvAllSubscriberValue = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMrtrMultiSimSubscriberListBinding bind(@NonNull View view) {
        int i = R.id.rvAllSubscriber;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.tvAllSubscriberTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvAllSubscriberUnit;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvAllSubscriberValue;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        return new FragmentMrtrMultiSimSubscriberListBinding((ConstraintLayout) view, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMultiSimSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_subscriber_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83911a;
    }
}