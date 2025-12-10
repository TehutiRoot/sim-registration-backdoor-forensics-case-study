package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public final class URIResultParser extends ResultParser {

    /* renamed from: e */
    public static final Pattern f57710e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: f */
    public static final Pattern f57711f = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: g */
    public static boolean m34183g(String str) {
        if (str.contains(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)) {
            return false;
        }
        Matcher matcher = f57710e.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f57711f.matcher(str);
        if (!matcher2.find() || matcher2.start() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("URL:") && !massagedText.startsWith("URI:")) {
            String trim = massagedText.trim();
            if (m34183g(trim)) {
                return new URIParsedResult(trim, null);
            }
            return null;
        }
        return new URIParsedResult(massagedText.substring(4).trim(), null);
    }
}
