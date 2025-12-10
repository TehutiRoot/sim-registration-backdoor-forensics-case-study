package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.google.android.gms.stats.CodePackage;
import com.google.zxing.Result;
import java.util.List;

/* loaded from: classes5.dex */
public final class VEventResultParser extends ResultParser {
    /* renamed from: g */
    public static String m34172g(CharSequence charSequence, String str, boolean z) {
        List m34179j = VCardResultParser.m34179j(charSequence, str, z, false);
        if (m34179j != null && !m34179j.isEmpty()) {
            return (String) m34179j.get(0);
        }
        return null;
    }

    /* renamed from: h */
    public static String[] m34171h(CharSequence charSequence, String str, boolean z) {
        List m34178k = VCardResultParser.m34178k(charSequence, str, z, false);
        if (m34178k != null && !m34178k.isEmpty()) {
            int size = m34178k.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) ((List) m34178k.get(i)).get(0);
            }
            return strArr;
        }
        return null;
    }

    /* renamed from: i */
    public static String m34170i(String str) {
        if (str != null) {
            if (str.startsWith(MailTo.MAILTO_SCHEME) || str.startsWith("MAILTO:")) {
                return str.substring(7);
            }
            return str;
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public CalendarParsedResult parse(Result result) {
        double parseDouble;
        double parseDouble2;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String m34172g = m34172g("SUMMARY", massagedText, true);
        String m34172g2 = m34172g("DTSTART", massagedText, true);
        if (m34172g2 == null) {
            return null;
        }
        String m34172g3 = m34172g("DTEND", massagedText, true);
        String m34172g4 = m34172g("DURATION", massagedText, true);
        String m34172g5 = m34172g(CodePackage.LOCATION, massagedText, true);
        String m34170i = m34170i(m34172g("ORGANIZER", massagedText, true));
        String[] m34171h = m34171h("ATTENDEE", massagedText, true);
        if (m34171h != null) {
            for (int i = 0; i < m34171h.length; i++) {
                m34171h[i] = m34170i(m34171h[i]);
            }
        }
        String m34172g6 = m34172g("DESCRIPTION", massagedText, true);
        String m34172g7 = m34172g("GEO", massagedText, true);
        if (m34172g7 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = m34172g7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = Double.parseDouble(m34172g7.substring(0, indexOf));
                parseDouble2 = Double.parseDouble(m34172g7.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new CalendarParsedResult(m34172g, m34172g2, m34172g3, m34172g4, m34172g5, m34170i, m34171h, m34172g6, parseDouble, parseDouble2);
    }
}
