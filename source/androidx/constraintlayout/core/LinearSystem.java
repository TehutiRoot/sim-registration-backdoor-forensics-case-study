package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;

    /* renamed from: o */
    public static int f31916o = 1000;
    public static Metrics sMetrics;

    /* renamed from: c */
    public InterfaceC3667a f31919c;

    /* renamed from: f */
    public ArrayRow[] f31922f;

    /* renamed from: k */
    public final Cache f31927k;

    /* renamed from: n */
    public InterfaceC3667a f31930n;
    public boolean hasSimpleDefinition = false;

    /* renamed from: a */
    public int f31917a = 0;

    /* renamed from: b */
    public HashMap f31918b = null;

    /* renamed from: d */
    public int f31920d = 32;

    /* renamed from: e */
    public int f31921e = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;

    /* renamed from: g */
    public boolean[] f31923g = new boolean[32];

    /* renamed from: h */
    public int f31924h = 1;

    /* renamed from: i */
    public int f31925i = 0;

    /* renamed from: j */
    public int f31926j = 32;

    /* renamed from: l */
    public SolverVariable[] f31928l = new SolverVariable[f31916o];

    /* renamed from: m */
    public int f31929m = 0;

    /* renamed from: androidx.constraintlayout.core.LinearSystem$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3667a {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(InterfaceC3667a interfaceC3667a);

        boolean isEmpty();
    }

    /* renamed from: androidx.constraintlayout.core.LinearSystem$b */
    /* loaded from: classes2.dex */
    public class C3668b extends ArrayRow {
        public C3668b(Cache cache) {
            LinearSystem.this = r1;
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.f31922f = null;
        this.f31922f = new ArrayRow[32];
        m58789j();
        Cache cache = new Cache();
        this.f31927k = cache;
        this.f31919c = new PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.f31930n = new C3668b(cache);
        } else {
            this.f31930n = new ArrayRow(cache);
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return linearSystem.createRow().m58807f(solverVariable, solverVariable2, f);
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    /* renamed from: a */
    public final SolverVariable m58798a(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f31927k.f31914c.acquire();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.setType(type, str);
        } else {
            solverVariable.reset();
            solverVariable.setType(type, str);
        }
        int i = this.f31929m;
        int i2 = f31916o;
        if (i >= i2) {
            int i3 = i2 * 2;
            f31916o = i3;
            this.f31928l = (SolverVariable[]) Arrays.copyOf(this.f31928l, i3);
        }
        SolverVariable[] solverVariableArr = this.f31928l;
        int i4 = this.f31929m;
        this.f31929m = i4 + 1;
        solverVariableArr[i4] = solverVariable;
        return solverVariable;
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable createObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow createRow = createRow();
        double d = f;
        double d2 = i;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (Math.sin(d) * d2));
        addConstraint(createRow);
        ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, createObjectVariable7, (float) (Math.cos(d) * d2));
        addConstraint(createRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        ArrayRow createRow = createRow();
        createRow.m58809d(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            createRow.addError(this, i3);
        }
        addConstraint(createRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addConstraint(androidx.constraintlayout.core.ArrayRow r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.f31911e
            if (r3 == 0) goto L17
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L17:
            int r0 = r7.f31925i
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f31926j
            if (r0 >= r4) goto L26
            int r0 = r7.f31924h
            int r0 = r0 + r3
            int r4 = r7.f31921e
            if (r0 < r4) goto L29
        L26:
            r7.m58792g()
        L29:
            boolean r0 = r8.f31911e
            r4 = 0
            if (r0 != 0) goto La1
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.m58806g()
            boolean r0 = r8.m58811b(r7)
            if (r0 == 0) goto L98
            androidx.constraintlayout.core.SolverVariable r0 = r7.createExtraVariable()
            r8.f31907a = r0
            int r5 = r7.f31925i
            r7.m58797b(r8)
            int r6 = r7.f31925i
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            androidx.constraintlayout.core.LinearSystem$a r4 = r7.f31930n
            r4.initFromRow(r8)
            androidx.constraintlayout.core.LinearSystem$a r4 = r7.f31930n
            r7.m58790i(r4, r3)
            int r4 = r0.f31944b
            r5 = -1
            if (r4 != r5) goto L99
            androidx.constraintlayout.core.SolverVariable r4 = r8.f31907a
            if (r4 != r0) goto L76
            androidx.constraintlayout.core.SolverVariable r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L76
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L73
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L73:
            r8.m58801l(r0)
        L76:
            boolean r0 = r8.f31911e
            if (r0 != 0) goto L7f
            androidx.constraintlayout.core.SolverVariable r0 = r8.f31907a
            r0.updateReferencesWithNewDefinition(r7, r8)
        L7f:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L8b
            androidx.constraintlayout.core.Cache r0 = r7.f31927k
            Uk1 r0 = r0.f31912a
            r0.release(r8)
            goto L92
        L8b:
            androidx.constraintlayout.core.Cache r0 = r7.f31927k
            Uk1 r0 = r0.f31913b
            r0.release(r8)
        L92:
            int r0 = r7.f31925i
            int r0 = r0 - r3
            r7.f31925i = r0
            goto L99
        L98:
            r3 = 0
        L99:
            boolean r0 = r8.m58805h()
            if (r0 != 0) goto La0
            return
        La0:
            r4 = r3
        La1:
            if (r4 != 0) goto La6
            r7.m58797b(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.addConstraint(androidx.constraintlayout.core.ArrayRow):void");
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (USE_BASIC_SYNONYMS && i2 == 8 && solverVariable2.isFinalValue && solverVariable.f31944b == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i);
            return null;
        }
        ArrayRow createRow = createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            createRow.addError(this, i2);
        }
        addConstraint(createRow);
        return createRow;
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (i2 != 8) {
            m58796c(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(createRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (i2 != 8) {
            m58796c(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(createRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            createRow.addError(this, i);
        }
        addConstraint(createRow);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        if (solverVariable.f31944b == -1 && i == 0) {
            if (solverVariable2.f31950h) {
                solverVariable2 = this.f31927k.f31915d[solverVariable2.f31951i];
            }
            if (solverVariable.f31950h) {
                SolverVariable solverVariable3 = this.f31927k.f31915d[solverVariable.f31951i];
                return;
            } else {
                solverVariable.setSynonym(this, solverVariable2, 0.0f);
                return;
            }
        }
        addEquality(solverVariable, solverVariable2, i, 8);
    }

    /* renamed from: b */
    public final void m58797b(ArrayRow arrayRow) {
        int i;
        if (SIMPLIFY_SYNONYMS && arrayRow.f31911e) {
            arrayRow.f31907a.setFinalValue(this, arrayRow.f31908b);
        } else {
            ArrayRow[] arrayRowArr = this.f31922f;
            int i2 = this.f31925i;
            arrayRowArr[i2] = arrayRow;
            SolverVariable solverVariable = arrayRow.f31907a;
            solverVariable.f31944b = i2;
            this.f31925i = i2 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i3 = 0;
            while (i3 < this.f31925i) {
                if (this.f31922f[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.f31922f[i3];
                if (arrayRow2 != null && arrayRow2.f31911e) {
                    arrayRow2.f31907a.setFinalValue(this, arrayRow2.f31908b);
                    if (OPTIMIZED_ENGINE) {
                        this.f31927k.f31912a.release(arrayRow2);
                    } else {
                        this.f31927k.f31913b.release(arrayRow2);
                    }
                    this.f31922f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f31925i;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.f31922f;
                        int i6 = i4 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i4];
                        arrayRowArr2[i6] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.f31907a;
                        if (solverVariable2.f31944b == i4) {
                            solverVariable2.f31944b = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f31922f[i5] = null;
                    }
                    this.f31925i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    /* renamed from: c */
    public void m58796c(ArrayRow arrayRow, int i, int i2) {
        arrayRow.m58812a(createErrorVariable(i2, null), i);
    }

    public SolverVariable createErrorVariable(int i, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.f31924h + 1 >= this.f31921e) {
            m58792g();
        }
        SolverVariable m58798a = m58798a(SolverVariable.Type.ERROR, str);
        int i2 = this.f31917a + 1;
        this.f31917a = i2;
        this.f31924h++;
        m58798a.f31952id = i2;
        m58798a.strength = i;
        this.f31927k.f31915d[i2] = m58798a;
        this.f31919c.addError(m58798a);
        return m58798a;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.f31924h + 1 >= this.f31921e) {
            m58792g();
        }
        SolverVariable m58798a = m58798a(SolverVariable.Type.SLACK, null);
        int i = this.f31917a + 1;
        this.f31917a = i;
        this.f31924h++;
        m58798a.f31952id = i;
        this.f31927k.f31915d[i] = m58798a;
        return m58798a;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f31924h + 1 >= this.f31921e) {
            m58792g();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.f31927k);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i = solverVariable.f31952id;
            if (i == -1 || i > this.f31917a || this.f31927k.f31915d[i] == null) {
                if (i != -1) {
                    solverVariable.reset();
                }
                int i2 = this.f31917a + 1;
                this.f31917a = i2;
                this.f31924h++;
                solverVariable.f31952id = i2;
                solverVariable.f31947e = SolverVariable.Type.UNRESTRICTED;
                this.f31927k.f31915d[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow arrayRow;
        if (OPTIMIZED_ENGINE) {
            arrayRow = (ArrayRow) this.f31927k.f31912a.acquire();
            if (arrayRow == null) {
                arrayRow = new C3668b(this.f31927k);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                arrayRow.reset();
            }
        } else {
            arrayRow = (ArrayRow) this.f31927k.f31913b.acquire();
            if (arrayRow == null) {
                arrayRow = new ArrayRow(this.f31927k);
                ARRAY_ROW_CREATION++;
            } else {
                arrayRow.reset();
            }
        }
        SolverVariable.m58779a();
        return arrayRow;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.f31924h + 1 >= this.f31921e) {
            m58792g();
        }
        SolverVariable m58798a = m58798a(SolverVariable.Type.SLACK, null);
        int i = this.f31917a + 1;
        this.f31917a = i;
        this.f31924h++;
        m58798a.f31952id = i;
        this.f31927k.f31915d[i] = m58798a;
        return m58798a;
    }

    /* renamed from: d */
    public final void m58795d() {
        for (int i = 0; i < this.f31925i; i++) {
            ArrayRow arrayRow = this.f31922f[i];
            arrayRow.f31907a.computedValue = arrayRow.f31908b;
        }
    }

    public void displayReadableRows() {
        m58794e();
        String str = " num vars " + this.f31917a + "\n";
        for (int i = 0; i < this.f31917a + 1; i++) {
            SolverVariable solverVariable = this.f31927k.f31915d[i];
            if (solverVariable != null && solverVariable.isFinalValue) {
                str = str + " $[" + i + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.f31917a + 1; i2++) {
            SolverVariable[] solverVariableArr = this.f31927k.f31915d;
            SolverVariable solverVariable2 = solverVariableArr[i2];
            if (solverVariable2 != null && solverVariable2.f31950h) {
                str2 = str2 + " ~[" + i2 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.f31951i] + " + " + solverVariable2.f31953j + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.f31925i; i3++) {
            str3 = (str3 + this.f31922f[i3].m58799n()) + "\n #  ";
        }
        if (this.f31919c != null) {
            str3 = str3 + "Goal: " + this.f31919c + "\n";
        }
        System.out.println(str3);
    }

    public void displayVariablesReadableRows() {
        m58794e();
        String str = "";
        for (int i = 0; i < this.f31925i; i++) {
            if (this.f31922f[i].f31907a.f31947e == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.f31922f[i].m58799n()) + "\n";
            }
        }
        System.out.println(str + this.f31919c + "\n");
    }

    /* renamed from: e */
    public final void m58794e() {
        System.out.println("Display Rows (" + this.f31925i + "x" + this.f31924h + ")\n");
    }

    /* renamed from: f */
    public final int m58793f(InterfaceC3667a interfaceC3667a) {
        for (int i = 0; i < this.f31925i; i++) {
            ArrayRow arrayRow = this.f31922f[i];
            if (arrayRow.f31907a.f31947e != SolverVariable.Type.UNRESTRICTED && arrayRow.f31908b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    Metrics metrics = sMetrics;
                    if (metrics != null) {
                        metrics.bfs++;
                    }
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.f31925i) {
                            break;
                        }
                        ArrayRow arrayRow2 = this.f31922f[i3];
                        if (arrayRow2.f31907a.f31947e != SolverVariable.Type.UNRESTRICTED && !arrayRow2.f31911e && arrayRow2.f31908b < 0.0f) {
                            int i7 = 9;
                            if (SKIP_COLUMNS) {
                                int currentSize = arrayRow2.variables.getCurrentSize();
                                int i8 = 0;
                                while (i8 < currentSize) {
                                    SolverVariable variable = arrayRow2.variables.getVariable(i8);
                                    float f2 = arrayRow2.variables.get(variable);
                                    if (f2 > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f3 = variable.f31945c[i9] / f2;
                                            if ((f3 < f && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = variable.f31952id;
                                                i4 = i3;
                                                f = f3;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.f31924h; i10++) {
                                    SolverVariable solverVariable = this.f31927k.f31915d[i10];
                                    float f4 = arrayRow2.variables.get(solverVariable);
                                    if (f4 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f5 = solverVariable.f31945c[i11] / f4;
                                            if ((f5 < f && i11 == i6) || i11 > i6) {
                                                i6 = i11;
                                                i4 = i3;
                                                i5 = i10;
                                                f = f5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        ArrayRow arrayRow3 = this.f31922f[i4];
                        arrayRow3.f31907a.f31944b = -1;
                        Metrics metrics2 = sMetrics;
                        if (metrics2 != null) {
                            metrics2.pivots++;
                        }
                        arrayRow3.m58801l(this.f31927k.f31915d[i5]);
                        SolverVariable solverVariable2 = arrayRow3.f31907a;
                        solverVariable2.f31944b = i4;
                        solverVariable2.updateReferencesWithNewDefinition(this, arrayRow3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.f31924h / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    /* renamed from: g */
    public final void m58792g() {
        int i = this.f31920d * 2;
        this.f31920d = i;
        this.f31922f = (ArrayRow[]) Arrays.copyOf(this.f31922f, i);
        Cache cache = this.f31927k;
        cache.f31915d = (SolverVariable[]) Arrays.copyOf(cache.f31915d, this.f31920d);
        int i2 = this.f31920d;
        this.f31923g = new boolean[i2];
        this.f31921e = i2;
        this.f31926j = i2;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i2);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    public Cache getCache() {
        return this.f31927k;
    }

    public int getMemoryUsed() {
        int i = 0;
        for (int i2 = 0; i2 < this.f31925i; i2++) {
            ArrayRow arrayRow = this.f31922f[i2];
            if (arrayRow != null) {
                i += arrayRow.m58800m();
            }
        }
        return i;
    }

    public int getNumEquations() {
        return this.f31925i;
    }

    public int getNumVariables() {
        return this.f31917a;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    /* renamed from: h */
    public void m58791h(InterfaceC3667a interfaceC3667a) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.f31924h);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.f31925i);
        }
        m58793f(interfaceC3667a);
        m58790i(interfaceC3667a, false);
        m58795d();
    }

    /* renamed from: i */
    public final int m58790i(InterfaceC3667a interfaceC3667a, boolean z) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i = 0; i < this.f31924h; i++) {
            this.f31923g[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i2++;
            if (i2 >= this.f31924h * 2) {
                return i2;
            }
            if (interfaceC3667a.getKey() != null) {
                this.f31923g[interfaceC3667a.getKey().f31952id] = true;
            }
            SolverVariable pivotCandidate = interfaceC3667a.getPivotCandidate(this, this.f31923g);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f31923g;
                int i3 = pivotCandidate.f31952id;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f31925i; i5++) {
                    ArrayRow arrayRow = this.f31922f[i5];
                    if (arrayRow.f31907a.f31947e != SolverVariable.Type.UNRESTRICTED && !arrayRow.f31911e && arrayRow.m58804i(pivotCandidate)) {
                        float f2 = arrayRow.variables.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-arrayRow.f31908b) / f2;
                            if (f3 < f) {
                                i4 = i5;
                                f = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ArrayRow arrayRow2 = this.f31922f[i4];
                    arrayRow2.f31907a.f31944b = -1;
                    Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.m58801l(pivotCandidate);
                    SolverVariable solverVariable = arrayRow2.f31907a;
                    solverVariable.f31944b = i4;
                    solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: j */
    public final void m58789j() {
        int i = 0;
        if (OPTIMIZED_ENGINE) {
            while (i < this.f31925i) {
                ArrayRow arrayRow = this.f31922f[i];
                if (arrayRow != null) {
                    this.f31927k.f31912a.release(arrayRow);
                }
                this.f31922f[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f31925i) {
            ArrayRow arrayRow2 = this.f31922f[i];
            if (arrayRow2 != null) {
                this.f31927k.f31913b.release(arrayRow2);
            }
            this.f31922f[i] = null;
            i++;
        }
    }

    public void minimize() throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.f31919c.isEmpty()) {
            m58795d();
        } else if (!this.graphOptimizer && !this.newgraphOptimizer) {
            m58791h(this.f31919c);
        } else {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            for (int i = 0; i < this.f31925i; i++) {
                if (!this.f31922f[i].f31911e) {
                    m58791h(this.f31919c);
                    return;
                }
            }
            Metrics metrics3 = sMetrics;
            if (metrics3 != null) {
                metrics3.fullySolved++;
            }
            m58795d();
        }
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i;
        if (arrayRow.f31911e && (solverVariable = arrayRow.f31907a) != null) {
            int i2 = solverVariable.f31944b;
            if (i2 != -1) {
                while (true) {
                    i = this.f31925i;
                    if (i2 >= i - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.f31922f;
                    int i3 = i2 + 1;
                    ArrayRow arrayRow2 = arrayRowArr[i3];
                    SolverVariable solverVariable2 = arrayRow2.f31907a;
                    if (solverVariable2.f31944b == i3) {
                        solverVariable2.f31944b = i2;
                    }
                    arrayRowArr[i2] = arrayRow2;
                    i2 = i3;
                }
                this.f31925i = i - 1;
            }
            SolverVariable solverVariable3 = arrayRow.f31907a;
            if (!solverVariable3.isFinalValue) {
                solverVariable3.setFinalValue(this, arrayRow.f31908b);
            }
            if (OPTIMIZED_ENGINE) {
                this.f31927k.f31912a.release(arrayRow);
            } else {
                this.f31927k.f31913b.release(arrayRow);
            }
        }
    }

    public void reset() {
        Cache cache;
        int i = 0;
        while (true) {
            cache = this.f31927k;
            SolverVariable[] solverVariableArr = cache.f31915d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i++;
        }
        cache.f31914c.mo65738a(this.f31928l, this.f31929m);
        this.f31929m = 0;
        Arrays.fill(this.f31927k.f31915d, (Object) null);
        HashMap hashMap = this.f31918b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f31917a = 0;
        this.f31919c.clear();
        this.f31924h = 1;
        for (int i2 = 0; i2 < this.f31925i; i2++) {
            ArrayRow arrayRow = this.f31922f[i2];
            if (arrayRow != null) {
                arrayRow.f31909c = false;
            }
        }
        m58789j();
        this.f31925i = 0;
        if (OPTIMIZED_ENGINE) {
            this.f31930n = new C3668b(this.f31927k);
        } else {
            this.f31930n = new ArrayRow(this.f31927k);
        }
    }

    public void addEquality(SolverVariable solverVariable, int i) {
        if (USE_BASIC_SYNONYMS && solverVariable.f31944b == -1) {
            float f = i;
            solverVariable.setFinalValue(this, f);
            for (int i2 = 0; i2 < this.f31917a + 1; i2++) {
                SolverVariable solverVariable2 = this.f31927k.f31915d[i2];
                if (solverVariable2 != null && solverVariable2.f31950h && solverVariable2.f31951i == solverVariable.f31952id) {
                    solverVariable2.setFinalValue(this, solverVariable2.f31953j + f);
                }
            }
            return;
        }
        int i3 = solverVariable.f31944b;
        if (i3 != -1) {
            ArrayRow arrayRow = this.f31922f[i3];
            if (arrayRow.f31911e) {
                arrayRow.f31908b = i;
                return;
            } else if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.f31911e = true;
                arrayRow.f31908b = i;
                return;
            } else {
                ArrayRow createRow = createRow();
                createRow.createRowEquals(solverVariable, i);
                addConstraint(createRow);
                return;
            }
        }
        ArrayRow createRow2 = createRow();
        createRow2.m58808e(solverVariable, i);
        addConstraint(createRow2);
    }
}
