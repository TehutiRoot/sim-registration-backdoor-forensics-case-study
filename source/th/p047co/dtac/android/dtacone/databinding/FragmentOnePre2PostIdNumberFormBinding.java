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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostIdNumberFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostIdNumberFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84057a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final OneTabLayout pre2PostTabLayout;
    @NonNull
    public final WrapContentViewPager pre2PostViewPager;

    public FragmentOnePre2PostIdNumberFormBinding(ConstraintLayout constraintLayout, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding, OneFontButton oneFontButton, OneTabLayout oneTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f84057a = constraintLayout;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
        this.nextButton = oneFontButton;
        this.pre2PostTabLayout = oneTabLayout;
        this.pre2PostViewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentOnePre2PostIdNumberFormBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeSwitchModeCameraBinding bind = OneIncludeSwitchModeCameraBinding.bind(findChildViewById);
            i = R.id.nextButton;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.pre2PostTabLayout;
                OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                if (oneTabLayout != null) {
                    i = R.id.pre2PostViewPager;
                    WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                    if (wrapContentViewPager != null) {
                        return new FragmentOnePre2PostIdNumberFormBinding((ConstraintLayout) view, bind, oneFontButton, oneTabLayout, wrapContentViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostIdNumberFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostIdNumberFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_id_number_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84057a;
    }
}
