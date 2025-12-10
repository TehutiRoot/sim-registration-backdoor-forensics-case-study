package com.google.zxing.client.result;

import com.google.zxing.Result;

/* loaded from: classes5.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String m34189d;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (m34189d = ResultParser.m34189d("S:", massagedText, ';', false)) == null || m34189d.isEmpty()) {
            return null;
        }
        String m34189d2 = ResultParser.m34189d("P:", massagedText, ';', false);
        String m34189d3 = ResultParser.m34189d("T:", massagedText, ';', false);
        if (m34189d3 == null) {
            m34189d3 = "nopass";
        }
        return new WifiParsedResult(m34189d3, m34189d, m34189d2, Boolean.parseBoolean(ResultParser.m34189d("H:", massagedText, ';', false)));
    }
}
