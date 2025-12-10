package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f49763a;

    /* renamed from: b */
    public final boolean f49764b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes4.dex */
    public class C6918a extends AccessibilityDelegateCompat {
        public C6918a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    public static int m44890d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    public static boolean m44889e(Long l, Long l2, Long l3, Long l4) {
        if (l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m44893a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m44811m());
        } else if (i == 130) {
            setSelection(getAdapter2().m44822b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C6934b getAdapter2() {
        return (C6934b) super.getAdapter();
    }

    /* renamed from: c */
    public final View m44891c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m44823a;
        int m44890d;
        int m44823a2;
        int m44890d2;
        int i;
        int i2;
        int i3;
        int i4;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C6934b adapter2 = getAdapter2();
        DateSelector dateSelector = adapter2.f49867b;
        C10399hh c10399hh = adapter2.f49869d;
        int max = Math.max(adapter2.m44822b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.m44811m(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<Pair<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Pair<Long, Long> next = it.next();
            Long l = next.first;
            if (l != null) {
                if (next.second != null) {
                    Long l2 = l;
                    long longValue = l2.longValue();
                    Long l3 = next.second;
                    long longValue2 = l3.longValue();
                    if (!m44889e(item, item2, l2, l3)) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (longValue < item.longValue()) {
                            if (adapter2.m44816h(max)) {
                                left2 = 0;
                            } else if (!isLayoutRtl) {
                                left2 = materialCalendarGridView.m44891c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.m44891c(max - 1).getLeft();
                            }
                            m44890d = left2;
                            m44823a = max;
                        } else {
                            materialCalendarGridView.f49763a.setTimeInMillis(longValue);
                            m44823a = adapter2.m44823a(materialCalendarGridView.f49763a.get(5));
                            m44890d = m44890d(materialCalendarGridView.m44891c(m44823a));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter2.m44815i(min)) {
                                left = getWidth();
                            } else if (!isLayoutRtl) {
                                left = materialCalendarGridView.m44891c(min).getRight();
                            } else {
                                left = materialCalendarGridView.m44891c(min).getLeft();
                            }
                            m44890d2 = left;
                            m44823a2 = min;
                        } else {
                            materialCalendarGridView.f49763a.setTimeInMillis(longValue2);
                            m44823a2 = adapter2.m44823a(materialCalendarGridView.f49763a.get(5));
                            m44890d2 = m44890d(materialCalendarGridView.m44891c(m44823a2));
                        }
                        int itemId = (int) adapter2.getItemId(m44823a);
                        int i5 = max;
                        int i6 = min;
                        int itemId2 = (int) adapter2.getItemId(m44823a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            C6934b c6934b = adapter2;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View m44891c = materialCalendarGridView.m44891c(numColumns);
                            int top = m44891c.getTop() + c10399hh.f62548a.m22381c();
                            Iterator<Pair<Long, Long>> it2 = it;
                            int bottom = m44891c.getBottom() - c10399hh.f62548a.m22382b();
                            if (!isLayoutRtl) {
                                if (numColumns > m44823a) {
                                    i3 = 0;
                                } else {
                                    i3 = m44890d;
                                }
                                if (m44823a2 > numColumns2) {
                                    i4 = getWidth();
                                } else {
                                    i4 = m44890d2;
                                }
                            } else {
                                if (m44823a2 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = m44890d2;
                                }
                                if (numColumns > m44823a) {
                                    i2 = getWidth();
                                } else {
                                    i2 = m44890d;
                                }
                                int i7 = i2;
                                i3 = i;
                                i4 = i7;
                            }
                            canvas.drawRect(i3, top, i4, bottom, c10399hh.f62555h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter2 = c6934b;
                            it = it2;
                        }
                        materialCalendarGridView = this;
                        max = i5;
                        min = i6;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m44893a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m44822b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().m44822b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f49764b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m44822b()) {
            super.setSelection(getAdapter2().m44822b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49763a = AbstractC22545v02.m1133q();
        if (MaterialDatePicker.m44887B(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f49764b = MaterialDatePicker.m44885D(getContext());
        ViewCompat.setAccessibilityDelegate(this, new C6918a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C6934b) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C6934b.class.getCanonicalName()));
    }
}
