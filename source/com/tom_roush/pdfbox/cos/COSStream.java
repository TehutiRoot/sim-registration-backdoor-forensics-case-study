package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.RandomAccess;
import com.tom_roush.pdfbox.p019io.RandomAccessInputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessOutputStream;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class COSStream extends COSDictionary implements Closeable {

    /* renamed from: c */
    public RandomAccess f59862c;

    /* renamed from: d */
    public final ScratchFile f59863d;

    /* renamed from: e */
    public boolean f59864e;

    /* renamed from: com.tom_roush.pdfbox.cos.COSStream$a */
    /* loaded from: classes5.dex */
    public class C9900a extends FilterOutputStream {
        public C9900a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            COSStream cOSStream = COSStream.this;
            cOSStream.setInt(COSName.LENGTH, (int) cOSStream.f59862c.length());
            COSStream.this.f59864e = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.cos.COSStream$b */
    /* loaded from: classes5.dex */
    public class C9901b extends FilterOutputStream {
        public C9901b(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            COSStream cOSStream = COSStream.this;
            cOSStream.setInt(COSName.LENGTH, (int) cOSStream.f59862c.length());
            COSStream.this.f59864e = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        }
    }

    public COSStream() {
        this(ScratchFile.getMainMemoryOnlyInstance());
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromStream(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccess randomAccess = this.f59862c;
        if (randomAccess != null) {
            randomAccess.close();
        }
    }

    @Deprecated
    public OutputStream createFilteredStream() throws IOException {
        return createRawOutputStream();
    }

    public COSInputStream createInputStream() throws IOException {
        return createInputStream(DecodeOptions.DEFAULT);
    }

    public OutputStream createOutputStream() throws IOException {
        return createOutputStream(null);
    }

    public InputStream createRawInputStream() throws IOException {
        m32784i();
        if (!this.f59864e) {
            m32783j(true);
            return new RandomAccessInputStream(this.f59862c);
        }
        throw new IllegalStateException("Cannot read while there is an open stream writer");
    }

    public OutputStream createRawOutputStream() throws IOException {
        m32784i();
        if (!this.f59864e) {
            IOUtils.closeQuietly(this.f59862c);
            this.f59862c = this.f59863d.createBuffer();
            RandomAccessOutputStream randomAccessOutputStream = new RandomAccessOutputStream(this.f59862c);
            this.f59864e = true;
            return new C9901b(randomAccessOutputStream);
        }
        throw new IllegalStateException("Cannot have more than one open stream writer.");
    }

    @Deprecated
    public OutputStream createUnfilteredStream() throws IOException {
        return createOutputStream();
    }

    @Deprecated
    public InputStream getFilteredStream() throws IOException {
        return createRawInputStream();
    }

    public COSBase getFilters() {
        return getDictionaryObject(COSName.FILTER);
    }

    public long getLength() {
        if (!this.f59864e) {
            return getInt(COSName.LENGTH, 0);
        }
        throw new IllegalStateException("There is an open OutputStream associated with this COSStream. It must be closed before querying the length of this COSStream.");
    }

    @Deprecated
    public String getString() {
        return toTextString();
    }

    @Deprecated
    public InputStream getUnfilteredStream() throws IOException {
        return createInputStream();
    }

    /* renamed from: i */
    public final void m32784i() {
        RandomAccess randomAccess = this.f59862c;
        if (randomAccess != null && randomAccess.isClosed()) {
            throw new IOException("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
        }
    }

    /* renamed from: j */
    public final void m32783j(boolean z) {
        if (this.f59862c == null) {
            if (z) {
                PDFBoxConfig.isDebugEnabled();
            }
            this.f59862c = this.f59863d.createBuffer();
        }
    }

    /* renamed from: k */
    public final List m32782k() {
        String name;
        COSBase filters = getFilters();
        if (filters instanceof COSName) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(FilterFactory.INSTANCE.getFilter((COSName) filters));
            return arrayList;
        } else if (filters instanceof COSArray) {
            COSArray cOSArray = (COSArray) filters;
            ArrayList arrayList2 = new ArrayList(cOSArray.size());
            for (int i = 0; i < cOSArray.size(); i++) {
                COSBase cOSBase = cOSArray.get(i);
                if (!(cOSBase instanceof COSName)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Forbidden type in filter array: ");
                    if (cOSBase == null) {
                        name = AbstractJsonLexerKt.NULL;
                    } else {
                        name = cOSBase.getClass().getName();
                    }
                    sb.append(name);
                    throw new IOException(sb.toString());
                }
                arrayList2.add(FilterFactory.INSTANCE.getFilter((COSName) cOSBase));
            }
            return arrayList2;
        } else {
            return new ArrayList();
        }
    }

    @Deprecated
    public void setFilters(COSBase cOSBase) throws IOException {
        setItem(COSName.FILTER, cOSBase);
    }

    public String toTextString() {
        COSInputStream cOSInputStream = null;
        try {
            cOSInputStream = createInputStream();
            byte[] byteArray = IOUtils.toByteArray(cOSInputStream);
            IOUtils.closeQuietly(cOSInputStream);
            return new COSString(byteArray).getString();
        } catch (IOException unused) {
            IOUtils.closeQuietly(cOSInputStream);
            return "";
        } catch (Throwable th2) {
            IOUtils.closeQuietly(cOSInputStream);
            throw th2;
        }
    }

    public COSStream(ScratchFile scratchFile) {
        setInt(COSName.LENGTH, 0);
        this.f59863d = scratchFile == null ? ScratchFile.getMainMemoryOnlyInstance() : scratchFile;
    }

    public COSInputStream createInputStream(DecodeOptions decodeOptions) throws IOException {
        m32784i();
        if (!this.f59864e) {
            m32783j(true);
            return COSInputStream.m32789b(m32782k(), this, new RandomAccessInputStream(this.f59862c), this.f59863d, decodeOptions);
        }
        throw new IllegalStateException("Cannot read while there is an open stream writer");
    }

    public OutputStream createOutputStream(COSBase cOSBase) throws IOException {
        m32784i();
        if (!this.f59864e) {
            if (cOSBase != null) {
                setItem(COSName.FILTER, cOSBase);
            }
            IOUtils.closeQuietly(this.f59862c);
            this.f59862c = this.f59863d.createBuffer();
            COSOutputStream cOSOutputStream = new COSOutputStream(m32782k(), this, new RandomAccessOutputStream(this.f59862c), this.f59863d);
            this.f59864e = true;
            return new C9900a(cOSOutputStream);
        }
        throw new IllegalStateException("Cannot have more than one open stream writer.");
    }
}
