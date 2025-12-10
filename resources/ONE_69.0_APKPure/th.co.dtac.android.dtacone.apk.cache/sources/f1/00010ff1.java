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
    public List f81516a;

    /* renamed from: b */
    public RadioGroup f81517b = null;

    /* renamed from: c */
    public OnClickPrice f81518c;

    /* renamed from: a */
    public static /* synthetic */ void m20445a(PriceListAdapter priceListAdapter, View view) {
        priceListAdapter.m20442d(view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20444b(PriceListAdapter priceListAdapter, RadioGroup radioGroup, int i) {
        priceListAdapter.m20443c(radioGroup, i);
    }

    /* renamed from: c */
    public final /* synthetic */ void m20443c(RadioGroup radioGroup, int i) {
        RadioGroup radioGroup2 = this.f81517b;
        if (radioGroup2 != null && radioGroup2 != radioGroup) {
            radioGroup2.clearCheck();
        }
        this.f81517b = radioGroup;
    }

    public void clearEPinPrice() {
        RadioGroup radioGroup = this.f81517b;
        if (radioGroup != null) {
            radioGroup.clearCheck();
            this.f81517b = null;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m20442d(View view) {
        this.f81518c.onSelectedPriceResult(Integer.valueOf(Integer.parseInt(((DtacRadioButton) view).getText().toString())));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = this.f81516a.size();
        if (size % 2 != 0) {
            return size - 1;
        }
        return size;
    }

    public void setPriceAndAdapter(List<Integer> list, OnClickPrice<Integer> onClickPrice) {
        this.f81518c = onClickPrice;
        this.f81516a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(PriceViewHolder priceViewHolder, int i) {
        priceViewHolder.getRdbEpinPrice().setText(String.valueOf(this.f81516a.get(i)));
        priceViewHolder.getRdbGroupPrice().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: Co1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                PriceListAdapter.m20444b(PriceListAdapter.this, radioGroup, i2);
            }
        });
        priceViewHolder.getRdbEpinPrice().setOnClickListener(new View.OnClickListener() { // from class: Do1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PriceListAdapter.m20445a(PriceListAdapter.this, view);
            }
        });
        priceViewHolder.getRdbEpinPrice().setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public PriceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new PriceViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_epin_item_row, viewGroup, false));
    }
}