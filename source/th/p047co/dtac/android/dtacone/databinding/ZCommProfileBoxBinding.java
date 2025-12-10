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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZCommProfileBoxBinding */
/* loaded from: classes7.dex */
public final class ZCommProfileBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84595a;
    @NonNull
    public final ImageView iconAccount;
    @NonNull
    public final ImageView ivMoreProfile;
    @NonNull
    public final LinearLayout profileBox;
    @NonNull
    public final ConstraintLayout profileContainer;
    @NonNull
    public final DtacFontTextView profileMobileNumber;
    @NonNull
    public final DtacFontTextView profileName;

    public ZCommProfileBoxBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84595a = constraintLayout;
        this.iconAccount = imageView;
        this.ivMoreProfile = imageView2;
        this.profileBox = linearLayout;
        this.profileContainer = constraintLayout2;
        this.profileMobileNumber = dtacFontTextView;
        this.profileName = dtacFontTextView2;
    }

    @NonNull
    public static ZCommProfileBoxBinding bind(@NonNull View view) {
        int i = R.id.icon_account;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivMoreProfile;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.profileBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.profile_mobile_number;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.profile_name;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new ZCommProfileBoxBinding(constraintLayout, imageView, imageView2, linearLayout, constraintLayout, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZCommProfileBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZCommProfileBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_comm_profile_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84595a;
    }
}
