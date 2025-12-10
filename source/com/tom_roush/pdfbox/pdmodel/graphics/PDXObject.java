package com.tom_roush.pdfbox.pdmodel.graphics;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDXObject implements COSObjectable {

    /* renamed from: a */
    public final PDStream f60461a;

    public PDXObject(COSStream cOSStream, COSName cOSName) {
        this.f60461a = new PDStream(cOSStream);
        cOSStream.setName(COSName.TYPE, COSName.XOBJECT.getName());
        cOSStream.setName(COSName.SUBTYPE, cOSName.getName());
    }

    public static PDXObject createXObject(COSBase cOSBase, PDResources pDResources) throws IOException {
        ResourceCache resourceCache = null;
        if (cOSBase == null) {
            return null;
        }
        if (cOSBase instanceof COSStream) {
            COSStream cOSStream = (COSStream) cOSBase;
            String nameAsString = cOSStream.getNameAsString(COSName.SUBTYPE);
            if (COSName.IMAGE.getName().equals(nameAsString)) {
                return new PDImageXObject(new PDStream(cOSStream), pDResources);
            }
            if (COSName.FORM.getName().equals(nameAsString)) {
                if (pDResources != null) {
                    resourceCache = pDResources.getResourceCache();
                }
                COSDictionary cOSDictionary = (COSDictionary) cOSStream.getDictionaryObject(COSName.GROUP);
                if (cOSDictionary != null && COSName.TRANSPARENCY.equals(cOSDictionary.getCOSName(COSName.f59824S))) {
                    return new PDTransparencyGroup(cOSStream, resourceCache);
                }
                return new PDFormXObject(cOSStream, resourceCache);
            } else if (COSName.f59817PS.getName().equals(nameAsString)) {
                return new PDPostScriptXObject(cOSStream);
            } else {
                throw new IOException("Invalid XObject Subtype: " + nameAsString);
            }
        }
        throw new IOException("Unexpected object type: " + cOSBase.getClass().getName());
    }

    @Deprecated
    public final COSStream getCOSStream() {
        return this.f60461a.getCOSObject();
    }

    @Deprecated
    public final PDStream getPDStream() {
        return this.f60461a;
    }

    public final PDStream getStream() {
        return this.f60461a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public final COSStream getCOSObject() {
        return this.f60461a.getCOSObject();
    }

    public PDXObject(PDStream pDStream, COSName cOSName) {
        this.f60461a = pDStream;
        pDStream.getCOSObject().setName(COSName.TYPE, COSName.XOBJECT.getName());
        pDStream.getCOSObject().setName(COSName.SUBTYPE, cOSName.getName());
    }

    public PDXObject(PDDocument pDDocument, COSName cOSName) {
        PDStream pDStream = new PDStream(pDDocument);
        this.f60461a = pDStream;
        pDStream.getCOSObject().setName(COSName.TYPE, COSName.XOBJECT.getName());
        pDStream.getCOSObject().setName(COSName.SUBTYPE, cOSName.getName());
    }
}
