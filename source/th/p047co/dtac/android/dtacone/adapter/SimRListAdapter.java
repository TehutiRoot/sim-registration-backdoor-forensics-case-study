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
    public List f80978a;

    /* renamed from: b */
    public OnSelectSimR f80979b;

    /* renamed from: th.co.dtac.android.dtacone.adapter.SimRListAdapter$OnSelectSimR */
    /* loaded from: classes7.dex */
    public interface OnSelectSimR {
        void onSelectPhoneNumber(String str);
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.SimRListAdapter$SimRListViewHolder */
    /* loaded from: classes7.dex */
    public class SimRListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public TextView f80980a;

        /* renamed from: b */
        public CardView f80981b;

        public SimRListViewHolder(ZSimRItemRowBinding zSimRItemRowBinding) {
            super(zSimRItemRowBinding.getRoot());
            this.f80980a = zSimRItemRowBinding.registerTvSimR;
            DtacCardView dtacCardView = zSimRItemRowBinding.cardviewSimR;
            this.f80981b = dtacCardView;
            dtacCardView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimRListAdapter.this.f80979b != null) {
                SimRListAdapter.this.f80979b.onSelectPhoneNumber((String) SimRListAdapter.this.f80978a.get(getAdapterPosition()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f80978a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setListener(OnSelectSimR onSelectSimR) {
        this.f80979b = onSelectSimR;
    }

    public void setSimRList(List<String> list) {
        this.f80978a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimRListViewHolder simRListViewHolder, int i) {
        simRListViewHolder.f80980a.setText(PhoneNumberFormat.toLocalNumberWithPrettyFormat((String) this.f80978a.get(i), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimRListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SimRListViewHolder(ZSimRItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
