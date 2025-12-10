package com.tom_roush.pdfbox.pdmodel.font.encoding;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class DictionaryEncoding extends Encoding {

    /* renamed from: a */
    public final COSDictionary f60443a;

    /* renamed from: b */
    public final Encoding f60444b;

    /* renamed from: c */
    public final Map f60445c;

    public DictionaryEncoding(COSName cOSName, COSArray cOSArray) {
        this.f60445c = new HashMap();
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60443a = cOSDictionary;
        cOSDictionary.setItem(COSName.NAME, (COSBase) COSName.ENCODING);
        cOSDictionary.setItem(COSName.DIFFERENCES, (COSBase) cOSArray);
        if (cOSName != COSName.STANDARD_ENCODING) {
            cOSDictionary.setItem(COSName.BASE_ENCODING, (COSBase) cOSName);
            this.f60444b = Encoding.getInstance(cOSName);
        } else {
            this.f60444b = Encoding.getInstance(cOSName);
        }
        Encoding encoding = this.f60444b;
        if (encoding != null) {
            this.codeToName.putAll(encoding.codeToName);
            this.inverted.putAll(this.f60444b.inverted);
            m32415a();
            return;
        }
        throw new IllegalArgumentException("Invalid encoding: " + cOSName);
    }

    /* renamed from: a */
    public final void m32415a() {
        COSBase dictionaryObject = this.f60443a.getDictionaryObject(COSName.DIFFERENCES);
        if (!(dictionaryObject instanceof COSArray)) {
            return;
        }
        COSArray cOSArray = (COSArray) dictionaryObject;
        int i = -1;
        for (int i2 = 0; i2 < cOSArray.size(); i2++) {
            COSBase object = cOSArray.getObject(i2);
            if (object instanceof COSNumber) {
                i = ((COSNumber) object).intValue();
            } else if (object instanceof COSName) {
                COSName cOSName = (COSName) object;
                overwrite(i, cOSName.getName());
                this.f60445c.put(Integer.valueOf(i), cOSName.getName());
                i++;
            }
        }
    }

    public Encoding getBaseEncoding() {
        return this.f60444b;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60443a;
    }

    public Map<Integer, String> getDifferences() {
        return this.f60445c;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding
    public String getEncodingName() {
        if (this.f60444b == null) {
            return "differences";
        }
        return this.f60444b.getEncodingName() + " with differences";
    }

    public DictionaryEncoding(COSDictionary cOSDictionary) {
        this.f60445c = new HashMap();
        this.f60443a = cOSDictionary;
        this.f60444b = null;
        m32415a();
    }

    public DictionaryEncoding(COSDictionary cOSDictionary, boolean z, Encoding encoding) {
        this.f60445c = new HashMap();
        this.f60443a = cOSDictionary;
        COSName cOSName = COSName.BASE_ENCODING;
        Encoding encoding2 = cOSDictionary.containsKey(cOSName) ? Encoding.getInstance(cOSDictionary.getCOSName(cOSName)) : null;
        if (encoding2 != null) {
            encoding = encoding2;
        } else if (z) {
            encoding = StandardEncoding.INSTANCE;
        } else if (encoding == null) {
            throw new IllegalArgumentException("Symbolic fonts must have a built-in encoding");
        }
        this.f60444b = encoding;
        this.codeToName.putAll(encoding.codeToName);
        this.inverted.putAll(encoding.inverted);
        m32415a();
    }
}
