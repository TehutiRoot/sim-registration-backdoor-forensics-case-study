package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.roughike.bottombar.BottomBar;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZBottomBarBinding */
/* loaded from: classes7.dex */
public final class ZBottomBarBinding implements ViewBinding {

    /* renamed from: a */
    public final BottomBar f84589a;
    @NonNull
    public final BottomBar bottomBar;

    public ZBottomBarBinding(BottomBar bottomBar, BottomBar bottomBar2) {
        this.f84589a = bottomBar;
        this.bottomBar = bottomBar2;
    }

    @NonNull
    public static ZBottomBarBinding bind(@NonNull View view) {
        if (view != null) {
            BottomBar bottomBar = (BottomBar) view;
            return new ZBottomBarBinding(bottomBar, bottomBar);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ZBottomBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZBottomBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_bottom_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public BottomBar getRoot() {
        return this.f84589a;
    }
}
