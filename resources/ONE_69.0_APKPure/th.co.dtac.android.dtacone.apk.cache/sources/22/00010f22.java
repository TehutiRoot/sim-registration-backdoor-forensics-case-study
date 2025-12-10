package th.p047co.dtac.android.dtacone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.adapter.TermsConditionAdapter */
/* loaded from: classes7.dex */
public class TermsConditionAdapter extends RecyclerView.Adapter<C14128a> {

    /* renamed from: a */
    public String[] f81074a;

    /* renamed from: th.co.dtac.android.dtacone.adapter.TermsConditionAdapter$a */
    /* loaded from: classes7.dex */
    public class C14128a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f81075a;

        public C14128a(View view) {
            super(view);
            this.f81075a = (TextView) view.findViewById(R.id.tvTermsCondition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        String[] strArr = this.f81074a;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    public void setListTermsCondition(String[] strArr) {
        this.f81074a = strArr;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C14128a c14128a, int i) {
        c14128a.f81075a.setText(this.f81074a[i]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C14128a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14128a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_terms_condition_item_list, viewGroup, false));
    }
}