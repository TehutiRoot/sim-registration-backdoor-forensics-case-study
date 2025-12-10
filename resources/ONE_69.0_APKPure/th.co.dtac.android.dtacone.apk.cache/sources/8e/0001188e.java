package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.PlaceholderUsageItemBinding */
/* loaded from: classes7.dex */
public final class PlaceholderUsageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84669a;

    public PlaceholderUsageItemBinding(LinearLayout linearLayout) {
        this.f84669a = linearLayout;
    }

    @NonNull
    public static PlaceholderUsageItemBinding bind(@NonNull View view) {
        if (view != null) {
            return new PlaceholderUsageItemBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static PlaceholderUsageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PlaceholderUsageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.placeholder_usage_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84669a;
    }
}