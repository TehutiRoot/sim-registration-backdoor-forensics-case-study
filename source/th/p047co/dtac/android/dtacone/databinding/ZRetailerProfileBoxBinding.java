package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZRetailerProfileBoxBinding */
/* loaded from: classes7.dex */
public final class ZRetailerProfileBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84692a;
    @NonNull
    public final ConstraintLayout boxRetailerProfile;
    @NonNull
    public final ImageView iconAccount;
    @NonNull
    public final ImageView iconRight;
    @NonNull
    public final LinearLayout profileBox;
    @NonNull
    public final DtacFontTextView zTvRetailerProfileAddress;
    @NonNull
    public final DtacFontTextView zTvRetailerProfileMobileNumber;
    @NonNull
    public final DtacFontTextView zTvRetailerProfileRtrName;

    public ZRetailerProfileBoxBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84692a = constraintLayout;
        this.boxRetailerProfile = constraintLayout2;
        this.iconAccount = imageView;
        this.iconRight = imageView2;
        this.profileBox = linearLayout;
        this.zTvRetailerProfileAddress = dtacFontTextView;
        this.zTvRetailerProfileMobileNumber = dtacFontTextView2;
        this.zTvRetailerProfileRtrName = dtacFontTextView3;
    }

    @NonNull
    public static ZRetailerProfileBoxBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.icon_account;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.icon_right;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.profileBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.z_tv_retailer_profile_address;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.z_tv_retailer_profile_mobile_number;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.z_tv_retailer_profile_rtr_name;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new ZRetailerProfileBoxBinding(constraintLayout, constraintLayout, imageView, imageView2, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZRetailerProfileBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZRetailerProfileBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_retailer_profile_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84692a;
    }
}
