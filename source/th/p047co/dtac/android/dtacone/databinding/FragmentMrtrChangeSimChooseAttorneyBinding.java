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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimChooseAttorneyBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimChooseAttorneyBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83765a;
    @NonNull
    public final ImageView ivAttorney;
    @NonNull
    public final ImageView ivOwner;
    @NonNull
    public final RelativeLayout layoutAttorney;
    @NonNull
    public final LinearLayoutCompat layoutMenu;
    @NonNull
    public final RelativeLayout layoutOwner;
    @NonNull
    public final DtacFontTextView tvAttorney;
    @NonNull
    public final DtacFontTextView tvOwner;
    @NonNull
    public final DtacFontTextView tvTitle;

    public FragmentMrtrChangeSimChooseAttorneyBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f83765a = constraintLayout;
        this.ivAttorney = imageView;
        this.ivOwner = imageView2;
        this.layoutAttorney = relativeLayout;
        this.layoutMenu = linearLayoutCompat;
        this.layoutOwner = relativeLayout2;
        this.tvAttorney = dtacFontTextView;
        this.tvOwner = dtacFontTextView2;
        this.tvTitle = dtacFontTextView3;
    }

    @NonNull
    public static FragmentMrtrChangeSimChooseAttorneyBinding bind(@NonNull View view) {
        int i = R.id.ivAttorney;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivOwner;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.layoutAttorney;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.layoutMenu;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.layoutOwner;
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
                                        return new FragmentMrtrChangeSimChooseAttorneyBinding((ConstraintLayout) view, imageView, imageView2, relativeLayout, linearLayoutCompat, relativeLayout2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static FragmentMrtrChangeSimChooseAttorneyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimChooseAttorneyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_choose_attorney, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83765a;
    }
}
