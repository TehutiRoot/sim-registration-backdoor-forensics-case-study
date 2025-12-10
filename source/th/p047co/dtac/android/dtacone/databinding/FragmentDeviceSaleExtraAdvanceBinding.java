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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleExtraAdvanceBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleExtraAdvanceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83689a;
    @NonNull
    public final ZIncludeExtraAdvanceBinding incExtraAdvance;

    public FragmentDeviceSaleExtraAdvanceBinding(FrameLayout frameLayout, ZIncludeExtraAdvanceBinding zIncludeExtraAdvanceBinding) {
        this.f83689a = frameLayout;
        this.incExtraAdvance = zIncludeExtraAdvanceBinding;
    }

    @NonNull
    public static FragmentDeviceSaleExtraAdvanceBinding bind(@NonNull View view) {
        int i = R.id.incExtraAdvance;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentDeviceSaleExtraAdvanceBinding((FrameLayout) view, ZIncludeExtraAdvanceBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSaleExtraAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleExtraAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_extra_advance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83689a;
    }
}
