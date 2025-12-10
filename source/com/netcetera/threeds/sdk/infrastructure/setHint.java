package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class setHint {
    private static int ThreeDS2Service = 0;
    private static int getSDKInfo = 1;
    public static long values = -3809691372216773203L;
    private final setSpannableFactory ThreeDS2ServiceInstance;
    private final ExecutorService get;
    private final InterfaceC9652ns valueOf = C9653nt.ThreeDS2ServiceInstance(setHint.class);

    /* loaded from: classes5.dex */
    public static final class valueOf {
        private static int get = 0;
        private static int getSDKVersion = 1;
        private final Bitmap ThreeDS2Service;
        private final Bitmap ThreeDS2ServiceInstance;
        private final Bitmap valueOf;
        private final Bitmap values;

        private valueOf(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
            this.ThreeDS2ServiceInstance = bitmap;
            this.values = bitmap2;
            this.valueOf = bitmap3;
            this.ThreeDS2Service = bitmap4;
        }

        public static valueOf ThreeDS2Service(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
            valueOf valueof = new valueOf(bitmap, bitmap2, bitmap3, bitmap4);
            int i = getSDKVersion;
            int i2 = i & 21;
            int i3 = i | 21;
            get = ((i2 & i3) + (i3 | i2)) % 128;
            return valueof;
        }

        public static valueOf valueOf() {
            valueOf valueof = new valueOf(null, null, null, null);
            int i = get;
            int i2 = (i ^ 3) + ((i & 3) << 1);
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return valueof;
            }
            throw null;
        }

        public Bitmap ThreeDS2ServiceInstance() {
            int i = get;
            int i2 = ((i | 22) << 1) - (i ^ 22);
            int i3 = ((~i2) + (i2 << 1)) % 128;
            getSDKVersion = i3;
            Bitmap bitmap = this.values;
            int i4 = i3 ^ 51;
            int i5 = ((i3 & 51) | i4) << 1;
            int i6 = -i4;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            get = i7 % 128;
            if (i7 % 2 == 0) {
                return bitmap;
            }
            throw null;
        }

        public Bitmap get() {
            int i = getSDKVersion;
            int i2 = ((i | 73) << 1) - (i ^ 73);
            get = i2 % 128;
            int i3 = i2 % 2;
            Bitmap bitmap = this.ThreeDS2Service;
            if (i3 != 0) {
                int i4 = 90 / 0;
            }
            return bitmap;
        }

        public Bitmap values() {
            int i = getSDKVersion;
            int i2 = (i | 7) << 1;
            int i3 = -(i ^ 7);
            int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
            get = i4 % 128;
            if (i4 % 2 == 0) {
                Bitmap bitmap = this.valueOf;
                int i5 = i & 125;
                int i6 = ((((i ^ 125) | i5) << 1) - (~(-((i | 125) & (~i5))))) - 1;
                get = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 11 / 0;
                }
                return bitmap;
            }
            throw null;
        }

        public Bitmap ThreeDS2Service() {
            int i = getSDKVersion;
            int i2 = (i ^ 1) + ((i & 1) << 1);
            get = i2 % 128;
            if (i2 % 2 == 0) {
                Bitmap bitmap = this.ThreeDS2ServiceInstance;
                get = ((i ^ 93) + ((i & 93) << 1)) % 128;
                return bitmap;
            }
            throw null;
        }
    }

    public setHint(setSpannableFactory setspannablefactory, ExecutorService executorService) {
        this.ThreeDS2ServiceInstance = setspannablefactory;
        this.get = executorService;
    }

    public static /* synthetic */ Bitmap ThreeDS2Service() {
        int i = getSDKInfo + 25;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
            return values();
        }
        return values();
    }

    public static /* synthetic */ Bitmap ThreeDS2ServiceInstance(setHint sethint, String str) {
        getSDKInfo = (ThreeDS2Service + 71) % 128;
        Bitmap valueOf2 = sethint.valueOf(str);
        int i = ThreeDS2Service + 109;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    private static /* synthetic */ Bitmap values() throws Exception {
        int i = (ThreeDS2Service + 17) % 128;
        getSDKInfo = i;
        ThreeDS2Service = (i + 117) % 128;
        return null;
    }

    public valueOf valueOf(String str, String str2, String str3, String str4) {
        Callable<Bitmap> ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(str);
        Callable<Bitmap> ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(str2);
        Callable<Bitmap> ThreeDS2ServiceInstance3 = ThreeDS2ServiceInstance(str3);
        Callable<Bitmap> ThreeDS2ServiceInstance4 = ThreeDS2ServiceInstance(str4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ThreeDS2ServiceInstance);
        arrayList.add(ThreeDS2ServiceInstance2);
        arrayList.add(ThreeDS2ServiceInstance3);
        arrayList.add(ThreeDS2ServiceInstance4);
        try {
            List invokeAll = this.get.invokeAll(arrayList, 10L, TimeUnit.SECONDS);
            valueOf ThreeDS2Service2 = valueOf.ThreeDS2Service(valueOf((Future) invokeAll.get(0)), valueOf((Future) invokeAll.get(1)), valueOf((Future) invokeAll.get(2)), valueOf((Future) invokeAll.get(3)));
            ThreeDS2Service = (getSDKInfo + 41) % 128;
            return ThreeDS2Service2;
        } catch (InterruptedException | RuntimeException e) {
            InterfaceC9652ns interfaceC9652ns = this.valueOf;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance("ᗫዅᯖÚ৬㛤㾻ⓦⶊ⫝̸厅墫䆵亪瞺籏敋扑欯遲饱虵轋됋봆먿ꌲ\ua83b턣\ud988웂쿔\uf4e9ﶤ\ufaef\ue3f7\ue890ᆍẞޜಱ㗼㊤㭗⁒⥌噖彧䐽䵽䨂猇砞愕游靬", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1800, objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), e);
            return valueOf.valueOf();
        }
    }

    public static setHint ThreeDS2ServiceInstance() {
        setHint sethint = new setHint(setInputType.ThreeDS2Service(), Executors.newFixedThreadPool(2));
        int i = getSDKInfo + 87;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return sethint;
        }
        throw null;
    }

    private Callable<Bitmap> ThreeDS2ServiceInstance(String str) {
        int i = getSDKInfo + 79;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            if (str == null) {
                return setImeActionLabel.valueOf;
            }
            setRawInputType setrawinputtype = new setRawInputType(this, str);
            int i2 = ThreeDS2Service + 35;
            getSDKInfo = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 46 / 0;
            }
            return setrawinputtype;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r7, int r8, java.lang.Object[] r9) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
            monitor-enter(r0)
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
        L13:
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 * r2
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r5 = com.netcetera.threeds.sdk.infrastructure.setHint.values     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
            char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
            r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
            goto L13
        L2e:
            r7 = move-exception
            goto L39
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r9[r1] = r7
            return
        L39:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setHint.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }

    private Bitmap valueOf(Future<Bitmap> future) {
        ThreeDS2Service = (getSDKInfo + 7) % 128;
        try {
            if (future.isCancelled()) {
                int i = getSDKInfo + 17;
                ThreeDS2Service = i % 128;
                if (i % 2 == 0) {
                    return null;
                }
                throw null;
            }
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            InterfaceC9652ns interfaceC9652ns = this.valueOf;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance("ᗫ䲉ꝎḎ烜ꮐȓ攺\udfea㛠業쀿㫥鵞\uf402⻃膋\uf85d南뗛\ueca4䝥븤჻䯻", 22853 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), e);
            return null;
        }
    }

    private /* synthetic */ Bitmap valueOf(String str) throws Exception {
        int i = getSDKInfo + 59;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str);
            throw null;
        }
        Bitmap ThreeDS2ServiceInstance = this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str);
        getSDKInfo = (ThreeDS2Service + 43) % 128;
        return ThreeDS2ServiceInstance;
    }
}
