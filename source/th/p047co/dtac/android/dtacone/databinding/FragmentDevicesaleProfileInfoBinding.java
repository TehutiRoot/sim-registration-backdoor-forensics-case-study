package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDevicesaleProfileInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentDevicesaleProfileInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83705a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final LayoutDevicesaleAdditionPackageBinding incAdditionPackage;
    @NonNull
    public final LayoutDevicesaleImeiInfoBinding incImeiInfo;
    @NonNull
    public final LayoutDevicesaleMainPackageBinding incMainPack;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final NestedScrollView profileScroll;
    @NonNull
    public final DtacFontTextView textViewContract;
    @NonNull
    public final DtacFontTextView textViewHeaderScreen;

    public FragmentDevicesaleProfileInfoBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, Guideline guideline, LayoutDevicesaleAdditionPackageBinding layoutDevicesaleAdditionPackageBinding, LayoutDevicesaleImeiInfoBinding layoutDevicesaleImeiInfoBinding, LayoutDevicesaleMainPackageBinding layoutDevicesaleMainPackageBinding, ImageView imageView, NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83705a = constraintLayout;
        this.buttonNext = dtacFontButton;
        this.guideTopContent = guideline;
        this.incAdditionPackage = layoutDevicesaleAdditionPackageBinding;
        this.incImeiInfo = layoutDevicesaleImeiInfoBinding;
        this.incMainPack = layoutDevicesaleMainPackageBinding;
        this.ivDeviceType = imageView;
        this.profileScroll = nestedScrollView;
        this.textViewContract = dtacFontTextView;
        this.textViewHeaderScreen = dtacFontTextView2;
    }

    @NonNull
    public static FragmentDevicesaleProfileInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.guideTopContent;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incAdditionPackage))) != null) {
                LayoutDevicesaleAdditionPackageBinding bind = LayoutDevicesaleAdditionPackageBinding.bind(findChildViewById);
                i = R.id.incImeiInfo;
                View findChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById2 != null) {
                    LayoutDevicesaleImeiInfoBinding bind2 = LayoutDevicesaleImeiInfoBinding.bind(findChildViewById2);
                    i = R.id.incMainPack;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                    if (findChildViewById3 != null) {
                        LayoutDevicesaleMainPackageBinding bind3 = LayoutDevicesaleMainPackageBinding.bind(findChildViewById3);
                        i = R.id.ivDeviceType;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.profileScroll;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R.id.textViewContract;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.textViewHeaderScreen;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        return new FragmentDevicesaleProfileInfoBinding((ConstraintLayout) view, dtacFontButton, guideline, bind, bind2, bind3, imageView, nestedScrollView, dtacFontTextView, dtacFontTextView2);
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
    public static FragmentDevicesaleProfileInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDevicesaleProfileInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_devicesale_profile_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83705a;
    }
}
