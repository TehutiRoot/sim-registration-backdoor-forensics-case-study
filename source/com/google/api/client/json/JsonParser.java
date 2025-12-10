package com.google.api.client.json;

import com.google.api.client.json.JsonPolymorphicTypeMap;
import com.google.api.client.util.Beta;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import com.google.api.client.util.Types;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public abstract class JsonParser implements Closeable {

    /* renamed from: a */
    public static WeakHashMap f52187a = new WeakHashMap();

    /* renamed from: b */
    public static final Lock f52188b = new ReentrantLock();

    /* renamed from: com.google.api.client.json.JsonParser$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7299a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52189a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f52189a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52189a[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52189a[JsonToken.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52189a[JsonToken.FIELD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52189a[JsonToken.END_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52189a[JsonToken.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52189a[JsonToken.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f52189a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f52189a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f52189a[JsonToken.VALUE_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f52189a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: b */
    public static Field m41729b(Class cls) {
        boolean z;
        boolean z2;
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = f52188b;
        lock.lock();
        try {
            if (f52187a.containsKey(cls)) {
                Field field2 = (Field) f52187a.get(cls);
                lock.unlock();
                return field2;
            }
            for (FieldInfo fieldInfo : ClassInfo.m41709of(cls).getFieldInfos()) {
                Field field3 = fieldInfo.getField();
                JsonPolymorphicTypeMap jsonPolymorphicTypeMap = (JsonPolymorphicTypeMap) field3.getAnnotation(JsonPolymorphicTypeMap.class);
                if (jsonPolymorphicTypeMap != null) {
                    if (field == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkArgument(z, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    Preconditions.checkArgument(Data.isPrimitive(field3.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, field3.getType());
                    JsonPolymorphicTypeMap.TypeDef[] typeDefinitions = jsonPolymorphicTypeMap.typeDefinitions();
                    HashSet newHashSet = Sets.newHashSet();
                    if (typeDefinitions.length > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Preconditions.checkArgument(z2, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (JsonPolymorphicTypeMap.TypeDef typeDef : typeDefinitions) {
                        Preconditions.checkArgument(newHashSet.add(typeDef.key()), "Class contains two @TypeDef annotations with identical key: %s", typeDef.key());
                    }
                    field = field3;
                }
            }
            f52187a.put(cls, field);
            return field;
        } finally {
            f52188b.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    /* renamed from: d */
    public final void m41728d(ArrayList arrayList, Object obj, CustomizeJsonParser customizeJsonParser) {
        if (obj instanceof GenericJson) {
            ((GenericJson) obj).setFactory(getFactory());
        }
        JsonToken m41723l = m41723l();
        Class<?> cls = obj.getClass();
        ClassInfo m41709of = ClassInfo.m41709of(cls);
        boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
        if (!isAssignableFrom && Map.class.isAssignableFrom(cls)) {
            m41726i(null, (Map) obj, Types.getMapValueParameter(cls), arrayList, customizeJsonParser);
            return;
        }
        while (m41723l == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser != null && customizeJsonParser.stopAt(obj, text)) {
                return;
            }
            FieldInfo fieldInfo = m41709of.getFieldInfo(text);
            if (fieldInfo != null) {
                if (fieldInfo.isFinal() && !fieldInfo.isPrimitive()) {
                    throw new IllegalArgumentException("final array/object fields are not supported");
                }
                Field field = fieldInfo.getField();
                int size = arrayList.size();
                arrayList.add(field.getGenericType());
                Object m41725j = m41725j(field, fieldInfo.getGenericType(), arrayList, obj, customizeJsonParser, true);
                arrayList.remove(size);
                fieldInfo.setValue(obj, m41725j);
            } else if (isAssignableFrom) {
                ((GenericData) obj).set(text, m41725j(null, null, arrayList, obj, customizeJsonParser, true));
            } else {
                if (customizeJsonParser != null) {
                    customizeJsonParser.handleUnrecognizedKey(obj, text);
                }
                skipChildren();
            }
            m41723l = nextToken();
        }
    }

    /* renamed from: g */
    public final void m41727g(Field field, Collection collection, Type type, ArrayList arrayList, CustomizeJsonParser customizeJsonParser) {
        JsonToken m41723l = m41723l();
        while (m41723l != JsonToken.END_ARRAY) {
            collection.add(m41725j(field, type, arrayList, collection, customizeJsonParser, true));
            m41723l = nextToken();
        }
    }

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public abstract byte getByteValue() throws IOException;

    public abstract String getCurrentName() throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public abstract JsonFactory getFactory();

    public abstract float getFloatValue() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract long getLongValue() throws IOException;

    public abstract short getShortValue() throws IOException;

    public abstract String getText() throws IOException;

    /* renamed from: i */
    public final void m41726i(Field field, Map map, Type type, ArrayList arrayList, CustomizeJsonParser customizeJsonParser) {
        JsonToken m41723l = m41723l();
        while (m41723l == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser != null && customizeJsonParser.stopAt(map, text)) {
                return;
            }
            map.put(text, m41725j(field, type, arrayList, map, customizeJsonParser, true));
            m41723l = nextToken();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01c5 A[Catch: IllegalArgumentException -> 0x005d, TryCatch #1 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x0031, B:17:0x0046, B:18:0x005c, B:22:0x0064, B:25:0x006b, B:27:0x0072, B:29:0x007a, B:31:0x0080, B:33:0x008d, B:35:0x0093, B:37:0x00a0, B:39:0x00a9, B:42:0x00bd, B:52:0x00dd, B:55:0x00e7, B:58:0x00ee, B:59:0x00f3, B:45:0x00c3, B:47:0x00cb, B:49:0x00d3, B:62:0x00fe, B:65:0x0105, B:67:0x010c, B:72:0x011a, B:75:0x0121, B:80:0x012b, B:84:0x0132, B:89:0x013b, B:94:0x0144, B:99:0x014d, B:102:0x0152, B:103:0x0168, B:104:0x0169, B:106:0x0172, B:108:0x017b, B:110:0x0184, B:112:0x018d, B:114:0x0196, B:116:0x019f, B:119:0x01a6, B:122:0x01ac, B:127:0x01b8, B:129:0x01c5, B:130:0x01c8, B:132:0x01cb, B:136:0x01d5, B:141:0x01df, B:144:0x01ec, B:147:0x01f4, B:150:0x01fb, B:155:0x020e, B:157:0x0221, B:152:0x0202, B:154:0x020a, B:160:0x022b, B:162:0x023b, B:166:0x0245, B:169:0x024d, B:174:0x0258, B:182:0x0270, B:184:0x0276, B:186:0x027b, B:188:0x0283, B:190:0x0289, B:193:0x0291, B:180:0x0266, B:181:0x026b), top: B:229:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c8 A[Catch: IllegalArgumentException -> 0x005d, TryCatch #1 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x0031, B:17:0x0046, B:18:0x005c, B:22:0x0064, B:25:0x006b, B:27:0x0072, B:29:0x007a, B:31:0x0080, B:33:0x008d, B:35:0x0093, B:37:0x00a0, B:39:0x00a9, B:42:0x00bd, B:52:0x00dd, B:55:0x00e7, B:58:0x00ee, B:59:0x00f3, B:45:0x00c3, B:47:0x00cb, B:49:0x00d3, B:62:0x00fe, B:65:0x0105, B:67:0x010c, B:72:0x011a, B:75:0x0121, B:80:0x012b, B:84:0x0132, B:89:0x013b, B:94:0x0144, B:99:0x014d, B:102:0x0152, B:103:0x0168, B:104:0x0169, B:106:0x0172, B:108:0x017b, B:110:0x0184, B:112:0x018d, B:114:0x0196, B:116:0x019f, B:119:0x01a6, B:122:0x01ac, B:127:0x01b8, B:129:0x01c5, B:130:0x01c8, B:132:0x01cb, B:136:0x01d5, B:141:0x01df, B:144:0x01ec, B:147:0x01f4, B:150:0x01fb, B:155:0x020e, B:157:0x0221, B:152:0x0202, B:154:0x020a, B:160:0x022b, B:162:0x023b, B:166:0x0245, B:169:0x024d, B:174:0x0258, B:182:0x0270, B:184:0x0276, B:186:0x027b, B:188:0x0283, B:190:0x0289, B:193:0x0291, B:180:0x0266, B:181:0x026b), top: B:229:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f4 A[Catch: IllegalArgumentException -> 0x005d, TryCatch #1 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x0031, B:17:0x0046, B:18:0x005c, B:22:0x0064, B:25:0x006b, B:27:0x0072, B:29:0x007a, B:31:0x0080, B:33:0x008d, B:35:0x0093, B:37:0x00a0, B:39:0x00a9, B:42:0x00bd, B:52:0x00dd, B:55:0x00e7, B:58:0x00ee, B:59:0x00f3, B:45:0x00c3, B:47:0x00cb, B:49:0x00d3, B:62:0x00fe, B:65:0x0105, B:67:0x010c, B:72:0x011a, B:75:0x0121, B:80:0x012b, B:84:0x0132, B:89:0x013b, B:94:0x0144, B:99:0x014d, B:102:0x0152, B:103:0x0168, B:104:0x0169, B:106:0x0172, B:108:0x017b, B:110:0x0184, B:112:0x018d, B:114:0x0196, B:116:0x019f, B:119:0x01a6, B:122:0x01ac, B:127:0x01b8, B:129:0x01c5, B:130:0x01c8, B:132:0x01cb, B:136:0x01d5, B:141:0x01df, B:144:0x01ec, B:147:0x01f4, B:150:0x01fb, B:155:0x020e, B:157:0x0221, B:152:0x0202, B:154:0x020a, B:160:0x022b, B:162:0x023b, B:166:0x0245, B:169:0x024d, B:174:0x0258, B:182:0x0270, B:184:0x0276, B:186:0x027b, B:188:0x0283, B:190:0x0289, B:193:0x0291, B:180:0x0266, B:181:0x026b), top: B:229:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fb A[Catch: IllegalArgumentException -> 0x005d, TryCatch #1 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x0031, B:17:0x0046, B:18:0x005c, B:22:0x0064, B:25:0x006b, B:27:0x0072, B:29:0x007a, B:31:0x0080, B:33:0x008d, B:35:0x0093, B:37:0x00a0, B:39:0x00a9, B:42:0x00bd, B:52:0x00dd, B:55:0x00e7, B:58:0x00ee, B:59:0x00f3, B:45:0x00c3, B:47:0x00cb, B:49:0x00d3, B:62:0x00fe, B:65:0x0105, B:67:0x010c, B:72:0x011a, B:75:0x0121, B:80:0x012b, B:84:0x0132, B:89:0x013b, B:94:0x0144, B:99:0x014d, B:102:0x0152, B:103:0x0168, B:104:0x0169, B:106:0x0172, B:108:0x017b, B:110:0x0184, B:112:0x018d, B:114:0x0196, B:116:0x019f, B:119:0x01a6, B:122:0x01ac, B:127:0x01b8, B:129:0x01c5, B:130:0x01c8, B:132:0x01cb, B:136:0x01d5, B:141:0x01df, B:144:0x01ec, B:147:0x01f4, B:150:0x01fb, B:155:0x020e, B:157:0x0221, B:152:0x0202, B:154:0x020a, B:160:0x022b, B:162:0x023b, B:166:0x0245, B:169:0x024d, B:174:0x0258, B:182:0x0270, B:184:0x0276, B:186:0x027b, B:188:0x0283, B:190:0x0289, B:193:0x0291, B:180:0x0266, B:181:0x026b), top: B:229:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0221 A[Catch: IllegalArgumentException -> 0x005d, TryCatch #1 {IllegalArgumentException -> 0x005d, blocks: (B:14:0x0031, B:17:0x0046, B:18:0x005c, B:22:0x0064, B:25:0x006b, B:27:0x0072, B:29:0x007a, B:31:0x0080, B:33:0x008d, B:35:0x0093, B:37:0x00a0, B:39:0x00a9, B:42:0x00bd, B:52:0x00dd, B:55:0x00e7, B:58:0x00ee, B:59:0x00f3, B:45:0x00c3, B:47:0x00cb, B:49:0x00d3, B:62:0x00fe, B:65:0x0105, B:67:0x010c, B:72:0x011a, B:75:0x0121, B:80:0x012b, B:84:0x0132, B:89:0x013b, B:94:0x0144, B:99:0x014d, B:102:0x0152, B:103:0x0168, B:104:0x0169, B:106:0x0172, B:108:0x017b, B:110:0x0184, B:112:0x018d, B:114:0x0196, B:116:0x019f, B:119:0x01a6, B:122:0x01ac, B:127:0x01b8, B:129:0x01c5, B:130:0x01c8, B:132:0x01cb, B:136:0x01d5, B:141:0x01df, B:144:0x01ec, B:147:0x01f4, B:150:0x01fb, B:155:0x020e, B:157:0x0221, B:152:0x0202, B:154:0x020a, B:160:0x022b, B:162:0x023b, B:166:0x0245, B:169:0x024d, B:174:0x0258, B:182:0x0270, B:184:0x0276, B:186:0x027b, B:188:0x0283, B:190:0x0289, B:193:0x0291, B:180:0x0266, B:181:0x026b), top: B:229:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022a A[RETURN] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m41725j(java.lang.reflect.Field r17, java.lang.reflect.Type r18, java.util.ArrayList r19, java.lang.Object r20, com.google.api.client.json.CustomizeJsonParser r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.json.JsonParser.m41725j(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, com.google.api.client.json.CustomizeJsonParser, boolean):java.lang.Object");
    }

    /* renamed from: k */
    public final JsonToken m41724k() {
        boolean z;
        JsonToken currentToken = getCurrentToken();
        if (currentToken == null) {
            currentToken = nextToken();
        }
        if (currentToken != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "no JSON input found");
        return currentToken;
    }

    /* renamed from: l */
    public final JsonToken m41723l() {
        JsonToken m41724k = m41724k();
        int i = C7299a.f52189a[m41724k.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                return nextToken();
            }
            return m41724k;
        }
        JsonToken nextToken = nextToken();
        if (nextToken != JsonToken.FIELD_NAME && nextToken != JsonToken.END_OBJECT) {
            z = false;
        }
        Preconditions.checkArgument(z, nextToken);
        return nextToken;
    }

    public abstract JsonToken nextToken() throws IOException;

    public final <T> T parse(Class<T> cls) throws IOException {
        return (T) parse((Class<Object>) cls, (CustomizeJsonParser) null);
    }

    public final <T> T parseAndClose(Class<T> cls) throws IOException {
        return (T) parseAndClose((Class<Object>) cls, (CustomizeJsonParser) null);
    }

    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2) throws IOException {
        return parseArray(cls, cls2, (CustomizeJsonParser) null);
    }

    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2) throws IOException {
        return parseArrayAndClose(cls, cls2, (CustomizeJsonParser) null);
    }

    public abstract JsonParser skipChildren() throws IOException;

    public final void skipToKey(String str) throws IOException {
        skipToKey(Collections.singleton(str));
    }

    @Beta
    public final <T> T parse(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        return (T) parse(cls, false, customizeJsonParser);
    }

    @Beta
    public final <T> T parseAndClose(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return (T) parse((Class<Object>) cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    @Beta
    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        Collection<T> collection = (Collection<T>) Data.newCollectionInstance(cls);
        parseArray(collection, cls2, customizeJsonParser);
        return collection;
    }

    @Beta
    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return parseArray(cls, cls2, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final String skipToKey(Set<String> set) throws IOException {
        JsonToken m41723l = m41723l();
        while (m41723l == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (set.contains(text)) {
                return text;
            }
            skipChildren();
            m41723l = nextToken();
        }
        return null;
    }

    public Object parse(Type type, boolean z) throws IOException {
        return parse(type, z, null);
    }

    @Beta
    public Object parse(Type type, boolean z, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                m41724k();
            }
            Object m41725j = m41725j(null, type, new ArrayList(), null, customizeJsonParser, true);
            if (z) {
                close();
            }
            return m41725j;
        } catch (Throwable th2) {
            if (z) {
                close();
            }
            throw th2;
        }
    }

    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls) throws IOException {
        parseArray(collection, cls, (CustomizeJsonParser) null);
    }

    public final void parseAndClose(Object obj) throws IOException {
        parseAndClose(obj, (CustomizeJsonParser) null);
    }

    @Beta
    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        m41727g(null, collection, cls, new ArrayList(), customizeJsonParser);
    }

    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls) throws IOException {
        parseArrayAndClose(collection, cls, (CustomizeJsonParser) null);
    }

    @Beta
    public final void parseAndClose(Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            parse(obj, customizeJsonParser);
        } finally {
            close();
        }
    }

    @Beta
    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            parseArray(collection, cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final void parse(Object obj) throws IOException {
        parse(obj, (CustomizeJsonParser) null);
    }

    @Beta
    public final void parse(Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj.getClass());
        m41728d(arrayList, obj, customizeJsonParser);
    }
}
