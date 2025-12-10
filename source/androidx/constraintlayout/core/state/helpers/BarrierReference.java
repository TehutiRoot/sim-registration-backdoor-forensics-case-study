package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* loaded from: classes2.dex */
public class BarrierReference extends HelperReference {

    /* renamed from: N */
    public State.Direction f32390N;

    /* renamed from: O */
    public int f32391O;

    /* renamed from: P */
    public Barrier f32392P;

    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3692a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32393a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f32393a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32393a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32393a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32393a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32393a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32393a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        int i = C3692a.f32393a[this.f32390N.ordinal()];
        int i2 = 3;
        if (i != 3 && i != 4) {
            if (i != 5) {
                if (i != 6) {
                    i2 = 0;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        this.f32392P.setBarrierType(i2);
        this.f32392P.setMargin(this.f32391O);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        if (this.f32392P == null) {
            this.f32392P = new Barrier();
        }
        return this.f32392P;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(Object obj) {
        margin(this.mState.convertDimension(obj));
        return this;
    }

    public void setBarrierDirection(State.Direction direction) {
        this.f32390N = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference margin(int i) {
        this.f32391O = i;
        return this;
    }
}
