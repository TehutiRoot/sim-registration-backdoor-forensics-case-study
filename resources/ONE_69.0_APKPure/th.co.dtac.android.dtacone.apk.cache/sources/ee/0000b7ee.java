package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.google.android.gms.stats.CodePackage;
import com.google.zxing.Result;
import java.util.List;

/* loaded from: classes5.dex */
public final class VEventResultParser extends ResultParser {
    /* renamed from: g */
    public static String m34164g(CharSequence charSequence, String str, boolean z) {
        List m34171j = VCardResultParser.m34171j(charSequence, str, z, false);
        if (m34171j != null && !m34171j.isEmpty()) {
            return (String) m34171j.get(0);
        }
        return null;
    }

    /* renamed from: h */
    public static String[] m34163h(CharSequence charSequence, String str, boolean z) {
        List m34170k = VCardResultParser.m34170k(charSequence, str, z, false);
        if (m34170k != null && !m34170k.isEmpty()) {
            int size = m34170k.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) ((List) m34170k.get(i)).get(0);
            }
            return strArr;
        }
        return null;
    }

    /* renamed from: i */
    public static String m34162i(String str) {
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
        String m34164g = m34164g("SUMMARY", massagedText, true);
        String m34164g2 = m34164g("DTSTART", massagedText, true);
        if (m34164g2 == null) {
            return null;
        }
        String m34164g3 = m34164g("DTEND", massagedText, true);
        String m34164g4 = m34164g("DURATION", massagedText, true);
        String m34164g5 = m34164g(CodePackage.LOCATION, massagedText, true);
        String m34162i = m34162i(m34164g("ORGANIZER", massagedText, true));
        String[] m34163h = m34163h("ATTENDEE", massagedText, true);
        if (m34163h != null) {
            for (int i = 0; i < m34163h.length; i++) {
                m34163h[i] = m34162i(m34163h[i]);
            }
        }
        String m34164g6 = m34164g("DESCRIPTION", massagedText, true);
        String m34164g7 = m34164g("GEO", massagedText, true);
        if (m34164g7 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = m34164g7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = Double.parseDouble(m34164g7.substring(0, indexOf));
                parseDouble2 = Double.parseDouble(m34164g7.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new CalendarParsedResult(m34164g, m34164g2, m34164g3, m34164g4, m34164g5, m34162i, m34163h, m34164g6, parseDouble, parseDouble2);
    }
}