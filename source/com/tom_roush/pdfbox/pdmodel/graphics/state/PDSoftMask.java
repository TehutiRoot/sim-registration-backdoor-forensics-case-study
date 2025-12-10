package com.tom_roush.pdfbox.pdmodel.graphics.state;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.function.PDFunction;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class PDSoftMask implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60553a;

    /* renamed from: b */
    public COSName f60554b = null;

    /* renamed from: c */
    public PDTransparencyGroup f60555c = null;

    /* renamed from: d */
    public COSArray f60556d = null;

    /* renamed from: e */
    public PDFunction f60557e = null;

    /* renamed from: f */
    public Matrix f60558f;

    public PDSoftMask(COSDictionary cOSDictionary) {
        this.f60553a = cOSDictionary;
    }

    public static PDSoftMask create(COSBase cOSBase) {
        if (cOSBase instanceof COSName) {
            if (COSName.NONE.equals(cOSBase)) {
                return null;
            }
            Log.w("PdfBox-Android", "Invalid SMask " + cOSBase);
            return null;
        } else if (cOSBase instanceof COSDictionary) {
            return new PDSoftMask((COSDictionary) cOSBase);
        } else {
            Log.w("PdfBox-Android", "Invalid SMask " + cOSBase);
            return null;
        }
    }

    /* renamed from: a */
    public void m32361a(Matrix matrix) {
        this.f60558f = matrix;
    }

    public COSArray getBackdropColor() {
        if (this.f60556d == null) {
            this.f60556d = (COSArray) getCOSObject().getDictionaryObject(COSName.f59754BC);
        }
        return this.f60556d;
    }

    public PDTransparencyGroup getGroup() throws IOException {
        COSBase dictionaryObject;
        if (this.f60555c == null && (dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59787G)) != null) {
            PDXObject createXObject = PDXObject.createXObject(dictionaryObject, null);
            if (createXObject instanceof PDTransparencyGroup) {
                this.f60555c = (PDTransparencyGroup) createXObject;
            }
        }
        return this.f60555c;
    }

    public Matrix getInitialTransformationMatrix() {
        return this.f60558f;
    }

    public COSName getSubType() {
        if (this.f60554b == null) {
            this.f60554b = (COSName) getCOSObject().getDictionaryObject(COSName.f59824S);
        }
        return this.f60554b;
    }

    public PDFunction getTransferFunction() throws IOException {
        COSBase dictionaryObject;
        if (this.f60557e == null && (dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59837TR)) != null) {
            this.f60557e = PDFunction.create(dictionaryObject);
        }
        return this.f60557e;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60553a;
    }
}
