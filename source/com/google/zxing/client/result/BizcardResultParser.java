package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class BizcardResultParser extends AbstractC0220D {
    /* renamed from: i */
    public static String m34204i(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + TokenParser.f74560SP + str2;
    }

    /* renamed from: j */
    public static String[] m34203j(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.startsWith("BIZCARD:")) {
            String m34204i = m34204i(AbstractC0220D.m68710h("N:", massagedText, true), AbstractC0220D.m68710h("X:", massagedText, true));
            String m68710h = AbstractC0220D.m68710h("T:", massagedText, true);
            String m68710h2 = AbstractC0220D.m68710h("C:", massagedText, true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(m34204i), null, null, m34203j(AbstractC0220D.m68710h("B:", massagedText, true), AbstractC0220D.m68710h("M:", massagedText, true), AbstractC0220D.m68710h("F:", massagedText, true)), null, ResultParser.maybeWrap(AbstractC0220D.m68710h("E:", massagedText, true)), null, null, null, AbstractC0220D.m68711g("A:", massagedText, true), null, m68710h2, null, m68710h, null, null);
        }
        return null;
    }
}
