package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;
import th.p047co.dtac.android.dtacone.util.constant.mnp.MnpConstant;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.InvoiceType;

/* loaded from: classes5.dex */
public final class VCardResultParser extends ResultParser {

    /* renamed from: e */
    public static final Pattern f57712e = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: f */
    public static final Pattern f57713f = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: g */
    public static final Pattern f57714g = Pattern.compile("\r\n[ \t]");

    /* renamed from: h */
    public static final Pattern f57715h = Pattern.compile("\\\\[nN]");

    /* renamed from: i */
    public static final Pattern f57716i = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: j */
    public static final Pattern f57717j = Pattern.compile("=");

    /* renamed from: k */
    public static final Pattern f57718k = Pattern.compile(";");

    /* renamed from: l */
    public static final Pattern f57719l = Pattern.compile("(?<!\\\\);+");

    /* renamed from: m */
    public static final Pattern f57720m = Pattern.compile(",");

    /* renamed from: n */
    public static final Pattern f57721n = Pattern.compile("[;,]");

    /* renamed from: g */
    public static String m34182g(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    m34176m(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (i < length - 2 && (charAt = charSequence.charAt(i + 1)) != '\r' && charAt != '\n') {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int parseHexDigit = ResultParser.parseHexDigit(charAt);
                    int parseHexDigit2 = ResultParser.parseHexDigit(charAt3);
                    if (parseHexDigit >= 0 && parseHexDigit2 >= 0) {
                        byteArrayOutputStream.write((parseHexDigit << 4) + parseHexDigit2);
                    }
                }
            }
            i++;
        }
        m34176m(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: h */
    public static void m34181h(Iterable iterable) {
        int indexOf;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                String str = (String) list.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb = new StringBuilder(100);
                m34177l(strArr, 3, sb);
                m34177l(strArr, 1, sb);
                m34177l(strArr, 2, sb);
                m34177l(strArr, 0, sb);
                m34177l(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: i */
    public static boolean m34180i(CharSequence charSequence) {
        if (charSequence != null && !f57713f.matcher(charSequence).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static List m34179j(CharSequence charSequence, String str, boolean z, boolean z2) {
        List m34178k = m34178k(charSequence, str, z, z2);
        if (m34178k != null && !m34178k.isEmpty()) {
            return (List) m34178k.get(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
        r4 = r1;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List m34178k(java.lang.CharSequence r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.VCardResultParser.m34178k(java.lang.CharSequence, java.lang.String, boolean, boolean):java.util.List");
    }

    /* renamed from: l */
    public static void m34177l(String[] strArr, int i, StringBuilder sb) {
        String str = strArr[i];
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(strArr[i]);
        }
    }

    /* renamed from: m */
    public static void m34176m(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, Charset.forName("UTF-8"));
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, Charset.forName("UTF-8"));
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: n */
    public static String m34175n(List list) {
        if (list != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    /* renamed from: o */
    public static String[] m34174o(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) ((List) it.next()).get(0);
                if (str != null && !str.isEmpty()) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[collection.size()]);
        }
        return null;
    }

    /* renamed from: p */
    public static String[] m34173p(Collection collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            int i = 1;
            while (true) {
                if (i < list.size()) {
                    str = (String) list.get(i);
                    int indexOf = str.indexOf(61);
                    if (indexOf >= 0) {
                        if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                            str = str.substring(indexOf + 1);
                            break;
                        }
                        i++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        Matcher matcher = f57712e.matcher(massagedText);
        if (matcher.find() && matcher.start() == 0) {
            List m34178k = m34178k("FN", massagedText, true, false);
            if (m34178k == null) {
                m34178k = m34178k("N", massagedText, true, false);
                m34181h(m34178k);
            }
            List m34179j = m34179j("NICKNAME", massagedText, true, false);
            String[] split = m34179j == null ? null : f57720m.split((CharSequence) m34179j.get(0));
            List m34178k2 = m34178k(MnpConstant.TelephoneType.TELEPHONY_TYPE, massagedText, true, false);
            List m34178k3 = m34178k(InvoiceType.EMAIL, massagedText, true, false);
            List m34179j2 = m34179j("NOTE", massagedText, false, false);
            List m34178k4 = m34178k("ADR", massagedText, true, true);
            List m34179j3 = m34179j("ORG", massagedText, true, true);
            List m34179j4 = m34179j("BDAY", massagedText, true, false);
            List list = (m34179j4 == null || m34180i((CharSequence) m34179j4.get(0))) ? m34179j4 : null;
            List m34179j5 = m34179j("TITLE", massagedText, true, false);
            List m34178k5 = m34178k("URL", massagedText, true, false);
            List m34179j6 = m34179j("IMPP", massagedText, true, false);
            List m34179j7 = m34179j("GEO", massagedText, true, false);
            String[] split2 = m34179j7 == null ? null : f57721n.split((CharSequence) m34179j7.get(0));
            return new AddressBookParsedResult(m34174o(m34178k), split, null, m34174o(m34178k2), m34173p(m34178k2), m34174o(m34178k3), m34173p(m34178k3), m34175n(m34179j6), m34175n(m34179j2), m34174o(m34178k4), m34173p(m34178k4), m34175n(m34179j3), m34175n(list), m34175n(m34179j5), m34174o(m34178k5), (split2 == null || split2.length == 2) ? split2 : null);
        }
        return null;
    }
}
