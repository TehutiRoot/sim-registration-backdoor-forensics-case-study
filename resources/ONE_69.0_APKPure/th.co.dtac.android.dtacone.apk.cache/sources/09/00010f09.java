package th.p047co.dtac.android.dtacone.adapter;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;

/* renamed from: th.co.dtac.android.dtacone.adapter.MailingAddressAdapter */
/* loaded from: classes7.dex */
public class MailingAddressAdapter extends ArrayAdapter<AddressItemData> {

    /* renamed from: a */
    public Context f81019a;

    /* renamed from: b */
    public boolean f81020b;

    /* renamed from: th.co.dtac.android.dtacone.adapter.MailingAddressAdapter$a */
    /* loaded from: classes7.dex */
    public static class C14127a {

        /* renamed from: a */
        public TextView f81021a;

        public C14127a() {
        }
    }

    public MailingAddressAdapter(Context context, int i, boolean z) {
        super(context, i);
        this.f81020b = z;
        this.f81019a = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        String value;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.z_location_address_row, viewGroup, false);
            C14127a c14127a = new C14127a();
            c14127a.f81021a = (TextView) view.findViewById(R.id.z_tv_location_addres);
            if (this.f81020b) {
                Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.f81019a, R.drawable.ic_arrow_right));
                DrawableCompat.setTint(wrap, ContextCompat.getColor(getContext(), R.color.warmGrey));
                DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
                c14127a.f81021a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, wrap, (Drawable) null);
            } else {
                c14127a.f81021a.setGravity(17);
            }
            view.setTag(c14127a);
        }
        AddressItemData addressItemData = (AddressItemData) getItem(i);
        TextView textView = ((C14127a) view.getTag()).f81021a;
        if (addressItemData == null) {
            value = "";
        } else {
            value = addressItemData.getValue();
        }
        textView.setText(value);
        return view;
    }
}