package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleTrueVerifyCampaignBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleTrueVerifyCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83946a;
    @NonNull
    public final OneFontButton navigateTo4DScrollingCodeButton;
    @NonNull
    public final CardView oneDeviceSaleVerifyCampaignCardView;
    @NonNull
    public final FrameLayout oneDeviceSaleVerifyCampaignFrameLayout;
    @NonNull
    public final RecyclerView oneDeviceSaleVerifyCampaignRecyclerView;
    @NonNull
    public final OneFontTextView oneDeviceSaleVerifyCampaignTitleTextView;

    public FragmentOneDeviceSaleTrueVerifyCampaignBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, CardView cardView, FrameLayout frameLayout, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f83946a = nestedScrollView;
        this.navigateTo4DScrollingCodeButton = oneFontButton;
        this.oneDeviceSaleVerifyCampaignCardView = cardView;
        this.oneDeviceSaleVerifyCampaignFrameLayout = frameLayout;
        this.oneDeviceSaleVerifyCampaignRecyclerView = recyclerView;
        this.oneDeviceSaleVerifyCampaignTitleTextView = oneFontTextView;
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueVerifyCampaignBinding bind(@NonNull View view) {
        int i = R.id.navigateTo4DScrollingCodeButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.oneDeviceSaleVerifyCampaignCardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.oneDeviceSaleVerifyCampaignFrameLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.oneDeviceSaleVerifyCampaignRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.oneDeviceSaleVerifyCampaignTitleTextView;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new FragmentOneDeviceSaleTrueVerifyCampaignBinding((NestedScrollView) view, oneFontButton, cardView, frameLayout, recyclerView, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueVerifyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueVerifyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_true_verify_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83946a;
    }
}
