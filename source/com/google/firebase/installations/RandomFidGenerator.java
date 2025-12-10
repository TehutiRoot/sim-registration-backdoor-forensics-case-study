package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes4.dex */
public class RandomFidGenerator {

    /* renamed from: a */
    public static final byte f55513a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f55514b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static String m38622a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: b */
    public static byte[] m38621b(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    public String createRandomFid() {
        byte[] m38621b = m38621b(UUID.randomUUID(), new byte[17]);
        byte b = m38621b[0];
        m38621b[16] = b;
        m38621b[0] = (byte) ((b & f55514b) | f55513a);
        return m38622a(m38621b);
    }
}
