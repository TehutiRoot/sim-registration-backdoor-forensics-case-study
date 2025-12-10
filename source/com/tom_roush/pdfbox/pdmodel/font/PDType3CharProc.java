package com.tom_roush.pdfbox.pdmodel.font;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class PDType3CharProc implements COSObjectable, PDContentStream {

    /* renamed from: a */
    public final PDType3Font f60436a;

    /* renamed from: b */
    public final COSStream f60437b;

    public PDType3CharProc(PDType3Font pDType3Font, COSStream cOSStream) {
        this.f60436a = pDType3Font;
        this.f60437b = cOSStream;
    }

    /* renamed from: a */
    public final float m32417a(Operator operator, List list) {
        if (!operator.getName().equals(OperatorName.TYPE3_D0) && !operator.getName().equals(OperatorName.TYPE3_D1)) {
            throw new IOException("First operator must be d0 or d1");
        }
        COSBase cOSBase = (COSBase) list.get(0);
        if (cOSBase instanceof COSNumber) {
            return ((COSNumber) cOSBase).floatValue();
        }
        throw new IOException("Unexpected argument type: " + cOSBase.getClass().getName());
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDRectangle getBBox() {
        return this.f60436a.getFontBBox();
    }

    public PDStream getContentStream() {
        return new PDStream(this.f60437b);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public InputStream getContents() throws IOException {
        return this.f60437b.createInputStream();
    }

    public PDType3Font getFont() {
        return this.f60436a;
    }

    public PDRectangle getGlyphBBox() throws IOException {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(this);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                if (!((Operator) parseNextToken).getName().equals(OperatorName.TYPE3_D1) || arrayList.size() != 6) {
                    return null;
                }
                for (int i = 0; i < 6; i++) {
                    if (!(arrayList.get(i) instanceof COSNumber)) {
                        return null;
                    }
                }
                return new PDRectangle(((COSNumber) arrayList.get(2)).floatValue(), ((COSNumber) arrayList.get(3)).floatValue(), ((COSNumber) arrayList.get(4)).floatValue() - ((COSNumber) arrayList.get(2)).floatValue(), ((COSNumber) arrayList.get(5)).floatValue() - ((COSNumber) arrayList.get(3)).floatValue());
            }
            arrayList.add((COSBase) parseNextToken);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public Matrix getMatrix() {
        return this.f60436a.getFontMatrix();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDResources getResources() {
        COSStream cOSStream = this.f60437b;
        COSName cOSName = COSName.RESOURCES;
        if (cOSStream.containsKey(cOSName)) {
            Log.w("PdfBox-Android", "Using resources dictionary found in charproc entry");
            Log.w("PdfBox-Android", "This should have been in the font or in the page dictionary");
            return new PDResources((COSDictionary) this.f60437b.getDictionaryObject(cOSName));
        }
        return this.f60436a.getResources();
    }

    public float getWidth() throws IOException {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(this);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                return m32417a((Operator) parseNextToken, arrayList);
            }
            arrayList.add((COSBase) parseNextToken);
        }
        throw new IOException("Unexpected end of stream");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSStream getCOSObject() {
        return this.f60437b;
    }
}
