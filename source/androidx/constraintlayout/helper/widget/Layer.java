package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: b */
    public float f32643b;

    /* renamed from: c */
    public float f32644c;

    /* renamed from: d */
    public float f32645d;

    /* renamed from: e */
    public ConstraintLayout f32646e;

    /* renamed from: f */
    public float f32647f;

    /* renamed from: g */
    public float f32648g;

    /* renamed from: h */
    public boolean f32649h;

    /* renamed from: i */
    public View[] f32650i;

    /* renamed from: j */
    public float f32651j;

    /* renamed from: k */
    public float f32652k;

    /* renamed from: l */
    public boolean f32653l;

    /* renamed from: m */
    public boolean f32654m;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;

    public Layer(Context context) {
        super(context);
        this.f32643b = Float.NaN;
        this.f32644c = Float.NaN;
        this.f32645d = Float.NaN;
        this.f32647f = 1.0f;
        this.f32648g = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.f32649h = true;
        this.f32650i = null;
        this.f32651j = 0.0f;
        this.f32652k = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    public void calcCenters() {
        if (this.f32646e == null) {
            return;
        }
        if (!this.f32649h && !Float.isNaN(this.mComputedCenterX) && !Float.isNaN(this.mComputedCenterY)) {
            return;
        }
        if (!Float.isNaN(this.f32643b) && !Float.isNaN(this.f32644c)) {
            this.mComputedCenterY = this.f32644c;
            this.mComputedCenterX = this.f32643b;
            return;
        }
        View[] views = getViews(this.f32646e);
        int left = views[0].getLeft();
        int top = views[0].getTop();
        int right = views[0].getRight();
        int bottom = views[0].getBottom();
        for (int i = 0; i < this.mCount; i++) {
            View view = views[i];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.mComputedMaxX = right;
        this.mComputedMaxY = bottom;
        this.mComputedMinX = left;
        this.mComputedMinY = top;
        if (Float.isNaN(this.f32643b)) {
            this.mComputedCenterX = (left + right) / 2;
        } else {
            this.mComputedCenterX = this.f32643b;
        }
        if (Float.isNaN(this.f32644c)) {
            this.mComputedCenterY = (top + bottom) / 2;
        } else {
            this.mComputedCenterY = this.f32644c;
        }
    }

    /* renamed from: g */
    public final void m58545g() {
        int i;
        if (this.f32646e == null || (i = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.f32650i;
        if (viewArr == null || viewArr.length != i) {
            this.f32650i = new View[i];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.f32650i[i2] = this.f32646e.getViewById(this.mIds[i2]);
        }
    }

    /* renamed from: h */
    public final void m58544h() {
        double radians;
        if (this.f32646e == null) {
            return;
        }
        if (this.f32650i == null) {
            m58545g();
        }
        calcCenters();
        if (Float.isNaN(this.f32645d)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.f32645d);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.f32647f;
        float f2 = f * cos;
        float f3 = this.f32648g;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.mCount; i++) {
            View view = this.f32650i[i];
            float left = ((view.getLeft() + view.getRight()) / 2) - this.mComputedCenterX;
            float top = ((view.getTop() + view.getBottom()) / 2) - this.mComputedCenterY;
            view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f32651j);
            view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f32652k);
            view.setScaleY(this.f32648g);
            view.setScaleX(this.f32647f);
            if (!Float.isNaN(this.f32645d)) {
                view.setRotation(this.f32645d);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f32653l = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f32654m = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32646e = (ConstraintLayout) getParent();
        if (this.f32653l || this.f32654m) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                View viewById = this.f32646e.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.f32653l) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f32654m && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f32643b = f;
        m58544h();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f32644c = f;
        m58544h();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f32645d = f;
        m58544h();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f32647f = f;
        m58544h();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f32648g = f;
        m58544h();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f32651j = f;
        m58544h();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f32652k = f;
        m58544h();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        m58545g();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        m58544h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.f32646e = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.f32645d)) {
                this.f32645d = rotation;
                return;
            }
            return;
        }
        this.f32645d = rotation;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32643b = Float.NaN;
        this.f32644c = Float.NaN;
        this.f32645d = Float.NaN;
        this.f32647f = 1.0f;
        this.f32648g = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.f32649h = true;
        this.f32650i = null;
        this.f32651j = 0.0f;
        this.f32652k = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32643b = Float.NaN;
        this.f32644c = Float.NaN;
        this.f32645d = Float.NaN;
        this.f32647f = 1.0f;
        this.f32648g = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.f32649h = true;
        this.f32650i = null;
        this.f32651j = 0.0f;
        this.f32652k = 0.0f;
    }
}
