package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;

/* loaded from: classes2.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {

    /* renamed from: a */
    public int f33362a;

    /* renamed from: b */
    public boolean f33363b;

    /* renamed from: c */
    public int f33364c;

    /* renamed from: d */
    public boolean f33365d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f33362a = -1;
        this.f33363b = false;
        this.f33364c = 0;
        this.f33365d = true;
        super.setVisibility(8);
        m58046b(null);
    }

    /* renamed from: a */
    public final void m58047a(int i, int i2, MotionLayout motionLayout, int i3) {
        ConstraintSet constraintSet = motionLayout.getConstraintSet(i3);
        constraintSet.setGuidelineEnd(i2, i);
        motionLayout.updateState(i3, constraintSet);
    }

    /* renamed from: b */
    public final void m58046b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f33362a = obtainStyledAttributes.getResourceId(index, this.f33362a);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f33363b = obtainStyledAttributes.getBoolean(index, this.f33363b);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f33364c = obtainStyledAttributes.getResourceId(index, this.f33364c);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f33365d = obtainStyledAttributes.getBoolean(index, this.f33365d);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f33362a != -1) {
            ConstraintLayout.getSharedValues().addListener(this.f33362a, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f33364c;
    }

    public int getAttributeId() {
        return this.f33362a;
    }

    public boolean isAnimatingChange() {
        return this.f33363b;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int i, int i2, int i3) {
        setGuidelineBegin(i2);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i4 = this.f33364c;
            if (i4 != 0) {
                currentState = i4;
            }
            int i5 = 0;
            if (this.f33363b) {
                if (this.f33365d) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i5 < constraintSetIds.length) {
                        int i6 = constraintSetIds[i5];
                        if (i6 != currentState) {
                            m58047a(i2, id2, motionLayout, i6);
                        }
                        i5++;
                    }
                }
                ConstraintSet cloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                cloneConstraintSet.setGuidelineEnd(id2, i2);
                motionLayout.updateStateAnimate(currentState, cloneConstraintSet, 1000);
            } else if (this.f33365d) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds2.length) {
                    m58047a(i2, id2, motionLayout, constraintSetIds2[i5]);
                    i5++;
                }
            } else {
                m58047a(i2, id2, motionLayout, currentState);
            }
        }
    }

    public void setAnimateChange(boolean z) {
        this.f33363b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f33364c = i;
    }

    public void setAttributeId(int i) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f33362a;
        if (i2 != -1) {
            sharedValues.removeListener(i2, this);
        }
        this.f33362a = i;
        if (i != -1) {
            sharedValues.addListener(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33362a = -1;
        this.f33363b = false;
        this.f33364c = 0;
        this.f33365d = true;
        super.setVisibility(8);
        m58046b(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33362a = -1;
        this.f33363b = false;
        this.f33364c = 0;
        this.f33365d = true;
        super.setVisibility(8);
        m58046b(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f33362a = -1;
        this.f33363b = false;
        this.f33364c = 0;
        this.f33365d = true;
        super.setVisibility(8);
        m58046b(attributeSet);
    }
}
