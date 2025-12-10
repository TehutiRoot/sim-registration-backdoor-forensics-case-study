package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83700a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final CardView deviceSummaryCard;
    @NonNull
    public final LinearLayout layoutDeviceSummary;

    public FragmentDeviceSummaryBinding(FrameLayout frameLayout, ImageView imageView, CardView cardView, LinearLayout linearLayout) {
        this.f83700a = frameLayout;
        this.chevronRight = imageView;
        this.deviceSummaryCard = cardView;
        this.layoutDeviceSummary = linearLayout;
    }

    @NonNull
    public static FragmentDeviceSummaryBinding bind(@NonNull View view) {
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.deviceSummaryCard;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.layoutDeviceSummary;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new FragmentDeviceSummaryBinding((FrameLayout) view, imageView, cardView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83700a;
    }
}
