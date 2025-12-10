package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexboxItemDecoration extends RecyclerView.ItemDecoration {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    public static final int VERTICAL = 2;

    /* renamed from: c */
    public static final int[] f44273c = {16843284};

    /* renamed from: a */
    public Drawable f44274a;

    /* renamed from: b */
    public int f44275b;

    public FlexboxItemDecoration(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f44273c);
        this.f44274a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setOrientation(3);
    }

    /* renamed from: a */
    public final void m48959a(Canvas canvas, RecyclerView recyclerView) {
        int top;
        int intrinsicHeight;
        int left;
        int right;
        int i;
        int i2;
        int i3;
        if (!m48956d()) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        int flexDirection = flexboxLayoutManager.getFlexDirection();
        int left2 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
        int right2 = recyclerView.getRight() + recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            if (flexDirection == 3) {
                intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                top = this.f44274a.getIntrinsicHeight() + intrinsicHeight;
            } else {
                top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                intrinsicHeight = top - this.f44274a.getIntrinsicHeight();
            }
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                if (flexboxLayoutManager.m48906d0()) {
                    i2 = Math.min(childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.f44274a.getIntrinsicWidth(), right2);
                    i3 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    this.f44274a.setBounds(i3, intrinsicHeight, i2, top);
                    this.f44274a.draw(canvas);
                } else {
                    left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f44274a.getIntrinsicWidth(), left2);
                    right = childAt.getRight();
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
            } else {
                left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                right = childAt.getRight();
                i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }
            int i5 = left;
            i2 = right + i;
            i3 = i5;
            this.f44274a.setBounds(i3, intrinsicHeight, i2, top);
            this.f44274a.draw(canvas);
        }
    }

    /* renamed from: b */
    public final void m48958b(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int max;
        int bottom;
        int i;
        int i2;
        if (!m48955e()) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        int top = recyclerView.getTop() - recyclerView.getPaddingTop();
        int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int flexDirection = flexboxLayoutManager.getFlexDirection();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            if (flexboxLayoutManager.m48906d0()) {
                intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                left = this.f44274a.getIntrinsicWidth() + intrinsicWidth;
            } else {
                left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                intrinsicWidth = left - this.f44274a.getIntrinsicWidth();
            }
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                max = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                bottom = childAt.getBottom();
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else if (flexDirection == 3) {
                int min = Math.min(childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + this.f44274a.getIntrinsicHeight(), bottom2);
                max = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i2 = min;
                this.f44274a.setBounds(intrinsicWidth, max, left, i2);
                this.f44274a.draw(canvas);
            } else {
                max = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f44274a.getIntrinsicHeight(), top);
                bottom = childAt.getBottom();
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            i2 = bottom + i;
            this.f44274a.setBounds(intrinsicWidth, max, left, i2);
            this.f44274a.draw(canvas);
        }
    }

    /* renamed from: c */
    public final boolean m48957c(int i, List list, FlexboxLayoutManager flexboxLayoutManager) {
        int m48909a0 = flexboxLayoutManager.m48909a0(i);
        if ((m48909a0 != -1 && m48909a0 < flexboxLayoutManager.getFlexLinesInternal().size() && flexboxLayoutManager.getFlexLinesInternal().get(m48909a0).f44269o == i) || i == 0) {
            return true;
        }
        if (list.size() != 0 && ((FlexLine) list.get(list.size() - 1)).f44270p == i - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m48956d() {
        if ((this.f44275b & 1) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m48955e() {
        if ((this.f44275b & 2) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m48954f(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List list) {
        if (list.size() == 0 || flexboxLayoutManager.m48909a0(i) == 0) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (!m48956d()) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            rect.top = this.f44274a.getIntrinsicHeight();
            rect.bottom = 0;
        } else if (!m48955e()) {
        } else {
            if (flexboxLayoutManager.m48906d0()) {
                rect.right = this.f44274a.getIntrinsicWidth();
                rect.left = 0;
                return;
            }
            rect.left = this.f44274a.getIntrinsicWidth();
            rect.right = 0;
        }
    }

    /* renamed from: g */
    public final void m48953g(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List list, int i2) {
        if (m48957c(i, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (!m48955e()) {
                rect.left = 0;
                rect.right = 0;
            } else if (flexboxLayoutManager.m48906d0()) {
                rect.right = this.f44274a.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.f44274a.getIntrinsicWidth();
                rect.right = 0;
            }
        } else if (!m48956d()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i2 == 3) {
            rect.bottom = this.f44274a.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.f44274a.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!m48956d() && !m48955e()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<FlexLine> flexLines = flexboxLayoutManager.getFlexLines();
        m48953g(rect, childAdapterPosition, flexboxLayoutManager, flexLines, flexboxLayoutManager.getFlexDirection());
        m48954f(rect, childAdapterPosition, flexboxLayoutManager, flexLines);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        m48959a(canvas, recyclerView);
        m48958b(canvas, recyclerView);
    }

    public void setDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f44274a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void setOrientation(int i) {
        this.f44275b = i;
    }
}