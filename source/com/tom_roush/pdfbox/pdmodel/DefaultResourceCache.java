package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class DefaultResourceCache implements ResourceCache {

    /* renamed from: a */
    public final Map f60088a = new HashMap();

    /* renamed from: b */
    public final Map f60089b = new HashMap();

    /* renamed from: c */
    public final Map f60090c = new HashMap();

    /* renamed from: d */
    public final Map f60091d = new HashMap();

    /* renamed from: e */
    public final Map f60092e = new HashMap();

    /* renamed from: f */
    public final Map f60093f = new HashMap();

    /* renamed from: g */
    public final Map f60094g = new HashMap();

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDColorSpace getColorSpace(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60089b.get(cOSObject);
        if (softReference != null) {
            return (PDColorSpace) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDExtendedGraphicsState getExtGState(COSObject cOSObject) {
        SoftReference softReference = (SoftReference) this.f60091d.get(cOSObject);
        if (softReference != null) {
            return (PDExtendedGraphicsState) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDFont getFont(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60088a.get(cOSObject);
        if (softReference != null) {
            return (PDFont) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDAbstractPattern getPattern(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60093f.get(cOSObject);
        if (softReference != null) {
            return (PDAbstractPattern) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDPropertyList getProperties(COSObject cOSObject) {
        SoftReference softReference = (SoftReference) this.f60094g.get(cOSObject);
        if (softReference != null) {
            return (PDPropertyList) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDShading getShading(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60092e.get(cOSObject);
        if (softReference != null) {
            return (PDShading) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDXObject getXObject(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60090c.get(cOSObject);
        if (softReference != null) {
            return (PDXObject) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDFont pDFont) throws IOException {
        this.f60088a.put(cOSObject, new SoftReference(pDFont));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDColorSpace pDColorSpace) throws IOException {
        this.f60089b.put(cOSObject, new SoftReference(pDColorSpace));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDExtendedGraphicsState pDExtendedGraphicsState) {
        this.f60091d.put(cOSObject, new SoftReference(pDExtendedGraphicsState));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDShading pDShading) throws IOException {
        this.f60092e.put(cOSObject, new SoftReference(pDShading));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDAbstractPattern pDAbstractPattern) throws IOException {
        this.f60093f.put(cOSObject, new SoftReference(pDAbstractPattern));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDPropertyList pDPropertyList) {
        this.f60094g.put(cOSObject, new SoftReference(pDPropertyList));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDXObject pDXObject) throws IOException {
        this.f60090c.put(cOSObject, new SoftReference(pDXObject));
    }
}
