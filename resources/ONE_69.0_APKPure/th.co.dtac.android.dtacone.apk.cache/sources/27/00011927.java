package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZViewEmptyRecycleBinding */
/* loaded from: classes7.dex */
public final class ZViewEmptyRecycleBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84822a;

    public ZViewEmptyRecycleBinding(FrameLayout frameLayout) {
        this.f84822a = frameLayout;
    }

    @NonNull
    public static ZViewEmptyRecycleBinding bind(@NonNull View view) {
        if (view != null) {
            return new ZViewEmptyRecycleBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ZViewEmptyRecycleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZViewEmptyRecycleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_view_empty_recycle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84822a;
    }
}