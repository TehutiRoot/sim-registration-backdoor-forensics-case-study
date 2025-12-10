package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
abstract class getSchemeEncryptionPublicKeyId {
    private static char ThreeDS2Service = 0;
    private static char ThreeDS2ServiceInstance = 0;
    private static int get = 0;
    private static int initialize = 1;
    private static char valueOf;
    private static char values;

    static {
        get();
        System.loadLibrary("eb90");
        get = (initialize + 91) % 128;
    }

    public static void get() {
        ThreeDS2Service = (char) 29152;
        valueOf = (char) 13274;
        values = (char) 5907;
        ThreeDS2ServiceInstance = (char) 31175;
    }
}
