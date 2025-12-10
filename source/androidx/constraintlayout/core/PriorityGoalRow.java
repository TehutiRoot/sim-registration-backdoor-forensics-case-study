package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class PriorityGoalRow extends ArrayRow {

    /* renamed from: f */
    public int f31932f;

    /* renamed from: g */
    public SolverVariable[] f31933g;

    /* renamed from: h */
    public SolverVariable[] f31934h;

    /* renamed from: i */
    public int f31935i;

    /* renamed from: j */
    public C3670b f31936j;

    /* renamed from: k */
    public Cache f31937k;

    /* renamed from: androidx.constraintlayout.core.PriorityGoalRow$a */
    /* loaded from: classes2.dex */
    public class C3669a implements Comparator {
        public C3669a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f31952id - solverVariable2.f31952id;
        }
    }

    /* renamed from: androidx.constraintlayout.core.PriorityGoalRow$b */
    /* loaded from: classes2.dex */
    public class C3670b {

        /* renamed from: a */
        public SolverVariable f31939a;

        /* renamed from: b */
        public PriorityGoalRow f31940b;

        public C3670b(PriorityGoalRow priorityGoalRow) {
            this.f31940b = priorityGoalRow;
        }

        /* renamed from: a */
        public boolean m58784a(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (this.f31939a.inGoal) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f31939a.f31946d;
                    float f2 = fArr[i] + (solverVariable.f31946d[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f31939a.f31946d[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    PriorityGoalRow.this.m58786q(this.f31939a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = solverVariable.f31946d[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f31939a.f31946d[i2] = f4;
                } else {
                    this.f31939a.f31946d[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m58783b(SolverVariable solverVariable) {
            this.f31939a = solverVariable;
        }

        /* renamed from: c */
        public final boolean m58782c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f31939a.f31946d[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m58781d(SolverVariable solverVariable) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = solverVariable.f31946d[i];
                float f2 = this.f31939a.f31946d[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m58780e() {
            Arrays.fill(this.f31939a.f31946d, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f31939a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f31939a.f31946d[i] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
                }
            }
            return str + "] " + this.f31939a;
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.f31932f = 128;
        this.f31933g = new SolverVariable[128];
        this.f31934h = new SolverVariable[128];
        this.f31935i = 0;
        this.f31936j = new C3670b(this);
        this.f31937k = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.InterfaceC3667a
    public void addError(SolverVariable solverVariable) {
        this.f31936j.m58783b(solverVariable);
        this.f31936j.m58780e();
        solverVariable.f31946d[solverVariable.strength] = 1.0f;
        m58787p(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.InterfaceC3667a
    public void clear() {
        this.f31935i = 0;
        this.f31908b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.InterfaceC3667a
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f31935i; i2++) {
            SolverVariable solverVariable = this.f31933g[i2];
            if (!zArr[solverVariable.f31952id]) {
                this.f31936j.m58783b(solverVariable);
                if (i == -1) {
                    if (!this.f31936j.m58782c()) {
                    }
                    i = i2;
                } else {
                    if (!this.f31936j.m58781d(this.f31933g[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f31933g[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.InterfaceC3667a
    public boolean isEmpty() {
        if (this.f31935i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m58787p(SolverVariable solverVariable) {
        int i;
        int i2 = this.f31935i + 1;
        SolverVariable[] solverVariableArr = this.f31933g;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f31933g = solverVariableArr2;
            this.f31934h = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f31933g;
        int i3 = this.f31935i;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f31935i = i4;
        if (i4 > 1 && solverVariableArr3[i3].f31952id > solverVariable.f31952id) {
            int i5 = 0;
            while (true) {
                i = this.f31935i;
                if (i5 >= i) {
                    break;
                }
                this.f31934h[i5] = this.f31933g[i5];
                i5++;
            }
            Arrays.sort(this.f31934h, 0, i, new C3669a());
            for (int i6 = 0; i6 < this.f31935i; i6++) {
                this.f31933g[i6] = this.f31934h[i6];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* renamed from: q */
    public final void m58786q(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f31935i) {
            if (this.f31933g[i] == solverVariable) {
                while (true) {
                    int i2 = this.f31935i;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.f31933g;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.f31935i = i2 - 1;
                        solverVariable.inGoal = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.f31908b + ") : ";
        for (int i = 0; i < this.f31935i; i++) {
            this.f31936j.m58783b(this.f31933g[i]);
            str = str + this.f31936j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.f31907a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayRowVariables.getVariable(i);
            float variableValue = arrayRowVariables.getVariableValue(i);
            this.f31936j.m58783b(variable);
            if (this.f31936j.m58784a(solverVariable, variableValue)) {
                m58787p(variable);
            }
            this.f31908b += arrayRow.f31908b * variableValue;
        }
        m58786q(solverVariable);
    }
}
