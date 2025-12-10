package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String m34181d;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (m34181d = ResultParser.m34181d("S:", massagedText, ';', false)) == null || m34181d.isEmpty()) {
            return null;
        }
        String m34181d2 = ResultParser.m34181d("P:", massagedText, ';', false);
        String m34181d3 = ResultParser.m34181d("T:", massagedText, ';', false);
        if (m34181d3 == null) {
            m34181d3 = "nopass";
        }
        return new WifiParsedResult(m34181d3, m34181d, m34181d2, Boolean.parseBoolean(ResultParser.m34181d("H:", massagedText, ';', false)));
    }
}