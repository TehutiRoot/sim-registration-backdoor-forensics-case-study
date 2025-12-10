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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.scroll.ScrollViewExt;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationConsentBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationConsentBinding implements ViewBinding {
    @NonNull
    public final ScrollViewExt RegisterConsentScrollView;

    /* renamed from: a */
    public final ConstraintLayout f84099a;
    @NonNull
    public final OneFontButton acceptConsentRegisterOnlineButton;
    @NonNull
    public final OneFontTextView consentDetailTextView;
    @NonNull
    public final ConstraintLayout constraintLayout4;
    @NonNull
    public final LinearLayout contentScrollLayout;
    @NonNull
    public final ImageView iconAccount;
    @NonNull
    public final ImageView scrollToBottomImageView;
    @NonNull
    public final OneFontTextView zTvRetailerProfileMobileNumber;
    @NonNull
    public final OneFontTextView zTvRetailerProfileRtrName;

    public FragmentOneOnlineRegistrationConsentBinding(ConstraintLayout constraintLayout, ScrollViewExt scrollViewExt, OneFontButton oneFontButton, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84099a = constraintLayout;
        this.RegisterConsentScrollView = scrollViewExt;
        this.acceptConsentRegisterOnlineButton = oneFontButton;
        this.consentDetailTextView = oneFontTextView;
        this.constraintLayout4 = constraintLayout2;
        this.contentScrollLayout = linearLayout;
        this.iconAccount = imageView;
        this.scrollToBottomImageView = imageView2;
        this.zTvRetailerProfileMobileNumber = oneFontTextView2;
        this.zTvRetailerProfileRtrName = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationConsentBinding bind(@NonNull View view) {
        int i = R.id.RegisterConsentScrollView;
        ScrollViewExt scrollViewExt = (ScrollViewExt) ViewBindings.findChildViewById(view, i);
        if (scrollViewExt != null) {
            i = R.id.acceptConsentRegisterOnlineButton;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.consentDetailTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.constraintLayout4;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.contentScrollLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.icon_account;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.scrollToBottomImageView;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.z_tv_retailer_profile_mobile_number;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.z_tv_retailer_profile_rtr_name;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            return new FragmentOneOnlineRegistrationConsentBinding((ConstraintLayout) view, scrollViewExt, oneFontButton, oneFontTextView, constraintLayout, linearLayout, imageView, imageView2, oneFontTextView2, oneFontTextView3);
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
    public static FragmentOneOnlineRegistrationConsentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84099a;
    }
}