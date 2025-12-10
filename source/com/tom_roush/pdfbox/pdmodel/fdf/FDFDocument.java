package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdfparser.FDFParser;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.util.XMLUtil;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes5.dex */
public class FDFDocument implements Closeable {

    /* renamed from: a */
    public COSDocument f60333a;

    public FDFDocument() {
        COSDocument cOSDocument = new COSDocument();
        this.f60333a = cOSDocument;
        cOSDocument.setVersion(1.2f);
        this.f60333a.setTrailer(new COSDictionary());
        setCatalog(new FDFCatalog());
    }

    public static FDFDocument load(String str) throws IOException {
        FDFParser fDFParser = new FDFParser(str);
        fDFParser.parse();
        return new FDFDocument(fDFParser.getDocument());
    }

    public static FDFDocument loadXFDF(String str) throws IOException {
        return loadXFDF(new BufferedInputStream(new FileInputStream(str)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f60333a.close();
    }

    public FDFCatalog getCatalog() {
        COSDictionary cOSDictionary = this.f60333a.getTrailer().getCOSDictionary(COSName.ROOT);
        if (cOSDictionary == null) {
            FDFCatalog fDFCatalog = new FDFCatalog();
            setCatalog(fDFCatalog);
            return fDFCatalog;
        }
        return new FDFCatalog(cOSDictionary);
    }

    public COSDocument getDocument() {
        return this.f60333a;
    }

    public void save(File file) throws IOException {
        save(new FileOutputStream(file));
    }

    public void saveXFDF(File file) throws IOException {
        saveXFDF(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8")));
    }

    public void setCatalog(FDFCatalog fDFCatalog) {
        this.f60333a.getTrailer().setItem(COSName.ROOT, fDFCatalog);
    }

    public void writeXML(Writer writer) throws IOException {
        writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        writer.write("<xfdf xmlns=\"http://ns.adobe.com/xfdf/\" xml:space=\"preserve\">\n");
        getCatalog().writeXML(writer);
        writer.write("</xfdf>\n");
    }

    public static FDFDocument loadXFDF(File file) throws IOException {
        return loadXFDF(new BufferedInputStream(new FileInputStream(file)));
    }

    public void save(String str) throws IOException {
        save(new FileOutputStream(str));
    }

    public void saveXFDF(String str) throws IOException {
        saveXFDF(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8")));
    }

    public static FDFDocument loadXFDF(InputStream inputStream) throws IOException {
        return new FDFDocument(XMLUtil.parse(inputStream));
    }

    public void save(OutputStream outputStream) throws IOException {
        COSWriter cOSWriter;
        COSWriter cOSWriter2 = null;
        try {
            cOSWriter = new COSWriter(outputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            cOSWriter.write(this);
            cOSWriter.close();
            cOSWriter.close();
        } catch (Throwable th3) {
            th = th3;
            cOSWriter2 = cOSWriter;
            if (cOSWriter2 != null) {
                cOSWriter2.close();
            }
            throw th;
        }
    }

    public void saveXFDF(Writer writer) throws IOException {
        try {
            writeXML(writer);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static FDFDocument load(File file) throws IOException {
        FDFParser fDFParser = new FDFParser(file);
        fDFParser.parse();
        return new FDFDocument(fDFParser.getDocument());
    }

    public FDFDocument(COSDocument cOSDocument) {
        this.f60333a = cOSDocument;
    }

    public static FDFDocument load(InputStream inputStream) throws IOException {
        FDFParser fDFParser = new FDFParser(inputStream);
        fDFParser.parse();
        return new FDFDocument(fDFParser.getDocument());
    }

    public FDFDocument(Document document) throws IOException {
        this();
        Element documentElement = document.getDocumentElement();
        if (documentElement.getNodeName().equals("xfdf")) {
            setCatalog(new FDFCatalog(documentElement));
            return;
        }
        throw new IOException("Error while importing xfdf document, root should be 'xfdf' and not '" + documentElement.getNodeName() + OperatorName.SHOW_TEXT_LINE);
    }
}
