package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeUserProfileSectionBinding */
/* loaded from: classes7.dex */
public final class OneIncludeUserProfileSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84600a;
    @NonNull
    public final ImageView ivBlueToothStatus;
    @NonNull
    public final ImageView ivPosition;
    @NonNull
    public final ImageView ivProfile;
    @NonNull
    public final ImageView ivSeeProfileDetail;
    @NonNull
    public final LinearLayout layoutDetail;
    @NonNull
    public final RelativeLayout layoutUserProfileSection;
    @NonNull
    public final DtacFontTextView tvAddress;
    @NonNull
    public final OneFontTextView tvMobile;
    @NonNull
    public final OneFontTextView tvProfileName;

    public OneIncludeUserProfileSectionBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84600a = relativeLayout;
        this.ivBlueToothStatus = imageView;
        this.ivPosition = imageView2;
        this.ivProfile = imageView3;
        this.ivSeeProfileDetail = imageView4;
        this.layoutDetail = linearLayout;
        this.layoutUserProfileSection = relativeLayout2;
        this.tvAddress = dtacFontTextView;
        this.tvMobile = oneFontTextView;
        this.tvProfileName = oneFontTextView2;
    }

    @NonNull
    public static OneIncludeUserProfileSectionBinding bind(@NonNull View view) {
        int i = R.id.ivBlueToothStatus;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivPosition;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ivProfile;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.ivSeeProfileDetail;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.layoutDetail;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i = R.id.tvAddress;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvMobile;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.tvProfileName;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        return new OneIncludeUserProfileSectionBinding(relativeLayout, imageView, imageView2, imageView3, imageView4, linearLayout, relativeLayout, dtacFontTextView, oneFontTextView, oneFontTextView2);
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
    public static OneIncludeUserProfileSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeUserProfileSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_user_profile_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84600a;
    }
}