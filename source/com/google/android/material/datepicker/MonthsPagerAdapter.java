package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes4.dex */
public class MonthsPagerAdapter extends RecyclerView.Adapter {

    /* renamed from: a */
    public final CalendarConstraints f49823a;

    /* renamed from: b */
    public final DateSelector f49824b;

    /* renamed from: c */
    public final DayViewDecorator f49825c;

    /* renamed from: d */
    public final MaterialCalendar.InterfaceC6917l f49826d;

    /* renamed from: e */
    public final int f49827e;

    /* loaded from: classes4.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f49828a;

        /* renamed from: b */
        public final MaterialCalendarGridView f49829b;

        public ViewHolder(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f49828a = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.f49829b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MonthsPagerAdapter$a */
    /* loaded from: classes4.dex */
    public class C6926a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ MaterialCalendarGridView f49830a;

        public C6926a(MaterialCalendarGridView materialCalendarGridView) {
            this.f49830a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.f49830a.getAdapter2().m44806r(i)) {
                MonthsPagerAdapter.this.f49826d.mo44894a(this.f49830a.getAdapter2().getItem(i).longValue());
            }
        }
    }

    public MonthsPagerAdapter(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.InterfaceC6917l interfaceC6917l) {
        int i;
        C21662pt0 m44929k = calendarConstraints.m44929k();
        C21662pt0 m44933g = calendarConstraints.m44933g();
        C21662pt0 m44930j = calendarConstraints.m44930j();
        if (m44929k.compareTo(m44930j) <= 0) {
            if (m44930j.compareTo(m44933g) <= 0) {
                int m44896y = C6934b.f49864g * MaterialCalendar.m44896y(context);
                if (MaterialDatePicker.m44887B(context)) {
                    i = MaterialCalendar.m44896y(context);
                } else {
                    i = 0;
                }
                this.f49827e = m44896y + i;
                this.f49823a = calendarConstraints;
                this.f49824b = dateSelector;
                this.f49825c = dayViewDecorator;
                this.f49826d = interfaceC6917l;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* renamed from: b */
    public C21662pt0 m44861b(int i) {
        return this.f49823a.m44929k().m23558j(i);
    }

    /* renamed from: c */
    public CharSequence m44860c(int i) {
        return m44861b(i).m23560h();
    }

    /* renamed from: d */
    public int m44859d(C21662pt0 c21662pt0) {
        return this.f49823a.m44929k().m23557k(c21662pt0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C21662pt0 m23558j = this.f49823a.m44929k().m23558j(i);
        viewHolder.f49828a.setText(m23558j.m23560h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.f49829b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && m23558j.equals(materialCalendarGridView.getAdapter2().f49866a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m44807q(materialCalendarGridView);
        } else {
            C6934b c6934b = new C6934b(m23558j, this.f49824b, this.f49823a, this.f49825c);
            materialCalendarGridView.setNumColumns(m23558j.f76797d);
            materialCalendarGridView.setAdapter((ListAdapter) c6934b);
        }
        materialCalendarGridView.setOnItemClickListener(new C6926a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (MaterialDatePicker.m44887B(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f49827e));
            return new ViewHolder(linearLayout, true);
        }
        return new ViewHolder(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f49823a.m44931i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f49823a.m44929k().m23558j(i).m23559i();
    }
}
