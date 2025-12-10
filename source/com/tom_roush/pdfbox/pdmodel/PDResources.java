package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDFontFactory;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class PDResources implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60141a;

    /* renamed from: b */
    public final ResourceCache f60142b;

    /* renamed from: c */
    public final Map f60143c;

    public PDResources() {
        this.f60143c = new HashMap();
        this.f60141a = new COSDictionary();
        this.f60142b = null;
    }

    /* renamed from: a */
    public final COSName m32574a(COSName cOSName, String str, COSObjectable cOSObjectable) {
        COSDictionary cOSDictionary = (COSDictionary) this.f60141a.getDictionaryObject(cOSName);
        if (cOSDictionary != null && cOSDictionary.containsValue(cOSObjectable.getCOSObject())) {
            return cOSDictionary.getKeyForValue(cOSObjectable.getCOSObject());
        }
        if (cOSDictionary != null && COSName.FONT.equals(cOSName)) {
            for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
                if ((entry.getValue() instanceof COSObject) && cOSObjectable.getCOSObject() == ((COSObject) entry.getValue()).getObject()) {
                    return entry.getKey();
                }
            }
        }
        COSName m32573b = m32573b(cOSName, str);
        m32568g(cOSName, m32573b, cOSObjectable);
        return m32573b;
    }

    public COSName add(PDFont pDFont) {
        return m32574a(COSName.FONT, "F", pDFont);
    }

    /* renamed from: b */
    public final COSName m32573b(COSName cOSName, String str) {
        String str2;
        COSDictionary cOSDictionary = (COSDictionary) this.f60141a.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return COSName.getPDFName(str + 1);
        }
        int size = cOSDictionary.keySet().size();
        do {
            size++;
            str2 = str + size;
        } while (cOSDictionary.containsKey(str2));
        return COSName.getPDFName(str2);
    }

    /* renamed from: c */
    public final COSBase m32572c(COSName cOSName, COSName cOSName2) {
        COSDictionary cOSDictionary = (COSDictionary) this.f60141a.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return null;
        }
        return cOSDictionary.getDictionaryObject(cOSName2);
    }

    /* renamed from: d */
    public final COSObject m32571d(COSName cOSName, COSName cOSName2) {
        COSDictionary cOSDictionary = (COSDictionary) this.f60141a.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return null;
        }
        COSBase item = cOSDictionary.getItem(cOSName2);
        if (!(item instanceof COSObject)) {
            return null;
        }
        return (COSObject) item;
    }

    /* renamed from: e */
    public final Iterable m32570e(COSName cOSName) {
        COSDictionary cOSDictionary = (COSDictionary) this.f60141a.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return Collections.emptySet();
        }
        return cOSDictionary.keySet();
    }

    /* renamed from: f */
    public final boolean m32569f(PDXObject pDXObject) {
        if (pDXObject instanceof PDImageXObject) {
            COSBase dictionaryObject = pDXObject.getCOSObject().getDictionaryObject(COSName.COLORSPACE);
            if (dictionaryObject instanceof COSName) {
                COSName cOSName = (COSName) dictionaryObject;
                if (cOSName.equals(COSName.DEVICECMYK) && hasColorSpace(COSName.DEFAULT_CMYK)) {
                    return false;
                }
                if (cOSName.equals(COSName.DEVICERGB) && hasColorSpace(COSName.DEFAULT_RGB)) {
                    return false;
                }
                if ((cOSName.equals(COSName.DEVICEGRAY) && hasColorSpace(COSName.DEFAULT_GRAY)) || hasColorSpace(cOSName)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: g */
    public final void m32568g(COSName cOSName, COSName cOSName2, COSObjectable cOSObjectable) {
        COSDictionary cOSDictionary = (COSDictionary) this.f60141a.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            cOSDictionary = new COSDictionary();
            this.f60141a.setItem(cOSName, (COSBase) cOSDictionary);
        }
        cOSDictionary.setItem(cOSName2, cOSObjectable);
    }

    public PDColorSpace getColorSpace(COSName cOSName) throws IOException {
        return getColorSpace(cOSName, false);
    }

    public Iterable<COSName> getColorSpaceNames() {
        return m32570e(COSName.COLORSPACE);
    }

    public PDExtendedGraphicsState getExtGState(COSName cOSName) {
        PDExtendedGraphicsState pDExtendedGraphicsState;
        PDExtendedGraphicsState extGState;
        COSName cOSName2 = COSName.EXT_G_STATE;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache != null && m32571d != null && (extGState = resourceCache.getExtGState(m32571d)) != null) {
            return extGState;
        }
        COSBase m32572c = m32572c(cOSName2, cOSName);
        if (m32572c instanceof COSDictionary) {
            pDExtendedGraphicsState = new PDExtendedGraphicsState((COSDictionary) m32572c);
        } else {
            pDExtendedGraphicsState = null;
        }
        ResourceCache resourceCache2 = this.f60142b;
        if (resourceCache2 != null && m32571d != null) {
            resourceCache2.put(m32571d, pDExtendedGraphicsState);
        }
        return pDExtendedGraphicsState;
    }

    public Iterable<COSName> getExtGStateNames() {
        return m32570e(COSName.EXT_G_STATE);
    }

    public PDFont getFont(COSName cOSName) throws IOException {
        SoftReference softReference;
        PDFont pDFont;
        PDFont pDFont2;
        COSName cOSName2 = COSName.FONT;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache != null && m32571d != null) {
            PDFont font = resourceCache.getFont(m32571d);
            if (font != null) {
                return font;
            }
        } else if (m32571d == null && (softReference = (SoftReference) this.f60143c.get(cOSName)) != null && (pDFont = (PDFont) softReference.get()) != null) {
            return pDFont;
        }
        COSBase m32572c = m32572c(cOSName2, cOSName);
        if (m32572c instanceof COSDictionary) {
            pDFont2 = PDFontFactory.createFont((COSDictionary) m32572c, this.f60142b);
        } else {
            pDFont2 = null;
        }
        ResourceCache resourceCache2 = this.f60142b;
        if (resourceCache2 != null && m32571d != null) {
            resourceCache2.put(m32571d, pDFont2);
        } else if (m32571d == null) {
            this.f60143c.put(cOSName, new SoftReference(pDFont2));
        }
        return pDFont2;
    }

    public Iterable<COSName> getFontNames() {
        return m32570e(COSName.FONT);
    }

    public PDAbstractPattern getPattern(COSName cOSName) throws IOException {
        PDAbstractPattern pDAbstractPattern;
        PDAbstractPattern pattern;
        COSName cOSName2 = COSName.PATTERN;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache != null && m32571d != null && (pattern = resourceCache.getPattern(m32571d)) != null) {
            return pattern;
        }
        COSBase m32572c = m32572c(cOSName2, cOSName);
        if (m32572c instanceof COSDictionary) {
            pDAbstractPattern = PDAbstractPattern.create((COSDictionary) m32572c, getResourceCache());
        } else {
            pDAbstractPattern = null;
        }
        ResourceCache resourceCache2 = this.f60142b;
        if (resourceCache2 != null && m32571d != null) {
            resourceCache2.put(m32571d, pDAbstractPattern);
        }
        return pDAbstractPattern;
    }

    public Iterable<COSName> getPatternNames() {
        return m32570e(COSName.PATTERN);
    }

    public PDPropertyList getProperties(COSName cOSName) {
        PDPropertyList pDPropertyList;
        PDPropertyList properties;
        COSName cOSName2 = COSName.PROPERTIES;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache != null && m32571d != null && (properties = resourceCache.getProperties(m32571d)) != null) {
            return properties;
        }
        COSBase m32572c = m32572c(cOSName2, cOSName);
        if (m32572c instanceof COSDictionary) {
            pDPropertyList = PDPropertyList.create((COSDictionary) m32572c);
        } else {
            pDPropertyList = null;
        }
        ResourceCache resourceCache2 = this.f60142b;
        if (resourceCache2 != null && m32571d != null) {
            resourceCache2.put(m32571d, pDPropertyList);
        }
        return pDPropertyList;
    }

    public Iterable<COSName> getPropertiesNames() {
        return m32570e(COSName.PROPERTIES);
    }

    public ResourceCache getResourceCache() {
        return this.f60142b;
    }

    public PDShading getShading(COSName cOSName) throws IOException {
        PDShading pDShading;
        PDShading shading;
        COSName cOSName2 = COSName.SHADING;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache != null && m32571d != null && (shading = resourceCache.getShading(m32571d)) != null) {
            return shading;
        }
        COSBase m32572c = m32572c(cOSName2, cOSName);
        if (m32572c instanceof COSDictionary) {
            pDShading = PDShading.create((COSDictionary) m32572c);
        } else {
            pDShading = null;
        }
        ResourceCache resourceCache2 = this.f60142b;
        if (resourceCache2 != null && m32571d != null) {
            resourceCache2.put(m32571d, pDShading);
        }
        return pDShading;
    }

    public Iterable<COSName> getShadingNames() {
        return m32570e(COSName.SHADING);
    }

    public PDXObject getXObject(COSName cOSName) throws IOException {
        PDXObject createXObject;
        PDXObject xObject;
        COSName cOSName2 = COSName.XOBJECT;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache != null && m32571d != null && (xObject = resourceCache.getXObject(m32571d)) != null) {
            return xObject;
        }
        COSBase m32572c = m32572c(cOSName2, cOSName);
        if (m32572c == null) {
            createXObject = null;
        } else if (m32572c instanceof COSObject) {
            createXObject = PDXObject.createXObject(((COSObject) m32572c).getObject(), this);
        } else {
            createXObject = PDXObject.createXObject(m32572c, this);
        }
        if (this.f60142b != null && m32571d != null && m32569f(createXObject)) {
            this.f60142b.put(m32571d, createXObject);
        }
        return createXObject;
    }

    public Iterable<COSName> getXObjectNames() {
        return m32570e(COSName.XOBJECT);
    }

    public boolean hasColorSpace(COSName cOSName) {
        if (m32572c(COSName.COLORSPACE, cOSName) != null) {
            return true;
        }
        return false;
    }

    public boolean isImageXObject(COSName cOSName) {
        COSBase m32572c = m32572c(COSName.XOBJECT, cOSName);
        if (m32572c == null) {
            return false;
        }
        if (m32572c instanceof COSObject) {
            m32572c = ((COSObject) m32572c).getObject();
        }
        if (!(m32572c instanceof COSStream)) {
            return false;
        }
        return COSName.IMAGE.equals(((COSStream) m32572c).getCOSName(COSName.SUBTYPE));
    }

    public void put(COSName cOSName, PDFont pDFont) {
        m32568g(COSName.FONT, cOSName, pDFont);
    }

    public COSName add(PDColorSpace pDColorSpace) {
        return m32574a(COSName.COLORSPACE, OperatorName.NON_STROKING_COLORSPACE, pDColorSpace);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60141a;
    }

    public PDColorSpace getColorSpace(COSName cOSName, boolean z) throws IOException {
        PDColorSpace create;
        PDColorSpace colorSpace;
        COSName cOSName2 = COSName.COLORSPACE;
        COSObject m32571d = m32571d(cOSName2, cOSName);
        ResourceCache resourceCache = this.f60142b;
        if (resourceCache == null || m32571d == null || (colorSpace = resourceCache.getColorSpace(m32571d)) == null) {
            COSBase m32572c = m32572c(cOSName2, cOSName);
            if (m32572c != null) {
                create = PDColorSpace.create(m32572c, this, z);
            } else {
                create = PDColorSpace.create(cOSName, this, z);
            }
            ResourceCache resourceCache2 = this.f60142b;
            if (resourceCache2 != null && m32571d != null) {
                resourceCache2.put(m32571d, create);
            }
            return create;
        }
        return colorSpace;
    }

    public void put(COSName cOSName, PDColorSpace pDColorSpace) {
        m32568g(COSName.COLORSPACE, cOSName, pDColorSpace);
    }

    public COSName add(PDExtendedGraphicsState pDExtendedGraphicsState) {
        return m32574a(COSName.EXT_G_STATE, OperatorName.SET_GRAPHICS_STATE_PARAMS, pDExtendedGraphicsState);
    }

    public void put(COSName cOSName, PDExtendedGraphicsState pDExtendedGraphicsState) {
        m32568g(COSName.EXT_G_STATE, cOSName, pDExtendedGraphicsState);
    }

    public COSName add(PDShading pDShading) {
        return m32574a(COSName.SHADING, OperatorName.SHADING_FILL, pDShading);
    }

    public void put(COSName cOSName, PDShading pDShading) {
        m32568g(COSName.SHADING, cOSName, pDShading);
    }

    public PDResources(COSDictionary cOSDictionary) {
        this.f60143c = new HashMap();
        if (cOSDictionary != null) {
            this.f60141a = cOSDictionary;
            this.f60142b = null;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }

    public COSName add(PDAbstractPattern pDAbstractPattern) {
        return m32574a(COSName.PATTERN, "p", pDAbstractPattern);
    }

    public void put(COSName cOSName, PDAbstractPattern pDAbstractPattern) {
        m32568g(COSName.PATTERN, cOSName, pDAbstractPattern);
    }

    public COSName add(PDPropertyList pDPropertyList) {
        if (pDPropertyList instanceof PDOptionalContentGroup) {
            return m32574a(COSName.PROPERTIES, "oc", pDPropertyList);
        }
        return m32574a(COSName.PROPERTIES, "Prop", pDPropertyList);
    }

    public void put(COSName cOSName, PDPropertyList pDPropertyList) {
        m32568g(COSName.PROPERTIES, cOSName, pDPropertyList);
    }

    public void put(COSName cOSName, PDXObject pDXObject) {
        m32568g(COSName.XOBJECT, cOSName, pDXObject);
    }

    public COSName add(PDImageXObject pDImageXObject) {
        return m32574a(COSName.XOBJECT, "Im", pDImageXObject);
    }

    public PDResources(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        this.f60143c = new HashMap();
        if (cOSDictionary != null) {
            this.f60141a = cOSDictionary;
            this.f60142b = resourceCache;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }

    public COSName add(PDFormXObject pDFormXObject) {
        return m32574a(COSName.XOBJECT, StandardStructureTypes.FORM, pDFormXObject);
    }

    public COSName add(PDXObject pDXObject, String str) {
        return m32574a(COSName.XOBJECT, str, pDXObject);
    }
}
