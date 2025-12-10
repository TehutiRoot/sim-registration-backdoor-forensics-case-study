package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nf */
/* loaded from: classes5.dex */
public final class C9606nf {
    private static int ThreeDS2Service = 1;
    private static int get;

    public static <T> T get(T t) throws setId {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(t);
            T t2 = (T) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
            ThreeDS2Service = (get + 13) % 128;
            return t2;
        } catch (IOException | ClassNotFoundException e) {
            throw setForegroundGravity.ThreeDS2ServiceInstance.valueOf(t, e);
        }
    }
}