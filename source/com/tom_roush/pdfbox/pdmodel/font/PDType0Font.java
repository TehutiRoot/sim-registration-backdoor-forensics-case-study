package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.ttf.CmapLookup;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class PDType0Font extends PDFont implements PDVectorFont {

    /* renamed from: h */
    public final PDCIDFont f60409h;

    /* renamed from: i */
    public CMap f60410i;

    /* renamed from: j */
    public CMap f60411j;

    /* renamed from: k */
    public boolean f60412k;

    /* renamed from: l */
    public boolean f60413l;

    /* renamed from: m */
    public PDCIDFontType2Embedder f60414m;

    /* renamed from: n */
    public final Set f60415n;

    /* renamed from: o */
    public TrueTypeFont f60416o;

    public PDType0Font(COSDictionary cOSDictionary) throws IOException {
        super(cOSDictionary);
        this.f60415n = new HashSet();
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.DESCENDANT_FONTS);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() != 0) {
                COSBase object = cOSArray.getObject(0);
                if (object instanceof COSDictionary) {
                    this.f60409h = PDFontFactory.m32430a((COSDictionary) object, this);
                    readEncoding();
                    m32426c();
                    return;
                }
                throw new IOException("Missing descendant font dictionary");
            }
            throw new IOException("Descendant font array is empty");
        }
        throw new IOException("Missing descendant font array");
    }

    public static PDType0Font load(PDDocument pDDocument, File file) throws IOException {
        return new PDType0Font(pDDocument, new TTFParser().parse(file), true, true, false);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, File file) throws IOException {
        return new PDType0Font(pDDocument, new TTFParser().parse(file), true, true, true);
    }

    private void readEncoding() {
        COSBase dictionaryObject = this.dict.getDictionaryObject(COSName.ENCODING);
        boolean z = true;
        if (dictionaryObject instanceof COSName) {
            CMap m30791a = AbstractC10398hg.m30791a(((COSName) dictionaryObject).getName());
            this.f60410i = m30791a;
            if (m30791a != null) {
                this.f60412k = true;
            } else {
                throw new IOException("Missing required CMap");
            }
        } else if (dictionaryObject != null) {
            CMap readCMap = readCMap(dictionaryObject);
            this.f60410i = readCMap;
            if (readCMap != null) {
                if (!readCMap.hasCIDMappings()) {
                    Log.w("PdfBox-Android", "Invalid Encoding CMap in font " + getName());
                }
            } else {
                throw new IOException("Missing required CMap");
            }
        }
        PDCIDSystemInfo cIDSystemInfo = this.f60409h.getCIDSystemInfo();
        if (cIDSystemInfo != null) {
            if (!"Adobe".equals(cIDSystemInfo.getRegistry()) || (!"GB1".equals(cIDSystemInfo.getOrdering()) && !"CNS1".equals(cIDSystemInfo.getOrdering()) && !"Japan1".equals(cIDSystemInfo.getOrdering()) && !"Korea1".equals(cIDSystemInfo.getOrdering()))) {
                z = false;
            }
            this.f60413l = z;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void addToSubset(int i) {
        if (willBeSubset()) {
            this.f60414m.m67905a(i);
            return;
        }
        throw new IllegalStateException("This font was created with subsetting disabled");
    }

    /* renamed from: c */
    public final void m32426c() {
        String str;
        COSName cOSName = this.dict.getCOSName(COSName.ENCODING);
        if ((this.f60412k && cOSName != COSName.IDENTITY_H && cOSName != COSName.IDENTITY_V) || this.f60413l) {
            if (this.f60413l) {
                str = this.f60409h.getCIDSystemInfo().getRegistry() + HelpFormatter.DEFAULT_OPT_PREFIX + this.f60409h.getCIDSystemInfo().getOrdering() + HelpFormatter.DEFAULT_OPT_PREFIX + this.f60409h.getCIDSystemInfo().getSupplement();
            } else if (cOSName != null) {
                str = cOSName.getName();
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    CMap m30791a = AbstractC10398hg.m30791a(str);
                    this.f60411j = AbstractC10398hg.m30791a(m30791a.getRegistry() + HelpFormatter.DEFAULT_OPT_PREFIX + m30791a.getOrdering() + "-UCS2");
                } catch (IOException e) {
                    Log.w("PdfBox-Android", "Could not get " + str + " UC2 map for font " + getName(), e);
                }
            }
        }
    }

    public int codeToCID(int i) {
        return this.f60409h.codeToCID(i);
    }

    public int codeToGID(int i) throws IOException {
        return this.f60409h.codeToGID(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i) throws IOException {
        return this.f60409h.encode(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getAverageFontWidth() {
        return this.f60409h.getAverageFontWidth();
    }

    public String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() throws IOException {
        return this.f60409h.getBoundingBox();
    }

    public CMap getCMap() {
        return this.f60410i;
    }

    public CMap getCMapUCS2() {
        return this.f60411j;
    }

    public PDCIDFont getDescendantFont() {
        return this.f60409h;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public Vector getDisplacement(int i) throws IOException {
        if (isVertical()) {
            return new Vector(0.0f, this.f60409h.getVerticalDisplacementVectorY(i) / 1000.0f);
        }
        return super.getDisplacement(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public PDFontDescriptor getFontDescriptor() {
        return this.f60409h.getFontDescriptor();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Matrix getFontMatrix() {
        return this.f60409h.getFontMatrix();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        return this.f60409h.getHeight(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i) throws IOException {
        return this.f60409h.getPath(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public Vector getPositionVector(int i) {
        return this.f60409h.getPositionVector(i).scale(-0.001f);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public float getStandard14Width(int i) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont, com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidth(int i) throws IOException {
        return this.f60409h.getWidth(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        return this.f60409h.getWidthFromFont(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean hasExplicitWidth(int i) throws IOException {
        return this.f60409h.hasExplicitWidth(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i) throws IOException {
        return this.f60409h.hasGlyph(i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60409h.isDamaged();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60409h.isEmbedded();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isStandard14() {
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean isVertical() {
        if (this.f60410i.getWMode() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) throws IOException {
        return this.f60410i.readCode(inputStream);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public void subset() throws IOException {
        if (willBeSubset()) {
            this.f60414m.m67897j();
            TrueTypeFont trueTypeFont = this.f60416o;
            if (trueTypeFont != null) {
                trueTypeFont.close();
                this.f60416o = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("This font was created with subsetting disabled");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toString() {
        String str;
        if (getDescendantFont() != null) {
            str = getDescendantFont().getClass().getSimpleName();
        } else {
            str = null;
        }
        return getClass().getSimpleName() + RemoteSettings.FORWARD_SLASH_STRING + str + ", PostScript name: " + getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public String toUnicode(int i) throws IOException {
        TrueTypeFont trueTypeFont;
        int codeToCID;
        String unicode = super.toUnicode(i);
        if (unicode != null) {
            return unicode;
        }
        if ((this.f60412k || this.f60413l) && this.f60411j != null) {
            return this.f60411j.toUnicode(codeToCID(i));
        }
        PDCIDFont pDCIDFont = this.f60409h;
        if ((pDCIDFont instanceof PDCIDFontType2) && (trueTypeFont = ((PDCIDFontType2) pDCIDFont).getTrueTypeFont()) != null) {
            try {
                CmapLookup unicodeCmapLookup = trueTypeFont.getUnicodeCmapLookup(false);
                if (unicodeCmapLookup != null) {
                    if (this.f60409h.isEmbedded()) {
                        codeToCID = this.f60409h.codeToGID(i);
                    } else {
                        codeToCID = this.f60409h.codeToCID(i);
                    }
                    List<Integer> charCodes = unicodeCmapLookup.getCharCodes(codeToCID);
                    if (charCodes != null && !charCodes.isEmpty()) {
                        return Character.toString((char) charCodes.get(0).intValue());
                    }
                }
            } catch (IOException e) {
                Log.w("PdfBox-Android", "get unicode from font cmap fail", e);
            }
        }
        if (!this.f60415n.contains(Integer.valueOf(i))) {
            Log.w("PdfBox-Android", "No Unicode mapping for " + ("CID+" + codeToCID(i)) + " (" + i + ") in font " + getName());
            this.f60415n.add(Integer.valueOf(i));
            return null;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public boolean willBeSubset() {
        PDCIDFontType2Embedder pDCIDFontType2Embedder = this.f60414m;
        if (pDCIDFontType2Embedder != null && pDCIDFontType2Embedder.m67898i()) {
            return true;
        }
        return false;
    }

    public static PDType0Font load(PDDocument pDDocument, InputStream inputStream) throws IOException {
        return load(pDDocument, inputStream, true);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, InputStream inputStream) throws IOException {
        return new PDType0Font(pDDocument, new TTFParser().parse(inputStream), true, true, true);
    }

    public static PDType0Font load(PDDocument pDDocument, InputStream inputStream, boolean z) throws IOException {
        return new PDType0Font(pDDocument, new TTFParser().parse(inputStream), z, true, false);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, InputStream inputStream, boolean z) throws IOException {
        return new PDType0Font(pDDocument, new TTFParser().parse(inputStream), z, true, true);
    }

    public static PDType0Font load(PDDocument pDDocument, TrueTypeFont trueTypeFont, boolean z) throws IOException {
        return new PDType0Font(pDDocument, trueTypeFont, z, false, false);
    }

    public static PDType0Font loadVertical(PDDocument pDDocument, TrueTypeFont trueTypeFont, boolean z) throws IOException {
        return new PDType0Font(pDDocument, trueTypeFont, z, false, true);
    }

    public PDType0Font(PDDocument pDDocument, TrueTypeFont trueTypeFont, boolean z, boolean z2, boolean z3) {
        this.f60415n = new HashSet();
        if (z3) {
            trueTypeFont.enableVerticalSubstitutions();
        }
        PDCIDFontType2Embedder pDCIDFontType2Embedder = new PDCIDFontType2Embedder(pDDocument, this.dict, trueTypeFont, z, this, z3);
        this.f60414m = pDCIDFontType2Embedder;
        this.f60409h = pDCIDFontType2Embedder.m32438u();
        readEncoding();
        m32426c();
        if (z2) {
            if (z) {
                this.f60416o = trueTypeFont;
                pDDocument.registerTrueTypeFontForClosing(trueTypeFont);
                return;
            }
            trueTypeFont.close();
        }
    }
}
