package th.p047co.dtac.android.dtacone.adapter.sale_report;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import th.p047co.dtac.android.dtacone.databinding.ZSaleReportItemRowBinding;

/* renamed from: th.co.dtac.android.dtacone.adapter.sale_report.SaleReportViewHolder */
/* loaded from: classes7.dex */
public class SaleReportViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public CardView f81486a;

    /* renamed from: b */
    public ViewGroup f81487b;

    /* renamed from: c */
    public ImageView f81488c;

    /* renamed from: d */
    public TextView f81489d;

    /* renamed from: e */
    public TextView f81490e;

    /* renamed from: f */
    public TextView f81491f;

    /* renamed from: g */
    public TextView f81492g;

    /* renamed from: h */
    public TextView f81493h;

    /* renamed from: i */
    public TextView f81494i;

    /* renamed from: j */
    public TextView f81495j;

    /* renamed from: k */
    public ImageView f81496k;

    /* renamed from: l */
    public final ZSaleReportItemRowBinding f81497l;

    public SaleReportViewHolder(ZSaleReportItemRowBinding zSaleReportItemRowBinding) {
        super(zSaleReportItemRowBinding.getRoot());
        this.f81497l = zSaleReportItemRowBinding;
        m20251b();
    }

    /* renamed from: b */
    public final void m20251b() {
        ZSaleReportItemRowBinding zSaleReportItemRowBinding = this.f81497l;
        this.f81486a = zSaleReportItemRowBinding.cardviewSaleReport;
        this.f81487b = zSaleReportItemRowBinding.frameReportItem;
        this.f81488c = zSaleReportItemRowBinding.iconSaleType;
        this.f81489d = zSaleReportItemRowBinding.tvReportItemTitle;
        this.f81490e = zSaleReportItemRowBinding.tvReportItemData3;
        this.f81491f = zSaleReportItemRowBinding.tvReportItemData1Title;
        this.f81492g = zSaleReportItemRowBinding.tvReportItemData1Value;
        this.f81493h = zSaleReportItemRowBinding.tvReportItemData2Title;
        this.f81494i = zSaleReportItemRowBinding.tvReportItemData2Value;
        this.f81495j = zSaleReportItemRowBinding.tvReportItemDescription;
        this.f81496k = zSaleReportItemRowBinding.icReportItemIconRight;
    }
}
