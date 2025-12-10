package p000;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: aE */
/* loaded from: classes4.dex */
public class C1879aE extends BaseAdapter {

    /* renamed from: d */
    public static final int f8276d;

    /* renamed from: a */
    public final Calendar f8277a;

    /* renamed from: b */
    public final int f8278b;

    /* renamed from: c */
    public final int f8279c;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f8276d = i;
    }

    public C1879aE() {
        Calendar m1133q = AbstractC22545v02.m1133q();
        this.f8277a = m1133q;
        this.f8278b = m1133q.getMaximum(7);
        this.f8279c = m1133q.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f8278b) {
            return null;
        }
        return Integer.valueOf(m65117b(i));
    }

    /* renamed from: b */
    public final int m65117b(int i) {
        int i2 = i + this.f8279c;
        int i3 = this.f8278b;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8278b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f8277a.set(7, m65117b(i));
        textView.setText(this.f8277a.getDisplayName(7, f8276d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f8277a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C1879aE(int i) {
        Calendar m1133q = AbstractC22545v02.m1133q();
        this.f8277a = m1133q;
        this.f8278b = m1133q.getMaximum(7);
        this.f8279c = i;
    }
}
