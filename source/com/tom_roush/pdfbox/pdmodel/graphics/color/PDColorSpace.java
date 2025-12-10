package com.tom_roush.pdfbox.pdmodel.graphics.color;

import android.graphics.Bitmap;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class PDColorSpace implements COSObjectable {
    protected COSArray array;

    /* renamed from: a */
    public static PDColorSpace m32405a(COSObject cOSObject, PDResources pDResources) {
        PDColorSpace colorSpace;
        if (pDResources != null && pDResources.getResourceCache() != null && (colorSpace = pDResources.getResourceCache().getColorSpace(cOSObject)) != null) {
            return colorSpace;
        }
        PDColorSpace create = create(cOSObject.getObject(), pDResources);
        if (pDResources != null && pDResources.getResourceCache() != null && create != null) {
            pDResources.getResourceCache().put(cOSObject, create);
        }
        return create;
    }

    public static PDColorSpace create(COSBase cOSBase) throws IOException {
        return create(cOSBase, null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.array;
    }

    public abstract float[] getDefaultDecode(int i);

    public abstract PDColor getInitialColor();

    public abstract String getName();

    public abstract int getNumberOfComponents();

    public abstract float[] toRGB(float[] fArr) throws IOException;

    public abstract Bitmap toRGBImage(Bitmap bitmap) throws IOException;

    public static PDColorSpace create(COSBase cOSBase, PDResources pDResources) throws IOException {
        return create(cOSBase, pDResources, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r5.hasColorSpace(r0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r5.hasColorSpace(r0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r5.hasColorSpace(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace create(com.tom_roush.pdfbox.cos.COSBase r4, com.tom_roush.pdfbox.pdmodel.PDResources r5, boolean r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace.create(com.tom_roush.pdfbox.cos.COSBase, com.tom_roush.pdfbox.pdmodel.PDResources, boolean):com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace");
    }
}
