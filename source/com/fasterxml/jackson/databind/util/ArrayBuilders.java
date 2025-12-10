package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class ArrayBuilders {

    /* renamed from: a */
    public BooleanBuilder f43441a = null;

    /* renamed from: b */
    public ByteBuilder f43442b = null;

    /* renamed from: c */
    public ShortBuilder f43443c = null;

    /* renamed from: d */
    public IntBuilder f43444d = null;

    /* renamed from: e */
    public LongBuilder f43445e = null;

    /* renamed from: f */
    public FloatBuilder f43446f = null;

    /* renamed from: g */
    public DoubleBuilder f43447g = null;

    /* loaded from: classes3.dex */
    public static final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final boolean[] _constructArray(int i) {
            return new boolean[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final byte[] _constructArray(int i) {
            return new byte[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final double[] _constructArray(int i) {
            return new double[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final float[] _constructArray(int i) {
            return new float[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final int[] _constructArray(int i) {
            return new int[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final long[] _constructArray(int i) {
            return new long[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final short[] _constructArray(int i) {
            return new short[i];
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.ArrayBuilders$a */
    /* loaded from: classes3.dex */
    public static class C6141a {

        /* renamed from: a */
        public final /* synthetic */ Class f43448a;

        /* renamed from: b */
        public final /* synthetic */ int f43449b;

        /* renamed from: c */
        public final /* synthetic */ Object f43450c;

        public C6141a(Class cls, int i, Object obj) {
            this.f43448a = cls;
            this.f43449b = i;
            this.f43450c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!ClassUtil.hasClass(obj, this.f43448a) || Array.getLength(obj) != this.f43449b) {
                return false;
            }
            for (int i = 0; i < this.f43449b; i++) {
                Object obj2 = Array.get(this.f43450c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        if (tArr != null) {
            HashSet<T> hashSet = new HashSet<>(tArr.length);
            for (T t : tArr) {
                hashSet.add(t);
            }
            return hashSet;
        }
        return new HashSet<>();
    }

    public static Object getArrayComparator(Object obj) {
        return new C6141a(obj.getClass(), Array.getLength(obj), obj);
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (tArr[i] == t) {
                if (i == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i);
                tArr2[0] = t;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(tArr, i2, tArr2, i2, i3);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }

    public BooleanBuilder getBooleanBuilder() {
        if (this.f43441a == null) {
            this.f43441a = new BooleanBuilder();
        }
        return this.f43441a;
    }

    public ByteBuilder getByteBuilder() {
        if (this.f43442b == null) {
            this.f43442b = new ByteBuilder();
        }
        return this.f43442b;
    }

    public DoubleBuilder getDoubleBuilder() {
        if (this.f43447g == null) {
            this.f43447g = new DoubleBuilder();
        }
        return this.f43447g;
    }

    public FloatBuilder getFloatBuilder() {
        if (this.f43446f == null) {
            this.f43446f = new FloatBuilder();
        }
        return this.f43446f;
    }

    public IntBuilder getIntBuilder() {
        if (this.f43444d == null) {
            this.f43444d = new IntBuilder();
        }
        return this.f43444d;
    }

    public LongBuilder getLongBuilder() {
        if (this.f43445e == null) {
            this.f43445e = new LongBuilder();
        }
        return this.f43445e;
    }

    public ShortBuilder getShortBuilder() {
        if (this.f43443c == null) {
            this.f43443c = new ShortBuilder();
        }
        return this.f43443c;
    }
}
