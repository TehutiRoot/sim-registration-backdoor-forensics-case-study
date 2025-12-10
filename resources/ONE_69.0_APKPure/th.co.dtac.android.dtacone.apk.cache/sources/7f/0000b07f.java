package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes4.dex */
public class RandomFidGenerator {

    /* renamed from: a */
    public static final byte f55525a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f55526b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static String m38614a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: b */
    public static byte[] m38613b(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    public String createRandomFid() {
        byte[] m38613b = m38613b(UUID.randomUUID(), new byte[17]);
        byte b = m38613b[0];
        m38613b[16] = b;
        m38613b[0] = (byte) ((b & f55526b) | f55525a);
        return m38614a(m38613b);
    }
}