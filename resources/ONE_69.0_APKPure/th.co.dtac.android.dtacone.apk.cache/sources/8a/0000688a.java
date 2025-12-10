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
    public int f33450a;

    /* renamed from: b */
    public boolean f33451b;

    /* renamed from: c */
    public int f33452c;

    /* renamed from: d */
    public boolean f33453d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f33450a = -1;
        this.f33451b = false;
        this.f33452c = 0;
        this.f33453d = true;
        super.setVisibility(8);
        m57996b(null);
    }

    /* renamed from: a */
    public final void m57997a(int i, int i2, MotionLayout motionLayout, int i3) {
        ConstraintSet constraintSet = motionLayout.getConstraintSet(i3);
        constraintSet.setGuidelineEnd(i2, i);
        motionLayout.updateState(i3, constraintSet);
    }

    /* renamed from: b */
    public final void m57996b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f33450a = obtainStyledAttributes.getResourceId(index, this.f33450a);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f33451b = obtainStyledAttributes.getBoolean(index, this.f33451b);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f33452c = obtainStyledAttributes.getResourceId(index, this.f33452c);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f33453d = obtainStyledAttributes.getBoolean(index, this.f33453d);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f33450a != -1) {
            ConstraintLayout.getSharedValues().addListener(this.f33450a, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f33452c;
    }

    public int getAttributeId() {
        return this.f33450a;
    }

    public boolean isAnimatingChange() {
        return this.f33451b;
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
            int i4 = this.f33452c;
            if (i4 != 0) {
                currentState = i4;
            }
            int i5 = 0;
            if (this.f33451b) {
                if (this.f33453d) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i5 < constraintSetIds.length) {
                        int i6 = constraintSetIds[i5];
                        if (i6 != currentState) {
                            m57997a(i2, id2, motionLayout, i6);
                        }
                        i5++;
                    }
                }
                ConstraintSet cloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                cloneConstraintSet.setGuidelineEnd(id2, i2);
                motionLayout.updateStateAnimate(currentState, cloneConstraintSet, 1000);
            } else if (this.f33453d) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds2.length) {
                    m57997a(i2, id2, motionLayout, constraintSetIds2[i5]);
                    i5++;
                }
            } else {
                m57997a(i2, id2, motionLayout, currentState);
            }
        }
    }

    public void setAnimateChange(boolean z) {
        this.f33451b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f33452c = i;
    }

    public void setAttributeId(int i) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f33450a;
        if (i2 != -1) {
            sharedValues.removeListener(i2, this);
        }
        this.f33450a = i;
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
        this.f33450a = -1;
        this.f33451b = false;
        this.f33452c = 0;
        this.f33453d = true;
        super.setVisibility(8);
        m57996b(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33450a = -1;
        this.f33451b = false;
        this.f33452c = 0;
        this.f33453d = true;
        super.setVisibility(8);
        m57996b(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f33450a = -1;
        this.f33451b = false;
        this.f33452c = 0;
        this.f33453d = true;
        super.setVisibility(8);
        m57996b(attributeSet);
    }
}