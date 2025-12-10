package th.p047co.dtac.android.dtacone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.adapter.TermsConditionAdapter */
/* loaded from: classes7.dex */
public class TermsConditionAdapter extends RecyclerView.Adapter<C14139a> {

    /* renamed from: a */
    public String[] f80983a;

    /* renamed from: th.co.dtac.android.dtacone.adapter.TermsConditionAdapter$a */
    /* loaded from: classes7.dex */
    public class C14139a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f80984a;

        public C14139a(View view) {
            super(view);
            this.f80984a = (TextView) view.findViewById(R.id.tvTermsCondition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        String[] strArr = this.f80983a;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    public void setListTermsCondition(String[] strArr) {
        this.f80983a = strArr;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C14139a c14139a, int i) {
        c14139a.f80984a.setText(this.f80983a[i]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C14139a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14139a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_terms_condition_item_list, viewGroup, false));
    }
}
