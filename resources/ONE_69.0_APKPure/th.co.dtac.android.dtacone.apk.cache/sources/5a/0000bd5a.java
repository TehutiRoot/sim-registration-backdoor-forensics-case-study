package com.netcetera.threeds.sdk.infrastructure;

import java.security.SecureRandom;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.or */
/* loaded from: classes5.dex */
public class C9663or {
    private SecureRandom ThreeDS2Service;
    private get ThreeDS2ServiceInstance = new get();
    private get get = new get();

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.or$get */
    /* loaded from: classes5.dex */
    public class get {
        private String ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private String get;
        private String getSDKInfo;
        private String getSDKVersion;
        private String getWarnings;
        private String initialize;
        private String values;

        public get() {
        }

        private String cleanup(String str) {
            if (str == null) {
                return this.ThreeDS2ServiceInstance;
            }
            return str;
        }

        public void ThreeDS2Service(String str) {
            this.ThreeDS2ServiceInstance = str;
        }

        public String ThreeDS2ServiceInstance() {
            return cleanup(this.values);
        }

        public void get(String str) {
            this.getWarnings = str;
        }

        public void getSDKInfo(String str) {
            this.initialize = str;
        }

        public String getSDKVersion() {
            return cleanup(this.initialize);
        }

        public void getWarnings(String str) {
            this.getSDKVersion = str;
        }

        public String valueOf() {
            return cleanup(this.get);
        }

        public void values(String str) {
            this.get = str;
        }

        public String ThreeDS2Service() {
            return cleanup(this.getWarnings);
        }

        public void ThreeDS2ServiceInstance(String str) {
            this.ThreeDS2Service = str;
        }

        public String get() {
            return cleanup(this.getSDKInfo);
        }

        public String getSDKInfo() {
            return cleanup(this.getSDKVersion);
        }

        public void valueOf(String str) {
            this.getSDKInfo = str;
        }

        public String values() {
            return cleanup(this.ThreeDS2Service);
        }
    }

    public get ThreeDS2Service() {
        return this.get;
    }

    public get get() {
        return this.ThreeDS2ServiceInstance;
    }

    public SecureRandom values() {
        return this.ThreeDS2Service;
    }
}