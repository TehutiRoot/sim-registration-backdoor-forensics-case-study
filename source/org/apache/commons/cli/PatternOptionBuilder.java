package org.apache.commons.cli;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.PatternOptionBuilder;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class PatternOptionBuilder {
    public static final Class<String> STRING_VALUE = String.class;
    public static final Class<Object> OBJECT_VALUE = Object.class;
    public static final Class<Number> NUMBER_VALUE = Number.class;
    public static final Class<Date> DATE_VALUE = Date.class;
    public static final Class<?> CLASS_VALUE = Class.class;
    public static final Class<FileInputStream> EXISTING_FILE_VALUE = FileInputStream.class;
    public static final Class<File> FILE_VALUE = File.class;
    public static final Class<File[]> FILES_VALUE = File[].class;
    public static final Class<URL> URL_VALUE = URL.class;

    /* renamed from: a */
    public static final Converter f73004a = new Converter() { // from class: Cj1
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return PatternOptionBuilder.m25697a(str);
        }
    };

    /* renamed from: a */
    public static /* synthetic */ Object m25697a(String str) {
        return m25696b(str);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m25696b(String str) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: c */
    public static Object m25695c() {
        return f73004a;
    }

    @Deprecated
    public static Object getValueClass(char c) {
        return getValueType(c);
    }

    public static Class<?> getValueType(char c) {
        if (c != '#') {
            if (c != '%') {
                if (c != '/') {
                    if (c != ':') {
                        if (c != '<') {
                            if (c != '>') {
                                if (c != '@') {
                                    if (c != '*') {
                                        if (c != '+') {
                                            return null;
                                        }
                                        return CLASS_VALUE;
                                    }
                                    return FILES_VALUE;
                                }
                                return OBJECT_VALUE;
                            }
                            return FILE_VALUE;
                        }
                        return EXISTING_FILE_VALUE;
                    }
                    return STRING_VALUE;
                }
                return URL_VALUE;
            }
            return NUMBER_VALUE;
        }
        return DATE_VALUE;
    }

    public static boolean isValueCode(char c) {
        return c == '@' || c == ':' || c == '%' || c == '+' || c == '#' || c == '<' || c == '>' || c == '*' || c == '/' || c == '!';
    }

    public static Options parsePattern(String str) {
        Converter<?, RuntimeException> converter = Converter.DEFAULT;
        Options options = new Options();
        boolean z = false;
        Class<?> cls = null;
        int i = 0;
        char c = TokenParser.f74560SP;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i >= str.length()) {
                break;
            }
            char charAt = str.charAt(i);
            if (!isValueCode(charAt)) {
                if (c != ' ') {
                    Option.Builder builder = Option.builder(String.valueOf(c));
                    if (cls == null) {
                        z3 = false;
                    }
                    options.addOption(builder.hasArg(z3).required(z2).type(cls).converter(converter).build());
                    converter = Converter.DEFAULT;
                    cls = null;
                    z2 = false;
                }
                c = charAt;
            } else if (charAt == '!') {
                z2 = true;
            } else {
                cls = getValueType(charAt);
                Map<Class<?>, Converter<?, ? extends Throwable>> createDefaultMap = TypeHandler.createDefaultMap();
                createDefaultMap.put(FILES_VALUE, (Converter) m25695c());
                converter = new TypeHandler(createDefaultMap).getConverter(getValueType(charAt));
            }
            i++;
        }
        if (c != ' ') {
            Option.Builder builder2 = Option.builder(String.valueOf(c));
            if (cls != null) {
                z = true;
            }
            options.addOption(builder2.hasArg(z).required(z2).type(cls).build());
        }
        return options;
    }
}
