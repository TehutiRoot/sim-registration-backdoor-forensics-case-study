package com.tom_roush.pdfbox.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.net.SyslogConstants;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.util.Matrix;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public final class TextPosition {

    /* renamed from: r */
    public static final Map f60828r = m32101b();

    /* renamed from: a */
    public final Matrix f60829a;

    /* renamed from: b */
    public final float f60830b;

    /* renamed from: c */
    public final float f60831c;

    /* renamed from: d */
    public final float f60832d;

    /* renamed from: e */
    public final int f60833e;

    /* renamed from: f */
    public final float f60834f;

    /* renamed from: g */
    public final float f60835g;

    /* renamed from: h */
    public final float f60836h;

    /* renamed from: i */
    public final float f60837i;

    /* renamed from: j */
    public final float f60838j;

    /* renamed from: k */
    public final int[] f60839k;

    /* renamed from: l */
    public final PDFont f60840l;

    /* renamed from: m */
    public final float f60841m;

    /* renamed from: n */
    public final int f60842n;

    /* renamed from: o */
    public float[] f60843o;

    /* renamed from: p */
    public String f60844p;

    /* renamed from: q */
    public float f60845q = -1.0f;

    public TextPosition(int i, float f, float f2, Matrix matrix, float f3, float f4, float f5, float f6, float f7, String str, int[] iArr, PDFont pDFont, float f8, int i2) {
        this.f60829a = matrix;
        this.f60830b = f3;
        this.f60831c = f4;
        this.f60833e = i;
        this.f60832d = f5;
        this.f60836h = f2;
        this.f60837i = f;
        this.f60843o = new float[]{f6};
        this.f60838j = f7;
        this.f60844p = str;
        this.f60839k = iArr;
        this.f60840l = pDFont;
        this.f60841m = f8;
        this.f60842n = i2;
        this.f60834f = m32099d(i);
        if (i != 0 && i != 180) {
            this.f60835g = f - m32098e(i);
        } else {
            this.f60835g = f2 - m32098e(i);
        }
    }

    /* renamed from: b */
    public static Map m32101b() {
        HashMap hashMap = new HashMap(31);
        hashMap.put(96, "̀");
        hashMap.put(715, "̀");
        hashMap.put(39, "́");
        hashMap.put(697, "́");
        hashMap.put(714, "́");
        hashMap.put(94, "̂");
        hashMap.put(710, "̂");
        hashMap.put(Integer.valueOf((int) WebSocketProtocol.PAYLOAD_SHORT), "̃");
        hashMap.put(713, "̄");
        hashMap.put(Integer.valueOf((int) SyslogConstants.LOG_LOCAL6), "̊");
        hashMap.put(698, "̋");
        hashMap.put(711, "̌");
        hashMap.put(712, "̍");
        hashMap.put(34, "̎");
        hashMap.put(699, "̒");
        hashMap.put(700, "̓");
        hashMap.put(1158, "̓");
        hashMap.put(1370, "̓");
        hashMap.put(Integer.valueOf((int) TypedValues.TransitionType.TYPE_FROM), "̔");
        hashMap.put(1157, "̔");
        hashMap.put(1369, "̔");
        hashMap.put(724, "̝");
        hashMap.put(725, "̞");
        hashMap.put(726, "̟");
        hashMap.put(727, "̠");
        hashMap.put(690, "̡");
        hashMap.put(716, "̩");
        hashMap.put(695, "̫");
        hashMap.put(717, "̱");
        hashMap.put(95, "̲");
        hashMap.put(8270, "͙");
        return hashMap;
    }

    /* renamed from: a */
    public final String m32102a(String str) {
        int codePointAt = str.codePointAt(0);
        Map map = f60828r;
        if (map.containsKey(Integer.valueOf(codePointAt))) {
            return (String) map.get(Integer.valueOf(codePointAt));
        }
        return Normalizer.normalize(str, Normalizer.Form.NFKC).trim();
    }

    /* renamed from: c */
    public final float m32100c(float f) {
        if (f != 90.0f && f != 270.0f) {
            return Math.abs(this.f60830b - this.f60829a.getTranslateX());
        }
        return Math.abs(this.f60831c - this.f60829a.getTranslateY());
    }

    public boolean contains(TextPosition textPosition) {
        double xDirAdj = getXDirAdj();
        double widthDirAdj = getWidthDirAdj();
        double d = xDirAdj + widthDirAdj;
        double xDirAdj2 = textPosition.getXDirAdj();
        double widthDirAdj2 = textPosition.getWidthDirAdj() + xDirAdj2;
        if (widthDirAdj2 > xDirAdj && xDirAdj2 < d) {
            double yDirAdj = getYDirAdj();
            double yDirAdj2 = textPosition.getYDirAdj();
            if (textPosition.getHeightDir() + yDirAdj2 >= yDirAdj && yDirAdj2 <= yDirAdj + getHeightDir()) {
                if (xDirAdj2 > xDirAdj && widthDirAdj2 > d) {
                    if ((d - xDirAdj2) / widthDirAdj <= 0.15d) {
                        return false;
                    }
                    return true;
                } else if (xDirAdj2 < xDirAdj && widthDirAdj2 < d && (widthDirAdj2 - xDirAdj) / widthDirAdj <= 0.15d) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final float m32099d(float f) {
        if (f == 0.0f) {
            return this.f60829a.getTranslateX();
        }
        if (f == 90.0f) {
            return this.f60829a.getTranslateY();
        }
        if (f == 180.0f) {
            return this.f60837i - this.f60829a.getTranslateX();
        }
        if (f != 270.0f) {
            return 0.0f;
        }
        return this.f60836h - this.f60829a.getTranslateY();
    }

    /* renamed from: e */
    public final float m32098e(float f) {
        if (f == 0.0f) {
            return this.f60829a.getTranslateY();
        }
        if (f == 90.0f) {
            return this.f60837i - this.f60829a.getTranslateX();
        }
        if (f == 180.0f) {
            return this.f60836h - this.f60829a.getTranslateY();
        }
        if (f != 270.0f) {
            return 0.0f;
        }
        return this.f60829a.getTranslateX();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextPosition)) {
            return false;
        }
        TextPosition textPosition = (TextPosition) obj;
        if (Float.compare(textPosition.f60830b, this.f60830b) != 0 || Float.compare(textPosition.f60831c, this.f60831c) != 0 || Float.compare(textPosition.f60832d, this.f60832d) != 0 || this.f60833e != textPosition.f60833e || Float.compare(textPosition.f60834f, this.f60834f) != 0 || Float.compare(textPosition.f60835g, this.f60835g) != 0 || Float.compare(textPosition.f60836h, this.f60836h) != 0 || Float.compare(textPosition.f60837i, this.f60837i) != 0 || Float.compare(textPosition.f60838j, this.f60838j) != 0 || Float.compare(textPosition.f60841m, this.f60841m) != 0 || this.f60842n != textPosition.f60842n) {
            return false;
        }
        Matrix matrix = this.f60829a;
        if (matrix == null ? textPosition.f60829a != null : !matrix.equals(textPosition.f60829a)) {
            return false;
        }
        if (!Arrays.equals(this.f60839k, textPosition.f60839k)) {
            return false;
        }
        PDFont pDFont = this.f60840l;
        PDFont pDFont2 = textPosition.f60840l;
        if (pDFont != null) {
            return pDFont.equals(pDFont2);
        }
        if (pDFont2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m32097f(int i, TextPosition textPosition) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f60844p, 0, i);
        float[] fArr = this.f60843o;
        float[] fArr2 = new float[fArr.length + 1];
        System.arraycopy(fArr, 0, fArr2, 0, i);
        sb.append(this.f60844p.charAt(i));
        fArr2[i] = this.f60843o[i];
        sb.append(m32102a(textPosition.getUnicode()));
        int i2 = i + 1;
        fArr2[i2] = 0.0f;
        sb.append(this.f60844p.substring(i2));
        float[] fArr3 = this.f60843o;
        System.arraycopy(fArr3, i2, fArr2, i + 2, (fArr3.length - i) - 1);
        this.f60844p = sb.toString();
        this.f60843o = fArr2;
    }

    public int[] getCharacterCodes() {
        return this.f60839k;
    }

    public float getDir() {
        if (this.f60845q < 0.0f) {
            float scaleY = this.f60829a.getScaleY();
            float shearY = this.f60829a.getShearY();
            float shearX = this.f60829a.getShearX();
            float scaleX = this.f60829a.getScaleX();
            if (scaleY > 0.0f && Math.abs(shearY) < scaleX && Math.abs(shearX) < scaleY && scaleX > 0.0f) {
                this.f60845q = 0.0f;
            } else if (scaleY < 0.0f && Math.abs(shearY) < Math.abs(scaleX) && Math.abs(shearX) < Math.abs(scaleY) && scaleX < 0.0f) {
                this.f60845q = 180.0f;
            } else if (Math.abs(scaleY) < Math.abs(shearX) && shearY > 0.0f && shearX < 0.0f && Math.abs(scaleX) < shearY) {
                this.f60845q = 90.0f;
            } else if (Math.abs(scaleY) < shearX && shearY < 0.0f && shearX > 0.0f && Math.abs(scaleX) < Math.abs(shearY)) {
                this.f60845q = 270.0f;
            } else {
                this.f60845q = 0.0f;
            }
        }
        return this.f60845q;
    }

    public float getEndX() {
        return this.f60830b;
    }

    public float getEndY() {
        return this.f60831c;
    }

    public PDFont getFont() {
        return this.f60840l;
    }

    public float getFontSize() {
        return this.f60841m;
    }

    public float getFontSizeInPt() {
        return this.f60842n;
    }

    public float getHeight() {
        return this.f60832d;
    }

    public float getHeightDir() {
        return this.f60832d;
    }

    public float[] getIndividualWidths() {
        return this.f60843o;
    }

    public float getPageHeight() {
        return this.f60836h;
    }

    public float getPageWidth() {
        return this.f60837i;
    }

    public int getRotation() {
        return this.f60833e;
    }

    public Matrix getTextMatrix() {
        return this.f60829a;
    }

    public String getUnicode() {
        return this.f60844p;
    }

    public float getWidth() {
        return m32100c(this.f60833e);
    }

    public float getWidthDirAdj() {
        return m32100c(getDir());
    }

    public float getWidthOfSpace() {
        return this.f60838j;
    }

    public float getX() {
        return this.f60834f;
    }

    public float getXDirAdj() {
        return m32099d(getDir());
    }

    public float getXScale() {
        return this.f60829a.getScalingFactorX();
    }

    public float getY() {
        return this.f60835g;
    }

    public float getYDirAdj() {
        float f;
        float m32098e;
        float dir = getDir();
        if (dir != 0.0f && dir != 180.0f) {
            f = this.f60837i;
            m32098e = m32098e(dir);
        } else {
            f = this.f60836h;
            m32098e = m32098e(dir);
        }
        return f - m32098e;
    }

    public float getYScale() {
        return this.f60829a.getScalingFactorY();
    }

    public int hashCode() {
        int i;
        Matrix matrix = this.f60829a;
        int i2 = 0;
        if (matrix != null) {
            i = matrix.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = ((((((((((((((((((((i * 31) + Float.floatToIntBits(this.f60830b)) * 31) + Float.floatToIntBits(this.f60831c)) * 31) + Float.floatToIntBits(this.f60832d)) * 31) + this.f60833e) * 31) + Float.floatToIntBits(this.f60834f)) * 31) + Float.floatToIntBits(this.f60835g)) * 31) + Float.floatToIntBits(this.f60836h)) * 31) + Float.floatToIntBits(this.f60837i)) * 31) + Float.floatToIntBits(this.f60838j)) * 31) + Arrays.hashCode(this.f60839k)) * 31;
        PDFont pDFont = this.f60840l;
        if (pDFont != null) {
            i2 = pDFont.hashCode();
        }
        return ((((floatToIntBits + i2) * 31) + Float.floatToIntBits(this.f60841m)) * 31) + this.f60842n;
    }

    public boolean isDiacritic() {
        String unicode = getUnicode();
        if (unicode.length() != 1 || "ー".equals(unicode)) {
            return false;
        }
        int type = Character.getType(unicode.charAt(0));
        if (type != 6 && type != 27 && type != 4) {
            return false;
        }
        return true;
    }

    public void mergeDiacritic(TextPosition textPosition) {
        if (textPosition.getUnicode().length() > 1) {
            return;
        }
        float xDirAdj = textPosition.getXDirAdj();
        float f = textPosition.f60843o[0] + xDirAdj;
        float xDirAdj2 = getXDirAdj();
        int length = this.f60844p.length();
        float f2 = xDirAdj2;
        boolean z = false;
        for (int i = 0; i < length && !z; i++) {
            float[] fArr = this.f60843o;
            if (i >= fArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("diacritic ");
                sb.append(textPosition.getUnicode());
                sb.append(" on ligature ");
                sb.append(this.f60844p);
                sb.append(" is not supported yet and is ignored (PDFBOX-2831)");
                return;
            }
            float f3 = fArr[i];
            float f4 = f2 + f3;
            int i2 = (xDirAdj > f2 ? 1 : (xDirAdj == f2 ? 0 : -1));
            if (i2 < 0 && f <= f4) {
                if (i == 0) {
                    m32097f(i, textPosition);
                } else {
                    int i3 = i - 1;
                    if ((f - f2) / f3 >= (f2 - xDirAdj) / fArr[i3]) {
                        m32097f(i, textPosition);
                    } else {
                        m32097f(i3, textPosition);
                    }
                }
            } else if (i2 < 0) {
                m32097f(i, textPosition);
            } else if (f <= f4) {
                m32097f(i, textPosition);
            } else if (i == length - 1) {
                m32097f(i, textPosition);
            } else {
                f2 += this.f60843o[i];
            }
            z = true;
            f2 += this.f60843o[i];
        }
    }

    public String toString() {
        return getUnicode();
    }
}
