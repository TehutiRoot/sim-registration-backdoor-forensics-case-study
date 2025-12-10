package p000;

import com.tom_roush.fontbox.afm.FontMetrics;
import com.tom_roush.fontbox.encoding.BuiltInEncoding;
import com.tom_roush.fontbox.pfb.PfbParser;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: rh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21971rh1 {

    /* renamed from: a */
    public final Encoding f77379a;

    /* renamed from: b */
    public final Type1Font f77380b;

    public C21971rh1(PDDocument pDDocument, COSDictionary cOSDictionary, InputStream inputStream, Encoding encoding) {
        cOSDictionary.setItem(COSName.SUBTYPE, COSName.TYPE1);
        byte[] byteArray = IOUtils.toByteArray(inputStream);
        PfbParser pfbParser = new PfbParser(byteArray);
        Type1Font createWithPFB = Type1Font.createWithPFB(byteArray);
        this.f77380b = createWithPFB;
        if (encoding == null) {
            this.f77379a = Type1Encoding.fromFontBox(createWithPFB.getEncoding());
        } else {
            this.f77379a = encoding;
        }
        PDFontDescriptor m23285b = m23285b(createWithPFB);
        PDStream pDStream = new PDStream(pDDocument, pfbParser.getInputStream(), COSName.FLATE_DECODE);
        pDStream.getCOSObject().setInt("Length", pfbParser.size());
        int i = 0;
        while (i < pfbParser.getLengths().length) {
            COSStream cOSObject = pDStream.getCOSObject();
            StringBuilder sb = new StringBuilder();
            sb.append("Length");
            int i2 = i + 1;
            sb.append(i2);
            cOSObject.setInt(sb.toString(), pfbParser.getLengths()[i]);
            i = i2;
        }
        m23285b.setFontFile(pDStream);
        cOSDictionary.setItem(COSName.FONT_DESC, m23285b);
        cOSDictionary.setName(COSName.BASE_FONT, this.f77380b.getName());
        ArrayList arrayList = new ArrayList(256);
        for (int i3 = 0; i3 <= 255; i3++) {
            arrayList.add(Integer.valueOf(Math.round(this.f77380b.getWidth(this.f77379a.getName(i3)))));
        }
        cOSDictionary.setInt(COSName.FIRST_CHAR, 0);
        cOSDictionary.setInt(COSName.LAST_CHAR, 255);
        cOSDictionary.setItem(COSName.WIDTHS, COSArrayList.converterToCOSArray(arrayList));
        cOSDictionary.setItem(COSName.ENCODING, encoding);
    }

    /* renamed from: a */
    public static PDFontDescriptor m23286a(FontMetrics fontMetrics) {
        boolean equals = fontMetrics.getEncodingScheme().equals("FontSpecific");
        PDFontDescriptor pDFontDescriptor = new PDFontDescriptor();
        pDFontDescriptor.setFontName(fontMetrics.getFontName());
        pDFontDescriptor.setFontFamily(fontMetrics.getFamilyName());
        pDFontDescriptor.setNonSymbolic(!equals);
        pDFontDescriptor.setSymbolic(equals);
        pDFontDescriptor.setFontBoundingBox(new PDRectangle(fontMetrics.getFontBBox()));
        pDFontDescriptor.setItalicAngle(fontMetrics.getItalicAngle());
        pDFontDescriptor.setAscent(fontMetrics.getAscender());
        pDFontDescriptor.setDescent(fontMetrics.getDescender());
        pDFontDescriptor.setCapHeight(fontMetrics.getCapHeight());
        pDFontDescriptor.setXHeight(fontMetrics.getXHeight());
        pDFontDescriptor.setAverageWidth(fontMetrics.getAverageCharacterWidth());
        pDFontDescriptor.setCharacterSet(fontMetrics.getCharacterSet());
        pDFontDescriptor.setStemV(0.0f);
        return pDFontDescriptor;
    }

    /* renamed from: b */
    public static PDFontDescriptor m23285b(Type1Font type1Font) {
        boolean z = type1Font.getEncoding() instanceof BuiltInEncoding;
        BoundingBox fontBBox = type1Font.getFontBBox();
        PDFontDescriptor pDFontDescriptor = new PDFontDescriptor();
        pDFontDescriptor.setFontName(type1Font.getName());
        pDFontDescriptor.setFontFamily(type1Font.getFamilyName());
        pDFontDescriptor.setNonSymbolic(!z);
        pDFontDescriptor.setSymbolic(z);
        pDFontDescriptor.setFontBoundingBox(new PDRectangle(fontBBox));
        pDFontDescriptor.setItalicAngle(type1Font.getItalicAngle());
        pDFontDescriptor.setAscent(fontBBox.getUpperRightY());
        pDFontDescriptor.setDescent(fontBBox.getLowerLeftY());
        pDFontDescriptor.setCapHeight(type1Font.getBlueValues().get(2).floatValue());
        pDFontDescriptor.setStemV(0.0f);
        return pDFontDescriptor;
    }

    /* renamed from: c */
    public Encoding m23284c() {
        return this.f77379a;
    }

    /* renamed from: d */
    public GlyphList m23283d() {
        return GlyphList.getAdobeGlyphList();
    }

    /* renamed from: e */
    public Type1Font m23282e() {
        return this.f77380b;
    }
}
