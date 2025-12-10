package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDSeedValueCertificate implements COSObjectable {
    public static final int FLAG_ISSUER = 2;
    public static final int FLAG_KEY_USAGE = 32;
    public static final int FLAG_OID = 4;
    public static final int FLAG_SUBJECT = 1;
    public static final int FLAG_SUBJECT_DN = 8;
    public static final int FLAG_URL = 64;

    /* renamed from: a */
    public final COSDictionary f60629a;

    public PDSeedValueCertificate() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60629a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.SV_CERT);
        cOSDictionary.setDirect(true);
    }

    /* renamed from: a */
    public static COSArray m32285a(List list) {
        COSArray cOSArray = new COSArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cOSArray.add((COSBase) new COSString((byte[]) it.next()));
        }
        return cOSArray;
    }

    /* renamed from: b */
    public static List m32284b(COSArray cOSArray) {
        LinkedList linkedList = new LinkedList();
        Iterator<COSBase> it = cOSArray.iterator();
        while (it.hasNext()) {
            COSBase next = it.next();
            if (next instanceof COSString) {
                linkedList.add(((COSString) next).getBytes());
            }
        }
        return linkedList;
    }

    public void addIssuer(byte[] bArr) {
        COSDictionary cOSDictionary = this.f60629a;
        COSName cOSName = COSName.ISSUER;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(bArr));
        this.f60629a.setItem(cOSName, (COSBase) cOSArray);
    }

    public void addKeyUsage(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ("01X".indexOf(str.charAt(i)) == -1) {
                throw new IllegalArgumentException("characters can only be 0, 1, X");
            }
        }
        COSDictionary cOSDictionary = this.f60629a;
        COSName cOSName = COSName.KEY_USAGE;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(str));
        this.f60629a.setItem(cOSName, (COSBase) cOSArray);
    }

    public void addOID(byte[] bArr) {
        COSDictionary cOSDictionary = this.f60629a;
        COSName cOSName = COSName.OID;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(bArr));
        this.f60629a.setItem(cOSName, (COSBase) cOSArray);
    }

    public void addSubject(byte[] bArr) {
        COSDictionary cOSDictionary = this.f60629a;
        COSName cOSName = COSName.SUBJECT;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(bArr));
        this.f60629a.setItem(cOSName, (COSBase) cOSArray);
    }

    public List<byte[]> getIssuer() {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.ISSUER);
        if (cOSArray != null) {
            return m32284b(cOSArray);
        }
        return null;
    }

    public List<String> getKeyUsage() {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.KEY_USAGE);
        if (cOSArray != null) {
            LinkedList linkedList = new LinkedList();
            Iterator<COSBase> it = cOSArray.iterator();
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSString) {
                    linkedList.add(((COSString) next).getString());
                }
            }
            return linkedList;
        }
        return null;
    }

    public List<byte[]> getOID() {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.OID);
        if (cOSArray != null) {
            return m32284b(cOSArray);
        }
        return null;
    }

    public List<byte[]> getSubject() {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.SUBJECT);
        if (cOSArray != null) {
            return m32284b(cOSArray);
        }
        return null;
    }

    public List<Map<String, String>> getSubjectDN() {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.SUBJECT_DN);
        if (cOSArray != null) {
            List<? extends COSBase> list = cOSArray.toList();
            LinkedList linkedList = new LinkedList();
            for (COSBase cOSBase : list) {
                if (cOSBase instanceof COSDictionary) {
                    COSDictionary cOSDictionary = (COSDictionary) cOSBase;
                    HashMap hashMap = new HashMap();
                    for (COSName cOSName : cOSDictionary.keySet()) {
                        hashMap.put(cOSName.getName(), cOSDictionary.getString(cOSName));
                    }
                    linkedList.add(hashMap);
                }
            }
            return linkedList;
        }
        return null;
    }

    public String getURL() {
        return this.f60629a.getString(COSName.URL);
    }

    public String getURLType() {
        return this.f60629a.getNameAsString(COSName.URL_TYPE);
    }

    public boolean isIssuerRequired() {
        return this.f60629a.getFlag(COSName.f59784FF, 2);
    }

    public boolean isKeyUsageRequired() {
        return this.f60629a.getFlag(COSName.f59784FF, 32);
    }

    public boolean isOIDRequired() {
        return this.f60629a.getFlag(COSName.f59784FF, 4);
    }

    public boolean isSubjectDNRequired() {
        return this.f60629a.getFlag(COSName.f59784FF, 8);
    }

    public boolean isSubjectRequired() {
        return this.f60629a.getFlag(COSName.f59784FF, 1);
    }

    public boolean isURLRequired() {
        return this.f60629a.getFlag(COSName.f59784FF, 64);
    }

    public void removeIssuer(byte[] bArr) {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.ISSUER);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(bArr));
        }
    }

    public void removeKeyUsage(String str) {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.KEY_USAGE);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(str));
        }
    }

    public void removeOID(byte[] bArr) {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.OID);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(bArr));
        }
    }

    public void removeSubject(byte[] bArr) {
        COSArray cOSArray = this.f60629a.getCOSArray(COSName.SUBJECT);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(bArr));
        }
    }

    public void setIssuer(List<byte[]> list) {
        this.f60629a.setItem(COSName.ISSUER, (COSBase) m32285a(list));
    }

    public void setIssuerRequired(boolean z) {
        this.f60629a.setFlag(COSName.f59784FF, 2, z);
    }

    public void setKeyUsage(List<String> list) {
        this.f60629a.setItem(COSName.KEY_USAGE, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setKeyUsageRequired(boolean z) {
        this.f60629a.setFlag(COSName.f59784FF, 32, z);
    }

    public void setOID(List<byte[]> list) {
        this.f60629a.setItem(COSName.OID, (COSBase) m32285a(list));
    }

    public void setOIDRequired(boolean z) {
        this.f60629a.setFlag(COSName.f59784FF, 4, z);
    }

    public void setSubject(List<byte[]> list) {
        this.f60629a.setItem(COSName.SUBJECT, (COSBase) m32285a(list));
    }

    public void setSubjectDN(List<Map<String, String>> list) {
        LinkedList linkedList = new LinkedList();
        for (Map<String, String> map : list) {
            COSDictionary cOSDictionary = new COSDictionary();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                cOSDictionary.setItem(entry.getKey(), (COSBase) new COSString(entry.getValue()));
            }
            linkedList.add(cOSDictionary);
        }
        this.f60629a.setItem(COSName.SUBJECT_DN, (COSBase) COSArrayList.converterToCOSArray(linkedList));
    }

    public void setSubjectDNRequired(boolean z) {
        this.f60629a.setFlag(COSName.f59784FF, 8, z);
    }

    public void setSubjectRequired(boolean z) {
        this.f60629a.setFlag(COSName.f59784FF, 1, z);
    }

    public void setURL(String str) {
        this.f60629a.setString(COSName.URL, str);
    }

    public void setURLRequired(boolean z) {
        this.f60629a.setFlag(COSName.f59784FF, 64, z);
    }

    public void setURLType(String str) {
        this.f60629a.setName(COSName.URL_TYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60629a;
    }

    public PDSeedValueCertificate(COSDictionary cOSDictionary) {
        this.f60629a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public void addKeyUsage(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9) {
        addKeyUsage("" + c + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9);
    }
}
