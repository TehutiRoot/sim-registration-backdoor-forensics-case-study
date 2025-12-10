package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import io.reactivex.annotations.SchedulerSupport;
import java.io.PrintStream;
import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* renamed from: m */
    public static float f31955m = 0.001f;

    /* renamed from: a */
    public final int f31956a = -1;

    /* renamed from: b */
    public int f31957b = 16;

    /* renamed from: c */
    public int f31958c = 16;

    /* renamed from: d */
    public int[] f31959d = new int[16];

    /* renamed from: e */
    public int[] f31960e = new int[16];

    /* renamed from: f */
    public int[] f31961f = new int[16];

    /* renamed from: g */
    public float[] f31962g = new float[16];

    /* renamed from: h */
    public int[] f31963h = new int[16];

    /* renamed from: i */
    public int[] f31964i = new int[16];

    /* renamed from: j */
    public int f31965j = 0;

    /* renamed from: k */
    public int f31966k = -1;

    /* renamed from: l */
    public final ArrayRow f31967l;
    protected final Cache mCache;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.f31967l = arrayRow;
        this.mCache = cache;
        clear();
    }

    /* renamed from: a */
    public final void m58778a(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f31952id % this.f31958c;
        int[] iArr2 = this.f31959d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f31960e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f31960e[i] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f31955m;
        if (f > (-f2) && f < f2) {
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            put(solverVariable, f);
            return;
        }
        float[] fArr = this.f31962g;
        float f3 = fArr[indexOf] + f;
        fArr[indexOf] = f3;
        float f4 = f31955m;
        if (f3 > (-f4) && f3 < f4) {
            fArr[indexOf] = 0.0f;
            remove(solverVariable, z);
        }
    }

    /* renamed from: b */
    public final void m58777b(int i, SolverVariable solverVariable, float f) {
        this.f31961f[i] = solverVariable.f31952id;
        this.f31962g[i] = f;
        this.f31963h[i] = -1;
        this.f31964i[i] = -1;
        solverVariable.addToRow(this.f31967l);
        solverVariable.usageInRowCount++;
        this.f31965j++;
    }

    /* renamed from: c */
    public final int m58776c() {
        for (int i = 0; i < this.f31957b; i++) {
            if (this.f31961f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i = this.f31965j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                variable.removeFromRow(this.f31967l);
            }
        }
        for (int i3 = 0; i3 < this.f31957b; i3++) {
            this.f31961f[i3] = -1;
            this.f31960e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f31958c; i4++) {
            this.f31959d[i4] = -1;
        }
        this.f31965j = 0;
        this.f31966k = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        if (indexOf(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m58775d() {
        int i = this.f31957b * 2;
        this.f31961f = Arrays.copyOf(this.f31961f, i);
        this.f31962g = Arrays.copyOf(this.f31962g, i);
        this.f31963h = Arrays.copyOf(this.f31963h, i);
        this.f31964i = Arrays.copyOf(this.f31964i, i);
        this.f31960e = Arrays.copyOf(this.f31960e, i);
        for (int i2 = this.f31957b; i2 < i; i2++) {
            this.f31961f[i2] = -1;
            this.f31960e[i2] = -1;
        }
        this.f31957b = i;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i = this.f31965j;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                PrintStream printStream = System.out;
                printStream.print(variable + " = " + getVariableValue(i2) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.f31965j;
        int i2 = this.f31966k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f31962g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f31964i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void m58774e(int i, SolverVariable solverVariable, float f) {
        int m58776c = m58776c();
        m58777b(m58776c, solverVariable, f);
        if (i != -1) {
            this.f31963h[m58776c] = i;
            int[] iArr = this.f31964i;
            iArr[m58776c] = iArr[i];
            iArr[i] = m58776c;
        } else {
            this.f31963h[m58776c] = -1;
            if (this.f31965j > 0) {
                this.f31964i[m58776c] = this.f31966k;
                this.f31966k = m58776c;
            } else {
                this.f31964i[m58776c] = -1;
            }
        }
        int i2 = this.f31964i[m58776c];
        if (i2 != -1) {
            this.f31963h[i2] = m58776c;
        }
        m58778a(solverVariable, m58776c);
    }

    /* renamed from: f */
    public final void m58773f(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i2 = solverVariable.f31952id;
        int i3 = i2 % this.f31958c;
        int[] iArr2 = this.f31959d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f31961f[i4] == i2) {
            int[] iArr3 = this.f31960e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f31960e;
            i = iArr[i4];
            if (i == -1 || this.f31961f[i] == i2) {
                break;
            }
            i4 = i;
        }
        if (i != -1 && this.f31961f[i] == i2) {
            iArr[i4] = iArr[i];
            iArr[i] = -1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.f31962g[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.f31965j;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        int i2 = this.f31965j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f31966k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.mCache.f31915d[this.f31961f[i3]];
            }
            i3 = this.f31964i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i2 = this.f31965j;
        int i3 = this.f31966k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f31962g[i3];
            }
            i3 = this.f31964i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.f31965j != 0 && solverVariable != null) {
            int i = solverVariable.f31952id;
            int i2 = this.f31959d[i % this.f31958c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f31961f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f31960e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f31961f[i2] != i);
            if (i2 != -1 && this.f31961f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.f31965j;
        int i2 = this.f31966k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f31962g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f31964i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f) {
        float f2 = f31955m;
        if (f > (-f2) && f < f2) {
            remove(solverVariable, true);
            return;
        }
        if (this.f31965j == 0) {
            m58777b(0, solverVariable, f);
            m58778a(solverVariable, 0);
            this.f31966k = 0;
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            this.f31962g[indexOf] = f;
            return;
        }
        if (this.f31965j + 1 >= this.f31957b) {
            m58775d();
        }
        int i = this.f31965j;
        int i2 = this.f31966k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f31961f[i2];
            int i6 = solverVariable.f31952id;
            if (i5 == i6) {
                this.f31962g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f31964i[i2];
            if (i2 == -1) {
                break;
            }
        }
        m58774e(i3, solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z) {
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        m58773f(solverVariable);
        float f = this.f31962g[indexOf];
        if (this.f31966k == indexOf) {
            this.f31966k = this.f31964i[indexOf];
        }
        this.f31961f[indexOf] = -1;
        int[] iArr = this.f31963h;
        int i = iArr[indexOf];
        if (i != -1) {
            int[] iArr2 = this.f31964i;
            iArr2[i] = iArr2[indexOf];
        }
        int i2 = this.f31964i[indexOf];
        if (i2 != -1) {
            iArr[i2] = iArr[indexOf];
        }
        this.f31965j--;
        solverVariable.usageInRowCount--;
        if (z) {
            solverVariable.removeFromRow(this.f31967l);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f31965j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                String str4 = str3 + variable + " = " + getVariableValue(i2) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
                int indexOf = indexOf(variable);
                String str5 = str4 + "[p: ";
                if (this.f31963h[indexOf] != -1) {
                    str = str5 + this.mCache.f31915d[this.f31961f[this.f31963h[indexOf]]];
                } else {
                    str = str5 + SchedulerSupport.NONE;
                }
                String str6 = str + ", n: ";
                if (this.f31964i[indexOf] != -1) {
                    str2 = str6 + this.mCache.f31915d[this.f31961f[this.f31964i[indexOf]]];
                } else {
                    str2 = str6 + SchedulerSupport.NONE;
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z) {
        float f = get(arrayRow.f31907a);
        remove(arrayRow.f31907a, z);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i = 0;
        int i2 = 0;
        while (i < currentSize) {
            int i3 = solverVariableValues.f31961f[i2];
            if (i3 != -1) {
                add(this.mCache.f31915d[i3], solverVariableValues.f31962g[i2] * f, z);
                i++;
            }
            i2++;
        }
        return f;
    }
}
