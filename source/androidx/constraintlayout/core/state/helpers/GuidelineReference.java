package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* loaded from: classes2.dex */
public class GuidelineReference implements Facade, Reference {

    /* renamed from: a */
    public final State f32394a;

    /* renamed from: b */
    public int f32395b;

    /* renamed from: c */
    public Guideline f32396c;

    /* renamed from: d */
    public int f32397d = -1;

    /* renamed from: e */
    public int f32398e = -1;

    /* renamed from: f */
    public float f32399f = 0.0f;

    /* renamed from: g */
    public Object f32400g;

    public GuidelineReference(State state) {
        this.f32394a = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.f32396c.setOrientation(this.f32395b);
        int i = this.f32397d;
        if (i != -1) {
            this.f32396c.setGuideBegin(i);
            return;
        }
        int i2 = this.f32398e;
        if (i2 != -1) {
            this.f32396c.setGuideEnd(i2);
        } else {
            this.f32396c.setGuidePercent(this.f32399f);
        }
    }

    public GuidelineReference end(Object obj) {
        this.f32397d = -1;
        this.f32398e = this.f32394a.convertDimension(obj);
        this.f32399f = 0.0f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.f32396c == null) {
            this.f32396c = new Guideline();
        }
        return this.f32396c;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f32400g;
    }

    public int getOrientation() {
        return this.f32395b;
    }

    public GuidelineReference percent(float f) {
        this.f32397d = -1;
        this.f32398e = -1;
        this.f32399f = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof Guideline) {
            this.f32396c = (Guideline) constraintWidget;
        } else {
            this.f32396c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.f32400g = obj;
    }

    public void setOrientation(int i) {
        this.f32395b = i;
    }

    public GuidelineReference start(Object obj) {
        this.f32397d = this.f32394a.convertDimension(obj);
        this.f32398e = -1;
        this.f32399f = 0.0f;
        return this;
    }
}
