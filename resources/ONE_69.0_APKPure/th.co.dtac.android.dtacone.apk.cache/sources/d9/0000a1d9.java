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
public final class MaterialCalendar<S> extends AbstractC6924c {

    /* renamed from: n */
    public static final Object f49739n = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: o */
    public static final Object f49740o = "NAVIGATION_PREV_TAG";

    /* renamed from: p */
    public static final Object f49741p = "NAVIGATION_NEXT_TAG";

    /* renamed from: q */
    public static final Object f49742q = "SELECTOR_TOGGLE_TAG";

    /* renamed from: a */
    public int f49743a;

    /* renamed from: b */
    public DateSelector f49744b;

    /* renamed from: c */
    public CalendarConstraints f49745c;

    /* renamed from: d */
    public DayViewDecorator f49746d;

    /* renamed from: e */
    public C22762vt0 f49747e;

    /* renamed from: f */
    public CalendarSelector f49748f;

    /* renamed from: g */
    public C10382hh f49749g;

    /* renamed from: h */
    public RecyclerView f49750h;

    /* renamed from: i */
    public RecyclerView f49751i;

    /* renamed from: j */
    public View f49752j;

    /* renamed from: k */
    public View f49753k;

    /* renamed from: l */
    public View f49754l;

    /* renamed from: m */
    public View f49755m;

    /* loaded from: classes4.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6895a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ MonthsPagerAdapter f49756a;

        public View$OnClickListenerC6895a(MonthsPagerAdapter monthsPagerAdapter) {
            this.f49756a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = MaterialCalendar.this.m44890A().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                MaterialCalendar.this.m44888C(this.f49756a.m44837b(findLastVisibleItemPosition));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    /* loaded from: classes4.dex */
    public class RunnableC6896b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f49758a;

