package org.bson;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.bson.util.ClassMap;

@Deprecated
/* loaded from: classes6.dex */
public class BSON {
    public static final byte ARRAY = 4;
    public static final byte BINARY = 5;
    public static final byte BOOLEAN = 8;
    public static final byte B_BINARY = 2;
    public static final byte B_FUNC = 1;
    public static final byte B_GENERAL = 0;
    public static final byte B_UUID = 3;
    public static final byte CODE = 13;
    public static final byte CODE_W_SCOPE = 15;
    public static final byte DATE = 9;
    public static final byte EOO = 0;
    public static final byte MAXKEY = Byte.MAX_VALUE;
    public static final byte MINKEY = -1;
    public static final byte NULL = 10;
    public static final byte NUMBER = 1;
    public static final byte NUMBER_INT = 16;
    public static final byte NUMBER_LONG = 18;
    public static final byte OBJECT = 3;
    public static final byte OID = 7;
    public static final byte REF = 12;
    public static final byte REGEX = 11;
    public static final byte STRING = 2;
    public static final byte SYMBOL = 14;
    public static final byte TIMESTAMP = 17;
    public static final byte UNDEFINED = 6;

    /* renamed from: a */
    public static final int[] f75788a;

    /* renamed from: b */
    public static volatile boolean f75789b = false;

    /* renamed from: c */
    public static volatile boolean f75790c = false;

    /* renamed from: d */
    public static final ClassMap f75791d;

    /* renamed from: e */
    public static final ClassMap f75792e;

    static {
        int[] iArr = new int[65535];
        f75788a = iArr;
        iArr[103] = 256;
        iArr[105] = 2;
        iArr[109] = 8;
        iArr[115] = 32;
        iArr[99] = 128;
        iArr[120] = 4;
        iArr[100] = 1;
        iArr[116] = 16;
        iArr[117] = 64;
        f75791d = new ClassMap();
        f75792e = new ClassMap();
    }

    public static void addDecodingHook(Class<?> cls, Transformer transformer) {
        f75790c = true;
        ClassMap classMap = f75792e;
        List list = (List) classMap.get(cls);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            classMap.put(cls, list);
        }
        list.add(transformer);
    }

    public static void addEncodingHook(Class<?> cls, Transformer transformer) {
        f75789b = true;
        ClassMap classMap = f75791d;
        List list = (List) classMap.get(cls);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            classMap.put(cls, list);
        }
        list.add(transformer);
    }

    public static Object applyDecodingHooks(Object obj) {
        List<Transformer> list;
        if (hasDecodeHooks() && obj != null) {
            ClassMap classMap = f75792e;
            if (classMap.size() != 0 && (list = (List) classMap.get(obj.getClass())) != null) {
                Object obj2 = obj;
                for (Transformer transformer : list) {
                    obj2 = transformer.transform(obj);
                }
                return obj2;
            }
            return obj;
        }
        return obj;
    }

    public static Object applyEncodingHooks(Object obj) {
        List<Transformer> list;
        if (hasEncodeHooks() && obj != null) {
            ClassMap classMap = f75791d;
            if (classMap.size() != 0 && (list = (List) classMap.get(obj.getClass())) != null) {
                Object obj2 = obj;
                for (Transformer transformer : list) {
                    obj2 = transformer.transform(obj);
                }
                return obj2;
            }
            return obj;
        }
        return obj;
    }

    public static void clearAllHooks() {
        clearEncodingHooks();
        clearDecodingHooks();
    }

    public static void clearDecodingHooks() {
        f75790c = false;
        f75792e.clear();
    }

    public static void clearEncodingHooks() {
        f75789b = false;
        f75791d.clear();
    }

    public static BSONObject decode(byte[] bArr) {
        return new BasicBSONDecoder().readObject(bArr);
    }

    public static byte[] encode(BSONObject bSONObject) {
        return new BasicBSONEncoder().encode(bSONObject);
    }

    public static List<Transformer> getDecodingHooks(Class<?> cls) {
        return (List) f75792e.get(cls);
    }

    public static List<Transformer> getEncodingHooks(Class<?> cls) {
        return (List) f75791d.get(cls);
    }

    public static boolean hasDecodeHooks() {
        return f75790c;
    }

    public static boolean hasEncodeHooks() {
        return f75789b;
    }

    public static int regexFlag(char c) {
        int i = f75788a[c];
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Unrecognized flag [%c]", Character.valueOf(c)));
    }

    public static int regexFlags(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            i |= regexFlag(c);
        }
        return i;
    }

    public static void removeDecodingHook(Class<?> cls, Transformer transformer) {
        getDecodingHooks(cls).remove(transformer);
    }

    public static void removeDecodingHooks(Class<?> cls) {
        f75792e.remove(cls);
    }

    public static void removeEncodingHook(Class<?> cls, Transformer transformer) {
        getEncodingHooks(cls).remove(transformer);
    }

    public static void removeEncodingHooks(Class<?> cls) {
        f75791d.remove(cls);
    }

    public static int toInt(Object obj) {
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1 : 0;
            }
            throw new IllegalArgumentException("Can't convert: " + obj.getClass().getName() + " to int");
        }
        throw new IllegalArgumentException("Argument shouldn't be null");
    }

    public static String regexFlags(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int[] iArr = f75788a;
            if (i2 >= iArr.length) {
                break;
            }
            if ((iArr[i2] & i) > 0) {
                sb.append((char) i2);
                i -= iArr[i2];
            }
            i2++;
        }
        if (i <= 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("Some flags could not be recognized.");
    }
}