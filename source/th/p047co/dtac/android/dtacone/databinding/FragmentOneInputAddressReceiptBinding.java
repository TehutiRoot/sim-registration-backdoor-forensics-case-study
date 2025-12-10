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
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputAddressReceiptBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputAddressReceiptBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83958a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final ConstraintLayout layoutAddressOther;
    @NonNull
    public final OneIncludeInputAddressReceiptBinding layoutAddressRegistrant;
    @NonNull
    public final OneIncludeBulletInputAddressReceiptBinding layoutBullet;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentOneInputAddressReceiptBinding(LinearLayoutCompat linearLayoutCompat, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding, ConstraintLayout constraintLayout, OneIncludeInputAddressReceiptBinding oneIncludeInputAddressReceiptBinding, OneIncludeBulletInputAddressReceiptBinding oneIncludeBulletInputAddressReceiptBinding, OneTabLayout oneTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83958a = linearLayoutCompat;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
        this.layoutAddressOther = constraintLayout;
        this.layoutAddressRegistrant = oneIncludeInputAddressReceiptBinding;
        this.layoutBullet = oneIncludeBulletInputAddressReceiptBinding;
        this.tabLayout = oneTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentOneInputAddressReceiptBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnOpenSmartCard;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            OneIncludeSwitchModeCameraBinding bind = OneIncludeSwitchModeCameraBinding.bind(findChildViewById2);
            i = R.id.layout_address_other;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layout_address_registrant))) != null) {
                OneIncludeInputAddressReceiptBinding bind2 = OneIncludeInputAddressReceiptBinding.bind(findChildViewById);
                i = R.id.layout_bullet;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    OneIncludeBulletInputAddressReceiptBinding bind3 = OneIncludeBulletInputAddressReceiptBinding.bind(findChildViewById3);
                    i = R.id.tabLayout;
                    OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                    if (oneTabLayout != null) {
                        i = R.id.viewPager;
                        WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                        if (wrapContentViewPager != null) {
                            return new FragmentOneInputAddressReceiptBinding((LinearLayoutCompat) view, bind, constraintLayout, bind2, bind3, oneTabLayout, wrapContentViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputAddressReceiptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_address_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83958a;
    }
}
