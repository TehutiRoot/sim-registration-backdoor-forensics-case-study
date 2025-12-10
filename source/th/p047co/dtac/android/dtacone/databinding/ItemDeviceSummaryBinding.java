package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemDeviceSummaryBinding */
/* loaded from: classes7.dex */
public final class ItemDeviceSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84311a;
    @NonNull
    public final ConstraintLayout buttonDeviceExtendContract;
    @NonNull
    public final ConstraintLayout constraintLayout9;
    @NonNull
    public final ImageView imAdd;
    @NonNull
    public final View line;
    @NonNull
    public final RecyclerView rvSubContract;
    @NonNull
    public final DtacFontTextView tvExtendContract;
    @NonNull
    public final DtacFontTextView tvSubscriberNo;
    @NonNull
    public final View view7;

    public ItemDeviceSummaryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, View view, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view2) {
        this.f84311a = constraintLayout;
        this.buttonDeviceExtendContract = constraintLayout2;
        this.constraintLayout9 = constraintLayout3;
        this.imAdd = imageView;
        this.line = view;
        this.rvSubContract = recyclerView;
        this.tvExtendContract = dtacFontTextView;
        this.tvSubscriberNo = dtacFontTextView2;
        this.view7 = view2;
    }

    @NonNull
    public static ItemDeviceSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.buttonDeviceExtendContract;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.constraintLayout9;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.imAdd;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                    i = R.id.rvSubContract;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.tvExtendContract;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvSubscriberNo;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view7))) != null) {
                                return new ItemDeviceSummaryBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, imageView, findChildViewById, recyclerView, dtacFontTextView, dtacFontTextView2, findChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_device_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84311a;
    }
}
