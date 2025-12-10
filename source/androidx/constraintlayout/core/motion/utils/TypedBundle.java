package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class TypedBundle {

    /* renamed from: a */
    public int[] f32273a = new int[10];

    /* renamed from: b */
    public int[] f32274b = new int[10];

    /* renamed from: c */
    public int f32275c = 0;

    /* renamed from: d */
    public int[] f32276d = new int[10];

    /* renamed from: e */
    public float[] f32277e = new float[10];

    /* renamed from: f */
    public int f32278f = 0;

    /* renamed from: g */
    public int[] f32279g = new int[5];

    /* renamed from: h */
    public String[] f32280h = new String[5];

    /* renamed from: i */
    public int f32281i = 0;

    /* renamed from: j */
    public int[] f32282j = new int[4];

    /* renamed from: k */
    public boolean[] f32283k = new boolean[4];

    /* renamed from: l */
    public int f32284l = 0;

    public void add(int i, int i2) {
        int i3 = this.f32275c;
        int[] iArr = this.f32273a;
        if (i3 >= iArr.length) {
            this.f32273a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f32274b;
            this.f32274b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f32273a;
        int i4 = this.f32275c;
        iArr3[i4] = i;
        int[] iArr4 = this.f32274b;
        this.f32275c = i4 + 1;
        iArr4[i4] = i2;
    }

    public void addIfNotNull(int i, String str) {
        if (str != null) {
            add(i, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        for (int i = 0; i < this.f32275c; i++) {
            typedValues.setValue(this.f32273a[i], this.f32274b[i]);
        }
        for (int i2 = 0; i2 < this.f32278f; i2++) {
            typedValues.setValue(this.f32276d[i2], this.f32277e[i2]);
        }
        for (int i3 = 0; i3 < this.f32281i; i3++) {
            typedValues.setValue(this.f32279g[i3], this.f32280h[i3]);
        }
        for (int i4 = 0; i4 < this.f32284l; i4++) {
            typedValues.setValue(this.f32282j[i4], this.f32283k[i4]);
        }
    }

    public void clear() {
        this.f32284l = 0;
        this.f32281i = 0;
        this.f32278f = 0;
        this.f32275c = 0;
    }

    public int getInteger(int i) {
        for (int i2 = 0; i2 < this.f32275c; i2++) {
            if (this.f32273a[i2] == i) {
                return this.f32274b[i2];
            }
        }
        return -1;
    }

    public void add(int i, float f) {
        int i2 = this.f32278f;
        int[] iArr = this.f32276d;
        if (i2 >= iArr.length) {
            this.f32276d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f32277e;
            this.f32277e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f32276d;
        int i3 = this.f32278f;
        iArr2[i3] = i;
        float[] fArr2 = this.f32277e;
        this.f32278f = i3 + 1;
        fArr2[i3] = f;
    }

    public void applyDelta(TypedBundle typedBundle) {
        for (int i = 0; i < this.f32275c; i++) {
            typedBundle.add(this.f32273a[i], this.f32274b[i]);
        }
        for (int i2 = 0; i2 < this.f32278f; i2++) {
            typedBundle.add(this.f32276d[i2], this.f32277e[i2]);
        }
        for (int i3 = 0; i3 < this.f32281i; i3++) {
            typedBundle.add(this.f32279g[i3], this.f32280h[i3]);
        }
        for (int i4 = 0; i4 < this.f32284l; i4++) {
            typedBundle.add(this.f32282j[i4], this.f32283k[i4]);
        }
    }

    public void add(int i, String str) {
        int i2 = this.f32281i;
        int[] iArr = this.f32279g;
        if (i2 >= iArr.length) {
            this.f32279g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32280h;
            this.f32280h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f32279g;
        int i3 = this.f32281i;
        iArr2[i3] = i;
        String[] strArr2 = this.f32280h;
        this.f32281i = i3 + 1;
        strArr2[i3] = str;
    }

    public void add(int i, boolean z) {
        int i2 = this.f32284l;
        int[] iArr = this.f32282j;
        if (i2 >= iArr.length) {
            this.f32282j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f32283k;
            this.f32283k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f32282j;
        int i3 = this.f32284l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f32283k;
        this.f32284l = i3 + 1;
        zArr2[i3] = z;
    }
}
