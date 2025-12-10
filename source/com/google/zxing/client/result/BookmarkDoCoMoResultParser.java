package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class BookmarkDoCoMoResultParser extends AbstractC0220D {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String text = result.getText();
        if (text.startsWith("MEBKM:")) {
            String m68710h = AbstractC0220D.m68710h("TITLE:", text, true);
            String[] m68711g = AbstractC0220D.m68711g("URL:", text, true);
            if (m68711g == null) {
                return null;
            }
            String str = m68711g[0];
            if (URIResultParser.m34183g(str)) {
                return new URIParsedResult(str, m68710h);
            }
            return null;
        }
        return null;
    }
}
