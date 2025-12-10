package com.google.zxing.client.result;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.net.MailTo;
import com.google.zxing.Result;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class EmailAddressResultParser extends ResultParser {

    /* renamed from: e */
    public static final Pattern f57668e = Pattern.compile(",");

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith(MailTo.MAILTO_SCHEME) && !massagedText.startsWith("MAILTO:")) {
            if (EmailDoCoMoResultParser.m34197i(massagedText)) {
                return new EmailAddressParsedResult(massagedText);
            }
            return null;
        }
        String substring = massagedText.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        try {
            String m34187f = ResultParser.m34187f(substring);
            String[] split = !m34187f.isEmpty() ? f57668e.split(m34187f) : null;
            Map m34188e = ResultParser.m34188e(massagedText);
            if (m34188e != null) {
                if (split == null && (str3 = (String) m34188e.get(TypedValues.TransitionType.S_TO)) != null) {
                    split = f57668e.split(str3);
                }
                String str4 = (String) m34188e.get("cc");
                String[] split2 = str4 != null ? f57668e.split(str4) : null;
                String str5 = (String) m34188e.get("bcc");
                String[] split3 = str5 != null ? f57668e.split(str5) : null;
                str2 = (String) m34188e.get("body");
                strArr = split;
                strArr3 = split3;
                strArr2 = split2;
                str = (String) m34188e.get("subject");
            } else {
                strArr = split;
                strArr2 = null;
                strArr3 = null;
                str = null;
                str2 = null;
            }
            return new EmailAddressParsedResult(strArr, strArr2, strArr3, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
