package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPostCutomerEnquiryContainerBinding */
/* loaded from: classes7.dex */
public final class FragmentPostCutomerEnquiryContainerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84242a;
    @NonNull
    public final ConstraintLayout contentSubscriberInfo;
    @NonNull
    public final View dividerLine;
    @NonNull
    public final FrameLayout fragment700MhzInfo;
    @NonNull
    public final RecyclerView linkageMenuListView;
    @NonNull
    public final NestedScrollView scrollViewSubscriberInfo;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentPostCutomerEnquiryContainerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, FrameLayout frameLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f84242a = constraintLayout;
        this.contentSubscriberInfo = constraintLayout2;
        this.dividerLine = view;
        this.fragment700MhzInfo = frameLayout;
        this.linkageMenuListView = recyclerView;
        this.scrollViewSubscriberInfo = nestedScrollView;
        this.swipeRefresh = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentPostCutomerEnquiryContainerBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentSubscriberInfo;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dividerLine))) != null) {
            i = R.id.fragment700MhzInfo;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.linkageMenuListView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.scrollViewSubscriberInfo;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        i = R.id.swipeRefresh;
                        DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (dtacSwipeRefresh != null) {
                            return new FragmentPostCutomerEnquiryContainerBinding((ConstraintLayout) view, constraintLayout, findChildViewById, frameLayout, recyclerView, nestedScrollView, dtacSwipeRefresh);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPostCutomerEnquiryContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPostCutomerEnquiryContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_post_cutomer_enquiry_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84242a;
    }
}