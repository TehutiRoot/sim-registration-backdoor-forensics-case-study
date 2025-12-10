package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidAddressReceiptBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidAddressReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83956a;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final ConstraintLayout layoutAddressOther;
    @NonNull
    public final ZIncludeMrtrInputAddressReceiptBinding layoutAddressRegistrant;
    @NonNull
    public final ZIncludeMrtrBulletInputAddressReceiptBinding layoutBullet;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentMrtrPrepaidAddressReceiptBinding(LinearLayoutCompat linearLayoutCompat, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, ConstraintLayout constraintLayout, ZIncludeMrtrInputAddressReceiptBinding zIncludeMrtrInputAddressReceiptBinding, ZIncludeMrtrBulletInputAddressReceiptBinding zIncludeMrtrBulletInputAddressReceiptBinding, DtacTabLayout dtacTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83956a = linearLayoutCompat;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.layoutAddressOther = constraintLayout;
        this.layoutAddressRegistrant = zIncludeMrtrInputAddressReceiptBinding;
        this.layoutBullet = zIncludeMrtrBulletInputAddressReceiptBinding;
        this.tabLayout = dtacTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentMrtrPrepaidAddressReceiptBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnOpenSmartCard;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById2);
            i = R.id.layout_address_other;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layout_address_registrant))) != null) {
                ZIncludeMrtrInputAddressReceiptBinding bind2 = ZIncludeMrtrInputAddressReceiptBinding.bind(findChildViewById);
                i = R.id.layout_bullet;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    ZIncludeMrtrBulletInputAddressReceiptBinding bind3 = ZIncludeMrtrBulletInputAddressReceiptBinding.bind(findChildViewById3);
                    i = R.id.tabLayout;
                    DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                    if (dtacTabLayout != null) {
                        i = R.id.viewPager;
                        WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                        if (wrapContentViewPager != null) {
                            return new FragmentMrtrPrepaidAddressReceiptBinding((LinearLayoutCompat) view, bind, constraintLayout, bind2, bind3, dtacTabLayout, wrapContentViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_address_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83956a;
    }
}