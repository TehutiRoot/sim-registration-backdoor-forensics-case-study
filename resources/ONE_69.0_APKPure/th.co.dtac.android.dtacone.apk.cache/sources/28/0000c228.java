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
    public final COSDictionary f60455a;

    /* renamed from: b */
    public final Encoding f60456b;

    /* renamed from: c */
    public final Map f60457c;

    public DictionaryEncoding(COSName cOSName, COSArray cOSArray) {
        this.f60457c = new HashMap();
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60455a = cOSDictionary;
        cOSDictionary.setItem(COSName.NAME, (COSBase) COSName.ENCODING);
        cOSDictionary.setItem(COSName.DIFFERENCES, (COSBase) cOSArray);
        if (cOSName != COSName.STANDARD_ENCODING) {
            cOSDictionary.setItem(COSName.BASE_ENCODING, (COSBase) cOSName);
            this.f60456b = Encoding.getInstance(cOSName);
        } else {
            this.f60456b = Encoding.getInstance(cOSName);
        }
        Encoding encoding = this.f60456b;
        if (encoding != null) {
            this.codeToName.putAll(encoding.codeToName);
            this.inverted.putAll(this.f60456b.inverted);
            m32407a();
            return;
        }
        throw new IllegalArgumentException("Invalid encoding: " + cOSName);
    }

    /* renamed from: a */
    public final void m32407a() {
        COSBase dictionaryObject = this.f60455a.getDictionaryObject(COSName.DIFFERENCES);
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
                this.f60457c.put(Integer.valueOf(i), cOSName.getName());
                i++;
            }
        }
    }

    public Encoding getBaseEncoding() {
        return this.f60456b;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60455a;
    }

    public Map<Integer, String> getDifferences() {
        return this.f60457c;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding
    public String getEncodingName() {
        if (this.f60456b == null) {
            return "differences";
        }
        return this.f60456b.getEncodingName() + " with differences";
    }

    public DictionaryEncoding(COSDictionary cOSDictionary) {
        this.f60457c = new HashMap();
        this.f60455a = cOSDictionary;
        this.f60456b = null;
        m32407a();
    }

    public DictionaryEncoding(COSDictionary cOSDictionary, boolean z, Encoding encoding) {
        this.f60457c = new HashMap();
        this.f60455a = cOSDictionary;
        COSName cOSName = COSName.BASE_ENCODING;
        Encoding encoding2 = cOSDictionary.containsKey(cOSName) ? Encoding.getInstance(cOSDictionary.getCOSName(cOSName)) : null;
        if (encoding2 != null) {
            encoding = encoding2;
        } else if (z) {
            encoding = StandardEncoding.INSTANCE;
        } else if (encoding == null) {
            throw new IllegalArgumentException("Symbolic fonts must have a built-in encoding");
        }
        this.f60456b = encoding;
        this.codeToName.putAll(encoding.codeToName);
        this.inverted.putAll(encoding.inverted);
        m32407a();
    }
}