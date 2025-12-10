package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode;

/* loaded from: classes5.dex */
public class getView {
    public static int ThreeDS2Service = 116;
    private static int getSDKVersion = 1;
    private static int initialize;
    private final setCollapseContentDescription ThreeDS2ServiceInstance;
    private final setCollapsible cleanup;
    private final findFragmentByTag get;
    private final ordinal getWarnings;
    private final findFragmentById valueOf;
    private final setImeOptions values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.getView$5 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C94235 {
        private static int ThreeDS2ServiceInstance = 0;
        private static int get = 1;
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[keySet.values().length];
            valueOf = iArr;
            try {
                iArr[keySet.ThreeDS2ServiceInstance.ordinal()] = 1;
                get = (ThreeDS2ServiceInstance + 15) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[keySet.ThreeDS2Service.ordinal()] = 2;
                ThreeDS2ServiceInstance = (get + 111) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i = ThreeDS2ServiceInstance;
            int i2 = i & 29;
            int i3 = ((i ^ 29) | i2) << 1;
            int i4 = -((i | 29) & (~i2));
            int i5 = (i3 & i4) + (i3 | i4);
            get = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            throw null;
        }
    }

    public getView(findFragmentById findfragmentbyid, findFragmentByTag findfragmentbytag, setImeOptions setimeoptions, setCollapseContentDescription setcollapsecontentdescription, ordinal ordinalVar, setCollapsible setcollapsible) {
        this.valueOf = findfragmentbyid;
        this.get = findfragmentbytag;
        this.values = setimeoptions;
        this.ThreeDS2ServiceInstance = setcollapsecontentdescription;
        this.getWarnings = ordinalVar;
        this.cleanup = setcollapsible;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r7) goto L31
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r9
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.getView.ThreeDS2Service     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r6 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r7) goto L5f
            int r9 = r7 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r6
        L60:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r11[r2] = r6
            return
        L69:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getView.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public static getView values(setHighlightColor sethighlightcolor, InterfaceC9401fy interfaceC9401fy, setHighlights sethighlights, C9613nb c9613nb, InterfaceC9498jb interfaceC9498jb, setIndeterminateTintMode.ThreeDS2Service threeDS2Service) {
        equals equalsVar = interfaceC9401fy.get(c9613nb, sethighlightcolor);
        getView getview = new getView(new findFragmentById(equalsVar, c9613nb), new findFragmentByTag(equalsVar, c9613nb), setImeOptions.ThreeDS2Service(interfaceC9401fy), interfaceC9401fy.valueOf(interfaceC9498jb), new ordinal(), new setCollapsible(sethighlights, c9613nb, threeDS2Service));
        getSDKVersion = (initialize + 105) % 128;
        return getview;
    }

    public void values(String str, setEditableFactory seteditablefactory) {
        try {
            setTitleMarginBottom valueOf = this.cleanup.valueOf(str);
            this.getWarnings.ThreeDS2ServiceInstance(this.valueOf.values(valueOf.ThreeDS2ServiceInstance()));
            setTitleTextColor settitletextcolor = this.ThreeDS2ServiceInstance.get(this.get.values(valueOf.ThreeDS2ServiceInstance()));
            int i = C94235.valueOf[settitletextcolor.get().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                seteditablefactory.valueOf(settitletextcolor);
            } else if (valueOf.get()) {
                if (settitletextcolor.cleanup() == getSuppressed.ThreeDS2Service) {
                    int i2 = initialize + 95;
                    getSDKVersion = i2 % 128;
                    if (i2 % 2 != 0) {
                        seteditablefactory.ThreeDS2Service(settitletextcolor);
                    } else {
                        seteditablefactory.ThreeDS2Service(settitletextcolor);
                        throw null;
                    }
                }
                if (settitletextcolor.cleanup() == getSuppressed.values) {
                    initialize = (getSDKVersion + 79) % 128;
                    seteditablefactory.values(this.values.ThreeDS2Service(settitletextcolor));
                }
            } else {
                setForegroundGravity setforegroundgravity = setForegroundGravity.getSDKTransactionID;
                Object[] objArr = new Object[1];
                valueOf(1 - (Process.myTid() >> 22), 4 - ExpandableListView.getPackedPositionType(0L), "\u0018￨\ufff7\n", 207 - (ViewConfiguration.getLongPressTimeout() >> 16), false, objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                valueOf(3 - TextUtils.indexOf((CharSequence) "", '0'), 28 - TextUtils.indexOf("", "", 0, 0), "\u0011\u000f\u0011\ufffeￚ\ufff1\u0003\ufff6ￌ\rￌ \u001b\u001aￌ\u001f\r#ￌ\u001f\u0011\ufffe\uffefￌ\u0010\u0011\"\u0015", 200 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, objArr2);
                throw new setMenuCallbacks(setforegroundgravity, intern, ((String) objArr2[0]).intern()).values();
            }
        } catch (setId e) {
            seteditablefactory.get(e);
        }
    }
}
