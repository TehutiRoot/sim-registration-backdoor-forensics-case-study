package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDevicesaleProfileInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDevicesaleProfileInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84048a;
    @NonNull
    public final OneFontButton buttonNext;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final NestedScrollView profileScroll;
    @NonNull
    public final OneFontTextView textViewContract;
    @NonNull
    public final OneFontTextView textViewDeviceType;
    @NonNull
    public final OneFontTextView textViewHeaderScreen;

    public FragmentOneDevicesaleProfileInfoBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, Guideline guideline, NestedScrollView nestedScrollView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84048a = constraintLayout;
        this.buttonNext = oneFontButton;
        this.guideTopContent = guideline;
        this.profileScroll = nestedScrollView;
        this.textViewContract = oneFontTextView;
        this.textViewDeviceType = oneFontTextView2;
        this.textViewHeaderScreen = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneDevicesaleProfileInfoBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.guideTopContent;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.profileScroll;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = R.id.textViewContract;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.textViewDeviceType;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.textViewHeaderScreen;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                return new FragmentOneDevicesaleProfileInfoBinding((ConstraintLayout) view, oneFontButton, guideline, nestedScrollView, oneFontTextView, oneFontTextView2, oneFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDevicesaleProfileInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDevicesaleProfileInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_devicesale_profile_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84048a;
    }
}