package th.p047co.dtac.android.dtacone.adapter.sale_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.sale_report.SaleReportAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZSaleReportItemRowBinding;
import th.p047co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection;
import th.p047co.dtac.android.dtacone.model.rtr_performance.SaleReportListCollection;

/* renamed from: th.co.dtac.android.dtacone.adapter.sale_report.SaleReportAdapter */
/* loaded from: classes7.dex */
public class SaleReportAdapter extends RecyclerView.Adapter<SaleReportViewHolder> {

    /* renamed from: a */
    public WeakReference f81574a;

    /* renamed from: b */
    public SaleReportListCollection f81575b;

    /* renamed from: c */
    public OnClickItemSaleReport f81576c;

    /* renamed from: th.co.dtac.android.dtacone.adapter.sale_report.SaleReportAdapter$OnClickItemSaleReport */
    /* loaded from: classes7.dex */
    public interface OnClickItemSaleReport {
        void onClickSaleReport(RtrPerformanceCollection rtrPerformanceCollection);
    }

    public SaleReportAdapter(Context context) {
        this.f81574a = new WeakReference(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m20429a(SaleReportAdapter saleReportAdapter, RtrPerformanceCollection rtrPerformanceCollection, View view) {
        saleReportAdapter.m20428b(rtrPerformanceCollection, view);
    }

    /* renamed from: b */
    public final /* synthetic */ void m20428b(RtrPerformanceCollection rtrPerformanceCollection, View view) {
        this.f81576c.onClickSaleReport(rtrPerformanceCollection);
    }

    /* renamed from: c */
    public final void m20427c(SaleReportViewHolder saleReportViewHolder, final RtrPerformanceCollection rtrPerformanceCollection) {
        int i;
        String type = rtrPerformanceCollection.getType();
        type.hashCode();
        char c = 65535;
        switch (type.hashCode()) {
            case -820155916:
                if (type.equals("SIM_POSTPAID")) {
                    c = 0;
                    break;
                }
                break;
            case -722354020:
                if (type.equals("CASH_CARD")) {
                    c = 1;
                    break;
                }
                break;
            case -500435984:
                if (type.equals("STV_PROSERM")) {
                    c = 2;
                    break;
                }
                break;
            case 67873:
                if (type.equals("DOL")) {
                    c = 3;
                    break;
                }
                break;
            case 82103:
                if (type.equals("SIM")) {
                    c = 4;
                    break;
                }
                break;
            case 82453:
                if (type.equals("STV")) {
                    c = 5;
                    break;
                }
                break;
            case 63568227:
                if (type.equals("REFILLER")) {
                    c = 6;
                    break;
                }
                break;
            case 408940570:
                if (type.equals("PROSERM")) {
                    c = 7;
                    break;
                }
                break;
            case 739104839:
                if (type.equals("SIM_PREPAID")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = R.mipmap.ic_product_sim_postpaid;
                break;
            case 1:
                i = R.mipmap.ic_product_cash_card;
                break;
            case 2:
                i = R.mipmap.ic_product_stv;
                break;
            case 3:
                i = R.mipmap.ic_product_dtac_online;
                break;
            case 4:
                i = R.mipmap.ic_product_sim;
                break;
            case 5:
                i = R.mipmap.ic_product_stv_online;
                break;
            case 6:
                i = R.mipmap.ic_product_refill;
                break;
            case 7:
                i = R.mipmap.ic_product_stv_proserm;
                break;
            case '\b':
                i = R.mipmap.ic_product_sim_prepaid;
                break;
            default:
                i = R.mipmap.ic_product_point;
                break;
        }
        saleReportViewHolder.f81579c.setImageDrawable(ContextCompat.getDrawable((Context) this.f81574a.get(), i));
        saleReportViewHolder.f81580d.setText(rtrPerformanceCollection.getTitle());
        if (rtrPerformanceCollection.getData() != null && rtrPerformanceCollection.getData().length != 0) {
            int length = rtrPerformanceCollection.getData().length;
            if (length != 1) {
                if (length != 2) {
                    if (length == 3) {
                        saleReportViewHolder.f81581e.setText(String.format("%s %s", rtrPerformanceCollection.getData()[2].getTitle(), rtrPerformanceCollection.getData()[2].getValue()));
                    }
                }
                saleReportViewHolder.f81584h.setText(rtrPerformanceCollection.getData()[1].getTitle());
                saleReportViewHolder.f81585i.setText(rtrPerformanceCollection.getData()[1].getValue());
            }
            saleReportViewHolder.f81582f.setText(rtrPerformanceCollection.getData()[0].getTitle());
            saleReportViewHolder.f81583g.setText(rtrPerformanceCollection.getData()[0].getValue());
        }
        saleReportViewHolder.f81586j.setText(rtrPerformanceCollection.getDescription());
        if (rtrPerformanceCollection.getReports() != null && rtrPerformanceCollection.getReports().size() > 0) {
            saleReportViewHolder.f81577a.setOnClickListener(new View.OnClickListener() { // from class: gE1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SaleReportAdapter.m20429a(SaleReportAdapter.this, rtrPerformanceCollection, view);
                }
            });
            saleReportViewHolder.f81587k.setVisibility(0);
            return;
        }
        saleReportViewHolder.f81577a.setClickable(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        SaleReportListCollection saleReportListCollection = this.f81575b;
        if (saleReportListCollection != null && saleReportListCollection.getReports() != null) {
            return this.f81575b.getReports().size();
        }
        return 0;
    }

    public void setOnClickReportListener(OnClickItemSaleReport onClickItemSaleReport) {
        this.f81576c = onClickItemSaleReport;
    }

    public void setSaleReportList(SaleReportListCollection saleReportListCollection) {
        this.f81575b = saleReportListCollection;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SaleReportViewHolder saleReportViewHolder, int i) {
        m20427c(saleReportViewHolder, this.f81575b.getReports().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SaleReportViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SaleReportViewHolder(ZSaleReportItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}