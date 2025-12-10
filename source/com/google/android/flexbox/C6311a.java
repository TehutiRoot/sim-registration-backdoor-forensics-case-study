package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.widget.CompoundButtonCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: com.google.android.flexbox.a */
/* loaded from: classes3.dex */
public class C6311a {

    /* renamed from: a */
    public final L20 f44347a;

    /* renamed from: b */
    public boolean[] f44348b;

    /* renamed from: c */
    public int[] f44349c;

    /* renamed from: d */
    public long[] f44350d;

    /* renamed from: e */
    public long[] f44351e;

    /* renamed from: com.google.android.flexbox.a$b */
    /* loaded from: classes3.dex */
    public static class C6313b {

        /* renamed from: a */
        public List f44352a;

        /* renamed from: b */
        public int f44353b;

        /* renamed from: a */
        public void m48771a() {
            this.f44352a = null;
            this.f44353b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.a$c */
    /* loaded from: classes3.dex */
    public static class C6314c implements Comparable {

        /* renamed from: a */
        public int f44354a;

        /* renamed from: b */
        public int f44355b;

        public C6314c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C6314c c6314c) {
            int i = this.f44355b;
            int i2 = c6314c.f44355b;
            if (i != i2) {
                return i - i2;
            }
            return this.f44354a - c6314c.f44354a;
        }

        public String toString() {
            return "Order{order=" + this.f44355b + ", index=" + this.f44354a + '}';
        }
    }

    public C6311a(L20 l20) {
        this.f44347a = l20;
    }

