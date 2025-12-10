package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class SigningSupport implements ExternalSigningSupport, Closeable {

    /* renamed from: a */
    public COSWriter f60649a;

    public SigningSupport(COSWriter cOSWriter) {
        this.f60649a = cOSWriter;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        COSWriter cOSWriter = this.f60649a;
        if (cOSWriter != null) {
            try {
                cOSWriter.close();
            } finally {
                this.f60649a = null;
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport
    public InputStream getContent() throws IOException {
        return this.f60649a.getDataToSign();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport
    public void setSignature(byte[] bArr) throws IOException {
        this.f60649a.writeExternalSignature(bArr);
    }
}