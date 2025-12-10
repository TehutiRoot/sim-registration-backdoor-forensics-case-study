package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.flexbox.C6300a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements P20 {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;

    /* renamed from: a */
    public int f44276a;

    /* renamed from: b */
    public int f44277b;

    /* renamed from: c */
    public int f44278c;

    /* renamed from: d */
    public int f44279d;

    /* renamed from: e */
    public int f44280e;

    /* renamed from: f */
    public int f44281f;

    /* renamed from: g */
    public Drawable f44282g;

    /* renamed from: h */
    public Drawable f44283h;

    /* renamed from: i */
    public int f44284i;

    /* renamed from: j */
    public int f44285j;

    /* renamed from: k */
    public int f44286k;

    /* renamed from: l */
    public int f44287l;

    /* renamed from: m */
    public int[] f44288m;

    /* renamed from: n */
    public SparseIntArray f44289n;

    /* renamed from: o */
    public C6300a f44290o;

    /* renamed from: p */
    public List f44291p;

    /* renamed from: q */
    public C6300a.C6302b f44292q;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final boolean m48952a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((FlexLine) this.f44291p.get(i2)).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f44289n == null) {
            this.f44289n = new SparseIntArray(getChildCount());
        }
        this.f44288m = this.f44290o.m48781n(view, i, layoutParams, this.f44289n);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final boolean m48951b(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View reorderedChildAt = getReorderedChildAt(i - i3);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void m48950c(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f44291p.size();
        for (int i3 = 0; i3 < size; i3++) {
            FlexLine flexLine = (FlexLine) this.f44291p.get(i3);
            for (int i4 = 0; i4 < flexLine.f44262h; i4++) {
                int i5 = flexLine.f44269o + i4;
                View reorderedChildAt = getReorderedChildAt(i5);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (m48946g(i5, i4)) {
                        if (z) {
                            left = reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f44287l;
                        }
                        m48947f(canvas, left, flexLine.f44256b, flexLine.f44261g);
                    }
                    if (i4 == flexLine.f44262h - 1 && (this.f44285j & 4) > 0) {
                        if (z) {
                            right = (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f44287l;
                        } else {
                            right = reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        m48947f(canvas, right, flexLine.f44256b, flexLine.f44261g);
                    }
                }
            }
            if (m48945h(i3)) {
                if (z2) {
                    i2 = flexLine.f44258d;
                } else {
                    i2 = flexLine.f44256b - this.f44286k;
                }
                m48948e(canvas, paddingLeft, i2, max);
            }
            if (m48944i(i3) && (this.f44284i & 4) > 0) {
                if (z2) {
                    i = flexLine.f44256b - this.f44286k;
                } else {
                    i = flexLine.f44258d;
                }
                m48948e(canvas, paddingLeft, i, max);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void m48949d(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f44291p.size();
        for (int i3 = 0; i3 < size; i3++) {
            FlexLine flexLine = (FlexLine) this.f44291p.get(i3);
            for (int i4 = 0; i4 < flexLine.f44262h; i4++) {
                int i5 = flexLine.f44269o + i4;
                View reorderedChildAt = getReorderedChildAt(i5);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (m48946g(i5, i4)) {
                        if (z2) {
                            top = reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f44286k;
                        }
                        m48948e(canvas, flexLine.f44255a, top, flexLine.f44261g);
                    }
                    if (i4 == flexLine.f44262h - 1 && (this.f44284i & 4) > 0) {
                        if (z2) {
                            bottom = (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f44286k;
                        } else {
                            bottom = reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        m48948e(canvas, flexLine.f44255a, bottom, flexLine.f44261g);
                    }
                }
            }
            if (m48945h(i3)) {
                if (z) {
                    i2 = flexLine.f44257c;
                } else {
                    i2 = flexLine.f44255a - this.f44287l;
                }
                m48947f(canvas, i2, paddingTop, max);
            }
            if (m48944i(i3) && (this.f44285j & 4) > 0) {
                if (z) {
                    i = flexLine.f44255a - this.f44287l;
                } else {
                    i = flexLine.f44257c;
                }
                m48947f(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: e */
    public final void m48948e(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f44282g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f44286k + i2);
        this.f44282g.draw(canvas);
    }

    /* renamed from: f */
    public final void m48947f(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f44283h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f44287l + i, i3 + i2);
        this.f44283h.draw(canvas);
    }

    /* renamed from: g */
    public final boolean m48946g(int i, int i2) {
        if (m48951b(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                if ((this.f44285j & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f44284i & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (isMainAxisDirectionHorizontal()) {
            if ((this.f44285j & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f44284i & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // p000.P20
    public int getAlignContent() {
        return this.f44280e;
    }

    @Override // p000.P20
    public int getAlignItems() {
        return this.f44279d;
    }

    @Override // p000.P20
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // p000.P20
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // p000.P20
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // p000.P20
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (isMainAxisDirectionHorizontal()) {
            if (m48946g(i, i2)) {
                i4 = this.f44287l;
            }
            if ((this.f44285j & 4) > 0) {
                i3 = this.f44287l;
            } else {
                return i4;
            }
        } else {
            if (m48946g(i, i2)) {
                i4 = this.f44286k;
            }
            if ((this.f44284i & 4) > 0) {
                i3 = this.f44286k;
            } else {
                return i4;
            }
        }
        return i4 + i3;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.f44282g;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.f44283h;
    }

    @Override // p000.P20
    public int getFlexDirection() {
        return this.f44276a;
    }

    @Override // p000.P20
    public View getFlexItemAt(int i) {
        return getChildAt(i);
    }

    @Override // p000.P20
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f44291p.size());
        for (FlexLine flexLine : this.f44291p) {
            if (flexLine.getItemCountNotGone() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // p000.P20
    public List<FlexLine> getFlexLinesInternal() {
        return this.f44291p;
    }

    @Override // p000.P20
    public int getFlexWrap() {
        return this.f44277b;
    }

    public int getJustifyContent() {
        return this.f44278c;
    }

    @Override // p000.P20
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (FlexLine flexLine : this.f44291p) {
            i = Math.max(i, flexLine.f44259e);
        }
        return i;
    }

    @Override // p000.P20
    public int getMaxLine() {
        return this.f44281f;
    }

    public View getReorderedChildAt(int i) {
        if (i >= 0) {
            int[] iArr = this.f44288m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    @Override // p000.P20
    public View getReorderedFlexItemAt(int i) {
        return getReorderedChildAt(i);
    }

    public int getShowDividerHorizontal() {
        return this.f44284i;
    }

    public int getShowDividerVertical() {
        return this.f44285j;
    }

    @Override // p000.P20
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f44291p.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            FlexLine flexLine = (FlexLine) this.f44291p.get(i4);
            if (m48945h(i4)) {
                if (isMainAxisDirectionHorizontal()) {
                    i2 = this.f44286k;
                } else {
                    i2 = this.f44287l;
                }
                i3 += i2;
            }
            if (m48944i(i4)) {
                if (isMainAxisDirectionHorizontal()) {
                    i = this.f44286k;
                } else {
                    i = this.f44287l;
                }
                i3 += i;
            }
            i3 += flexLine.f44261g;
        }
        return i3;
    }

    /* renamed from: h */
    public final boolean m48945h(int i) {
        if (i < 0 || i >= this.f44291p.size()) {
            return false;
        }
        if (m48952a(i)) {
            if (isMainAxisDirectionHorizontal()) {
                if ((this.f44284i & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f44285j & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (isMainAxisDirectionHorizontal()) {
            if ((this.f44284i & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f44285j & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: i */
    public final boolean m48944i(int i) {
        if (i < 0 || i >= this.f44291p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f44291p.size(); i2++) {
            if (((FlexLine) this.f44291p.get(i2)).getItemCountNotGone() > 0) {
                return false;
            }
        }
        if (isMainAxisDirectionHorizontal()) {
            if ((this.f44284i & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f44285j & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // p000.P20
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.f44276a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0200  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m48943j(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m48943j(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m48942k(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m48942k(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: l */
    public final void m48941l(int i, int i2) {
        this.f44291p.clear();
        this.f44292q.m48768a();
        this.f44290o.m48792c(this.f44292q, i, i2);
        this.f44291p = this.f44292q.f44364a;
        this.f44290o.m48779p(i, i2);
        if (this.f44279d == 3) {
            for (FlexLine flexLine : this.f44291p) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < flexLine.f44262h; i4++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.f44269o + i4);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        if (this.f44277b != 2) {
                            i3 = Math.max(i3, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.f44266l - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            i3 = Math.max(i3, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((flexLine.f44266l - reorderedChildAt.getMeasuredHeight()) + reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                flexLine.f44261g = i3;
            }
        }
        this.f44290o.m48780o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f44290o.m48797X();
        m48939n(this.f44276a, i, i2, this.f44292q.f44365b);
    }

    /* renamed from: m */
    public final void m48940m(int i, int i2) {
        this.f44291p.clear();
        this.f44292q.m48768a();
        this.f44290o.m48789f(this.f44292q, i, i2);
        this.f44291p = this.f44292q.f44364a;
        this.f44290o.m48779p(i, i2);
        this.f44290o.m48780o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f44290o.m48797X();
        m48939n(this.f44276a, i, i2, this.f44292q.f44365b);
    }

    /* renamed from: n */
    public final void m48939n(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i4 = View.combineMeasuredStates(i4, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
            }
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* renamed from: o */
    public final void m48938o() {
        if (this.f44282g == null && this.f44283h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f44283h == null && this.f44282g == null) {
            return;
        }
        if (this.f44284i == 0 && this.f44285j == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.f44276a;
        boolean z3 = false;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (layoutDirection == 1) {
                            z3 = true;
                        }
                        if (this.f44277b == 2) {
                            z3 = !z3;
                        }
                        m48949d(canvas, z3, true);
                        return;
                    }
                    return;
                }
                if (layoutDirection != 1) {
                    z4 = false;
                }
                if (this.f44277b == 2) {
                    z4 = !z4;
                }
                m48949d(canvas, z4, false);
                return;
            }
            if (layoutDirection != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f44277b == 2) {
                z3 = true;
            }
            m48950c(canvas, z2, z3);
            return;
        }
        if (layoutDirection == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f44277b == 2) {
            z3 = true;
        }
        m48950c(canvas, z, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i5 = this.f44276a;
        boolean z6 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (layoutDirection == 1) {
                            z6 = true;
                        }
                        if (this.f44277b == 2) {
                            z5 = !z6;
                        } else {
                            z5 = z6;
                        }
                        m48942k(z5, true, i, i2, i3, i4);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f44276a);
                }
                if (layoutDirection == 1) {
                    z6 = true;
                }
                if (this.f44277b == 2) {
                    z4 = !z6;
                } else {
                    z4 = z6;
                }
                m48942k(z4, false, i, i2, i3, i4);
                return;
            }
            if (layoutDirection != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m48943j(z3, i, i2, i3, i4);
            return;
        }
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m48943j(z2, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f44289n == null) {
            this.f44289n = new SparseIntArray(getChildCount());
        }
        if (this.f44290o.m48806O(this.f44289n)) {
            this.f44288m = this.f44290o.m48782m(this.f44289n);
        }
        int i3 = this.f44276a;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f44276a);
            }
            m48940m(i, i2);
            return;
        }
        m48941l(i, i2);
    }

    @Override // p000.P20
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        if (m48946g(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                int i3 = flexLine.f44259e;
                int i4 = this.f44287l;
                flexLine.f44259e = i3 + i4;
                flexLine.f44260f += i4;
                return;
            }
            int i5 = flexLine.f44259e;
            int i6 = this.f44286k;
            flexLine.f44259e = i5 + i6;
            flexLine.f44260f += i6;
        }
    }

    @Override // p000.P20
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.f44285j & 4) > 0) {
                int i = flexLine.f44259e;
                int i2 = this.f44287l;
                flexLine.f44259e = i + i2;
                flexLine.f44260f += i2;
            }
        } else if ((this.f44284i & 4) > 0) {
            int i3 = flexLine.f44259e;
            int i4 = this.f44286k;
            flexLine.f44259e = i3 + i4;
            flexLine.f44260f += i4;
        }
    }

    public void setAlignContent(int i) {
        if (this.f44280e != i) {
            this.f44280e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f44279d != i) {
            this.f44279d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f44282g) {
            return;
        }
        this.f44282g = drawable;
        if (drawable != null) {
            this.f44286k = drawable.getIntrinsicHeight();
        } else {
            this.f44286k = 0;
        }
        m48938o();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.f44283h) {
            return;
        }
        this.f44283h = drawable;
        if (drawable != null) {
            this.f44287l = drawable.getIntrinsicWidth();
        } else {
            this.f44287l = 0;
        }
        m48938o();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f44276a != i) {
            this.f44276a = i;
            requestLayout();
        }
    }

    @Override // p000.P20
    public void setFlexLines(List<FlexLine> list) {
        this.f44291p = list;
    }

    public void setFlexWrap(int i) {
        if (this.f44277b != i) {
            this.f44277b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f44278c != i) {
            this.f44278c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f44281f != i) {
            this.f44281f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f44284i) {
            this.f44284i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f44285j) {
            this.f44285j = i;
            requestLayout();
        }
    }

    @Override // p000.P20
    public void updateViewCache(int i, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44281f = -1;
        this.f44290o = new C6300a(this);
        this.f44291p = new ArrayList();
        this.f44292q = new C6300a.C6302b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout, i, 0);
        this.f44276a = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.f44277b = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.f44278c = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.f44279d = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.f44280e = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.f44281f = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f44285j = i2;
            this.f44284i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f44285j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f44284i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements Q20 {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C6286a();

        /* renamed from: a */
        public int f44293a;

        /* renamed from: b */
        public float f44294b;

        /* renamed from: c */
        public float f44295c;

        /* renamed from: d */
        public int f44296d;

        /* renamed from: e */
        public float f44297e;

        /* renamed from: f */
        public int f44298f;

        /* renamed from: g */
        public int f44299g;

        /* renamed from: h */
        public int f44300h;

        /* renamed from: i */
        public int f44301i;

        /* renamed from: j */
        public boolean f44302j;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        /* loaded from: classes3.dex */
        public class C6286a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44293a = 1;
            this.f44294b = 0.0f;
            this.f44295c = 1.0f;
            this.f44296d = -1;
            this.f44297e = -1.0f;
            this.f44298f = -1;
            this.f44299g = -1;
            this.f44300h = ViewCompat.MEASURED_SIZE_MASK;
            this.f44301i = ViewCompat.MEASURED_SIZE_MASK;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout_Layout);
            this.f44293a = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.f44294b = obtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f44295c = obtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f44296d = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f44297e = obtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f44298f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f44299g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f44300h = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, ViewCompat.MEASURED_SIZE_MASK);
            this.f44301i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, ViewCompat.MEASURED_SIZE_MASK);
            this.f44302j = obtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p000.Q20
        public int getAlignSelf() {
            return this.f44296d;
        }

        @Override // p000.Q20
        public float getFlexBasisPercent() {
            return this.f44297e;
        }

        @Override // p000.Q20
        public float getFlexGrow() {
            return this.f44294b;
        }

        @Override // p000.Q20
        public float getFlexShrink() {
            return this.f44295c;
        }

        @Override // p000.Q20
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // p000.Q20
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // p000.Q20
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // p000.Q20
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // p000.Q20
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // p000.Q20
        public int getMaxHeight() {
            return this.f44301i;
        }

        @Override // p000.Q20
        public int getMaxWidth() {
            return this.f44300h;
        }

        @Override // p000.Q20
        public int getMinHeight() {
            return this.f44299g;
        }

        @Override // p000.Q20
        public int getMinWidth() {
            return this.f44298f;
        }

        @Override // p000.Q20
        public int getOrder() {
            return this.f44293a;
        }

        @Override // p000.Q20
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // p000.Q20
        public boolean isWrapBefore() {
            return this.f44302j;
        }

        public void setAlignSelf(int i) {
            this.f44296d = i;
        }

        public void setFlexBasisPercent(float f) {
            this.f44297e = f;
        }

        public void setFlexGrow(float f) {
            this.f44294b = f;
        }

        public void setFlexShrink(float f) {
            this.f44295c = f;
        }

        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        public void setMaxHeight(int i) {
            this.f44301i = i;
        }

        public void setMaxWidth(int i) {
            this.f44300h = i;
        }

        @Override // p000.Q20
        public void setMinHeight(int i) {
            this.f44299g = i;
        }

        @Override // p000.Q20
        public void setMinWidth(int i) {
            this.f44298f = i;
        }

        public void setOrder(int i) {
            this.f44293a = i;
        }

        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        public void setWrapBefore(boolean z) {
            this.f44302j = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f44293a);
            parcel.writeFloat(this.f44294b);
            parcel.writeFloat(this.f44295c);
            parcel.writeInt(this.f44296d);
            parcel.writeFloat(this.f44297e);
            parcel.writeInt(this.f44298f);
            parcel.writeInt(this.f44299g);
            parcel.writeInt(this.f44300h);
            parcel.writeInt(this.f44301i);
            parcel.writeByte(this.f44302j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f44293a = 1;
            this.f44294b = 0.0f;
            this.f44295c = 1.0f;
            this.f44296d = -1;
            this.f44297e = -1.0f;
            this.f44298f = -1;
            this.f44299g = -1;
            this.f44300h = ViewCompat.MEASURED_SIZE_MASK;
            this.f44301i = ViewCompat.MEASURED_SIZE_MASK;
            this.f44293a = layoutParams.f44293a;
            this.f44294b = layoutParams.f44294b;
            this.f44295c = layoutParams.f44295c;
            this.f44296d = layoutParams.f44296d;
            this.f44297e = layoutParams.f44297e;
            this.f44298f = layoutParams.f44298f;
            this.f44299g = layoutParams.f44299g;
            this.f44300h = layoutParams.f44300h;
            this.f44301i = layoutParams.f44301i;
            this.f44302j = layoutParams.f44302j;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44293a = 1;
            this.f44294b = 0.0f;
            this.f44295c = 1.0f;
            this.f44296d = -1;
            this.f44297e = -1.0f;
            this.f44298f = -1;
            this.f44299g = -1;
            this.f44300h = ViewCompat.MEASURED_SIZE_MASK;
            this.f44301i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.f44293a = 1;
            this.f44294b = 0.0f;
            this.f44295c = 1.0f;
            this.f44296d = -1;
            this.f44297e = -1.0f;
            this.f44298f = -1;
            this.f44299g = -1;
            this.f44300h = ViewCompat.MEASURED_SIZE_MASK;
            this.f44301i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f44293a = 1;
            this.f44294b = 0.0f;
            this.f44295c = 1.0f;
            this.f44296d = -1;
            this.f44297e = -1.0f;
            this.f44298f = -1;
            this.f44299g = -1;
            this.f44300h = ViewCompat.MEASURED_SIZE_MASK;
            this.f44301i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f44293a = 1;
            this.f44294b = 0.0f;
            this.f44295c = 1.0f;
            this.f44296d = -1;
            this.f44297e = -1.0f;
            this.f44298f = -1;
            this.f44299g = -1;
            this.f44300h = ViewCompat.MEASURED_SIZE_MASK;
            this.f44301i = ViewCompat.MEASURED_SIZE_MASK;
            this.f44293a = parcel.readInt();
            this.f44294b = parcel.readFloat();
            this.f44295c = parcel.readFloat();
            this.f44296d = parcel.readInt();
            this.f44297e = parcel.readFloat();
            this.f44298f = parcel.readInt();
            this.f44299g = parcel.readInt();
            this.f44300h = parcel.readInt();
            this.f44301i = parcel.readInt();
            this.f44302j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}