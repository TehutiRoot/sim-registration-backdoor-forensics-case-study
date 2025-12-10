package co.omise.android.p009ui;

import org.joda.time.YearMonth;

@Deprecated
/* renamed from: co.omise.android.ui.ExpiryYearSpinnerAdapter */
/* loaded from: classes3.dex */
public class ExpiryYearSpinnerAdapter extends NumberRangeSpinnerAdapter {
    public ExpiryYearSpinnerAdapter() {
        super(YearMonth.now().getYear(), YearMonth.now().getYear() + 12);
    }

    @Override // co.omise.android.p009ui.NumberRangeSpinnerAdapter
    public String getItemDropDownLabel(int i) {
        return Integer.toString(i);
    }

    @Override // co.omise.android.p009ui.NumberRangeSpinnerAdapter
    public String getItemLabel(int i) {
        return Integer.toString(i).substring(2, 4);
    }
}
