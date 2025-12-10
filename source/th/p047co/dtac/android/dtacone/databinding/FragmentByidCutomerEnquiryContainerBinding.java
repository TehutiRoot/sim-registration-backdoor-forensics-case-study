package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentByidCutomerEnquiryContainerBinding */
/* loaded from: classes7.dex */
public final class FragmentByidCutomerEnquiryContainerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83656a;
    @NonNull
    public final ConstraintLayout contentSubscriberInfo;
    @NonNull
    public final View dividerLine;
    @NonNull
    public final RecyclerView linkageMenuListView;
    @NonNull
    public final NestedScrollView scrollViewSubscriberInfo;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentByidCutomerEnquiryContainerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, RecyclerView recyclerView, NestedScrollView nestedScrollView, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f83656a = constraintLayout;
        this.contentSubscriberInfo = constraintLayout2;
        this.dividerLine = view;
        this.linkageMenuListView = recyclerView;
        this.scrollViewSubscriberInfo = nestedScrollView;
        this.swipeRefresh = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentByidCutomerEnquiryContainerBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentSubscriberInfo;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dividerLine))) != null) {
            i = R.id.linkageMenuListView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.scrollViewSubscriberInfo;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = R.id.swipeRefresh;
                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                    if (dtacSwipeRefresh != null) {
                        return new FragmentByidCutomerEnquiryContainerBinding((ConstraintLayout) view, constraintLayout, findChildViewById, recyclerView, nestedScrollView, dtacSwipeRefresh);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentByidCutomerEnquiryContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentByidCutomerEnquiryContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_byid_cutomer_enquiry_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83656a;
    }
}
