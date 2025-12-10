package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setInputType implements setSpannableFactory {
    private static int ThreeDS2Service = 0;
    public static long get = -1013912219208469081L;
    private static int initialize = 1;
    private final InterfaceC9652ns ThreeDS2ServiceInstance = C9653nt.ThreeDS2ServiceInstance(setInputType.class);
    private final setFocusedSearchResultHighlightColor valueOf;
    private final setPersistentDrawingCache values;

    public setInputType(setPersistentDrawingCache setpersistentdrawingcache, setFocusedSearchResultHighlightColor setfocusedsearchresulthighlightcolor) {
        this.values = setpersistentdrawingcache;
        this.valueOf = setfocusedsearchresulthighlightcolor;
    }

    public static setSpannableFactory ThreeDS2Service() {
        setInitialScale valueOf = setInitialScale.valueOf();
        setInputType setinputtype = new setInputType(valueOf.ThreeDS2Service(), new setFocusedSearchResultHighlightColor());
        ThreeDS2Service = (initialize + 29) % 128;
        return setinputtype;
    }

    private byte[] get(setLayoutAnimation setlayoutanimation, String str) {
        byte[] bArr;
        int i = initialize + 17;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            ThreeDS2Service("뗩醫ﴹ\ud8a0④Έ演䪛队ﶉ\ud973ⓧn澢䭛雟\uf253\ud9d7┅ĺ沼䠸韡\uf30a\ude9a㨇Ƙ洁䣨鑦\uf3a9\udf77㫮ي淝䤌铖\uf0a8\udc3d㯲ݯ抝乘閇\uf136", 24286 >>> TextUtils.lastIndexOf("", ';'), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            objArr2[1] = str;
            Objects.requireNonNull(setlayoutanimation, String.format(intern, objArr2));
            bArr = setlayoutanimation.get();
        } else {
            Object[] objArr3 = new Object[1];
            ThreeDS2Service("뗩醫ﴹ\ud8a0④Έ演䪛队ﶉ\ud973ⓧn澢䭛雟\uf253\ud9d7┅ĺ沼䠸韡\uf30a\ude9a㨇Ƙ洁䣨鑦\uf3a9\udf77㫮ي淝䤌铖\uf0a8\udc3d㯲ݯ抝乘閇\uf136", 9336 - TextUtils.lastIndexOf("", '0'), objArr3);
            Objects.requireNonNull(setlayoutanimation, String.format(((String) objArr3[0]).intern(), str));
            bArr = setlayoutanimation.get();
        }
        initialize = (ThreeDS2Service + 55) % 128;
        return bArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSpannableFactory
    public final Bitmap ThreeDS2ServiceInstance(String str) {
        ThreeDS2Service = (initialize + 65) % 128;
        Process.getGidForName("");
        try {
            Bitmap bitmap = this.valueOf.get(get(this.values.values(str).get().ThreeDS2Service(), str));
            initialize = (ThreeDS2Service + 45) % 128;
            return bitmap;
        } catch (setId e) {
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            ThreeDS2Service("뗢ሸ﨏䈏⩡\uf226婅⊳誮劖㪌苦櫜㊎鬸挩쬖鍽筨쌞", 42988 - ExpandableListView.getPackedPositionChild(0L), objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), e);
            return null;
        } catch (Exception e2) {
            InterfaceC9652ns interfaceC9652ns2 = this.ThreeDS2ServiceInstance;
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("뗢ሸ﨏䈏⩡\uf226婅⊳誮劖㪌苦櫜㊎鬸挩쬖鍽筨쌞", Process.getGidForName("") + 42990, objArr2);
            interfaceC9652ns2.ThreeDS2Service(((String) objArr2[0]).intern(), setForegroundGravity.ChallengeParameters.valueOf(str, e2));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.setInputType.get     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setInputType.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }
}
