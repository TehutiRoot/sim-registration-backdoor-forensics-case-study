package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolHistoryBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83746a;
    @NonNull
    public final DtacRecyclerView recyclerViewHistory;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentBuyDolHistoryBinding(FrameLayout frameLayout, DtacRecyclerView dtacRecyclerView, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f83746a = frameLayout;
        this.recyclerViewHistory = dtacRecyclerView;
        this.swipeRefresh = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentBuyDolHistoryBinding bind(@NonNull View view) {
        int i = R.id.recyclerViewHistory;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.swipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                return new FragmentBuyDolHistoryBinding((FrameLayout) view, dtacRecyclerView, dtacSwipeRefresh);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83746a;
    }
}