package com.google.zxing.client.result;

import com.google.zxing.Result;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class AddressBookDoCoMoResultParser extends AbstractC0214D {
    /* renamed from: i */
    public static String m34197i(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            return str.substring(indexOf + 1) + TokenParser.f74644SP + str.substring(0, indexOf);
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String[] m68897g;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.startsWith("MECARD:") && (m68897g = AbstractC0214D.m68897g("N:", massagedText, true)) != null) {
            String m34197i = m34197i(m68897g[0]);
            String m68896h = AbstractC0214D.m68896h("SOUND:", massagedText, true);
            String[] m68897g2 = AbstractC0214D.m68897g("TEL:", massagedText, true);
            String[] m68897g3 = AbstractC0214D.m68897g("EMAIL:", massagedText, true);
            String m68896h2 = AbstractC0214D.m68896h("NOTE:", massagedText, false);
            String[] m68897g4 = AbstractC0214D.m68897g("ADR:", massagedText, true);
            String m68896h3 = AbstractC0214D.m68896h("BDAY:", massagedText, true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(m34197i), null, m68896h, m68897g2, null, m68897g3, null, null, m68896h2, m68897g4, null, AbstractC0214D.m68896h("ORG:", massagedText, true), !ResultParser.isStringOfDigits(m68896h3, 8) ? null : m68896h3, null, AbstractC0214D.m68897g("URL:", massagedText, true), null);
        }
        return null;
    }
}