        public RunnableC6896b(int i) {
            this.f49758a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f49751i.smoothScrollToPosition(this.f49758a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    /* loaded from: classes4.dex */
    public class C6897c extends AccessibilityDelegateCompat {
        public C6897c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    /* loaded from: classes4.dex */
    public class C6898d extends PK1 {

        /* renamed from: I */
        public final /* synthetic */ int f49761I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6898d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f49761I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            if (this.f49761I == 0) {
                iArr[0] = MaterialCalendar.this.f49751i.getWidth();
                iArr[1] = MaterialCalendar.this.f49751i.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f49751i.getHeight();
            iArr[1] = MaterialCalendar.this.f49751i.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    /* loaded from: classes4.dex */
    public class C6899e implements InterfaceC6906l {
        public C6899e() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.InterfaceC6906l
        /* renamed from: a */
        public void mo44870a(long j) {
            if (MaterialCalendar.this.f49745c.getDateValidator().isValid(j)) {
                MaterialCalendar.this.f49744b.select(j);
                Iterator<OnSelectionChangedListener<Object>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onSelectionChanged(MaterialCalendar.this.f49744b.getSelection());
                }
                MaterialCalendar.this.f49751i.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f49750h != null) {
                    MaterialCalendar.this.f49750h.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    /* loaded from: classes4.dex */
    public class C6900f extends AccessibilityDelegateCompat {
        public C6900f() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setScrollable(false);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    /* loaded from: classes4.dex */
    public class C6901g extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        public final Calendar f49765a = AbstractC22096s12.m22893q();

        /* renamed from: b */
        public final Calendar f49766b = AbstractC22096s12.m22893q();

        public C6901g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int width;
            if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (Pair<Long, Long> pair : MaterialCalendar.this.f49744b.getSelectedRanges()) {
                    Long l = pair.first;
                    if (l != null && pair.second != null) {
                        this.f49765a.setTimeInMillis(l.longValue());
                        this.f49766b.setTimeInMillis(pair.second.longValue());
                        int m44812c = yearGridAdapter.m44812c(this.f49765a.get(1));
                        int m44812c2 = yearGridAdapter.m44812c(this.f49766b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(m44812c);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(m44812c2);
                        int spanCount = m44812c / gridLayoutManager.getSpanCount();
                        int spanCount2 = m44812c2 / gridLayoutManager.getSpanCount();
                        for (int i2 = spanCount; i2 <= spanCount2; i2++) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + MaterialCalendar.this.f49749g.f62581d.m22572c();
                                int bottom = findViewByPosition3.getBottom() - MaterialCalendar.this.f49749g.f62581d.m22573b();
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
                                canvas.drawRect(i, top, width, bottom, MaterialCalendar.this.f49749g.f62585h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    /* loaded from: classes4.dex */
    public class C6902h extends AccessibilityDelegateCompat {
        public C6902h() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (MaterialCalendar.this.f49755m.getVisibility() == 0) {
                string = MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection);
            } else {
                string = MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection);
            }
            accessibilityNodeInfoCompat.setHintText(string);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    /* loaded from: classes4.dex */
    public class C6903i extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ MonthsPagerAdapter f49769a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f49770b;

        public C6903i(MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
            this.f49769a = monthsPagerAdapter;
            this.f49770b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f49770b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int findLastVisibleItemPosition;
            if (i < 0) {
                findLastVisibleItemPosition = MaterialCalendar.this.m44890A().findFirstVisibleItemPosition();
            } else {
                findLastVisibleItemPosition = MaterialCalendar.this.m44890A().findLastVisibleItemPosition();
            }
            MaterialCalendar.this.f49747e = this.f49769a.m44837b(findLastVisibleItemPosition);
            this.f49770b.setText(this.f49769a.m44836c(findLastVisibleItemPosition));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6904j implements View.OnClickListener {
        public View$OnClickListenerC6904j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.m44885F();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6905k implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ MonthsPagerAdapter f49773a;

        public View$OnClickListenerC6905k(MonthsPagerAdapter monthsPagerAdapter) {
            this.f49773a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = MaterialCalendar.this.m44890A().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < MaterialCalendar.this.f49751i.getAdapter().getItemCount()) {
                MaterialCalendar.this.m44888C(this.f49773a.m44837b(findFirstVisibleItemPosition));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$l */
    /* loaded from: classes4.dex */
    public interface InterfaceC6906l {
        /* renamed from: a */
        void mo44870a(long j);
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }

    /* renamed from: y */
    public static int m44872y(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: z */
    public static int m44871z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i = C6923b.f49876g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    /* renamed from: A */
    public LinearLayoutManager m44890A() {
        return (LinearLayoutManager) this.f49751i.getLayoutManager();
    }

    /* renamed from: B */
    public final void m44889B(int i) {
        this.f49751i.post(new RunnableC6896b(i));
    }

    /* renamed from: C */
    public void m44888C(C22762vt0 c22762vt0) {
        boolean z;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f49751i.getAdapter();
        int m44835d = monthsPagerAdapter.m44835d(c22762vt0);
        int m44835d2 = m44835d - monthsPagerAdapter.m44835d(this.f49747e);
        boolean z2 = false;
        if (Math.abs(m44835d2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (m44835d2 > 0) {
            z2 = true;
        }
        this.f49747e = c22762vt0;
        if (z && z2) {
            this.f49751i.scrollToPosition(m44835d - 3);
            m44889B(m44835d);
        } else if (z) {
            this.f49751i.scrollToPosition(m44835d + 3);
            m44889B(m44835d);
        } else {
            m44889B(m44835d);
        }
    }

    /* renamed from: D */
    public void m44887D(CalendarSelector calendarSelector) {
        this.f49748f = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f49750h.getLayoutManager().scrollToPosition(((YearGridAdapter) this.f49750h.getAdapter()).m44812c(this.f49747e.f108255c));
            this.f49754l.setVisibility(0);
            this.f49755m.setVisibility(8);
            this.f49752j.setVisibility(8);
            this.f49753k.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f49754l.setVisibility(8);
            this.f49755m.setVisibility(0);
            this.f49752j.setVisibility(0);
            this.f49753k.setVisibility(0);
            m44888C(this.f49747e);
        }
    }

    /* renamed from: E */
    public final void m44886E() {
        ViewCompat.setAccessibilityDelegate(this.f49751i, new C6900f());
    }

    /* renamed from: F */
    public void m44885F() {
        CalendarSelector calendarSelector = this.f49748f;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            m44887D(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            m44887D(calendarSelector2);
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC6924c
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.f49744b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49743a = bundle.getInt("THEME_RES_ID_KEY");
        this.f49744b = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f49745c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f49746d = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f49747e = (C22762vt0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        C5340bE c5340bE;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f49743a);
        this.f49749g = new C10382hh(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C22762vt0 m44905k = this.f49745c.m44905k();
        if (MaterialDatePicker.m44863B(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(m44871z(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new C6897c());
        int m44908h = this.f49745c.m44908h();
        if (m44908h > 0) {
            c5340bE = new C5340bE(m44908h);
        } else {
            c5340bE = new C5340bE();
        }
        gridView.setAdapter((ListAdapter) c5340bE);
        gridView.setNumColumns(m44905k.f108256d);
        gridView.setEnabled(false);
        this.f49751i = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f49751i.setLayoutManager(new C6898d(getContext(), i2, false, i2));
        this.f49751i.setTag(f49739n);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f49744b, this.f49745c, this.f49746d, new C6899e());
        this.f49751i.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f49750h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f49750h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f49750h.setAdapter(new YearGridAdapter(this));
            this.f49750h.addItemDecoration(m44876u());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            m44877t(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.m44863B(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f49751i);
        }
        this.f49751i.scrollToPosition(monthsPagerAdapter.m44835d(this.f49747e));
        m44886E();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f49743a);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f49744b);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f49745c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f49746d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f49747e);
    }

    /* renamed from: t */
    public final void m44877t(View view, MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(f49742q);
        ViewCompat.setAccessibilityDelegate(materialButton, new C6902h());
        View findViewById = view.findViewById(R.id.month_navigation_previous);
        this.f49752j = findViewById;
        findViewById.setTag(f49740o);
        View findViewById2 = view.findViewById(R.id.month_navigation_next);
        this.f49753k = findViewById2;
        findViewById2.setTag(f49741p);
        this.f49754l = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f49755m = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        m44887D(CalendarSelector.DAY);
        materialButton.setText(this.f49747e.m831h());
        this.f49751i.addOnScrollListener(new C6903i(monthsPagerAdapter, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC6904j());
        this.f49753k.setOnClickListener(new View$OnClickListenerC6905k(monthsPagerAdapter));
        this.f49752j.setOnClickListener(new View$OnClickListenerC6895a(monthsPagerAdapter));
    }

    /* renamed from: u */
    public final RecyclerView.ItemDecoration m44876u() {
        return new C6901g();
    }

    /* renamed from: v */
    public CalendarConstraints m44875v() {
        return this.f49745c;
    }

    /* renamed from: w */
    public C10382hh m44874w() {
        return this.f49749g;
    }

    /* renamed from: x */
    public C22762vt0 m44873x() {
        return this.f49747e;
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m44906j());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}