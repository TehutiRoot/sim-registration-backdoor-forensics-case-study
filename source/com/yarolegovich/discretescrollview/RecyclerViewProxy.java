package com.yarolegovich.discretescrollview;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class RecyclerViewProxy {

    /* renamed from: a */
    public RecyclerView.LayoutManager f60902a;

    public RecyclerViewProxy(@NonNull RecyclerView.LayoutManager layoutManager) {
        this.f60902a = layoutManager;
    }

    public void attachView(View view) {
        this.f60902a.attachView(view);
    }

    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
        this.f60902a.detachAndScrapAttachedViews(recycler);
    }

    public void detachAndScrapView(View view, RecyclerView.Recycler recycler) {
        this.f60902a.detachAndScrapView(view, recycler);
    }

    public void detachView(View view) {
        this.f60902a.detachView(view);
    }

    public View getChildAt(int i) {
        return this.f60902a.getChildAt(i);
    }

    public int getChildCount() {
        return this.f60902a.getChildCount();
    }

    public int getHeight() {
        return this.f60902a.getHeight();
    }

    public int getItemCount() {
        return this.f60902a.getItemCount();
    }

    public View getMeasuredChildForAdapterPosition(int i, RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(i);
        this.f60902a.addView(viewForPosition);
        this.f60902a.measureChildWithMargins(viewForPosition, 0, 0);
        return viewForPosition;
    }

    public int getMeasuredHeightWithMargin(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.f60902a.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public int getMeasuredWidthWithMargin(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.f60902a.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public int getPosition(View view) {
        return this.f60902a.getPosition(view);
    }

    public int getWidth() {
        return this.f60902a.getWidth();
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        this.f60902a.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }

    public void offsetChildrenHorizontal(int i) {
        this.f60902a.offsetChildrenHorizontal(i);
    }

    public void offsetChildrenVertical(int i) {
        this.f60902a.offsetChildrenVertical(i);
    }

    public void recycleView(View view, RecyclerView.Recycler recycler) {
        recycler.recycleView(view);
    }

    public void removeAllViews() {
        this.f60902a.removeAllViews();
    }

    public void removeAndRecycleAllViews(RecyclerView.Recycler recycler) {
        this.f60902a.removeAndRecycleAllViews(recycler);
    }

    public void requestLayout() {
        this.f60902a.requestLayout();
    }

    public void startSmoothScroll(RecyclerView.SmoothScroller smoothScroller) {
        this.f60902a.startSmoothScroll(smoothScroller);
    }
}
