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
    public final Calendar f49775a;

    /* renamed from: b */
    public final boolean f49776b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes4.dex */
    public class C6907a extends AccessibilityDelegateCompat {
        public C6907a() {
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
    public static int m44866d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    public static boolean m44865e(Long l, Long l2, Long l3, Long l4) {
        if (l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m44869a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m44787m());
        } else if (i == 130) {
            setSelection(getAdapter2().m44798b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C6923b getAdapter2() {
        return (C6923b) super.getAdapter();
    }

    /* renamed from: c */
    public final View m44867c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m44799a;
        int m44866d;
        int m44799a2;
        int m44866d2;
        int i;
        int i2;
        int i3;
        int i4;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C6923b adapter2 = getAdapter2();
        DateSelector dateSelector = adapter2.f49879b;
        C10382hh c10382hh = adapter2.f49881d;
        int max = Math.max(adapter2.m44798b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.m44787m(), getLastVisiblePosition());
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
                    if (!m44865e(item, item2, l2, l3)) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (longValue < item.longValue()) {
                            if (adapter2.m44792h(max)) {
                                left2 = 0;
                            } else if (!isLayoutRtl) {
                                left2 = materialCalendarGridView.m44867c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.m44867c(max - 1).getLeft();
                            }
                            m44866d = left2;
                            m44799a = max;
                        } else {
                            materialCalendarGridView.f49775a.setTimeInMillis(longValue);
                            m44799a = adapter2.m44799a(materialCalendarGridView.f49775a.get(5));
                            m44866d = m44866d(materialCalendarGridView.m44867c(m44799a));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter2.m44791i(min)) {
                                left = getWidth();
                            } else if (!isLayoutRtl) {
                                left = materialCalendarGridView.m44867c(min).getRight();
                            } else {
                                left = materialCalendarGridView.m44867c(min).getLeft();
                            }
                            m44866d2 = left;
                            m44799a2 = min;
                        } else {
                            materialCalendarGridView.f49775a.setTimeInMillis(longValue2);
                            m44799a2 = adapter2.m44799a(materialCalendarGridView.f49775a.get(5));
                            m44866d2 = m44866d(materialCalendarGridView.m44867c(m44799a2));
                        }
                        int itemId = (int) adapter2.getItemId(m44799a);
                        int i5 = max;
                        int i6 = min;
                        int itemId2 = (int) adapter2.getItemId(m44799a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            C6923b c6923b = adapter2;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View m44867c = materialCalendarGridView.m44867c(numColumns);
                            int top = m44867c.getTop() + c10382hh.f62578a.m22572c();
                            Iterator<Pair<Long, Long>> it2 = it;
                            int bottom = m44867c.getBottom() - c10382hh.f62578a.m22573b();
                            if (!isLayoutRtl) {
                                if (numColumns > m44799a) {
                                    i3 = 0;
                                } else {
                                    i3 = m44866d;
                                }
                                if (m44799a2 > numColumns2) {
                                    i4 = getWidth();
                                } else {
                                    i4 = m44866d2;
                                }
                            } else {
                                if (m44799a2 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = m44866d2;
                                }
                                if (numColumns > m44799a) {
                                    i2 = getWidth();
                                } else {
                                    i2 = m44866d;
                                }
                                int i7 = i2;
                                i3 = i;
                                i4 = i7;
                            }
                            canvas.drawRect(i3, top, i4, bottom, c10382hh.f62585h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter2 = c6923b;
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
            m44869a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m44798b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().m44798b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f49776b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m44798b()) {
            super.setSelection(getAdapter2().m44798b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49775a = AbstractC22096s12.m22893q();
        if (MaterialDatePicker.m44863B(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f49776b = MaterialDatePicker.m44861D(getContext());
        ViewCompat.setAccessibilityDelegate(this, new C6907a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C6923b) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C6923b.class.getCanonicalName()));
    }
}