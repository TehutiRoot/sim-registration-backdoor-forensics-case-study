package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;

    /* renamed from: l */
    public static int f31942l = 1;

    /* renamed from: a */
    public String f31943a;

    /* renamed from: b */
    public int f31944b;

    /* renamed from: c */
    public float[] f31945c;
    public float computedValue;

    /* renamed from: d */
    public float[] f31946d;

    /* renamed from: e */
    public Type f31947e;

    /* renamed from: f */
    public ArrayRow[] f31948f;

    /* renamed from: g */
    public int f31949g;

    /* renamed from: h */
    public boolean f31950h;

    /* renamed from: i */
    public int f31951i;

    /* renamed from: id */
    public int f31952id;
    public boolean inGoal;
    public boolean isFinalValue;

    /* renamed from: j */
    public float f31953j;

    /* renamed from: k */
    public HashSet f31954k;
    public int strength;
    public int usageInRowCount;

    /* loaded from: classes2.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.f31952id = -1;
        this.f31944b = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.f31945c = new float[9];
        this.f31946d = new float[9];
        this.f31948f = new ArrayRow[16];
        this.f31949g = 0;
        this.usageInRowCount = 0;
        this.f31950h = false;
        this.f31951i = -1;
        this.f31953j = 0.0f;
        this.f31954k = null;
        this.f31943a = str;
        this.f31947e = type;
    }

    /* renamed from: a */
    public static void m58779a() {
        f31942l++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.f31949g;
            if (i < i2) {
                if (this.f31948f[i] == arrayRow) {
                    return;
                }
                i++;
            } else {
                ArrayRow[] arrayRowArr = this.f31948f;
                if (i2 >= arrayRowArr.length) {
                    this.f31948f = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f31948f;
                int i3 = this.f31949g;
                arrayRowArr2[i3] = arrayRow;
                this.f31949g = i3 + 1;
                return;
            }
        }
    }

    public String getName() {
        return this.f31943a;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i = this.f31949g;
        int i2 = 0;
        while (i2 < i) {
            if (this.f31948f[i2] == arrayRow) {
                while (i2 < i - 1) {
                    ArrayRow[] arrayRowArr = this.f31948f;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.f31949g--;
                return;
            }
            i2++;
        }
    }

    public void reset() {
        this.f31943a = null;
        this.f31947e = Type.UNKNOWN;
        this.strength = 0;
        this.f31952id = -1;
        this.f31944b = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.f31950h = false;
        this.f31951i = -1;
        this.f31953j = 0.0f;
        int i = this.f31949g;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31948f[i2] = null;
        }
        this.f31949g = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.f31946d, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f) {
        this.computedValue = f;
        this.isFinalValue = true;
        this.f31950h = false;
        this.f31951i = -1;
        this.f31953j = 0.0f;
        int i = this.f31949g;
        this.f31944b = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31948f[i2].updateFromFinalVariable(linearSystem, this, false);
        }
        this.f31949g = 0;
    }

    public void setName(String str) {
        this.f31943a = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f) {
        this.f31950h = true;
        this.f31951i = solverVariable.f31952id;
        this.f31953j = f;
        int i = this.f31949g;
        this.f31944b = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31948f[i2].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.f31949g = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.f31947e = type;
    }

    public String toString() {
        if (this.f31943a != null) {
            return "" + this.f31943a;
        }
        return "" + this.f31952id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.f31949g;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31948f[i2].updateFromRow(linearSystem, arrayRow, false);
        }
        this.f31949g = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f31952id - solverVariable.f31952id;
    }

    public SolverVariable(Type type, String str) {
        this.f31952id = -1;
        this.f31944b = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.f31945c = new float[9];
        this.f31946d = new float[9];
        this.f31948f = new ArrayRow[16];
        this.f31949g = 0;
        this.usageInRowCount = 0;
        this.f31950h = false;
        this.f31951i = -1;
        this.f31953j = 0.0f;
        this.f31954k = null;
        this.f31947e = type;
    }
}
