package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatDelegate;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode;
import java.security.KeyPair;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ii */
/* loaded from: classes5.dex */
class C9469ii {
    private static int createTransaction = 1;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private final Object ThreeDS2ServiceInstance$6c1d3353;
    private final InterfaceC9390fy cleanup;
    private final setHyphenationFrequency get;
    private final InterfaceC9577me<Activity> getSDKInfo;
    private final String getWarnings;
    private final setIndeterminateTintMode.ThreeDS2Service initialize;
    private final KeyPair valueOf;
    private final InterfaceC9504js values;

    public C9469ii(setHyphenationFrequency sethyphenationfrequency, KeyPair keyPair, InterfaceC9504js interfaceC9504js, String str, Object obj, String str2, InterfaceC9390fy interfaceC9390fy, InterfaceC9577me<Activity> interfaceC9577me, setIndeterminateTintMode.ThreeDS2Service threeDS2Service) {
        this.get = sethyphenationfrequency;
        this.valueOf = keyPair;
        this.values = interfaceC9504js;
        this.ThreeDS2Service = str;
        this.ThreeDS2ServiceInstance$6c1d3353 = obj;
        this.getWarnings = str2;
        this.cleanup = interfaceC9390fy;
        this.getSDKInfo = interfaceC9577me;
        this.initialize = threeDS2Service;
    }

    public static C9469ii values(setHyphenationFrequency sethyphenationfrequency, KeyPair keyPair, InterfaceC9504js interfaceC9504js, String str, String str2, InterfaceC9390fy interfaceC9390fy, setIndeterminateTintMode.ThreeDS2Service threeDS2Service) {
        try {
            C9469ii c9469ii = new C9469ii(sethyphenationfrequency, keyPair, interfaceC9504js, str, ((Class) get3DSServerTransactionID.ThreeDS2Service(View.MeasureSpec.makeMeasureSpec(0, 0) + 910, 70 - TextUtils.getTrimmedLength(""), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 19208))).getMethod("get", null).invoke(null, null), str2, interfaceC9390fy, C9576md.values(), threeDS2Service);
            int i = getSDKVersion;
            int i2 = ((i | 51) << 1) - (i ^ 51);
            createTransaction = i2 % 128;
            if (i2 % 2 != 0) {
                return c9469ii;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public setLineBreakStyle values(Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver challengeStatusReceiver, int i, com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView, C9602nb c9602nb, InterfaceC9488jc interfaceC9488jc, InterfaceC9487jb interfaceC9487jb) throws setId {
        setBreakStrategy ThreeDS2Service = this.get.ThreeDS2Service(challengeParameters.getAcsSignedContent());
        setFastScrollEnabled.valueOf ThreeDS2Service2 = this.cleanup.ThreeDS2Service();
        setHighlightColor sethighlightcolor = new setHighlightColor(challengeParameters, ThreeDS2Service, ThreeDS2Service2, this.valueOf, 0, this.ThreeDS2Service);
        try {
            try {
                setLineBreakStyle setlinebreakstyle = (setLineBreakStyle) ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 49 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31083))).getDeclaredConstructor(setShowSoftInputOnFocus.class, setTransitionGroup.class, C9482iw.class, C9284cb.class, setMinLines.class, C9468ih.class).newInstance(setShowSoftInputOnFocus.ThreeDS2Service(challengeStatusReceiver, sethighlightcolor.cleanup(), ThreeDS2Service2), ((Class) get3DSServerTransactionID.ThreeDS2Service(910 - Color.green(0), 70 - Color.red(0), (char) (19208 - (ViewConfiguration.getKeyRepeatDelay() >> 16)))).getMethod("get", setHighlightColor.class, String.class, InterfaceC9390fy.class, C9602nb.class, InterfaceC9487jb.class, setIndeterminateTintMode.ThreeDS2Service.class).invoke(this.ThreeDS2ServiceInstance$6c1d3353, sethighlightcolor, this.getWarnings, this.cleanup, c9602nb, interfaceC9487jb, this.initialize), C9482iw.get(sethighlightcolor, this.cleanup, interfaceC9488jc), new C9284cb(this.values, activity, new setWidth(sethighlightcolor.getSDKVersion()), this.cleanup, progressView, this.getSDKInfo), setMinLines.ThreeDS2Service(i), new C9468ih());
                createTransaction = ((-2) - (~(getSDKVersion + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR))) % 128;
                return setlinebreakstyle;
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
}