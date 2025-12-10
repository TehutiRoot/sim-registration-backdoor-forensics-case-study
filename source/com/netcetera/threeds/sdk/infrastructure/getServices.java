package com.netcetera.threeds.sdk.infrastructure;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class getServices {
    private static int get = 1;
    private static int valueOf;
    private final Uri values;

    /* loaded from: classes5.dex */
    public static class get {
        private static int ThreeDS2ServiceInstance = 0;
        private static int valueOf = 1;
        private Uri get;

        public getServices ThreeDS2Service() {
            getServices getservices = new getServices(this.get);
            int i = ThreeDS2ServiceInstance;
            int i2 = i & 53;
            int i3 = (i | 53) & (~i2);
            int i4 = -(-(i2 << 1));
            valueOf = ((i3 & i4) + (i3 | i4)) % 128;
            return getservices;
        }

        public get get(Intent intent) {
            int i = valueOf;
            ThreeDS2ServiceInstance = ((i & 55) + (i | 55)) % 128;
            if (intent != null) {
                int i2 = ((i ^ 111) | (i & 111)) << 1;
                int i3 = -(((~i) & 111) | (i & (-112)));
                ThreeDS2ServiceInstance = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                this.get = intent.getData();
                ThreeDS2ServiceInstance = (valueOf + 9) % 128;
            }
            int i4 = ThreeDS2ServiceInstance;
            valueOf = (((i4 | 57) << 1) - (i4 ^ 57)) % 128;
            return this;
        }
    }

    public Uri ThreeDS2Service() {
        int i = (valueOf + 19) % 128;
        get = i;
        Uri uri = this.values;
        int i2 = i & 61;
        int i3 = -(-((i ^ 61) | i2));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return uri;
    }

    private getServices(Uri uri) {
        this.values = uri;
    }
}
