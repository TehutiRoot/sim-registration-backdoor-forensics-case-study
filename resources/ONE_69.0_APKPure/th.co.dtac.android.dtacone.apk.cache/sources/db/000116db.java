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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneVerifyCampaignBinding */
/* loaded from: classes7.dex */
public final class FragmentOneVerifyCampaignBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84234a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final CardView cardView6;
    @NonNull
    public final FrameLayout frameLayout4;
    @NonNull
    public final RecyclerView listView;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneVerifyCampaignBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, CardView cardView, FrameLayout frameLayout, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f84234a = nestedScrollView;
        this.btnNext = oneFontButton;
        this.cardView6 = cardView;
        this.frameLayout4 = frameLayout;
        this.listView = recyclerView;
        this.tvTitle = oneFontTextView;
    }

    @NonNull
    public static FragmentOneVerifyCampaignBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardView6;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.frameLayout4;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.listView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.tvTitle;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new FragmentOneVerifyCampaignBinding((NestedScrollView) view, oneFontButton, cardView, frameLayout, recyclerView, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneVerifyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneVerifyCampaignBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_verify_campaign, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84234a;
    }
}