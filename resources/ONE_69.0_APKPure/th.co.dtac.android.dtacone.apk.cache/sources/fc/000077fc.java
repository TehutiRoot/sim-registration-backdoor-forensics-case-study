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

/* renamed from: bE */
/* loaded from: classes4.dex */
public class C5340bE extends BaseAdapter {

    /* renamed from: d */
    public static final int f39036d;

    /* renamed from: a */
    public final Calendar f39037a;

    /* renamed from: b */
    public final int f39038b;

    /* renamed from: c */
    public final int f39039c;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f39036d = i;
    }

    public C5340bE() {
        Calendar m22893q = AbstractC22096s12.m22893q();
        this.f39037a = m22893q;
        this.f39038b = m22893q.getMaximum(7);
        this.f39039c = m22893q.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f39038b) {
            return null;
        }
        return Integer.valueOf(m51976b(i));
    }

    /* renamed from: b */
    public final int m51976b(int i) {
        int i2 = i + this.f39039c;
        int i3 = this.f39038b;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f39038b;
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
        this.f39037a.set(7, m51976b(i));
        textView.setText(this.f39037a.getDisplayName(7, f39036d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f39037a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C5340bE(int i) {
        Calendar m22893q = AbstractC22096s12.m22893q();
        this.f39037a = m22893q;
        this.f39038b = m22893q.getMaximum(7);
        this.f39039c = i;
    }
}