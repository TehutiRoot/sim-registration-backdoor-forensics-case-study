package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ConstraintReference implements Reference {

    /* renamed from: C */
    public float f32401C;

    /* renamed from: D */
    public float f32402D;

    /* renamed from: F */
    public Dimension f32404F;

    /* renamed from: G */
    public Dimension f32405G;

    /* renamed from: H */
    public Object f32406H;

    /* renamed from: I */
    public ConstraintWidget f32407I;

    /* renamed from: J */
    public HashMap f32408J;

    /* renamed from: K */
    public HashMap f32409K;

    /* renamed from: a */
    public Object f32410a;

    /* renamed from: b */
    public final State f32411b;

    /* renamed from: c */
    public String f32412c = null;

    /* renamed from: d */
    public Facade f32413d = null;

    /* renamed from: e */
    public int f32414e = 0;

    /* renamed from: f */
    public int f32415f = 0;

    /* renamed from: g */
    public float f32416g = -1.0f;

    /* renamed from: h */
    public float f32417h = -1.0f;

    /* renamed from: i */
    public float f32418i = 0.5f;

    /* renamed from: j */
    public float f32419j = 0.5f;
    protected int mMarginLeft = 0;
    protected int mMarginRight = 0;
    protected int mMarginStart = 0;
    protected int mMarginEnd = 0;
    protected int mMarginTop = 0;
    protected int mMarginBottom = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginTopGone = 0;
    protected int mMarginBottomGone = 0;

    /* renamed from: k */
    public int f32420k = 0;

    /* renamed from: l */
    public int f32421l = 0;

    /* renamed from: m */
    public float f32422m = Float.NaN;

    /* renamed from: n */
    public float f32423n = Float.NaN;

    /* renamed from: o */
    public float f32424o = Float.NaN;

    /* renamed from: p */
    public float f32425p = Float.NaN;

    /* renamed from: q */
    public float f32426q = Float.NaN;

    /* renamed from: r */
    public float f32427r = Float.NaN;

    /* renamed from: s */
    public float f32428s = Float.NaN;

    /* renamed from: t */
    public float f32429t = Float.NaN;

    /* renamed from: u */
    public float f32430u = Float.NaN;

    /* renamed from: v */
    public float f32431v = Float.NaN;

    /* renamed from: w */
    public float f32432w = Float.NaN;

    /* renamed from: x */
    public int f32433x = 0;
    protected Object mLeftToLeft = null;
    protected Object mLeftToRight = null;
    protected Object mRightToLeft = null;
    protected Object mRightToRight = null;
    protected Object mStartToStart = null;
    protected Object mStartToEnd = null;
    protected Object mEndToStart = null;
    protected Object mEndToEnd = null;
    protected Object mTopToTop = null;
    protected Object mTopToBottom = null;
    protected Object mBottomToTop = null;
    protected Object mBottomToBottom = null;

    /* renamed from: y */
    public Object f32434y = null;

    /* renamed from: z */
    public Object f32435z = null;

    /* renamed from: A */
    public Object f32399A = null;

    /* renamed from: B */
    public Object f32400B = null;

    /* renamed from: E */
    public State.Constraint f32403E = null;

    /* loaded from: classes2.dex */
    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    /* loaded from: classes2.dex */
    public static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3670a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32436a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f32436a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32436a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32436a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32436a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32436a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32436a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32436a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32436a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32436a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32436a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32436a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32436a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32436a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32436a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32436a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32436a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32436a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32436a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.f32404F = Dimension.Fixed(obj);
        this.f32405G = Dimension.Fixed(obj);
        this.f32408J = new HashMap();
        this.f32409K = new HashMap();
        this.f32411b = state;
    }

    /* renamed from: a */
    public final void m58645a(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget m58642d = m58642d(obj);
        if (m58642d == null) {
            return;
        }
        int[] iArr = C3670a.f32436a;
        int i = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type).connect(m58642d.getAnchor(type), this.mMarginLeft, this.mMarginLeftGone, false);
                return;
            case 2:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(m58642d.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                return;
            case 3:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(m58642d.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                return;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type2).connect(m58642d.getAnchor(type2), this.mMarginRight, this.mMarginRightGone, false);
                return;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type3).connect(m58642d.getAnchor(type3), this.mMarginStart, this.mMarginStartGone, false);
                return;
            case 6:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(m58642d.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                return;
            case 7:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(m58642d.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                return;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type4).connect(m58642d.getAnchor(type4), this.mMarginEnd, this.mMarginEndGone, false);
                return;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.getAnchor(type5).connect(m58642d.getAnchor(type5), this.mMarginTop, this.mMarginTopGone, false);
                return;
            case 10:
                constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).connect(m58642d.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                return;
            case 11:
                constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(m58642d.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                return;
            case 12:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.getAnchor(type6).connect(m58642d.getAnchor(type6), this.mMarginBottom, this.mMarginBottomGone, false);
                return;
            case 13:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, m58642d, ConstraintAnchor.Type.BOTTOM, this.f32420k, this.f32421l);
                return;
            case 14:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, m58642d, ConstraintAnchor.Type.TOP, this.f32420k, this.f32421l);
                return;
            case 15:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.immediateConnect(type7, m58642d, type7, this.f32420k, this.f32421l);
                return;
            case 16:
                constraintWidget.connectCircularConstraint(m58642d, this.f32401C, (int) this.f32402D);
                return;
            default:
                return;
        }
    }

    public void addCustomColor(String str, int i) {
        this.f32408J.put(str, Integer.valueOf(i));
    }

    public void addCustomFloat(String str, float f) {
        if (this.f32409K == null) {
            this.f32409K = new HashMap();
        }
        this.f32409K.put(str, Float.valueOf(f));
    }

    public ConstraintReference alpha(float f) {
        this.f32430u = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.f32407I == null) {
            return;
        }
        Facade facade = this.f32413d;
        if (facade != null) {
            facade.apply();
        }
        this.f32404F.apply(this.f32411b, this.f32407I, 0);
        this.f32405G.apply(this.f32411b, this.f32407I, 1);
        m58644b();
        m58645a(this.f32407I, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        m58645a(this.f32407I, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        m58645a(this.f32407I, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        m58645a(this.f32407I, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        m58645a(this.f32407I, this.mStartToStart, State.Constraint.START_TO_START);
        m58645a(this.f32407I, this.mStartToEnd, State.Constraint.START_TO_END);
        m58645a(this.f32407I, this.mEndToStart, State.Constraint.END_TO_START);
        m58645a(this.f32407I, this.mEndToEnd, State.Constraint.END_TO_END);
        m58645a(this.f32407I, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        m58645a(this.f32407I, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        m58645a(this.f32407I, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        m58645a(this.f32407I, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        m58645a(this.f32407I, this.f32434y, State.Constraint.BASELINE_TO_BASELINE);
        m58645a(this.f32407I, this.f32435z, State.Constraint.BASELINE_TO_TOP);
        m58645a(this.f32407I, this.f32399A, State.Constraint.BASELINE_TO_BOTTOM);
        m58645a(this.f32407I, this.f32400B, State.Constraint.CIRCULAR_CONSTRAINT);
        int i = this.f32414e;
        if (i != 0) {
            this.f32407I.setHorizontalChainStyle(i);
        }
        int i2 = this.f32415f;
        if (i2 != 0) {
            this.f32407I.setVerticalChainStyle(i2);
        }
        float f = this.f32416g;
        if (f != -1.0f) {
            this.f32407I.setHorizontalWeight(f);
        }
        float f2 = this.f32417h;
        if (f2 != -1.0f) {
            this.f32407I.setVerticalWeight(f2);
        }
        this.f32407I.setHorizontalBiasPercent(this.f32418i);
        this.f32407I.setVerticalBiasPercent(this.f32419j);
        ConstraintWidget constraintWidget = this.f32407I;
        WidgetFrame widgetFrame = constraintWidget.frame;
        widgetFrame.pivotX = this.f32422m;
        widgetFrame.pivotY = this.f32423n;
        widgetFrame.rotationX = this.f32424o;
        widgetFrame.rotationY = this.f32425p;
        widgetFrame.rotationZ = this.f32426q;
        widgetFrame.translationX = this.f32427r;
        widgetFrame.translationY = this.f32428s;
        widgetFrame.translationZ = this.f32429t;
        widgetFrame.scaleX = this.f32431v;
        widgetFrame.scaleY = this.f32432w;
        widgetFrame.alpha = this.f32430u;
        int i3 = this.f32433x;
        widgetFrame.visibility = i3;
        constraintWidget.setVisibility(i3);
        HashMap hashMap = this.f32408J;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f32407I.frame.setCustomAttribute(str, TypedValues.Custom.TYPE_COLOR, ((Integer) this.f32408J.get(str)).intValue());
            }
        }
        HashMap hashMap2 = this.f32409K;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f32407I.frame.setCustomAttribute(str2, TypedValues.Custom.TYPE_FLOAT, ((Float) this.f32409K.get(str2)).floatValue());
            }
        }
    }

    /* renamed from: b */
    public final void m58644b() {
        this.mLeftToLeft = m58643c(this.mLeftToLeft);
        this.mLeftToRight = m58643c(this.mLeftToRight);
        this.mRightToLeft = m58643c(this.mRightToLeft);
        this.mRightToRight = m58643c(this.mRightToRight);
        this.mStartToStart = m58643c(this.mStartToStart);
        this.mStartToEnd = m58643c(this.mStartToEnd);
        this.mEndToStart = m58643c(this.mEndToStart);
        this.mEndToEnd = m58643c(this.mEndToEnd);
        this.mTopToTop = m58643c(this.mTopToTop);
        this.mTopToBottom = m58643c(this.mTopToBottom);
        this.mBottomToTop = m58643c(this.mBottomToTop);
        this.mBottomToBottom = m58643c(this.mBottomToBottom);
        this.f32434y = m58643c(this.f32434y);
        this.f32435z = m58643c(this.f32435z);
        this.f32399A = m58643c(this.f32399A);
    }

    public ConstraintReference baseline() {
        this.f32403E = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.f32403E = State.Constraint.BASELINE_TO_BASELINE;
        this.f32434y = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        this.f32403E = State.Constraint.BASELINE_TO_BOTTOM;
        this.f32399A = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        this.f32403E = State.Constraint.BASELINE_TO_TOP;
        this.f32435z = obj;
        return this;
    }

    public ConstraintReference bias(float f) {
        State.Constraint constraint = this.f32403E;
        if (constraint == null) {
            return this;
        }
        int i = C3670a.f32436a[constraint.ordinal()];
        if (i != 17) {
            if (i != 18) {
                switch (i) {
                }
                return this;
            }
            this.f32419j = f;
            return this;
        }
        this.f32418i = f;
        return this;
    }

    public ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.f32403E = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.f32403E = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.f32403E = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.f32403E = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    /* renamed from: c */
    public final Object m58643c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof ConstraintReference)) {
            return this.f32411b.m58639b(obj);
        }
        return obj;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object m58643c = m58643c(obj);
        this.mStartToStart = m58643c;
        this.mEndToEnd = m58643c;
        this.f32403E = State.Constraint.CENTER_HORIZONTALLY;
        this.f32418i = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object m58643c = m58643c(obj);
        this.mTopToTop = m58643c;
        this.mBottomToBottom = m58643c;
        this.f32403E = State.Constraint.CENTER_VERTICALLY;
        this.f32419j = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f, float f2) {
        this.f32400B = m58643c(obj);
        this.f32401C = f;
        this.f32402D = f2;
        this.f32403E = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference clear() {
        State.Constraint constraint = this.f32403E;
        if (constraint != null) {
            switch (C3670a.f32436a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 11:
                case 12:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    break;
                case 15:
                    this.f32434y = null;
                    break;
                case 16:
                    this.f32400B = null;
                    break;
            }
        } else {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.f32434y = null;
            this.f32400B = null;
            this.f32418i = 0.5f;
            this.f32419j = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
            this.mMarginBottomGone = 0;
        }
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().m58641a(), getHeight().m58641a());
    }

    /* renamed from: d */
    public final ConstraintWidget m58642d(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.f32403E = State.Constraint.END_TO_START;
        } else {
            this.f32403E = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.f32403E = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.f32403E = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        return this.f32430u;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.f32407I == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.f32407I = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.f32406H);
        }
        return this.f32407I;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return this.f32413d;
    }

    public Dimension getHeight() {
        return this.f32405G;
    }

    public int getHorizontalChainStyle() {
        return this.f32414e;
    }

    public float getHorizontalChainWeight() {
        return this.f32416g;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f32410a;
    }

    public float getPivotX() {
        return this.f32422m;
    }

    public float getPivotY() {
        return this.f32423n;
    }

    public float getRotationX() {
        return this.f32424o;
    }

    public float getRotationY() {
        return this.f32425p;
    }

    public float getRotationZ() {
        return this.f32426q;
    }

    public float getScaleX() {
        return this.f32431v;
    }

    public float getScaleY() {
        return this.f32432w;
    }

    public String getTag() {
        return this.f32412c;
    }

    public float getTranslationX() {
        return this.f32427r;
    }

    public float getTranslationY() {
        return this.f32428s;
    }

    public float getTranslationZ() {
        return this.f32429t;
    }

    public int getVerticalChainStyle(int i) {
        return this.f32415f;
    }

    public float getVerticalChainWeight() {
        return this.f32417h;
    }

    public Object getView() {
        return this.f32406H;
    }

    public Dimension getWidth() {
        return this.f32404F;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f) {
        this.f32418i = f;
        return this;
    }

    public ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.f32403E = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.f32403E = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.f32403E = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.f32403E = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.f32411b.convertDimension(obj));
    }

    public ConstraintReference marginGone(Object obj) {
        return marginGone(this.f32411b.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f) {
        this.f32422m = f;
        return this;
    }

    public ConstraintReference pivotY(float f) {
        this.f32423n = f;
        return this;
    }

    public ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.f32403E = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.f32403E = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.f32403E = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.f32403E = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f) {
        this.f32424o = f;
        return this;
    }

    public ConstraintReference rotationY(float f) {
        this.f32425p = f;
        return this;
    }

    public ConstraintReference rotationZ(float f) {
        this.f32426q = f;
        return this;
    }

    public ConstraintReference scaleX(float f) {
        this.f32431v = f;
        return this;
    }

    public ConstraintReference scaleY(float f) {
        this.f32432w = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.f32407I = constraintWidget;
        constraintWidget.setCompanionWidget(this.f32406H);
    }

    public void setFacade(Facade facade) {
        this.f32413d = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.f32405G = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i) {
        this.f32414e = i;
    }

    public void setHorizontalChainWeight(float f) {
        this.f32416g = f;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.f32410a = obj;
    }

    public void setTag(String str) {
        this.f32412c = str;
    }

    public void setVerticalChainStyle(int i) {
        this.f32415f = i;
    }

    public void setVerticalChainWeight(float f) {
        this.f32417h = f;
    }

    public void setView(Object obj) {
        this.f32406H = obj;
        ConstraintWidget constraintWidget = this.f32407I;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.f32404F = dimension;
        return this;
    }

    public ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.f32403E = State.Constraint.START_TO_START;
        } else {
            this.f32403E = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.f32403E = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.f32403E = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.f32403E = State.Constraint.TOP_TO_TOP;
        } else {
            this.f32403E = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.f32403E = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.f32403E = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f) {
        this.f32427r = f;
        return this;
    }

    public ConstraintReference translationY(float f) {
        this.f32428s = f;
        return this;
    }

    public ConstraintReference translationZ(float f) {
        this.f32429t = f;
        return this;
    }

    public void validate() throws IncorrectConstraintException {
        ArrayList arrayList = new ArrayList();
        if (this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() <= 0) {
            return;
        }
        throw new IncorrectConstraintException(arrayList);
    }

    public ConstraintReference verticalBias(float f) {
        this.f32419j = f;
        return this;
    }

    public ConstraintReference visibility(int i) {
        this.f32433x = i;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }

    public ConstraintReference margin(int i) {
        State.Constraint constraint = this.f32403E;
        if (constraint != null) {
            switch (C3670a.f32436a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i;
                    break;
                case 9:
                case 10:
                    this.mMarginTop = i;
                    break;
                case 11:
                case 12:
                    this.mMarginBottom = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f32420k = i;
                    break;
                case 16:
                    this.f32402D = i;
                    break;
            }
        } else {
            this.mMarginLeft = i;
            this.mMarginRight = i;
            this.mMarginStart = i;
            this.mMarginEnd = i;
            this.mMarginTop = i;
            this.mMarginBottom = i;
        }
        return this;
    }

    public ConstraintReference marginGone(int i) {
        State.Constraint constraint = this.f32403E;
        if (constraint != null) {
            switch (C3670a.f32436a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i;
                    break;
                case 9:
                case 10:
                    this.mMarginTopGone = i;
                    break;
                case 11:
                case 12:
                    this.mMarginBottomGone = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f32421l = i;
                    break;
            }
        } else {
            this.mMarginLeftGone = i;
            this.mMarginRightGone = i;
            this.mMarginStartGone = i;
            this.mMarginEndGone = i;
            this.mMarginTopGone = i;
            this.mMarginBottomGone = i;
        }
        return this;
    }
}