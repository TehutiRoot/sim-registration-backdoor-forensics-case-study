package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEnquirySmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentEnquirySmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83811a;

    public FragmentEnquirySmartCardBinding(ConstraintLayout constraintLayout) {
        this.f83811a = constraintLayout;
    }

    @NonNull
    public static FragmentEnquirySmartCardBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentEnquirySmartCardBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentEnquirySmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEnquirySmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_enquiry_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83811a;
    }
}