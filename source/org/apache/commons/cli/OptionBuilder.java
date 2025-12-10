package org.apache.commons.cli;

@Deprecated
/* loaded from: classes6.dex */
public final class OptionBuilder {

    /* renamed from: a */
    public static String f72993a = null;

    /* renamed from: b */
    public static String f72994b = null;

    /* renamed from: c */
    public static String f72995c = null;

    /* renamed from: d */
    public static boolean f72996d = false;

    /* renamed from: e */
    public static int f72997e = -1;

    /* renamed from: f */
    public static Class f72998f;

    /* renamed from: g */
    public static boolean f72999g;

    /* renamed from: h */
    public static char f73000h;

    /* renamed from: i */
    public static final OptionBuilder f73001i = new OptionBuilder();

    static {
        m25699a();
    }

    /* renamed from: a */
    public static void m25699a() {
        f72994b = null;
        f72995c = null;
        f72993a = null;
        f72998f = String.class;
        f72996d = false;
        f72997e = -1;
        f72999g = false;
        f73000h = (char) 0;
    }

    public static Option create() throws IllegalArgumentException {
        if (f72993a != null) {
            return create((String) null);
        }
        m25699a();
        throw new IllegalArgumentException("must specify longopt");
    }

    public static OptionBuilder hasArg() {
        f72997e = 1;
        return f73001i;
    }

    public static OptionBuilder hasArgs() {
        f72997e = -2;
        return f73001i;
    }

    public static OptionBuilder hasOptionalArg() {
        f72997e = 1;
        f72999g = true;
        return f73001i;
    }

    public static OptionBuilder hasOptionalArgs() {
        f72997e = -2;
        f72999g = true;
        return f73001i;
    }

    public static OptionBuilder isRequired() {
        f72996d = true;
        return f73001i;
    }

    public static OptionBuilder withArgName(String str) {
        f72995c = str;
        return f73001i;
    }

    public static OptionBuilder withDescription(String str) {
        f72994b = str;
        return f73001i;
    }

    public static OptionBuilder withLongOpt(String str) {
        f72993a = str;
        return f73001i;
    }

    public static OptionBuilder withType(Class<?> cls) {
        f72998f = cls;
        return f73001i;
    }

    public static OptionBuilder withValueSeparator() {
        f73000h = '=';
        return f73001i;
    }

    public static OptionBuilder hasArg(boolean z) {
        f72997e = z ? 1 : -1;
        return f73001i;
    }

    public static OptionBuilder hasArgs(int i) {
        f72997e = i;
        return f73001i;
    }

    public static OptionBuilder isRequired(boolean z) {
        f72996d = z;
        return f73001i;
    }

    @Deprecated
    public static OptionBuilder withType(Object obj) {
        return withType((Class<?>) obj);
    }

    public static OptionBuilder withValueSeparator(char c) {
        f73000h = c;
        return f73001i;
    }

    public static OptionBuilder hasOptionalArgs(int i) {
        f72997e = i;
        f72999g = true;
        return f73001i;
    }

    public static Option create(char c) throws IllegalArgumentException {
        return create(String.valueOf(c));
    }

    public static Option create(String str) throws IllegalArgumentException {
        try {
            Option option = new Option(str, f72994b);
            option.setLongOpt(f72993a);
            option.setRequired(f72996d);
            option.setOptionalArg(f72999g);
            option.setArgs(f72997e);
            option.setType(f72998f);
            option.setConverter(TypeHandler.getDefault().getConverter(f72998f));
            option.setValueSeparator(f73000h);
            option.setArgName(f72995c);
            return option;
        } finally {
            m25699a();
        }
    }
}
