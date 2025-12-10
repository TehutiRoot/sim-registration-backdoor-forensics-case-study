package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class TypedBundle {

    /* renamed from: a */
    public int[] f32361a = new int[10];

    /* renamed from: b */
    public int[] f32362b = new int[10];

    /* renamed from: c */
    public int f32363c = 0;

    /* renamed from: d */
    public int[] f32364d = new int[10];

    /* renamed from: e */
    public float[] f32365e = new float[10];

    /* renamed from: f */
    public int f32366f = 0;

    /* renamed from: g */
    public int[] f32367g = new int[5];

    /* renamed from: h */
    public String[] f32368h = new String[5];

    /* renamed from: i */
    public int f32369i = 0;

    /* renamed from: j */
    public int[] f32370j = new int[4];

    /* renamed from: k */
    public boolean[] f32371k = new boolean[4];

    /* renamed from: l */
    public int f32372l = 0;

    public void add(int i, int i2) {
        int i3 = this.f32363c;
        int[] iArr = this.f32361a;
        if (i3 >= iArr.length) {
            this.f32361a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f32362b;
            this.f32362b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f32361a;
        int i4 = this.f32363c;
        iArr3[i4] = i;
        int[] iArr4 = this.f32362b;
        this.f32363c = i4 + 1;
        iArr4[i4] = i2;
    }

    public void addIfNotNull(int i, String str) {
        if (str != null) {
            add(i, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        for (int i = 0; i < this.f32363c; i++) {
            typedValues.setValue(this.f32361a[i], this.f32362b[i]);
        }
        for (int i2 = 0; i2 < this.f32366f; i2++) {
            typedValues.setValue(this.f32364d[i2], this.f32365e[i2]);
        }
        for (int i3 = 0; i3 < this.f32369i; i3++) {
            typedValues.setValue(this.f32367g[i3], this.f32368h[i3]);
        }
        for (int i4 = 0; i4 < this.f32372l; i4++) {
            typedValues.setValue(this.f32370j[i4], this.f32371k[i4]);
        }
    }

    public void clear() {
        this.f32372l = 0;
        this.f32369i = 0;
        this.f32366f = 0;
        this.f32363c = 0;
    }

    public int getInteger(int i) {
        for (int i2 = 0; i2 < this.f32363c; i2++) {
            if (this.f32361a[i2] == i) {
                return this.f32362b[i2];
            }
        }
        return -1;
    }

    public void add(int i, float f) {
        int i2 = this.f32366f;
        int[] iArr = this.f32364d;
        if (i2 >= iArr.length) {
            this.f32364d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f32365e;
            this.f32365e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f32364d;
        int i3 = this.f32366f;
        iArr2[i3] = i;
        float[] fArr2 = this.f32365e;
        this.f32366f = i3 + 1;
        fArr2[i3] = f;
    }

    public void applyDelta(TypedBundle typedBundle) {
        for (int i = 0; i < this.f32363c; i++) {
            typedBundle.add(this.f32361a[i], this.f32362b[i]);
        }
        for (int i2 = 0; i2 < this.f32366f; i2++) {
            typedBundle.add(this.f32364d[i2], this.f32365e[i2]);
        }
        for (int i3 = 0; i3 < this.f32369i; i3++) {
            typedBundle.add(this.f32367g[i3], this.f32368h[i3]);
        }
        for (int i4 = 0; i4 < this.f32372l; i4++) {
            typedBundle.add(this.f32370j[i4], this.f32371k[i4]);
        }
    }

    public void add(int i, String str) {
        int i2 = this.f32369i;
        int[] iArr = this.f32367g;
        if (i2 >= iArr.length) {
            this.f32367g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32368h;
            this.f32368h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f32367g;
        int i3 = this.f32369i;
        iArr2[i3] = i;
        String[] strArr2 = this.f32368h;
        this.f32369i = i3 + 1;
        strArr2[i3] = str;
    }

    public void add(int i, boolean z) {
        int i2 = this.f32372l;
        int[] iArr = this.f32370j;
        if (i2 >= iArr.length) {
            this.f32370j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f32371k;
            this.f32371k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f32370j;
        int i3 = this.f32372l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f32371k;
        this.f32372l = i3 + 1;
        zArr2[i3] = z;
    }
}