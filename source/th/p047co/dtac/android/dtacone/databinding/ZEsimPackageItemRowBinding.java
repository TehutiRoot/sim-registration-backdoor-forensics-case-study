package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZEsimPackageItemRowBinding */
/* loaded from: classes7.dex */
public final class ZEsimPackageItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84604a;
    @NonNull
    public final AppCompatImageView icInfoValidity;
    @NonNull
    public final LinearLayout packageInfoBoxList;
    @NonNull
    public final DtacFontTextView packageListTvPackageSetTitle;
    @NonNull
    public final DtacFontTextView packageListTvPrice;
    @NonNull
    public final RelativeLayout priceBox;
    @NonNull
    public final RecyclerView rvInfoList;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvValidity;
    @NonNull
    public final LinearLayout validityBox;

    public ZEsimPackageItemRowBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, RelativeLayout relativeLayout, RecyclerView recyclerView, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, LinearLayout linearLayout2) {
        this.f84604a = constraintLayout;
        this.icInfoValidity = appCompatImageView;
        this.packageInfoBoxList = linearLayout;
        this.packageListTvPackageSetTitle = dtacFontTextView;
        this.packageListTvPrice = dtacFontTextView2;
        this.priceBox = relativeLayout;
        this.rvInfoList = recyclerView;
        this.tvPrice = dtacFontTextView3;
        this.tvValidity = dtacFontTextView4;
        this.validityBox = linearLayout2;
    }

    @NonNull
    public static ZEsimPackageItemRowBinding bind(@NonNull View view) {
        int i = R.id.icInfoValidity;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.package_info_box_list;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.package_list_tv_package_set_title;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.package_list_tv_price;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.price_box;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.rvInfoList;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tvPrice;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvValidity;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.validityBox;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            return new ZEsimPackageItemRowBinding((ConstraintLayout) view, appCompatImageView, linearLayout, dtacFontTextView, dtacFontTextView2, relativeLayout, recyclerView, dtacFontTextView3, dtacFontTextView4, linearLayout2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZEsimPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZEsimPackageItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_esim_package_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84604a;
    }
}
