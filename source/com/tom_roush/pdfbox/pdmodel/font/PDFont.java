package com.tom_roush.pdfbox.pdmodel.font;

import android.util.Log;
import com.tom_roush.fontbox.afm.FontMetrics;
import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public abstract class PDFont implements COSObjectable, PDFontLike {
    protected static final Matrix DEFAULT_FONT_MATRIX = new Matrix(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);

    /* renamed from: a */
    public final CMap f60384a;

    /* renamed from: b */
    public final FontMetrics f60385b;

    /* renamed from: c */
    public PDFontDescriptor f60386c;

    /* renamed from: d */
    public List f60387d;
    protected final COSDictionary dict;

    /* renamed from: e */
    public float f60388e;

    /* renamed from: f */
    public float f60389f;

    /* renamed from: g */
    public final Map f60390g;

    public PDFont() {
        this.f60389f = -1.0f;
        COSDictionary cOSDictionary = new COSDictionary();
        this.dict = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT);
        this.f60384a = null;
        this.f60386c = null;
        this.f60385b = null;
        this.f60390g = new HashMap();
    }

    /* renamed from: a */
    public final PDFontDescriptor m32434a() {
        COSDictionary cOSDictionary = this.dict.getCOSDictionary(COSName.FONT_DESC);
        if (cOSDictionary != null) {
            return new PDFontDescriptor(cOSDictionary);
        }
        FontMetrics fontMetrics = this.f60385b;
        if (fontMetrics != null) {
            return C21971rh1.m23286a(fontMetrics);
        }
        return null;
    }

    public abstract void addToSubset(int i);

    /* renamed from: b */
    public final CMap m32433b() {
        String str;
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.TO_UNICODE);
        CMap cMap = null;
        if (dictionaryObject == null) {
            return null;
        }
        try {
            CMap readCMap = readCMap(dictionaryObject);
            if (readCMap != null && !readCMap.hasUnicodeMappings()) {
                Log.w("PdfBox-Android", "Invalid ToUnicode CMap in font " + getName());
                String str2 = "";
                if (readCMap.getName() == null) {
                    str = "";
                } else {
                    str = readCMap.getName();
                }
                if (readCMap.getOrdering() != null) {
                    str2 = readCMap.getOrdering();
                }
                COSBase dictionaryObject2 = this.dict.getDictionaryObject(COSName.ENCODING);
                if (str.contains("Identity") || str2.contains("Identity") || COSName.IDENTITY_H.equals(dictionaryObject2) || COSName.IDENTITY_V.equals(dictionaryObject2)) {
                    cMap = AbstractC10398hg.m30791a(COSName.IDENTITY_H.getName());
                    Log.w("PdfBox-Android", "Using predefined identity CMap instead");
                    return cMap;
                }
                return readCMap;
            }
            return readCMap;
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not read ToUnicode CMap in font ");
            sb.append(getName());
            return cMap;
        }
    }

    public abstract byte[] encode(int i) throws IOException;

    public final byte[] encode(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            byteArrayOutputStream.write(encode(codePointAt));
            i += Character.charCount(codePointAt);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PDFont) && ((PDFont) obj).getCOSObject() == getCOSObject()) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        float f;
        float f2;
        float f3 = this.f60388e;
        if (f3 == 0.0f) {
            COSArray cOSArray = this.dict.getCOSArray(COSName.WIDTHS);
            if (cOSArray != null) {
                f = 0.0f;
                f2 = 0.0f;
                for (int i = 0; i < cOSArray.size(); i++) {
                    COSNumber cOSNumber = (COSNumber) cOSArray.getObject(i);
                    if (cOSNumber.floatValue() > 0.0f) {
                        f += cOSNumber.floatValue();
                        f2 += 1.0f;
                    }
                }
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (f > 0.0f) {
                f3 = f / f2;
            } else {
                f3 = 0.0f;
            }
            this.f60388e = f3;
        }
        return f3;
    }

    public Vector getDisplacement(int i) throws IOException {
        return new Vector(getWidth(i) / 1000.0f, 0.0f);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public PDFontDescriptor getFontDescriptor() {
        return this.f60386c;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        return DEFAULT_FONT_MATRIX;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Vector getPositionVector(int i) {
        throw new UnsupportedOperationException("Horizontal fonts have no position vector");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0033 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:30:0x0014, B:32:0x0018, B:34:0x001f, B:36:0x002c, B:38:0x0033, B:39:0x0039, B:41:0x003f, B:35:0x0026), top: B:46:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #0 {Exception -> 0x0046, blocks: (B:30:0x0014, B:32:0x0018, B:34:0x001f, B:36:0x002c, B:38:0x0033, B:39:0x0039, B:41:0x003f, B:35:0x0026), top: B:46:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float getSpaceWidth() {
        /*
            r3 = this;
            float r0 = r3.f60389f
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
            com.tom_roush.pdfbox.cos.COSDictionary r0 = r3.dict
            com.tom_roush.pdfbox.cos.COSName r1 = com.tom_roush.pdfbox.cos.COSName.TO_UNICODE
            com.tom_roush.pdfbox.cos.COSBase r0 = r0.getDictionaryObject(r1)
            r1 = 32
            if (r0 == 0) goto L26
            com.tom_roush.fontbox.cmap.CMap r0 = r3.f60384a     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L26
            int r0 = r0.getSpaceMapping()     // Catch: java.lang.Exception -> L46
            r2 = -1
            if (r0 <= r2) goto L2c
            float r0 = r3.getWidth(r0)     // Catch: java.lang.Exception -> L46
            r3.f60389f = r0     // Catch: java.lang.Exception -> L46
            goto L2c
        L26:
            float r0 = r3.getWidth(r1)     // Catch: java.lang.Exception -> L46
            r3.f60389f = r0     // Catch: java.lang.Exception -> L46
        L2c:
            float r0 = r3.f60389f     // Catch: java.lang.Exception -> L46
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            float r0 = r3.getWidthFromFont(r1)     // Catch: java.lang.Exception -> L46
            r3.f60389f = r0     // Catch: java.lang.Exception -> L46
        L39:
            float r0 = r3.f60389f     // Catch: java.lang.Exception -> L46
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L4a
            float r0 = r3.getAverageFontWidth()     // Catch: java.lang.Exception -> L46
            r3.f60389f = r0     // Catch: java.lang.Exception -> L46
            goto L4a
        L46:
            r0 = 1132068864(0x437a0000, float:250.0)
            r3.f60389f = r0
        L4a:
            float r0 = r3.f60389f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.PDFont.getSpaceWidth():float");
    }

    public final FontMetrics getStandard14AFM() {
        return this.f60385b;
    }

    public abstract float getStandard14Width(int i);

    public float getStringWidth(String str) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encode(str));
        float f = 0.0f;
        while (byteArrayInputStream.available() > 0) {
            f += getWidth(readCode(byteArrayInputStream));
        }
        return f;
    }

    public String getSubType() {
        return this.dict.getNameAsString(COSName.SUBTYPE);
    }

    public CMap getToUnicodeCMap() {
        return this.f60384a;
    }

    public String getType() {
        return this.dict.getNameAsString(COSName.TYPE);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i) throws IOException {
        Float f = (Float) this.f60390g.get(Integer.valueOf(i));
        if (f != null) {
            return f.floatValue();
        }
        if (this.dict.getDictionaryObject(COSName.WIDTHS) != null || this.dict.containsKey(COSName.MISSING_WIDTH)) {
            int i2 = this.dict.getInt(COSName.FIRST_CHAR, -1);
            int i3 = this.dict.getInt(COSName.LAST_CHAR, -1);
            int size = getWidths().size();
            int i4 = i - i2;
            if (size > 0 && i >= i2 && i <= i3 && i4 < size) {
                Float f2 = getWidths().get(i4);
                if (f2 == null) {
                    f2 = Float.valueOf(0.0f);
                }
                this.f60390g.put(Integer.valueOf(i), f2);
                return f2.floatValue();
            }
            PDFontDescriptor fontDescriptor = getFontDescriptor();
            if (fontDescriptor != null) {
                float missingWidth = fontDescriptor.getMissingWidth();
                this.f60390g.put(Integer.valueOf(i), Float.valueOf(missingWidth));
                return missingWidth;
            }
        }
        if (isStandard14()) {
            float standard14Width = getStandard14Width(i);
            this.f60390g.put(Integer.valueOf(i), Float.valueOf(standard14Width));
            return standard14Width;
        }
        float widthFromFont = getWidthFromFont(i);
        this.f60390g.put(Integer.valueOf(i), Float.valueOf(widthFromFont));
        return widthFromFont;
    }

    public final List<Float> getWidths() {
        if (this.f60387d == null) {
            COSArray cOSArray = this.dict.getCOSArray(COSName.WIDTHS);
            if (cOSArray != null) {
                this.f60387d = COSArrayList.convertFloatCOSArrayToList(cOSArray);
            } else {
                this.f60387d = Collections.emptyList();
            }
        }
        return this.f60387d;
    }

    public int hashCode() {
        return getCOSObject().hashCode();
    }

    public boolean isStandard14() {
        if (isEmbedded()) {
            return false;
        }
        return GL1.m68247a(getName());
    }

    public abstract boolean isVertical();

    public final CMap readCMap(COSBase cOSBase) throws IOException {
        if (cOSBase instanceof COSName) {
            return AbstractC10398hg.m30791a(((COSName) cOSBase).getName());
        }
        if (cOSBase instanceof COSStream) {
            COSInputStream cOSInputStream = null;
            try {
                cOSInputStream = ((COSStream) cOSBase).createInputStream();
                return AbstractC10398hg.m30790b(cOSInputStream);
            } finally {
                IOUtils.closeQuietly(cOSInputStream);
            }
        }
        throw new IOException("Expected Name or Stream");
    }

    public abstract int readCode(InputStream inputStream) throws IOException;

    public final void setFontDescriptor(PDFontDescriptor pDFontDescriptor) {
        this.f60386c = pDFontDescriptor;
    }

    public abstract void subset() throws IOException;

    public String toString() {
        return getClass().getSimpleName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + getName();
    }

    public String toUnicode(int i, GlyphList glyphList) throws IOException {
        return toUnicode(i);
    }

    public abstract boolean willBeSubset();

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }

    public String toUnicode(int i) throws IOException {
        CMap cMap = this.f60384a;
        if (cMap != null) {
            if (cMap.getName() != null && this.f60384a.getName().startsWith("Identity-") && ((this.dict.getDictionaryObject(COSName.TO_UNICODE) instanceof COSName) || !this.f60384a.hasUnicodeMappings())) {
                return new String(new char[]{(char) i});
            }
            return this.f60384a.toUnicode(i);
        }
        return null;
    }

    public PDFont(String str) {
        this.f60389f = -1.0f;
        COSDictionary cOSDictionary = new COSDictionary();
        this.dict = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT);
        this.f60384a = null;
        FontMetrics m68246b = GL1.m68246b(str);
        this.f60385b = m68246b;
        if (m68246b != null) {
            this.f60386c = C21971rh1.m23286a(m68246b);
            this.f60390g = new ConcurrentHashMap();
            return;
        }
        throw new IllegalArgumentException("No AFM for font " + str);
    }

    public PDFont(COSDictionary cOSDictionary) throws IOException {
        this.f60389f = -1.0f;
        this.dict = cOSDictionary;
        this.f60390g = new HashMap();
        this.f60385b = GL1.m68246b(getName());
        this.f60386c = m32434a();
        this.f60384a = m32433b();
    }
}
