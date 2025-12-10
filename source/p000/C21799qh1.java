package p000;

import com.tom_roush.fontbox.ttf.HorizontalMetricsTable;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: qh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21799qh1 extends IV1 {

    /* renamed from: h */
    public final Encoding f77039h;

    public C21799qh1(PDDocument pDDocument, COSDictionary cOSDictionary, TrueTypeFont trueTypeFont, Encoding encoding) {
        super(pDDocument, cOSDictionary, trueTypeFont, false);
        cOSDictionary.setItem(COSName.SUBTYPE, (COSBase) COSName.TRUE_TYPE);
        GlyphList adobeGlyphList = GlyphList.getAdobeGlyphList();
        this.f77039h = encoding;
        cOSDictionary.setItem(COSName.ENCODING, encoding.getCOSObject());
        this.f2527c.setSymbolic(false);
        this.f2527c.setNonSymbolic(true);
        cOSDictionary.setItem(COSName.FONT_DESC, this.f2527c);
        m23439l(cOSDictionary, adobeGlyphList);
    }

    @Override // p000.IV1
    /* renamed from: c */
    public void mo23441c(InputStream inputStream, String str, Map map) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public Encoding m23440k() {
        return this.f77039h;
    }

    /* renamed from: l */
    public final void m23439l(COSDictionary cOSDictionary, GlyphList glyphList) {
        float unitsPerEm = 1000.0f / this.f2526b.getHeader().getUnitsPerEm();
        HorizontalMetricsTable horizontalMetrics = this.f2526b.getHorizontalMetrics();
        Map<Integer, String> codeToNameMap = m23440k().getCodeToNameMap();
        int intValue = ((Integer) Collections.min(codeToNameMap.keySet())).intValue();
        int intValue2 = ((Integer) Collections.max(codeToNameMap.keySet())).intValue();
        int i = (intValue2 - intValue) + 1;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(0);
        }
        for (Map.Entry<Integer, String> entry : codeToNameMap.entrySet()) {
            int intValue3 = entry.getKey().intValue();
            String value = entry.getValue();
            if (intValue3 >= intValue && intValue3 <= intValue2) {
                arrayList.set(entry.getKey().intValue() - intValue, Integer.valueOf(Math.round(horizontalMetrics.getAdvanceWidth(this.f2529e.getGlyphId(glyphList.toUnicode(value).codePointAt(0))) * unitsPerEm)));
            }
        }
        cOSDictionary.setInt(COSName.FIRST_CHAR, intValue);
        cOSDictionary.setInt(COSName.LAST_CHAR, intValue2);
        cOSDictionary.setItem(COSName.WIDTHS, (COSBase) COSArrayList.converterToCOSArray(arrayList));
    }
}
