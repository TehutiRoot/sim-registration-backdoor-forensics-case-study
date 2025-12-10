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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeUserProfileSectionBinding */
/* loaded from: classes7.dex */
public final class IncludeUserProfileSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84298a;
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
    public final DtacFontTextView tvMobile;
    @NonNull
    public final DtacFontTextView tvProfileName;

    public IncludeUserProfileSectionBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84298a = relativeLayout;
        this.ivBlueToothStatus = imageView;
        this.ivPosition = imageView2;
        this.ivProfile = imageView3;
        this.ivSeeProfileDetail = imageView4;
        this.layoutDetail = linearLayout;
        this.layoutUserProfileSection = relativeLayout2;
        this.tvAddress = dtacFontTextView;
        this.tvMobile = dtacFontTextView2;
        this.tvProfileName = dtacFontTextView3;
    }

    @NonNull
    public static IncludeUserProfileSectionBinding bind(@NonNull View view) {
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
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvProfileName;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        return new IncludeUserProfileSectionBinding(relativeLayout, imageView, imageView2, imageView3, imageView4, linearLayout, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static IncludeUserProfileSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeUserProfileSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_user_profile_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84298a;
    }
}
