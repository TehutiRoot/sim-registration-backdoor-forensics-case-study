package com.tom_roush.pdfbox.pdmodel.common;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class PDStream implements COSObjectable {

    /* renamed from: a */
    public final COSStream f60181a;

    public PDStream(PDDocument pDDocument) {
        this.f60181a = pDDocument.getDocument().createCOSStream();
    }

    /* renamed from: a */
    public final List m32554a(COSName cOSName, COSName cOSName2) {
        COSBase dictionaryObject = this.f60181a.getDictionaryObject(cOSName, cOSName2);
        if (dictionaryObject instanceof COSDictionary) {
            return new COSArrayList(COSDictionaryMap.convertBasicTypesToMap((COSDictionary) dictionaryObject), dictionaryObject, this.f60181a, cOSName);
        }
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            ArrayList arrayList = new ArrayList(cOSArray.size());
            for (int i = 0; i < cOSArray.size(); i++) {
                COSBase object = cOSArray.getObject(i);
                if (object instanceof COSDictionary) {
                    arrayList.add(COSDictionaryMap.convertBasicTypesToMap((COSDictionary) object));
                } else {
                    Log.w("PdfBox-Android", "Expected COSDictionary, got " + object + ", ignored");
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    @Deprecated
    public void addCompression() {
        if (getFilters() == null) {
            if (this.f60181a.getLength() > 0) {
                OutputStream outputStream = null;
                try {
                    try {
                        byte[] byteArray = IOUtils.toByteArray(this.f60181a.createInputStream());
                        outputStream = this.f60181a.createOutputStream(COSName.FLATE_DECODE);
                        outputStream.write(byteArray);
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    IOUtils.closeQuietly(outputStream);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(COSName.FLATE_DECODE);
            setFilters(arrayList);
        }
    }

    public COSInputStream createInputStream() throws IOException {
        return this.f60181a.createInputStream();
    }

    public OutputStream createOutputStream() throws IOException {
        return this.f60181a.createOutputStream();
    }

    public List<Object> getDecodeParms() throws IOException {
        return m32554a(COSName.DECODE_PARMS, COSName.f59775DP);
    }

    public int getDecodedStreamLength() {
        return this.f60181a.getInt(COSName.f59773DL);
    }

    public PDFileSpecification getFile() throws IOException {
        return PDFileSpecification.createFS(this.f60181a.getDictionaryObject(COSName.f59782F));
    }

    public List<Object> getFileDecodeParams() throws IOException {
        return m32554a(COSName.F_DECODE_PARMS, null);
    }

    public List<String> getFileFilters() {
        COSStream cOSStream = this.f60181a;
        COSName cOSName = COSName.F_FILTER;
        COSBase dictionaryObject = cOSStream.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName2 = (COSName) dictionaryObject;
            return new COSArrayList(cOSName2.getName(), cOSName2, this.f60181a, cOSName);
        } else if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSNameCOSArrayToList((COSArray) dictionaryObject);
        } else {
            return null;
        }
    }

    public List<COSName> getFilters() {
        COSBase filters = this.f60181a.getFilters();
        if (filters instanceof COSName) {
            COSName cOSName = (COSName) filters;
            return new COSArrayList(cOSName, cOSName, this.f60181a, COSName.FILTER);
        } else if (filters instanceof COSArray) {
            return ((COSArray) filters).toList();
        } else {
            return null;
        }
    }

    public int getLength() {
        return this.f60181a.getInt(COSName.LENGTH, 0);
    }

    public PDMetadata getMetadata() {
        COSBase dictionaryObject = this.f60181a.getDictionaryObject(COSName.METADATA);
        if (dictionaryObject != null) {
            if (dictionaryObject instanceof COSStream) {
                return new PDMetadata((COSStream) dictionaryObject);
            }
            if (!(dictionaryObject instanceof COSNull)) {
                throw new IllegalStateException("Expected a COSStream but was a " + dictionaryObject.getClass().getSimpleName());
            }
        }
        return null;
    }

    @Deprecated
    public COSStream getStream() {
        return this.f60181a;
    }

    public void setDecodeParms(List<?> list) {
        this.f60181a.setItem(COSName.DECODE_PARMS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDecodedStreamLength(int i) {
        this.f60181a.setInt(COSName.f59773DL, i);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.f60181a.setItem(COSName.f59782F, pDFileSpecification);
    }

    public void setFileDecodeParams(List<?> list) {
        this.f60181a.setItem(COSName.F_DECODE_PARMS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setFileFilters(List<String> list) {
        this.f60181a.setItem(COSName.F_FILTER, (COSBase) COSArrayList.convertStringListToCOSNameCOSArray(list));
    }

    public void setFilters(List<COSName> list) {
        this.f60181a.setItem(COSName.FILTER, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setMetadata(PDMetadata pDMetadata) {
        this.f60181a.setItem(COSName.METADATA, pDMetadata);
    }

    public byte[] toByteArray() throws IOException {
        COSInputStream cOSInputStream;
        try {
            cOSInputStream = createInputStream();
            try {
                byte[] byteArray = IOUtils.toByteArray(cOSInputStream);
                if (cOSInputStream != null) {
                    cOSInputStream.close();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                if (cOSInputStream != null) {
                    cOSInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cOSInputStream = null;
        }
    }

    public COSInputStream createInputStream(DecodeOptions decodeOptions) throws IOException {
        return this.f60181a.createInputStream(decodeOptions);
    }

    public OutputStream createOutputStream(COSName cOSName) throws IOException {
        return this.f60181a.createOutputStream(cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSStream getCOSObject() {
        return this.f60181a;
    }

    public PDStream(COSDocument cOSDocument) {
        this.f60181a = cOSDocument.createCOSStream();
    }

    public InputStream createInputStream(List<String> list) throws IOException {
        InputStream createRawInputStream = this.f60181a.createRawInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        List<COSName> filters = getFilters();
        if (filters != null) {
            for (int i = 0; i < filters.size(); i++) {
                COSName cOSName = filters.get(i);
                if (list != null && list.contains(cOSName.getName())) {
                    break;
                }
                try {
                    FilterFactory.INSTANCE.getFilter(cOSName).decode(createRawInputStream, byteArrayOutputStream, this.f60181a, i);
                    IOUtils.closeQuietly(createRawInputStream);
                    createRawInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                } catch (Throwable th2) {
                    IOUtils.closeQuietly(createRawInputStream);
                    throw th2;
                }
            }
        }
        return createRawInputStream;
    }

    public PDStream(COSStream cOSStream) {
        this.f60181a = cOSStream;
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream) throws IOException {
        this(pDDocument, inputStream, (COSBase) null);
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream, COSName cOSName) throws IOException {
        this(pDDocument, inputStream, (COSBase) cOSName);
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream, COSArray cOSArray) throws IOException {
        this(pDDocument, inputStream, (COSBase) cOSArray);
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream, COSBase cOSBase) {
        OutputStream outputStream = null;
        try {
            COSStream createCOSStream = pDDocument.getDocument().createCOSStream();
            this.f60181a = createCOSStream;
            outputStream = createCOSStream.createOutputStream(cOSBase);
            IOUtils.copy(inputStream, outputStream);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            inputStream.close();
        }
    }
}
