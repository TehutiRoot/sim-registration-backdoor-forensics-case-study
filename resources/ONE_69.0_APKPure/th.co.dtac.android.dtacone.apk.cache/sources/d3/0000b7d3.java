package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class BookmarkDoCoMoResultParser extends AbstractC0214D {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String text = result.getText();
        if (text.startsWith("MEBKM:")) {
            String m68896h = AbstractC0214D.m68896h("TITLE:", text, true);
            String[] m68897g = AbstractC0214D.m68897g("URL:", text, true);
            if (m68897g == null) {
                return null;
            }
            String str = m68897g[0];
            if (URIResultParser.m34175g(str)) {
                return new URIParsedResult(str, m68896h);
            }
            return null;
        }
        return null;
    }
}