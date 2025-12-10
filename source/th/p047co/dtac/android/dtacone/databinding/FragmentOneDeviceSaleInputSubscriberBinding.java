package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleInputSubscriberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleInputSubscriberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83928a;

    public FragmentOneDeviceSaleInputSubscriberBinding(NestedScrollView nestedScrollView) {
        this.f83928a = nestedScrollView;
    }

    @NonNull
    public static FragmentOneDeviceSaleInputSubscriberBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneDeviceSaleInputSubscriberBinding((NestedScrollView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneDeviceSaleInputSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleInputSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_input_subscriber, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83928a;
    }
}
