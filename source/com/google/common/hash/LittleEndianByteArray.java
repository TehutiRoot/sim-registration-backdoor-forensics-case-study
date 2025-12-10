package com.google.common.hash;

import com.google.common.hash.LittleEndianByteArray;
import com.google.common.primitives.Longs;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class LittleEndianByteArray {

    /* renamed from: a */
    public static final InterfaceC8060b f53847a;

    /* loaded from: classes4.dex */
    public enum JavaLittleEndianBytes implements InterfaceC8060b {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
            @Override // com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes, com.google.common.hash.LittleEndianByteArray.InterfaceC8060b
            public long getLongLittleEndian(byte[] bArr, int i) {
                return Longs.fromBytes(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                long j2 = 255;
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i + i2] = (byte) ((j & j2) >> (i2 * 8));
                    j2 <<= 8;
                }
            }
        };

        @Override // com.google.common.hash.LittleEndianByteArray.InterfaceC8060b
        public abstract /* synthetic */ long getLongLittleEndian(byte[] bArr, int i);

        public abstract /* synthetic */ void putLongLittleEndian(byte[] bArr, int i, long j);
    }

    /* loaded from: classes4.dex */
    public enum UnsafeByteArray implements InterfaceC8060b {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray, com.google.common.hash.LittleEndianByteArray.InterfaceC8060b
            public long getLongLittleEndian(byte[] bArr, int i) {
                return UnsafeByteArray.theUnsafe.getLong(bArr, i + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET);
            }

            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                UnsafeByteArray.theUnsafe.putLong(bArr, i + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET, j);
            }
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray, com.google.common.hash.LittleEndianByteArray.InterfaceC8060b
            public long getLongLittleEndian(byte[] bArr, int i) {
                return Long.reverseBytes(UnsafeByteArray.theUnsafe.getLong(bArr, i + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET));
            }

            @Override // com.google.common.hash.LittleEndianByteArray.UnsafeByteArray
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
                UnsafeByteArray.theUnsafe.putLong(bArr, i + UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET, Long.reverseBytes(j));
            }
        };
        
        private static final int BYTE_ARRAY_BASE_OFFSET;
        private static final Unsafe theUnsafe;

        static {
            Unsafe unsafe = getUnsafe();
            theUnsafe = unsafe;
            BYTE_ARRAY_BASE_OFFSET = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) == 1) {
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public static /* synthetic */ Unsafe m40046a() {
            return lambda$getUnsafe$0();
        }

        private static Unsafe getUnsafe() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.common.hash.a
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return LittleEndianByteArray.UnsafeByteArray.m40046a();
                        }
                    });
                }
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        }

        public static /* synthetic */ Unsafe lambda$getUnsafe$0() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.common.hash.LittleEndianByteArray.InterfaceC8060b
        public abstract /* synthetic */ long getLongLittleEndian(byte[] bArr, int i);

        public abstract /* synthetic */ void putLongLittleEndian(byte[] bArr, int i, long j);
    }

    /* renamed from: com.google.common.hash.LittleEndianByteArray$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8060b {
        long getLongLittleEndian(byte[] bArr, int i);
    }

    static {
        InterfaceC8060b interfaceC8060b = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    interfaceC8060b = UnsafeByteArray.UNSAFE_LITTLE_ENDIAN;
                } else {
                    interfaceC8060b = UnsafeByteArray.UNSAFE_BIG_ENDIAN;
                }
            }
        } catch (Throwable unused) {
        }
        f53847a = interfaceC8060b;
    }

    /* renamed from: a */
    public static int m40049a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    public static long m40048b(byte[] bArr, int i) {
        return f53847a.getLongLittleEndian(bArr, i);
    }

    /* renamed from: c */
    public static long m40047c(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, 8);
        long j = 0;
        for (int i3 = 0; i3 < min; i3++) {
            j |= (bArr[i + i3] & 255) << (i3 * 8);
        }
        return j;
    }
}
