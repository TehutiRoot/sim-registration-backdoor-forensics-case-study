package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2ServiceInstance uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class clear implements printStackTrace {
    public static long ThreeDS2Service = 0;
    public static final clear ThreeDS2ServiceInstance;
    public static final clear get;
    private static final /* synthetic */ clear[] getSDKInfo;
    private static int getWarnings = 0;
    private static int initialize = 1;
    public static char[] values;
    private final String valueOf;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        ThreeDS2Service((char) Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror('0') - '0', (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr2);
        clear clearVar = new clear(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2ServiceInstance = clearVar;
        Object[] objArr3 = new Object[1];
        ThreeDS2Service((char) Color.blue(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2Service((char) Drawable.resolveOpacity(0, 0), 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr4);
        clear clearVar2 = new clear(intern2, 1, ((String) objArr4[0]).intern());
        get = clearVar2;
        getSDKInfo = new clear[]{clearVar, clearVar2};
        int i = getWarnings + 91;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    private clear(String str, int i, String str2) {
        this.valueOf = str2;
    }

    public static void valueOf() {
        values = new char[]{'Y', 'N'};
        ThreeDS2Service = -4428003640980257798L;
    }

    public static clear[] values() {
        int i = initialize + 51;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            clear[] clearVarArr = (clear[]) getSDKInfo.clone();
            getWarnings = (initialize + 7) % 128;
            return clearVarArr;
        }
        getSDKInfo.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = getWarnings + 75;
        initialize = i % 128;
        if (i % 2 == 0) {
            int i2 = 64 / 0;
            return this.valueOf;
        }
        return this.valueOf;
    }

    private static void ThreeDS2Service(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((values[i + i3] ^ (i3 * ThreeDS2Service)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    public static clear valueOf(String str) {
        getWarnings = (initialize + 87) % 128;
        clear clearVar = (clear) Enum.valueOf(clear.class, str);
        initialize = (getWarnings + 93) % 128;
        return clearVar;
    }
}
