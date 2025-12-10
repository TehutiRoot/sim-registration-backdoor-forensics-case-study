package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentNewsFeedBinding */
/* loaded from: classes7.dex */
public final class FragmentNewsFeedBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83978a;
    @NonNull
    public final RecyclerView rvNewsFeedsRecycler;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final OneFontTextView tvNoMoreNewsFeed;

    public FragmentNewsFeedBinding(FrameLayout frameLayout, RecyclerView recyclerView, DtacSwipeRefresh dtacSwipeRefresh, OneFontTextView oneFontTextView) {
        this.f83978a = frameLayout;
        this.rvNewsFeedsRecycler = recyclerView;
        this.swipeRefresh = dtacSwipeRefresh;
        this.tvNoMoreNewsFeed = oneFontTextView;
    }

    @NonNull
    public static FragmentNewsFeedBinding bind(@NonNull View view) {
        int i = R.id.rvNewsFeedsRecycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.swipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                i = R.id.tvNoMoreNewsFeed;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentNewsFeedBinding((FrameLayout) view, recyclerView, dtacSwipeRefresh, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentNewsFeedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentNewsFeedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_news_feed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83978a;
    }
}