package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;

    /* renamed from: A */
    public int f32420A;

    /* renamed from: B */
    public int f32421B;

    /* renamed from: C */
    public float f32422C;

    /* renamed from: D */
    public float f32423D;

    /* renamed from: E */
    public Object f32424E;

    /* renamed from: F */
    public int f32425F;

    /* renamed from: G */
    public int f32426G;

    /* renamed from: H */
    public boolean f32427H;

    /* renamed from: I */
    public String f32428I;

    /* renamed from: J */
    public String f32429J;

    /* renamed from: K */
    public int f32430K;

    /* renamed from: L */
    public int f32431L;

    /* renamed from: M */
    public int f32432M;

    /* renamed from: N */
    public int f32433N;

    /* renamed from: O */
    public boolean f32434O;

    /* renamed from: P */
    public boolean f32435P;

    /* renamed from: Q */
    public boolean f32436Q;

    /* renamed from: R */
    public boolean f32437R;

    /* renamed from: S */
    public boolean f32438S;

    /* renamed from: T */
    public boolean f32439T;

    /* renamed from: U */
    public boolean f32440U;

    /* renamed from: V */
    public int f32441V;

    /* renamed from: W */
    public int f32442W;

    /* renamed from: X */
    public boolean f32443X;

    /* renamed from: Y */
    public boolean f32444Y;

    /* renamed from: Z */
    public ConstraintWidget f32445Z;

    /* renamed from: a */
    public boolean f32446a;

    /* renamed from: a0 */
    public ConstraintWidget f32447a0;

    /* renamed from: b */
    public boolean f32448b;

    /* renamed from: c */
    public boolean f32449c;

    /* renamed from: d */
    public boolean f32450d;

    /* renamed from: e */
    public int f32451e;

    /* renamed from: f */
    public int f32452f;
    public WidgetFrame frame;

    /* renamed from: g */
    public boolean f32453g;

    /* renamed from: h */
    public boolean f32454h;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;

    /* renamed from: i */
    public boolean f32455i;
    public boolean[] isTerminalWidget;

    /* renamed from: j */
    public boolean f32456j;

    /* renamed from: k */
    public int f32457k;

    /* renamed from: l */
    public int f32458l;

    /* renamed from: m */
    public float f32459m;
    protected ArrayList<ConstraintAnchor> mAnchors;
    public ConstraintAnchor mBaseline;
    public ConstraintAnchor mBottom;
    public ConstraintAnchor mCenter;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    public int mHorizontalResolution;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    public ConstraintAnchor mTop;
    public int mVerticalResolution;
    public float[] mWeight;

    /* renamed from: mX */
    protected int f32460mX;

    /* renamed from: mY */
    protected int f32461mY;
    public boolean measured;

    /* renamed from: n */
    public int[] f32462n;

    /* renamed from: o */
    public float f32463o;

    /* renamed from: p */
    public boolean f32464p;

    /* renamed from: q */
    public boolean f32465q;

    /* renamed from: r */
    public boolean f32466r;
    public WidgetRun[] run;

    /* renamed from: s */
    public int f32467s;
    public String stringId;

    /* renamed from: t */
    public int f32468t;

    /* renamed from: u */
    public ConstraintAnchor f32469u;

    /* renamed from: v */
    public ConstraintAnchor f32470v;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;

    /* renamed from: w */
    public boolean[] f32471w;

    /* renamed from: x */
    public int f32472x;

    /* renamed from: y */
    public int f32473y;

    /* renamed from: z */
    public int f32474z;

    /* loaded from: classes2.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3696a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32475a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f32476b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f32476b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32476b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32476b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32476b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f32475a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32475a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32475a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32475a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32475a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32475a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32475a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32475a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32475a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f32446a = false;
        this.f32448b = true;
        this.f32449c = false;
        this.f32450d = true;
        this.f32451e = -1;
        this.f32452f = -1;
        this.frame = new WidgetFrame(this);
        this.f32453g = false;
        this.f32454h = false;
        this.f32455i = false;
        this.f32456j = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.f32457k = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f32458l = -1;
        this.f32459m = 1.0f;
        this.f32462n = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f32463o = 0.0f;
        this.f32464p = false;
        this.f32466r = false;
        this.f32467s = 0;
        this.f32468t = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f32469u = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f32470v = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.f32471w = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.f32472x = 0;
        this.f32473y = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f32460mX = 0;
        this.f32461mY = 0;
        this.f32474z = 0;
        this.f32420A = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f32421B = 0;
        float f = DEFAULT_BIAS;
        this.f32422C = f;
        this.f32423D = f;
        this.f32425F = 0;
        this.f32426G = 0;
        this.f32427H = false;
        this.f32428I = null;
        this.f32429J = null;
        this.f32440U = false;
        this.f32441V = 0;
        this.f32442W = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.f32445Z = null;
        this.f32447a0 = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        m58656a();
    }

    /* renamed from: a */
    public final void m58656a() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.f32469u);
        this.mAnchors.add(this.f32470v);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.m58596a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    public boolean allowedInBarrier() {
        if (this.f32426G != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m58655b() {
        if (!(this instanceof VirtualLayout) && !(this instanceof Guideline)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:374:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m58654c(androidx.constraintlayout.core.LinearSystem r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.SolverVariable r38, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, androidx.constraintlayout.core.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.m58654c(androidx.constraintlayout.core.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i, 0);
        this.f32463o = f;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.f32458l = constraintWidget.f32458l;
        this.f32459m = constraintWidget.f32459m;
        int[] iArr3 = constraintWidget.f32462n;
        this.f32462n = Arrays.copyOf(iArr3, iArr3.length);
        this.f32463o = constraintWidget.f32463o;
        this.f32464p = constraintWidget.f32464p;
        this.f32465q = constraintWidget.f32465q;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.f32469u.reset();
        this.f32470v.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        ConstraintWidget constraintWidget4 = null;
        if (this.mParent == null) {
            constraintWidget2 = null;
        } else {
            constraintWidget2 = hashMap.get(constraintWidget.mParent);
        }
        this.mParent = constraintWidget2;
        this.f32472x = constraintWidget.f32472x;
        this.f32473y = constraintWidget.f32473y;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.f32460mX = constraintWidget.f32460mX;
        this.f32461mY = constraintWidget.f32461mY;
        this.f32474z = constraintWidget.f32474z;
        this.f32420A = constraintWidget.f32420A;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.f32421B = constraintWidget.f32421B;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.f32422C = constraintWidget.f32422C;
        this.f32423D = constraintWidget.f32423D;
        this.f32424E = constraintWidget.f32424E;
        this.f32425F = constraintWidget.f32425F;
        this.f32426G = constraintWidget.f32426G;
        this.f32427H = constraintWidget.f32427H;
        this.f32428I = constraintWidget.f32428I;
        this.f32429J = constraintWidget.f32429J;
        this.f32430K = constraintWidget.f32430K;
        this.f32431L = constraintWidget.f32431L;
        this.f32432M = constraintWidget.f32432M;
        this.f32433N = constraintWidget.f32433N;
        this.f32434O = constraintWidget.f32434O;
        this.f32435P = constraintWidget.f32435P;
        this.f32436Q = constraintWidget.f32436Q;
        this.f32437R = constraintWidget.f32437R;
        this.f32438S = constraintWidget.f32438S;
        this.f32439T = constraintWidget.f32439T;
        this.f32441V = constraintWidget.f32441V;
        this.f32442W = constraintWidget.f32442W;
        this.f32443X = constraintWidget.f32443X;
        this.f32444Y = constraintWidget.f32444Y;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget5 = constraintWidget.f32445Z;
        if (constraintWidget5 == null) {
            constraintWidget3 = null;
        } else {
            constraintWidget3 = hashMap.get(constraintWidget5);
        }
        this.f32445Z = constraintWidget3;
        ConstraintWidget constraintWidget6 = constraintWidget.f32447a0;
        if (constraintWidget6 != null) {
            constraintWidget4 = hashMap.get(constraintWidget6);
        }
        this.f32447a0 = constraintWidget4;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.f32421B > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    /* renamed from: d */
    public final void m58653d(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        m58648i(sb, "      size", i, 0);
        m58648i(sb, "      min", i2, 0);
        m58648i(sb, "      max", i3, Integer.MAX_VALUE);
        m58648i(sb, "      matchMin", i5, 0);
        m58648i(sb, "      matchDef", i6, 0);
        m58649h(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: e */
    public final void m58652e(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append(OperatorName.SHOW_TEXT_LINE);
        if (constraintAnchor.f32417d != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(",");
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.f32417d != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f32417d);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void ensureMeasureRequested() {
        this.f32448b = true;
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    /* renamed from: f */
    public final boolean m58651f(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 != null && constraintAnchor4.mTarget != constraintAnchor3 && (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m58650g(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(constraintAnchor.f32417d);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C3696a.f32475a[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.f32469u;
            case 8:
                return this.f32470v;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.f32421B;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.f32422C;
        }
        if (i == 1) {
            return this.f32423D;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.f32473y;
    }

    public Object getCompanionWidget() {
        return this.f32424E;
    }

    public int getContainerItemSkip() {
        return this.f32425F;
    }

    public String getDebugName() {
        return this.f32428I;
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.f32464p;
    }

    public int getHeight() {
        if (this.f32426G == 8) {
            return 0;
        }
        return this.f32473y;
    }

    public float getHorizontalBiasPercent() {
        return this.f32422C;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        ConstraintAnchor target;
        ConstraintWidget owner;
        ConstraintAnchor target2;
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            if (anchor == null) {
                target = null;
            } else {
                target = anchor.getTarget();
            }
            if (target == null) {
                owner = null;
            } else {
                owner = target.getOwner();
            }
            if (owner == getParent()) {
                return constraintWidget;
            }
            if (owner == null) {
                target2 = null;
            } else {
                target2 = owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            }
            if (target2 != null && target2.getOwner() != constraintWidget) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget = owner;
            }
        }
        return constraintWidget2;
    }

    public int getHorizontalChainStyle() {
        return this.f32441V;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        int i;
        ConstraintAnchor constraintAnchor = this.mLeft;
        if (constraintAnchor != null) {
            i = constraintAnchor.mMargin;
        } else {
            i = 0;
        }
        ConstraintAnchor constraintAnchor2 = this.mRight;
        if (constraintAnchor2 != null) {
            return i + constraintAnchor2.mMargin;
        }
        return i;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.f32467s;
    }

    public int getLastVerticalMeasureSpec() {
        return this.f32468t;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.f32462n[1];
    }

    public int getMaxWidth() {
        return this.f32462n[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.mRight;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
            if (constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3) {
                return constraintAnchor4.mOwner;
            }
            return null;
        } else if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
            return constraintAnchor2.mOwner;
        } else {
            return null;
        }
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.f32473y;
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                i = Math.max(this.mMatchConstraintMinHeight, i2);
            } else {
                i = this.mMatchConstraintMinHeight;
                if (i > 0) {
                    this.f32473y = i;
                } else {
                    i = 0;
                }
            }
            int i3 = this.mMatchConstraintMaxHeight;
            if (i3 > 0 && i3 < i) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.f32472x;
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultWidth == 1) {
                i = Math.max(this.mMatchConstraintMinWidth, i2);
            } else {
                i = this.mMatchConstraintMinWidth;
                if (i > 0) {
                    this.f32472x = i;
                } else {
                    i = 0;
                }
            }
            int i3 = this.mMatchConstraintMaxWidth;
            if (i3 > 0 && i3 < i) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.mLeft;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
            if (constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3) {
                return constraintAnchor4.mOwner;
            }
            return null;
        } else if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
            return constraintAnchor2.mOwner;
        } else {
            return null;
        }
    }

    public int getRight() {
        return getX() + this.f32472x;
    }

    public int getRootX() {
        return this.f32460mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.f32461mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void getSceneString(StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f32472x);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f32473y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f32460mX);
        sb.append("\n");
        sb.append("    actualTop:" + this.f32461mY);
        sb.append("\n");
        m58652e(sb, "left", this.mLeft);
        m58652e(sb, "top", this.mTop);
        m58652e(sb, "right", this.mRight);
        m58652e(sb, "bottom", this.mBottom);
        m58652e(sb, "baseline", this.mBaseline);
        m58652e(sb, "centerX", this.f32469u);
        m58652e(sb, "centerY", this.f32470v);
        m58653d(sb, "    width", this.f32472x, this.mMinWidth, this.f32462n[0], this.f32451e, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        m58653d(sb, "    height", this.f32473y, this.mMinHeight, this.f32462n[1], this.f32452f, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        m58646k(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        m58649h(sb, "    horizontalBias", this.f32422C, DEFAULT_BIAS);
        m58649h(sb, "    verticalBias", this.f32423D, DEFAULT_BIAS);
        m58648i(sb, "    horizontalChainStyle", this.f32441V, 0);
        m58648i(sb, "    verticalChainStyle", this.f32442W, 0);
        sb.append("  }");
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.f32429J;
    }

    public float getVerticalBiasPercent() {
        return this.f32423D;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        ConstraintAnchor target;
        ConstraintWidget owner;
        ConstraintAnchor target2;
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            if (anchor == null) {
                target = null;
            } else {
                target = anchor.getTarget();
            }
            if (target == null) {
                owner = null;
            } else {
                owner = target.getOwner();
            }
            if (owner == getParent()) {
                return constraintWidget;
            }
            if (owner == null) {
                target2 = null;
            } else {
                target2 = owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            }
            if (target2 != null && target2.getOwner() != constraintWidget) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget = owner;
            }
        }
        return constraintWidget2;
    }

    public int getVerticalChainStyle() {
        return this.f32442W;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i;
        if (this.mLeft != null) {
            i = this.mTop.mMargin;
        } else {
            i = 0;
        }
        if (this.mRight != null) {
            return i + this.mBottom.mMargin;
        }
        return i;
    }

    public int getVisibility() {
        return this.f32426G;
    }

    public int getWidth() {
        if (this.f32426G == 8) {
            return 0;
        }
        return this.f32472x;
    }

    public int getWrapBehaviorInParent() {
        return this.f32457k;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).f32480e0 + this.f32460mX;
        }
        return this.f32460mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).f32481f0 + this.f32461mY;
        }
        return this.f32461mY;
    }

    /* renamed from: h */
    public final void m58649h(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public boolean hasBaseline() {
        return this.f32464p;
    }

    public boolean hasDanglingDimension(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.mLeft.mTarget != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.mRight.mTarget != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.mTop.mTarget != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.mBottom.mTarget != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.mBaseline.mTarget != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 >= 2) {
            return false;
        }
        return true;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        if (this.f32451e == -1 && this.f32452f == -1) {
            return false;
        }
        return true;
    }

    public boolean hasResolvedTargets(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.mLeft.mTarget;
            if (constraintAnchor3 != null && constraintAnchor3.hasFinalValue() && (constraintAnchor2 = this.mRight.mTarget) != null && constraintAnchor2.hasFinalValue() && (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i2) {
                return true;
            }
            return false;
        }
        ConstraintAnchor constraintAnchor4 = this.mTop.mTarget;
        if (constraintAnchor4 != null && constraintAnchor4.hasFinalValue() && (constraintAnchor = this.mBottom.mTarget) != null && constraintAnchor.hasFinalValue() && (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i2) {
            return true;
        }
        return false;
        return false;
    }

    /* renamed from: i */
    public final void m58648i(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public boolean isAnimated() {
        return this.f32427H;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.f32455i;
    }

    public boolean isInBarrier(int i) {
        return this.f32471w[i];
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null || constraintAnchor2.mTarget != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.mRight;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
            if (constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isInPlaceholder() {
        return this.f32465q;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null || constraintAnchor2.mTarget != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.mBottom;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
            if (constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isInVirtualLayout() {
        return this.f32466r;
    }

    public boolean isMeasureRequested() {
        if (this.f32448b && this.f32426G != 8) {
            return true;
        }
        return false;
    }

    public boolean isResolvedHorizontally() {
        if (!this.f32453g && (!this.mLeft.hasFinalValue() || !this.mRight.hasFinalValue())) {
            return false;
        }
        return true;
    }

    public boolean isResolvedVertically() {
        if (!this.f32454h && (!this.mTop.hasFinalValue() || !this.mBottom.hasFinalValue())) {
            return false;
        }
        return true;
    }

    public boolean isRoot() {
        if (this.mParent == null) {
            return true;
        }
        return false;
    }

    public boolean isSpreadHeight() {
        if (this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public boolean isSpreadWidth() {
        if (this.mMatchConstraintDefaultWidth != 0 || this.mDimensionRatio != 0.0f || this.mMatchConstraintMinWidth != 0 || this.mMatchConstraintMaxWidth != 0 || this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        return true;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.f32456j;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    /* renamed from: j */
    public final void m58647j(StringBuilder sb, ConstraintAnchor constraintAnchor, float f) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(f);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    /* renamed from: k */
    public final void m58646k(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    /* renamed from: l */
    public final void m58645l(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        m58648i(sb, "size", i, Integer.MIN_VALUE);
        m58648i(sb, "min", i2, 0);
        m58648i(sb, "max", i3, Integer.MAX_VALUE);
        m58648i(sb, "matchMin", i5, 0);
        m58648i(sb, "matchDef", i6, 0);
        m58648i(sb, "matchPercent", i6, 1);
        sb.append("},\n");
    }

    public void markHorizontalSolvingPassDone() {
        this.f32455i = true;
    }

    public void markVerticalSolvingPassDone() {
        this.f32456j = true;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c;
        if (i == 0) {
            c = 1;
        } else {
            c = 0;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour != dimensionBehaviour3 || dimensionBehaviour2 != dimensionBehaviour3) {
            return false;
        }
        return true;
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour != dimensionBehaviour2 || dimensionBehaviourArr[1] != dimensionBehaviour2) {
            return false;
        }
        return true;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.f32469u.reset();
        this.f32470v.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.f32463o = 0.0f;
        this.f32472x = 0;
        this.f32473y = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f32460mX = 0;
        this.f32461mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f32421B = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.f32422C = f;
        this.f32423D = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f32424E = null;
        this.f32425F = 0;
        this.f32426G = 0;
        this.f32429J = null;
        this.f32438S = false;
        this.f32439T = false;
        this.f32441V = 0;
        this.f32442W = 0;
        this.f32443X = false;
        this.f32444Y = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.f32462n;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.f32446a = false;
        this.f32458l = -1;
        this.f32459m = 1.0f;
        this.f32440U = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.f32466r = false;
        boolean[] zArr2 = this.f32471w;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f32448b = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f32451e = -1;
        this.f32452f = -1;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f32422C = 0.5f;
            this.f32423D = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.f32422C = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f32423D = 0.5f;
        } else if (constraintAnchor != anchor && constraintAnchor != anchor2) {
            if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor5.reset();
            }
        } else if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public void resetFinalResolution() {
        this.f32453g = false;
        this.f32454h = false;
        this.f32455i = false;
        this.f32456j = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.f32469u.resetSolverVariable(cache);
        this.f32470v.resetSolverVariable(cache);
    }

    public void resetSolvingPassFlag() {
        this.f32455i = false;
        this.f32456j = false;
    }

    public StringBuilder serialize(StringBuilder sb) {
        sb.append("{\n");
        m58650g(sb, "left", this.mLeft);
        m58650g(sb, "top", this.mTop);
        m58650g(sb, "right", this.mRight);
        m58650g(sb, "bottom", this.mBottom);
        m58650g(sb, "baseline", this.mBaseline);
        m58650g(sb, "centerX", this.f32469u);
        m58650g(sb, "centerY", this.f32470v);
        m58647j(sb, this.mCenter, this.f32463o);
        m58645l(sb, "width", this.f32472x, this.mMinWidth, this.f32462n[0], this.f32451e, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        m58645l(sb, "height", this.f32473y, this.mMinHeight, this.f32462n[1], this.f32452f, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        m58646k(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        m58649h(sb, "horizontalBias", this.f32422C, DEFAULT_BIAS);
        m58649h(sb, "verticalBias", this.f32423D, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public void setAnimated(boolean z) {
        this.f32427H = z;
    }

    public void setBaselineDistance(int i) {
        boolean z;
        this.f32421B = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f32464p = z;
    }

    public void setCompanionWidget(Object obj) {
        this.f32424E = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.f32425F = i;
        } else {
            this.f32425F = 0;
        }
    }

    public void setDebugName(String str) {
        this.f32428I = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.f32428I = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        createObjectVariable5.setName(str + ".baseline");
    }

    public void setDimension(int i, int i2) {
        this.f32472x = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.f32472x = i3;
        }
        this.f32473y = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.f32473y = i4;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0087 -> B:41:0x0088). Please submit an issue!!! */
    public void setDimensionRatio(String str) {
        float f;
        int i = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i2, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i3 == 1) {
                            f = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f = 0.0f;
            } else {
                String substring4 = str.substring(i2);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                f = 0.0f;
            }
            i = (f > i ? 1 : (f == i ? 0 : -1));
            if (i > 0) {
                this.mDimensionRatio = f;
                this.mDimensionRatioSide = i3;
                return;
            }
            return;
        }
        this.mDimensionRatio = 0.0f;
    }

    public void setFinalBaseline(int i) {
        if (!this.f32464p) {
            return;
        }
        int i2 = i - this.f32421B;
        int i3 = this.f32473y + i2;
        this.f32461mY = i2;
        this.mTop.setFinalValue(i2);
        this.mBottom.setFinalValue(i3);
        this.mBaseline.setFinalValue(i);
        this.f32454h = true;
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.f32453g = true;
            this.f32454h = false;
        } else if (i6 == 1) {
            this.f32453g = false;
            this.f32454h = true;
        } else if (i6 == 2) {
            this.f32453g = true;
            this.f32454h = true;
        } else {
            this.f32453g = false;
            this.f32454h = false;
        }
    }

    public void setFinalHorizontal(int i, int i2) {
        if (this.f32453g) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.f32460mX = i;
        this.f32472x = i2 - i;
        this.f32453g = true;
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.f32460mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.f32461mY = i;
    }

    public void setFinalVertical(int i, int i2) {
        if (this.f32454h) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.f32461mY = i;
        this.f32473y = i2 - i;
        if (this.f32464p) {
            this.mBaseline.setFinalValue(i + this.f32421B);
        }
        this.f32454h = true;
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f32460mX = i;
        this.f32461mY = i2;
        if (this.f32426G == 8) {
            this.f32472x = 0;
            this.f32473y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.f32472x)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.f32473y)) {
            i8 = i5;
        }
        this.f32472x = i7;
        this.f32473y = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.f32473y = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.f32472x = i10;
        }
        int i11 = this.mMatchConstraintMaxWidth;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f32472x = Math.min(this.f32472x, i11);
        }
        int i12 = this.mMatchConstraintMaxHeight;
        if (i12 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f32473y = Math.min(this.f32473y, i12);
        }
        int i13 = this.f32472x;
        if (i7 != i13) {
            this.f32451e = i13;
        }
        int i14 = this.f32473y;
        if (i8 != i14) {
            this.f32452f = i14;
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = C3696a.f32475a[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            this.mBaseline.f32417d = i;
                            return;
                        }
                        return;
                    }
                    this.mBottom.f32417d = i;
                    return;
                }
                this.mRight.f32417d = i;
                return;
            }
            this.mTop.f32417d = i;
            return;
        }
        this.mLeft.f32417d = i;
    }

    public void setHasBaseline(boolean z) {
        this.f32464p = z;
    }

    public void setHeight(int i) {
        this.f32473y = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.f32473y = i2;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.f32422C = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.f32441V = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.f32460mX = i;
        int i3 = i2 - i;
        this.f32472x = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.f32472x = i4;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setInBarrier(int i, boolean z) {
        this.f32471w[i] = z;
    }

    public void setInPlaceholder(boolean z) {
        this.f32465q = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.f32466r = z;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.f32467s = i;
        this.f32468t = i2;
        setMeasureRequested(false);
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setMaxHeight(int i) {
        this.f32462n[1] = i;
    }

    public void setMaxWidth(int i) {
        this.f32462n[0] = i;
    }

    public void setMeasureRequested(boolean z) {
        this.f32448b = z;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.f32460mX = i;
        this.f32461mY = i2;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setType(String str) {
        this.f32429J = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.f32423D = f;
    }

    public void setVerticalChainStyle(int i) {
        this.f32442W = i;
    }

    public void setVerticalDimension(int i, int i2) {
        this.f32461mY = i;
        int i3 = i2 - i;
        this.f32473y = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.f32473y = i4;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i) {
        this.f32426G = i;
    }

    public void setWidth(int i) {
        this.f32472x = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.f32472x = i2;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i >= 0 && i <= 3) {
            this.f32457k = i;
        }
    }

    public void setX(int i) {
        this.f32460mX = i;
    }

    public void setY(int i) {
        this.f32461mY = i;
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f32458l == -1) {
            if (z3 && !z4) {
                this.f32458l = 0;
            } else if (!z3 && z4) {
                this.f32458l = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.f32459m = 1.0f / this.f32459m;
                }
            }
        }
        if (this.f32458l == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.f32458l = 1;
        } else if (this.f32458l == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.f32458l = 0;
        }
        if (this.f32458l == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.f32458l = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.f32459m = 1.0f / this.f32459m;
                this.f32458l = 1;
            }
        }
        if (this.f32458l == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.f32458l = 0;
            } else if (i == 0 && this.mMatchConstraintMinHeight > 0) {
                this.f32459m = 1.0f / this.f32459m;
                this.f32458l = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f32429J == null) {
            str = "";
        } else {
            str = "type: " + this.f32429J + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        }
        sb.append(str);
        if (this.f32428I != null) {
            str2 = "id: " + this.f32428I + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f32460mX);
        sb.append(", ");
        sb.append(this.f32461mY);
        sb.append(") - (");
        sb.append(this.f32472x);
        sb.append(" x ");
        sb.append(this.f32473y);
        sb.append(")");
        return sb.toString();
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        int i3 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        int i4 = verticalWidgetRun.start.value;
        int i5 = horizontalWidgetRun.end.value;
        int i6 = verticalWidgetRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (isResolved) {
            this.f32460mX = i3;
        }
        if (isResolved2) {
            this.f32461mY = i4;
        }
        if (this.f32426G == 8) {
            this.f32472x = 0;
            this.f32473y = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f32472x)) {
                i8 = i2;
            }
            this.f32472x = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.f32472x = i10;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.f32473y)) {
                i9 = i;
            }
            this.f32473y = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.f32473y = i11;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor anchor = getAnchor(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor anchor2 = getAnchor(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor anchor3 = getAnchor(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor anchor4 = getAnchor(type9);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(type6, constraintWidget, type6, 0);
                    connect(type7, constraintWidget, type7, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(type8, constraintWidget, type8, 0);
                    connect(type9, constraintWidget, type9, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                } else if (z) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    getAnchor(type10).connect(constraintWidget.getAnchor(type10), 0);
                    return;
                } else if (z2) {
                    ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                    getAnchor(type11).connect(constraintWidget.getAnchor(type11), 0);
                    return;
                } else {
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(type13, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
            connect(type12, constraintWidget, type2, 0);
            connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(type4);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(type14).connect(anchor6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(type3).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(type15).connect(anchor8, 0);
        } else if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            getAnchor(type16).connect(constraintWidget.getAnchor(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            getAnchor(type17).connect(constraintWidget.getAnchor(type17), 0);
            getAnchor(type14).connect(constraintWidget.getAnchor(type2), 0);
        } else if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            getAnchor(type18).connect(constraintWidget.getAnchor(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            getAnchor(type19).connect(constraintWidget.getAnchor(type19), 0);
            getAnchor(type15).connect(constraintWidget.getAnchor(type2), 0);
        } else {
            ConstraintAnchor anchor9 = getAnchor(type);
            ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
            if (anchor9.isValidConnection(anchor10)) {
                ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
                if (type == type20) {
                    ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                    if (anchor11 != null) {
                        anchor11.reset();
                    }
                    if (anchor12 != null) {
                        anchor12.reset();
                    }
                } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                    if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor anchor13 = getAnchor(type5);
                        if (anchor13.getTarget() != anchor10) {
                            anchor13.reset();
                        }
                        ConstraintAnchor opposite = getAnchor(type).getOpposite();
                        ConstraintAnchor anchor14 = getAnchor(type14);
                        if (anchor14.isConnected()) {
                            opposite.reset();
                            anchor14.reset();
                        }
                    }
                } else {
                    ConstraintAnchor anchor15 = getAnchor(type20);
                    if (anchor15 != null) {
                        anchor15.reset();
                    }
                    ConstraintAnchor anchor16 = getAnchor(type5);
                    if (anchor16.getTarget() != anchor10) {
                        anchor16.reset();
                    }
                    ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor17 = getAnchor(type15);
                    if (anchor17.isConnected()) {
                        opposite2.reset();
                        anchor17.reset();
                    }
                }
                anchor9.connect(anchor10, i);
            }
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f32446a = false;
        this.f32448b = true;
        this.f32449c = false;
        this.f32450d = true;
        this.f32451e = -1;
        this.f32452f = -1;
        this.frame = new WidgetFrame(this);
        this.f32453g = false;
        this.f32454h = false;
        this.f32455i = false;
        this.f32456j = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.f32457k = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f32458l = -1;
        this.f32459m = 1.0f;
        this.f32462n = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f32463o = 0.0f;
        this.f32464p = false;
        this.f32466r = false;
        this.f32467s = 0;
        this.f32468t = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f32469u = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f32470v = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.f32471w = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.f32472x = 0;
        this.f32473y = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f32460mX = 0;
        this.f32461mY = 0;
        this.f32474z = 0;
        this.f32420A = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f32421B = 0;
        float f = DEFAULT_BIAS;
        this.f32422C = f;
        this.f32423D = f;
        this.f32425F = 0;
        this.f32426G = 0;
        this.f32427H = false;
        this.f32428I = null;
        this.f32429J = null;
        this.f32440U = false;
        this.f32441V = 0;
        this.f32442W = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.f32445Z = null;
        this.f32447a0 = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        m58656a();
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f32446a = false;
        this.f32448b = true;
        this.f32449c = false;
        this.f32450d = true;
        this.f32451e = -1;
        this.f32452f = -1;
        this.frame = new WidgetFrame(this);
        this.f32453g = false;
        this.f32454h = false;
        this.f32455i = false;
        this.f32456j = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.f32457k = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f32458l = -1;
        this.f32459m = 1.0f;
        this.f32462n = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f32463o = 0.0f;
        this.f32464p = false;
        this.f32466r = false;
        this.f32467s = 0;
        this.f32468t = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f32469u = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f32470v = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.f32471w = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f32474z = 0;
        this.f32420A = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f32421B = 0;
        float f = DEFAULT_BIAS;
        this.f32422C = f;
        this.f32423D = f;
        this.f32425F = 0;
        this.f32426G = 0;
        this.f32427H = false;
        this.f32428I = null;
        this.f32429J = null;
        this.f32440U = false;
        this.f32441V = 0;
        this.f32442W = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.f32445Z = null;
        this.f32447a0 = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.f32460mX = i;
        this.f32461mY = i2;
        this.f32472x = i3;
        this.f32473y = i4;
        m58656a();
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }
}
