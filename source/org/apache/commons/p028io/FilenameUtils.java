package org.apache.commons.p028io;

import ch.qos.logback.classic.spi.CallerData;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.slf4j.Marker;

/* renamed from: org.apache.commons.io.FilenameUtils */
/* loaded from: classes6.dex */
public class FilenameUtils {
    public static final char EXTENSION_SEPARATOR = '.';

    /* renamed from: b */
    public static final char f73242b;

    /* renamed from: c */
    public static final char f73243c;

    /* renamed from: d */
    public static final Pattern f73244d;

    /* renamed from: e */
    public static final Pattern f73245e;

    /* renamed from: a */
    public static final String[] f73241a = new String[0];
    public static final String EXTENSION_SEPARATOR_STR = Character.toString('.');

    static {
        char c = File.separatorChar;
        f73242b = c;
        f73243c = m25351d(c);
        f73244d = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        f73245e = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    /* renamed from: a */
    public static String m25354a(String str, boolean z) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength >= str.length()) {
            if (z) {
                return getPrefix(str);
            }
            return str;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        if (indexOfLastSeparator < 0) {
            return str.substring(0, prefixLength);
        }
        int i = indexOfLastSeparator + (z ? 1 : 0);
        if (i == 0) {
            i++;
        }
        return str.substring(0, i);
    }

