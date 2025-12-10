package p000;

/* renamed from: Wg1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC18733Wg1 {

    /* renamed from: a */
    public static final char[] f7346a = {'?', '@'};

    /* renamed from: b */
    public static final char[] f7347b = {'-'};

    /* renamed from: a */
    public static boolean m65686a(char c) {
        if (!Character.isJavaIdentifierPart(c) && !m65684c(f7347b, c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m65685b(char c) {
        if (!Character.isJavaIdentifierPart(c) && !m65684c(f7346a, c)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m65684c(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static String m65683d(String str) {
        if (str == null) {
            return null;
        }
        if (!str.isEmpty()) {
            char[] charArray = str.toCharArray();
            char c = charArray[0];
            if (m65685b(c)) {
                if (str.length() > 1) {
                    for (int i = 1; i < charArray.length; i++) {
                        char c2 = charArray[i];
                        if (!m65686a(c2)) {
                            throw new IllegalArgumentException(String.format("The option '%s' contains an illegal character : '%s'.", str, Character.valueOf(c2)));
                        }
                    }
                }
                return str;
            }
            throw new IllegalArgumentException(String.format("Illegal option name '%s'.", Character.valueOf(c)));
        }
        throw new IllegalArgumentException("Empty option name.");
    }
}