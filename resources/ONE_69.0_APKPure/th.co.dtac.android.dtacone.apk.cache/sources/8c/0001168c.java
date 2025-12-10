package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PosSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PosSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84155a;
    @NonNull
    public final OneFontButton onePre2PostConfirmButton;
    @NonNull
    public final RecyclerView onePre2PostRecyclerView;
    @NonNull
    public final LinearLayoutCompat onePre2PostSlideImage;
    @NonNull
    public final NestedScrollView pre2postSummaryNestedScrollView;

    public FragmentOnePre2PosSummaryBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat, NestedScrollView nestedScrollView) {
        this.f84155a = constraintLayout;
        this.onePre2PostConfirmButton = oneFontButton;
        this.onePre2PostRecyclerView = recyclerView;
        this.onePre2PostSlideImage = linearLayoutCompat;
        this.pre2postSummaryNestedScrollView = nestedScrollView;
    }

    @NonNull
    public static FragmentOnePre2PosSummaryBinding bind(@NonNull View view) {
        int i = R.id.onePre2PostConfirmButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.onePre2PostRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.onePre2PostSlideImage;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.pre2postSummaryNestedScrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        return new FragmentOnePre2PosSummaryBinding((ConstraintLayout) view, oneFontButton, recyclerView, linearLayoutCompat, nestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PosSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PosSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_pos_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84155a;
    }
}