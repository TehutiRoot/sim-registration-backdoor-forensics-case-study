package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

/* loaded from: classes5.dex */
public class PDSignature implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60632a;
    public static final COSName FILTER_ADOBE_PPKLITE = COSName.ADOBE_PPKLITE;
    public static final COSName FILTER_ENTRUST_PPKEF = COSName.ENTRUST_PPKEF;
    public static final COSName FILTER_CICI_SIGNIT = COSName.CICI_SIGNIT;
    public static final COSName FILTER_VERISIGN_PPKVS = COSName.VERISIGN_PPKVS;
    public static final COSName SUBFILTER_ADBE_X509_RSA_SHA1 = COSName.ADBE_X509_RSA_SHA1;
    public static final COSName SUBFILTER_ADBE_PKCS7_DETACHED = COSName.ADBE_PKCS7_DETACHED;
    public static final COSName SUBFILTER_ETSI_CADES_DETACHED = COSName.getPDFName("ETSI.CAdES.detached");
    public static final COSName SUBFILTER_ADBE_PKCS7_SHA1 = COSName.ADBE_PKCS7_SHA1;

    public PDSignature() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.f60632a = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.SIG);
    }

    /* renamed from: a */
    public final byte[] m32283a(InputStream inputStream) {
        int i;
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byte b = bArr[0];
                if (b != 60 && b != 40) {
                    i = read;
                    i2 = 0;
                } else {
                    i = read - 1;
                    i2 = 1;
                }
                byte b2 = bArr[read - 1];
                if (b2 == 62 || b2 == 41) {
                    i--;
                }
                byteArrayOutputStream.write(bArr, i2, i);
            } else {
                inputStream.close();
                return COSString.parseHex(byteArrayOutputStream.toString("ISO-8859-1")).getBytes();
            }
        }
    }

    public int[] getByteRange() {
        COSArray cOSArray = this.f60632a.getCOSArray(COSName.BYTERANGE);
        if (cOSArray == null) {
            return new int[0];
        }
        int size = cOSArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = cOSArray.getInt(i);
        }
        return iArr;
    }

    public String getContactInfo() {
        return this.f60632a.getString(COSName.CONTACT_INFO);
    }

    public byte[] getContents() {
        COSBase dictionaryObject = this.f60632a.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getBytes();
        }
        return new byte[0];
    }

    public String getFilter() {
        return this.f60632a.getNameAsString(COSName.FILTER);
    }

    public String getLocation() {
        return this.f60632a.getString(COSName.LOCATION);
    }

    public String getName() {
        return this.f60632a.getString(COSName.NAME);
    }

    public PDPropBuild getPropBuild() {
        COSDictionary cOSDictionary = this.f60632a.getCOSDictionary(COSName.PROP_BUILD);
        if (cOSDictionary != null) {
            return new PDPropBuild(cOSDictionary);
        }
        return null;
    }

    public String getReason() {
        return this.f60632a.getString(COSName.REASON);
    }

    public Calendar getSignDate() {
        return this.f60632a.getDate(COSName.f59804M);
    }

    public byte[] getSignedContent(InputStream inputStream) throws IOException {
        COSFilterInputStream cOSFilterInputStream;
        COSFilterInputStream cOSFilterInputStream2 = null;
        try {
            cOSFilterInputStream = new COSFilterInputStream(inputStream, getByteRange());
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] byteArray = cOSFilterInputStream.toByteArray();
            cOSFilterInputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            cOSFilterInputStream2 = cOSFilterInputStream;
            if (cOSFilterInputStream2 != null) {
                cOSFilterInputStream2.close();
            }
            throw th;
        }
    }

    public String getSubFilter() {
        return this.f60632a.getNameAsString(COSName.SUB_FILTER);
    }

    public void setByteRange(int[] iArr) {
        if (iArr.length != 4) {
            return;
        }
        COSArray cOSArray = new COSArray();
        for (int i : iArr) {
            cOSArray.add((COSBase) COSInteger.get(i));
        }
        this.f60632a.setItem(COSName.BYTERANGE, (COSBase) cOSArray);
        cOSArray.setDirect(true);
    }

    public void setContactInfo(String str) {
        this.f60632a.setString(COSName.CONTACT_INFO, str);
    }

    public void setContents(byte[] bArr) {
        COSString cOSString = new COSString(bArr);
        cOSString.setForceHexForm(true);
        this.f60632a.setItem(COSName.CONTENTS, (COSBase) cOSString);
    }

    public void setFilter(COSName cOSName) {
        this.f60632a.setItem(COSName.FILTER, (COSBase) cOSName);
    }

    public void setLocation(String str) {
        this.f60632a.setString(COSName.LOCATION, str);
    }

    public void setName(String str) {
        this.f60632a.setString(COSName.NAME, str);
    }

    public void setPropBuild(PDPropBuild pDPropBuild) {
        this.f60632a.setItem(COSName.PROP_BUILD, pDPropBuild);
    }

    public void setReason(String str) {
        this.f60632a.setString(COSName.REASON, str);
    }

    public void setSignDate(Calendar calendar) {
        this.f60632a.setDate(COSName.f59804M, calendar);
    }

    public void setSubFilter(COSName cOSName) {
        this.f60632a.setItem(COSName.SUB_FILTER, (COSBase) cOSName);
    }

    public void setType(COSName cOSName) {
        this.f60632a.setItem(COSName.TYPE, (COSBase) cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60632a;
    }

    public PDSignature(COSDictionary cOSDictionary) {
        this.f60632a = cOSDictionary;
    }

    public byte[] getContents(InputStream inputStream) throws IOException {
        int[] byteRange = getByteRange();
        int i = byteRange[0] + byteRange[1] + 1;
        return m32283a(new COSFilterInputStream(inputStream, new int[]{i, byteRange[2] - i}));
    }

    public byte[] getSignedContent(byte[] bArr) throws IOException {
        COSFilterInputStream cOSFilterInputStream;
        COSFilterInputStream cOSFilterInputStream2 = null;
        try {
            cOSFilterInputStream = new COSFilterInputStream(bArr, getByteRange());
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] byteArray = cOSFilterInputStream.toByteArray();
            cOSFilterInputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            cOSFilterInputStream2 = cOSFilterInputStream;
            if (cOSFilterInputStream2 != null) {
                cOSFilterInputStream2.close();
            }
            throw th;
        }
    }

    public byte[] getContents(byte[] bArr) throws IOException {
        int[] byteRange = getByteRange();
        int i = byteRange[0] + byteRange[1] + 1;
        return m32283a(new ByteArrayInputStream(bArr, i, byteRange[2] - i));
    }
}
