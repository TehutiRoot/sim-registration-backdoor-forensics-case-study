package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRtrHistoryDatePagerBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRtrHistoryDatePagerBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84116a;
    @NonNull
    public final OneFontButton btnRetryHistorySell;
    @NonNull
    public final OneFontTextView dtacFontTextView4;
    @NonNull
    public final ConstraintLayout layoutEmptyHistory;
    @NonNull
    public final LinearLayout layoutTab;
    @NonNull
    public final MagicIndicator magicIndicator;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final ViewPager viewPager;

    public FragmentOneRtrHistoryDatePagerBinding(FrameLayout frameLayout, OneFontButton oneFontButton, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout, LinearLayout linearLayout, MagicIndicator magicIndicator, OneTabLayout oneTabLayout, ViewPager viewPager) {
        this.f84116a = frameLayout;
        this.btnRetryHistorySell = oneFontButton;
        this.dtacFontTextView4 = oneFontTextView;
        this.layoutEmptyHistory = constraintLayout;
        this.layoutTab = linearLayout;
        this.magicIndicator = magicIndicator;
        this.tabLayout = oneTabLayout;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentOneRtrHistoryDatePagerBinding bind(@NonNull View view) {
        int i = R.id.btn_retry_history_sell;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.dtacFontTextView4;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
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
                            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                            if (oneTabLayout != null) {
                                i = R.id.view_pager;
                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                if (viewPager != null) {
                                    return new FragmentOneRtrHistoryDatePagerBinding((FrameLayout) view, oneFontButton, oneFontTextView, constraintLayout, linearLayout, magicIndicator, oneTabLayout, viewPager);
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
    public static FragmentOneRtrHistoryDatePagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRtrHistoryDatePagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_rtr_history_date_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84116a;
    }
}
