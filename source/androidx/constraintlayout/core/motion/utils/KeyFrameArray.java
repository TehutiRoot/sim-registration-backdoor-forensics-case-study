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
        public int[] f32197a = new int[101];

        /* renamed from: b */
        public CustomAttribute[] f32198b = new CustomAttribute[101];

        /* renamed from: c */
        public int f32199c;

        public CustomArray() {
            clear();
        }

        public void append(int i, CustomAttribute customAttribute) {
            if (this.f32198b[i] != null) {
                remove(i);
            }
            this.f32198b[i] = customAttribute;
            int[] iArr = this.f32197a;
            int i2 = this.f32199c;
            this.f32199c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f32197a, 999);
            Arrays.fill(this.f32198b, (Object) null);
            this.f32199c = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f32197a, this.f32199c)));
            printStream.print("K: [");
            for (int i = 0; i < this.f32199c; i++) {
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
            return this.f32197a[i];
        }

        public void remove(int i) {
            this.f32198b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f32199c;
                if (i2 < i4) {
                    int[] iArr = this.f32197a;
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
                    this.f32199c = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.f32199c;
        }

        public CustomAttribute valueAt(int i) {
            return this.f32198b[this.f32197a[i]];
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomVar {

        /* renamed from: a */
        public int[] f32200a = new int[101];

        /* renamed from: b */
        public CustomVariable[] f32201b = new CustomVariable[101];

        /* renamed from: c */
        public int f32202c;

        public CustomVar() {
            clear();
        }

        public void append(int i, CustomVariable customVariable) {
            if (this.f32201b[i] != null) {
                remove(i);
            }
            this.f32201b[i] = customVariable;
            int[] iArr = this.f32200a;
            int i2 = this.f32202c;
            this.f32202c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f32200a, 999);
            Arrays.fill(this.f32201b, (Object) null);
            this.f32202c = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f32200a, this.f32202c)));
            printStream.print("K: [");
            for (int i = 0; i < this.f32202c; i++) {
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
            return this.f32200a[i];
        }

        public void remove(int i) {
            this.f32201b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f32202c;
                if (i2 < i4) {
                    int[] iArr = this.f32200a;
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
                    this.f32202c = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.f32202c;
        }

        public CustomVariable valueAt(int i) {
            return this.f32201b[this.f32200a[i]];
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyFrameArray$a */
    /* loaded from: classes2.dex */
    public static class C3682a {

        /* renamed from: a */
        public int[] f32203a = new int[101];

        /* renamed from: b */
        public float[][] f32204b = new float[101];

        /* renamed from: c */
        public int f32205c;

        public C3682a() {
            m58718b();
        }

        /* renamed from: a */
        public void m58719a(int i, float[] fArr) {
            if (this.f32204b[i] != null) {
                m58717c(i);
            }
            this.f32204b[i] = fArr;
            int[] iArr = this.f32203a;
            int i2 = this.f32205c;
            this.f32205c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void m58718b() {
            Arrays.fill(this.f32203a, 999);
            Arrays.fill(this.f32204b, (Object) null);
            this.f32205c = 0;
        }

        /* renamed from: c */
        public void m58717c(int i) {
            this.f32204b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f32205c;
                if (i2 < i4) {
                    int[] iArr = this.f32203a;
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
                    this.f32205c = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: d */
        public float[] m58716d(int i) {
            return this.f32204b[this.f32203a[i]];
        }
    }
}
