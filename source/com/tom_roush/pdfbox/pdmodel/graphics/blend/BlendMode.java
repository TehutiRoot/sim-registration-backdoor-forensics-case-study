package com.tom_roush.pdfbox.pdmodel.graphics.blend;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class BlendMode {
    public static final NonSeparableBlendMode COLOR;
    public static final SeparableBlendMode COLOR_BURN;
    public static final SeparableBlendMode COLOR_DODGE;
    public static final SeparableBlendMode COMPATIBLE;
    public static final SeparableBlendMode DARKEN;
    public static final SeparableBlendMode DIFFERENCE;
    public static final SeparableBlendMode EXCLUSION;
    public static final SeparableBlendMode HARD_LIGHT;
    public static final NonSeparableBlendMode HUE;
    public static final SeparableBlendMode LIGHTEN;
    public static final NonSeparableBlendMode LUMINOSITY;
    public static final SeparableBlendMode MULTIPLY;
    public static final SeparableBlendMode NORMAL;
    public static final SeparableBlendMode OVERLAY;
    public static final NonSeparableBlendMode SATURATION;
    public static final SeparableBlendMode SCREEN;
    public static final SeparableBlendMode SOFT_LIGHT;

    /* renamed from: a */
    public static final Map f60462a;

    /* renamed from: b */
    public static final Map f60463b;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$a */
    /* loaded from: classes5.dex */
    public class C9930a extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            float sqrt;
            if (f <= 0.5d) {
                return f2 - (((1.0f - (f * 2.0f)) * f2) * (1.0f - f2));
            }
            double d = f2;
            if (d <= 0.25d) {
                sqrt = ((((16.0f * f2) - 12.0f) * f2) + 4.0f) * f2;
            } else {
                sqrt = (float) Math.sqrt(d);
            }
            return f2 + (((f * 2.0f) - 1.0f) * (sqrt - f2));
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$b */
    /* loaded from: classes5.dex */
    public class C9931b extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return Math.abs(f2 - f);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$c */
    /* loaded from: classes5.dex */
    public class C9932c extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return (f2 + f) - ((f2 * 2.0f) * f);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$d */
    /* loaded from: classes5.dex */
    public class C9933d extends NonSeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
        public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
            float[] fArr4 = new float[3];
            BlendMode.m32406g(fArr2, fArr, fArr4);
            BlendMode.m32407f(fArr2, fArr4, fArr3);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$e */
    /* loaded from: classes5.dex */
    public class C9934e extends NonSeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
        public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
            BlendMode.m32406g(fArr, fArr2, fArr3);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$f */
    /* loaded from: classes5.dex */
    public class C9935f extends NonSeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
        public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
            BlendMode.m32407f(fArr2, fArr, fArr3);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$g */
    /* loaded from: classes5.dex */
    public class C9936g extends NonSeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
        public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
            BlendMode.m32407f(fArr, fArr2, fArr3);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$h */
    /* loaded from: classes5.dex */
    public class C9937h extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return f;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$i */
    /* loaded from: classes5.dex */
    public class C9938i extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return f * f2;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$j */
    /* loaded from: classes5.dex */
    public class C9939j extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return (f + f2) - (f * f2);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$k */
    /* loaded from: classes5.dex */
    public class C9940k extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return ((double) f2) <= 0.5d ? f2 * 2.0f * f : (((f + f2) - (f * f2)) * 2.0f) - 1.0f;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$l */
    /* loaded from: classes5.dex */
    public class C9941l extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return Math.min(f, f2);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$m */
    /* loaded from: classes5.dex */
    public class C9942m extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return Math.max(f, f2);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$n */
    /* loaded from: classes5.dex */
    public class C9943n extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float f3 = 1.0f - f;
            if (f2 >= f3) {
                return 1.0f;
            }
            return f2 / f3;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$o */
    /* loaded from: classes5.dex */
    public class C9944o extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            if (f2 == 1.0f) {
                return 1.0f;
            }
            float f3 = 1.0f - f2;
            if (f3 >= f) {
                return 0.0f;
            }
            return 1.0f - (f3 / f);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode$p */
    /* loaded from: classes5.dex */
    public class C9945p extends SeparableBlendMode {
        @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
        public float blendChannel(float f, float f2) {
            return ((double) f) <= 0.5d ? f2 * 2.0f * f : (((f + f2) - (f * f2)) * 2.0f) - 1.0f;
        }
    }

    static {
        C9937h c9937h = new C9937h();
        NORMAL = c9937h;
        COMPATIBLE = c9937h;
        MULTIPLY = new C9938i();
        SCREEN = new C9939j();
        OVERLAY = new C9940k();
        DARKEN = new C9941l();
        LIGHTEN = new C9942m();
        COLOR_DODGE = new C9943n();
        COLOR_BURN = new C9944o();
        HARD_LIGHT = new C9945p();
        SOFT_LIGHT = new C9930a();
        DIFFERENCE = new C9931b();
        EXCLUSION = new C9932c();
        HUE = new C9933d();
        SATURATION = new C9934e();
        COLOR = new C9935f();
        LUMINOSITY = new C9936g();
        f60462a = m32410c();
        f60463b = m32409d();
    }

    /* renamed from: c */
    public static Map m32410c() {
        HashMap hashMap = new HashMap(13);
        COSName cOSName = COSName.NORMAL;
        SeparableBlendMode separableBlendMode = NORMAL;
        hashMap.put(cOSName, separableBlendMode);
        hashMap.put(COSName.COMPATIBLE, separableBlendMode);
        hashMap.put(COSName.MULTIPLY, MULTIPLY);
        hashMap.put(COSName.SCREEN, SCREEN);
        hashMap.put(COSName.OVERLAY, OVERLAY);
        hashMap.put(COSName.DARKEN, DARKEN);
        hashMap.put(COSName.LIGHTEN, LIGHTEN);
        hashMap.put(COSName.COLOR_DODGE, COLOR_DODGE);
        hashMap.put(COSName.COLOR_BURN, COLOR_BURN);
        hashMap.put(COSName.HARD_LIGHT, HARD_LIGHT);
        hashMap.put(COSName.SOFT_LIGHT, SOFT_LIGHT);
        hashMap.put(COSName.DIFFERENCE, DIFFERENCE);
        hashMap.put(COSName.EXCLUSION, EXCLUSION);
        hashMap.put(COSName.HUE, HUE);
        hashMap.put(COSName.SATURATION, SATURATION);
        hashMap.put(COSName.LUMINOSITY, LUMINOSITY);
        hashMap.put(COSName.COLOR, COLOR);
        return hashMap;
    }

    /* renamed from: d */
    public static Map m32409d() {
        HashMap hashMap = new HashMap(13);
        SeparableBlendMode separableBlendMode = NORMAL;
        COSName cOSName = COSName.NORMAL;
        hashMap.put(separableBlendMode, cOSName);
        hashMap.put(COMPATIBLE, cOSName);
        hashMap.put(MULTIPLY, COSName.MULTIPLY);
        hashMap.put(SCREEN, COSName.SCREEN);
        hashMap.put(OVERLAY, COSName.OVERLAY);
        hashMap.put(DARKEN, COSName.DARKEN);
        hashMap.put(LIGHTEN, COSName.LIGHTEN);
        hashMap.put(COLOR_DODGE, COSName.COLOR_DODGE);
        hashMap.put(COLOR_BURN, COSName.COLOR_BURN);
        hashMap.put(HARD_LIGHT, COSName.HARD_LIGHT);
        hashMap.put(SOFT_LIGHT, COSName.SOFT_LIGHT);
        hashMap.put(DIFFERENCE, COSName.DIFFERENCE);
        hashMap.put(EXCLUSION, COSName.EXCLUSION);
        hashMap.put(HUE, COSName.HUE);
        hashMap.put(SATURATION, COSName.SATURATION);
        hashMap.put(LUMINOSITY, COSName.LUMINOSITY);
        hashMap.put(COLOR, COSName.COLOR);
        return hashMap;
    }

    /* renamed from: e */
    public static int m32408e(float f) {
        double d = f;
        double d2 = 255.0d;
        if (d < 1.0d) {
            d2 = 255.0d * d;
        }
        return (int) Math.floor(d2);
    }

    /* renamed from: f */
    public static void m32407f(float[] fArr, float[] fArr2, float[] fArr3) {
        int i;
        int m32408e = m32408e(fArr2[0]);
        int m32408e2 = m32408e(fArr2[1]);
        int m32408e3 = m32408e(fArr2[2]);
        int m32408e4 = m32408e(fArr[0]);
        int m32408e5 = m32408e(fArr[1]);
        int m32408e6 = m32408e(fArr[2]);
        int i2 = (((((m32408e4 - m32408e) * 77) + ((m32408e5 - m32408e2) * 151)) + ((m32408e6 - m32408e3) * 28)) + 128) >> 8;
        int i3 = m32408e + i2;
        int i4 = m32408e2 + i2;
        int i5 = m32408e3 + i2;
        if (((i3 | i4 | i5) & 256) == 256) {
            int i6 = ((((m32408e4 * 77) + (m32408e5 * 151)) + (m32408e6 * 28)) + 128) >> 8;
            if (i2 > 0) {
                int max = Math.max(i3, Math.max(i4, i5));
                if (max != i6) {
                    i = ((255 - i6) << 16) / (max - i6);
                    i3 = ((((i3 - i6) * i) + 32768) >> 16) + i6;
                    i4 = ((((i4 - i6) * i) + 32768) >> 16) + i6;
                    i5 = ((((i5 - i6) * i) + 32768) >> 16) + i6;
                }
                i = 0;
                i3 = ((((i3 - i6) * i) + 32768) >> 16) + i6;
                i4 = ((((i4 - i6) * i) + 32768) >> 16) + i6;
                i5 = ((((i5 - i6) * i) + 32768) >> 16) + i6;
            } else {
                int min = Math.min(i3, Math.min(i4, i5));
                if (i6 != min) {
                    i = (i6 << 16) / (i6 - min);
                    i3 = ((((i3 - i6) * i) + 32768) >> 16) + i6;
                    i4 = ((((i4 - i6) * i) + 32768) >> 16) + i6;
                    i5 = ((((i5 - i6) * i) + 32768) >> 16) + i6;
                }
                i = 0;
                i3 = ((((i3 - i6) * i) + 32768) >> 16) + i6;
                i4 = ((((i4 - i6) * i) + 32768) >> 16) + i6;
                i5 = ((((i5 - i6) * i) + 32768) >> 16) + i6;
            }
        }
        fArr3[0] = i3 / 255.0f;
        fArr3[1] = i4 / 255.0f;
        fArr3[2] = i5 / 255.0f;
    }

    /* renamed from: g */
    public static void m32406g(float[] fArr, float[] fArr2, float[] fArr3) {
        int i;
        int m32408e = m32408e(fArr2[0]);
        int m32408e2 = m32408e(fArr2[1]);
        int m32408e3 = m32408e(fArr2[2]);
        int m32408e4 = m32408e(fArr[0]);
        int m32408e5 = m32408e(fArr[1]);
        int m32408e6 = m32408e(fArr[2]);
        int min = Math.min(m32408e, Math.min(m32408e2, m32408e3));
        int max = Math.max(m32408e, Math.max(m32408e2, m32408e3));
        if (min == max) {
            float f = m32408e2 / 255.0f;
            fArr3[0] = f;
            fArr3[1] = f;
            fArr3[2] = f;
            return;
        }
        int max2 = ((Math.max(m32408e4, Math.max(m32408e5, m32408e6)) - Math.min(m32408e4, Math.min(m32408e5, m32408e6))) << 16) / (max - min);
        int i2 = ((((m32408e * 77) + (m32408e2 * 151)) + (m32408e3 * 28)) + 128) >> 8;
        int i3 = ((((m32408e - i2) * max2) + 32768) >> 16) + i2;
        int i4 = ((((m32408e2 - i2) * max2) + 32768) >> 16) + i2;
        int i5 = ((((m32408e3 - i2) * max2) + 32768) >> 16) + i2;
        if (((i3 | i4 | i5) & 256) == 256) {
            int min2 = Math.min(i3, Math.min(i4, i5));
            int max3 = Math.max(i3, Math.max(i4, i5));
            int i6 = 65536;
            if (min2 < 0) {
                i = (i2 << 16) / (i2 - min2);
            } else {
                i = 65536;
            }
            if (max3 > 255) {
                i6 = ((255 - i2) << 16) / (max3 - i2);
            }
            int min3 = Math.min(i, i6);
            i3 = ((((i3 - i2) * min3) + 32768) >> 16) + i2;
            i4 = ((((i4 - i2) * min3) + 32768) >> 16) + i2;
            i5 = ((((i5 - i2) * min3) + 32768) >> 16) + i2;
        }
        fArr3[0] = i3 / 255.0f;
        fArr3[1] = i4 / 255.0f;
        fArr3[2] = i5 / 255.0f;
    }

    public static COSName getCOSName(BlendMode blendMode) {
        return (COSName) f60463b.get(blendMode);
    }

    public static BlendMode getInstance(COSBase cOSBase) {
        BlendMode blendMode;
        if (cOSBase instanceof COSName) {
            blendMode = (BlendMode) f60462a.get(cOSBase);
        } else {
            BlendMode blendMode2 = null;
            if (cOSBase instanceof COSArray) {
                COSArray cOSArray = (COSArray) cOSBase;
                for (int i = 0; i < cOSArray.size() && (blendMode2 = (BlendMode) f60462a.get(cOSArray.getObject(i))) == null; i++) {
                }
            }
            blendMode = blendMode2;
        }
        if (blendMode != null) {
            return blendMode;
        }
        return NORMAL;
    }
}
