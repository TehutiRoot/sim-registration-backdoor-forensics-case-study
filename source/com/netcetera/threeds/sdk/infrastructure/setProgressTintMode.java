package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class setProgressTintMode implements setProgressTintBlendMode {
    public static int[] get = {421391613, -1659999682, 747004749, 753502440, -208663985, -493422642, -3204749, -1154051537, 1133891030, -554259588, 686929854, -52934618, 1162606445, -1724492391, -787223026, -164654542, -1497154310, 2033864528};
    private static int initialize = 1;
    private static int valueOf;
    private final ExecutorService ThreeDS2Service;
    private final Logger ThreeDS2ServiceInstance = LoggerFactory.getLogger(setProgressTintMode.class);
    private final setProgressTintBlendMode values;

    public setProgressTintMode(ExecutorService executorService, setProgressTintBlendMode setprogresstintblendmode) {
        this.ThreeDS2Service = executorService;
        this.values = setprogresstintblendmode;
    }

    public static setProgressTintBlendMode ThreeDS2Service(setProgressTintBlendMode setprogresstintblendmode) {
        setProgressTintMode setprogresstintmode = new setProgressTintMode(Executors.newSingleThreadExecutor(), setprogresstintblendmode);
        int i = initialize + 115;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return setprogresstintmode;
        }
        throw null;
    }

    public static /* synthetic */ Void ThreeDS2ServiceInstance(setProgressTintMode setprogresstintmode) {
        int i = valueOf + 19;
        initialize = i % 128;
        int i2 = i % 2;
        Void ThreeDS2Service = setprogresstintmode.ThreeDS2Service();
        if (i2 == 0) {
            int i3 = 48 / 0;
        }
        return ThreeDS2Service;
    }

    private /* synthetic */ Void get(String str) throws Exception {
        int i = valueOf + 1;
        initialize = i % 128;
        if (i % 2 != 0) {
            this.values.ThreeDS2ServiceInstance(str);
            return null;
        }
        this.values.ThreeDS2ServiceInstance(str);
        throw null;
    }

    private /* synthetic */ Void valueOf(setIndeterminateTintMode setindeterminatetintmode) throws Exception {
        valueOf = (initialize + 73) % 128;
        this.values.ThreeDS2ServiceInstance(setindeterminatetintmode);
        valueOf = (initialize + 49) % 128;
        return null;
    }

    public static /* synthetic */ Void values(setProgressTintMode setprogresstintmode, setIndeterminateTintMode setindeterminatetintmode) {
        valueOf = (initialize + 41) % 128;
        Void valueOf2 = setprogresstintmode.valueOf(setindeterminatetintmode);
        int i = valueOf + 103;
        initialize = i % 128;
        if (i % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    public static /* synthetic */ Void values(setProgressTintMode setprogresstintmode, String str) {
        int i = initialize + 83;
        valueOf = i % 128;
        if (i % 2 != 0) {
            setprogresstintmode.get(str);
            throw null;
        }
        Void r2 = setprogresstintmode.get(str);
        valueOf = (initialize + 79) % 128;
        return r2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public void ThreeDS2ServiceInstance(String str) {
        try {
            this.ThreeDS2Service.submit(new setProgressBackgroundTintMode(this, str));
            initialize = (valueOf + 9) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            get(new int[]{-654487376, -36557991, 1991555746, 1616661613, -1925085930, -738438498, 1494208193, -1927392145, 62478724, 874206579, 1651326871, -1340789379, -162326741, 599574694, 1703826002, -629181567, -1581823925, 102594807, -2034041248, -1572756175, 849564610, 1585887976, 1734236044, -232192589, -1721106676, 881086121}, TextUtils.getTrimmedLength("") + 50, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
    }

    private /* synthetic */ Void ThreeDS2Service() throws Exception {
        int i = valueOf + 69;
        initialize = i % 128;
        if (i % 2 == 0) {
            this.values.valueOf();
            int i2 = 54 / 0;
        } else {
            this.values.valueOf();
        }
        int i3 = valueOf + 105;
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public void valueOf() {
        try {
            this.ThreeDS2Service.submit(new setSecondaryProgressTintBlendMode(this));
            valueOf = (initialize + 77) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            get(new int[]{-654487376, -36557991, 1991555746, 1616661613, -1925085930, -738438498, 1494208193, -1927392145, 62478724, 874206579, 1651326871, -1340789379, -162326741, 599574694, 1703826002, -629181567, -1581823925, 102594807, -2034041248, -1572756175, 849564610, 1585887976, 1734236044, -232192589, -1721106676, 881086121}, (KeyEvent.getMaxKeyCode() >> 16) + 50, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
        this.ThreeDS2Service.shutdown();
    }

    private static void get(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) get.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public void ThreeDS2ServiceInstance(setIndeterminateTintMode setindeterminatetintmode) {
        try {
            this.ThreeDS2Service.submit(new setProgressBackgroundTintList(this, setindeterminatetintmode));
            initialize = (valueOf + 71) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            get(new int[]{-654487376, -36557991, 1991555746, 1616661613, -1925085930, -738438498, 1494208193, -1927392145, 62478724, 874206579, 1651326871, -1340789379, -162326741, 599574694, 1703826002, -629181567, -1581823925, 102594807, -2034041248, -1572756175, 849564610, 1585887976, 1734236044, -232192589, -1721106676, 881086121}, TextUtils.indexOf("", "", 0, 0) + 50, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
        initialize = (valueOf + 77) % 128;
    }
}
