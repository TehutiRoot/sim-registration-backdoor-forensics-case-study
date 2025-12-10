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

/* renamed from: ni1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21346ni1 extends FW1 {

    /* renamed from: h */
    public final Encoding f72549h;

    public C21346ni1(PDDocument pDDocument, COSDictionary cOSDictionary, TrueTypeFont trueTypeFont, Encoding encoding) {
        super(pDDocument, cOSDictionary, trueTypeFont, false);
        cOSDictionary.setItem(COSName.SUBTYPE, (COSBase) COSName.TRUE_TYPE);
        GlyphList adobeGlyphList = GlyphList.getAdobeGlyphList();
        this.f72549h = encoding;
        cOSDictionary.setItem(COSName.ENCODING, encoding.getCOSObject());
        this.f1705c.setSymbolic(false);
        this.f1705c.setNonSymbolic(true);
        cOSDictionary.setItem(COSName.FONT_DESC, this.f1705c);
        m26261l(cOSDictionary, adobeGlyphList);
    }

    @Override // p000.FW1
    /* renamed from: c */
    public void mo26263c(InputStream inputStream, String str, Map map) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public Encoding m26262k() {
        return this.f72549h;
    }

    /* renamed from: l */
    public final void m26261l(COSDictionary cOSDictionary, GlyphList glyphList) {
        float unitsPerEm = 1000.0f / this.f1704b.getHeader().getUnitsPerEm();
        HorizontalMetricsTable horizontalMetrics = this.f1704b.getHorizontalMetrics();
        Map<Integer, String> codeToNameMap = m26262k().getCodeToNameMap();
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
                arrayList.set(entry.getKey().intValue() - intValue, Integer.valueOf(Math.round(horizontalMetrics.getAdvanceWidth(this.f1707e.getGlyphId(glyphList.toUnicode(value).codePointAt(0))) * unitsPerEm)));
            }
        }
        cOSDictionary.setInt(COSName.FIRST_CHAR, intValue);
        cOSDictionary.setInt(COSName.LAST_CHAR, intValue2);
        cOSDictionary.setItem(COSName.WIDTHS, (COSBase) COSArrayList.converterToCOSArray(arrayList));
    }
}