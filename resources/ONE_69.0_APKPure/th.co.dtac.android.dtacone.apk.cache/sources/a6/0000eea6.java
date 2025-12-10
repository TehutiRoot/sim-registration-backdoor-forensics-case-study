package org.apache.commons.cli;

import java.util.ArrayList;

@Deprecated
/* loaded from: classes6.dex */
public class GnuParser extends Parser {
    @Override // org.apache.commons.cli.Parser
    public String[] flatten(Options options, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str != null) {
                if (HelpFormatter.DEFAULT_LONG_OPT_PREFIX.equals(str)) {
                    arrayList.add(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
                    z2 = true;
                } else if (HelpFormatter.DEFAULT_OPT_PREFIX.equals(str)) {
                    arrayList.add(HelpFormatter.DEFAULT_OPT_PREFIX);
                } else if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
                    String m69333d = A12.m69333d(str);
                    if (options.hasOption(m69333d)) {
                        arrayList.add(str);
                    } else {
                        int m25926l = DefaultParser.m25926l(m69333d);
                        if (m25926l != -1 && options.hasOption(m69333d.substring(0, m25926l))) {
                            arrayList.add(str.substring(0, str.indexOf(61)));
                            arrayList.add(str.substring(str.indexOf(61) + 1));
                        } else if (options.hasOption(str.substring(0, 2))) {
                            arrayList.add(str.substring(0, 2));
                            arrayList.add(str.substring(2));
                        } else {
                            arrayList.add(str);
                            z2 = z;
                        }
                    }
                } else {
                    arrayList.add(str);
                }
                if (z2) {
                    while (true) {
                        i++;
                        if (i < strArr.length) {
                            arrayList.add(strArr[i]);
                        }
                    }
                }
            }
            i++;
        }
        return (String[]) arrayList.toArray(A12.f4a);
    }
}