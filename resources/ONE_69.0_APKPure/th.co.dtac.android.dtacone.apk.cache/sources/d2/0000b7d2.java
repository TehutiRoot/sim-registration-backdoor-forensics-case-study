package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class BizcardResultParser extends AbstractC0214D {
    /* renamed from: i */
    public static String m34196i(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + TokenParser.f74644SP + str2;
    }

    /* renamed from: j */
    public static String[] m34195j(String str, String str2, String str3) {
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
            String m34196i = m34196i(AbstractC0214D.m68896h("N:", massagedText, true), AbstractC0214D.m68896h("X:", massagedText, true));
            String m68896h = AbstractC0214D.m68896h("T:", massagedText, true);
            String m68896h2 = AbstractC0214D.m68896h("C:", massagedText, true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(m34196i), null, null, m34195j(AbstractC0214D.m68896h("B:", massagedText, true), AbstractC0214D.m68896h("M:", massagedText, true), AbstractC0214D.m68896h("F:", massagedText, true)), null, ResultParser.maybeWrap(AbstractC0214D.m68896h("E:", massagedText, true)), null, null, null, AbstractC0214D.m68897g("A:", massagedText, true), null, m68896h2, null, m68896h, null, null);
        }
        return null;
    }
}