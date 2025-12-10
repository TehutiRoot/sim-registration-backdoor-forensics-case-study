package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class COSFloat extends COSNumber {

    /* renamed from: b */
    public BigDecimal f59741b;

    /* renamed from: c */
    public String f59742c;

    public COSFloat(float f) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
        this.f59741b = bigDecimal;
        this.f59742c = m32790g(bigDecimal.toPlainString());
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromFloat(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (java.lang.Math.abs(r1) < 1.1754943508222875E-38d) goto L11;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32791d() {
        /*
            r8 = this;
            java.math.BigDecimal r0 = r8.f59741b
            float r0 = r0.floatValue()
            java.math.BigDecimal r1 = r8.f59741b
            double r1 = r1.doubleValue()
            r3 = -8388608(0xffffffffff800000, float:-Infinity)
            r4 = 2139095040(0x7f800000, float:Infinity)
            r5 = 1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L30
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L1a
            goto L30
        L1a:
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L4b
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L4b
            double r1 = java.lang.Math.abs(r1)
            r3 = 4039728865751334912(0x3810000000000000, double:1.1754943508222875E-38)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L4b
            goto L4c
        L30:
            double r1 = java.lang.Math.abs(r1)
            r6 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L4b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = -1
        L44:
            float r0 = (float) r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = r0 * r1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r5 == 0) goto L5f
            double r0 = (double) r0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            r8.f59741b = r0
            java.lang.String r0 = r0.toPlainString()
            java.lang.String r0 = r8.m32790g(r0)
            r8.f59742c = r0
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.cos.COSFloat.m32791d():void");
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public double doubleValue() {
        return this.f59741b.doubleValue();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof COSFloat) && Float.floatToIntBits(((COSFloat) obj).f59741b.floatValue()) == Float.floatToIntBits(this.f59741b.floatValue())) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public float floatValue() {
        return this.f59741b.floatValue();
    }

    /* renamed from: g */
    public final String m32790g(String str) {
        if (str.indexOf(46) > -1 && !str.endsWith(".0")) {
            while (str.endsWith("0") && !str.endsWith(".0")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public int hashCode() {
        return this.f59741b.hashCode();
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public int intValue() {
        return this.f59741b.intValue();
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public long longValue() {
        return this.f59741b.longValue();
    }

    public String toString() {
        return "COSFloat{" + this.f59742c + "}";
    }

    public void writePDF(OutputStream outputStream) throws IOException {
        outputStream.write(this.f59742c.getBytes("ISO-8859-1"));
    }

    public COSFloat(String str) throws IOException {
        try {
            this.f59742c = str;
            this.f59741b = new BigDecimal(this.f59742c);
            m32791d();
        } catch (NumberFormatException e) {
            if (str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                this.f59742c = str.substring(1);
            } else if (str.matches("^0\\.0*\\-\\d+")) {
                this.f59742c = HelpFormatter.DEFAULT_OPT_PREFIX + this.f59742c.replaceFirst("\\-", "");
            } else {
                throw new IOException("Error expected floating point number actual='" + str + OperatorName.SHOW_TEXT_LINE, e);
            }
            try {
                this.f59741b = new BigDecimal(this.f59742c);
                m32791d();
            } catch (NumberFormatException e2) {
                throw new IOException("Error expected floating point number actual='" + str + OperatorName.SHOW_TEXT_LINE, e2);
            }
        }
    }
}
