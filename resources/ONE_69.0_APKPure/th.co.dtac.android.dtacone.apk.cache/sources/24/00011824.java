package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneErrorViewRecycleBinding */
/* loaded from: classes7.dex */
public final class OneErrorViewRecycleBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84563a;
    @NonNull
    public final LinearLayoutCompat btnRetryHistorySell;
    @NonNull
    public final ImageView ivBtnRetry;
    @NonNull
    public final LinearLayout layoutEmptyHistory;
    @NonNull
    public final OneFontTextView tvBtnRetry;

    public OneErrorViewRecycleBinding(FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat, ImageView imageView, LinearLayout linearLayout, OneFontTextView oneFontTextView) {
        this.f84563a = frameLayout;
        this.btnRetryHistorySell = linearLayoutCompat;
        this.ivBtnRetry = imageView;
        this.layoutEmptyHistory = linearLayout;
        this.tvBtnRetry = oneFontTextView;
    }

    @NonNull
    public static OneErrorViewRecycleBinding bind(@NonNull View view) {
        int i = R.id.btn_retry_history_sell;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ivBtnRetry;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layoutEmptyHistory;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tvBtnRetry;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneErrorViewRecycleBinding((FrameLayout) view, linearLayoutCompat, imageView, linearLayout, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneErrorViewRecycleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneErrorViewRecycleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_error_view_recycle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84563a;
    }
}