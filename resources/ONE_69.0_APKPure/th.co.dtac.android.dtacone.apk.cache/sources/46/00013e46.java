package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.adapter.AddressAdapter */
/* loaded from: classes10.dex */
public class AddressAdapter extends ArrayAdapter<AddressItemData> {

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.adapter.AddressAdapter$a */
    /* loaded from: classes10.dex */
    public static class C15127a {

        /* renamed from: a */
        public TextView f96782a;

        public C15127a() {
        }
    }

    public AddressAdapter(Context context, int i) {
        super(context, i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        String value;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_one_address, viewGroup, false);
            C15127a c15127a = new C15127a();
            c15127a.f96782a = (TextView) view.findViewById(R.id.oneAddressItemTextView);
            view.setTag(c15127a);
        }
        AddressItemData addressItemData = (AddressItemData) getItem(i);
        TextView textView = ((C15127a) view.getTag()).f96782a;
        if (addressItemData == null) {
            value = "";
        } else {
            value = addressItemData.getValue();
        }
        textView.setText(value);
        return view;
    }
}