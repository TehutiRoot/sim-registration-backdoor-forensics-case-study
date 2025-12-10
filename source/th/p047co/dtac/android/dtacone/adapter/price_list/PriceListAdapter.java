package th.p047co.dtac.android.dtacone.adapter.price_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.listener.price_list.OnClickPrice;
import th.p047co.dtac.android.dtacone.adapter.price_list.PriceListAdapter;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.adapter.price_list.PriceListAdapter */
/* loaded from: classes7.dex */
public class PriceListAdapter extends RecyclerView.Adapter<PriceViewHolder> {

    /* renamed from: a */
    public List f81425a;

    /* renamed from: b */
    public RadioGroup f81426b = null;

    /* renamed from: c */
    public OnClickPrice f81427c;

    /* renamed from: a */
    public static /* synthetic */ void m20270a(PriceListAdapter priceListAdapter, View view) {
        priceListAdapter.m20267d(view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20269b(PriceListAdapter priceListAdapter, RadioGroup radioGroup, int i) {
        priceListAdapter.m20268c(radioGroup, i);
    }

    /* renamed from: c */
    public final /* synthetic */ void m20268c(RadioGroup radioGroup, int i) {
        RadioGroup radioGroup2 = this.f81426b;
        if (radioGroup2 != null && radioGroup2 != radioGroup) {
            radioGroup2.clearCheck();
        }
        this.f81426b = radioGroup;
    }

    public void clearEPinPrice() {
        RadioGroup radioGroup = this.f81426b;
        if (radioGroup != null) {
            radioGroup.clearCheck();
            this.f81426b = null;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m20267d(View view) {
        this.f81427c.onSelectedPriceResult(Integer.valueOf(Integer.parseInt(((DtacRadioButton) view).getText().toString())));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = this.f81425a.size();
        if (size % 2 != 0) {
            return size - 1;
        }
        return size;
    }

    public void setPriceAndAdapter(List<Integer> list, OnClickPrice<Integer> onClickPrice) {
        this.f81427c = onClickPrice;
        this.f81425a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(PriceViewHolder priceViewHolder, int i) {
        priceViewHolder.getRdbEpinPrice().setText(String.valueOf(this.f81425a.get(i)));
        priceViewHolder.getRdbGroupPrice().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: Fn1
            {
                PriceListAdapter.this = this;
            }

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                PriceListAdapter.m20269b(PriceListAdapter.this, radioGroup, i2);
            }
        });
        priceViewHolder.getRdbEpinPrice().setOnClickListener(new View.OnClickListener() { // from class: Gn1
            {
                PriceListAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PriceListAdapter.m20270a(PriceListAdapter.this, view);
            }
        });
        priceViewHolder.getRdbEpinPrice().setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public PriceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new PriceViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_epin_item_row, viewGroup, false));
    }
}
