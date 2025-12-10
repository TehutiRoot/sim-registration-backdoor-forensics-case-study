package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setScrollCaptureCallback implements setActivated {
    private static int valueOf = 1;
    private static int values;
    private final setPaddingRelative ThreeDS2ServiceInstance;
    private final InterfaceC9641ns get = C9642nt.ThreeDS2ServiceInstance(setScrollCaptureCallback.class);

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback$3 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97383 {
        private static int ThreeDS2Service = 1;
        private static int ThreeDS2ServiceInstance;
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[setForegroundGravity.values().length];
            valueOf = iArr;
            try {
                iArr[setForegroundGravity.getParamValue.ordinal()] = 1;
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 121;
                int i3 = -(-((i ^ 121) | i2));
                ThreeDS2Service = ((i2 & i3) + (i3 | i2)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[setForegroundGravity.configureScheme.ordinal()] = 2;
                int i4 = ThreeDS2Service;
                int i5 = i4 & 73;
                int i6 = (i4 | 73) & (~i5);
                int i7 = -(-(i5 << 1));
                ThreeDS2ServiceInstance = ((i6 & i7) + (i6 | i7)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[setForegroundGravity.addParam.ordinal()] = 3;
                int i8 = ThreeDS2Service;
                ThreeDS2ServiceInstance = (((i8 | 37) << 1) - (i8 ^ 37)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[setForegroundGravity.removeParam.ordinal()] = 4;
                int i9 = ThreeDS2ServiceInstance;
                ThreeDS2Service = ((i9 & 69) + (i9 | 69)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[setForegroundGravity.ConfigurationBuilder.ordinal()] = 5;
                int i10 = ThreeDS2Service;
                int i11 = (i10 | 59) << 1;
                int i12 = -(((~i10) & 59) | (i10 & (-60)));
                ThreeDS2ServiceInstance = ((i11 & i12) + (i11 | i12)) % 128;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                valueOf[setForegroundGravity.apiKey.ordinal()] = 6;
                ThreeDS2ServiceInstance = (ThreeDS2Service + 81) % 128;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                valueOf[setForegroundGravity.rootPublicKeyFromAssetCertificate.ordinal()] = 7;
                ThreeDS2Service = (ThreeDS2ServiceInstance + 113) % 128;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                valueOf[setForegroundGravity.rootPublicKey.ordinal()] = 8;
                int i13 = ThreeDS2ServiceInstance;
                int i14 = i13 & 99;
                int i15 = (i13 ^ 99) | i14;
                ThreeDS2Service = ((i14 & i15) + (i15 | i14)) % 128;
            } catch (NoSuchFieldError unused8) {
            }
            int i16 = ThreeDS2Service;
            int i17 = i16 & 59;
            int i18 = i16 | 59;
            int i19 = (i17 & i18) + (i18 | i17);
            ThreeDS2ServiceInstance = i19 % 128;
            if (i19 % 2 == 0) {
                return;
            }
            throw null;
        }
    }

    public setScrollCaptureCallback(setPaddingRelative setpaddingrelative) {
        this.ThreeDS2ServiceInstance = setpaddingrelative;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d A[PHI: r1 
      PHI: (r1v9 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0054, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[PHI: r1 
      PHI: (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0054, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[PHI: r1 
      PHI: (r1v7 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0054, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[PHI: r1 
      PHI: (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0054, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.netcetera.threeds.sdk.infrastructure.setActivated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setId r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values
            r2 = r1 ^ 39
            r1 = r1 & 39
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r1 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = r1
            int r2 = r2 % 2
            if (r2 != 0) goto L35
            com.netcetera.threeds.sdk.infrastructure.setPaddingRelative r1 = r5.ThreeDS2ServiceInstance
            java.lang.String r1 = r1.get(r6)
            com.netcetera.threeds.sdk.infrastructure.ns r2 = r5.get
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Throwable r4 = r6.getCause()
            r3[r0] = r4
            r2.ThreeDS2Service(r1, r3)
            int[] r0 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.C97383.valueOf
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r2 = r6.ThreeDS2Service()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L81;
                case 2: goto L81;
                case 3: goto L81;
                case 4: goto L81;
                case 5: goto L81;
                case 6: goto L81;
                case 7: goto L77;
                case 8: goto L6d;
                default: goto L34;
            }
        L34:
            goto L57
        L35:
            com.netcetera.threeds.sdk.infrastructure.setPaddingRelative r1 = r5.ThreeDS2ServiceInstance
            java.lang.String r1 = r1.get(r6)
            com.netcetera.threeds.sdk.infrastructure.ns r2 = r5.get
            java.lang.Throwable r4 = r6.getCause()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r2.ThreeDS2Service(r1, r3)
            int[] r0 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.C97383.valueOf
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r2 = r6.ThreeDS2Service()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L81;
                case 2: goto L81;
                case 3: goto L81;
                case 4: goto L81;
                case 5: goto L81;
                case 6: goto L81;
                case 7: goto L77;
                case 8: goto L6d;
                default: goto L57;
            }
        L57:
            com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException r0 = new com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r2 = r6.ThreeDS2Service()
            int r2 = r2.get()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r1, r2, r6)
            throw r0
        L6d:
            com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException r0 = new com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r1, r6)
            throw r0
        L77:
            com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException r0 = new com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r1, r6)
            throw r0
        L81:
            com.netcetera.threeds.sdk.api.exceptions.InvalidInputException r0 = new com.netcetera.threeds.sdk.api.exceptions.InvalidInputException
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setId):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if ((!(r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException)) == true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if ((r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values = (r2 + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if ((!(r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException)) != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if ((!(r6 instanceof com.netcetera.threeds.sdk.infrastructure.setId)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.get.valueOf(r6));
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = (com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values + 65) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        r1 = ((r2 ^ 39) - (~((r2 & 39) << 1))) - 1;
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        ThreeDS2Service((com.netcetera.threeds.sdk.infrastructure.setId) r6);
        r6 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        ThreeDS2Service((com.netcetera.threeds.sdk.infrastructure.setId) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values;
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = ((((r6 & (-98)) | ((~r6) & 97)) - (~((r6 & 97) << 1))) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        return;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setActivated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ThreeDS2Service(java.lang.Throwable r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values
            r2 = r1 ^ 76
            r1 = r1 & 76
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r2 = r2 - r3
            int r1 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = r1
            int r2 = r2 % 2
            if (r2 == 0) goto L93
            boolean r2 = r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException
            if (r2 != 0) goto L90
            int r1 = r1 + 25
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values = r1
            boolean r2 = r6 instanceof com.netcetera.threeds.sdk.api.exceptions.InvalidInputException
            r2 = r2 ^ r3
            if (r2 != r3) goto L90
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L35
            boolean r1 = r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException
            r4 = 19
            int r4 = r4 / r0
            r1 = r1 ^ r3
            if (r1 != r3) goto L90
            goto L39
        L35:
            boolean r1 = r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException
            if (r1 != 0) goto L90
        L39:
            int r1 = r2 + 119
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values = r1
            boolean r1 = r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException
            r1 = r1 ^ r3
            if (r1 != r3) goto L90
            boolean r1 = r6 instanceof com.netcetera.threeds.sdk.infrastructure.setId
            r1 = r1 ^ r3
            if (r1 == 0) goto L5f
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r1 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.get
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r0] = r6
            com.netcetera.threeds.sdk.infrastructure.setId r6 = r1.valueOf(r2)
            r5.ThreeDS2Service(r6)
            int r6 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values
            int r6 = r6 + 65
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = r6
            goto L7d
        L5f:
            r1 = r2 ^ 39
            r2 = r2 & 39
            int r2 = r2 << r3
            int r2 = ~r2
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L78
            com.netcetera.threeds.sdk.infrastructure.setId r6 = (com.netcetera.threeds.sdk.infrastructure.setId) r6
            r5.ThreeDS2Service(r6)
            r6 = 58
            int r6 = r6 / r0
            goto L7d
        L78:
            com.netcetera.threeds.sdk.infrastructure.setId r6 = (com.netcetera.threeds.sdk.infrastructure.setId) r6
            r5.ThreeDS2Service(r6)
        L7d:
            int r6 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.values
            r0 = r6 & (-98)
            int r1 = ~r6
            r1 = r1 & 97
            r0 = r0 | r1
            r6 = r6 & 97
            int r6 = r6 << r3
            int r6 = ~r6
            int r0 = r0 - r6
            int r0 = r0 - r3
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.valueOf = r0
            return
        L90:
            java.lang.RuntimeException r6 = (java.lang.RuntimeException) r6
            throw r6
        L93:
            boolean r6 = r6 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.ThreeDS2Service(java.lang.Throwable):void");
    }
}