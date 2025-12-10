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
    public boolean f59507a;

    /* renamed from: b */
    public boolean f59508b;

    /* renamed from: c */
    public boolean f59509c;

    /* renamed from: d */
    public InterfaceC9881c f59510d;

    /* renamed from: com.tom_roush.fontbox.ttf.KerningSubtable$b */
    /* loaded from: classes5.dex */
    public static class C9880b implements Comparator, InterfaceC9881c {

        /* renamed from: a */
        public int f59511a;

        /* renamed from: b */
        public int[][] f59512b;

        public C9880b() {
        }

        @Override // com.tom_roush.fontbox.ttf.KerningSubtable.InterfaceC9881c
        /* renamed from: a */
        public void mo32891a(AbstractC22342tR1 abstractC22342tR1) {
            int mo22679t = abstractC22342tR1.mo22679t();
            this.f59511a = abstractC22342tR1.mo22679t() / 6;
            abstractC22342tR1.mo22679t();
            abstractC22342tR1.mo22679t();
            this.f59512b = (int[][]) Array.newInstance(Integer.TYPE, mo22679t, 3);
            for (int i = 0; i < mo22679t; i++) {
                int mo22679t2 = abstractC22342tR1.mo22679t();
                int mo22679t3 = abstractC22342tR1.mo22679t();
                short mo22686m = abstractC22342tR1.mo22686m();
                int[] iArr = this.f59512b[i];
                iArr[0] = mo22679t2;
                iArr[1] = mo22679t3;
                iArr[2] = mo22686m;
            }
        }

        @Override // com.tom_roush.fontbox.ttf.KerningSubtable.InterfaceC9881c
        /* renamed from: b */
        public int mo32890b(int i, int i2) {
            int binarySearch = Arrays.binarySearch(this.f59512b, new int[]{i, i2, 0}, this);
            if (binarySearch < 0) {
                return 0;
            }
            return this.f59512b[binarySearch][2];
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
    public interface InterfaceC9881c {
        /* renamed from: a */
        void mo32891a(AbstractC22342tR1 abstractC22342tR1);

        /* renamed from: b */
        int mo32890b(int i, int i2);
    }

    /* renamed from: a */
    public static int m32899a(int i, int i2, int i3) {
        return (i & i2) >> i3;
    }

    /* renamed from: b */
    public static boolean m32898b(int i, int i2, int i3) {
        if (m32899a(i, i2, i3) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m32897c(AbstractC22342tR1 abstractC22342tR1, int i) {
        if (i == 0) {
            m32896d(abstractC22342tR1);
        } else if (i == 1) {
            m32893g(abstractC22342tR1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public final void m32896d(AbstractC22342tR1 abstractC22342tR1) {
        int mo22679t = abstractC22342tR1.mo22679t();
        if (mo22679t != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported kerning sub-table version: ");
            sb.append(mo22679t);
            return;
        }
        int mo22679t2 = abstractC22342tR1.mo22679t();
        if (mo22679t2 >= 6) {
            int mo22679t3 = abstractC22342tR1.mo22679t();
            if (m32898b(mo22679t3, 1, 0)) {
                this.f59507a = true;
            }
            if (m32898b(mo22679t3, 2, 1)) {
                this.f59508b = true;
            }
            if (m32898b(mo22679t3, 4, 2)) {
                this.f59509c = true;
            }
            int m32899a = m32899a(mo22679t3, MotionEventCompat.ACTION_POINTER_INDEX_MASK, 8);
            if (m32899a == 0) {
                m32895e(abstractC22342tR1);
                return;
            } else if (m32899a == 2) {
                m32894f(abstractC22342tR1);
                return;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipped kerning subtable due to an unsupported kerning subtable version: ");
                sb2.append(m32899a);
                return;
            }
        }
        throw new IOException("Kerning sub-table too short, got " + mo22679t2 + " bytes, expect 6 or more.");
    }

    /* renamed from: e */
    public final void m32895e(AbstractC22342tR1 abstractC22342tR1) {
        C9880b c9880b = new C9880b();
        this.f59510d = c9880b;
        c9880b.mo32891a(abstractC22342tR1);
    }

    public int[] getKerning(int[] iArr) {
        int i;
        if (this.f59510d != null) {
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
        if (this.f59507a && !this.f59508b) {
            if (z) {
                return this.f59509c;
            }
            return !this.f59509c;
        }
        return false;
    }

    public int getKerning(int i, int i2) {
        InterfaceC9881c interfaceC9881c = this.f59510d;
        if (interfaceC9881c == null) {
            Log.w("PdfBox-Android", "No kerning subtable data available due to an unsupported kerning subtable version");
            return 0;
        }
        return interfaceC9881c.mo32890b(i, i2);
    }

    /* renamed from: f */
    public final void m32894f(AbstractC22342tR1 abstractC22342tR1) {
    }

    /* renamed from: g */
    public final void m32893g(AbstractC22342tR1 abstractC22342tR1) {
    }
}