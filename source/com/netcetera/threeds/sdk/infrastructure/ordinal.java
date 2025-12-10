package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.netcetera.threeds.sdk.infrastructure.setId;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public class ordinal {
    public static int ThreeDS2Service = 50;
    public static int ThreeDS2ServiceInstance = -1434813568;
    private static int cleanup = 1;
    public static int get = -1363138110;
    private static int getWarnings;
    public static short[] valueOf;
    public static byte[] values = {-30, -26, -57, 1, 13, -15, 15, -8, 12, ByteSourceJsonBootstrapper.UTF8_BOM_1, 17, -15, 80, PSSSigner.TRAILER_IMPLICIT, -5, -3, 11, -21, 8, 37, -19, -26, -52, -1, 6, -11, 19, -3, -5, -3, 11, -21, 86, -71, -7, 5, -3, 3, 8, -5, 70, -82, 3, 9, 70, -78, -1, -4, 18, -4, 19, -48, -12, -38, ByteSourceJsonBootstrapper.UTF8_BOM_2, 78, 5, -14, ByteSourceJsonBootstrapper.UTF8_BOM_2, 78, 5, -61, -22, 78, -54, -43, 2, -2, 2, -7, 7, -4};

    private String ThreeDS2Service(setForegroundGravity setforegroundgravity, Map<setForegroundGravity, List<setMenuCallbacks>> map) {
        if (map.containsKey(setforegroundgravity)) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            ThreeDS2Service((byte) (ViewConfiguration.getLongPressTimeout() >> 16), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') + 1434813569, (-51) - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1363138183, objArr);
            sb.append(((String) objArr[0]).intern());
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            ThreeDS2Service((byte) Color.blue(0), (short) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1434813588, (KeyEvent.getMaxKeyCode() >> 16) - 51, TextUtils.getCapsMode("", 0, 0) + 1363138192, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            cleanup = (getWarnings + 109) % 128;
            for (setMenuCallbacks setmenucallbacks : map.get(setforegroundgravity)) {
                getWarnings = (cleanup + 119) % 128;
                sb.append(setmenucallbacks.ThreeDS2Service());
                Object[] objArr3 = new Object[1];
                ThreeDS2Service((byte) (ViewConfiguration.getTapTimeout() >> 16), (short) ((-16777216) - Color.rgb(0, 0, 0)), 1434813619 - (ViewConfiguration.getScrollBarSize() >> 8), (-50) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1363138154 - ExpandableListView.getPackedPositionType(0L), objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb2.append(setmenucallbacks.get());
                Object[] objArr4 = new Object[1];
                ThreeDS2Service((byte) ExpandableListView.getPackedPositionType(0L), (short) (ViewConfiguration.getPressedStateDuration() >> 16), 1434813618 - ((byte) KeyEvent.getModifierMetaStateMask()), Color.blue(0) - 51, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1363138154, objArr4);
                sb2.append(((String) objArr4[0]).intern());
            }
            sb.delete(sb.length() - 2, sb.length());
            sb2.delete(sb2.length() - 2, sb2.length());
            Object[] objArr5 = new Object[1];
            ThreeDS2Service((byte) ExpandableListView.getPackedPositionType(0L), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), 1434813622 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) - 51, View.combineMeasuredStates(0, 0) + 1363138201, objArr5);
            String intern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            ThreeDS2Service((byte) TextUtils.getTrimmedLength(""), (short) Color.argb(0, 0, 0, 0), 1434813633 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.argb(0, 0, 0, 0) - 51, (Process.myPid() >> 22) + 1363138160, objArr6);
            return C9669om.ThreeDS2Service(String.format(intern, ((String) objArr6[0]).intern(), sb, sb2), 2048);
        }
        return "";
    }

    private void values(setForegroundGravity setforegroundgravity, Map<setForegroundGravity, List<setMenuCallbacks>> map) throws setId {
        String ThreeDS2Service2 = ThreeDS2Service(setforegroundgravity, map);
        if (C9669om.ThreeDS2ServiceInstance(ThreeDS2Service2)) {
            int i = getWarnings + 65;
            cleanup = i % 128;
            int i2 = i % 2;
            setId.get getVar = setId.get(setforegroundgravity).get(ThreeDS2Service2);
            if (i2 == 0) {
                getVar.valueOf();
                throw null;
            }
            throw getVar.valueOf();
        }
        getWarnings = (cleanup + 75) % 128;
    }

    public void ThreeDS2ServiceInstance(C9612name c9612name) throws setId {
        int i = getWarnings + 75;
        cleanup = i % 128;
        if (i % 2 != 0) {
            if (!c9612name.values()) {
                Map<setForegroundGravity, List<setMenuCallbacks>> map = c9612name.get();
                values(setForegroundGravity.getSDKTransactionID, map);
                values(setForegroundGravity.getSDKReferenceNumber, map);
                values(setForegroundGravity.Transaction, map);
                values(setForegroundGravity.getMessageVersion, map);
                values(setForegroundGravity.doChallenge, map);
                values(setForegroundGravity.useBridgingExtension, map);
                values(setForegroundGravity.getAuthenticationRequestParameters, map);
                values(setForegroundGravity.Transaction$BridgingMessageExtensionVersion, map);
                cleanup = (getWarnings + 15) % 128;
                return;
            }
            return;
        }
        c9612name.values();
        throw null;
    }

    private static void ThreeDS2Service(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        String obj;
        synchronized (createTransaction.ThreeDS2ServiceInstance) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = ThreeDS2Service;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = values;
                    if (bArr != null) {
                        i5 = (byte) (bArr[ThreeDS2ServiceInstance + i] + i4);
                    } else {
                        i5 = (short) (valueOf[ThreeDS2ServiceInstance + i] + i4);
                    }
                }
                if (i5 > 0) {
                    createTransaction.values = ((i + i5) - 2) + ThreeDS2ServiceInstance + i6;
                    char c = (char) (i3 + get);
                    createTransaction.get = c;
                    sb.append(c);
                    createTransaction.valueOf = createTransaction.get;
                    createTransaction.ThreeDS2Service = 1;
                    while (createTransaction.ThreeDS2Service < i5) {
                        byte[] bArr2 = values;
                        if (bArr2 != null) {
                            int i7 = createTransaction.values;
                            createTransaction.values = i7 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = valueOf;
                            int i8 = createTransaction.values;
                            createTransaction.values = i8 - 1;
                            createTransaction.get = (char) (createTransaction.valueOf + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb.append(createTransaction.get);
                        createTransaction.valueOf = createTransaction.get;
                        createTransaction.ThreeDS2Service++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = obj;
    }
}
