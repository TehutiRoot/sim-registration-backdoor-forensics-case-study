package com.google.zxing.client.result;

import com.google.zxing.Result;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class AddressBookDoCoMoResultParser extends AbstractC0220D {
    /* renamed from: i */
    public static String m34205i(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            return str.substring(indexOf + 1) + TokenParser.f74560SP + str.substring(0, indexOf);
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String[] m68711g;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.startsWith("MECARD:") && (m68711g = AbstractC0220D.m68711g("N:", massagedText, true)) != null) {
            String m34205i = m34205i(m68711g[0]);
            String m68710h = AbstractC0220D.m68710h("SOUND:", massagedText, true);
            String[] m68711g2 = AbstractC0220D.m68711g("TEL:", massagedText, true);
            String[] m68711g3 = AbstractC0220D.m68711g("EMAIL:", massagedText, true);
            String m68710h2 = AbstractC0220D.m68710h("NOTE:", massagedText, false);
            String[] m68711g4 = AbstractC0220D.m68711g("ADR:", massagedText, true);
            String m68710h3 = AbstractC0220D.m68710h("BDAY:", massagedText, true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(m34205i), null, m68710h, m68711g2, null, m68711g3, null, null, m68710h2, m68711g4, null, AbstractC0220D.m68710h("ORG:", massagedText, true), !ResultParser.isStringOfDigits(m68710h3, 8) ? null : m68710h3, null, AbstractC0220D.m68711g("URL:", massagedText, true), null);
        }
        return null;
    }
}
