package com.tom_roush.fontbox.ttf;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes5.dex */
public class KerningSubtable {

    /* renamed from: a */
    public boolean f59495a;

    /* renamed from: b */
    public boolean f59496b;

    /* renamed from: c */
    public boolean f59497c;

    /* renamed from: d */
    public InterfaceC9892c f59498d;

    /* renamed from: com.tom_roush.fontbox.ttf.KerningSubtable$b */
    /* loaded from: classes5.dex */
    public static class C9891b implements Comparator, InterfaceC9892c {

        /* renamed from: a */
        public int f59499a;

        /* renamed from: b */
        public int[][] f59500b;

        public C9891b() {
        }

        @Override // com.tom_roush.fontbox.ttf.KerningSubtable.InterfaceC9892c
        /* renamed from: a */
        public void mo32899a(AbstractC22790wQ1 abstractC22790wQ1) {
            int mo844t = abstractC22790wQ1.mo844t();
            this.f59499a = abstractC22790wQ1.mo844t() / 6;
            abstractC22790wQ1.mo844t();
            abstractC22790wQ1.mo844t();
            this.f59500b = (int[][]) Array.newInstance(Integer.TYPE, mo844t, 3);
            for (int i = 0; i < mo844t; i++) {
                int mo844t2 = abstractC22790wQ1.mo844t();
                int mo844t3 = abstractC22790wQ1.mo844t();
                short mo851m = abstractC22790wQ1.mo851m();
                int[] iArr = this.f59500b[i];
                iArr[0] = mo844t2;
                iArr[1] = mo844t3;
                iArr[2] = mo851m;
            }
        }

        @Override // com.tom_roush.fontbox.ttf.KerningSubtable.InterfaceC9892c
        /* renamed from: b */
        public int mo32898b(int i, int i2) {
            int binarySearch = Arrays.binarySearch(this.f59500b, new int[]{i, i2, 0}, this);
            if (binarySearch < 0) {
                return 0;
            }
            return this.f59500b[binarySearch][2];
        }

        @Override // java.util.Comparator
        /* renamed from: c */
        public int compare(int[] iArr, int[] iArr2) {
            int i = iArr[0];
            int i2 = iArr2[0];
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = iArr[1];
            int i4 = iArr2[1];
            if (i3 < i4) {
                return -1;
            }
            if (i3 <= i4) {
                return 0;
            }
            return 1;
        }
    }

    /* renamed from: com.tom_roush.fontbox.ttf.KerningSubtable$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC9892c {
        /* renamed from: a */
        void mo32899a(AbstractC22790wQ1 abstractC22790wQ1);

        /* renamed from: b */
        int mo32898b(int i, int i2);
    }

    /* renamed from: a */
    public static int m32907a(int i, int i2, int i3) {
        return (i & i2) >> i3;
    }

    /* renamed from: b */
    public static boolean m32906b(int i, int i2, int i3) {
        if (m32907a(i, i2, i3) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m32905c(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        if (i == 0) {
            m32904d(abstractC22790wQ1);
        } else if (i == 1) {
            m32901g(abstractC22790wQ1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public final void m32904d(AbstractC22790wQ1 abstractC22790wQ1) {
        int mo844t = abstractC22790wQ1.mo844t();
        if (mo844t != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported kerning sub-table version: ");
            sb.append(mo844t);
            return;
        }
        int mo844t2 = abstractC22790wQ1.mo844t();
        if (mo844t2 >= 6) {
            int mo844t3 = abstractC22790wQ1.mo844t();
            if (m32906b(mo844t3, 1, 0)) {
                this.f59495a = true;
            }
            if (m32906b(mo844t3, 2, 1)) {
                this.f59496b = true;
            }
            if (m32906b(mo844t3, 4, 2)) {
                this.f59497c = true;
            }
            int m32907a = m32907a(mo844t3, MotionEventCompat.ACTION_POINTER_INDEX_MASK, 8);
            if (m32907a == 0) {
                m32903e(abstractC22790wQ1);
                return;
            } else if (m32907a == 2) {
                m32902f(abstractC22790wQ1);
                return;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipped kerning subtable due to an unsupported kerning subtable version: ");
                sb2.append(m32907a);
                return;
            }
        }
        throw new IOException("Kerning sub-table too short, got " + mo844t2 + " bytes, expect 6 or more.");
    }

    /* renamed from: e */
    public final void m32903e(AbstractC22790wQ1 abstractC22790wQ1) {
        C9891b c9891b = new C9891b();
        this.f59498d = c9891b;
        c9891b.mo32899a(abstractC22790wQ1);
    }

    public int[] getKerning(int[] iArr) {
        int i;
        if (this.f59498d != null) {
            int length = iArr.length;
            int[] iArr2 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                int i4 = i2 + 1;
                int i5 = i4;
                while (true) {
                    if (i5 >= length) {
                        i = -1;
                        break;
                    }
                    i = iArr[i5];
                    if (i >= 0) {
                        break;
                    }
                    i5++;
                }
                iArr2[i2] = getKerning(i3, i);
                i2 = i4;
            }
            return iArr2;
        }
        Log.w("PdfBox-Android", "No kerning subtable data available due to an unsupported kerning subtable version");
        return null;
    }

    public boolean isHorizontalKerning() {
        return isHorizontalKerning(false);
    }

    public boolean isHorizontalKerning(boolean z) {
        if (this.f59495a && !this.f59496b) {
            if (z) {
                return this.f59497c;
            }
            return !this.f59497c;
        }
        return false;
    }

    public int getKerning(int i, int i2) {
        InterfaceC9892c interfaceC9892c = this.f59498d;
        if (interfaceC9892c == null) {
            Log.w("PdfBox-Android", "No kerning subtable data available due to an unsupported kerning subtable version");
            return 0;
        }
        return interfaceC9892c.mo32898b(i, i2);
    }

    /* renamed from: f */
    public final void m32902f(AbstractC22790wQ1 abstractC22790wQ1) {
    }

    /* renamed from: g */
    public final void m32901g(AbstractC22790wQ1 abstractC22790wQ1) {
    }
}
