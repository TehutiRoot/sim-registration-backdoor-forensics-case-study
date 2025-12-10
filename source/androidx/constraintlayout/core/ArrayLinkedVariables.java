package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.io.PrintStream;
import java.util.Arrays;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {

    /* renamed from: k */
    public static float f31896k = 0.001f;

    /* renamed from: b */
    public final ArrayRow f31898b;
    protected final Cache mCache;

    /* renamed from: a */
    public int f31897a = 0;

    /* renamed from: c */
    public int f31899c = 8;

    /* renamed from: d */
    public SolverVariable f31900d = null;

    /* renamed from: e */
    public int[] f31901e = new int[8];

    /* renamed from: f */
    public int[] f31902f = new int[8];

    /* renamed from: g */
    public float[] f31903g = new float[8];

    /* renamed from: h */
    public int f31904h = -1;

    /* renamed from: i */
    public int f31905i = -1;

    /* renamed from: j */
    public boolean f31906j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.f31898b = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f31896k;
        if (f > (-f2) && f < f2) {
            return;
        }
        int i = this.f31904h;
        if (i == -1) {
            this.f31904h = 0;
            this.f31903g[0] = f;
            this.f31901e[0] = solverVariable.f31952id;
            this.f31902f[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.f31898b);
            this.f31897a++;
            if (!this.f31906j) {
                int i2 = this.f31905i + 1;
                this.f31905i = i2;
                int[] iArr = this.f31901e;
                if (i2 >= iArr.length) {
                    this.f31906j = true;
                    this.f31905i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f31897a; i4++) {
            int i5 = this.f31901e[i];
            int i6 = solverVariable.f31952id;
            if (i5 == i6) {
                float[] fArr = this.f31903g;
                float f3 = fArr[i] + f;
                float f4 = f31896k;
                if (f3 > (-f4) && f3 < f4) {
                    f3 = 0.0f;
                }
                fArr[i] = f3;
                if (f3 == 0.0f) {
                    if (i == this.f31904h) {
                        this.f31904h = this.f31902f[i];
                    } else {
                        int[] iArr2 = this.f31902f;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        solverVariable.removeFromRow(this.f31898b);
                    }
                    if (this.f31906j) {
                        this.f31905i = i;
                    }
                    solverVariable.usageInRowCount--;
                    this.f31897a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f31902f[i];
        }
        int i7 = this.f31905i;
        int i8 = i7 + 1;
        if (this.f31906j) {
            int[] iArr3 = this.f31901e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f31901e;
        if (i7 >= iArr4.length && this.f31897a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f31901e;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f31901e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f31899c * 2;
            this.f31899c = i10;
            this.f31906j = false;
            this.f31905i = i7 - 1;
            this.f31903g = Arrays.copyOf(this.f31903g, i10);
            this.f31901e = Arrays.copyOf(this.f31901e, this.f31899c);
            this.f31902f = Arrays.copyOf(this.f31902f, this.f31899c);
        }
        this.f31901e[i7] = solverVariable.f31952id;
        this.f31903g[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f31902f;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f31902f[i7] = this.f31904h;
            this.f31904h = i7;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.f31898b);
        this.f31897a++;
        if (!this.f31906j) {
            this.f31905i++;
        }
        int i11 = this.f31905i;
        int[] iArr8 = this.f31901e;
        if (i11 >= iArr8.length) {
            this.f31906j = true;
            this.f31905i = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.f31904h;
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            SolverVariable solverVariable = this.mCache.f31915d[this.f31901e[i]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.f31898b);
            }
            i = this.f31902f[i];
        }
        this.f31904h = -1;
        this.f31905i = -1;
        this.f31906j = false;
        this.f31897a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i = this.f31904h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            if (this.f31901e[i] == solverVariable.f31952id) {
                return true;
            }
            i = this.f31902f[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i = this.f31897a;
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
        int i = this.f31904h;
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            float[] fArr = this.f31903g;
            fArr[i] = fArr[i] / f;
            i = this.f31902f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i = this.f31904h;
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            if (this.f31901e[i] == solverVariable.f31952id) {
                return this.f31903g[i];
            }
            i = this.f31902f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.f31897a;
    }

    public int getHead() {
        return this.f31904h;
    }

    public final int getId(int i) {
        return this.f31901e[i];
    }

    public final int getNextIndice(int i) {
        return this.f31902f[i];
    }

    public final float getValue(int i) {
        return this.f31903g[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        int i2 = this.f31904h;
        for (int i3 = 0; i2 != -1 && i3 < this.f31897a; i3++) {
            if (i3 == i) {
                return this.mCache.f31915d[this.f31901e[i2]];
            }
            i2 = this.f31902f[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i2 = this.f31904h;
        for (int i3 = 0; i2 != -1 && i3 < this.f31897a; i3++) {
            if (i3 == i) {
                return this.f31903g[i2];
            }
            i2 = this.f31902f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i = this.f31904h;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            if (this.f31901e[i] == solverVariable.f31952id) {
                return i;
            }
            i = this.f31902f[i];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.f31904h;
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            float[] fArr = this.f31903g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f31902f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i = this.f31904h;
        if (i == -1) {
            this.f31904h = 0;
            this.f31903g[0] = f;
            this.f31901e[0] = solverVariable.f31952id;
            this.f31902f[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.f31898b);
            this.f31897a++;
            if (!this.f31906j) {
                int i2 = this.f31905i + 1;
                this.f31905i = i2;
                int[] iArr = this.f31901e;
                if (i2 >= iArr.length) {
                    this.f31906j = true;
                    this.f31905i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f31897a; i4++) {
            int i5 = this.f31901e[i];
            int i6 = solverVariable.f31952id;
            if (i5 == i6) {
                this.f31903g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f31902f[i];
        }
        int i7 = this.f31905i;
        int i8 = i7 + 1;
        if (this.f31906j) {
            int[] iArr2 = this.f31901e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f31901e;
        if (i7 >= iArr3.length && this.f31897a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f31901e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f31901e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f31899c * 2;
            this.f31899c = i10;
            this.f31906j = false;
            this.f31905i = i7 - 1;
            this.f31903g = Arrays.copyOf(this.f31903g, i10);
            this.f31901e = Arrays.copyOf(this.f31901e, this.f31899c);
            this.f31902f = Arrays.copyOf(this.f31902f, this.f31899c);
        }
        this.f31901e[i7] = solverVariable.f31952id;
        this.f31903g[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f31902f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f31902f[i7] = this.f31904h;
            this.f31904h = i7;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.f31898b);
        int i11 = this.f31897a + 1;
        this.f31897a = i11;
        if (!this.f31906j) {
            this.f31905i++;
        }
        int[] iArr7 = this.f31901e;
        if (i11 >= iArr7.length) {
            this.f31906j = true;
        }
        if (this.f31905i >= iArr7.length) {
            this.f31906j = true;
            this.f31905i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z) {
        if (this.f31900d == solverVariable) {
            this.f31900d = null;
        }
        int i = this.f31904h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f31897a) {
            if (this.f31901e[i] == solverVariable.f31952id) {
                if (i == this.f31904h) {
                    this.f31904h = this.f31902f[i];
                } else {
                    int[] iArr = this.f31902f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.removeFromRow(this.f31898b);
                }
                solverVariable.usageInRowCount--;
                this.f31897a--;
                this.f31901e[i] = -1;
                if (this.f31906j) {
                    this.f31905i = i;
                }
                return this.f31903g[i];
            }
            i2++;
            i3 = i;
            i = this.f31902f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.f31901e.length * 12) + 36;
    }

    public String toString() {
        int i = this.f31904h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f31897a; i2++) {
            str = ((str + " -> ") + this.f31903g[i] + " : ") + this.mCache.f31915d[this.f31901e[i]];
            i = this.f31902f[i];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z) {
        float f = get(arrayRow.f31907a);
        remove(arrayRow.f31907a, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayRowVariables.getVariable(i);
            add(variable, arrayRowVariables.get(variable) * f, z);
        }
        return f;
    }
}
