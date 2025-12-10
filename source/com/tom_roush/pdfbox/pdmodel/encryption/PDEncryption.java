package com.tom_roush.pdfbox.pdmodel.encryption;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDEncryption implements COSObjectable {
    public static final int DEFAULT_LENGTH = 40;
    public static final String DEFAULT_NAME = "Standard";
    public static final int DEFAULT_VERSION = 0;
    public static final int VERSION0_UNDOCUMENTED_UNSUPPORTED = 0;
    public static final int VERSION1_40_BIT_ALGORITHM = 1;
    public static final int VERSION2_VARIABLE_LENGTH_ALGORITHM = 2;
    public static final int VERSION3_UNPUBLISHED_ALGORITHM = 3;
    public static final int VERSION4_SECURITY_HANDLER = 4;

    /* renamed from: a */
    public final COSDictionary f60301a;

    /* renamed from: b */
    public SecurityHandler f60302b;

    public PDEncryption() {
        this.f60301a = new COSDictionary();
    }

    @Deprecated
    public COSDictionary getCOSDictionary() {
        return this.f60301a;
    }

    public PDCryptFilterDictionary getCryptFilterDictionary(COSName cOSName) {
        COSBase dictionaryObject = this.f60301a.getDictionaryObject(COSName.f59763CF);
        if (dictionaryObject instanceof COSDictionary) {
            COSBase dictionaryObject2 = ((COSDictionary) dictionaryObject).getDictionaryObject(cOSName);
            if (dictionaryObject2 instanceof COSDictionary) {
                return new PDCryptFilterDictionary((COSDictionary) dictionaryObject2);
            }
            return null;
        }
        return null;
    }

    public PDCryptFilterDictionary getDefaultCryptFilterDictionary() {
        return getCryptFilterDictionary(COSName.DEFAULT_CRYPT_FILTER);
    }

    public final String getFilter() {
        return this.f60301a.getNameAsString(COSName.FILTER);
    }

    public int getLength() {
        return this.f60301a.getInt(COSName.LENGTH, 40);
    }

    public byte[] getOwnerEncryptionKey() throws IOException {
        COSString cOSString = (COSString) this.f60301a.getDictionaryObject(COSName.f59811OE);
        if (cOSString != null) {
            return cOSString.getBytes();
        }
        return null;
    }

    public byte[] getOwnerKey() throws IOException {
        COSString cOSString = (COSString) this.f60301a.getDictionaryObject(COSName.f59809O);
        if (cOSString != null) {
            return cOSString.getBytes();
        }
        return null;
    }

    public int getPermissions() {
        return this.f60301a.getInt(COSName.f59815P, 0);
    }

    public byte[] getPerms() throws IOException {
        COSString cOSString = (COSString) this.f60301a.getDictionaryObject(COSName.PERMS);
        if (cOSString != null) {
            return cOSString.getBytes();
        }
        return null;
    }

    public COSString getRecipientStringAt(int i) {
        return (COSString) ((COSArray) this.f60301a.getItem(COSName.RECIPIENTS)).get(i);
    }

    public int getRecipientsLength() {
        return ((COSArray) this.f60301a.getItem(COSName.RECIPIENTS)).size();
    }

    public int getRevision() {
        return this.f60301a.getInt(COSName.f59819R, 0);
    }

    public SecurityHandler getSecurityHandler() throws IOException {
        SecurityHandler securityHandler = this.f60302b;
        if (securityHandler != null) {
            return securityHandler;
        }
        throw new IOException("No security handler for filter " + getFilter());
    }

    public PDCryptFilterDictionary getStdCryptFilterDictionary() {
        return getCryptFilterDictionary(COSName.STD_CF);
    }

    public COSName getStreamFilterName() {
        COSName cOSName = (COSName) this.f60301a.getDictionaryObject(COSName.STM_F);
        if (cOSName == null) {
            return COSName.IDENTITY;
        }
        return cOSName;
    }

    public COSName getStringFilterName() {
        COSName cOSName = (COSName) this.f60301a.getDictionaryObject(COSName.STR_F);
        if (cOSName == null) {
            return COSName.IDENTITY;
        }
        return cOSName;
    }

    public String getSubFilter() {
        return this.f60301a.getNameAsString(COSName.SUB_FILTER);
    }

    public byte[] getUserEncryptionKey() throws IOException {
        COSString cOSString = (COSString) this.f60301a.getDictionaryObject(COSName.f59841UE);
        if (cOSString != null) {
            return cOSString.getBytes();
        }
        return null;
    }

    public byte[] getUserKey() throws IOException {
        COSString cOSString = (COSString) this.f60301a.getDictionaryObject(COSName.f59840U);
        if (cOSString != null) {
            return cOSString.getBytes();
        }
        return null;
    }

    public int getVersion() {
        return this.f60301a.getInt(COSName.f59843V, 0);
    }

    public boolean hasSecurityHandler() {
        if (this.f60302b == null) {
            return true;
        }
        return false;
    }

    public boolean isEncryptMetaData() {
        COSBase dictionaryObject = this.f60301a.getDictionaryObject(COSName.ENCRYPT_META_DATA);
        if (dictionaryObject instanceof COSBoolean) {
            return ((COSBoolean) dictionaryObject).getValue();
        }
        return true;
    }

    public void removeV45filters() {
        this.f60301a.setItem(COSName.f59763CF, (COSBase) null);
        this.f60301a.setItem(COSName.STM_F, (COSBase) null);
        this.f60301a.setItem(COSName.STR_F, (COSBase) null);
    }

    public void setCryptFilterDictionary(COSName cOSName, PDCryptFilterDictionary pDCryptFilterDictionary) {
        COSDictionary cOSDictionary = this.f60301a;
        COSName cOSName2 = COSName.f59763CF;
        COSDictionary cOSDictionary2 = cOSDictionary.getCOSDictionary(cOSName2);
        if (cOSDictionary2 == null) {
            cOSDictionary2 = new COSDictionary();
            this.f60301a.setItem(cOSName2, (COSBase) cOSDictionary2);
        }
        cOSDictionary2.setDirect(true);
        cOSDictionary2.setItem(cOSName, (COSBase) pDCryptFilterDictionary.getCOSObject());
    }

    public void setDefaultCryptFilterDictionary(PDCryptFilterDictionary pDCryptFilterDictionary) {
        pDCryptFilterDictionary.getCOSObject().setDirect(true);
        setCryptFilterDictionary(COSName.DEFAULT_CRYPT_FILTER, pDCryptFilterDictionary);
    }

    public void setFilter(String str) {
        this.f60301a.setItem(COSName.FILTER, (COSBase) COSName.getPDFName(str));
    }

    public void setLength(int i) {
        this.f60301a.setInt(COSName.LENGTH, i);
    }

    public void setOwnerEncryptionKey(byte[] bArr) throws IOException {
        this.f60301a.setItem(COSName.f59811OE, (COSBase) new COSString(bArr));
    }

    public void setOwnerKey(byte[] bArr) throws IOException {
        this.f60301a.setItem(COSName.f59809O, (COSBase) new COSString(bArr));
    }

    public void setPermissions(int i) {
        this.f60301a.setInt(COSName.f59815P, i);
    }

    public void setPerms(byte[] bArr) throws IOException {
        this.f60301a.setItem(COSName.PERMS, (COSBase) new COSString(bArr));
    }

    public void setRecipients(byte[][] bArr) throws IOException {
        COSArray cOSArray = new COSArray();
        for (byte[] bArr2 : bArr) {
            cOSArray.add((COSBase) new COSString(bArr2));
        }
        this.f60301a.setItem(COSName.RECIPIENTS, (COSBase) cOSArray);
        cOSArray.setDirect(true);
    }

    public void setRevision(int i) {
        this.f60301a.setInt(COSName.f59819R, i);
    }

    public void setSecurityHandler(SecurityHandler securityHandler) {
        this.f60302b = securityHandler;
    }

    public void setStdCryptFilterDictionary(PDCryptFilterDictionary pDCryptFilterDictionary) {
        pDCryptFilterDictionary.getCOSObject().setDirect(true);
        setCryptFilterDictionary(COSName.STD_CF, pDCryptFilterDictionary);
    }

    public void setStreamFilterName(COSName cOSName) {
        this.f60301a.setItem(COSName.STM_F, (COSBase) cOSName);
    }

    public void setStringFilterName(COSName cOSName) {
        this.f60301a.setItem(COSName.STR_F, (COSBase) cOSName);
    }

    public void setSubFilter(String str) {
        this.f60301a.setName(COSName.SUB_FILTER, str);
    }

    public void setUserEncryptionKey(byte[] bArr) throws IOException {
        this.f60301a.setItem(COSName.f59841UE, (COSBase) new COSString(bArr));
    }

    public void setUserKey(byte[] bArr) throws IOException {
        this.f60301a.setItem(COSName.f59840U, (COSBase) new COSString(bArr));
    }

    public void setVersion(int i) {
        this.f60301a.setInt(COSName.f59843V, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60301a;
    }

    public PDEncryption(COSDictionary cOSDictionary) {
        this.f60301a = cOSDictionary;
        this.f60302b = SecurityHandlerFactory.INSTANCE.newSecurityHandlerForFilter(getFilter());
    }
}
