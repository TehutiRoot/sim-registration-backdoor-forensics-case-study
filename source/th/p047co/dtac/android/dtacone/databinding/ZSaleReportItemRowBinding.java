package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSaleReportItemRowBinding */
/* loaded from: classes7.dex */
public final class ZSaleReportItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84693a;
    @NonNull
    public final RelativeLayout boxReportItemData1;
    @NonNull
    public final RelativeLayout boxReportItemData2;
    @NonNull
    public final DtacCardView cardviewSaleReport;
    @NonNull
    public final RelativeLayout frameReportItem;
    @NonNull
    public final ImageView icReportItemIconRight;
    @NonNull
    public final ImageView iconSaleType;
    @NonNull
    public final DtacFontTextView tvReportItemData1Title;
    @NonNull
    public final DtacFontTextView tvReportItemData1Value;
    @NonNull
    public final DtacFontTextView tvReportItemData2Title;
    @NonNull
    public final DtacFontTextView tvReportItemData2Value;
    @NonNull
    public final DtacFontTextView tvReportItemData3;
    @NonNull
    public final DtacFontTextView tvReportItemDescription;
    @NonNull
    public final DtacFontTextView tvReportItemTitle;

    public ZSaleReportItemRowBinding(DtacCardView dtacCardView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, DtacCardView dtacCardView2, RelativeLayout relativeLayout3, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7) {
        this.f84693a = dtacCardView;
        this.boxReportItemData1 = relativeLayout;
        this.boxReportItemData2 = relativeLayout2;
        this.cardviewSaleReport = dtacCardView2;
        this.frameReportItem = relativeLayout3;
        this.icReportItemIconRight = imageView;
        this.iconSaleType = imageView2;
        this.tvReportItemData1Title = dtacFontTextView;
        this.tvReportItemData1Value = dtacFontTextView2;
        this.tvReportItemData2Title = dtacFontTextView3;
        this.tvReportItemData2Value = dtacFontTextView4;
        this.tvReportItemData3 = dtacFontTextView5;
        this.tvReportItemDescription = dtacFontTextView6;
        this.tvReportItemTitle = dtacFontTextView7;
    }

    @NonNull
    public static ZSaleReportItemRowBinding bind(@NonNull View view) {
        int i = R.id.box_report_item_data1;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.box_report_item_data2;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout2 != null) {
                DtacCardView dtacCardView = (DtacCardView) view;
                i = R.id.frame_report_item;
                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout3 != null) {
                    i = R.id.ic_report_item_icon_right;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.icon_sale_type;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.tv_report_item_data1_title;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tv_report_item_data1_value;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tv_report_item_data2_title;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tv_report_item_data2_value;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.tv_report_item_data3;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                i = R.id.tv_report_item_description;
                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView6 != null) {
                                                    i = R.id.tv_report_item_title;
                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView7 != null) {
                                                        return new ZSaleReportItemRowBinding(dtacCardView, relativeLayout, relativeLayout2, dtacCardView, relativeLayout3, imageView, imageView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7);
                                                    }
                                                }
                                            }
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
    public static ZSaleReportItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSaleReportItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_sale_report_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84693a;
    }
}
