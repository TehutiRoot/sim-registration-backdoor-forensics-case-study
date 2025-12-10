package com.tom_roush.pdfbox.pdfparser;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.RandomAccessBuffer;
import com.tom_roush.pdfbox.p019io.RandomAccessFile;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class FDFParser extends COSParser {
    public FDFParser(String str) throws IOException {
        this(new File(str));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0023 -> B:15:0x0025). Please submit an issue!!! */
    private void initialParse() {
        COSDictionary cOSDictionary;
        boolean z;
        long startxrefOffset;
        try {
            startxrefOffset = getStartxrefOffset();
            z = false;
        } catch (IOException e) {
            if (!isLenient()) {
                throw e;
            }
        }
        if (startxrefOffset > 0) {
            cOSDictionary = parseXref(startxrefOffset);
        } else {
            if (!isLenient()) {
                cOSDictionary = null;
            }
            cOSDictionary = null;
            z = true;
        }
        if (z) {
            cOSDictionary = rebuildTrailer();
        }
        COSBase parseTrailerValuesDynamically = parseTrailerValuesDynamically(cOSDictionary);
        if (parseTrailerValuesDynamically instanceof COSDictionary) {
            parseDictObjects((COSDictionary) parseTrailerValuesDynamically, null);
        }
        this.initialParseDone = true;
    }

    /* renamed from: Y */
    public final void m32649Y() {
        String property = System.getProperty(COSParser.SYSPROP_EOFLOOKUPRANGE);
        if (property != null) {
            try {
                setEOFLookupRange(Integer.parseInt(property));
            } catch (NumberFormatException unused) {
                Log.w("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + OperatorName.SHOW_TEXT_LINE);
            }
        }
        this.document = new COSDocument();
    }

    @Override // com.tom_roush.pdfbox.pdfparser.COSParser
    public final boolean isCatalog(COSDictionary cOSDictionary) {
        return cOSDictionary.containsKey(COSName.FDF);
    }

    public void parse() throws IOException {
        try {
            if (parseFDFHeader()) {
                initialParse();
                return;
            }
            throw new IOException("Error: Header doesn't contain versioninfo");
        } catch (Throwable th2) {
            COSDocument cOSDocument = this.document;
            if (cOSDocument != null) {
                IOUtils.closeQuietly(cOSDocument);
                this.document = null;
            }
            throw th2;
        }
    }

    public FDFParser(File file) throws IOException {
        super(new RandomAccessFile(file, PDPageLabelRange.STYLE_ROMAN_LOWER));
        this.fileLen = file.length();
        m32649Y();
    }

    public FDFParser(InputStream inputStream) throws IOException {
        super(new RandomAccessBuffer(inputStream));
        this.fileLen = this.source.length();
        m32649Y();
    }
}
