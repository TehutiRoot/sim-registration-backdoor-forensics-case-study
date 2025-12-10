package com.netcetera.threeds.sdk.infrastructure;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.od */
/* loaded from: classes5.dex */
public class C9660od {
    @Deprecated
    public static final Charset ThreeDS2ServiceInstance = StandardCharsets.ISO_8859_1;
    @Deprecated
    public static final Charset get = StandardCharsets.US_ASCII;
    @Deprecated
    public static final Charset values = StandardCharsets.UTF_16;
    @Deprecated
    public static final Charset ThreeDS2Service = StandardCharsets.UTF_16BE;
    @Deprecated
    public static final Charset valueOf = StandardCharsets.UTF_16LE;
    @Deprecated
    public static final Charset getSDKVersion = StandardCharsets.UTF_8;

    public static Charset ThreeDS2ServiceInstance(Charset charset) {
        if (charset == null) {
            return Charset.defaultCharset();
        }
        return charset;
    }
}
