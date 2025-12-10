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
    public float f32313C;

    /* renamed from: D */
    public float f32314D;

    /* renamed from: F */
    public Dimension f32316F;

    /* renamed from: G */
    public Dimension f32317G;

    /* renamed from: H */
    public Object f32318H;

    /* renamed from: I */
    public ConstraintWidget f32319I;

    /* renamed from: J */
    public HashMap f32320J;

    /* renamed from: K */
    public HashMap f32321K;

    /* renamed from: a */
    public Object f32322a;

    /* renamed from: b */
    public final State f32323b;

    /* renamed from: c */
    public String f32324c = null;

    /* renamed from: d */
    public Facade f32325d = null;

    /* renamed from: e */
    public int f32326e = 0;

    /* renamed from: f */
    public int f32327f = 0;

    /* renamed from: g */
    public float f32328g = -1.0f;

    /* renamed from: h */
    public float f32329h = -1.0f;

    /* renamed from: i */
    public float f32330i = 0.5f;

    /* renamed from: j */
    public float f32331j = 0.5f;
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
    public int f32332k = 0;

    /* renamed from: l */
    public int f32333l = 0;

    /* renamed from: m */
    public float f32334m = Float.NaN;

    /* renamed from: n */
    public float f32335n = Float.NaN;

    /* renamed from: o */
    public float f32336o = Float.NaN;

    /* renamed from: p */
    public float f32337p = Float.NaN;

    /* renamed from: q */
    public float f32338q = Float.NaN;

    /* renamed from: r */
    public float f32339r = Float.NaN;

    /* renamed from: s */
    public float f32340s = Float.NaN;

    /* renamed from: t */
    public float f32341t = Float.NaN;

    /* renamed from: u */
    public float f32342u = Float.NaN;

    /* renamed from: v */
    public float f32343v = Float.NaN;

    /* renamed from: w */
    public float f32344w = Float.NaN;

    /* renamed from: x */
    public int f32345x = 0;
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
    public Object f32346y = null;

    /* renamed from: z */
    public Object f32347z = null;

    /* renamed from: A */
    public Object f32311A = null;

    /* renamed from: B */
    public Object f32312B = null;

    /* renamed from: E */
    public State.Constraint f32315E = null;

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
    public static /* synthetic */ class C3688a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32348a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f32348a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32348a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32348a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32348a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32348a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32348a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32348a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32348a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32348a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32348a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32348a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32348a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32348a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32348a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32348a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32348a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32348a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32348a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.f32316F = Dimension.Fixed(obj);
        this.f32317G = Dimension.Fixed(obj);
        this.f32320J = new HashMap();
        this.f32321K = new HashMap();
        this.f32323b = state;
    }

    /* renamed from: a */
    public final void m58695a(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget m58692d = m58692d(obj);
        if (m58692d == null) {
            return;
        }
        int[] iArr = C3688a.f32348a;
        int i = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type).connect(m58692d.getAnchor(type), this.mMarginLeft, this.mMarginLeftGone, false);
                return;
            case 2:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(m58692d.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                return;
            case 3:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(m58692d.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                return;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type2).connect(m58692d.getAnchor(type2), this.mMarginRight, this.mMarginRightGone, false);
                return;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type3).connect(m58692d.getAnchor(type3), this.mMarginStart, this.mMarginStartGone, false);
                return;
            case 6:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(m58692d.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                return;
            case 7:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(m58692d.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                return;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type4).connect(m58692d.getAnchor(type4), this.mMarginEnd, this.mMarginEndGone, false);
                return;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.getAnchor(type5).connect(m58692d.getAnchor(type5), this.mMarginTop, this.mMarginTopGone, false);
                return;
            case 10:
                constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).connect(m58692d.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                return;
            case 11:
                constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(m58692d.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                return;
            case 12:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.getAnchor(type6).connect(m58692d.getAnchor(type6), this.mMarginBottom, this.mMarginBottomGone, false);
                return;
            case 13:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, m58692d, ConstraintAnchor.Type.BOTTOM, this.f32332k, this.f32333l);
                return;
            case 14:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, m58692d, ConstraintAnchor.Type.TOP, this.f32332k, this.f32333l);
                return;
            case 15:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.immediateConnect(type7, m58692d, type7, this.f32332k, this.f32333l);
                return;
            case 16:
                constraintWidget.connectCircularConstraint(m58692d, this.f32313C, (int) this.f32314D);
                return;
            default:
                return;
        }
    }

    public void addCustomColor(String str, int i) {
        this.f32320J.put(str, Integer.valueOf(i));
    }

    public void addCustomFloat(String str, float f) {
        if (this.f32321K == null) {
            this.f32321K = new HashMap();
        }
        this.f32321K.put(str, Float.valueOf(f));
    }

    public ConstraintReference alpha(float f) {
        this.f32342u = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.f32319I == null) {
            return;
        }
        Facade facade = this.f32325d;
        if (facade != null) {
            facade.apply();
        }
        this.f32316F.apply(this.f32323b, this.f32319I, 0);
        this.f32317G.apply(this.f32323b, this.f32319I, 1);
        m58694b();
        m58695a(this.f32319I, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        m58695a(this.f32319I, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        m58695a(this.f32319I, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        m58695a(this.f32319I, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        m58695a(this.f32319I, this.mStartToStart, State.Constraint.START_TO_START);
        m58695a(this.f32319I, this.mStartToEnd, State.Constraint.START_TO_END);
        m58695a(this.f32319I, this.mEndToStart, State.Constraint.END_TO_START);
        m58695a(this.f32319I, this.mEndToEnd, State.Constraint.END_TO_END);
        m58695a(this.f32319I, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        m58695a(this.f32319I, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        m58695a(this.f32319I, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        m58695a(this.f32319I, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        m58695a(this.f32319I, this.f32346y, State.Constraint.BASELINE_TO_BASELINE);
        m58695a(this.f32319I, this.f32347z, State.Constraint.BASELINE_TO_TOP);
        m58695a(this.f32319I, this.f32311A, State.Constraint.BASELINE_TO_BOTTOM);
        m58695a(this.f32319I, this.f32312B, State.Constraint.CIRCULAR_CONSTRAINT);
        int i = this.f32326e;
        if (i != 0) {
            this.f32319I.setHorizontalChainStyle(i);
        }
        int i2 = this.f32327f;
        if (i2 != 0) {
            this.f32319I.setVerticalChainStyle(i2);
        }
        float f = this.f32328g;
        if (f != -1.0f) {
            this.f32319I.setHorizontalWeight(f);
        }
        float f2 = this.f32329h;
        if (f2 != -1.0f) {
            this.f32319I.setVerticalWeight(f2);
        }
        this.f32319I.setHorizontalBiasPercent(this.f32330i);
        this.f32319I.setVerticalBiasPercent(this.f32331j);
        ConstraintWidget constraintWidget = this.f32319I;
        WidgetFrame widgetFrame = constraintWidget.frame;
        widgetFrame.pivotX = this.f32334m;
        widgetFrame.pivotY = this.f32335n;
        widgetFrame.rotationX = this.f32336o;
        widgetFrame.rotationY = this.f32337p;
        widgetFrame.rotationZ = this.f32338q;
        widgetFrame.translationX = this.f32339r;
        widgetFrame.translationY = this.f32340s;
        widgetFrame.translationZ = this.f32341t;
        widgetFrame.scaleX = this.f32343v;
        widgetFrame.scaleY = this.f32344w;
        widgetFrame.alpha = this.f32342u;
        int i3 = this.f32345x;
        widgetFrame.visibility = i3;
        constraintWidget.setVisibility(i3);
        HashMap hashMap = this.f32320J;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f32319I.frame.setCustomAttribute(str, TypedValues.Custom.TYPE_COLOR, ((Integer) this.f32320J.get(str)).intValue());
            }
        }
        HashMap hashMap2 = this.f32321K;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f32319I.frame.setCustomAttribute(str2, TypedValues.Custom.TYPE_FLOAT, ((Float) this.f32321K.get(str2)).floatValue());
            }
        }
    }

    /* renamed from: b */
    public final void m58694b() {
        this.mLeftToLeft = m58693c(this.mLeftToLeft);
        this.mLeftToRight = m58693c(this.mLeftToRight);
        this.mRightToLeft = m58693c(this.mRightToLeft);
        this.mRightToRight = m58693c(this.mRightToRight);
        this.mStartToStart = m58693c(this.mStartToStart);
        this.mStartToEnd = m58693c(this.mStartToEnd);
        this.mEndToStart = m58693c(this.mEndToStart);
        this.mEndToEnd = m58693c(this.mEndToEnd);
        this.mTopToTop = m58693c(this.mTopToTop);
        this.mTopToBottom = m58693c(this.mTopToBottom);
        this.mBottomToTop = m58693c(this.mBottomToTop);
        this.mBottomToBottom = m58693c(this.mBottomToBottom);
        this.f32346y = m58693c(this.f32346y);
        this.f32347z = m58693c(this.f32347z);
        this.f32311A = m58693c(this.f32311A);
    }

    public ConstraintReference baseline() {
        this.f32315E = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.f32315E = State.Constraint.BASELINE_TO_BASELINE;
        this.f32346y = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        this.f32315E = State.Constraint.BASELINE_TO_BOTTOM;
        this.f32311A = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        this.f32315E = State.Constraint.BASELINE_TO_TOP;
        this.f32347z = obj;
        return this;
    }

    public ConstraintReference bias(float f) {
        State.Constraint constraint = this.f32315E;
        if (constraint == null) {
            return this;
        }
        int i = C3688a.f32348a[constraint.ordinal()];
        if (i != 17) {
            if (i != 18) {
                switch (i) {
                }
                return this;
            }
            this.f32331j = f;
            return this;
        }
        this.f32330i = f;
        return this;
    }

    public ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.f32315E = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.f32315E = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.f32315E = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.f32315E = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    /* renamed from: c */
    public final Object m58693c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof ConstraintReference)) {
            return this.f32323b.m58689b(obj);
        }
        return obj;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object m58693c = m58693c(obj);
        this.mStartToStart = m58693c;
        this.mEndToEnd = m58693c;
        this.f32315E = State.Constraint.CENTER_HORIZONTALLY;
        this.f32330i = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object m58693c = m58693c(obj);
        this.mTopToTop = m58693c;
        this.mBottomToBottom = m58693c;
        this.f32315E = State.Constraint.CENTER_VERTICALLY;
        this.f32331j = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f, float f2) {
        this.f32312B = m58693c(obj);
        this.f32313C = f;
        this.f32314D = f2;
        this.f32315E = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference clear() {
        State.Constraint constraint = this.f32315E;
        if (constraint != null) {
            switch (C3688a.f32348a[constraint.ordinal()]) {
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
                    this.f32346y = null;
                    break;
                case 16:
                    this.f32312B = null;
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
            this.f32346y = null;
            this.f32312B = null;
            this.f32330i = 0.5f;
            this.f32331j = 0.5f;
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
        return new ConstraintWidget(getWidth().m58691a(), getHeight().m58691a());
    }

    /* renamed from: d */
    public final ConstraintWidget m58692d(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.f32315E = State.Constraint.END_TO_START;
        } else {
            this.f32315E = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.f32315E = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.f32315E = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        return this.f32342u;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.f32319I == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.f32319I = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.f32318H);
        }
        return this.f32319I;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return this.f32325d;
    }

    public Dimension getHeight() {
        return this.f32317G;
    }

    public int getHorizontalChainStyle() {
        return this.f32326e;
    }

    public float getHorizontalChainWeight() {
        return this.f32328g;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f32322a;
    }

    public float getPivotX() {
        return this.f32334m;
    }

    public float getPivotY() {
        return this.f32335n;
    }

    public float getRotationX() {
        return this.f32336o;
    }

    public float getRotationY() {
        return this.f32337p;
    }

    public float getRotationZ() {
        return this.f32338q;
    }

    public float getScaleX() {
        return this.f32343v;
    }

    public float getScaleY() {
        return this.f32344w;
    }

    public String getTag() {
        return this.f32324c;
    }

    public float getTranslationX() {
        return this.f32339r;
    }

    public float getTranslationY() {
        return this.f32340s;
    }

    public float getTranslationZ() {
        return this.f32341t;
    }

    public int getVerticalChainStyle(int i) {
        return this.f32327f;
    }

    public float getVerticalChainWeight() {
        return this.f32329h;
    }

    public Object getView() {
        return this.f32318H;
    }

    public Dimension getWidth() {
        return this.f32316F;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f) {
        this.f32330i = f;
        return this;
    }

    public ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.f32315E = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.f32315E = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.f32315E = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.f32315E = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.f32323b.convertDimension(obj));
    }

    public ConstraintReference marginGone(Object obj) {
        return marginGone(this.f32323b.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f) {
        this.f32334m = f;
        return this;
    }

    public ConstraintReference pivotY(float f) {
        this.f32335n = f;
        return this;
    }

    public ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.f32315E = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.f32315E = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.f32315E = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.f32315E = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f) {
        this.f32336o = f;
        return this;
    }

    public ConstraintReference rotationY(float f) {
        this.f32337p = f;
        return this;
    }

    public ConstraintReference rotationZ(float f) {
        this.f32338q = f;
        return this;
    }

    public ConstraintReference scaleX(float f) {
        this.f32343v = f;
        return this;
    }

    public ConstraintReference scaleY(float f) {
        this.f32344w = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.f32319I = constraintWidget;
        constraintWidget.setCompanionWidget(this.f32318H);
    }

    public void setFacade(Facade facade) {
        this.f32325d = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.f32317G = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i) {
        this.f32326e = i;
    }

    public void setHorizontalChainWeight(float f) {
        this.f32328g = f;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.f32322a = obj;
    }

    public void setTag(String str) {
        this.f32324c = str;
    }

    public void setVerticalChainStyle(int i) {
        this.f32327f = i;
    }

    public void setVerticalChainWeight(float f) {
        this.f32329h = f;
    }

    public void setView(Object obj) {
        this.f32318H = obj;
        ConstraintWidget constraintWidget = this.f32319I;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.f32316F = dimension;
        return this;
    }

    public ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.f32315E = State.Constraint.START_TO_START;
        } else {
            this.f32315E = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.f32315E = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.f32315E = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.f32315E = State.Constraint.TOP_TO_TOP;
        } else {
            this.f32315E = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.f32315E = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.f32315E = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f) {
        this.f32339r = f;
        return this;
    }

    public ConstraintReference translationY(float f) {
        this.f32340s = f;
        return this;
    }

    public ConstraintReference translationZ(float f) {
        this.f32341t = f;
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
        this.f32331j = f;
        return this;
    }

    public ConstraintReference visibility(int i) {
        this.f32345x = i;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }

    public ConstraintReference margin(int i) {
        State.Constraint constraint = this.f32315E;
        if (constraint != null) {
            switch (C3688a.f32348a[constraint.ordinal()]) {
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
                    this.f32332k = i;
                    break;
                case 16:
                    this.f32314D = i;
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
        State.Constraint constraint = this.f32315E;
        if (constraint != null) {
            switch (C3688a.f32348a[constraint.ordinal()]) {
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
                    this.f32333l = i;
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
