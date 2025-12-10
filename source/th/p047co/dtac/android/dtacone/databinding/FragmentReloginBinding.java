package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentReloginBinding */
/* loaded from: classes7.dex */
public final class FragmentReloginBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84168a;
    @NonNull
    public final DtacFontTextView btnChangeAccount;
    @NonNull
    public final DtacFontTextView btnForgotPassword;
    @NonNull
    public final ImageView ivAppIcon;
    @NonNull
    public final RelativeLayout layourMobileNumber;
    @NonNull
    public final IncludePinSectionBinding layoutPinSection;
    @NonNull
    public final LinearLayout layoutSignIn;
    @NonNull
    public final RelativeLayout layoutVersion;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final DtacFontTextView tvMobileNumberTitle;
    @NonNull
    public final DtacFontTextView tvMobileNumberValue;
    @NonNull
    public final DtacFontTextView tvSignIn;
    @NonNull
    public final DtacFontTextView tvVersionName;

    public FragmentReloginBinding(NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, ImageView imageView, RelativeLayout relativeLayout, IncludePinSectionBinding includePinSectionBinding, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84168a = nestedScrollView;
        this.btnChangeAccount = dtacFontTextView;
        this.btnForgotPassword = dtacFontTextView2;
        this.ivAppIcon = imageView;
        this.layourMobileNumber = relativeLayout;
        this.layoutPinSection = includePinSectionBinding;
        this.layoutSignIn = linearLayout;
        this.layoutVersion = relativeLayout2;
        this.rootLayout = relativeLayout3;
        this.tvMobileNumberTitle = dtacFontTextView3;
        this.tvMobileNumberValue = dtacFontTextView4;
        this.tvSignIn = dtacFontTextView5;
        this.tvVersionName = dtacFontTextView6;
    }

    @NonNull
    public static FragmentReloginBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnChangeAccount;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.btnForgotPassword;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.ivAppIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.layourMobileNumber;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutPinSection))) != null) {
                        IncludePinSectionBinding bind = IncludePinSectionBinding.bind(findChildViewById);
                        i = R.id.layoutSignIn;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.layoutVersion;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.rootLayout;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout3 != null) {
                                    i = R.id.tvMobileNumberTitle;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tvMobileNumberValue;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.tvSignIn;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                i = R.id.tvVersionName;
                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView6 != null) {
                                                    return new FragmentReloginBinding((NestedScrollView) view, dtacFontTextView, dtacFontTextView2, imageView, relativeLayout, bind, linearLayout, relativeLayout2, relativeLayout3, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static FragmentReloginBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentReloginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_relogin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84168a;
    }
}
