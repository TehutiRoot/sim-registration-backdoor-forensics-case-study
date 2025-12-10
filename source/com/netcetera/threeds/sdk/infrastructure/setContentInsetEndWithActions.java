package com.netcetera.threeds.sdk.infrastructure;

import java.util.Iterator;
import java.util.List;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setContentInsetEndWithActions {
    private static int cleanup = 1;
    private static int valueOf;
    private final String ThreeDS2Service;
    private final finalize ThreeDS2ServiceInstance;
    private final List<setContentInsetEndWithActions> get;
    private final notifyAll values;

    /* loaded from: classes5.dex */
    public static class values {
        private static int get = 0;
        private static int initialize = 1;
        private notifyAll ThreeDS2Service;
        private finalize ThreeDS2ServiceInstance;
        private final String valueOf;
        private List<setContentInsetEndWithActions> values;

        private values(String str) {
            this.valueOf = str;
        }

        public static values ThreeDS2Service(String str) {
            values valuesVar = new values(str);
            int i = get;
            int i2 = i & 61;
            initialize = (((((i ^ 61) | i2) << 1) - (~(-((i | 61) & (~i2))))) - 1) % 128;
            return valuesVar;
        }

        public values get(List<setContentInsetEndWithActions> list) {
            int i = initialize + 49;
            get = i % 128;
            if (i % 2 != 0) {
                this.values = list;
                int i2 = 30 / 0;
            } else {
                this.values = list;
            }
            return this;
        }

        public values valueOf(notifyAll notifyall) {
            int i = get;
            this.ThreeDS2Service = notifyall;
            initialize = ((i & 45) + (i | 45)) % 128;
            return this;
        }

        public values ThreeDS2Service(finalize finalizeVar) {
            int i = initialize + 1;
            get = i % 128;
            if (i % 2 == 0) {
                this.ThreeDS2ServiceInstance = finalizeVar;
                return this;
            }
            this.ThreeDS2ServiceInstance = finalizeVar;
            throw null;
        }

        public setContentInsetEndWithActions ThreeDS2Service() {
            int i = get;
            initialize = ((i ^ 77) + ((i & 77) << 1)) % 128;
            if (this.ThreeDS2Service != null) {
                int i2 = i ^ 17;
                int i3 = (i & 17) << 1;
                initialize = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                if (this.ThreeDS2ServiceInstance != null) {
                    setContentInsetEndWithActions setcontentinsetendwithactions = new setContentInsetEndWithActions(this.valueOf, this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.values);
                    int i4 = get;
                    int i5 = i4 & 45;
                    int i6 = (((i4 | 45) & (~i5)) - (~(i5 << 1))) - 1;
                    initialize = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 15 / 0;
                    }
                    return setcontentinsetendwithactions;
                }
            }
            throw setForegroundGravity.getMessage.valueOf(new Object[0]);
        }
    }

    public setContentInsetEndWithActions(String str, notifyAll notifyall, finalize finalizeVar, List<setContentInsetEndWithActions> list) {
        this.ThreeDS2Service = str;
        this.values = notifyall;
        this.ThreeDS2ServiceInstance = finalizeVar;
        this.get = list;
    }

    private C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, boolean z) {
        setContentInsetEndWithActions next;
        C9623nl cleanup2;
        int i = cleanup;
        valueOf = ((((i | 124) << 1) - (i ^ 124)) - 1) % 128;
        C9612name valueOf2 = C9612name.valueOf();
        int i2 = 0;
        if (c9651nr.onError(this.ThreeDS2Service)) {
            int i3 = cleanup;
            int i4 = (i3 | 75) << 1;
            int i5 = -(i3 ^ 75);
            int i6 = (i4 & i5) + (i5 | i4);
            valueOf = i6 % 128;
            if (i6 % 2 != 0) {
                cleanup2 = c9651nr.cleanup(this.ThreeDS2Service);
                i2 = 1;
            } else {
                cleanup2 = c9651nr.cleanup(this.ThreeDS2Service);
            }
            while (i2 < cleanup2.ThreeDS2ServiceInstance()) {
                int i7 = cleanup;
                int i8 = i7 & 29;
                valueOf = ((((i7 ^ 29) | i8) << 1) - ((i7 | 29) & (~i8))) % 128;
                C9651nr ThreeDS2Service = cleanup2.ThreeDS2Service(i2);
                int i9 = valueOf;
                int i10 = i9 | 31;
                int i11 = i10 << 1;
                int i12 = -((~(i9 & 31)) & i10);
                cleanup = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                for (setContentInsetEndWithActions setcontentinsetendwithactions : this.get) {
                    int i13 = valueOf;
                    int i14 = i13 & 57;
                    cleanup = ((i14 - (~(-(-((i13 ^ 57) | i14))))) - 1) % 128;
                    if (setcontentinsetendwithactions.values.values(ThreeDS2Service, setcontentinsetendwithactions.ThreeDS2Service, z)) {
                        int i15 = cleanup;
                        int i16 = i15 & 121;
                        int i17 = i16 + ((i15 ^ 121) | i16);
                        valueOf = i17 % 128;
                        if (i17 % 2 == 0) {
                            valueOf2.values(setcontentinsetendwithactions.valueOf(ThreeDS2Service, z));
                        } else {
                            valueOf2.values(setcontentinsetendwithactions.valueOf(ThreeDS2Service, z));
                            throw null;
                        }
                    }
                    int i18 = valueOf;
                    cleanup = (((i18 ^ 26) + ((i18 & 26) << 1)) - 1) % 128;
                }
                i2++;
                int i19 = cleanup;
                int i20 = i19 | 83;
                valueOf = ((i20 << 1) - ((~(i19 & 83)) & i20)) % 128;
            }
            int i21 = valueOf;
            int i22 = i21 & 33;
            int i23 = i21 | 33;
            cleanup = ((i22 & i23) + (i23 | i22)) % 128;
        } else {
            C9651nr sDKVersion = c9651nr.getSDKVersion(this.ThreeDS2Service);
            Iterator<setContentInsetEndWithActions> it = this.get.iterator();
            int i24 = valueOf;
            int i25 = i24 ^ 85;
            cleanup = (((((i24 & 85) | i25) << 1) - (~(-i25))) - 1) % 128;
            while (it.hasNext()) {
                int i26 = valueOf;
                int i27 = i26 & 33;
                int i28 = -(-(i26 | 33));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                cleanup = i29 % 128;
                if (i29 % 2 == 0) {
                    next = it.next();
                    int i30 = 80 / 0;
                    if (!next.values.values(sDKVersion, next.ThreeDS2Service, z)) {
                        int i31 = valueOf;
                        int i32 = i31 & 99;
                        cleanup = ((((i31 | 99) & (~i32)) - (~(i32 << 1))) - 1) % 128;
                    }
                    valueOf2.values(next.valueOf(sDKVersion, z));
                    int i33 = valueOf;
                    cleanup = ((i33 ^ 51) + ((i33 & 51) << 1)) % 128;
                    int i312 = valueOf;
                    int i322 = i312 & 99;
                    cleanup = ((((i312 | 99) & (~i322)) - (~(i322 << 1))) - 1) % 128;
                } else {
                    next = it.next();
                    if (!next.values.values(sDKVersion, next.ThreeDS2Service, z)) {
                        int i3122 = valueOf;
                        int i3222 = i3122 & 99;
                        cleanup = ((((i3122 | 99) & (~i3222)) - (~(i3222 << 1))) - 1) % 128;
                    }
                    valueOf2.values(next.valueOf(sDKVersion, z));
                    int i332 = valueOf;
                    cleanup = ((i332 ^ 51) + ((i332 & 51) << 1)) % 128;
                    int i31222 = valueOf;
                    int i32222 = i31222 & 99;
                    cleanup = ((((i31222 | 99) & (~i32222)) - (~(i32222 << 1))) - 1) % 128;
                }
            }
        }
        int i34 = cleanup;
        int i35 = i34 & 15;
        int i36 = (i34 ^ 15) | i35;
        valueOf = ((i35 & i36) + (i36 | i35)) % 128;
        return valueOf2;
    }

    private C9651nr values(C9651nr c9651nr, boolean z) {
        int i;
        setContentInsetEndWithActions next;
        int i2 = valueOf;
        int i3 = i2 & 71;
        int i4 = (((i2 | 71) & (~i3)) - (~(i3 << 1))) - 1;
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            if (c9651nr.onError(this.ThreeDS2Service)) {
                C9623nl cleanup2 = c9651nr.cleanup(this.ThreeDS2Service);
                int i5 = cleanup + 116;
                valueOf = ((~i5) + (i5 << 1)) % 128;
                int i6 = 0;
                while (i6 < cleanup2.ThreeDS2ServiceInstance()) {
                    int i7 = valueOf;
                    int i8 = ((i7 & (-120)) | ((~i7) & 119)) + ((i7 & 119) << 1);
                    cleanup = i8 % 128;
                    if (i8 % 2 != 0) {
                        C9651nr ThreeDS2Service = cleanup2.ThreeDS2Service(i6);
                        Iterator<setContentInsetEndWithActions> it = this.get.iterator();
                        while (it.hasNext()) {
                            int i9 = valueOf;
                            int i10 = i9 & 83;
                            int i11 = (((i9 | 83) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
                            cleanup = i11 % 128;
                            if (i11 % 2 == 0) {
                                next = it.next();
                                int i12 = 69 / 0;
                                if (!next.values.values(ThreeDS2Service, next.ThreeDS2Service, z)) {
                                    cleanup2.get(i6, ThreeDS2Service);
                                    int i13 = cleanup;
                                    int i14 = i13 & 57;
                                    valueOf = (((i13 | 57) & (~i14)) + (i14 << 1)) % 128;
                                }
                                ThreeDS2Service = next.get(ThreeDS2Service, z);
                                int i15 = cleanup;
                                int i16 = i15 & 121;
                                int i17 = -(-((i15 ^ 121) | i16));
                                valueOf = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                                cleanup2.get(i6, ThreeDS2Service);
                                int i132 = cleanup;
                                int i142 = i132 & 57;
                                valueOf = (((i132 | 57) & (~i142)) + (i142 << 1)) % 128;
                            } else {
                                next = it.next();
                                if (!next.values.values(ThreeDS2Service, next.ThreeDS2Service, z)) {
                                    cleanup2.get(i6, ThreeDS2Service);
                                    int i1322 = cleanup;
                                    int i1422 = i1322 & 57;
                                    valueOf = (((i1322 | 57) & (~i1422)) + (i1422 << 1)) % 128;
                                }
                                ThreeDS2Service = next.get(ThreeDS2Service, z);
                                int i152 = cleanup;
                                int i162 = i152 & 121;
                                int i172 = -(-((i152 ^ 121) | i162));
                                valueOf = (((i162 | i172) << 1) - (i172 ^ i162)) % 128;
                                cleanup2.get(i6, ThreeDS2Service);
                                int i13222 = cleanup;
                                int i14222 = i13222 & 57;
                                valueOf = (((i13222 | 57) & (~i14222)) + (i14222 << 1)) % 128;
                            }
                        }
                        int i18 = (i6 & (-109)) + (i6 | (-109));
                        i6 = (i18 & 110) + (i18 | 110);
                        valueOf = (cleanup + 121) % 128;
                    } else {
                        cleanup2.ThreeDS2Service(i6);
                        this.get.iterator();
                        throw null;
                    }
                }
                c9651nr.values(this.ThreeDS2Service, cleanup2);
                int i19 = cleanup;
                valueOf = ((i19 & 47) + (i19 | 47)) % 128;
            } else {
                C9651nr sDKVersion = c9651nr.getSDKVersion(this.ThreeDS2Service);
                Iterator<setContentInsetEndWithActions> it2 = this.get.iterator();
                int i20 = cleanup;
                int i21 = i20 ^ 53;
                int i22 = (i20 & 53) << 1;
                valueOf = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
                while (!(!it2.hasNext())) {
                    valueOf = (cleanup + 121) % 128;
                    setContentInsetEndWithActions next2 = it2.next();
                    if (next2.values.values(sDKVersion, next2.ThreeDS2Service, z)) {
                        int i23 = valueOf;
                        int i24 = ((i23 ^ 95) | (i23 & 95)) << 1;
                        int i25 = -(((~i23) & 95) | (i23 & (-96)));
                        cleanup = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                        sDKVersion = next2.get(sDKVersion, z);
                        int i26 = cleanup;
                        valueOf = ((((i26 | 92) << 1) - (i26 ^ 92)) - 1) % 128;
                    }
                    c9651nr.values(this.ThreeDS2Service, sDKVersion);
                    int i27 = valueOf;
                    int i28 = i27 ^ CameraActivity.REQUEST_CODE;
                    int i29 = ((i27 & CameraActivity.REQUEST_CODE) | i28) << 1;
                    int i30 = -i28;
                    cleanup = ((i29 ^ i30) + ((i29 & i30) << 1)) % 128;
                }
            }
            int i31 = cleanup & 29;
            valueOf = (((((i ^ 29) | i31) << 1) - (~(-((i | 29) & (~i31))))) - 1) % 128;
            return c9651nr;
        }
        c9651nr.onError(this.ThreeDS2Service);
        throw null;
    }

    public C9651nr get(C9651nr c9651nr, boolean z) {
        int i = valueOf + 85;
        cleanup = i % 128;
        if (i % 2 != 0) {
            if (this.values.values(c9651nr, this.ThreeDS2Service, z)) {
                int i2 = valueOf;
                cleanup = (((((i2 ^ 13) | (i2 & 13)) << 1) - (~(-((i2 & (-14)) | ((~i2) & 13))))) - 1) % 128;
                List<setContentInsetEndWithActions> list = this.get;
                if (list != null) {
                    int i3 = i2 & 59;
                    int i4 = ((i2 | 59) & (~i3)) + (i3 << 1);
                    cleanup = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (list.size() > 0) {
                            int i5 = valueOf;
                            int i6 = i5 ^ 97;
                            int i7 = ((i5 & 97) | i6) << 1;
                            int i8 = -i6;
                            cleanup = (((i7 | i8) << 1) - (i7 ^ i8)) % 128;
                            C9651nr values2 = values(c9651nr, z);
                            int i9 = valueOf;
                            int i10 = i9 & 67;
                            cleanup = ((((i9 ^ 67) | i10) << 1) - ((i9 | 67) & (~i10))) % 128;
                            return values2;
                        }
                    } else {
                        list.size();
                        throw null;
                    }
                }
                C9651nr ThreeDS2Service = this.ThreeDS2ServiceInstance.ThreeDS2Service(c9651nr, this.ThreeDS2Service, z);
                valueOf = (cleanup + 9) % 128;
                return ThreeDS2Service;
            }
            int i11 = valueOf;
            int i12 = i11 & 49;
            int i13 = (i11 ^ 49) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            cleanup = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 20 / 0;
            }
            return c9651nr;
        }
        this.values.values(c9651nr, this.ThreeDS2Service, z);
        throw null;
    }

    public String valueOf() {
        String str;
        int i = valueOf;
        int i2 = ((i & 110) + (i | 110)) - 1;
        int i3 = i2 % 128;
        cleanup = i3;
        if (i2 % 2 == 0) {
            str = this.ThreeDS2Service;
            int i4 = 18 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        int i5 = i3 & 79;
        int i6 = (i3 ^ 79) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        valueOf = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public C9612name valueOf(C9651nr c9651nr, boolean z) {
        int i = cleanup;
        int i2 = i & 75;
        int i3 = ((i | 75) & (~i2)) + (i2 << 1);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            C9612name valueOf2 = C9612name.valueOf();
            if (this.values.values(c9651nr, this.ThreeDS2Service, z)) {
                valueOf2.values(this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(c9651nr, this.ThreeDS2Service, z));
                List<setContentInsetEndWithActions> list = this.get;
                if (list != null) {
                    int i4 = cleanup;
                    int i5 = (i4 & 74) + (i4 | 74);
                    valueOf = ((~i5) + (i5 << 1)) % 128;
                    if (list.size() > 0) {
                        int i6 = valueOf;
                        int i7 = i6 & 95;
                        int i8 = -(-(i6 | 95));
                        cleanup = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                        valueOf2.values(ThreeDS2ServiceInstance(c9651nr, z));
                        cleanup = (valueOf + 53) % 128;
                    }
                }
            }
            int i9 = valueOf;
            int i10 = ((i9 ^ 103) | (i9 & 103)) << 1;
            int i11 = -(((~i9) & 103) | (i9 & (-104)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            cleanup = i12 % 128;
            if (i12 % 2 != 0) {
                return valueOf2;
            }
            throw null;
        }
        C9612name.valueOf();
        this.values.values(c9651nr, this.ThreeDS2Service, z);
        throw null;
    }
}
