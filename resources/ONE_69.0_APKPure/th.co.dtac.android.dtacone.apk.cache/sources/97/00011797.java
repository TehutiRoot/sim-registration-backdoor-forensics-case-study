package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemHeaderInfoDeviceSummaryBinding */
/* loaded from: classes7.dex */
public final class ItemHeaderInfoDeviceSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84422a;
    @NonNull
    public final Guideline guideline1;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final Guideline guideline3;

    public ItemHeaderInfoDeviceSummaryBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3) {
        this.f84422a = constraintLayout;
        this.guideline1 = guideline;
        this.guideline2 = guideline2;
        this.guideline3 = guideline3;
    }

    @NonNull
    public static ItemHeaderInfoDeviceSummaryBinding bind(@NonNull View view) {
        int i = R.id.guideline1;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.guideline2;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                i = R.id.guideline3;
                Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline3 != null) {
                    return new ItemHeaderInfoDeviceSummaryBinding((ConstraintLayout) view, guideline, guideline2, guideline3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemHeaderInfoDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemHeaderInfoDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_header_info_device_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84422a;
    }
}