    /* renamed from: b */
    public static String m25353b(String str, int i) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        int i2 = i + indexOfLastSeparator;
        if (prefixLength < str.length() && indexOfLastSeparator >= 0 && prefixLength < i2) {
            return m25342m(str.substring(prefixLength, i2));
        }
        return "";
    }

    /* renamed from: c */
    public static String m25352c(String str, char c, boolean z) {
        boolean z2;
        int i;
        if (str == null) {
            return null;
        }
        m25342m(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int prefixLength = getPrefixLength(str);
        if (prefixLength < 0) {
            return null;
        }
        int i2 = length + 2;
        char[] cArr = new char[i2];
        str.getChars(0, str.length(), cArr, 0);
        char m25351d = m25351d(c);
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i3] == m25351d) {
                cArr[i3] = c;
            }
        }
        if (cArr[length - 1] != c) {
            cArr[length] = c;
            length++;
            z2 = false;
        } else {
            z2 = true;
        }
        if (prefixLength != 0) {
            i = prefixLength;
        } else {
            i = 1;
        }
        while (i < length) {
            if (cArr[i] == c) {
                int i4 = i - 1;
                if (cArr[i4] == c) {
                    System.arraycopy(cArr, i, cArr, i4, length - i);
                    length--;
                    i--;
                }
            }
            i++;
        }
        int i5 = prefixLength + 1;
        int i6 = i5;
        while (i6 < length) {
            if (cArr[i6] == c) {
                int i7 = i6 - 1;
                if (cArr[i7] == '.' && (i6 == i5 || cArr[i6 - 2] == c)) {
                    if (i6 == length - 1) {
                        z2 = true;
                    }
                    System.arraycopy(cArr, i6 + 1, cArr, i7, length - i6);
                    length -= 2;
                    i6--;
                }
            }
            i6++;
        }
        int i8 = prefixLength + 2;
        int i9 = i8;
        while (i9 < length) {
            if (cArr[i9] == c && cArr[i9 - 1] == '.' && cArr[i9 - 2] == '.' && (i9 == i8 || cArr[i9 - 3] == c)) {
                if (i9 == i8) {
                    return null;
                }
                if (i9 == length - 1) {
                    z2 = true;
                }
                int i10 = i9 - 4;
                while (true) {
                    if (i10 >= prefixLength) {
                        if (cArr[i10] == c) {
                            int i11 = i10 + 1;
                            System.arraycopy(cArr, i9 + 1, cArr, i11, length - i9);
                            length -= i9 - i10;
                            i9 = i11;
                            break;
                        }
                        i10--;
                    } else {
                        int i12 = i9 + 1;
                        System.arraycopy(cArr, i12, cArr, prefixLength, length - i9);
                        length -= i12 - prefixLength;
                        i9 = i5;
                        break;
                    }
                }
            }
            i9++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= prefixLength) {
            return new String(cArr, 0, length);
        }
        if (z2 && z) {
            return new String(cArr, 0, length);
        }
        return new String(cArr, 0, length - 1);
    }

    public static String concat(String str, String str2) {
        int prefixLength = getPrefixLength(str2);
        if (prefixLength < 0) {
            return null;
        }
        if (prefixLength > 0) {
            return normalize(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return normalize(str2);
        }
        if (m25345j(str.charAt(length - 1))) {
            return normalize(str + str2);
        }
        return normalize(str + '/' + str2);
    }

    /* renamed from: d */
    public static char m25351d(char c) {
        if (c == '/') {
            return '\\';
        }
        if (c == '\\') {
            return '/';
        }
        throw new IllegalArgumentException(String.valueOf(c));
    }

    public static boolean directoryContains(String str, String str2) {
        boolean z = false;
        if (m25349f(str) || m25349f(str2)) {
            return false;
        }
        IOCase iOCase = IOCase.SYSTEM;
        if (iOCase.checkEquals(str, str2)) {
            return false;
        }
        if (str.charAt(0) == '/') {
            z = true;
        }
        char m25340o = m25340o(z);
        if (str.charAt(str.length() - 1) != m25340o) {
            str = str + m25340o;
        }
        return iOCase.checkStartsWith(str2, str);
    }

    /* renamed from: e */
    public static int m25350e(String str) {
        int lastIndexOf = str.lastIndexOf(f73242b);
        int lastIndexOf2 = str.lastIndexOf(f73243c);
        if (lastIndexOf == -1) {
            if (lastIndexOf2 == -1) {
                return 0;
            }
            return lastIndexOf2 + 1;
        } else if (lastIndexOf2 == -1) {
            return lastIndexOf + 1;
        } else {
            return Math.max(lastIndexOf, lastIndexOf2) + 1;
        }
    }

    public static boolean equals(String str, String str2) {
        return equals(str, str2, false, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalized(String str, String str2) {
        return equals(str, str2, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
        return equals(str, str2, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String str, String str2) {
        return equals(str, str2, false, IOCase.SYSTEM);
    }

    /* renamed from: f */
    public static boolean m25349f(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m25348g(String str) {
        Matcher matcher = f73244d.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return false;
        }
        for (int i = 1; i <= 4; i++) {
            String group = matcher.group(i);
            if (Integer.parseInt(group) > 255) {
                return false;
            }
            if (group.length() > 1 && group.startsWith("0")) {
                return false;
            }
        }
        return true;
    }

    public static String getBaseName(String str) {
        return removeExtension(getName(str));
    }

    public static String getExtension(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        int indexOfExtension = indexOfExtension(str);
        if (indexOfExtension == -1) {
            return "";
        }
        return str.substring(indexOfExtension + 1);
    }

    public static String getFullPath(String str) {
        return m25354a(str, true);
    }

    public static String getFullPathNoEndSeparator(String str) {
        return m25354a(str, false);
    }

    public static String getName(String str) {
        if (str == null) {
            return null;
        }
        return m25342m(str).substring(indexOfLastSeparator(str) + 1);
    }

    public static String getPath(String str) {
        return m25353b(str, 1);
    }

    public static String getPathNoEndSeparator(String str) {
        return m25353b(str, 0);
    }

    public static String getPrefix(String str) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength > str.length()) {
            m25342m(str);
            return str + '/';
        }
        return m25342m(str.substring(0, prefixLength));
    }

    public static int getPrefixLength(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return m25345j(charAt) ? 1 : 0;
        } else if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            return Math.min(indexOf, indexOf2) + 1;
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase >= 'A' && upperCase <= 'Z') {
                    if (length == 2 && !FileSystem.getCurrent().supportsDriveLetter()) {
                        return 0;
                    }
                    if (length == 2 || !m25345j(str.charAt(2))) {
                        return 2;
                    }
                    return 3;
                } else if (upperCase != '/') {
                    return -1;
                } else {
                    return 1;
                }
            } else if (m25345j(charAt) && m25345j(charAt2)) {
                int indexOf3 = str.indexOf(47, 2);
                int indexOf4 = str.indexOf(92, 2);
                if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                    return -1;
                }
                if (indexOf3 == -1) {
                    indexOf3 = indexOf4;
                }
                if (indexOf4 == -1) {
                    indexOf4 = indexOf3;
                }
                int min = Math.min(indexOf3, indexOf4);
                int i = min + 1;
                if (!m25343l(str.substring(2, min))) {
                    return -1;
                }
                return i;
            } else {
                return m25345j(charAt) ? 1 : 0;
            }
        }
    }

    /* renamed from: h */
    public static boolean m25347h(String str) {
        boolean contains = str.contains("::");
        if (contains && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if ((str.startsWith(":") && !str.startsWith("::")) || (str.endsWith(":") && !str.endsWith("::"))) {
            return false;
        }
        String[] split = str.split(":");
        if (contains) {
            ArrayList arrayList = new ArrayList(Arrays.asList(split));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            split = (String[]) arrayList.toArray(f73241a);
        }
        if (split.length > 8) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < split.length; i3++) {
            String str2 = split[i3];
            if (str2.isEmpty()) {
                if (i2 + 1 > 1) {
                    return false;
                }
            } else if (i3 == split.length - 1 && str2.contains(".")) {
                if (!m25348g(str2)) {
                    return false;
                }
                i += 2;
                i2 = 0;
            } else if (str2.length() > 4) {
                return false;
            } else {
                try {
                    int parseInt = Integer.parseInt(str2, 16);
                    i2 = (parseInt >= 0 && parseInt <= 65535) ? 0 : 0;
                } catch (NumberFormatException unused) {
                }
                return false;
            }
            i++;
        }
        if (i > 8) {
            return false;
        }
        if (i < 8 && !contains) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m25346i(String str) {
        String[] split = str.split("\\.", -1);
        for (int i = 0; i < split.length; i++) {
            if (split[i].isEmpty()) {
                if (i != split.length - 1) {
                    return false;
                }
                return true;
            } else if (!f73245e.matcher(split[i]).matches()) {
                return false;
            }
        }
        return true;
    }

    public static int indexOfExtension(String str) throws IllegalArgumentException {
        if (str == null) {
            return -1;
        }
        if (m25344k() && str.indexOf(58, m25350e(str)) != -1) {
            throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (indexOfLastSeparator(str) > lastIndexOf) {
            return -1;
        }
        return lastIndexOf;
    }

    public static int indexOfLastSeparator(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean isExtension(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        m25342m(str);
        if (collection == null || collection.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        return collection.contains(getExtension(str));
    }

    /* renamed from: j */
    public static boolean m25345j(char c) {
        return c == '/' || c == '\\';
    }

    /* renamed from: k */
    public static boolean m25344k() {
        if (f73242b == '\\') {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m25343l(String str) {
        if (!m25347h(str) && !m25346i(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static String m25342m(String str) {
        if (str.indexOf(0) < 0) {
            return str;
        }
        throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
    }

    /* renamed from: n */
    public static String[] m25341n(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '?' && c2 != '*') {
                sb.append(c2);
            } else {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c2 == '?') {
                    arrayList.add(CallerData.f39639NA);
                } else if (c != '*') {
                    arrayList.add(Marker.ANY_MARKER);
                }
            }
            i++;
            c = c2;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(f73241a);
    }

    public static String normalize(String str) {
        return m25352c(str, f73242b, true);
    }

    public static String normalizeNoEndSeparator(String str) {
        return m25352c(str, f73242b, false);
    }

    /* renamed from: o */
    public static char m25340o(boolean z) {
        return z ? '/' : '\\';
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        m25342m(str);
        int indexOfExtension = indexOfExtension(str);
        if (indexOfExtension == -1) {
            return str;
        }
        return str.substring(0, indexOfExtension);
    }

    public static String separatorsToSystem(String str) {
        return FileSystem.getCurrent().normalizeSeparators(str);
    }

    public static String separatorsToUnix(String str) {
        return FileSystem.LINUX.normalizeSeparators(str);
    }

    public static String separatorsToWindows(String str) {
        return FileSystem.WINDOWS.normalizeSeparators(str);
    }

    public static boolean wildcardMatch(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SENSITIVE);
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SYSTEM);
    }

    public static boolean equals(String str, String str2, boolean z, IOCase iOCase) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        } else if (z && ((str = normalize(str)) == null || (str2 = normalize(str2)) == null)) {
            return false;
        } else {
            return IOCase.value(iOCase, IOCase.SENSITIVE).checkEquals(str, str2);
        }
    }

    public static String normalize(String str, boolean z) {
        return m25352c(str, m25340o(z), true);
    }

    public static String normalizeNoEndSeparator(String str, boolean z) {
        return m25352c(str, m25340o(z), false);
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        IOCase value = IOCase.value(iOCase, IOCase.SENSITIVE);
        String[] m25341n = m25341n(str2);
        ArrayDeque arrayDeque = new ArrayDeque(m25341n.length);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        do {
            if (!arrayDeque.isEmpty()) {
                int[] iArr = (int[]) arrayDeque.pop();
                i2 = iArr[0];
                i = iArr[1];
                z = true;
            }
            while (i2 < m25341n.length) {
                if (m25341n[i2].equals(CallerData.f39639NA)) {
                    i++;
                    if (i > str.length()) {
                        break;
                    }
                    z = false;
                    i2++;
                } else if (m25341n[i2].equals(Marker.ANY_MARKER)) {
                    if (i2 == m25341n.length - 1) {
                        i = str.length();
                    }
                    z = true;
                    i2++;
                } else {
                    if (z) {
                        i = value.checkIndexOf(str, i, m25341n[i2]);
                        if (i == -1) {
                            break;
                        }
                        int checkIndexOf = value.checkIndexOf(str, i + 1, m25341n[i2]);
                        if (checkIndexOf >= 0) {
                            arrayDeque.push(new int[]{i2, checkIndexOf});
                        }
                        i += m25341n[i2].length();
                        z = false;
                    } else {
                        if (!value.checkRegionMatches(str, i, m25341n[i2])) {
                            break;
                        }
                        i += m25341n[i2].length();
                        z = false;
                    }
                    i2++;
                }
            }
            if (i2 == m25341n.length && i == str.length()) {
                return true;
            }
        } while (!arrayDeque.isEmpty());
        return false;
    }

    public static boolean isExtension(String str, String str2) {
        if (str == null) {
            return false;
        }
        m25342m(str);
        if (m25349f(str2)) {
            return indexOfExtension(str) == -1;
        }
        return getExtension(str).equals(str2);
    }

    public static boolean isExtension(String str, String... strArr) {
        Stream of;
        boolean anyMatch;
        if (str == null) {
            return false;
        }
        m25342m(str);
        if (strArr == null || strArr.length == 0) {
            return indexOfExtension(str) == -1;
        }
        final String extension = getExtension(str);
        of = Stream.of((Object[]) strArr);
        Objects.requireNonNull(extension);
        anyMatch = of.anyMatch(new Predicate() { // from class: SY
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return extension.equals((String) obj);
            }
        });
        return anyMatch;
    }
}
