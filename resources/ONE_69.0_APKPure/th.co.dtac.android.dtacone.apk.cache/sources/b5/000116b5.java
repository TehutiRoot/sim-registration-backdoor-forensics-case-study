package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRectifyConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRectifyConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84196a;
    @NonNull
    public final ImageView icMoney;
    @NonNull
    public final ImageView icPhone;
    @NonNull
    public final ImageView icRectify;
    @NonNull
    public final ImageView icTopup;
    @NonNull
    public final OneFontTextView labelCheckData;
    @NonNull
    public final LinearLayoutCompat llvConfirmMoney;
    @NonNull
    public final LinearLayoutCompat llvConfirmStvType;
    @NonNull
    public final LinearLayoutCompat llvConfirmSubscriberNumber;
    @NonNull
    public final LinearLayoutCompat llvConfirmTopupType;
    @NonNull
    public final OnePinEditText rectifyEdtConfirmPin;
    @NonNull
    public final OneFontTextView tvConfirmMenuTopupType;
    @NonNull
    public final OneFontTextView tvConfirmMenuType;
    @NonNull
    public final OneFontTextView tvConfirmMoney;
    @NonNull
    public final OneFontTextView tvConfirmSimRNumber;
    @NonNull
    public final OneFontTextView tvConfirmSubscriberNumber;

    public FragmentOneRectifyConfirmBinding(NestedScrollView nestedScrollView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, OneFontTextView oneFontTextView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, OnePinEditText onePinEditText, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84196a = nestedScrollView;
        this.icMoney = imageView;
        this.icPhone = imageView2;
        this.icRectify = imageView3;
        this.icTopup = imageView4;
        this.labelCheckData = oneFontTextView;
        this.llvConfirmMoney = linearLayoutCompat;
        this.llvConfirmStvType = linearLayoutCompat2;
        this.llvConfirmSubscriberNumber = linearLayoutCompat3;
        this.llvConfirmTopupType = linearLayoutCompat4;
        this.rectifyEdtConfirmPin = onePinEditText;
        this.tvConfirmMenuTopupType = oneFontTextView2;
        this.tvConfirmMenuType = oneFontTextView3;
        this.tvConfirmMoney = oneFontTextView4;
        this.tvConfirmSimRNumber = oneFontTextView5;
        this.tvConfirmSubscriberNumber = oneFontTextView6;
    }

    @NonNull
    public static FragmentOneRectifyConfirmBinding bind(@NonNull View view) {
        int i = R.id.icMoney;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.icPhone;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.icRectify;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.icTopup;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.labelCheckData;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.llv_confirm_money;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.llv_confirm_stv_type;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = R.id.llv_confirm_subscriber_number;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat3 != null) {
                                        i = R.id.llv_confirm_topup_type;
                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat4 != null) {
                                            i = R.id.rectify_edt_confirm_pin;
                                            OnePinEditText onePinEditText = (OnePinEditText) ViewBindings.findChildViewById(view, i);
                                            if (onePinEditText != null) {
                                                i = R.id.tv_confirm_menu_topup_type;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.tv_confirm_menu_type;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        i = R.id.tv_confirm_money;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            i = R.id.tv_confirm_sim_r_number;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.tv_confirm_subscriber_number;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    return new FragmentOneRectifyConfirmBinding((NestedScrollView) view, imageView, imageView2, imageView3, imageView4, oneFontTextView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, onePinEditText, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRectifyConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRectifyConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_rectify_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84196a;
    }
}