package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class MaterialCalendar<S> extends AbstractC6935c {

    /* renamed from: n */
    public static final Object f49727n = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: o */
    public static final Object f49728o = "NAVIGATION_PREV_TAG";

    /* renamed from: p */
    public static final Object f49729p = "NAVIGATION_NEXT_TAG";

    /* renamed from: q */
    public static final Object f49730q = "SELECTOR_TOGGLE_TAG";

    /* renamed from: a */
    public int f49731a;

    /* renamed from: b */
    public DateSelector f49732b;

    /* renamed from: c */
    public CalendarConstraints f49733c;

    /* renamed from: d */
    public DayViewDecorator f49734d;

    /* renamed from: e */
    public C21662pt0 f49735e;

    /* renamed from: f */
    public CalendarSelector f49736f;

    /* renamed from: g */
    public C10399hh f49737g;

    /* renamed from: h */
    public RecyclerView f49738h;

    /* renamed from: i */
    public RecyclerView f49739i;

    /* renamed from: j */
    public View f49740j;

    /* renamed from: k */
    public View f49741k;

    /* renamed from: l */
    public View f49742l;

    /* renamed from: m */
    public View f49743m;

    /* loaded from: classes4.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6906a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ MonthsPagerAdapter f49744a;

        public View$OnClickListenerC6906a(MonthsPagerAdapter monthsPagerAdapter) {
            this.f49744a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = MaterialCalendar.this.m44914A().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                MaterialCalendar.this.m44912C(this.f49744a.m44861b(findLastVisibleItemPosition));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    /* loaded from: classes4.dex */
    public class RunnableC6907b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f49746a;

        public RunnableC6907b(int i) {
            this.f49746a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f49739i.smoothScrollToPosition(this.f49746a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    /* loaded from: classes4.dex */
    public class C6908c extends AccessibilityDelegateCompat {
        public C6908c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    /* loaded from: classes4.dex */
    public class C6909d extends SJ1 {

        /* renamed from: I */
        public final /* synthetic */ int f49749I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6909d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f49749I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            if (this.f49749I == 0) {
                iArr[0] = MaterialCalendar.this.f49739i.getWidth();
                iArr[1] = MaterialCalendar.this.f49739i.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f49739i.getHeight();
            iArr[1] = MaterialCalendar.this.f49739i.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    /* loaded from: classes4.dex */
    public class C6910e implements InterfaceC6917l {
        public C6910e() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.InterfaceC6917l
        /* renamed from: a */
        public void mo44894a(long j) {
            if (MaterialCalendar.this.f49733c.getDateValidator().isValid(j)) {
                MaterialCalendar.this.f49732b.select(j);
                Iterator<OnSelectionChangedListener<Object>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onSelectionChanged(MaterialCalendar.this.f49732b.getSelection());
                }
                MaterialCalendar.this.f49739i.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f49738h != null) {
                    MaterialCalendar.this.f49738h.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    /* loaded from: classes4.dex */
    public class C6911f extends AccessibilityDelegateCompat {
        public C6911f() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setScrollable(false);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    /* loaded from: classes4.dex */
    public class C6912g extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        public final Calendar f49753a = AbstractC22545v02.m1133q();

        /* renamed from: b */
        public final Calendar f49754b = AbstractC22545v02.m1133q();

        public C6912g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int width;
            if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (Pair<Long, Long> pair : MaterialCalendar.this.f49732b.getSelectedRanges()) {
                    Long l = pair.first;
                    if (l != null && pair.second != null) {
                        this.f49753a.setTimeInMillis(l.longValue());
                        this.f49754b.setTimeInMillis(pair.second.longValue());
                        int m44836c = yearGridAdapter.m44836c(this.f49753a.get(1));
                        int m44836c2 = yearGridAdapter.m44836c(this.f49754b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(m44836c);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(m44836c2);
                        int spanCount = m44836c / gridLayoutManager.getSpanCount();
                        int spanCount2 = m44836c2 / gridLayoutManager.getSpanCount();
                        for (int i2 = spanCount; i2 <= spanCount2; i2++) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + MaterialCalendar.this.f49737g.f62551d.m22381c();
                                int bottom = findViewByPosition3.getBottom() - MaterialCalendar.this.f49737g.f62551d.m22382b();
                                if (i2 == spanCount && findViewByPosition != null) {
                                    i = findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i2 == spanCount2 && findViewByPosition2 != null) {
                                    width = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, width, bottom, MaterialCalendar.this.f49737g.f62555h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    /* loaded from: classes4.dex */
    public class C6913h extends AccessibilityDelegateCompat {
        public C6913h() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (MaterialCalendar.this.f49743m.getVisibility() == 0) {
                string = MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection);
            } else {
                string = MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection);
            }
            accessibilityNodeInfoCompat.setHintText(string);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    /* loaded from: classes4.dex */
    public class C6914i extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ MonthsPagerAdapter f49757a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f49758b;

        public C6914i(MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
            this.f49757a = monthsPagerAdapter;
            this.f49758b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f49758b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int findLastVisibleItemPosition;
            if (i < 0) {
                findLastVisibleItemPosition = MaterialCalendar.this.m44914A().findFirstVisibleItemPosition();
            } else {
                findLastVisibleItemPosition = MaterialCalendar.this.m44914A().findLastVisibleItemPosition();
            }
            MaterialCalendar.this.f49735e = this.f49757a.m44861b(findLastVisibleItemPosition);
            this.f49758b.setText(this.f49757a.m44860c(findLastVisibleItemPosition));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6915j implements View.OnClickListener {
        public View$OnClickListenerC6915j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.m44909F();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6916k implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ MonthsPagerAdapter f49761a;

        public View$OnClickListenerC6916k(MonthsPagerAdapter monthsPagerAdapter) {
            this.f49761a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = MaterialCalendar.this.m44914A().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < MaterialCalendar.this.f49739i.getAdapter().getItemCount()) {
                MaterialCalendar.this.m44912C(this.f49761a.m44861b(findFirstVisibleItemPosition));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$l */
    /* loaded from: classes4.dex */
    public interface InterfaceC6917l {
        /* renamed from: a */
        void mo44894a(long j);
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }

    /* renamed from: y */
    public static int m44896y(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: z */
    public static int m44895z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i = C6934b.f49864g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    /* renamed from: A */
    public LinearLayoutManager m44914A() {
        return (LinearLayoutManager) this.f49739i.getLayoutManager();
    }

    /* renamed from: B */
    public final void m44913B(int i) {
        this.f49739i.post(new RunnableC6907b(i));
    }

    /* renamed from: C */
    public void m44912C(C21662pt0 c21662pt0) {
        boolean z;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f49739i.getAdapter();
        int m44859d = monthsPagerAdapter.m44859d(c21662pt0);
        int m44859d2 = m44859d - monthsPagerAdapter.m44859d(this.f49735e);
        boolean z2 = false;
        if (Math.abs(m44859d2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (m44859d2 > 0) {
            z2 = true;
        }
        this.f49735e = c21662pt0;
        if (z && z2) {
            this.f49739i.scrollToPosition(m44859d - 3);
            m44913B(m44859d);
        } else if (z) {
            this.f49739i.scrollToPosition(m44859d + 3);
            m44913B(m44859d);
        } else {
            m44913B(m44859d);
        }
    }

    /* renamed from: D */
    public void m44911D(CalendarSelector calendarSelector) {
        this.f49736f = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f49738h.getLayoutManager().scrollToPosition(((YearGridAdapter) this.f49738h.getAdapter()).m44836c(this.f49735e.f76796c));
            this.f49742l.setVisibility(0);
            this.f49743m.setVisibility(8);
            this.f49740j.setVisibility(8);
            this.f49741k.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f49742l.setVisibility(8);
            this.f49743m.setVisibility(0);
            this.f49740j.setVisibility(0);
            this.f49741k.setVisibility(0);
            m44912C(this.f49735e);
        }
    }

    /* renamed from: E */
    public final void m44910E() {
        ViewCompat.setAccessibilityDelegate(this.f49739i, new C6911f());
    }

    /* renamed from: F */
    public void m44909F() {
        CalendarSelector calendarSelector = this.f49736f;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            m44911D(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            m44911D(calendarSelector2);
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC6935c
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.f49732b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49731a = bundle.getInt("THEME_RES_ID_KEY");
        this.f49732b = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f49733c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f49734d = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f49735e = (C21662pt0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        C1879aE c1879aE;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f49731a);
        this.f49737g = new C10399hh(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C21662pt0 m44929k = this.f49733c.m44929k();
        if (MaterialDatePicker.m44887B(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(m44895z(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new C6908c());
        int m44932h = this.f49733c.m44932h();
        if (m44932h > 0) {
            c1879aE = new C1879aE(m44932h);
        } else {
            c1879aE = new C1879aE();
        }
        gridView.setAdapter((ListAdapter) c1879aE);
        gridView.setNumColumns(m44929k.f76797d);
        gridView.setEnabled(false);
        this.f49739i = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f49739i.setLayoutManager(new C6909d(getContext(), i2, false, i2));
        this.f49739i.setTag(f49727n);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f49732b, this.f49733c, this.f49734d, new C6910e());
        this.f49739i.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f49738h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f49738h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f49738h.setAdapter(new YearGridAdapter(this));
            this.f49738h.addItemDecoration(m44900u());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            m44901t(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.m44887B(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f49739i);
        }
        this.f49739i.scrollToPosition(monthsPagerAdapter.m44859d(this.f49735e));
        m44910E();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f49731a);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f49732b);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f49733c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f49734d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f49735e);
    }

    /* renamed from: t */
    public final void m44901t(View view, MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(f49730q);
        ViewCompat.setAccessibilityDelegate(materialButton, new C6913h());
        View findViewById = view.findViewById(R.id.month_navigation_previous);
        this.f49740j = findViewById;
        findViewById.setTag(f49728o);
        View findViewById2 = view.findViewById(R.id.month_navigation_next);
        this.f49741k = findViewById2;
        findViewById2.setTag(f49729p);
        this.f49742l = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f49743m = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        m44911D(CalendarSelector.DAY);
        materialButton.setText(this.f49735e.m23560h());
        this.f49739i.addOnScrollListener(new C6914i(monthsPagerAdapter, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC6915j());
        this.f49741k.setOnClickListener(new View$OnClickListenerC6916k(monthsPagerAdapter));
        this.f49740j.setOnClickListener(new View$OnClickListenerC6906a(monthsPagerAdapter));
    }

    /* renamed from: u */
    public final RecyclerView.ItemDecoration m44900u() {
        return new C6912g();
    }

    /* renamed from: v */
    public CalendarConstraints m44899v() {
        return this.f49733c;
    }

    /* renamed from: w */
    public C10399hh m44898w() {
        return this.f49737g;
    }

    /* renamed from: x */
    public C21662pt0 m44897x() {
        return this.f49735e;
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m44930j());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}
