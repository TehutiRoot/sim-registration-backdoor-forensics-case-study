package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpChooseServiceTypeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpChooseServiceTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84063a;
    @NonNull
    public final ImageView ivAttorney;
    @NonNull
    public final ImageView ivOwner;
    @NonNull
    public final LinearLayoutCompat layoutMenu;
    @NonNull
    public final RelativeLayout layoutPostpaid;
    @NonNull
    public final RelativeLayout layoutPrepaid;
    @NonNull
    public final OneFontTextView tvAttorney;
    @NonNull
    public final OneFontTextView tvOwner;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneMnpChooseServiceTypeBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84063a = constraintLayout;
        this.ivAttorney = imageView;
        this.ivOwner = imageView2;
        this.layoutMenu = linearLayoutCompat;
        this.layoutPostpaid = relativeLayout;
        this.layoutPrepaid = relativeLayout2;
        this.tvAttorney = oneFontTextView;
        this.tvOwner = oneFontTextView2;
        this.tvTitle = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneMnpChooseServiceTypeBinding bind(@NonNull View view) {
        int i = R.id.ivAttorney;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivOwner;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.layoutMenu;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.layoutPostpaid;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.layoutPrepaid;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.tvAttorney;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvOwner;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvTitle;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        return new FragmentOneMnpChooseServiceTypeBinding((ConstraintLayout) view, imageView, imageView2, linearLayoutCompat, relativeLayout, relativeLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3);
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
    public static FragmentOneMnpChooseServiceTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpChooseServiceTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_choose_service_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84063a;
    }
}