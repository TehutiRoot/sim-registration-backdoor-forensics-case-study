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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationBinding implements ViewBinding {
    @NonNull
    public final ImageView OneOnlineRegisterIDCardImageView;
    @NonNull
    public final OneFontTextView OneOnlineRegisterIDCardTextView;

    /* renamed from: a */
    public final ConstraintLayout f84097a;
    @NonNull
    public final LinearLayout oneOnlineRegisterDescriptionLayout;
    @NonNull
    public final ConstraintLayout oneOnlineRegisterIDCardInfoLayout;
    @NonNull
    public final ImageView oneOnlineRegisterImageView;
    @NonNull
    public final ImageView oneOnlineRegisterRetailerImageView;
    @NonNull
    public final ConstraintLayout oneOnlineRegisterRetailerInfoLayout;
    @NonNull
    public final OneFontButton registerButton;
    @NonNull
    public final IncludeOneMrtrTypeRetailerBinding retailerHeaderTypeLayout;
    @NonNull
    public final View spaceView;
    @NonNull
    public final View spaceView2;

    public FragmentOneOnlineRegistrationBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout3, OneFontButton oneFontButton, IncludeOneMrtrTypeRetailerBinding includeOneMrtrTypeRetailerBinding, View view, View view2) {
        this.f84097a = constraintLayout;
        this.OneOnlineRegisterIDCardImageView = imageView;
        this.OneOnlineRegisterIDCardTextView = oneFontTextView;
        this.oneOnlineRegisterDescriptionLayout = linearLayout;
        this.oneOnlineRegisterIDCardInfoLayout = constraintLayout2;
        this.oneOnlineRegisterImageView = imageView2;
        this.oneOnlineRegisterRetailerImageView = imageView3;
        this.oneOnlineRegisterRetailerInfoLayout = constraintLayout3;
        this.registerButton = oneFontButton;
        this.retailerHeaderTypeLayout = includeOneMrtrTypeRetailerBinding;
        this.spaceView = view;
        this.spaceView2 = view2;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.OneOnlineRegisterIDCardImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.OneOnlineRegisterIDCardTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.oneOnlineRegisterDescriptionLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.oneOnlineRegisterIDCardInfoLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.oneOnlineRegisterImageView;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.oneOnlineRegisterRetailerImageView;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.oneOnlineRegisterRetailerInfoLayout;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = R.id.registerButton;
                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                    if (oneFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.retailerHeaderTypeLayout))) != null) {
                                        IncludeOneMrtrTypeRetailerBinding bind = IncludeOneMrtrTypeRetailerBinding.bind(findChildViewById);
                                        i = R.id.spaceView;
                                        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                                        if (findChildViewById3 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.spaceView2))) != null) {
                                            return new FragmentOneOnlineRegistrationBinding((ConstraintLayout) view, imageView, oneFontTextView, linearLayout, constraintLayout, imageView2, imageView3, constraintLayout2, oneFontButton, bind, findChildViewById3, findChildViewById2);
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
    public static FragmentOneOnlineRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84097a;
    }
}