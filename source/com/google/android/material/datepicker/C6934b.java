package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes4.dex */
public class C6934b extends BaseAdapter {

    /* renamed from: g */
    public static final int f49864g = AbstractC22545v02.m1133q().getMaximum(4);

    /* renamed from: h */
    public static final int f49865h = (AbstractC22545v02.m1133q().getMaximum(5) + AbstractC22545v02.m1133q().getMaximum(7)) - 1;

    /* renamed from: a */
    public final C21662pt0 f49866a;

    /* renamed from: b */
    public final DateSelector f49867b;

    /* renamed from: c */
    public Collection f49868c;

    /* renamed from: d */
    public C10399hh f49869d;

    /* renamed from: e */
    public final CalendarConstraints f49870e;

    /* renamed from: f */
    public final DayViewDecorator f49871f;

    public C6934b(C21662pt0 c21662pt0, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f49866a = c21662pt0;
        this.f49867b = dateSelector;
        this.f49870e = calendarConstraints;
        this.f49871f = dayViewDecorator;
        this.f49868c = dateSelector.getSelectedDays();
    }

    /* renamed from: a */
    public int m44823a(int i) {
        return m44822b() + (i - 1);
    }

    /* renamed from: b */
    public int m44822b() {
        return this.f49866a.m23563e(this.f49870e.m44932h());
    }

    /* renamed from: c */
    public final String m44821c(Context context, long j) {
        return AbstractC1521VD.m65898e(context, j, m44812l(j), m44813k(j), m44817g(j));
    }

    @Override // android.widget.Adapter
    /* renamed from: d */
    public Long getItem(int i) {
        if (i >= m44822b() && i <= m44811m()) {
            return Long.valueOf(this.f49866a.m23562f(m44810n(i)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.m44818f(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.m44822b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            pt0 r8 = r5.f49866a
            int r3 = r8.f76798e
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.m44809o(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C6934b.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: f */
    public final void m44818f(Context context) {
        if (this.f49869d == null) {
            this.f49869d = new C10399hh(context);
        }
    }

    /* renamed from: g */
    public boolean m44817g(long j) {
        for (Pair<Long, Long> pair : this.f49867b.getSelectedRanges()) {
            Long l = pair.second;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f49865h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f49866a.f76797d;
    }

    /* renamed from: h */
    public boolean m44816h(int i) {
        if (i % this.f49866a.f76797d == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public boolean m44815i(int i) {
        if ((i + 1) % this.f49866a.f76797d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m44814j(long j) {
        Iterator<Long> it = this.f49867b.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (AbstractC22545v02.m1149a(j) == AbstractC22545v02.m1149a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m44813k(long j) {
        for (Pair<Long, Long> pair : this.f49867b.getSelectedRanges()) {
            Long l = pair.first;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m44812l(long j) {
        if (AbstractC22545v02.m1135o().getTimeInMillis() == j) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public int m44811m() {
        return (m44822b() + this.f49866a.f76798e) - 1;
    }

    /* renamed from: n */
    public int m44810n(int i) {
        return (i - m44822b()) + 1;
    }

    /* renamed from: o */
    public final void m44809o(TextView textView, long j, int i) {
        C14017tg c14017tg;
        boolean z;
        C14017tg c14017tg2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String m44821c = m44821c(context, j);
        textView.setContentDescription(m44821c);
        boolean isValid = this.f49870e.getDateValidator().isValid(j);
        if (isValid) {
            textView.setEnabled(true);
            boolean m44814j = m44814j(j);
            textView.setSelected(m44814j);
            if (m44814j) {
                c14017tg2 = this.f49869d.f62549b;
            } else if (m44812l(j)) {
                c14017tg2 = this.f49869d.f62550c;
            } else {
                c14017tg2 = this.f49869d.f62548a;
            }
            c14017tg = c14017tg2;
            z = m44814j;
        } else {
            textView.setEnabled(false);
            c14017tg = this.f49869d.f62554g;
            z = false;
        }
        DayViewDecorator dayViewDecorator = this.f49871f;
        if (dayViewDecorator != null && i != -1) {
            C21662pt0 c21662pt0 = this.f49866a;
            int i2 = c21662pt0.f76796c;
            int i3 = c21662pt0.f76795b;
            boolean z2 = z;
            c14017tg.m22379e(textView, dayViewDecorator.getBackgroundColor(context, i2, i3, i, isValid, z2));
            Drawable compoundDrawableLeft = this.f49871f.getCompoundDrawableLeft(context, i2, i3, i, isValid, z2);
            Drawable compoundDrawableTop = this.f49871f.getCompoundDrawableTop(context, i2, i3, i, isValid, z2);
            Drawable compoundDrawableRight = this.f49871f.getCompoundDrawableRight(context, i2, i3, i, isValid, z);
            boolean z3 = z;
            textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.f49871f.getCompoundDrawableBottom(context, i2, i3, i, isValid, z3));
            textView.setContentDescription(this.f49871f.getContentDescription(context, i2, i3, i, isValid, z3, m44821c));
            return;
        }
        c14017tg.m22380d(textView);
    }

    /* renamed from: p */
    public final void m44808p(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (C21662pt0.m23565c(j).equals(this.f49866a)) {
            int m23561g = this.f49866a.m23561g(j);
            m44809o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m44823a(m23561g) - materialCalendarGridView.getFirstVisiblePosition()), j, m23561g);
        }
    }

    /* renamed from: q */
    public void m44807q(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f49868c) {
            m44808p(materialCalendarGridView, l.longValue());
        }
        DateSelector dateSelector = this.f49867b;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.getSelectedDays()) {
                m44808p(materialCalendarGridView, l2.longValue());
            }
            this.f49868c = this.f49867b.getSelectedDays();
        }
    }

    /* renamed from: r */
    public boolean m44806r(int i) {
        if (i >= m44822b() && i <= m44811m()) {
            return true;
        }
        return false;
    }
}
