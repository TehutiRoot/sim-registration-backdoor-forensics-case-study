package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class InterpolateOnScrollPositionChangeHelper {

    /* renamed from: a */
    public View f50636a;

    /* renamed from: b */
    public MaterialShapeDrawable f50637b;

    /* renamed from: c */
    public ScrollView f50638c;

    /* renamed from: d */
    public final int[] f50639d = new int[2];

    /* renamed from: e */
    public final int[] f50640e = new int[2];

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f50641f = new ViewTreeObserver$OnScrollChangedListenerC7046a();

    /* renamed from: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$a */
    /* loaded from: classes4.dex */
    public class ViewTreeObserver$OnScrollChangedListenerC7046a implements ViewTreeObserver.OnScrollChangedListener {
        public ViewTreeObserver$OnScrollChangedListenerC7046a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    }

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        this.f50636a = view;
        this.f50637b = materialShapeDrawable;
        this.f50638c = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.f50638c = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.f50637b = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f50641f);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f50641f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.f50638c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() != 0) {
            this.f50638c.getLocationInWindow(this.f50639d);
            this.f50638c.getChildAt(0).getLocationInWindow(this.f50640e);
            int top = (this.f50636a.getTop() - this.f50639d[1]) + this.f50640e[1];
            int height = this.f50636a.getHeight();
            int height2 = this.f50638c.getHeight();
            if (top < 0) {
                this.f50637b.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                this.f50636a.invalidate();
                return;
            }
            int i = top + height;
            if (i > height2) {
                this.f50637b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i - height2) / height))));
                this.f50636a.invalidate();
                return;
            } else if (this.f50637b.getInterpolation() != 1.0f) {
                this.f50637b.setInterpolation(1.0f);
                this.f50636a.invalidate();
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}