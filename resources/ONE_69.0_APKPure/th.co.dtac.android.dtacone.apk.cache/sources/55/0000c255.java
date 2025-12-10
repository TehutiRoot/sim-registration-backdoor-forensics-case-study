package com.tom_roush.pdfbox.pdmodel.graphics.form;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class PDTransparencyGroupAttributes implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60487a;

    /* renamed from: b */
    public PDColorSpace f60488b;

    public PDTransparencyGroupAttributes() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60487a = cOSDictionary;
        cOSDictionary.setItem(COSName.f59836S, (COSBase) COSName.TRANSPARENCY);
    }

    public PDColorSpace getColorSpace() throws IOException {
        return getColorSpace(null);
    }

    public boolean isIsolated() {
        return getCOSObject().getBoolean(COSName.f59801I, false);
    }

    public boolean isKnockout() {
        return getCOSObject().getBoolean(COSName.f59809K, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60487a;
    }

    public PDColorSpace getColorSpace(PDResources pDResources) throws IOException {
        if (this.f60488b == null) {
            COSDictionary cOSObject = getCOSObject();
            COSName cOSName = COSName.f59781CS;
            if (cOSObject.containsKey(cOSName)) {
                this.f60488b = PDColorSpace.create(getCOSObject().getDictionaryObject(cOSName), pDResources);
            }
        }
        return this.f60488b;
    }

    public PDTransparencyGroupAttributes(COSDictionary cOSDictionary) {
        this.f60487a = cOSDictionary;
    }
}