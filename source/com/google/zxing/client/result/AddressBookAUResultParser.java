package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;
import th.p047co.dtac.android.dtacone.util.constant.mnp.MnpConstant;

/* loaded from: classes5.dex */
public final class AddressBookAUResultParser extends ResultParser {
    /* renamed from: g */
    public static String[] m34206g(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String m34189d = ResultParser.m34189d(str + i2 + ':', str2, TokenParser.f74557CR, z);
            if (m34189d == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(m34189d);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.contains("MEMORY") && massagedText.contains("\r\n")) {
            String m34189d = ResultParser.m34189d("NAME1:", massagedText, TokenParser.f74557CR, true);
            String m34189d2 = ResultParser.m34189d("NAME2:", massagedText, TokenParser.f74557CR, true);
            String[] m34206g = m34206g(MnpConstant.TelephoneType.TELEPHONY_TYPE, 3, massagedText, true);
            String[] m34206g2 = m34206g("MAIL", 3, massagedText, true);
            String m34189d3 = ResultParser.m34189d("MEMORY:", massagedText, TokenParser.f74557CR, false);
            String m34189d4 = ResultParser.m34189d("ADD:", massagedText, TokenParser.f74557CR, true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(m34189d), null, m34189d2, m34206g, null, m34206g2, null, null, m34189d3, m34189d4 != null ? new String[]{m34189d4} : null, null, null, null, null, null, null);
        }
        return null;
    }
}
