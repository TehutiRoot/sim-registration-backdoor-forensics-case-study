package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneProsermOnlineConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentOneProsermOnlineConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84194a;
    @NonNull
    public final OneBalanceBoxBinding balanceBox;
    @NonNull
    public final DtacSwipeRefresh confirmSwipeRefresh;
    @NonNull
    public final OnePinEditText edtConfirmPin;
    @NonNull
    public final ImageView icPhone;
    @NonNull
    public final OneFontTextView labelCheckData;
    @NonNull
    public final View line;
    @NonNull
    public final LinearLayoutCompat llvConfirmSubscriberNumber;
    @NonNull
    public final OneFontTextView tvConfirmSubscriberNumber;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvPricePackage;
    @NonNull
    public final OneFontTextView tvPriceUnit;
    @NonNull
    public final OneFontTextView tvPromotionName;

    public FragmentOneProsermOnlineConfirmBinding(FrameLayout frameLayout, OneBalanceBoxBinding oneBalanceBoxBinding, DtacSwipeRefresh dtacSwipeRefresh, OnePinEditText onePinEditText, ImageView imageView, OneFontTextView oneFontTextView, View view, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84194a = frameLayout;
        this.balanceBox = oneBalanceBoxBinding;
        this.confirmSwipeRefresh = dtacSwipeRefresh;
        this.edtConfirmPin = onePinEditText;
        this.icPhone = imageView;
        this.labelCheckData = oneFontTextView;
        this.line = view;
        this.llvConfirmSubscriberNumber = linearLayoutCompat;
        this.tvConfirmSubscriberNumber = oneFontTextView2;
        this.tvDescription = oneFontTextView3;
        this.tvPricePackage = oneFontTextView4;
        this.tvPriceUnit = oneFontTextView5;
        this.tvPromotionName = oneFontTextView6;
    }

    @NonNull
    public static FragmentOneProsermOnlineConfirmBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.balance_box;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            OneBalanceBoxBinding bind = OneBalanceBoxBinding.bind(findChildViewById2);
            i = R.id.confirmSwipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                i = R.id.edt_confirm_pin;
                OnePinEditText onePinEditText = (OnePinEditText) ViewBindings.findChildViewById(view, i);
                if (onePinEditText != null) {
                    i = R.id.icPhone;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.labelCheckData;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                            i = R.id.llv_confirm_subscriber_number;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.tv_confirm_subscriber_number;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvDescription;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvPricePackage;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvPriceUnit;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                i = R.id.tvPromotionName;
                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView6 != null) {
                                                    return new FragmentOneProsermOnlineConfirmBinding((FrameLayout) view, bind, dtacSwipeRefresh, onePinEditText, imageView, oneFontTextView, findChildViewById, linearLayoutCompat, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
                                                }
                                            }
                                        }
                                    }
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
    public static FragmentOneProsermOnlineConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneProsermOnlineConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_proserm_online_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84194a;
    }
}