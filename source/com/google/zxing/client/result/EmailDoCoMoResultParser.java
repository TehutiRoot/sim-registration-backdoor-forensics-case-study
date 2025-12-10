package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class EmailDoCoMoResultParser extends AbstractC0220D {

    /* renamed from: e */
    public static final Pattern f57669e = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* renamed from: i */
    public static boolean m34197i(String str) {
        if (str != null && f57669e.matcher(str).matches() && str.indexOf(64) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] m68711g;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.startsWith("MATMSG:") && (m68711g = AbstractC0220D.m68711g("TO:", massagedText, true)) != null) {
            for (String str : m68711g) {
                if (!m34197i(str)) {
                    return null;
                }
            }
            return new EmailAddressParsedResult(m68711g, null, null, AbstractC0220D.m68710h("SUB:", massagedText, false), AbstractC0220D.m68710h("BODY:", massagedText, false));
        }
        return null;
    }
}
