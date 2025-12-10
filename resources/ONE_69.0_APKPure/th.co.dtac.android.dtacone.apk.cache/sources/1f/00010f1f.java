package th.p047co.dtac.android.dtacone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import th.p047co.dtac.android.dtacone.databinding.ZSimRItemRowBinding;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.adapter.SimRListAdapter */
/* loaded from: classes7.dex */
public class SimRListAdapter extends RecyclerView.Adapter<SimRListViewHolder> {

    /* renamed from: a */
    public List f81069a;

    /* renamed from: b */
    public OnSelectSimR f81070b;

    /* renamed from: th.co.dtac.android.dtacone.adapter.SimRListAdapter$OnSelectSimR */
    /* loaded from: classes7.dex */
    public interface OnSelectSimR {
        void onSelectPhoneNumber(String str);
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.SimRListAdapter$SimRListViewHolder */
    /* loaded from: classes7.dex */
    public class SimRListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public TextView f81071a;

        /* renamed from: b */
        public CardView f81072b;

        public SimRListViewHolder(ZSimRItemRowBinding zSimRItemRowBinding) {
            super(zSimRItemRowBinding.getRoot());
            this.f81071a = zSimRItemRowBinding.registerTvSimR;
            DtacCardView dtacCardView = zSimRItemRowBinding.cardviewSimR;
            this.f81072b = dtacCardView;
            dtacCardView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimRListAdapter.this.f81070b != null) {
                SimRListAdapter.this.f81070b.onSelectPhoneNumber((String) SimRListAdapter.this.f81069a.get(getAdapterPosition()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81069a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setListener(OnSelectSimR onSelectSimR) {
        this.f81070b = onSelectSimR;
    }

    public void setSimRList(List<String> list) {
        this.f81069a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimRListViewHolder simRListViewHolder, int i) {
        simRListViewHolder.f81071a.setText(PhoneNumberFormat.toLocalNumberWithPrettyFormat((String) this.f81069a.get(i), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimRListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SimRListViewHolder(ZSimRItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}