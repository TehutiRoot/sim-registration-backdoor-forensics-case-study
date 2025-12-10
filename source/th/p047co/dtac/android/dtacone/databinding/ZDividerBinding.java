package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZDividerBinding */
/* loaded from: classes7.dex */
public final class ZDividerBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84601a;
    @NonNull
    public final View divider;

    public ZDividerBinding(View view, View view2) {
        this.f84601a = view;
        this.divider = view2;
    }

    @NonNull
    public static ZDividerBinding bind(@NonNull View view) {
        if (view != null) {
            return new ZDividerBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ZDividerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84601a;
    }

    @NonNull
    public static ZDividerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
