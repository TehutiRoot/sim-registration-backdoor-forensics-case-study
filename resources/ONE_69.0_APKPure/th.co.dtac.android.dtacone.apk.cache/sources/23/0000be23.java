package com.netcetera.threeds.sdk.infrastructure;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes5.dex */
public class setEmptyView {
    public static int SchemeConfiguration$Builder = 0;
    public static int encryptionPublicKey = 0;
    private static int encryptionPublicKeyFromAssetCertificate = 0;
    public static byte[] getSchemeEncryptionPublicKey = null;
    public static byte[] getSchemePublicRootKeys = null;
    private static Object ids = null;
    public static final byte[] logo = null;
    private static Object logoDark = null;
    private static int rootPublicKey = 1;
    public static final int rootPublicKeyFromAssetCertificate = 0;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        r5 = r4;
        r4 = r3;
        r3 = r1;
        r1 = r10;
        r10 = r9;
        r9 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:10:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, int r10) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.setEmptyView.rootPublicKey
            r1 = r0 | 93
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 93
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setEmptyView.encryptionPublicKeyFromAssetCertificate = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 == 0) goto L2b
            r1 = r10 & 24
            r10 = r10 | 24
            int r1 = r1 + r10
            byte[] r10 = com.netcetera.threeds.sdk.infrastructure.setEmptyView.logo
            r3 = r9 & 76
            r9 = r9 | 76
            int r3 = r3 + r9
            r9 = r3 & 25
            r3 = r3 | 25
            int r9 = r9 + r3
            int r8 = 96 - r8
            byte[] r3 = new byte[r8]
            r4 = 1
            if (r10 != 0) goto L45
            goto L3e
        L2b:
            r1 = r10 & 4
            r10 = r10 | 4
            int r1 = r1 + r10
            byte[] r10 = com.netcetera.threeds.sdk.infrastructure.setEmptyView.logo
            r3 = r9 & 41
            r9 = r9 | 41
            int r9 = r9 + r3
            int r8 = 69 - r8
            byte[] r3 = new byte[r8]
            r4 = 0
            if (r10 != 0) goto L45
        L3e:
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r10
            r10 = r9
            r9 = r8
            goto L60
        L45:
            r5 = r4 & 107(0x6b, float:1.5E-43)
            r6 = r4 | 107(0x6b, float:1.5E-43)
            int r5 = r5 + r6
            int r5 = r5 + (-106)
            byte r6 = (byte) r9
            r3[r4] = r6
            if (r5 != r8) goto L57
            java.lang.String r8 = new java.lang.String
            r8.<init>(r3, r0)
            return r8
        L57:
            r4 = r10[r1]
            r7 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r10
            r10 = r7
        L60:
            r6 = r3 ^ 101(0x65, float:1.42E-43)
            r3 = r3 & 101(0x65, float:1.42E-43)
            int r3 = r3 << r2
            int r6 = r6 + r3
            r3 = r6 ^ (-100)
            r6 = r6 & (-100)
            int r6 = r6 << r2
            int r3 = r3 + r6
            r6 = r10 ^ r8
            r8 = r8 & r10
            int r8 = r8 << r2
            int r6 = r6 + r8
            int r8 = ~r6
            int r8 = (-2) - r8
            int r10 = com.netcetera.threeds.sdk.infrastructure.setEmptyView.encryptionPublicKeyFromAssetCertificate
            r6 = r10 | 81
            int r6 = r6 << r2
            r10 = r10 ^ 81
            int r6 = r6 - r10
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.setEmptyView.rootPublicKey = r6
            r10 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r7 = r9
            r9 = r8
            r8 = r7
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setEmptyView.$$c(byte, byte, int):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:816:0x192e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setEmptyView.<clinit>():void");
    }

    public static int ThreeDS2ServiceInstance(Object obj) {
        byte[] bArr;
        int i = rootPublicKey;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        int i3 = i2 % 128;
        encryptionPublicKeyFromAssetCertificate = i3;
        if (i2 % 2 == 0) {
            Object obj2 = ids;
            rootPublicKey = ((i3 ^ 43) + ((i3 & 43) << 1)) % 128;
            try {
                Object[] objArr = {obj};
                byte b = logo[23];
                byte b2 = (byte) ((b ^ 58) | (b & 58));
                int intValue = ((Integer) Class.forName($$c(b, b2, (short) (b2 | 1025)), true, (ClassLoader) logoDark).getMethod($$c(bArr[77], bArr[530], (short) TypedValues.TransitionType.TYPE_TRANSITION_FLAGS), Object.class).invoke(obj2, objArr)).intValue();
                rootPublicKey = (encryptionPublicKeyFromAssetCertificate + 33) % 128;
                return intValue;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        throw null;
    }

    public static int get(int i) {
        int i2 = encryptionPublicKeyFromAssetCertificate;
        int i3 = i2 + 75;
        rootPublicKey = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = ids;
            int i4 = (i2 + 27) % 128;
            rootPublicKey = i4;
            encryptionPublicKeyFromAssetCertificate = ((i4 ^ 17) + ((i4 & 17) << 1)) % 128;
            try {
                Object[] objArr = {Integer.valueOf(i)};
                byte[] bArr = logo;
                byte b = bArr[23];
                byte b2 = (byte) (b | 58);
                Class<?> cls = Class.forName($$c(b, b2, (short) (b2 | 1025)), true, (ClassLoader) logoDark);
                byte b3 = bArr[530];
                int intValue = ((Integer) cls.getMethod($$c(bArr[0], b3, (short) ((b3 ^ 914) | (b3 & 914))), Integer.TYPE).invoke(obj, objArr)).intValue();
                int i5 = rootPublicKey;
                encryptionPublicKeyFromAssetCertificate = ((i5 & 65) + (i5 | 65)) % 128;
                return intValue;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        throw null;
    }

    public static void init$0() {
        int i = encryptionPublicKeyFromAssetCertificate;
        rootPublicKey = ((i ^ 67) + ((i & 67) << 1)) % 128;
        byte[] bArr = new byte[1312];
        System.arraycopy(">\u001chò5\rÿÃ@ø\u0010ð\u0003\u0010ò\u000eðÏFõ\u000bô\u0001\u0000\u0010½Eò\bÅ;\u0006ù\rð\u0013\u0002ÿ\u0004ï\u0012\u0002þôË6Êø\u0016ìÎ<\u0007À\u00154ò\u0001\u0000\u000eô\u0000æ&\u0003\u0006\u0000à\"ÿôý\rø\u0016ìÎ?ö\u000eúÈ&'û\u0002ò\t\u0013þ\u0001ô\n\u0007Î0\u0001ýþûÿ\u0014ö\u0007\u0000\bö\u0010\u0004ó\u0000ï\u0014ý\f\tö\u0005ùê\u0014\u000e\u0002\u0005ø\u0016ìÎAü\u0007À\u00158üòÞ4ò\u0001\u0000\u000e\u000e÷\u000fþûüËIôý\u0013¸)\u0014ý\u0013Í-\u0000ù\u0004ÿ\u000fþð\u0014ö\u0007\u0000\u000e÷\u000fþûüËB\u0005¼\u00154õ\u0004ùÁ3ð\u000e\u0002÷\u0007\u0000ø\u0016ìÎ<\u0007À\u00158üòÝ2\u0001ð\u0019Ñ&\u0003\u0006\u0000à\"ÿôý\rþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u001c&à\u0019\t\u0003\u0004\bÌ\"\u0014Ì*ö\u0013\u0001Ú$ó\u0004\u0002\u000eôý\u0004ã0ø\u0001\u000e\rÿÃ@ø\u0010ð\u0003\u0010ò\u000eðÏFõ\u000bô\u0001\u0000\u0010½Eò\bÅ;\u0006ù\rð\u0013\u0002ÿ\u0004ï\u0012\u0002þôËEó\u0010Ò)\u0004\u0005\u0006Þ\u0014ý\u0013®Q\rÿÂAø\u0010ð\u0003\u0010ò\u000eðÎGõ\u000bô\u0001\u0000\u0010¼Fò\bÿ\u0010Ó$\u0004ú\u000fÒ&\nüø\fòÿ\u0010Ð\u001f\u0003\u0006þà&\n5\rÿÃ@ø\u0010ð\u0003\u0010ò\u000eðÏFõ\u000bô\u0001\u0000\u0010½Eò\bÅ;\u0006ù\rð\u0013\u0002ÿ\u0004ï\u0012\u0002þôË5Ëôý\u0004ÿ\u0010Ý\u0012\u0003\tû\u0000í \u0005÷\fö\u0007\u0000Ù*\u0004Ö,þ\u0007üþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u0017\"\u0014Ï$\u0004ú\rö\u0002û\u0005ÿ\u0003\u0006þþ\f\u000bô\u0003ÄF\u0007û\u0002ò\tÂ\u0015 \u0013óà\"\u0014Ì*ö\u0013\u0001Ú$ó\u0004\u0002\u000eÿ\u0010Ð-ö\u0002ß\u001f\u0003\u0006þà&\n\u0007ööì\bê\tG\u0002²Gü\f\u0001÷\u0000\u0003\t\t®Mú\u0002\u000f¶ì\u0007ë\tì\u0005í\tì\té\tø\u0016ìÎ?ö\u000eúÈ\u0016*ö\u0013\u0001Ú$ó\u0004\u0002\u000e\u000e÷\u000fþûüË4\u0010\u0001¿\u00140\u0001Ø&\u0004ô\u0000\f\bÿ\u0010Ò4ýò\u000eýô\fè\"ü\u0004ð\u0007ÿà&\nôÿ\u0012ü\u0004\bø\u0016ìÎ<\u0007À\u0017\u001e\u0014îé&\u0003\u0006\u0000à\"ÿôý\r\u0004ó\u0004á\"\u0014\u000e÷\u000fþûüËIôý\u0013¸\u001e\u001b\u0015Í2ð\n\u0007ø\u0016ìÎ<\u0007À\u00158üòÝ2\u0001ð\u0019×'\u0000ý\u0006\u0000à\"ÿôý\r\u000e÷\u000fþûüËB\u0005¼\u0018*\tô\nþ\u0000\u0000ù\n\u0007ì\f\nñ\u000fÿ\u0010Ú\u0015\u0018Ô\u001b\u0015Ë-ö\u0002\u000e÷\u000fþûüËB\u0005¼&'û\u0002ò\t×*\u0004õ\tùÿ\bÿ\u0010Ð*ö\u0013\u0001Ú$ó\u0004\u0002\u000e6þ\u0014îÏ6þ\u0014îÏ\u0002\bú\u0010òÿ\u0010Óÿò\b\u0015ë\u0006\u0007ÿ\u0010Ú\u0015\u0018ò\u0005\tùÚ'þ\u0006úð\u0010\b\u0004õ\u0007\f\u0006\rÿÃ@ø\u0010ð\u0003\u0010ò\u000eðÏFõ\u000bô\u0001\u0000\u0010½Eò\bÅ;\u0006ù\rð\u0013\u0002ÿ\u0004ï\u0012\u0002þôËEó\u0010Ü Ö&þÿ\tû\u0000à&ú\u000eúÿè\u001e\u000b\u0002ò\nø\u000e³\u0001ô\u0014ö\u000eðè\u001eú\u0011ð\u0012\bØ\u0012\u0014õÞ(ú\tù\n\u0007\u0000\n\u0004\u0005óÿ\u0010Ú\u0015\u0018ò\u0005\tùØ/ð\u0017ó\u0006úÝ\u001f\u0003\u0006þï\u0017\u0012ìø\u0016ìÎ<\u0007ÀGú\u0004õ\u0006\nÿ\u0010Ý#þ\u0002ö\u000e\u0003\u0006ÿ\u0010Î\"\u0012ýþ\n\u0000òì\u0012\u0014õ\u000e÷\u000fþûüË4\u0010\u0001¿\u0014#\u0012ö\u000eô\f\u0006Ü\u0015\u000bôý\u0004ì\f\nñë\u0018ø\u0016ìÎ<\u0007À\u0019$\u0004úë'\u0000ý\u0006\u0000à\"ÿôý\rÿ\u000eê\u001cø\fòø\u0016ìÎ<\u0007À\u001c\u0007÷4ì\u0003\f\u0005ö\u0007\u0000ò\u0014õå\u001e\u000b\u0002ÿ\u0010Ö&ü\föù\fÖ0\u0001ýþûÿ\u0014ö\u0007\u0000ø\u0016ìÎ<\u0007À\u0019$\u0004ú\rÿÂAø\u0010ð\u0003\u0010ò\u000eðÎGõ\u000bô\u0001\u0000\u0010¼Fò\bÄ<\u0006ù\rð\u0013\u0002ÿ\u0004ï\u0012\u0002þôÊFó\u0010Ü Ö&þÿ\tû\u0000à&ú\u000eúÿè\u001e\u000b\u0002ò\nø\u000e³\u0001ì\u0004î\t\u0013þ\u0001ô\n\u0007á\u0016\u0005ùé\u001d\u0004\u0001þ\u000bø\u0016ìÎ<\u0007À\u0019$\u0004úà\"\u000fñ\u0010ø\b\u0005ü\u0004üÔ8üòÝ2\u0001ð\u0019\u0004ó\u0004à*ö\u0013\u0001\u0015\u000bô\u0001à\u0010à\"\u0013\u000e\u0005ôû\u0003å&\u0006\u0002î\u000eö\u0003\u000e÷\u000fþûüËJóü\u0004ÿ\u0010»\u00184ùò\u000e÷þ\u0002\u000búè\u001e\u000b\u0002ã\u0014ý\u0013üð\u0010ô\u0014ö\u000eðè\u001eú\u0011ð\u0012\bÌ&\nôÿ\u0012ü\u0004øý\u000fø\u0016ìÎ<\u0007À\u001c&\u0003\u0006\u0000à\"ÿôý\r".getBytes("ISO-8859-1"), 0, bArr, 0, 1312);
        logo = bArr;
        rootPublicKeyFromAssetCertificate = 14;
        int i2 = rootPublicKey;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        encryptionPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
        }
    }

    public static Object ThreeDS2ServiceInstance(char c, int i, int i2) {
        int i3 = rootPublicKey;
        Object obj = ids;
        int i4 = (((i3 | 43) << 1) - (i3 ^ 43)) % 128;
        encryptionPublicKeyFromAssetCertificate = i4;
        rootPublicKey = (i4 + 1) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = logo;
            byte b = bArr[23];
            byte b2 = (byte) ((b ^ 58) | (b & 58));
            Class<?> cls = Class.forName($$c(b, b2, (short) (b2 | 1025)), true, (ClassLoader) logoDark);
            byte b3 = bArr[530];
            String $$c = $$c(bArr[0], b3, (short) ((b3 ^ 914) | (b3 & 914)));
            Class<?> cls2 = Integer.TYPE;
            return cls.getMethod($$c, Character.TYPE, cls2, cls2).invoke(obj, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}