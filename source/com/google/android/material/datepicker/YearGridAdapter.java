package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public class YearGridAdapter extends RecyclerView.Adapter {

    /* renamed from: a */
    public final MaterialCalendar f49854a;

    /* loaded from: classes4.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f49855a;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f49855a = textView;
        }
    }

    /* renamed from: com.google.android.material.datepicker.YearGridAdapter$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6932a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f49856a;

        public View$OnClickListenerC6932a(int i) {
            this.f49856a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            YearGridAdapter.this.f49854a.m44912C(YearGridAdapter.this.f49854a.m44899v().m44934f(C21662pt0.m23566b(this.f49856a, YearGridAdapter.this.f49854a.m44897x().f76795b)));
            YearGridAdapter.this.f49854a.m44911D(MaterialCalendar.CalendarSelector.DAY);
        }
    }

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.f49854a = materialCalendar;
    }

    /* renamed from: b */
    public final View.OnClickListener m44837b(int i) {
        return new View$OnClickListenerC6932a(i);
    }

    /* renamed from: c */
    public int m44836c(int i) {
        return i - this.f49854a.m44899v().m44929k().f76796c;
    }

    /* renamed from: d */
    public int m44835d(int i) {
        return this.f49854a.m44899v().m44929k().f76796c + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C14017tg c14017tg;
        int m44835d = m44835d(i);
        viewHolder.f49855a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m44835d)));
        TextView textView = viewHolder.f49855a;
        textView.setContentDescription(AbstractC1521VD.m65892k(textView.getContext(), m44835d));
        C10399hh m44898w = this.f49854a.m44898w();
        Calendar m1135o = AbstractC22545v02.m1135o();
        if (m1135o.get(1) == m44835d) {
            c14017tg = m44898w.f62553f;
        } else {
            c14017tg = m44898w.f62551d;
        }
        for (Long l : this.f49854a.getDateSelector().getSelectedDays()) {
            m1135o.setTimeInMillis(l.longValue());
            if (m1135o.get(1) == m44835d) {
                c14017tg = m44898w.f62552e;
            }
        }
        c14017tg.m22380d(viewHolder.f49855a);
        viewHolder.f49855a.setOnClickListener(m44837b(m44835d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f49854a.m44899v().m44928l();
    }
}
