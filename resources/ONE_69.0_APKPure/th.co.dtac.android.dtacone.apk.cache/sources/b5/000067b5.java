package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* loaded from: classes2.dex */
public class GuidelineReference implements Facade, Reference {

    /* renamed from: a */
    public final State f32482a;

    /* renamed from: b */
    public int f32483b;

    /* renamed from: c */
    public Guideline f32484c;

    /* renamed from: d */
    public int f32485d = -1;

    /* renamed from: e */
    public int f32486e = -1;

    /* renamed from: f */
    public float f32487f = 0.0f;

    /* renamed from: g */
    public Object f32488g;

    public GuidelineReference(State state) {
        this.f32482a = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.f32484c.setOrientation(this.f32483b);
        int i = this.f32485d;
        if (i != -1) {
            this.f32484c.setGuideBegin(i);
            return;
        }
        int i2 = this.f32486e;
        if (i2 != -1) {
            this.f32484c.setGuideEnd(i2);
        } else {
            this.f32484c.setGuidePercent(this.f32487f);
        }
    }

    public GuidelineReference end(Object obj) {
        this.f32485d = -1;
        this.f32486e = this.f32482a.convertDimension(obj);
        this.f32487f = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.f32484c == null) {
            this.f32484c = new Guideline();
        }
        return this.f32484c;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f32488g;
    }

    public int getOrientation() {
        return this.f32483b;
    }

    public GuidelineReference percent(float f) {
        this.f32485d = -1;
        this.f32486e = -1;
        this.f32487f = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.f32484c = (Guideline) constraintWidget;
        } else {
            this.f32484c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.f32488g = obj;
    }

    public void setOrientation(int i) {
        this.f32483b = i;
    }

    public GuidelineReference start(Object obj) {
        this.f32485d = this.f32482a.convertDimension(obj);
        this.f32486e = -1;
        this.f32487f = 0.0f;
        return this;
    }
}