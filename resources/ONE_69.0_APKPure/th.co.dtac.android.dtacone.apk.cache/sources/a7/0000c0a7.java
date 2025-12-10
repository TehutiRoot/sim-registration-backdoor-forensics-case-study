package com.tom_roush.fontbox.ttf;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class OpenTypeScript {
    public static final String INHERITED = "Inherited";
    public static final String TAG_DEFAULT = "DFLT";
    public static final String UNKNOWN = "Unknown";

    /* renamed from: a */
    public static final Map f59579a;

    /* renamed from: b */
    public static int[] f59580b;

    /* renamed from: c */
    public static String[] f59581c;

    /* renamed from: com.tom_roush.fontbox.ttf.OpenTypeScript$a */
    /* loaded from: classes5.dex */
    public class C9882a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            int i = iArr[0];
            int i2 = iArr2[0];
            if (i < i2) {
                return -1;
            }
            if (i == i2) {
                return 0;
            }
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0b46 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 2894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.ttf.OpenTypeScript.<clinit>():void");
    }

    /* renamed from: a */
    public static void m32885a(int i) {
        if (i >= 0 && i <= 1114111) {
            return;
        }
        throw new IllegalArgumentException("Invalid codepoint: " + i);
    }

    /* renamed from: b */
    public static String m32884b(int i) {
        m32885a(i);
        if (Character.getType(i) == 0) {
            return UNKNOWN;
        }
        int binarySearch = Arrays.binarySearch(f59580b, i);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return f59581c[binarySearch];
    }

    /* renamed from: c */
    public static void m32883c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap(new C9882a());
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        String str = null;
        while (true) {
            String readLine = lineNumberReader.readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf != -1) {
                readLine = readLine.substring(0, indexOf);
            }
            if (readLine.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, ";");
                if (stringTokenizer.countTokens() >= 2) {
                    String trim = stringTokenizer.nextToken().trim();
                    String trim2 = stringTokenizer.nextToken().trim();
                    int[] iArr2 = new int[2];
                    int indexOf2 = trim.indexOf(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
                    if (indexOf2 == -1) {
                        int parseInt = Integer.parseInt(trim, 16);
                        iArr2[1] = parseInt;
                        iArr2[0] = parseInt;
                    } else {
                        iArr2[0] = Integer.parseInt(trim.substring(0, indexOf2), 16);
                        iArr2[1] = Integer.parseInt(trim.substring(indexOf2 + 2), 16);
                    }
                    if (iArr2[0] == iArr[1] + 1 && trim2.equals(str)) {
                        iArr[1] = iArr2[1];
                    } else {
                        treeMap.put(iArr2, trim2);
                        str = trim2;
                        iArr = iArr2;
                    }
                }
            }
        }
        lineNumberReader.close();
        f59580b = new int[treeMap.size()];
        f59581c = new String[treeMap.size()];
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            f59580b[i] = ((int[]) entry.getKey())[0];
            f59581c[i] = (String) entry.getValue();
            i++;
        }
    }

    public static String[] getScriptTags(int i) {
        m32885a(i);
        return (String[]) f59579a.get(m32884b(i));
    }
}