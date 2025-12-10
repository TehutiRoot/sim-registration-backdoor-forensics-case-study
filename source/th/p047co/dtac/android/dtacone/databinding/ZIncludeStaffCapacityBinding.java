package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeStaffCapacityBinding */
/* loaded from: classes7.dex */
public final class ZIncludeStaffCapacityBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84654a;
    @NonNull
    public final DtacFontTextView staffTvMaxRangeAmount;
    @NonNull
    public final DtacFontTextView staffTvMaxRangeText;
    @NonNull
    public final DtacFontTextView staffTvTotalSaleAmount;
    @NonNull
    public final DtacFontTextView staffTvTotalSaleText;

    public ZIncludeStaffCapacityBinding(View view, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84654a = view;
        this.staffTvMaxRangeAmount = dtacFontTextView;
        this.staffTvMaxRangeText = dtacFontTextView2;
        this.staffTvTotalSaleAmount = dtacFontTextView3;
        this.staffTvTotalSaleText = dtacFontTextView4;
    }

    @NonNull
    public static ZIncludeStaffCapacityBinding bind(@NonNull View view) {
        int i = R.id.staff_tv_max_range_amount;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.staff_tv_max_range_text;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.staff_tv_total_sale_amount;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.staff_tv_total_sale_text;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        return new ZIncludeStaffCapacityBinding(view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeStaffCapacityBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_include_staff_capacity, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84654a;
    }
}
