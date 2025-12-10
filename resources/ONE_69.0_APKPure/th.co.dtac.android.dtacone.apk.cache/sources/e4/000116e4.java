package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.InfoAnalyticExpandView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPostInfoAnalyticEnquiryBinding */
/* loaded from: classes7.dex */
public final class FragmentPostInfoAnalyticEnquiryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84243a;
    @NonNull
    public final ConstraintLayout card;
    @NonNull
    public final InfoAnalyticExpandView infoAnalyticCardView;

    public FragmentPostInfoAnalyticEnquiryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, InfoAnalyticExpandView infoAnalyticExpandView) {
        this.f84243a = constraintLayout;
        this.card = constraintLayout2;
        this.infoAnalyticCardView = infoAnalyticExpandView;
    }

    @NonNull
    public static FragmentPostInfoAnalyticEnquiryBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.infoAnalyticCardView;
        InfoAnalyticExpandView infoAnalyticExpandView = (InfoAnalyticExpandView) ViewBindings.findChildViewById(view, i);
        if (infoAnalyticExpandView != null) {
            return new FragmentPostInfoAnalyticEnquiryBinding(constraintLayout, constraintLayout, infoAnalyticExpandView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPostInfoAnalyticEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPostInfoAnalyticEnquiryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_post_info_analytic_enquiry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84243a;
    }
}