package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneUserProfileSectionBinding */
/* loaded from: classes7.dex */
public final class IncludeOneUserProfileSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84286a;
    @NonNull
    public final ImageView ivBlueToothStatus;
    @NonNull
    public final ImageView ivPosition;
    @NonNull
    public final ImageView ivProfile;
    @NonNull
    public final LinearLayoutCompat layoutDetail;
    @NonNull
    public final ConstraintLayout layoutUserProfileSection;
    @NonNull
    public final OneFontTextView tvAddress;
    @NonNull
    public final OneFontTextView tvMobile;
    @NonNull
    public final OneFontTextView tvProfileName;

    public IncludeOneUserProfileSectionBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84286a = constraintLayout;
        this.ivBlueToothStatus = imageView;
        this.ivPosition = imageView2;
        this.ivProfile = imageView3;
        this.layoutDetail = linearLayoutCompat;
        this.layoutUserProfileSection = constraintLayout2;
        this.tvAddress = oneFontTextView;
        this.tvMobile = oneFontTextView2;
        this.tvProfileName = oneFontTextView3;
    }

    @NonNull
    public static IncludeOneUserProfileSectionBinding bind(@NonNull View view) {
        int i = R.id.ivBlueToothStatus;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivPosition;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ivProfile;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.layoutDetail;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.tvAddress;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tvMobile;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvProfileName;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    return new IncludeOneUserProfileSectionBinding(constraintLayout, imageView, imageView2, imageView3, linearLayoutCompat, constraintLayout, oneFontTextView, oneFontTextView2, oneFontTextView3);
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
    public static IncludeOneUserProfileSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneUserProfileSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_user_profile_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84286a;
    }
}
