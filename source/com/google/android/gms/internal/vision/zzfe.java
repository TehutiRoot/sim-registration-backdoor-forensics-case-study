package com.google.android.gms.internal.vision;

import java.io.PrintStream;

/* loaded from: classes3.dex */
public final class zzfe {

    /* renamed from: a */
    public static final Dn2 f47603a;

    /* renamed from: b */
    public static final int f47604b;

    /* renamed from: com.google.android.gms.internal.vision.zzfe$a */
    /* loaded from: classes3.dex */
    public static final class C6650a extends Dn2 {
        @Override // p000.Dn2
        /* renamed from: a */
        public final void mo26047a(Throwable th2) {
            th2.printStackTrace();
        }

        @Override // p000.Dn2
        /* renamed from: b */
        public final void mo26046b(Throwable th2, Throwable th3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m46540a()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L17
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L15
            r3 = 19
            if (r2 < r3) goto L17
            no2 r2 = new no2     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            goto L5d
        L15:
            r2 = move-exception
            goto L2e
        L17:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L15
            r2 = r2 ^ r0
            if (r2 == 0) goto L26
            bo2 r2 = new bo2     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            goto L5d
        L26:
            com.google.android.gms.internal.vision.zzfe$a r2 = new com.google.android.gms.internal.vision.zzfe$a     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            goto L5d
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.vision.zzfe$a> r4 = com.google.android.gms.internal.vision.zzfe.C6650a.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            r2.printStackTrace(r3)
            com.google.android.gms.internal.vision.zzfe$a r2 = new com.google.android.gms.internal.vision.zzfe$a
            r2.<init>()
        L5d:
            com.google.android.gms.internal.vision.zzfe.f47603a = r2
            if (r1 != 0) goto L62
            goto L66
        L62:
            int r0 = r1.intValue()
        L66:
            com.google.android.gms.internal.vision.zzfe.f47604b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.<clinit>():void");
    }

    /* renamed from: a */
    public static Integer m46540a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
            return null;
        }
    }

    public static void zza(Throwable th2, Throwable th3) {
        f47603a.mo26046b(th2, th3);
    }

    public static void zza(Throwable th2) {
        f47603a.mo26047a(th2);
    }
}
