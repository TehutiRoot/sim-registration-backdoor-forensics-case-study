package com.netcetera.threeds.sdk.infrastructure;

import android.util.Range;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
abstract class setLayoutAnimationListener implements setAnimationCacheEnabled {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final setOnHierarchyChangeListener valueOf;
    private final setAlwaysDrawnWithCacheEnabled values;

    public setLayoutAnimationListener(setOnHierarchyChangeListener setonhierarchychangelistener) {
        this(setonhierarchychangelistener, new setNetworkAvailable());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> valueOf(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.valueOf(java.util.Map):java.util.Map");
    }

    public abstract setAnimationCacheEnabled ThreeDS2Service();

    public void ThreeDS2Service(HttpsURLConnection httpsURLConnection) throws IOException {
        Map<String, String> map;
        Iterator<String> it;
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | CameraActivity.REQUEST_CODE) << 1) - (((~i) & CameraActivity.REQUEST_CODE) | (i & (-124)));
        get = i2 % 128;
        if (i2 % 2 == 0) {
            httpsURLConnection.setConnectTimeout(1115);
            httpsURLConnection.setReadTimeout(3154);
            httpsURLConnection.setRequestMethod(this.valueOf.ThreeDS2ServiceInstance());
            map = this.valueOf.get();
            it = map.keySet().iterator();
        } else {
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setRequestMethod(this.valueOf.ThreeDS2ServiceInstance());
            map = this.valueOf.get();
            it = map.keySet().iterator();
        }
        int i3 = ThreeDS2ServiceInstance;
        int i4 = i3 & 9;
        get = ((((i3 ^ 9) | i4) << 1) - ((i3 | 9) & (~i4))) % 128;
        while (it.hasNext()) {
            int i5 = ThreeDS2ServiceInstance;
            int i6 = i5 & 23;
            int i7 = (i5 | 23) & (~i6);
            int i8 = i6 << 1;
            get = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
            String next = it.next();
            httpsURLConnection.setRequestProperty(next, map.get(next));
            get = (ThreeDS2ServiceInstance + 7) % 128;
        }
        int i9 = ThreeDS2ServiceInstance;
        get = ((i9 & 7) + (i9 | 7)) % 128;
    }

    public void ThreeDS2ServiceInstance(HttpsURLConnection httpsURLConnection) throws IOException {
        int i = ThreeDS2ServiceInstance;
        get = (((i ^ 87) - (~(-(-((i & 87) << 1))))) - 1) % 128;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 59;
        int i3 = (i & 59) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        int i5 = i4 % 2;
        setAnimationCacheEnabled values = values();
        if (i5 == 0) {
            int i6 = 9 / 0;
        }
        int i7 = get;
        int i8 = (((i7 | 16) << 1) - (i7 ^ 16)) - 1;
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 29 / 0;
        }
        return values;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAnimationCacheEnabled
    public setLayoutTransition get() throws setId {
        try {
            this.values.values(this.valueOf);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(this.valueOf.values()).openConnection();
            ThreeDS2Service(httpsURLConnection);
            ThreeDS2ServiceInstance(httpsURLConnection);
            setLayoutTransition values = values(httpsURLConnection);
            int i = get;
            int i2 = ((i ^ 52) + ((i & 52) << 1)) - 1;
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 64 / 0;
            }
            return values;
        } catch (MalformedURLException e) {
            throw setForegroundGravity.getSDKInfo.valueOf(this.valueOf.values(), e);
        } catch (SocketTimeoutException e2) {
            throw setForegroundGravity.getWarnings.valueOf(e2);
        } catch (SSLHandshakeException e3) {
            throw setForegroundGravity.getSDKVersion.valueOf(e3);
        } catch (IOException e4) {
            throw setForegroundGravity.initialize.valueOf(e4);
        } catch (Exception e5) {
            throw setForegroundGravity.ThreeDS2Service.valueOf(e5);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAnimationCacheEnabled
    public setAnimationCacheEnabled values() {
        int i = ThreeDS2ServiceInstance + 20;
        int i2 = (~i) + (i << 1);
        get = i2 % 128;
        int i3 = i2 % 2;
        setAnimationCacheEnabled ThreeDS2Service = ThreeDS2Service();
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return ThreeDS2Service;
    }

    public setLayoutAnimationListener(setOnHierarchyChangeListener setonhierarchychangelistener, setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled) {
        this.valueOf = setonhierarchychangelistener;
        this.values = setalwaysdrawnwithcacheenabled;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAnimationCacheEnabled
    public setOnHierarchyChangeListener ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = i & 17;
        int i3 = i2 + ((i ^ 17) | i2);
        ThreeDS2ServiceInstance = i3 % 128;
        int i4 = i3 % 2;
        setOnHierarchyChangeListener setonhierarchychangelistener = this.valueOf;
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        return setonhierarchychangelistener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        r2 = com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.ThreeDS2ServiceInstance;
        r3 = (r2 & 69) + (r2 | 69);
        com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.get = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        if ((r3 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        r2 = get(r11.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
        get(r11.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (get(r1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
        if ((!get(r1)) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        r2 = new byte[0];
        r3 = com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.get;
        r4 = r3 & 69;
        com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.ThreeDS2ServiceInstance = (r4 + ((r3 ^ 69) | r4)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.setLayoutTransition values(javax.net.ssl.HttpsURLConnection r11) throws java.io.IOException {
        /*
            r10 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.get
            r1 = r0 ^ 105(0x69, float:1.47E-43)
            r2 = r0 & 105(0x69, float:1.47E-43)
            r1 = r1 | r2
            int r1 = r1 << 1
            r2 = r0 & (-106(0xffffffffffffff96, float:NaN))
            int r0 = ~r0
            r0 = r0 & 105(0x69, float:1.47E-43)
            r0 = r0 | r2
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.ThreeDS2ServiceInstance = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 0
            if (r1 == 0) goto L2b
            r11.connect()
            int r1 = r11.getResponseCode()
            boolean r3 = r10.get(r1)
            r4 = 19
            int r4 = r4 / r2
            if (r3 == 0) goto L3a
            goto L4b
        L2b:
            r11.connect()
            int r1 = r11.getResponseCode()
            boolean r3 = r10.get(r1)
            r3 = r3 ^ 1
            if (r3 == 0) goto L4b
        L3a:
            byte[] r2 = new byte[r2]
            int r3 = com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.get
            r4 = r3 & 69
            r3 = r3 ^ 69
            r3 = r3 | r4
            int r4 = r4 + r3
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.ThreeDS2ServiceInstance = r4
        L48:
            r6 = r1
            r4 = r2
            goto L63
        L4b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.ThreeDS2ServiceInstance
            r3 = r2 & 69
            r2 = r2 | 69
            int r3 = r3 + r2
            int r2 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.get = r2
            int r3 = r3 % 2
            if (r3 == 0) goto La9
            java.io.InputStream r2 = r11.getInputStream()
            byte[] r2 = r10.get(r2)
            goto L48
        L63:
            java.io.InputStream r1 = r11.getErrorStream()
            byte[] r5 = r10.get(r1)
            java.lang.String r1 = r11.getResponseMessage()
            java.lang.String r2 = ""
            java.lang.CharSequence r1 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r1, r2)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.net.URL r1 = r11.getURL()
            java.lang.String r8 = r1.toExternalForm()
            java.util.Map r1 = r11.getHeaderFields()
            java.util.Map r9 = r10.valueOf(r1)
            r11.disconnect()
            com.netcetera.threeds.sdk.infrastructure.setCertificate r11 = new com.netcetera.threeds.sdk.infrastructure.setCertificate
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.netcetera.threeds.sdk.infrastructure.setAlwaysDrawnWithCacheEnabled r1 = r10.values
            r1.ThreeDS2ServiceInstance(r11)
            int r1 = com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.get
            r2 = r1 | 89
            int r2 = r2 << 1
            r1 = r1 ^ 89
            int r2 = r2 - r1
            int r1 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.ThreeDS2ServiceInstance = r1
            int r2 = r2 % 2
            if (r2 != 0) goto La8
            return r11
        La8:
            throw r0
        La9:
            java.io.InputStream r11 = r11.getInputStream()
            r10.get(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener.values(javax.net.ssl.HttpsURLConnection):com.netcetera.threeds.sdk.infrastructure.setLayoutTransition");
    }

    private byte[] get(InputStream inputStream) throws IOException {
        int i = get;
        int i2 = (((i | 17) << 1) - (i ^ 17)) % 128;
        ThreeDS2ServiceInstance = i2;
        if (inputStream == null) {
            int i3 = i2 ^ 109;
            int i4 = ((i2 & 109) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
            get = i6;
            byte[] bArr = new byte[0];
            int i7 = i6 & 125;
            int i8 = (~i7) & (i6 | 125);
            int i9 = -(-(i7 << 1));
            ThreeDS2ServiceInstance = ((i8 & i9) + (i9 | i8)) % 128;
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        int i10 = ThreeDS2ServiceInstance;
        int i11 = (i10 & (-42)) | ((~i10) & 41);
        int i12 = -(-((i10 & 41) << 1));
        get = ((i11 & i12) + (i12 | i11)) % 128;
        while (true) {
            int read = inputStream.read(bArr2);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i13 = ThreeDS2ServiceInstance;
                get = (((i13 & 38) + (i13 | 38)) - 1) % 128;
                return byteArray;
            }
            int i14 = ThreeDS2ServiceInstance;
            int i15 = i14 & 49;
            int i16 = (i14 | 49) & (~i15);
            int i17 = i15 << 1;
            get = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
            byteArrayOutputStream.write(bArr2, 0, read);
            int i18 = ThreeDS2ServiceInstance;
            int i19 = i18 & 55;
            int i20 = i18 | 55;
            get = ((i19 & i20) + (i20 | i19)) % 128;
        }
    }

    private boolean get(int i) {
        get = (ThreeDS2ServiceInstance + 47) % 128;
        boolean contains = Range.create(200, 299).contains((Range) Integer.valueOf(i));
        int i2 = ThreeDS2ServiceInstance;
        int i3 = (i2 & 27) + (i2 | 27);
        get = i3 % 128;
        if (i3 % 2 != 0) {
            return contains;
        }
        throw null;
    }
}
