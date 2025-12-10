package org.apache.commons.cli;

@Deprecated
/* loaded from: classes6.dex */
public final class OptionBuilder {

    /* renamed from: a */
    public static String f73077a = null;

    /* renamed from: b */
    public static String f73078b = null;

    /* renamed from: c */
    public static String f73079c = null;

    /* renamed from: d */
    public static boolean f73080d = false;

    /* renamed from: e */
    public static int f73081e = -1;

    /* renamed from: f */
    public static Class f73082f;

    /* renamed from: g */
    public static boolean f73083g;

    /* renamed from: h */
    public static char f73084h;

    /* renamed from: i */
    public static final OptionBuilder f73085i = new OptionBuilder();

    static {
        m25889a();
    }

    /* renamed from: a */
    public static void m25889a() {
        f73078b = null;
        f73079c = null;
        f73077a = null;
        f73082f = String.class;
        f73080d = false;
        f73081e = -1;
        f73083g = false;
        f73084h = (char) 0;
    }

    public static Option create() throws IllegalArgumentException {
        if (f73077a != null) {
            return create((String) null);
        }
        m25889a();
        throw new IllegalArgumentException("must specify longopt");
    }

    public static OptionBuilder hasArg() {
        f73081e = 1;
        return f73085i;
    }

    public static OptionBuilder hasArgs() {
        f73081e = -2;
        return f73085i;
    }

    public static OptionBuilder hasOptionalArg() {
        f73081e = 1;
        f73083g = true;
        return f73085i;
    }

    public static OptionBuilder hasOptionalArgs() {
        f73081e = -2;
        f73083g = true;
        return f73085i;
    }

    public static OptionBuilder isRequired() {
        f73080d = true;
        return f73085i;
    }

    public static OptionBuilder withArgName(String str) {
        f73079c = str;
        return f73085i;
    }

    public static OptionBuilder withDescription(String str) {
        f73078b = str;
        return f73085i;
    }

    public static OptionBuilder withLongOpt(String str) {
        f73077a = str;
        return f73085i;
    }

    public static OptionBuilder withType(Class<?> cls) {
        f73082f = cls;
        return f73085i;
    }

    public static OptionBuilder withValueSeparator() {
        f73084h = '=';
        return f73085i;
    }

    public static OptionBuilder hasArg(boolean z) {
        f73081e = z ? 1 : -1;
        return f73085i;
    }

    public static OptionBuilder hasArgs(int i) {
        f73081e = i;
        return f73085i;
    }

    public static OptionBuilder isRequired(boolean z) {
        f73080d = z;
        return f73085i;
    }

    @Deprecated
    public static OptionBuilder withType(Object obj) {
        return withType((Class<?>) obj);
    }

    public static OptionBuilder withValueSeparator(char c) {
        f73084h = c;
        return f73085i;
    }

    public static OptionBuilder hasOptionalArgs(int i) {
        f73081e = i;
        f73083g = true;
        return f73085i;
    }

    public static Option create(char c) throws IllegalArgumentException {
        return create(String.valueOf(c));
    }

    public static Option create(String str) throws IllegalArgumentException {
        try {
            Option option = new Option(str, f73078b);
            option.setLongOpt(f73077a);
            option.setRequired(f73080d);
            option.setOptionalArg(f73083g);
            option.setArgs(f73081e);
            option.setType(f73082f);
            option.setConverter(TypeHandler.getDefault().getConverter(f73082f));
            option.setValueSeparator(f73084h);
            option.setArgName(f73079c);
            return option;
        } finally {
            m25889a();
        }
    }
}