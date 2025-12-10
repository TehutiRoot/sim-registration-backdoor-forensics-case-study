package th.p047co.dtac.android.dtacone.adapter.sale_report;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.sale_report.SubSaleReportAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZSaleReportItemRowBinding;
import th.p047co.dtac.android.dtacone.model.rtr_performance.RtrPerformanceCollection;

/* renamed from: th.co.dtac.android.dtacone.adapter.sale_report.SubSaleReportAdapter */
/* loaded from: classes7.dex */
public class SubSaleReportAdapter extends RecyclerView.Adapter<SaleReportViewHolder> {

    /* renamed from: a */
    public WeakReference f81498a;

    /* renamed from: b */
    public RtrPerformanceCollection f81499b;

    /* renamed from: c */
    public OnClickItemSubSaleReport f81500c;

    /* renamed from: th.co.dtac.android.dtacone.adapter.sale_report.SubSaleReportAdapter$OnClickItemSubSaleReport */
    /* loaded from: classes7.dex */
    public interface OnClickItemSubSaleReport {
        void onClickSubSaleReport(RtrPerformanceCollection rtrPerformanceCollection);
    }

    public SubSaleReportAdapter(Context context) {
        this.f81498a = new WeakReference(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m20250a(SubSaleReportAdapter subSaleReportAdapter, RtrPerformanceCollection rtrPerformanceCollection, View view) {
        subSaleReportAdapter.m20248c(rtrPerformanceCollection, view);
    }

    /* renamed from: c */
    public /* synthetic */ void m20248c(RtrPerformanceCollection rtrPerformanceCollection, View view) {
        this.f81500c.onClickSubSaleReport(rtrPerformanceCollection);
    }

    /* renamed from: b */
    public final void m20249b(SaleReportViewHolder saleReportViewHolder, int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation((Context) this.f81498a.get(), R.anim.slide_up);
        if (i > 3) {
            loadAnimation.setDuration(300L);
        } else {
            loadAnimation.setDuration(i * 300);
        }
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        saleReportViewHolder.f81486a.startAnimation(loadAnimation);
    }

    /* renamed from: d */
    public final void m20247d(SaleReportViewHolder saleReportViewHolder, final RtrPerformanceCollection rtrPerformanceCollection, int i) {
        int i2;
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
                i2 = R.mipmap.ic_product_sim_postpaid;
                break;
            case 1:
                i2 = R.mipmap.ic_product_cash_card;
                break;
            case 2:
                i2 = R.mipmap.ic_product_stv;
                break;
            case 3:
                i2 = R.mipmap.ic_product_dtac_online;
                break;
            case 4:
                i2 = R.mipmap.ic_product_sim;
                break;
            case 5:
                i2 = R.mipmap.ic_product_stv_online;
                break;
            case 6:
                i2 = R.mipmap.ic_product_refill;
                break;
            case 7:
                i2 = R.mipmap.ic_product_stv_proserm;
                break;
            case '\b':
                i2 = R.mipmap.ic_product_sim_prepaid;
                break;
            default:
                i2 = R.mipmap.ic_product_point;
                break;
        }
        saleReportViewHolder.f81488c.setImageDrawable(ContextCompat.getDrawable((Context) this.f81498a.get(), i2));
        saleReportViewHolder.f81489d.setText(rtrPerformanceCollection.getTitle());
        if (rtrPerformanceCollection.getData() != null && rtrPerformanceCollection.getData().length != 0) {
            int length = rtrPerformanceCollection.getData().length;
            if (length != 1) {
                if (length != 2) {
                    if (length == 3) {
                        saleReportViewHolder.f81490e.setText(String.format("%s %s", rtrPerformanceCollection.getData()[2].getTitle(), rtrPerformanceCollection.getData()[2].getValue()));
                    }
                }
                saleReportViewHolder.f81493h.setText(rtrPerformanceCollection.getData()[1].getTitle());
                saleReportViewHolder.f81494i.setText(rtrPerformanceCollection.getData()[1].getValue());
            }
            saleReportViewHolder.f81491f.setText(rtrPerformanceCollection.getData()[0].getTitle());
            saleReportViewHolder.f81492g.setText(rtrPerformanceCollection.getData()[0].getValue());
        }
        saleReportViewHolder.f81495j.setText(rtrPerformanceCollection.getDescription());
        if (rtrPerformanceCollection.getReports() != null && rtrPerformanceCollection.getReports().size() > 0 && i != 0) {
            saleReportViewHolder.f81486a.setOnClickListener(new View.OnClickListener() { // from class: lO1
                {
                    SubSaleReportAdapter.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubSaleReportAdapter.m20250a(SubSaleReportAdapter.this, rtrPerformanceCollection, view);
                }
            });
            saleReportViewHolder.f81496k.setVisibility(0);
        } else {
            saleReportViewHolder.f81486a.setClickable(false);
        }
        if (i != 0) {
            saleReportViewHolder.f81487b.setBackgroundColor(Color.parseColor("#F1F1F1"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        RtrPerformanceCollection rtrPerformanceCollection = this.f81499b;
        if (rtrPerformanceCollection == null) {
            return 0;
        }
        if (rtrPerformanceCollection.getReports() == null) {
            return 1;
        }
        return this.f81499b.getReports().size() + 1;
    }

    public void setOnClickSubReportListener(OnClickItemSubSaleReport onClickItemSubSaleReport) {
        this.f81500c = onClickItemSubSaleReport;
    }

    public void setSaleReport(RtrPerformanceCollection rtrPerformanceCollection) {
        this.f81499b = rtrPerformanceCollection;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SaleReportViewHolder saleReportViewHolder, int i) {
        RtrPerformanceCollection rtrPerformanceCollection;
        if (i == 0) {
            rtrPerformanceCollection = this.f81499b;
        } else {
            rtrPerformanceCollection = this.f81499b.getReports().get(i - 1);
        }
        m20249b(saleReportViewHolder, i);
        m20247d(saleReportViewHolder, rtrPerformanceCollection, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SaleReportViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SaleReportViewHolder(ZSaleReportItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
