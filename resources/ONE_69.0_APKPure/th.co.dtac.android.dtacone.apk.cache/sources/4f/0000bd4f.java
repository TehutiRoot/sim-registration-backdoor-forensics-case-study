package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.om */
/* loaded from: classes5.dex */
public class C9658om {
    public static <T extends CharSequence> T ThreeDS2Service(T t, T t2) {
        return ThreeDS2Service(t) ? t2 : t;
    }

    public static boolean ThreeDS2ServiceInstance(CharSequence... charSequenceArr) {
        if (C9651of.values(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (ThreeDS2Service(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends CharSequence> T cleanup(T t, T t2) {
        if (values(t)) {
            return t2;
        }
        return t;
    }

    public static int get(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static boolean getWarnings(CharSequence charSequence, CharSequence charSequence2) {
        return valueOf(charSequence, charSequence2, true);
    }

    private static boolean valueOf(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return valueOf(charSequence, z, 0, charSequence2, 0, charSequence2.length());
        }
    }

    public static String values(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static boolean ThreeDS2Service(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean get(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || ThreeDS2Service(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static boolean values(CharSequence charSequence, CharSequence charSequence2) {
        return valueOf(charSequence, charSequence2, false);
    }

    private static String[] get(String str, String str2, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return C9651of.ThreeDS2Service;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i4 = 0;
            z4 = false;
            z5 = false;
            i5 = 0;
            int i6 = 1;
            while (i4 < length) {
                if (Character.isWhitespace(str.charAt(i4))) {
                    if (z4 || z) {
                        int i7 = i6 + 1;
                        if (i6 == i) {
                            i4 = length;
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        arrayList.add(str.substring(i5, i4));
                        i6 = i7;
                        z4 = false;
                    }
                    i5 = i4 + 1;
                    i4 = i5;
                } else {
                    i4++;
                    z4 = true;
                    z5 = false;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i2 = 0;
                z2 = false;
                z3 = false;
                i3 = 0;
                int i8 = 1;
                while (i2 < length) {
                    if (str.charAt(i2) == charAt) {
                        if (z2 || z) {
                            int i9 = i8 + 1;
                            if (i8 == i) {
                                i2 = length;
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            arrayList.add(str.substring(i3, i2));
                            i8 = i9;
                            z2 = false;
                        }
                        i3 = i2 + 1;
                        i2 = i3;
                    } else {
                        i2++;
                        z2 = true;
                        z3 = false;
                    }
                }
            } else {
                i2 = 0;
                z2 = false;
                z3 = false;
                i3 = 0;
                int i10 = 1;
                while (i2 < length) {
                    if (str2.indexOf(str.charAt(i2)) >= 0) {
                        if (z2 || z) {
                            int i11 = i10 + 1;
                            if (i10 == i) {
                                i2 = length;
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            arrayList.add(str.substring(i3, i2));
                            i10 = i11;
                            z2 = false;
                        }
                        i3 = i2 + 1;
                        i2 = i3;
                    } else {
                        i2++;
                        z2 = true;
                        z3 = false;
                    }
                }
            }
            i4 = i2;
            z4 = z2;
            z5 = z3;
            i5 = i3;
        }
        if (z4 || (z && z5)) {
            arrayList.add(str.substring(i5, i4));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean valueOf(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z, i, (String) charSequence2, i2, i3);
        }
        int length = charSequence.length() - i;
        int length2 = charSequence2.length() - i2;
        if (i < 0 || i2 < 0 || i3 < 0 || length < i3 || length2 < i3) {
            return false;
        }
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                return true;
            }
            int i5 = i + 1;
            char charAt = charSequence.charAt(i);
            int i6 = i2 + 1;
            char charAt2 = charSequence2.charAt(i2);
            if (charAt != charAt2) {
                if (!z) {
                    return false;
                }
                if (Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            i = i5;
            i3 = i4;
            i2 = i6;
        }
    }

    public static boolean values(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String ThreeDS2Service(String str, int i) {
        return values(str, "...", 0, i);
    }

    public static boolean ThreeDS2ServiceInstance(CharSequence charSequence) {
        return !ThreeDS2Service(charSequence);
    }

    public static String values(String str, String str2, int i, int i2) {
        if (values((CharSequence) str) || values((CharSequence) str2)) {
            return str;
        }
        int length = str2.length();
        int i3 = length + 1;
        int i4 = length + length + 1;
        if (i2 >= i3) {
            if (str.length() <= i2) {
                return str;
            }
            if (i > str.length()) {
                i = str.length();
            }
            int i5 = i2 - length;
            if (str.length() - i < i5) {
                i = str.length() - i5;
            }
            if (i <= i3) {
                return str.substring(0, i5) + str2;
            } else if (i2 >= i4) {
                if ((i2 + i) - length < str.length()) {
                    return str2 + ThreeDS2Service(str.substring(i), str2, i5);
                }
                return str2 + str.substring(str.length() - i5);
            } else {
                throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", Integer.valueOf(i4)));
            }
        }
        throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", Integer.valueOf(i3)));
    }

    public static String ThreeDS2Service(String str, String str2, int i) {
        return values(str, str2, 0, i);
    }

    public static boolean ThreeDS2ServiceInstance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return valueOf(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    public static int ThreeDS2Service(CharSequence charSequence, CharSequence charSequence2, int i) {
        return charSequence.toString().indexOf(charSequence2.toString(), i);
    }

    private static StringBuilder ThreeDS2Service(int i) {
        return new StringBuilder(i * 16);
    }

    public static String[] ThreeDS2ServiceInstance(String str, String str2) {
        return get(str, str2, -1, false);
    }

    public static boolean ThreeDS2Service(CharSequence... charSequenceArr) {
        return !ThreeDS2ServiceInstance(charSequenceArr);
    }

    public static String ThreeDS2ServiceInstance(String str, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (str == null) {
                    return null;
                }
                if (i > str.length()) {
                    return "";
                }
                if (str.length() > i2) {
                    int i3 = i2 + i;
                    if (i3 > str.length()) {
                        i3 = str.length();
                    }
                    return str.substring(i, i3) + "...";
                }
                return str.substring(i);
            }
            throw new IllegalArgumentException("maxWith cannot be negative");
        }
        throw new IllegalArgumentException("offset cannot be negative");
    }

    public static boolean valueOf(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!values(charSequence) && !C9651of.values(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (values(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean valueOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean get(CharSequence... charSequenceArr) {
        if (C9651of.values(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (values(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static String values(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return valueOf(objArr, str, 0, objArr.length);
    }

    public static String get(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    public static String valueOf(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder ThreeDS2Service = ThreeDS2Service(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                ThreeDS2Service.append(str);
            }
            Object obj = objArr[i4];
            if (obj != null) {
                ThreeDS2Service.append(obj);
            }
        }
        return ThreeDS2Service.toString();
    }

    public static String values(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return values(iterable.iterator(), str);
    }

    public static String values(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return Objects.toString(next, "");
            }
            StringBuilder sb = new StringBuilder(256);
            if (next != null) {
                sb.append(next);
            }
            while (it.hasNext()) {
                if (str != null) {
                    sb.append(str);
                }
                Object next2 = it.next();
                if (next2 != null) {
                    sb.append(next2);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String get(String str, int i) {
        return ThreeDS2ServiceInstance(str, 0, i);
    }

    public static boolean valueOf(CharSequence charSequence) {
        return !values(charSequence);
    }

    public static boolean valueOf(CharSequence... charSequenceArr) {
        if (C9651of.values(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (valueOf(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static String valueOf(String str, String str2, String str3, int i) {
        return valueOf(str, str2, str3, i, false);
    }

    private static String valueOf(String str, String str2, String str3, int i, boolean z) {
        String str4;
        int i2;
        if (values((CharSequence) str) || values((CharSequence) str2) || str3 == null || i == 0) {
            return str;
        }
        if (z) {
            str4 = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            str4 = str;
        }
        int i3 = 0;
        int indexOf = str4.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        if (i < 0) {
            i2 = 16;
        } else {
            i2 = 64;
            if (i <= 64) {
                i2 = i;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + (length2 * i2));
        while (indexOf != -1) {
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(str3);
            i3 = indexOf + length;
            i--;
            if (i == 0) {
                break;
            }
            indexOf = str4.indexOf(str2, i3);
        }
        sb.append((CharSequence) str, i3, str.length());
        return sb.toString();
    }

    public static String values(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i = 0;
        if (str2 == null) {
            while (i != length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
        } else if (str2.isEmpty()) {
            return str;
        } else {
            while (i != length && str2.indexOf(str.charAt(i)) != -1) {
                i++;
            }
        }
        return str.substring(i);
    }

    public static boolean values(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (C9651of.get(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (ThreeDS2ServiceInstance(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String values(String str, String str2, String str3) {
        if (values((CharSequence) str) || values((CharSequence) str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length2);
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            int indexOf = str2.indexOf(charAt);
            if (indexOf >= 0) {
                if (indexOf < length) {
                    sb.append(str3.charAt(indexOf));
                }
                z = true;
            } else {
                sb.append(charAt);
            }
        }
        return z ? sb.toString() : str;
    }

    public static boolean values(CharSequence... charSequenceArr) {
        if (C9651of.values(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (ThreeDS2ServiceInstance(charSequence)) {
                return false;
            }
        }
        return true;
    }
}