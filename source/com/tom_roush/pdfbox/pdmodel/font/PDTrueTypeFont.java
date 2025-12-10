package com.tom_roush.pdfbox.pdmodel.font;

import android.graphics.Path;
import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.ttf.CmapSubtable;
import com.tom_roush.fontbox.ttf.CmapTable;
import com.tom_roush.fontbox.ttf.GlyphData;
import com.tom_roush.fontbox.ttf.PostScriptTable;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.font.encoding.BuiltInEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.MacRomanEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.StandardEncoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDTrueTypeFont extends PDSimpleFont implements PDVectorFont {

    /* renamed from: s */
    public static final Map f60399s = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    /* renamed from: j */
    public CmapSubtable f60400j;

    /* renamed from: k */
    public CmapSubtable f60401k;

    /* renamed from: l */
    public CmapSubtable f60402l;

    /* renamed from: m */
    public boolean f60403m;

    /* renamed from: n */
    public Map f60404n;

    /* renamed from: o */
    public final TrueTypeFont f60405o;

    /* renamed from: p */
    public final boolean f60406p;

    /* renamed from: q */
    public final boolean f60407q;

    /* renamed from: r */
    public BoundingBox f60408r;

    static {
        for (Map.Entry<Integer, String> entry : MacOSRomanEncoding.INSTANCE.getCodeToNameMap().entrySet()) {
            Map map = f60399s;
            if (!map.containsKey(entry.getValue())) {
                map.put(entry.getValue(), entry.getKey());
            }
        }
    }

    public PDTrueTypeFont(COSDictionary cOSDictionary) throws IOException {
        super(cOSDictionary);
        boolean z;
        PDStream fontFile2;
        TrueTypeFont trueTypeFont = null;
        this.f60400j = null;
        this.f60401k = null;
        this.f60402l = null;
        this.f60403m = false;
        if (getFontDescriptor() != null && (fontFile2 = super.getFontDescriptor().getFontFile2()) != null) {
            try {
                trueTypeFont = new TTFParser(true).parse(fontFile2.createInputStream());
            } catch (IOException e) {
                Log.w("PdfBox-Android", "Could not read embedded TTF for font " + getBaseFont(), e);
                z = true;
            }
        }
        z = false;
        this.f60406p = trueTypeFont != null;
        this.f60407q = z;
        if (trueTypeFont == null) {
            FontMapping<TrueTypeFont> trueTypeFont2 = FontMappers.instance().getTrueTypeFont(getBaseFont(), getFontDescriptor());
            TrueTypeFont font = trueTypeFont2.getFont();
            if (trueTypeFont2.isFallback()) {
                Log.w("PdfBox-Android", "Using fallback font '" + font + "' for '" + getBaseFont() + OperatorName.SHOW_TEXT_LINE);
            }
            trueTypeFont = font;
        }
        this.f60405o = trueTypeFont;
        readEncoding();
    }

    /* renamed from: e */
    private BoundingBox m32427e() {
        PDRectangle fontBoundingBox;
        if (getFontDescriptor() != null && (fontBoundingBox = getFontDescriptor().getFontBoundingBox()) != null) {
            return new BoundingBox(fontBoundingBox.getLowerLeftX(), fontBoundingBox.getLowerLeftY(), fontBoundingBox.getUpperRightX(), fontBoundingBox.getUpperRightY());
        }
        return this.f60405o.getFontBBox();
    }

    public static PDTrueTypeFont load(PDDocument pDDocument, File file, Encoding encoding) throws IOException {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(file), encoding, true);
    }

    @Deprecated
    public static PDTrueTypeFont loadTTF(PDDocument pDDocument, File file) throws IOException {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(file), WinAnsiEncoding.INSTANCE, true);
    }

    public int codeToGID(int i) throws IOException {
        CmapSubtable cmapSubtable;
        Integer num;
        String unicode;
        m32428d();
        int i2 = 0;
        if (!isSymbolic()) {
            String name = this.encoding.getName(i);
            if (".notdef".equals(name)) {
                return 0;
            }
            if (this.f60400j != null && (unicode = GlyphList.getAdobeGlyphList().toUnicode(name)) != null) {
                i2 = this.f60400j.getGlyphId(unicode.codePointAt(0));
            }
            if (i2 == 0 && this.f60402l != null && (num = (Integer) f60399s.get(name)) != null) {
                i2 = this.f60402l.getGlyphId(num.intValue());
            }
            if (i2 == 0) {
                return this.f60405o.nameToGID(name);
            }
            return i2;
        }
        CmapSubtable cmapSubtable2 = this.f60400j;
        if (cmapSubtable2 != null) {
            Encoding encoding = this.encoding;
            if (!(encoding instanceof WinAnsiEncoding) && !(encoding instanceof MacRomanEncoding)) {
                i2 = cmapSubtable2.getGlyphId(i);
            } else {
                String name2 = encoding.getName(i);
                if (".notdef".equals(name2)) {
                    return 0;
                }
                String unicode2 = GlyphList.getAdobeGlyphList().toUnicode(name2);
                if (unicode2 != null) {
                    i2 = this.f60400j.getGlyphId(unicode2.codePointAt(0));
                }
            }
        }
        CmapSubtable cmapSubtable3 = this.f60401k;
        if (cmapSubtable3 != null) {
            int glyphId = cmapSubtable3.getGlyphId(i);
            if (i >= 0 && i <= 255) {
                if (glyphId == 0) {
                    glyphId = this.f60401k.getGlyphId(61440 + i);
                }
                if (glyphId == 0) {
                    glyphId = this.f60401k.getGlyphId(61696 + i);
                }
                if (glyphId == 0) {
                    glyphId = this.f60401k.getGlyphId(61952 + i);
                }
            }
            i2 = glyphId;
        }
        if (i2 == 0 && (cmapSubtable = this.f60402l) != null) {
            return cmapSubtable.getGlyphId(i);
        }
        return i2;
    }

    /* renamed from: d */
    public final void m32428d() {
        CmapSubtable[] cmaps;
        if (this.f60403m) {
            return;
        }
        CmapTable cmap = this.f60405o.getCmap();
        if (cmap != null) {
            for (CmapSubtable cmapSubtable : cmap.getCmaps()) {
                if (3 == cmapSubtable.getPlatformId()) {
                    if (1 == cmapSubtable.getPlatformEncodingId()) {
                        this.f60400j = cmapSubtable;
                    } else if (cmapSubtable.getPlatformEncodingId() == 0) {
                        this.f60401k = cmapSubtable;
                    }
                } else if (1 == cmapSubtable.getPlatformId() && cmapSubtable.getPlatformEncodingId() == 0) {
                    this.f60402l = cmapSubtable;
                } else if (cmapSubtable.getPlatformId() == 0 && cmapSubtable.getPlatformEncodingId() == 0) {
                    this.f60400j = cmapSubtable;
                }
            }
        }
        this.f60403m = true;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public byte[] encode(int i) throws IOException {
        Encoding encoding = this.encoding;
        if (encoding != null) {
            if (encoding.contains(getGlyphList().codePointToName(i))) {
                String codePointToName = getGlyphList().codePointToName(i);
                Map<String, Integer> nameToCodeMap = this.encoding.getNameToCodeMap();
                if (this.f60405o.hasGlyph(codePointToName) || this.f60405o.hasGlyph(AbstractC21258nY1.m26122a(i))) {
                    return new byte[]{(byte) nameToCodeMap.get(codePointToName).intValue()};
                }
                throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i), getName()));
            }
            throw new IllegalArgumentException(String.format("U+%04X is not available in this font's encoding: %s", Integer.valueOf(i), this.encoding.getEncodingName()));
        }
        String codePointToName2 = getGlyphList().codePointToName(i);
        if (this.f60405o.hasGlyph(codePointToName2)) {
            Integer num = getGIDToCode().get(Integer.valueOf(this.f60405o.nameToGID(codePointToName2)));
            if (num != null) {
                return new byte[]{(byte) num.intValue()};
            }
            throw new IllegalArgumentException(String.format("U+%04X is not available in this font's Encoding", Integer.valueOf(i)));
        }
        throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i), getName()));
    }

    public final String getBaseFont() {
        return this.dict.getNameAsString(COSName.BASE_FONT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public BoundingBox getBoundingBox() throws IOException {
        if (this.f60408r == null) {
            this.f60408r = m32427e();
        }
        return this.f60408r;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public FontBoxFont getFontBoxFont() {
        return this.f60405o;
    }

    public Map<Integer, Integer> getGIDToCode() throws IOException {
        Map<Integer, Integer> map = this.f60404n;
        if (map != null) {
            return map;
        }
        this.f60404n = new HashMap();
        for (int i = 0; i <= 255; i++) {
            int codeToGID = codeToGID(i);
            if (!this.f60404n.containsKey(Integer.valueOf(codeToGID))) {
                this.f60404n.put(Integer.valueOf(codeToGID), Integer.valueOf(i));
            }
        }
        return this.f60404n;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getHeight(int i) throws IOException {
        GlyphData glyph = this.f60405o.getGlyph().getGlyph(codeToGID(i));
        if (glyph != null) {
            return glyph.getBoundingBox().getHeight();
        }
        return 0.0f;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public String getName() {
        return getBaseFont();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public Path getPath(int i) throws IOException {
        GlyphData glyph = this.f60405o.getGlyph().getGlyph(codeToGID(i));
        if (glyph == null) {
            return new Path();
        }
        return glyph.getPath();
    }

    public TrueTypeFont getTrueTypeFont() {
        return this.f60405o;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public float getWidthFromFont(int i) throws IOException {
        float advanceWidth = this.f60405o.getAdvanceWidth(codeToGID(i));
        float unitsPerEm = this.f60405o.getUnitsPerEm();
        if (unitsPerEm != 1000.0f) {
            return advanceWidth * (1000.0f / unitsPerEm);
        }
        return advanceWidth;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public boolean hasGlyph(String str) throws IOException {
        return this.f60405o.nameToGID(str) != 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isDamaged() {
        return this.f60407q;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFontLike
    public boolean isEmbedded() {
        return this.f60406p;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDFont
    public int readCode(InputStream inputStream) throws IOException {
        return inputStream.read();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Encoding readEncodingFromFont() throws IOException {
        String str;
        if (!isEmbedded() && getStandard14AFM() != null) {
            return new Type1Encoding(getStandard14AFM());
        }
        if (getSymbolicFlag() != null && !getSymbolicFlag().booleanValue()) {
            return StandardEncoding.INSTANCE;
        }
        String m68245c = GL1.m68245c(getName());
        if (isStandard14() && !m68245c.equals("Symbol") && !m68245c.equals("ZapfDingbats")) {
            return StandardEncoding.INSTANCE;
        }
        PostScriptTable postScript = this.f60405o.getPostScript();
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 256; i++) {
            int codeToGID = codeToGID(i);
            if (codeToGID > 0) {
                if (postScript != null) {
                    str = postScript.getName(codeToGID);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = Integer.toString(codeToGID);
                }
                hashMap.put(Integer.valueOf(i), str);
            }
        }
        return new BuiltInEncoding(hashMap);
    }

    public static PDTrueTypeFont load(PDDocument pDDocument, InputStream inputStream, Encoding encoding) throws IOException {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(inputStream), encoding, true);
    }

    @Deprecated
    public static PDTrueTypeFont loadTTF(PDDocument pDDocument, InputStream inputStream) throws IOException {
        return new PDTrueTypeFont(pDDocument, new TTFParser().parse(inputStream), WinAnsiEncoding.INSTANCE, true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDVectorFont
    public boolean hasGlyph(int i) throws IOException {
        return codeToGID(i) != 0;
    }

    public static PDTrueTypeFont load(PDDocument pDDocument, TrueTypeFont trueTypeFont, Encoding encoding) throws IOException {
        return new PDTrueTypeFont(pDDocument, trueTypeFont, encoding, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont
    public Path getPath(String str) throws IOException {
        int nameToGID = this.f60405o.nameToGID(str);
        if (nameToGID == 0) {
            nameToGID = 0;
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= this.f60405o.getNumberOfGlyphs()) {
                    nameToGID = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (nameToGID == 0) {
            return new Path();
        }
        GlyphData glyph = this.f60405o.getGlyph().getGlyph(nameToGID);
        if (glyph != null) {
            return glyph.getPath();
        }
        return new Path();
    }

    public PDTrueTypeFont(PDDocument pDDocument, TrueTypeFont trueTypeFont, Encoding encoding, boolean z) {
        this.f60400j = null;
        this.f60401k = null;
        this.f60402l = null;
        this.f60403m = false;
        C21799qh1 c21799qh1 = new C21799qh1(pDDocument, this.dict, trueTypeFont, encoding);
        this.encoding = encoding;
        this.f60405o = trueTypeFont;
        setFontDescriptor(c21799qh1.m67902e());
        this.f60406p = true;
        this.f60407q = false;
        this.glyphList = GlyphList.getAdobeGlyphList();
        if (z) {
            trueTypeFont.close();
        }
    }
}
