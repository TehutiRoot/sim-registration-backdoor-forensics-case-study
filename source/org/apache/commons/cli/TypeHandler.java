package org.apache.commons.cli;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.cli.TypeHandler;

/* loaded from: classes6.dex */
public class TypeHandler {

    /* renamed from: b */
    public static final TypeHandler f73009b = new TypeHandler();

    /* renamed from: a */
    public final Map f73010a;

    public TypeHandler() {
        this(createDefaultMap());
    }

    /* renamed from: b */
    public static Object m25689b(String str, Class cls) {
        try {
            return createValue(str, (Class<Object>) cls);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m25688c(String str) {
        char charAt;
        if (str.startsWith("\\u")) {
            charAt = Character.toChars(Integer.parseInt(str.substring(2), 16))[0];
        } else {
            charAt = str.charAt(0);
        }
        return Character.valueOf(charAt);
    }

    public static Class<?> createClass(String str) throws ParseException {
        return (Class) createValue(str, (Class<Object>) Class.class);
    }

    public static Date createDate(String str) {
        return (Date) m25689b(str, Date.class);
    }

    public static Map<Class<?>, Converter<?, ? extends Throwable>> createDefaultMap() {
        return m25687d(new HashMap());
    }

    public static File createFile(String str) {
        return (File) m25689b(str, File.class);
    }

    @Deprecated
    public static File[] createFiles(String str) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Deprecated
    public static Number createNumber(String str) throws ParseException {
        return (Number) createValue(str, (Class<Object>) Number.class);
    }

    @Deprecated
    public static Object createObject(String str) throws ParseException {
        return createValue(str, (Class<Object>) Object.class);
    }

    public static URL createURL(String str) throws ParseException {
        return (URL) createValue(str, (Class<Object>) URL.class);
    }

    public static <T> T createValue(String str, Class<T> cls) throws ParseException {
        try {
            return getDefault().getConverter(cls).apply(str);
        } catch (Throwable th2) {
            throw ParseException.wrap(th2);
        }
    }

    /* renamed from: d */
    public static Map m25687d(Map map) {
        map.put(Object.class, Converter.OBJECT);
        map.put(Class.class, Converter.CLASS);
        map.put(Date.class, Converter.DATE);
        map.put(File.class, Converter.FILE);
        map.put(AbstractC17535Eg0.m68474a(), Converter.PATH);
        map.put(Number.class, Converter.NUMBER);
        map.put(URL.class, Converter.URL);
        map.put(FileInputStream.class, new Converter() { // from class: WV1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return new FileInputStream(str);
            }
        });
        map.put(Long.class, new Converter() { // from class: XV1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return Long.valueOf(Long.parseLong(str));
            }
        });
        map.put(Integer.class, new Converter() { // from class: YV1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return Integer.valueOf(Integer.parseInt(str));
            }
        });
        map.put(Short.class, new Converter() { // from class: ZV1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return Short.valueOf(Short.parseShort(str));
            }
        });
        map.put(Byte.class, new Converter() { // from class: aW1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return Byte.valueOf(Byte.parseByte(str));
            }
        });
        map.put(Character.class, new Converter() { // from class: bW1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                Object m25688c;
                m25688c = TypeHandler.m25688c(str);
                return m25688c;
            }
        });
        map.put(Double.class, new Converter() { // from class: cW1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return Double.valueOf(Double.parseDouble(str));
            }
        });
        map.put(Float.class, new Converter() { // from class: dW1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return Float.valueOf(Float.parseFloat(str));
            }
        });
        map.put(BigInteger.class, new Converter() { // from class: UV1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return new BigInteger(str);
            }
        });
        map.put(BigDecimal.class, new Converter() { // from class: VV1
            @Override // org.apache.commons.cli.Converter
            public final Object apply(String str) {
                return new BigDecimal(str);
            }
        });
        return map;
    }

    public static TypeHandler getDefault() {
        return f73009b;
    }

    @Deprecated
    public static FileInputStream openFile(String str) throws ParseException {
        return (FileInputStream) createValue(str, (Class<Object>) FileInputStream.class);
    }

    public <T> Converter<T, ?> getConverter(Class<T> cls) {
        Object orDefault;
        orDefault = this.f73010a.getOrDefault(cls, Converter.DEFAULT);
        return (Converter) orDefault;
    }

    public TypeHandler(Map<Class<?>, Converter<?, ? extends Throwable>> map) {
        Objects.requireNonNull(map, "converterMap");
        this.f73010a = map;
    }

    @Deprecated
    public static Object createValue(String str, Object obj) throws ParseException {
        return createValue(str, (Class<Object>) obj);
    }
}
