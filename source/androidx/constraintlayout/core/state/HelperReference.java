package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class HelperReference extends ConstraintReference implements Facade {

    /* renamed from: L */
    public final State.Helper f32357L;

    /* renamed from: M */
    public HelperWidget f32358M;
    protected ArrayList<Object> mReferences;
    protected final State mState;

    public HelperReference(State state, State.Helper helper) {
        super(state);
        this.mReferences = new ArrayList<>();
        this.mState = state;
        this.f32357L = helper;
    }

    public HelperReference add(Object... objArr) {
        Collections.addAll(this.mReferences, objArr);
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        return getHelperWidget();
    }

    public HelperWidget getHelperWidget() {
        return this.f32358M;
    }

    public State.Helper getType() {
        return this.f32357L;
    }

    public void setHelperWidget(HelperWidget helperWidget) {
        this.f32358M = helperWidget;
    }
}
