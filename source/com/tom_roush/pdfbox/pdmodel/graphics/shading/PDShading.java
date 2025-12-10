package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.function.PDFunction;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class PDShading implements COSObjectable {
    public static final int SHADING_TYPE1 = 1;
    public static final int SHADING_TYPE2 = 2;
    public static final int SHADING_TYPE3 = 3;
    public static final int SHADING_TYPE4 = 4;
    public static final int SHADING_TYPE5 = 5;
    public static final int SHADING_TYPE6 = 6;
    public static final int SHADING_TYPE7 = 7;

    /* renamed from: a */
    public final COSDictionary f60515a;

    /* renamed from: b */
    public COSArray f60516b;

    /* renamed from: c */
    public PDRectangle f60517c;

    /* renamed from: d */
    public PDColorSpace f60518d;

    /* renamed from: e */
    public PDFunction f60519e;

    /* renamed from: f */
    public PDFunction[] f60520f;

    public PDShading() {
        this.f60516b = null;
        this.f60517c = null;
        this.f60518d = null;
        this.f60519e = null;
        this.f60520f = null;
        this.f60515a = new COSDictionary();
    }

    public static PDShading create(COSDictionary cOSDictionary) throws IOException {
        int i = cOSDictionary.getInt(COSName.SHADING_TYPE, 0);
        switch (i) {
            case 1:
                return new PDShadingType1(cOSDictionary);
            case 2:
                return new PDShadingType2(cOSDictionary);
            case 3:
                return new PDShadingType3(cOSDictionary);
            case 4:
                return new PDShadingType4(cOSDictionary);
            case 5:
                return new PDShadingType5(cOSDictionary);
            case 6:
                return new PDShadingType6(cOSDictionary);
            case 7:
                return new PDShadingType7(cOSDictionary);
            default:
                throw new IOException("Error: Unknown shading type " + i);
        }
    }

    /* renamed from: a */
    public final PDFunction[] m32366a() {
        if (this.f60520f == null) {
            COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.FUNCTION);
            if (dictionaryObject instanceof COSDictionary) {
                this.f60520f = r1;
                PDFunction[] pDFunctionArr = {PDFunction.create(dictionaryObject)};
            } else if (dictionaryObject instanceof COSArray) {
                COSArray cOSArray = (COSArray) dictionaryObject;
                int size = cOSArray.size();
                this.f60520f = new PDFunction[size];
                for (int i = 0; i < size; i++) {
                    this.f60520f[i] = PDFunction.create(cOSArray.get(i));
                }
            } else {
                throw new IOException("mandatory /Function element must be a dictionary or an array");
            }
        }
        return this.f60520f;
    }

    public float[] evalFunction(float f) throws IOException {
        return evalFunction(new float[]{f});
    }

    public boolean getAntiAlias() {
        return this.f60515a.getBoolean(COSName.ANTI_ALIAS, false);
    }

    public PDRectangle getBBox() {
        COSArray cOSArray;
        if (this.f60517c == null && (cOSArray = (COSArray) this.f60515a.getDictionaryObject(COSName.BBOX)) != null) {
            this.f60517c = new PDRectangle(cOSArray);
        }
        return this.f60517c;
    }

    public COSArray getBackground() {
        if (this.f60516b == null) {
            this.f60516b = (COSArray) this.f60515a.getDictionaryObject(COSName.BACKGROUND);
        }
        return this.f60516b;
    }

    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) throws IOException {
        return null;
    }

    public PDColorSpace getColorSpace() throws IOException {
        if (this.f60518d == null) {
            this.f60518d = PDColorSpace.create(this.f60515a.getDictionaryObject(COSName.f59769CS, COSName.COLORSPACE));
        }
        return this.f60518d;
    }

    public PDFunction getFunction() throws IOException {
        COSBase dictionaryObject;
        if (this.f60519e == null && (dictionaryObject = getCOSObject().getDictionaryObject(COSName.FUNCTION)) != null) {
            this.f60519e = PDFunction.create(dictionaryObject);
        }
        return this.f60519e;
    }

    public abstract int getShadingType();

    public String getType() {
        return COSName.SHADING.getName();
    }

    public void setAntiAlias(boolean z) {
        this.f60515a.setBoolean(COSName.ANTI_ALIAS, z);
    }

    public void setBBox(PDRectangle pDRectangle) {
        this.f60517c = pDRectangle;
        if (pDRectangle == null) {
            this.f60515a.removeItem(COSName.BBOX);
        } else {
            this.f60515a.setItem(COSName.BBOX, (COSBase) pDRectangle.getCOSArray());
        }
    }

    public void setBackground(COSArray cOSArray) {
        this.f60516b = cOSArray;
        this.f60515a.setItem(COSName.BACKGROUND, (COSBase) cOSArray);
    }

    public void setColorSpace(PDColorSpace pDColorSpace) {
        this.f60518d = pDColorSpace;
        if (pDColorSpace != null) {
            this.f60515a.setItem(COSName.COLORSPACE, pDColorSpace.getCOSObject());
        } else {
            this.f60515a.removeItem(COSName.COLORSPACE);
        }
    }

    public void setFunction(PDFunction pDFunction) {
        this.f60520f = null;
        this.f60519e = pDFunction;
        getCOSObject().setItem(COSName.FUNCTION, pDFunction);
    }

    public void setShadingType(int i) {
        this.f60515a.setInt(COSName.SHADING_TYPE, i);
    }

    public float[] evalFunction(float[] fArr) throws IOException {
        float[] fArr2;
        PDFunction[] m32366a = m32366a();
        int length = m32366a.length;
        if (length == 1) {
            fArr2 = m32366a[0].eval(fArr);
        } else {
            float[] fArr3 = new float[length];
            for (int i = 0; i < length; i++) {
                fArr3[i] = m32366a[i].eval(fArr)[0];
            }
            fArr2 = fArr3;
        }
        for (int i2 = 0; i2 < fArr2.length; i2++) {
            float f = fArr2[i2];
            if (f < 0.0f) {
                fArr2[i2] = 0.0f;
            } else if (f > 1.0f) {
                fArr2[i2] = 1.0f;
            }
        }
        return fArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60515a;
    }

    public void setFunction(COSArray cOSArray) {
        this.f60520f = null;
        this.f60519e = null;
        getCOSObject().setItem(COSName.FUNCTION, (COSBase) cOSArray);
    }

    public PDShading(COSDictionary cOSDictionary) {
        this.f60516b = null;
        this.f60517c = null;
        this.f60518d = null;
        this.f60519e = null;
        this.f60520f = null;
        this.f60515a = cOSDictionary;
    }
}
