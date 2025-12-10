package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePrepaidCampaignListBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePrepaidCampaignListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84079a;
    @NonNull
    public final FrameLayout frameLayout2;
    @NonNull
    public final OneFontTextView oneFontTextView2;
    @NonNull
    public final RecyclerView rvCampaign;
    @NonNull
    public final View space1;
    @NonNull
    public final View space2;

    public FragmentOnePrepaidCampaignListBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, OneFontTextView oneFontTextView, RecyclerView recyclerView, View view, View view2) {
        this.f84079a = constraintLayout;
        this.frameLayout2 = frameLayout;
        this.oneFontTextView2 = oneFontTextView;
        this.rvCampaign = recyclerView;
        this.space1 = view;
        this.space2 = view2;
    }

    @NonNull
    public static FragmentOnePrepaidCampaignListBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.frameLayout2;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.oneFontTextView2;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.rvCampaign;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.space1))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.space2))) != null) {
                    return new FragmentOnePrepaidCampaignListBinding((ConstraintLayout) view, frameLayout, oneFontTextView, recyclerView, findChildViewById, findChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePrepaidCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePrepaidCampaignListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_prepaid_campaign_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84079a;
    }
}
