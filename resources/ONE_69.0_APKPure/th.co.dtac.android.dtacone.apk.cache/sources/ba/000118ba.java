package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZErrorViewRecycleBinding */
/* loaded from: classes7.dex */
public final class ZErrorViewRecycleBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84713a;
    @NonNull
    public final Button btnRetryHistorySell;
    @NonNull
    public final LinearLayout layoutEmptyHistory;

    public ZErrorViewRecycleBinding(FrameLayout frameLayout, Button button, LinearLayout linearLayout) {
        this.f84713a = frameLayout;
        this.btnRetryHistorySell = button;
        this.layoutEmptyHistory = linearLayout;
    }

    @NonNull
    public static ZErrorViewRecycleBinding bind(@NonNull View view) {
        int i = R.id.btn_retry_history_sell;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.layoutEmptyHistory;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                return new ZErrorViewRecycleBinding((FrameLayout) view, button, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZErrorViewRecycleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZErrorViewRecycleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_error_view_recycle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84713a;
    }
}