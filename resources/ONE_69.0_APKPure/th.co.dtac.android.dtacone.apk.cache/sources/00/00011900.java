package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZNewsFeedLoadingItemRowBinding */
/* loaded from: classes7.dex */
public final class ZNewsFeedLoadingItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84783a;
    @NonNull
    public final RelativeLayout loadingLayout;
    @NonNull
    public final ProgressBar progressBar;

    public ZNewsFeedLoadingItemRowBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ProgressBar progressBar) {
        this.f84783a = relativeLayout;
        this.loadingLayout = relativeLayout2;
        this.progressBar = progressBar;
    }

    @NonNull
    public static ZNewsFeedLoadingItemRowBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            return new ZNewsFeedLoadingItemRowBinding(relativeLayout, relativeLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZNewsFeedLoadingItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZNewsFeedLoadingItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_news_feed_loading_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84783a;
    }
}