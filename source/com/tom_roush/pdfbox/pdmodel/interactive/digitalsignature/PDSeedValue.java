package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class PDSeedValue implements COSObjectable {
    public static final int FLAG_ADD_REV_INFO = 32;
    public static final int FLAG_DIGEST_METHOD = 64;
    public static final int FLAG_FILTER = 1;
    public static final int FLAG_LEGAL_ATTESTATION = 16;
    public static final int FLAG_REASON = 8;
    public static final int FLAG_SUBFILTER = 2;
    public static final int FLAG_V = 4;

    /* renamed from: a */
    public final COSDictionary f60628a;

    public PDSeedValue() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60628a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.f59830SV);
        cOSDictionary.setDirect(true);
    }

    public List<String> getDigestMethod() {
        COSArray cOSArray = (COSArray) this.f60628a.getDictionaryObject(COSName.DIGEST_METHOD);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                String name = cOSArray.getName(i);
                if (name != null) {
                    arrayList.add(name);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getFilter() {
        return this.f60628a.getNameAsString(COSName.FILTER);
    }

    public List<String> getLegalAttestation() {
        COSArray cOSArray = (COSArray) this.f60628a.getDictionaryObject(COSName.LEGAL_ATTESTATION);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                String string = cOSArray.getString(i);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDSeedValueMDP getMDP() {
        COSDictionary cOSDictionary = this.f60628a.getCOSDictionary(COSName.MDP);
        if (cOSDictionary != null) {
            return new PDSeedValueMDP(cOSDictionary);
        }
        return null;
    }

    public List<String> getReasons() {
        COSArray cOSArray = (COSArray) this.f60628a.getDictionaryObject(COSName.REASONS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                String string = cOSArray.getString(i);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDSeedValueCertificate getSeedValueCertificate() {
        COSBase dictionaryObject = this.f60628a.getDictionaryObject(COSName.CERT);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDSeedValueCertificate((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public List<String> getSubFilter() {
        COSArray cOSArray = (COSArray) this.f60628a.getDictionaryObject(COSName.SUB_FILTER);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                String name = cOSArray.getName(i);
                if (name != null) {
                    arrayList.add(name);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDSeedValueTimeStamp getTimeStamp() {
        COSDictionary cOSDictionary = this.f60628a.getCOSDictionary(COSName.TIME_STAMP);
        if (cOSDictionary != null) {
            return new PDSeedValueTimeStamp(cOSDictionary);
        }
        return null;
    }

    public float getV() {
        return this.f60628a.getFloat(COSName.f59843V);
    }

    public boolean isAddRevInfoRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 32);
    }

    public boolean isDigestMethodRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 64);
    }

    public boolean isFilterRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 1);
    }

    public boolean isLegalAttestationRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 16);
    }

    public boolean isReasonRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 8);
    }

    public boolean isSubFilterRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 2);
    }

    public boolean isVRequired() {
        return getCOSObject().getFlag(COSName.f59784FF, 4);
    }

    public void setAddRevInfoRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 32, z);
    }

    public void setDigestMethod(List<COSName> list) {
        for (COSName cOSName : list) {
            if (!cOSName.equals(COSName.DIGEST_SHA1) && !cOSName.equals(COSName.DIGEST_SHA256) && !cOSName.equals(COSName.DIGEST_SHA384) && !cOSName.equals(COSName.DIGEST_SHA512) && !cOSName.equals(COSName.DIGEST_RIPEMD160)) {
                throw new IllegalArgumentException("Specified digest " + cOSName.getName() + " isn't allowed.");
            }
        }
        this.f60628a.setItem(COSName.DIGEST_METHOD, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDigestMethodRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 64, z);
    }

    public void setFilter(COSName cOSName) {
        this.f60628a.setItem(COSName.FILTER, (COSBase) cOSName);
    }

    public void setFilterRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 1, z);
    }

    public void setLegalAttestation(List<String> list) {
        this.f60628a.setItem(COSName.LEGAL_ATTESTATION, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setLegalAttestationRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 16, z);
    }

    public void setMPD(PDSeedValueMDP pDSeedValueMDP) {
        if (pDSeedValueMDP != null) {
            this.f60628a.setItem(COSName.MDP, (COSBase) pDSeedValueMDP.getCOSObject());
        }
    }

    public void setReasonRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 8, z);
    }

    public void setReasons(List<String> list) {
        this.f60628a.setItem(COSName.REASONS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    @Deprecated
    public void setReasonsd(List<String> list) {
        setReasons(list);
    }

    public void setSeedValueCertificate(PDSeedValueCertificate pDSeedValueCertificate) {
        this.f60628a.setItem(COSName.CERT, pDSeedValueCertificate);
    }

    public void setSubFilter(List<COSName> list) {
        this.f60628a.setItem(COSName.SUB_FILTER, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setSubFilterRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 2, z);
    }

    public void setTimeStamp(PDSeedValueTimeStamp pDSeedValueTimeStamp) {
        if (pDSeedValueTimeStamp != null) {
            this.f60628a.setItem(COSName.TIME_STAMP, (COSBase) pDSeedValueTimeStamp.getCOSObject());
        }
    }

    public void setV(float f) {
        this.f60628a.setFloat(COSName.f59843V, f);
    }

    public void setVRequired(boolean z) {
        getCOSObject().setFlag(COSName.f59784FF, 4, z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60628a;
    }

    public PDSeedValue(COSDictionary cOSDictionary) {
        this.f60628a = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
