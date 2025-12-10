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
    public final Map f60100a = new HashMap();

    /* renamed from: b */
    public final Map f60101b = new HashMap();

    /* renamed from: c */
    public final Map f60102c = new HashMap();

    /* renamed from: d */
    public final Map f60103d = new HashMap();

    /* renamed from: e */
    public final Map f60104e = new HashMap();

    /* renamed from: f */
    public final Map f60105f = new HashMap();

    /* renamed from: g */
    public final Map f60106g = new HashMap();

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDColorSpace getColorSpace(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60101b.get(cOSObject);
        if (softReference != null) {
            return (PDColorSpace) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDExtendedGraphicsState getExtGState(COSObject cOSObject) {
        SoftReference softReference = (SoftReference) this.f60103d.get(cOSObject);
        if (softReference != null) {
            return (PDExtendedGraphicsState) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDFont getFont(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60100a.get(cOSObject);
        if (softReference != null) {
            return (PDFont) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDAbstractPattern getPattern(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60105f.get(cOSObject);
        if (softReference != null) {
            return (PDAbstractPattern) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDPropertyList getProperties(COSObject cOSObject) {
        SoftReference softReference = (SoftReference) this.f60106g.get(cOSObject);
        if (softReference != null) {
            return (PDPropertyList) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDShading getShading(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60104e.get(cOSObject);
        if (softReference != null) {
            return (PDShading) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDXObject getXObject(COSObject cOSObject) throws IOException {
        SoftReference softReference = (SoftReference) this.f60102c.get(cOSObject);
        if (softReference != null) {
            return (PDXObject) softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDFont pDFont) throws IOException {
        this.f60100a.put(cOSObject, new SoftReference(pDFont));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDColorSpace pDColorSpace) throws IOException {
        this.f60101b.put(cOSObject, new SoftReference(pDColorSpace));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDExtendedGraphicsState pDExtendedGraphicsState) {
        this.f60103d.put(cOSObject, new SoftReference(pDExtendedGraphicsState));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDShading pDShading) throws IOException {
        this.f60104e.put(cOSObject, new SoftReference(pDShading));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDAbstractPattern pDAbstractPattern) throws IOException {
        this.f60105f.put(cOSObject, new SoftReference(pDAbstractPattern));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDPropertyList pDPropertyList) {
        this.f60106g.put(cOSObject, new SoftReference(pDPropertyList));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDXObject pDXObject) throws IOException {
        this.f60102c.put(cOSObject, new SoftReference(pDXObject));
    }
}