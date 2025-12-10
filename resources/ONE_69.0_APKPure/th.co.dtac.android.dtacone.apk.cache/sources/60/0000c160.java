package com.tom_roush.pdfbox.pdfparser;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.RandomAccessRead;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDFParser extends COSParser {
    public PDFParser(RandomAccessRead randomAccessRead) throws IOException {
        this(randomAccessRead, "", ScratchFile.getMainMemoryOnlyInstance());
    }

    /* renamed from: Y */
    public final void m32638Y(ScratchFile scratchFile) {
        String property = System.getProperty(COSParser.SYSPROP_EOFLOOKUPRANGE);
        if (property != null) {
            try {
                setEOFLookupRange(Integer.parseInt(property));
            } catch (NumberFormatException unused) {
                Log.w("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + OperatorName.SHOW_TEXT_LINE);
            }
        }
        this.document = new COSDocument(scratchFile);
    }

    public PDDocument getPDDocument() throws IOException {
        PDDocument pDDocument = new PDDocument(getDocument(), this.source, getAccessPermission());
        pDDocument.setEncryptionDictionary(getEncryption());
        return pDDocument;
    }

    public void initialParse() throws IOException {
        COSDictionary retrieveTrailer = retrieveTrailer();
        COSBase parseTrailerValuesDynamically = parseTrailerValuesDynamically(retrieveTrailer);
        if (parseTrailerValuesDynamically instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) parseTrailerValuesDynamically;
            if (isLenient()) {
                COSName cOSName = COSName.TYPE;
                if (!cOSDictionary.containsKey(cOSName)) {
                    cOSDictionary.setItem(cOSName, (COSBase) COSName.CATALOG);
                }
            }
            parseDictObjects(cOSDictionary, null);
            COSBase dictionaryObject = retrieveTrailer.getDictionaryObject(COSName.INFO);
            if (dictionaryObject instanceof COSDictionary) {
                parseDictObjects((COSDictionary) dictionaryObject, null);
            }
            checkPages(cOSDictionary);
            if (cOSDictionary.getDictionaryObject(COSName.PAGES) instanceof COSDictionary) {
                this.document.setDecrypted();
                this.initialParseDone = true;
                return;
            }
            throw new IOException("Page tree root must be a dictionary");
        }
        throw new IOException("Expected root dictionary, but got this: " + parseTrailerValuesDynamically);
    }

    public void parse() throws IOException {
        try {
            if (!parsePDFHeader() && !parseFDFHeader()) {
                throw new IOException("Error: Header doesn't contain versioninfo");
            }
            if (!this.initialParseDone) {
                initialParse();
            }
        } catch (Throwable th2) {
            COSDocument cOSDocument = this.document;
            if (cOSDocument != null) {
                IOUtils.closeQuietly(cOSDocument);
                this.document = null;
            }
            throw th2;
        }
    }

    public PDFParser(RandomAccessRead randomAccessRead, ScratchFile scratchFile) throws IOException {
        this(randomAccessRead, "", scratchFile);
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str) throws IOException {
        this(randomAccessRead, str, ScratchFile.getMainMemoryOnlyInstance());
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str, ScratchFile scratchFile) throws IOException {
        this(randomAccessRead, str, null, null, scratchFile);
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str, InputStream inputStream, String str2) throws IOException {
        this(randomAccessRead, str, inputStream, str2, ScratchFile.getMainMemoryOnlyInstance());
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str, InputStream inputStream, String str2, ScratchFile scratchFile) throws IOException {
        super(randomAccessRead, str, inputStream, str2);
        this.fileLen = randomAccessRead.length();
        m32638Y(scratchFile);
    }
}