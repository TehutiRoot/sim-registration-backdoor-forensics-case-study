package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeManageStaffBinding */
/* loaded from: classes7.dex */
public final class ZIncludeManageStaffBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84626a;
    @NonNull
    public final DtacFontTextView tvClearMoney;
    @NonNull
    public final DtacFontTextView tvManageMoney;
    @NonNull
    public final DtacFontTextView tvManagePermission;

    public ZIncludeManageStaffBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84626a = linearLayout;
        this.tvClearMoney = dtacFontTextView;
        this.tvManageMoney = dtacFontTextView2;
        this.tvManagePermission = dtacFontTextView3;
    }

    @NonNull
    public static ZIncludeManageStaffBinding bind(@NonNull View view) {
        int i = R.id.tvClearMoney;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvManageMoney;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvManagePermission;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    return new ZIncludeManageStaffBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeManageStaffBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeManageStaffBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_manage_staff, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84626a;
    }
}
