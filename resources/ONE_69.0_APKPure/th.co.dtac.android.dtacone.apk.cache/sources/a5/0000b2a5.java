package com.google.firebase.remoteconfig.internal;

/* loaded from: classes4.dex */
public class DefaultsXmlParser {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e A[Catch: IOException | XmlPullParserException -> 0x0087, TryCatch #0 {IOException | XmlPullParserException -> 0x0087, blocks: (B:3:0x0005, B:6:0x000c, B:11:0x001e, B:43:0x0082, B:15:0x0029, B:19:0x0039, B:20:0x003d, B:26:0x004b, B:40:0x0073, B:41:0x0079, B:42:0x007e, B:31:0x005a, B:34:0x0064), top: B:47:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> getDefaultsFromXml(android.content.Context r8, int r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L87
            if (r8 != 0) goto Lc
            return r0
        Lc:
            android.content.res.XmlResourceParser r8 = r8.getXml(r9)     // Catch: java.lang.Throwable -> L87
            int r9 = r8.getEventType()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L18:
            r5 = 1
            if (r9 == r5) goto L87
            r6 = 2
            if (r9 != r6) goto L24
            java.lang.String r2 = r8.getName()     // Catch: java.lang.Throwable -> L87
            goto L82
        L24:
            r6 = 3
            java.lang.String r7 = "FirebaseRemoteConfig"
            if (r9 != r6) goto L46
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "entry"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L44
            if (r3 == 0) goto L3d
            if (r4 == 0) goto L3d
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L87
            goto L42
        L3d:
            java.lang.String r9 = "An entry in the defaults XML has an invalid key and/or value tag."
            android.util.Log.w(r7, r9)     // Catch: java.lang.Throwable -> L87
        L42:
            r3 = r1
            r4 = r3
        L44:
            r2 = r1
            goto L82
        L46:
            r6 = 4
            if (r9 != r6) goto L82
            if (r2 == 0) goto L82
            int r9 = r2.hashCode()     // Catch: java.lang.Throwable -> L87
            r6 = 106079(0x19e5f, float:1.48648E-40)
            if (r9 == r6) goto L64
            r6 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r9 == r6) goto L5a
            goto L6e
        L5a:
            java.lang.String r9 = "value"
            boolean r9 = r2.equals(r9)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L6e
            r9 = 1
            goto L6f
        L64:
            java.lang.String r9 = "key"
            boolean r9 = r2.equals(r9)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L6e
            r9 = 0
            goto L6f
        L6e:
            r9 = -1
        L6f:
            if (r9 == 0) goto L7e
            if (r9 == r5) goto L79
            java.lang.String r9 = "Encountered an unexpected tag while parsing the defaults XML."
            android.util.Log.w(r7, r9)     // Catch: java.lang.Throwable -> L87
            goto L82
        L79:
            java.lang.String r4 = r8.getText()     // Catch: java.lang.Throwable -> L87
            goto L82
        L7e:
            java.lang.String r3 = r8.getText()     // Catch: java.lang.Throwable -> L87
        L82:
            int r9 = r8.next()     // Catch: java.lang.Throwable -> L87
            goto L18
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.DefaultsXmlParser.getDefaultsFromXml(android.content.Context, int):java.util.Map");
    }
}