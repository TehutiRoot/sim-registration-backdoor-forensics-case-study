package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrProfileViewerBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrProfileViewerBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f84288a;
    @NonNull
    public final LinearLayout editRtr;
    @NonNull
    public final ZDividerBinding incDivider;
    @NonNull
    public final ZIncludeRtrProfileContactBinding incRtrProfileContact;
    @NonNull
    public final ZIncludeRtrProfileBinding includeRtrProfile;
    @NonNull
    public final ZIncludeRtrProfileAreaManagerBinding includeRtrProfileAreaManager;
    @NonNull
    public final ZIncludeRtrProfileCommissionBinding includeRtrProfileCommission;
    @NonNull
    public final ImageView ivEditProfile;
    @NonNull
    public final ImageView ivEditRtrAddress;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshRtrProfile;

    public FragmentRtrProfileViewerBinding(DtacSwipeRefresh dtacSwipeRefresh, LinearLayout linearLayout, ZDividerBinding zDividerBinding, ZIncludeRtrProfileContactBinding zIncludeRtrProfileContactBinding, ZIncludeRtrProfileBinding zIncludeRtrProfileBinding, ZIncludeRtrProfileAreaManagerBinding zIncludeRtrProfileAreaManagerBinding, ZIncludeRtrProfileCommissionBinding zIncludeRtrProfileCommissionBinding, ImageView imageView, ImageView imageView2, DtacSwipeRefresh dtacSwipeRefresh2) {
        this.f84288a = dtacSwipeRefresh;
        this.editRtr = linearLayout;
        this.incDivider = zDividerBinding;
        this.incRtrProfileContact = zIncludeRtrProfileContactBinding;
        this.includeRtrProfile = zIncludeRtrProfileBinding;
        this.includeRtrProfileAreaManager = zIncludeRtrProfileAreaManagerBinding;
        this.includeRtrProfileCommission = zIncludeRtrProfileCommissionBinding;
        this.ivEditProfile = imageView;
        this.ivEditRtrAddress = imageView2;
        this.swipeRefreshRtrProfile = dtacSwipeRefresh2;
    }

    @NonNull
    public static FragmentRtrProfileViewerBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.editRtr;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incDivider))) != null) {
            ZDividerBinding bind = ZDividerBinding.bind(findChildViewById);
            i = R.id.incRtrProfileContact;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                ZIncludeRtrProfileContactBinding bind2 = ZIncludeRtrProfileContactBinding.bind(findChildViewById2);
                i = R.id.include_rtr_profile;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    ZIncludeRtrProfileBinding bind3 = ZIncludeRtrProfileBinding.bind(findChildViewById3);
                    i = R.id.include_rtr_profile_area_manager;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (findChildViewById4 != null) {
                        ZIncludeRtrProfileAreaManagerBinding bind4 = ZIncludeRtrProfileAreaManagerBinding.bind(findChildViewById4);
                        i = R.id.include_rtr_profile_commission;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById5 != null) {
                            ZIncludeRtrProfileCommissionBinding bind5 = ZIncludeRtrProfileCommissionBinding.bind(findChildViewById5);
                            i = R.id.ivEditProfile;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.ivEditRtrAddress;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
                                    return new FragmentRtrProfileViewerBinding(dtacSwipeRefresh, linearLayout, bind, bind2, bind3, bind4, bind5, imageView, imageView2, dtacSwipeRefresh);
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
    public static FragmentRtrProfileViewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrProfileViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_profile_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f84288a;
    }
}