package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.DtacViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentKeyInTabBinding */
/* loaded from: classes7.dex */
public final class FragmentKeyInTabBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83857a;
    @NonNull
    public final FrameLayout btnOpenSmartCard;
    @NonNull
    public final DtacFontButton btnSwitchMode;
    @NonNull
    public final DtacViewPager pager;
    @NonNull
    public final DtacTabLayout tabs;
    @NonNull
    public final DtacFontButton tvSmartCardMode;

    public FragmentKeyInTabBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, DtacFontButton dtacFontButton, DtacViewPager dtacViewPager, DtacTabLayout dtacTabLayout, DtacFontButton dtacFontButton2) {
        this.f83857a = constraintLayout;
        this.btnOpenSmartCard = frameLayout;
        this.btnSwitchMode = dtacFontButton;
        this.pager = dtacViewPager;
        this.tabs = dtacTabLayout;
        this.tvSmartCardMode = dtacFontButton2;
    }

    @NonNull
    public static FragmentKeyInTabBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.btnSwitchMode;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.pager;
                DtacViewPager dtacViewPager = (DtacViewPager) ViewBindings.findChildViewById(view, i);
                if (dtacViewPager != null) {
                    i = R.id.tabs;
                    DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                    if (dtacTabLayout != null) {
                        i = R.id.tvSmartCardMode;
                        DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                        if (dtacFontButton2 != null) {
                            return new FragmentKeyInTabBinding((ConstraintLayout) view, frameLayout, dtacFontButton, dtacViewPager, dtacTabLayout, dtacFontButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentKeyInTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentKeyInTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_key_in_tab, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83857a;
    }
}