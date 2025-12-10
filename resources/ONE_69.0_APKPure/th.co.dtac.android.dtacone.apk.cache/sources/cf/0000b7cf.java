package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;
import th.p047co.dtac.android.dtacone.util.constant.mnp.MnpConstant;

/* loaded from: classes5.dex */
public final class AddressBookAUResultParser extends ResultParser {
    /* renamed from: g */
    public static String[] m34198g(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String m34181d = ResultParser.m34181d(str + i2 + ':', str2, TokenParser.f74641CR, z);
            if (m34181d == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(m34181d);
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
            String m34181d = ResultParser.m34181d("NAME1:", massagedText, TokenParser.f74641CR, true);
            String m34181d2 = ResultParser.m34181d("NAME2:", massagedText, TokenParser.f74641CR, true);
            String[] m34198g = m34198g(MnpConstant.TelephoneType.TELEPHONY_TYPE, 3, massagedText, true);
            String[] m34198g2 = m34198g("MAIL", 3, massagedText, true);
            String m34181d3 = ResultParser.m34181d("MEMORY:", massagedText, TokenParser.f74641CR, false);
            String m34181d4 = ResultParser.m34181d("ADD:", massagedText, TokenParser.f74641CR, true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(m34181d), null, m34181d2, m34198g, null, m34198g2, null, null, m34181d3, m34181d4 != null ? new String[]{m34181d4} : null, null, null, null, null, null, null);
        }
        return null;
    }
}