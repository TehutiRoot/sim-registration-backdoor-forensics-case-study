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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneCommProfileBoxBinding */
/* loaded from: classes7.dex */
public final class OneCommProfileBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84430a;
    @NonNull
    public final ImageView commissionPositionImageView;
    @NonNull
    public final ImageView iconAccount;
    @NonNull
    public final ImageView ivMoreProfile;
    @NonNull
    public final LinearLayout profileBox;
    @NonNull
    public final ConstraintLayout profileContainer;
    @NonNull
    public final OneFontTextView profileMobileNumber;
    @NonNull
    public final OneFontTextView profileName;

    public OneCommProfileBoxBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84430a = constraintLayout;
        this.commissionPositionImageView = imageView;
        this.iconAccount = imageView2;
        this.ivMoreProfile = imageView3;
        this.profileBox = linearLayout;
        this.profileContainer = constraintLayout2;
        this.profileMobileNumber = oneFontTextView;
        this.profileName = oneFontTextView2;
    }

    @NonNull
    public static OneCommProfileBoxBinding bind(@NonNull View view) {
        int i = R.id.commissionPositionImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.icon_account;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ivMoreProfile;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.profileBox;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.profile_mobile_number;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.profile_name;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                return new OneCommProfileBoxBinding(constraintLayout, imageView, imageView2, imageView3, linearLayout, constraintLayout, oneFontTextView, oneFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneCommProfileBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneCommProfileBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_comm_profile_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84430a;
    }
}
