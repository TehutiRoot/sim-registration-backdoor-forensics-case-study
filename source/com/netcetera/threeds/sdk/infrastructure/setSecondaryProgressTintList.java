package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class setSecondaryProgressTintList implements setProgressTintBlendMode {
    public static char ThreeDS2Service = 0;
    private static int ThreeDS2Service$InitializationCallback = 0;
    public static char ThreeDS2ServiceInstance = 0;
    private static int createTransaction = 1;
    private static final String get;
    public static char valueOf;
    public static char values;
    private final setDividerDrawable ConfigParameters;
    private final setSelectionAfterHeaderView cleanup;
    private final Logger getSDKInfo = LoggerFactory.getLogger(setSecondaryProgressTintList.class);
    private final setProgressDrawable getSDKVersion;
    private final setPersistentDrawingCache getWarnings;
    private final setProgressTintList initialize;
    private final setBaselineAligned onError;

    static {
        ThreeDS2ServiceInstance();
        StringBuilder sb = new StringBuilder();
        try {
            sb.append((String) ((Class) get3DSServerTransactionID.ThreeDS2Service((ViewConfiguration.getLongPressTimeout() >> 16) + 1758, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 58, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1))).getMethod(CoreConstants.VALUE_OF, null).invoke(null, null));
            Object[] objArr = new Object[1];
            valueOf("ϑ欳\ue512ষ㊾衹暠苒杻龝书䁜쁀菡椇挭揵룕ﲽἳ", ExpandableListView.getPackedPositionChild(0L) + 20, objArr);
            sb.append(((String) objArr[0]).intern());
            get = sb.toString();
            int i = createTransaction + 21;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 56 / 0;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public setSecondaryProgressTintList(setPersistentDrawingCache setpersistentdrawingcache, setProgressTintList setprogresstintlist, setProgressDrawable setprogressdrawable, setSelectionAfterHeaderView setselectionafterheaderview, setBaselineAligned setbaselinealigned, setDividerDrawable setdividerdrawable) {
        this.getWarnings = setpersistentdrawingcache;
        this.initialize = setprogresstintlist;
        this.getSDKVersion = setprogressdrawable;
        this.cleanup = setselectionafterheaderview;
        this.onError = setbaselinealigned;
        this.ConfigParameters = setdividerdrawable;
    }

    public static void ThreeDS2ServiceInstance() {
        values = (char) 59917;
        ThreeDS2ServiceInstance = (char) 56685;
        valueOf = (char) 5907;
        ThreeDS2Service = (char) 36489;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.netcetera.threeds.sdk.infrastructure.setAnimationCacheEnabled] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.netcetera.threeds.sdk.infrastructure.setAnimationCacheEnabled] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    private void get(setAnimationCacheEnabled setanimationcacheenabled, List<setIndeterminateTintMode> list, boolean z) {
        int i = createTransaction + 23;
        ThreeDS2Service$InitializationCallback = i % 128;
        try {
            if (i % 2 != 0) {
                ViewConfiguration.getFadingEdgeLength();
                ThreeDS2ServiceInstance(setanimationcacheenabled.get());
                this.initialize.values(list);
                TypedValue.complexToFraction(0, 0.0f, 1.0f);
            } else {
                ViewConfiguration.getFadingEdgeLength();
                ThreeDS2ServiceInstance(setanimationcacheenabled.get());
                this.initialize.values(list);
                TypedValue.complexToFraction(0, 0.0f, 0.0f);
            }
            setanimationcacheenabled = (createTransaction + 111) % 128;
            ThreeDS2Service$InitializationCallback = setanimationcacheenabled;
        } catch (setId e) {
            if (z && ThreeDS2ServiceInstance(e)) {
                get(setanimationcacheenabled.values(), list, false);
                ThreeDS2Service$InitializationCallback = (createTransaction + 51) % 128;
                return;
            }
            this.initialize.valueOf(list);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public void valueOf() {
        createTransaction = (ThreeDS2Service$InitializationCallback + 89) % 128;
    }

    public static setProgressTintBlendMode ThreeDS2ServiceInstance(Context context, setProgressTintList setprogresstintlist, setSelectionAfterHeaderView setselectionafterheaderview) {
        try {
            try {
                setSecondaryProgressTintList setsecondaryprogresstintlist = new setSecondaryProgressTintList(((setLayoutMode) ((Class) get3DSServerTransactionID.ThreeDS2Service(Drawable.resolveOpacity(0, 0) + 1816, 62 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("values", null).invoke(null, null)).ThreeDS2Service(), setprogresstintlist, new setIndeterminateDrawableTiled(), setselectionafterheaderview, (setBaselineAligned) ((Class) get3DSServerTransactionID.ThreeDS2Service(ImageFormat.getBitsPerPixel(0) + 1939, 62 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (38197 - TextUtils.indexOf("", "", 0, 0)))).getMethod("values", Context.class).invoke(null, context), setDividerDrawable.ThreeDS2ServiceInstance(context));
                int i = createTransaction + 105;
                ThreeDS2Service$InitializationCallback = i % 128;
                if (i % 2 == 0) {
                    return setsecondaryprogresstintlist;
                }
                throw null;
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

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.onCompleted.valueOf
            monitor-enter(r0)
            int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
        L14:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
            if (r4 >= r5) goto L6e
            char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 1
            char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
            r4 = 58224(0xe370, float:8.1589E-41)
            r6 = 0
        L28:
            r7 = 16
            if (r6 >= r7) goto L5d
            char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            int r9 = r8 + r4
            int r10 = r8 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.valueOf     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.values     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r7 = r7 + r10
            r7 = r7 ^ r9
            int r8 = r8 - r7
            char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
            r7 = 40503(0x9e37, float:5.6757E-41)
            int r4 = r4 - r7
            int r6 = r6 + 1
            goto L28
        L5b:
            r12 = move-exception
            goto L77
        L5d:
            int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r4 + 1
            char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 2
            com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r4     // Catch: java.lang.Throwable -> L5b
            goto L14
        L6e:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r14[r2] = r12
            return
        L77:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.valueOf(java.lang.String, int, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public void ThreeDS2ServiceInstance(String str) {
        int i = ThreeDS2Service$InitializationCallback + 99;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            List<setIndeterminateTintMode> valueOf2 = this.initialize.valueOf();
            if (valueOf2.isEmpty() || this.cleanup.ThreeDS2ServiceInstance()) {
                return;
            }
            ThreeDS2Service$InitializationCallback = (createTransaction + 7) % 128;
            if (this.onError.valueOf(str).get().booleanValue()) {
                int i2 = createTransaction + 73;
                ThreeDS2Service$InitializationCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    get(ThreeDS2ServiceInstance(valueOf2), valueOf2, false);
                    return;
                } else {
                    get(ThreeDS2ServiceInstance(valueOf2), valueOf2, true);
                    return;
                }
            }
            this.initialize.values(valueOf2);
            return;
        }
        this.initialize.valueOf().isEmpty();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public void ThreeDS2ServiceInstance(setIndeterminateTintMode setindeterminatetintmode) {
        ThreeDS2Service$InitializationCallback = (createTransaction + 73) % 128;
        if (this.onError.valueOf(setindeterminatetintmode.valueOf()).get().booleanValue()) {
            List<setIndeterminateTintMode> singletonList = Collections.singletonList(setindeterminatetintmode);
            if (this.cleanup.ThreeDS2ServiceInstance()) {
                int i = createTransaction + 13;
                ThreeDS2Service$InitializationCallback = i % 128;
                if (i % 2 == 0) {
                    this.initialize.valueOf(singletonList);
                    return;
                } else {
                    this.initialize.valueOf(singletonList);
                    throw null;
                }
            }
            get(ThreeDS2ServiceInstance(singletonList), singletonList, true);
            createTransaction = (ThreeDS2Service$InitializationCallback + 23) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.setFindListener.ThreeDS2ServiceInstance.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(r5.valueOf())) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2Service$InitializationCallback = (com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.createTransaction + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
        throw com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.cleanup.valueOf(java.lang.Integer.valueOf(r5.valueOf()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
        throw com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.ConfigParameters.valueOf(java.lang.Integer.valueOf(r5.valueOf()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.setFindListener.ThreeDS2ServiceInstance.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(r5.valueOf())) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setLayoutTransition r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            int r2 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.createTransaction
            int r2 = r2 + 109
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2Service$InitializationCallback = r2
            boolean r2 = r5.values()
            if (r2 != 0) goto L6e
            int r2 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.createTransaction
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2Service$InitializationCallback = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L30
            android.util.Range<java.lang.Integer> r2 = com.netcetera.threeds.sdk.infrastructure.setFindListener.ThreeDS2ServiceInstance
            int r3 = r5.valueOf()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            r3 = 77
            int r3 = r3 / r1
            if (r2 == 0) goto L5b
            goto L40
        L30:
            android.util.Range<java.lang.Integer> r2 = com.netcetera.threeds.sdk.infrastructure.setFindListener.ThreeDS2ServiceInstance
            int r3 = r5.valueOf()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L5b
        L40:
            int r2 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.createTransaction
            int r2 = r2 + 109
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2Service$InitializationCallback = r2
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r2 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.cleanup
            int r5 = r5.valueOf()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            com.netcetera.threeds.sdk.infrastructure.setId r5 = r2.valueOf(r0)
            throw r5
        L5b:
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r2 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.ConfigParameters
            int r5 = r5.valueOf()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            com.netcetera.threeds.sdk.infrastructure.setId r5 = r2.valueOf(r0)
            throw r5
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSecondaryProgressTintList.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.setLayoutTransition):void");
    }

    private setAnimationCacheEnabled ThreeDS2ServiceInstance(List<setIndeterminateTintMode> list) {
        createTransaction = (ThreeDS2Service$InitializationCallback + 117) % 128;
        String str = this.getSDKVersion.get(list);
        setPersistentDrawingCache setpersistentdrawingcache = this.getWarnings;
        String str2 = get;
        Object[] objArr = new Object[1];
        valueOf("鸎⭁듩\ue608Ƹෝ腛\ud834ⲳ걚뗙ㆸ뺪슇鐐ㄑ", View.getDefaultSize(0, 0) + 16, objArr);
        setAnimationCacheEnabled values2 = setpersistentdrawingcache.values(str2, str, ((String) objArr[0]).intern(), this.ConfigParameters.get());
        int i = createTransaction + 75;
        ThreeDS2Service$InitializationCallback = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private boolean ThreeDS2ServiceInstance(setId setid) {
        int i = ThreeDS2Service$InitializationCallback + 89;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            if (setid.ThreeDS2Service() == setForegroundGravity.getWarnings || setid.ThreeDS2Service() == setForegroundGravity.cleanup) {
                return true;
            }
            createTransaction = (ThreeDS2Service$InitializationCallback + 49) % 128;
            return false;
        }
        setid.ThreeDS2Service();
        setForegroundGravity setforegroundgravity = setForegroundGravity.get;
        throw null;
    }
}
