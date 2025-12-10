package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.DtacViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolListCardBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolListCardBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83749a;
    @NonNull
    public final View aline;
    @NonNull
    public final IncBuyDolSummaryBinding incBuyDolSummary;
    @NonNull
    public final RelativeLayout summaryContainer;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final DtacViewPager viewPager;

    public FragmentBuyDolListCardBinding(LinearLayout linearLayout, View view, IncBuyDolSummaryBinding incBuyDolSummaryBinding, RelativeLayout relativeLayout, DtacTabLayout dtacTabLayout, DtacViewPager dtacViewPager) {
        this.f83749a = linearLayout;
        this.aline = view;
        this.incBuyDolSummary = incBuyDolSummaryBinding;
        this.summaryContainer = relativeLayout;
        this.tabLayout = dtacTabLayout;
        this.viewPager = dtacViewPager;
    }

    @NonNull
    public static FragmentBuyDolListCardBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.aline;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incBuyDolSummary))) != null) {
            IncBuyDolSummaryBinding bind = IncBuyDolSummaryBinding.bind(findChildViewById);
            i = R.id.summaryContainer;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.tabLayout;
                DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                if (dtacTabLayout != null) {
                    i = R.id.viewPager;
                    DtacViewPager dtacViewPager = (DtacViewPager) ViewBindings.findChildViewById(view, i);
                    if (dtacViewPager != null) {
                        return new FragmentBuyDolListCardBinding((LinearLayout) view, findChildViewById2, bind, relativeLayout, dtacTabLayout, dtacViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolListCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolListCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_list_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83749a;
    }
}