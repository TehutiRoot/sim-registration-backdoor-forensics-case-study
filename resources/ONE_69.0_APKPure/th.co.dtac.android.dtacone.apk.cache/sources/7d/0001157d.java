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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpChooseServiceTypeBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpChooseServiceTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83883a;
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
    public final DtacFontTextView tvAttorney;
    @NonNull
    public final DtacFontTextView tvOwner;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentMrtrMnpChooseServiceTypeBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83883a = constraintLayout;
        this.ivAttorney = imageView;
        this.ivOwner = imageView2;
        this.layoutMenu = linearLayoutCompat;
        this.layoutPostpaid = relativeLayout;
        this.layoutPrepaid = relativeLayout2;
        this.tvAttorney = dtacFontTextView;
        this.tvOwner = dtacFontTextView2;
        this.tvTitle = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMrtrMnpChooseServiceTypeBinding bind(@NonNull View view) {
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
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvOwner;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvTitle;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        return new FragmentMrtrMnpChooseServiceTypeBinding((ConstraintLayout) view, imageView, imageView2, linearLayoutCompat, relativeLayout, relativeLayout2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentMrtrMnpChooseServiceTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpChooseServiceTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_choose_service_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83883a;
    }
}