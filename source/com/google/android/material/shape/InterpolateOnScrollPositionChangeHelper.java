package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class InterpolateOnScrollPositionChangeHelper {

    /* renamed from: a */
    public View f50624a;

    /* renamed from: b */
    public MaterialShapeDrawable f50625b;

    /* renamed from: c */
    public ScrollView f50626c;

    /* renamed from: d */
    public final int[] f50627d = new int[2];

    /* renamed from: e */
    public final int[] f50628e = new int[2];

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f50629f = new ViewTreeObserver$OnScrollChangedListenerC7057a();

    /* renamed from: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$a */
    /* loaded from: classes4.dex */
    public class ViewTreeObserver$OnScrollChangedListenerC7057a implements ViewTreeObserver.OnScrollChangedListener {
        public ViewTreeObserver$OnScrollChangedListenerC7057a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    }

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        this.f50624a = view;
        this.f50625b = materialShapeDrawable;
        this.f50626c = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.f50626c = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.f50625b = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f50629f);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f50629f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.f50626c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() != 0) {
            this.f50626c.getLocationInWindow(this.f50627d);
            this.f50626c.getChildAt(0).getLocationInWindow(this.f50628e);
            int top = (this.f50624a.getTop() - this.f50627d[1]) + this.f50628e[1];
            int height = this.f50624a.getHeight();
            int height2 = this.f50626c.getHeight();
            if (top < 0) {
                this.f50625b.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                this.f50624a.invalidate();
                return;
            }
            int i = top + height;
            if (i > height2) {
                this.f50625b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i - height2) / height))));
                this.f50624a.invalidate();
                return;
            } else if (this.f50625b.getInterpolation() != 1.0f) {
                this.f50625b.setInterpolation(1.0f);
                this.f50624a.invalidate();
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}
