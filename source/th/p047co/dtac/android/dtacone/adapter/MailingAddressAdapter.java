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
    public Context f80928a;

    /* renamed from: b */
    public boolean f80929b;

    /* renamed from: th.co.dtac.android.dtacone.adapter.MailingAddressAdapter$a */
    /* loaded from: classes7.dex */
    public static class C14138a {

        /* renamed from: a */
        public TextView f80930a;

        public C14138a() {
        }
    }

    public MailingAddressAdapter(Context context, int i, boolean z) {
        super(context, i);
        this.f80929b = z;
        this.f80928a = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        String value;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.z_location_address_row, viewGroup, false);
            C14138a c14138a = new C14138a();
            c14138a.f80930a = (TextView) view.findViewById(R.id.z_tv_location_addres);
            if (this.f80929b) {
                Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.f80928a, R.drawable.ic_arrow_right));
                DrawableCompat.setTint(wrap, ContextCompat.getColor(getContext(), R.color.warmGrey));
                DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
                c14138a.f80930a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, wrap, (Drawable) null);
            } else {
                c14138a.f80930a.setGravity(17);
            }
            view.setTag(c14138a);
        }
        AddressItemData addressItemData = (AddressItemData) getItem(i);
        TextView textView = ((C14138a) view.getTag()).f80930a;
        if (addressItemData == null) {
            value = "";
        } else {
            value = addressItemData.getValue();
        }
        textView.setText(value);
        return view;
    }
}
