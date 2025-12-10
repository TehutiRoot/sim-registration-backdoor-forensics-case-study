package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import net.lucode.hackware.magicindicator.MagicIndicator;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentHistoryDatePagerBinding */
/* loaded from: classes7.dex */
public final class FragmentHistoryDatePagerBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83850a;
    @NonNull
    public final Button btnRetryHistorySell;
    @NonNull
    public final DtacFontTextView dtacFontTextView4;
    @NonNull
    public final ConstraintLayout layoutEmptyHistory;
    @NonNull
    public final LinearLayout layoutTab;
    @NonNull
    public final MagicIndicator magicIndicator;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final ViewPager viewPager;

    public FragmentHistoryDatePagerBinding(FrameLayout frameLayout, Button button, DtacFontTextView dtacFontTextView, ConstraintLayout constraintLayout, LinearLayout linearLayout, MagicIndicator magicIndicator, DtacTabLayout dtacTabLayout, ViewPager viewPager) {
        this.f83850a = frameLayout;
        this.btnRetryHistorySell = button;
        this.dtacFontTextView4 = dtacFontTextView;
        this.layoutEmptyHistory = constraintLayout;
        this.layoutTab = linearLayout;
        this.magicIndicator = magicIndicator;
        this.tabLayout = dtacTabLayout;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentHistoryDatePagerBinding bind(@NonNull View view) {
        int i = R.id.btn_retry_history_sell;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.dtacFontTextView4;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.layoutEmptyHistory;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.layout_tab;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.magic_indicator;
                        MagicIndicator magicIndicator = (MagicIndicator) ViewBindings.findChildViewById(view, i);
                        if (magicIndicator != null) {
                            i = R.id.tabLayout;
                            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                            if (dtacTabLayout != null) {
                                i = R.id.view_pager;
                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                if (viewPager != null) {
                                    return new FragmentHistoryDatePagerBinding((FrameLayout) view, button, dtacFontTextView, constraintLayout, linearLayout, magicIndicator, dtacTabLayout, viewPager);
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
    public static FragmentHistoryDatePagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentHistoryDatePagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_history_date_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83850a;
    }
}