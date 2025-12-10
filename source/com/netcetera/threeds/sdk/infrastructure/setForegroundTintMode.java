package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes5.dex */
public final class setForegroundTintMode implements setTextFontName {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;

    private boolean ThreeDS2ServiceInstance(Key key) {
        int i = ThreeDS2Service;
        int i2 = (i & (-98)) | ((~i) & 97);
        int i3 = (i & 97) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        valueOf = i5;
        boolean z = key instanceof RSAPublicKey;
        if (i4 % 2 != 0) {
            int i6 = (i5 & 84) + (i5 | 84);
            ThreeDS2Service = ((~i6) + (i6 << 1)) % 128;
            return z;
        }
        throw null;
    }

    private boolean valueOf(Key key) {
        int i = ThreeDS2Service;
        int i2 = i ^ 19;
        int i3 = (i & 19) << 1;
        valueOf = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        boolean z = key instanceof ECPublicKey;
        int i4 = ((i ^ 115) | (i & 115)) << 1;
        int i5 = -(((~i) & 115) | (i & (-116)));
        valueOf = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        return z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTextFontName
    public getTextFontName get(Key key, String str, String str2, setFastScrollEnabled.valueOf valueof) throws setId {
        int i = valueOf;
        ThreeDS2Service = (((i | 63) << 1) - (i ^ 63)) % 128;
        if (ThreeDS2ServiceInstance(key)) {
            int i2 = ThreeDS2Service;
            int i3 = i2 & 61;
            int i4 = (i2 | 61) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            valueOf = i6 % 128;
            if (i6 % 2 != 0) {
                try {
                    return (getTextFontName) ((Class) get3DSServerTransactionID.ThreeDS2Service(838 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 73, (char) (7641 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getDeclaredMethod("values", RSAPublicKey.class, String.class, setFastScrollEnabled.valueOf.class).invoke(null, (RSAPublicKey) key, str2, valueof);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                getTextFontName gettextfontname = (getTextFontName) ((Class) get3DSServerTransactionID.ThreeDS2Service((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 837, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, (char) (7641 - View.resolveSize(0, 0)))).getMethod("values", RSAPublicKey.class, String.class, setFastScrollEnabled.valueOf.class).invoke(null, (RSAPublicKey) key, str2, valueof);
                throw null;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } else if (valueOf(key)) {
            int i7 = valueOf;
            ThreeDS2Service = (((i7 ^ 81) - (~((i7 & 81) << 1))) - 1) % 128;
            try {
                getTextFontName gettextfontname2 = (getTextFontName) ((Class) get3DSServerTransactionID.ThreeDS2Service(((byte) KeyEvent.getModifierMetaStateMask()) + 779, Gravity.getAbsoluteGravity(0, 0) + 60, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getDeclaredMethod("ThreeDS2Service", ECPublicKey.class, String.class, String.class, setFastScrollEnabled.valueOf.class).invoke(null, (ECPublicKey) key, str, str2, valueof);
                int i8 = valueOf;
                int i9 = ((i8 ^ 55) | (i8 & 55)) << 1;
                int i10 = -(((~i8) & 55) | (i8 & (-56)));
                ThreeDS2Service = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                return gettextfontname2;
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th4;
            }
        } else {
            throw setForegroundGravity.getName.valueOf(key);
        }
    }
}
