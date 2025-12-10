package co.omise.android.p009ui;

import java.util.Locale;

@Deprecated
/* renamed from: co.omise.android.ui.ExpiryMonthSpinnerAdapter */
/* loaded from: classes3.dex */
public class ExpiryMonthSpinnerAdapter extends NumberRangeSpinnerAdapter {
    public ExpiryMonthSpinnerAdapter() {
        super(1, 12);
    }

    @Override // co.omise.android.p009ui.NumberRangeSpinnerAdapter
    public String getItemDropDownLabel(int i) {
        return String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
    }

    @Override // co.omise.android.p009ui.NumberRangeSpinnerAdapter
    public String getItemLabel(int i) {
        return String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
    }
}
