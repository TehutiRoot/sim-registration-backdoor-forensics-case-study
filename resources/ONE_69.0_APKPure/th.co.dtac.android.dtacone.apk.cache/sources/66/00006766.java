package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyFrameArray {

    /* loaded from: classes2.dex */
    public static class CustomArray {

        /* renamed from: a */
        public int[] f32285a = new int[101];

        /* renamed from: b */
        public CustomAttribute[] f32286b = new CustomAttribute[101];

        /* renamed from: c */
        public int f32287c;

        public CustomArray() {
            clear();
        }

        public void append(int i, CustomAttribute customAttribute) {
            if (this.f32286b[i] != null) {
                remove(i);
            }
            this.f32286b[i] = customAttribute;
            int[] iArr = this.f32285a;
            int i2 = this.f32287c;
            this.f32287c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f32285a, 999);
            Arrays.fill(this.f32286b, (Object) null);
            this.f32287c = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f32285a, this.f32287c)));
            printStream.print("K: [");
            for (int i = 0; i < this.f32287c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.f32285a[i];
        }

        public void remove(int i) {
            this.f32286b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f32287c;
                if (i2 < i4) {
                    int[] iArr = this.f32285a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f32287c = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.f32287c;
        }

        public CustomAttribute valueAt(int i) {
            return this.f32286b[this.f32285a[i]];
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomVar {

        /* renamed from: a */
        public int[] f32288a = new int[101];

        /* renamed from: b */
        public CustomVariable[] f32289b = new CustomVariable[101];

        /* renamed from: c */
        public int f32290c;

        public CustomVar() {
            clear();
        }

        public void append(int i, CustomVariable customVariable) {
            if (this.f32289b[i] != null) {
                remove(i);
            }
            this.f32289b[i] = customVariable;
            int[] iArr = this.f32288a;
            int i2 = this.f32290c;
            this.f32290c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f32288a, 999);
            Arrays.fill(this.f32289b, (Object) null);
            this.f32290c = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f32288a, this.f32290c)));
            printStream.print("K: [");
            for (int i = 0; i < this.f32290c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.f32288a[i];
        }

        public void remove(int i) {
            this.f32289b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f32290c;
                if (i2 < i4) {
                    int[] iArr = this.f32288a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f32290c = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.f32290c;
        }

        public CustomVariable valueAt(int i) {
            return this.f32289b[this.f32288a[i]];
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyFrameArray$a */
    /* loaded from: classes2.dex */
    public static class C3664a {

        /* renamed from: a */
        public int[] f32291a = new int[101];

        /* renamed from: b */
        public float[][] f32292b = new float[101];

        /* renamed from: c */
        public int f32293c;

        public C3664a() {
            m58668b();
        }

        /* renamed from: a */
        public void m58669a(int i, float[] fArr) {
            if (this.f32292b[i] != null) {
                m58667c(i);
            }
            this.f32292b[i] = fArr;
            int[] iArr = this.f32291a;
            int i2 = this.f32293c;
            this.f32293c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void m58668b() {
            Arrays.fill(this.f32291a, 999);
            Arrays.fill(this.f32292b, (Object) null);
            this.f32293c = 0;
        }

        /* renamed from: c */
        public void m58667c(int i) {
            this.f32292b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f32293c;
                if (i2 < i4) {
                    int[] iArr = this.f32291a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f32293c = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: d */
        public float[] m58666d(int i) {
            return this.f32292b[this.f32291a[i]];
        }
    }
}