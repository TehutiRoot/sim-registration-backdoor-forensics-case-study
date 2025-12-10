package com.tom_roush.pdfbox.pdmodel.font;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.util.Vector;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class PDCIDFont implements COSObjectable, PDFontLike, PDVectorFont {

    /* renamed from: a */
    public Map f60363a;

    /* renamed from: b */
    public float f60364b;

    /* renamed from: c */
    public float f60365c;
    protected final COSDictionary dict;

    /* renamed from: g */
    public PDFontDescriptor f60369g;
    protected final PDType0Font parent;

    /* renamed from: d */
    public final Map f60366d = new HashMap();

    /* renamed from: e */
    public final Map f60367e = new HashMap();

    /* renamed from: f */
    public float[] f60368f = {880.0f, -1000.0f};

    public PDCIDFont(COSDictionary cOSDictionary, PDType0Font pDType0Font) {
        this.dict = cOSDictionary;
        this.parent = pDType0Font;
        m32446f();
        m32447e();
    }

    /* renamed from: a */
    public final Vector m32451a(int i) {
        return new Vector(m32449c(i) / 2.0f, this.f60368f[0]);
    }

    /* renamed from: b */
    public final float m32450b() {
        if (this.f60364b == 0.0f) {
            COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.f59791DW);
            if (dictionaryObject instanceof COSNumber) {
                this.f60364b = ((COSNumber) dictionaryObject).floatValue();
            } else {
                this.f60364b = 1000.0f;
            }
        }
        return this.f60364b;
    }

    /* renamed from: c */
    public final float m32449c(int i) {
        Float f = (Float) this.f60363a.get(Integer.valueOf(i));
        if (f == null) {
            f = Float.valueOf(m32450b());
        }
        return f.floatValue();
    }

    public abstract int codeToCID(int i);

    public abstract int codeToGID(int i) throws IOException;

    /* renamed from: d */
    public final int[] m32448d() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.CID_TO_GID_MAP);
        if (dictionaryObject instanceof COSStream) {
            COSInputStream createInputStream = ((COSStream) dictionaryObject).createInputStream();
            byte[] byteArray = IOUtils.toByteArray(createInputStream);
            IOUtils.closeQuietly(createInputStream);
            int length = byteArray.length / 2;
            int[] iArr = new int[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = ((byteArray[i] & 255) << 8) | (byteArray[i + 1] & 255);
                i += 2;
            }
            return iArr;
        }
        return null;
    }

    /* renamed from: e */
    public final void m32447e() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.DW2);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            COSBase object = cOSArray.getObject(0);
            COSBase object2 = cOSArray.getObject(1);
            if ((object instanceof COSNumber) && (object2 instanceof COSNumber)) {
                this.f60368f[0] = ((COSNumber) object).floatValue();
                this.f60368f[1] = ((COSNumber) object2).floatValue();
            }
        }
        COSBase dictionaryObject2 = this.dict.getDictionaryObject(COSName.f59859W2);
        if (dictionaryObject2 instanceof COSArray) {
            COSArray cOSArray2 = (COSArray) dictionaryObject2;
            int i = 0;
            while (i < cOSArray2.size()) {
                COSNumber cOSNumber = (COSNumber) cOSArray2.getObject(i);
                int i2 = i + 1;
                COSBase object3 = cOSArray2.getObject(i2);
                if (object3 instanceof COSArray) {
                    COSArray cOSArray3 = (COSArray) object3;
                    for (int i3 = 0; i3 < cOSArray3.size(); i3 += 3) {
                        int intValue = cOSNumber.intValue() + (i3 / 3);
                        this.f60366d.put(Integer.valueOf(intValue), Float.valueOf(((COSNumber) cOSArray3.getObject(i3)).floatValue()));
                        this.f60367e.put(Integer.valueOf(intValue), new Vector(((COSNumber) cOSArray3.getObject(i3 + 1)).floatValue(), ((COSNumber) cOSArray3.getObject(i3 + 2)).floatValue()));
                    }
                } else {
                    int intValue2 = ((COSNumber) object3).intValue();
                    COSNumber cOSNumber2 = (COSNumber) cOSArray2.getObject(i + 2);
                    COSNumber cOSNumber3 = (COSNumber) cOSArray2.getObject(i + 3);
                    int i4 = i + 4;
                    COSNumber cOSNumber4 = (COSNumber) cOSArray2.getObject(i4);
                    for (int intValue3 = cOSNumber.intValue(); intValue3 <= intValue2; intValue3++) {
                        this.f60366d.put(Integer.valueOf(intValue3), Float.valueOf(cOSNumber2.floatValue()));
                        this.f60367e.put(Integer.valueOf(intValue3), new Vector(cOSNumber3.floatValue(), cOSNumber4.floatValue()));
                    }
                    i2 = i4;
                }
                i = i2 + 1;
            }
        }
    }

    public abstract byte[] encode(int i) throws IOException;

    /* renamed from: f */
    public final void m32446f() {
        this.f60363a = new HashMap();
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.f59858W);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            int size = cOSArray.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                COSBase object = cOSArray.getObject(i);
                if (!(object instanceof COSNumber)) {
                    Log.w("PdfBox-Android", "Expected a number array member, got " + object);
                    i = i2;
                } else {
                    COSNumber cOSNumber = (COSNumber) object;
                    int i3 = i + 2;
                    COSBase object2 = cOSArray.getObject(i2);
                    if (object2 instanceof COSArray) {
                        COSArray cOSArray2 = (COSArray) object2;
                        int intValue = cOSNumber.intValue();
                        int size2 = cOSArray2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            COSBase object3 = cOSArray2.getObject(i4);
                            if (object3 instanceof COSNumber) {
                                this.f60363a.put(Integer.valueOf(intValue + i4), Float.valueOf(((COSNumber) object3).floatValue()));
                            } else {
                                Log.w("PdfBox-Android", "Expected a number array member, got " + object3);
                            }
                        }
                        i = i3;
                    } else {
                        i += 3;
                        COSBase object4 = cOSArray.getObject(i3);
                        if ((object2 instanceof COSNumber) && (object4 instanceof COSNumber)) {
                            int intValue2 = ((COSNumber) object2).intValue();
                            float floatValue = ((COSNumber) object4).floatValue();
                            for (int intValue3 = cOSNumber.intValue(); intValue3 <= intValue2; intValue3++) {
                                this.f60363a.put(Integer.valueOf(intValue3), Float.valueOf(floatValue));
                            }
                        } else {
                            Log.w("PdfBox-Android", "Expected two numbers, got " + object2 + " and " + object4);
                        }
                    }
                }
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        float f;
        if (this.f60365c == 0.0f) {
            Map map = this.f60363a;
            int i = 0;
            if (map != null) {
                f = 0.0f;
                for (Float f2 : map.values()) {
                    if (f2.floatValue() > 0.0f) {
                        f += f2.floatValue();
                        i++;
                    }
                }
            } else {
                f = 0.0f;
            }
            if (i != 0) {
                this.f60365c = f / i;
            }
            float f3 = this.f60365c;
            if (f3 <= 0.0f || Float.isNaN(f3)) {
                this.f60365c = m32450b();
            }
        }
        return this.f60365c;
    }

    public String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    public PDCIDSystemInfo getCIDSystemInfo() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.CIDSYSTEMINFO);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDCIDSystemInfo((COSDictionary) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public PDFontDescriptor getFontDescriptor() {
        COSDictionary cOSDictionary;
        if (this.f60369g == null && (cOSDictionary = (COSDictionary) this.dict.getDictionaryObject(COSName.FONT_DESC)) != null) {
            this.f60369g = new PDFontDescriptor(cOSDictionary);
        }
        return this.f60369g;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    public final PDType0Font getParent() {
        return this.parent;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Vector getPositionVector(int i) {
        int codeToCID = codeToCID(i);
        Vector vector = (Vector) this.f60367e.get(Integer.valueOf(codeToCID));
        if (vector == null) {
            return m32451a(codeToCID);
        }
        return vector;
    }

    public float getVerticalDisplacementVectorY(int i) {
        Float f = (Float) this.f60366d.get(Integer.valueOf(codeToCID(i)));
        if (f == null) {
            f = Float.valueOf(this.f60368f[1]);
        }
        return f.floatValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i) throws IOException {
        return m32449c(codeToCID(i));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean hasExplicitWidth(int i) throws IOException {
        if (this.f60363a.get(Integer.valueOf(codeToCID(i))) != null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }
}