    /* renamed from: A */
    public final int m48823A(int i, M20 m20, int i2) {
        L20 l20 = this.f44347a;
        int childWidthMeasureSpec = l20.getChildWidthMeasureSpec(i, l20.getPaddingLeft() + this.f44347a.getPaddingRight() + m20.getMarginLeft() + m20.getMarginRight() + i2, m20.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > m20.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(m20.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        if (size < m20.getMinWidth()) {
            return View.MeasureSpec.makeMeasureSpec(m20.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return childWidthMeasureSpec;
    }

    /* renamed from: B */
    public final int m48822B(M20 m20, boolean z) {
        if (z) {
            return m20.getMarginBottom();
        }
        return m20.getMarginRight();
    }

    /* renamed from: C */
    public final int m48821C(M20 m20, boolean z) {
        if (z) {
            return m20.getMarginRight();
        }
        return m20.getMarginBottom();
    }

    /* renamed from: D */
    public final int m48820D(M20 m20, boolean z) {
        if (z) {
            return m20.getMarginTop();
        }
        return m20.getMarginLeft();
    }

    /* renamed from: E */
    public final int m48819E(M20 m20, boolean z) {
        if (z) {
            return m20.getMarginLeft();
        }
        return m20.getMarginTop();
    }

    /* renamed from: F */
    public final int m48818F(M20 m20, boolean z) {
        if (z) {
            return m20.getHeight();
        }
        return m20.getWidth();
    }

    /* renamed from: G */
    public final int m48817G(M20 m20, boolean z) {
        if (z) {
            return m20.getWidth();
        }
        return m20.getHeight();
    }

    /* renamed from: H */
    public final int m48816H(boolean z) {
        if (z) {
            return this.f44347a.getPaddingBottom();
        }
        return this.f44347a.getPaddingEnd();
    }

    /* renamed from: I */
    public final int m48815I(boolean z) {
        if (z) {
            return this.f44347a.getPaddingEnd();
        }
        return this.f44347a.getPaddingBottom();
    }

    /* renamed from: J */
    public final int m48814J(boolean z) {
        if (z) {
            return this.f44347a.getPaddingTop();
        }
        return this.f44347a.getPaddingStart();
    }

    /* renamed from: K */
    public final int m48813K(boolean z) {
        if (z) {
            return this.f44347a.getPaddingStart();
        }
        return this.f44347a.getPaddingTop();
    }

    /* renamed from: L */
    public final int m48812L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    public final int m48811M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    public final boolean m48810N(int i, int i2, FlexLine flexLine) {
        if (i == i2 - 1 && flexLine.getItemCountNotGone() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean m48809O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f44347a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View flexItemAt = this.f44347a.getFlexItemAt(i);
            if (flexItemAt != null && ((M20) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m48808P(View view, int i, int i2, int i3, int i4, M20 m20, int i5, int i6, int i7) {
        if (this.f44347a.getFlexWrap() == 0) {
            return false;
        }
        if (m20.isWrapBefore()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f44347a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.f44347a.getDecorationLengthMainAxis(view, i5, i6);
        if (decorationLengthMainAxis > 0) {
            i4 += decorationLengthMainAxis;
        }
        if (i2 >= i3 + i4) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public void m48807Q(View view, FlexLine flexLine, int i, int i2, int i3, int i4) {
        M20 m20 = (M20) view.getLayoutParams();
        int alignItems = this.f44347a.getAlignItems();
        if (m20.getAlignSelf() != -1) {
            alignItems = m20.getAlignSelf();
        }
        int i5 = flexLine.f44249g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.f44347a.getFlexWrap() != 2) {
                        int max = Math.max(flexLine.f44254l - view.getBaseline(), m20.getMarginTop());
                        view.layout(i, i2 + max, i3, i4 + max);
                        return;
                    } else {
                        int max2 = Math.max((flexLine.f44254l - view.getMeasuredHeight()) + view.getBaseline(), m20.getMarginBottom());
                        view.layout(i, i2 - max2, i3, i4 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + m20.getMarginTop()) - m20.getMarginBottom()) / 2;
                    if (this.f44347a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
            } else if (this.f44347a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - m20.getMarginBottom(), i3, i8 - m20.getMarginBottom());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + m20.getMarginTop(), i3, (i4 - i5) + view.getMeasuredHeight() + m20.getMarginTop());
                return;
            }
        }
        if (this.f44347a.getFlexWrap() != 2) {
            view.layout(i, i2 + m20.getMarginTop(), i3, i4 + m20.getMarginTop());
        } else {
            view.layout(i, i2 - m20.getMarginBottom(), i3, i4 - m20.getMarginBottom());
        }
    }

    /* renamed from: R */
    public void m48806R(View view, FlexLine flexLine, boolean z, int i, int i2, int i3, int i4) {
        M20 m20 = (M20) view.getLayoutParams();
        int alignItems = this.f44347a.getAlignItems();
        if (m20.getAlignSelf() != -1) {
            alignItems = m20.getAlignSelf();
        }
        int i5 = flexLine.f44249g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams)) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - m20.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - m20.getMarginRight(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + m20.getMarginLeft(), i2, (i3 - i5) + view.getMeasuredWidth() + m20.getMarginLeft(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + m20.getMarginLeft(), i2, i3 + m20.getMarginLeft(), i4);
        } else {
            view.layout(i - m20.getMarginRight(), i2, i3 - m20.getMarginRight(), i4);
        }
    }

    /* renamed from: S */
    public long m48805S(int i, int i2) {
        return (i & BodyPartID.bodyIdMax) | (i2 << 32);
    }

    /* renamed from: T */
    public final void m48804T(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = flexLine.f44247e;
        float f = flexLine.f44253k;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i8) {
            float f3 = (i8 - i3) / f;
            flexLine.f44247e = i4 + flexLine.f44248f;
            if (!z) {
                flexLine.f44249g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < flexLine.f44250h) {
                int i11 = flexLine.f44257o + i9;
                View reorderedFlexItemAt = this.f44347a.getReorderedFlexItemAt(i11);
                if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                    i5 = i8;
                    i6 = i9;
                } else {
                    M20 m20 = (M20) reorderedFlexItemAt.getLayoutParams();
                    int flexDirection = this.f44347a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i5 = i8;
                        int i12 = i9;
                        int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                        long[] jArr = this.f44351e;
                        if (jArr != null) {
                            measuredWidth = m48773y(jArr[i11]);
                        }
                        int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                        long[] jArr2 = this.f44351e;
                        if (jArr2 != null) {
                            measuredHeight = m48774x(jArr2[i11]);
                        }
                        if (!this.f44348b[i11] && m20.getFlexShrink() > 0.0f) {
                            float flexShrink = measuredWidth - (m20.getFlexShrink() * f3);
                            i6 = i12;
                            if (i6 == flexLine.f44250h - 1) {
                                flexShrink += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(flexShrink);
                            if (round < m20.getMinWidth()) {
                                round = m20.getMinWidth();
                                this.f44348b[i11] = true;
                                flexLine.f44253k -= m20.getFlexShrink();
                                z2 = true;
                            } else {
                                f4 += flexShrink - round;
                                double d = f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int m48772z = m48772z(i2, m20, flexLine.f44255m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            reorderedFlexItemAt.measure(makeMeasureSpec, m48772z);
                            int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                            int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                            m48798Z(i11, makeMeasureSpec, m48772z, reorderedFlexItemAt);
                            this.f44347a.updateViewCache(i11, reorderedFlexItemAt);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            i6 = i12;
                        }
                        int max = Math.max(i10, measuredHeight + m20.getMarginTop() + m20.getMarginBottom() + this.f44347a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                        flexLine.f44247e += measuredWidth + m20.getMarginLeft() + m20.getMarginRight();
                        i7 = max;
                    } else {
                        int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                        long[] jArr3 = this.f44351e;
                        if (jArr3 != null) {
                            measuredHeight3 = m48774x(jArr3[i11]);
                        }
                        int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        long[] jArr4 = this.f44351e;
                        if (jArr4 != null) {
                            measuredWidth3 = m48773y(jArr4[i11]);
                        }
                        if (!this.f44348b[i11] && m20.getFlexShrink() > f2) {
                            float flexShrink2 = measuredHeight3 - (m20.getFlexShrink() * f3);
                            if (i9 == flexLine.f44250h - 1) {
                                flexShrink2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(flexShrink2);
                            if (round2 < m20.getMinHeight()) {
                                round2 = m20.getMinHeight();
                                this.f44348b[i11] = true;
                                flexLine.f44253k -= m20.getFlexShrink();
                                i5 = i8;
                                i6 = i9;
                                z2 = true;
                            } else {
                                f4 += flexShrink2 - round2;
                                i5 = i8;
                                i6 = i9;
                                double d2 = f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int m48823A = m48823A(i, m20, flexLine.f44255m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            reorderedFlexItemAt.measure(m48823A, makeMeasureSpec2);
                            measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                            int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                            m48798Z(i11, m48823A, makeMeasureSpec2, reorderedFlexItemAt);
                            this.f44347a.updateViewCache(i11, reorderedFlexItemAt);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i5 = i8;
                            i6 = i9;
                        }
                        i7 = Math.max(i10, measuredWidth3 + m20.getMarginLeft() + m20.getMarginRight() + this.f44347a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                        flexLine.f44247e += measuredHeight3 + m20.getMarginTop() + m20.getMarginBottom();
                    }
                    flexLine.f44249g = Math.max(flexLine.f44249g, i7);
                    i10 = i7;
                }
                i9 = i6 + 1;
                i8 = i5;
                f2 = 0.0f;
            }
            int i13 = i8;
            if (z2 && i13 != flexLine.f44247e) {
                m48804T(i, i2, flexLine, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    public final int[] m48803U(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C6314c c6314c = (C6314c) it.next();
            int i3 = c6314c.f44354a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c6314c.f44355b);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    public final void m48802V(View view, int i, int i2) {
        int measuredHeight;
        M20 m20 = (M20) view.getLayoutParams();
        int min = Math.min(Math.max(((i - m20.getMarginLeft()) - m20.getMarginRight()) - this.f44347a.getDecorationLengthCrossAxis(view), m20.getMinWidth()), m20.getMaxWidth());
        long[] jArr = this.f44351e;
        if (jArr != null) {
            measuredHeight = m48774x(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m48798Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f44347a.updateViewCache(i2, view);
    }

    /* renamed from: W */
    public final void m48801W(View view, int i, int i2) {
        int measuredWidth;
        M20 m20 = (M20) view.getLayoutParams();
        int min = Math.min(Math.max(((i - m20.getMarginTop()) - m20.getMarginBottom()) - this.f44347a.getDecorationLengthCrossAxis(view), m20.getMinHeight()), m20.getMaxHeight());
        long[] jArr = this.f44351e;
        if (jArr != null) {
            measuredWidth = m48773y(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m48798Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f44347a.updateViewCache(i2, view);
    }

    /* renamed from: X */
    public void m48800X() {
        m48799Y(0);
    }

    /* renamed from: Y */
    public void m48799Y(int i) {
        int i2;
        View reorderedFlexItemAt;
        if (i >= this.f44347a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f44347a.getFlexDirection();
        if (this.f44347a.getAlignItems() == 4) {
            int[] iArr = this.f44349c;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List flexLinesInternal = this.f44347a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i2 < size) {
                FlexLine flexLine = (FlexLine) flexLinesInternal.get(i2);
                int i3 = flexLine.f44250h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = flexLine.f44257o + i4;
                    if (i4 < this.f44347a.getFlexItemCount() && (reorderedFlexItemAt = this.f44347a.getReorderedFlexItemAt(i5)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                        M20 m20 = (M20) reorderedFlexItemAt.getLayoutParams();
                        if (m20.getAlignSelf() == -1 || m20.getAlignSelf() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                                m48802V(reorderedFlexItemAt, flexLine.f44249g, i5);
                            } else {
                                m48801W(reorderedFlexItemAt, flexLine.f44249g, i5);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (FlexLine flexLine2 : this.f44347a.getFlexLinesInternal()) {
            for (Integer num : flexLine2.f44256n) {
                View reorderedFlexItemAt2 = this.f44347a.getReorderedFlexItemAt(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                    m48802V(reorderedFlexItemAt2, flexLine2.f44249g, num.intValue());
                } else {
                    m48801W(reorderedFlexItemAt2, flexLine2.f44249g, num.intValue());
                }
            }
        }
    }

    /* renamed from: Z */
    public final void m48798Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f44350d;
        if (jArr != null) {
            jArr[i] = m48805S(i2, i3);
        }
        long[] jArr2 = this.f44351e;
        if (jArr2 != null) {
            jArr2[i] = m48805S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    public final void m48797a(List list, FlexLine flexLine, int i, int i2) {
        flexLine.f44255m = i2;
        this.f44347a.onNewFlexLineAdded(flexLine);
        flexLine.f44258p = i;
        list.add(flexLine);
    }

    /* renamed from: b */
    public void m48796b(C6313b c6313b, int i, int i2, int i3, int i4, int i5, List list) {
        ArrayList arrayList;
        boolean z;
        int i6;
        C6313b c6313b2;
        int i7;
        int i8;
        int i9;
        List list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        int i16;
        int i17;
        int i18;
        FlexLine flexLine;
        int i19;
        int i20 = i;
        int i21 = i2;
        int i22 = i5;
        boolean isMainAxisDirectionHorizontal = this.f44347a.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        c6313b.f44352a = arrayList;
        if (i22 == -1) {
            z = true;
        } else {
            z = false;
        }
        int m48813K = m48813K(isMainAxisDirectionHorizontal);
        int m48815I = m48815I(isMainAxisDirectionHorizontal);
        int m48814J = m48814J(isMainAxisDirectionHorizontal);
        int m48816H = m48816H(isMainAxisDirectionHorizontal);
        FlexLine flexLine2 = new FlexLine();
        int i23 = i4;
        flexLine2.f44257o = i23;
        int i24 = m48815I + m48813K;
        flexLine2.f44247e = i24;
        int flexItemCount = this.f44347a.getFlexItemCount();
        boolean z4 = z;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = Integer.MIN_VALUE;
        while (true) {
            if (i23 < flexItemCount) {
                View reorderedFlexItemAt = this.f44347a.getReorderedFlexItemAt(i23);
                if (reorderedFlexItemAt == null) {
                    if (m48810N(i23, flexItemCount, flexLine2)) {
                        m48797a(arrayList, flexLine2, i23, i25);
                    }
                } else if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine2.f44251i++;
                    flexLine2.f44250h++;
                    if (m48810N(i23, flexItemCount, flexLine2)) {
                        m48797a(arrayList, flexLine2, i23, i25);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        m48776v((CompoundButton) reorderedFlexItemAt);
                    }
                    M20 m20 = (M20) reorderedFlexItemAt.getLayoutParams();
                    int i29 = flexItemCount;
                    if (m20.getAlignSelf() == 4) {
                        flexLine2.f44256n.add(Integer.valueOf(i23));
                    }
                    int m48817G = m48817G(m20, isMainAxisDirectionHorizontal);
                    if (m20.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        m48817G = Math.round(size * m20.getFlexBasisPercent());
                    }
                    if (isMainAxisDirectionHorizontal) {
                        int childWidthMeasureSpec = this.f44347a.getChildWidthMeasureSpec(i20, i24 + m48819E(m20, true) + m48821C(m20, true), m48817G);
                        i7 = size;
                        i8 = mode;
                        int childHeightMeasureSpec = this.f44347a.getChildHeightMeasureSpec(i21, m48814J + m48816H + m48820D(m20, true) + m48822B(m20, true) + i25, m48818F(m20, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        m48798Z(i23, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i9 = childWidthMeasureSpec;
                    } else {
                        i7 = size;
                        i8 = mode;
                        int childWidthMeasureSpec2 = this.f44347a.getChildWidthMeasureSpec(i21, m48814J + m48816H + m48820D(m20, false) + m48822B(m20, false) + i25, m48818F(m20, false));
                        int childHeightMeasureSpec2 = this.f44347a.getChildHeightMeasureSpec(i20, m48819E(m20, false) + i24 + m48821C(m20, false), m48817G);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        m48798Z(i23, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        i9 = childHeightMeasureSpec2;
                    }
                    this.f44347a.updateViewCache(i23, reorderedFlexItemAt);
                    m48789i(reorderedFlexItemAt, i23);
                    i26 = View.combineMeasuredStates(i26, reorderedFlexItemAt.getMeasuredState());
                    int i30 = i25;
                    int i31 = i24;
                    FlexLine flexLine3 = flexLine2;
                    int i32 = i23;
                    list2 = arrayList;
                    int i33 = i9;
                    if (m48808P(reorderedFlexItemAt, i8, i7, flexLine2.f44247e, m48821C(m20, isMainAxisDirectionHorizontal) + m48811M(reorderedFlexItemAt, isMainAxisDirectionHorizontal) + m48819E(m20, isMainAxisDirectionHorizontal), m20, i32, i27, arrayList.size())) {
                        i23 = i32;
                        if (flexLine3.getItemCountNotGone() > 0) {
                            if (i23 > 0) {
                                i19 = i23 - 1;
                                flexLine = flexLine3;
                            } else {
                                flexLine = flexLine3;
                                i19 = 0;
                            }
                            m48797a(list2, flexLine, i19, i30);
                            i25 = flexLine.f44249g + i30;
                        } else {
                            i25 = i30;
                        }
                        if (isMainAxisDirectionHorizontal) {
                            if (m20.getHeight() == -1) {
                                L20 l20 = this.f44347a;
                                i10 = i2;
                                i13 = -1;
                                view = reorderedFlexItemAt;
                                view.measure(i33, l20.getChildHeightMeasureSpec(i10, l20.getPaddingTop() + this.f44347a.getPaddingBottom() + m20.getMarginTop() + m20.getMarginBottom() + i25, m20.getHeight()));
                                m48789i(view, i23);
                            } else {
                                i10 = i2;
                                view = reorderedFlexItemAt;
                                i13 = -1;
                            }
                        } else {
                            i10 = i2;
                            view = reorderedFlexItemAt;
                            i13 = -1;
                            if (m20.getWidth() == -1) {
                                L20 l202 = this.f44347a;
                                view.measure(l202.getChildWidthMeasureSpec(i10, l202.getPaddingLeft() + this.f44347a.getPaddingRight() + m20.getMarginLeft() + m20.getMarginRight() + i25, m20.getWidth()), i33);
                                m48789i(view, i23);
                            }
                        }
                        flexLine2 = new FlexLine();
                        i12 = 1;
                        flexLine2.f44250h = 1;
                        i11 = i31;
                        flexLine2.f44247e = i11;
                        flexLine2.f44257o = i23;
                        i14 = 0;
                        i15 = Integer.MIN_VALUE;
                    } else {
                        i10 = i2;
                        i23 = i32;
                        view = reorderedFlexItemAt;
                        flexLine2 = flexLine3;
                        i11 = i31;
                        i12 = 1;
                        i13 = -1;
                        flexLine2.f44250h++;
                        i14 = i27 + 1;
                        i25 = i30;
                        i15 = i28;
                    }
                    boolean z5 = flexLine2.f44259q;
                    if (m20.getFlexGrow() != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    flexLine2.f44259q = z5 | z2;
                    boolean z6 = flexLine2.f44260r;
                    if (m20.getFlexShrink() != 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    flexLine2.f44260r = z6 | z3;
                    int[] iArr = this.f44349c;
                    if (iArr != null) {
                        iArr[i23] = list2.size();
                    }
                    flexLine2.f44247e += m48811M(view, isMainAxisDirectionHorizontal) + m48819E(m20, isMainAxisDirectionHorizontal) + m48821C(m20, isMainAxisDirectionHorizontal);
                    flexLine2.f44252j += m20.getFlexGrow();
                    flexLine2.f44253k += m20.getFlexShrink();
                    this.f44347a.onNewFlexItemAdded(view, i23, i14, flexLine2);
                    int max = Math.max(i15, m48812L(view, isMainAxisDirectionHorizontal) + m48820D(m20, isMainAxisDirectionHorizontal) + m48822B(m20, isMainAxisDirectionHorizontal) + this.f44347a.getDecorationLengthCrossAxis(view));
                    flexLine2.f44249g = Math.max(flexLine2.f44249g, max);
                    if (isMainAxisDirectionHorizontal) {
                        if (this.f44347a.getFlexWrap() != 2) {
                            flexLine2.f44254l = Math.max(flexLine2.f44254l, view.getBaseline() + m20.getMarginTop());
                        } else {
                            flexLine2.f44254l = Math.max(flexLine2.f44254l, (view.getMeasuredHeight() - view.getBaseline()) + m20.getMarginBottom());
                        }
                    }
                    i16 = i29;
                    if (m48810N(i23, i16, flexLine2)) {
                        m48797a(list2, flexLine2, i23, i25);
                        i25 += flexLine2.f44249g;
                    }
                    i17 = i5;
                    if (i17 != i13 && list2.size() > 0 && ((FlexLine) list2.get(list2.size() - i12)).f44258p >= i17 && i23 >= i17 && !z4) {
                        i25 = -flexLine2.getCrossSize();
                        i18 = i3;
                        z4 = true;
                    } else {
                        i18 = i3;
                    }
                    if (i25 > i18 && z4) {
                        c6313b2 = c6313b;
                        i6 = i26;
                        break;
                    }
                    i27 = i14;
                    i28 = max;
                    i23++;
                    i20 = i;
                    flexItemCount = i16;
                    i21 = i10;
                    i24 = i11;
                    arrayList = list2;
                    size = i7;
                    mode = i8;
                    i22 = i17;
                }
                i7 = size;
                i8 = mode;
                i10 = i21;
                i17 = i22;
                i11 = i24;
                list2 = arrayList;
                i16 = flexItemCount;
                i23++;
                i20 = i;
                flexItemCount = i16;
                i21 = i10;
                i24 = i11;
                arrayList = list2;
                size = i7;
                mode = i8;
                i22 = i17;
            } else {
                i6 = i26;
                c6313b2 = c6313b;
                break;
            }
        }
        c6313b2.f44353b = i6;
    }

    /* renamed from: c */
    public void m48795c(C6313b c6313b, int i, int i2) {
        m48796b(c6313b, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    /* renamed from: d */
    public void m48794d(C6313b c6313b, int i, int i2, int i3, int i4, List list) {
        m48796b(c6313b, i, i2, i3, i4, -1, list);
    }

    /* renamed from: e */
    public void m48793e(C6313b c6313b, int i, int i2, int i3, int i4, List list) {
        m48796b(c6313b, i, i2, i3, 0, i4, list);
    }

    /* renamed from: f */
    public void m48792f(C6313b c6313b, int i, int i2) {
        m48796b(c6313b, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    /* renamed from: g */
    public void m48791g(C6313b c6313b, int i, int i2, int i3, int i4, List list) {
        m48796b(c6313b, i2, i, i3, i4, -1, list);
    }

    /* renamed from: h */
    public void m48790h(C6313b c6313b, int i, int i2, int i3, int i4, List list) {
        m48796b(c6313b, i2, i, i3, 0, i4, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m48789i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            M20 r0 = (p000.M20) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.getMinWidth()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.getMinWidth()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.getMaxWidth()
            if (r1 <= r3) goto L26
            int r1 = r0.getMaxWidth()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.getMinHeight()
            if (r2 >= r5) goto L32
            int r2 = r0.getMinHeight()
            goto L3e
        L32:
            int r5 = r0.getMaxHeight()
            if (r2 <= r5) goto L3d
            int r2 = r0.getMaxHeight()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m48798Z(r8, r1, r0, r7)
            L20 r0 = r6.f44347a
            r0.updateViewCache(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C6311a.m48789i(android.view.View, int):void");
    }

    /* renamed from: j */
    public void m48788j(List list, int i) {
        int i2 = this.f44349c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f44349c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f44350d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* renamed from: k */
    public final List m48787k(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.f44249g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add((FlexLine) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List m48786l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C6314c c6314c = new C6314c();
            c6314c.f44355b = ((M20) this.f44347a.getFlexItemAt(i2).getLayoutParams()).getOrder();
            c6314c.f44354a = i2;
            arrayList.add(c6314c);
        }
        return arrayList;
    }

    /* renamed from: m */
    public int[] m48785m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f44347a.getFlexItemCount();
        return m48803U(flexItemCount, m48786l(flexItemCount), sparseIntArray);
    }

    /* renamed from: n */
    public int[] m48784n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f44347a.getFlexItemCount();
        List m48786l = m48786l(flexItemCount);
        C6314c c6314c = new C6314c();
        if (view != null && (layoutParams instanceof M20)) {
            c6314c.f44355b = ((M20) layoutParams).getOrder();
        } else {
            c6314c.f44355b = 1;
        }
        if (i != -1 && i != flexItemCount) {
            if (i < this.f44347a.getFlexItemCount()) {
                c6314c.f44354a = i;
                while (i < flexItemCount) {
                    ((C6314c) m48786l.get(i)).f44354a++;
                    i++;
                }
            } else {
                c6314c.f44354a = flexItemCount;
            }
        } else {
            c6314c.f44354a = flexItemCount;
        }
        m48786l.add(c6314c);
        return m48803U(flexItemCount + 1, m48786l, sparseIntArray);
    }

    /* renamed from: o */
    public void m48783o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f44347a.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        }
        List<FlexLine> flexLinesInternal = this.f44347a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f44347a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                ((FlexLine) flexLinesInternal.get(0)).f44249g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f44347a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i5) {
                                    float size2 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f = 0.0f;
                                    while (i6 < size3) {
                                        FlexLine flexLine = (FlexLine) flexLinesInternal.get(i6);
                                        float f2 = flexLine.f44249g + size2;
                                        if (i6 == flexLinesInternal.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round = Math.round(f2);
                                        f += f2 - round;
                                        if (f > 1.0f) {
                                            round++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round--;
                                            f += 1.0f;
                                        }
                                        flexLine.f44249g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize >= i5) {
                                this.f44347a.setFlexLines(m48787k(flexLinesInternal, i5, sumOfCrossSize));
                                return;
                            } else {
                                int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                FlexLine flexLine2 = new FlexLine();
                                flexLine2.f44249g = size4;
                                for (FlexLine flexLine3 : flexLinesInternal) {
                                    arrayList.add(flexLine2);
                                    arrayList.add(flexLine3);
                                    arrayList.add(flexLine2);
                                }
                                this.f44347a.setFlexLines(arrayList);
                                return;
                            }
                        } else if (sumOfCrossSize < i5) {
                            float size5 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f3 = 0.0f;
                            while (i6 < size6) {
                                arrayList2.add((FlexLine) flexLinesInternal.get(i6));
                                if (i6 != flexLinesInternal.size() - 1) {
                                    FlexLine flexLine4 = new FlexLine();
                                    if (i6 == flexLinesInternal.size() - 2) {
                                        flexLine4.f44249g = Math.round(f3 + size5);
                                        f3 = 0.0f;
                                    } else {
                                        flexLine4.f44249g = Math.round(size5);
                                    }
                                    int i7 = flexLine4.f44249g;
                                    f3 += size5 - i7;
                                    if (f3 > 1.0f) {
                                        flexLine4.f44249g = i7 + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        flexLine4.f44249g = i7 - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList2.add(flexLine4);
                                }
                                i6++;
                            }
                            this.f44347a.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f44347a.setFlexLines(m48787k(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                int i8 = i5 - sumOfCrossSize;
                FlexLine flexLine5 = new FlexLine();
                flexLine5.f44249g = i8;
                flexLinesInternal.add(0, flexLine5);
            }
        }
    }

    /* renamed from: p */
    public void m48782p(int i, int i2) {
        m48781q(i, i2, 0);
    }

    /* renamed from: q */
    public void m48781q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        m48780r(this.f44347a.getFlexItemCount());
        if (i3 >= this.f44347a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f44347a.getFlexDirection();
        int flexDirection2 = this.f44347a.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.f44347a.getLargestMainSize();
            }
            paddingLeft = this.f44347a.getPaddingTop();
            paddingRight = this.f44347a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.f44347a.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f44347a.getPaddingLeft();
            paddingRight = this.f44347a.getPaddingRight();
        }
        int i5 = paddingLeft + paddingRight;
        int[] iArr = this.f44349c;
        if (iArr != null) {
            i4 = iArr[i3];
        } else {
            i4 = 0;
        }
        List flexLinesInternal = this.f44347a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i4 < size2) {
            FlexLine flexLine = (FlexLine) flexLinesInternal.get(i4);
            int i6 = flexLine.f44247e;
            if (i6 < size && flexLine.f44259q) {
                m48775w(i, i2, flexLine, size, i5, false);
            } else if (i6 > size && flexLine.f44260r) {
                m48804T(i, i2, flexLine, size, i5, false);
            }
            i4++;
        }
    }

    /* renamed from: r */
    public final void m48780r(int i) {
        boolean[] zArr = this.f44348b;
        if (zArr == null) {
            this.f44348b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f44348b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: s */
    public void m48779s(int i) {
        int[] iArr = this.f44349c;
        if (iArr == null) {
            this.f44349c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f44349c = Arrays.copyOf(this.f44349c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: t */
    public void m48778t(int i) {
        long[] jArr = this.f44350d;
        if (jArr == null) {
            this.f44350d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f44350d = Arrays.copyOf(this.f44350d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: u */
    public void m48777u(int i) {
        long[] jArr = this.f44351e;
        if (jArr == null) {
            this.f44351e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f44351e = Arrays.copyOf(this.f44351e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: v */
    public final void m48776v(CompoundButton compoundButton) {
        int minimumWidth;
        M20 m20 = (M20) compoundButton.getLayoutParams();
        int minWidth = m20.getMinWidth();
        int minHeight = m20.getMinHeight();
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        int i = 0;
        if (buttonDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = buttonDrawable.getMinimumWidth();
        }
        if (buttonDrawable != null) {
            i = buttonDrawable.getMinimumHeight();
        }
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        m20.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = i;
        }
        m20.setMinHeight(minHeight);
    }

    /* renamed from: w */
    public final void m48775w(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = flexLine.f44252j;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = flexLine.f44247e)) {
            float f3 = (i3 - i5) / f;
            flexLine.f44247e = i4 + flexLine.f44248f;
            if (!z) {
                flexLine.f44249g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < flexLine.f44250h) {
                int i11 = flexLine.f44257o + i9;
                View reorderedFlexItemAt = this.f44347a.getReorderedFlexItemAt(i11);
                if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                    i6 = i5;
                } else {
                    M20 m20 = (M20) reorderedFlexItemAt.getLayoutParams();
                    int flexDirection = this.f44347a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i12 = i5;
                        int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                        long[] jArr = this.f44351e;
                        if (jArr != null) {
                            measuredWidth = m48773y(jArr[i11]);
                        }
                        int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                        long[] jArr2 = this.f44351e;
                        i6 = i12;
                        if (jArr2 != null) {
                            measuredHeight = m48774x(jArr2[i11]);
                        }
                        if (!this.f44348b[i11] && m20.getFlexGrow() > 0.0f) {
                            float flexGrow = measuredWidth + (m20.getFlexGrow() * f3);
                            if (i9 == flexLine.f44250h - 1) {
                                flexGrow += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(flexGrow);
                            if (round > m20.getMaxWidth()) {
                                round = m20.getMaxWidth();
                                this.f44348b[i11] = true;
                                flexLine.f44252j -= m20.getFlexGrow();
                                z2 = true;
                            } else {
                                f4 += flexGrow - round;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int m48772z = m48772z(i2, m20, flexLine.f44255m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            reorderedFlexItemAt.measure(makeMeasureSpec, m48772z);
                            int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                            int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                            m48798Z(i11, makeMeasureSpec, m48772z, reorderedFlexItemAt);
                            this.f44347a.updateViewCache(i11, reorderedFlexItemAt);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + m20.getMarginTop() + m20.getMarginBottom() + this.f44347a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                        flexLine.f44247e += measuredWidth + m20.getMarginLeft() + m20.getMarginRight();
                        i7 = max;
                    } else {
                        int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                        long[] jArr3 = this.f44351e;
                        if (jArr3 != null) {
                            measuredHeight3 = m48774x(jArr3[i11]);
                        }
                        int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        long[] jArr4 = this.f44351e;
                        if (jArr4 != null) {
                            measuredWidth3 = m48773y(jArr4[i11]);
                        }
                        if (!this.f44348b[i11] && m20.getFlexGrow() > f2) {
                            float flexGrow2 = measuredHeight3 + (m20.getFlexGrow() * f3);
                            if (i9 == flexLine.f44250h - 1) {
                                flexGrow2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(flexGrow2);
                            if (round2 > m20.getMaxHeight()) {
                                round2 = m20.getMaxHeight();
                                this.f44348b[i11] = true;
                                flexLine.f44252j -= m20.getFlexGrow();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += flexGrow2 - round2;
                                i8 = i5;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int m48823A = m48823A(i, m20, flexLine.f44255m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            reorderedFlexItemAt.measure(m48823A, makeMeasureSpec2);
                            measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                            int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                            m48798Z(i11, m48823A, makeMeasureSpec2, reorderedFlexItemAt);
                            this.f44347a.updateViewCache(i11, reorderedFlexItemAt);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i8 = i5;
                        }
                        i7 = Math.max(i10, measuredWidth3 + m20.getMarginLeft() + m20.getMarginRight() + this.f44347a.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                        flexLine.f44247e += measuredHeight3 + m20.getMarginTop() + m20.getMarginBottom();
                        i6 = i8;
                    }
                    flexLine.f44249g = Math.max(flexLine.f44249g, i7);
                    i10 = i7;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i13 = i5;
            if (z2 && i13 != flexLine.f44247e) {
                m48775w(i, i2, flexLine, i3, i4, true);
            }
        }
    }

    /* renamed from: x */
    public int m48774x(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: y */
    public int m48773y(long j) {
        return (int) j;
    }

    /* renamed from: z */
    public final int m48772z(int i, M20 m20, int i2) {
        L20 l20 = this.f44347a;
        int childHeightMeasureSpec = l20.getChildHeightMeasureSpec(i, l20.getPaddingTop() + this.f44347a.getPaddingBottom() + m20.getMarginTop() + m20.getMarginBottom() + i2, m20.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > m20.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(m20.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        if (size < m20.getMinHeight()) {
            return View.MeasureSpec.makeMeasureSpec(m20.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return childHeightMeasureSpec;
    }
}
