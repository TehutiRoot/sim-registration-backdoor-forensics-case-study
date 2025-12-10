package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes5.dex */
public final class PDInlineImage implements PDImage {

    /* renamed from: a */
    public final COSDictionary f60504a;

    /* renamed from: b */
    public final PDResources f60505b;

    /* renamed from: c */
    public final byte[] f60506c;

    /* renamed from: d */
    public final byte[] f60507d;

    public PDInlineImage(COSDictionary cOSDictionary, byte[] bArr, PDResources pDResources) throws IOException {
        this.f60504a = cOSDictionary;
        this.f60505b = pDResources;
        this.f60506c = bArr;
        List<String> filters = getFilters();
        DecodeResult decodeResult = null;
        if (filters != null && !filters.isEmpty()) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            for (int i = 0; i < filters.size(); i++) {
                byteArrayOutputStream.reset();
                decodeResult = FilterFactory.INSTANCE.getFilter(filters.get(i)).decode(byteArrayInputStream, byteArrayOutputStream, cOSDictionary, i);
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
            this.f60507d = byteArrayOutputStream.toByteArray();
        } else {
            this.f60507d = bArr;
        }
        if (decodeResult != null) {
            cOSDictionary.addAll(decodeResult.getParameters());
        }
    }

    /* renamed from: a */
    public final PDColorSpace m32371a(COSBase cOSBase) {
        if (cOSBase instanceof COSName) {
            return PDColorSpace.create(m32370b(cOSBase), this.f60505b);
        }
        if (cOSBase instanceof COSArray) {
            COSArray cOSArray = (COSArray) cOSBase;
            if (cOSArray.size() > 1) {
                COSBase cOSBase2 = cOSArray.get(0);
                if (!COSName.f59789I.equals(cOSBase2) && !COSName.INDEXED.equals(cOSBase2)) {
                    throw new IOException("Illegal type of inline image color space: " + cOSBase2);
                }
                COSArray cOSArray2 = new COSArray();
                cOSArray2.addAll(cOSArray);
                cOSArray2.set(0, (COSBase) COSName.INDEXED);
                cOSArray2.set(1, m32370b(cOSArray.get(1)));
                return PDColorSpace.create(cOSArray2, this.f60505b);
            }
        }
        throw new IOException("Illegal type of object for inline image color space: " + cOSBase);
    }

    /* renamed from: b */
    public final COSBase m32370b(COSBase cOSBase) {
        if (COSName.RGB.equals(cOSBase)) {
            return COSName.DEVICERGB;
        }
        if (COSName.CMYK.equals(cOSBase)) {
            return COSName.DEVICECMYK;
        }
        if (COSName.f59787G.equals(cOSBase)) {
            return COSName.DEVICEGRAY;
        }
        return cOSBase;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream() throws IOException {
        return new ByteArrayInputStream(this.f60507d);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getBitsPerComponent() {
        if (isStencil()) {
            return 1;
        }
        return this.f60504a.getInt(COSName.BPC, COSName.BITS_PER_COMPONENT, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.f60504a;
    }

    @Deprecated
    public COSArray getColorKeyMask() {
        COSBase dictionaryObject = this.f60504a.getDictionaryObject(COSName.f59793IM, COSName.MASK);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public PDColorSpace getColorSpace() throws IOException {
        COSBase dictionaryObject = this.f60504a.getDictionaryObject(COSName.f59769CS, COSName.COLORSPACE);
        if (dictionaryObject != null) {
            return m32371a(dictionaryObject);
        }
        if (isStencil()) {
            return PDDeviceGray.INSTANCE;
        }
        throw new IOException("could not determine inline image color space");
    }

    public byte[] getData() {
        return this.f60507d;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public COSArray getDecode() {
        return (COSArray) this.f60504a.getDictionaryObject(COSName.f59770D, COSName.DECODE);
    }

    public List<String> getFilters() {
        COSDictionary cOSDictionary = this.f60504a;
        COSName cOSName = COSName.f59782F;
        COSName cOSName2 = COSName.FILTER;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName, cOSName2);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName3 = (COSName) dictionaryObject;
            return new COSArrayList(cOSName3.getName(), cOSName3, this.f60504a, cOSName2);
        } else if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSNameCOSArrayToList((COSArray) dictionaryObject);
        } else {
            return null;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getHeight() {
        return this.f60504a.getInt(COSName.f59788H, COSName.HEIGHT, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage() throws IOException {
        return AbstractC20691kD1.m28977g(this, null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean getInterpolate() {
        return this.f60504a.getBoolean(COSName.f59789I, COSName.INTERPOLATE, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getStencilImage(Paint paint) throws IOException {
        if (isStencil()) {
            return AbstractC20691kD1.m28976h(this, paint);
        }
        throw new IllegalStateException("Image is not a stencil");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public String getSuffix() {
        List<String> filters = getFilters();
        if (filters == null || filters.isEmpty()) {
            return "png";
        }
        if (!filters.contains(COSName.DCT_DECODE.getName()) && !filters.contains(COSName.DCT_DECODE_ABBREVIATION.getName())) {
            if (!filters.contains(COSName.CCITTFAX_DECODE.getName()) && !filters.contains(COSName.CCITTFAX_DECODE_ABBREVIATION.getName())) {
                return "png";
            }
            return "tiff";
        }
        return "jpg";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getWidth() {
        return this.f60504a.getInt(COSName.f59846W, COSName.WIDTH, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isEmpty() {
        if (this.f60507d.length == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isStencil() {
        return this.f60504a.getBoolean(COSName.f59793IM, COSName.IMAGE_MASK, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setBitsPerComponent(int i) {
        this.f60504a.setInt(COSName.BPC, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setColorSpace(PDColorSpace pDColorSpace) {
        COSBase cOSBase;
        if (pDColorSpace != null) {
            cOSBase = pDColorSpace.getCOSObject();
        } else {
            cOSBase = null;
        }
        this.f60504a.setItem(COSName.f59769CS, cOSBase);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setDecode(COSArray cOSArray) {
        this.f60504a.setItem(COSName.f59770D, (COSBase) cOSArray);
    }

    public void setFilters(List<String> list) {
        this.f60504a.setItem(COSName.f59782F, (COSBase) COSArrayList.convertStringListToCOSNameCOSArray(list));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setHeight(int i) {
        this.f60504a.setInt(COSName.f59788H, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setInterpolate(boolean z) {
        this.f60504a.setBoolean(COSName.f59789I, z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setStencil(boolean z) {
        this.f60504a.setBoolean(COSName.f59793IM, z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setWidth(int i) {
        this.f60504a.setInt(COSName.f59846W, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(DecodeOptions decodeOptions) throws IOException {
        return createInputStream();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage(Rect rect, int i) throws IOException {
        return AbstractC20691kD1.m28978f(this, rect, i, null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(List<String> list) throws IOException {
        List<String> filters = getFilters();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f60506c);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.f60506c.length);
        for (int i = 0; filters != null && i < filters.size(); i++) {
            byteArrayOutputStream.reset();
            if (list.contains(filters.get(i))) {
                break;
            }
            FilterFactory.INSTANCE.getFilter(filters.get(i)).decode(byteArrayInputStream, byteArrayOutputStream, this.f60504a, i);
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }
        return byteArrayInputStream;
    }
}
