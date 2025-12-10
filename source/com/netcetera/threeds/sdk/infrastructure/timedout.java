package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import java.security.PublicKey;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public class timedout implements RuntimeErrorEvent {
    private static int get = 0;
    private static int initialize = 1;
    public static char[] values = {'@', Typography.section, 206, 159, 150, 192, 192, 194, 157, 158, 193, 186, 151, 147, 184, 188, 185, Typography.half, 196, 154, 148, 184, 192, 156, 148, 180, 186, 191, 152, 153, 195, 156, 148, Typography.paragraph, 186, 188, Typography.middleDot, 165};
    private final RuntimeErrorEvent ThreeDS2Service;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(timedout.class);
    private final RuntimeErrorEvent valueOf;

    public timedout(RuntimeErrorEvent runtimeErrorEvent, RuntimeErrorEvent runtimeErrorEvent2) {
        this.valueOf = runtimeErrorEvent;
        this.ThreeDS2Service = runtimeErrorEvent2;
    }

    public static RuntimeErrorEvent valueOf() {
        try {
            try {
                timedout timedoutVar = new timedout((RuntimeErrorEvent) ((Class) get3DSServerTransactionID.ThreeDS2Service(71 - Process.getGidForName(""), 60 - TextUtils.indexOf("", "", 0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getDeclaredConstructor(null).newInstance(null), (RuntimeErrorEvent) ((Class) get3DSServerTransactionID.ThreeDS2Service(324 - TextUtils.indexOf((CharSequence) "", '0'), 62 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32851))).getMethod("ThreeDS2Service", null).invoke(null, null));
                initialize = (get + 1) % 128;
                return timedoutVar;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th3;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.RuntimeErrorEvent
    public PublicKey get(String str) throws setId {
        PublicKey valueOf = valueOf(this.valueOf, str);
        if (valueOf != null) {
            int i = get + 59;
            initialize = i % 128;
            if (i % 2 != 0) {
                return valueOf;
            }
            throw null;
        }
        PublicKey valueOf2 = valueOf(this.ThreeDS2Service, str);
        if (valueOf2 != null) {
            int i2 = get + 35;
            initialize = i2 % 128;
            if (i2 % 2 != 0) {
                return valueOf2;
            }
            throw null;
        }
        throw setForegroundGravity.SDKRuntimeException.valueOf(str);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.RuntimeErrorEvent
    public CertificateInfo.CertificateType valueOf(String str) throws setId {
        int i = get + 25;
        initialize = i % 128;
        try {
            if (i % 2 != 0) {
                return this.valueOf.valueOf(str);
            }
            this.valueOf.valueOf(str);
            throw null;
        } catch (setId unused) {
            return this.ThreeDS2Service.valueOf(str);
        }
    }

    private PublicKey valueOf(RuntimeErrorEvent runtimeErrorEvent, String str) {
        PublicKey publicKey;
        int i = get + 93;
        initialize = i % 128;
        try {
            if (i % 2 == 0) {
                publicKey = runtimeErrorEvent.get(str);
                int i2 = 43 / 0;
            } else {
                publicKey = runtimeErrorEvent.get(str);
            }
            get = (initialize + 73) % 128;
            return publicKey;
        } catch (setId unused) {
            return null;
        }
    }
}
