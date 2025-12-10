package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.AbstractC2095a;
import androidx.appcompat.app.AppCompatDelegate;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC2095a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class ExecutorC2096a implements Executor {

        /* renamed from: a */
        public final Object f9137a = new Object();

        /* renamed from: b */
        public final Queue f9138b = new ArrayDeque();

        /* renamed from: c */
        public final Executor f9139c;

        /* renamed from: d */
        public Runnable f9140d;

        public ExecutorC2096a(Executor executor) {
            this.f9139c = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ void m64516a(ExecutorC2096a executorC2096a, Runnable runnable) {
            executorC2096a.m64515c(runnable);
        }

        /* renamed from: c */
        public final /* synthetic */ void m64515c(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                m64514d();
            }
        }

        /* renamed from: d */
        public void m64514d() {
            synchronized (this.f9137a) {
                try {
                    Runnable runnable = (Runnable) this.f9138b.poll();
                    this.f9140d = runnable;
                    if (runnable != null) {
                        this.f9139c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f9137a) {
                try {
                    this.f9138b.add(new Runnable() { // from class: b6
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2095a.ExecutorC2096a.m64516a(AbstractC2095a.ExecutorC2096a.this, runnable);
                        }
                    });
                    if (this.f9140d == null) {
                        m64514d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public static class ExecutorC2097b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* renamed from: a */
    public static void m64519a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Storing App Locales : app-locales: ");
                    sb.append(str);
                    sb.append(" persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception e) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x002d, code lost:
        if (r6 != 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x003b, code lost:
        if (r4.getName().equals("locales") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003d, code lost:
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0044, code lost:
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0046, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0051, code lost:
        if (r3 == null) goto L16;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m64518b(android.content.Context r9) {
        /*
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r1)     // Catch: java.io.FileNotFoundException -> L72
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
            r7 = 1
            if (r6 == r7) goto L44
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
            if (r8 <= r5) goto L44
            goto L2a
        L28:
            r9 = move-exception
            goto L6c
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4c
        L44:
            if (r3 == 0) goto L54
        L46:
            r3.close()     // Catch: java.io.IOException -> L4a
            goto L54
        L4a:
            goto L54
        L4c:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L54
            goto L46
        L54:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L68
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            goto L6b
        L68:
            r9.deleteFile(r1)
        L6b:
            return r2
        L6c:
            if (r3 == 0) goto L71
            r3.close()     // Catch: java.io.IOException -> L71
        L71:
            throw r9
        L72:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AbstractC2095a.m64518b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public static void m64517c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AppCompatDelegate.getApplicationLocales().isEmpty()) {
                    String m64518b = m64518b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AppCompatDelegate.C2065b.m64636b(systemService, AppCompatDelegate.C2064a.m64638a(m64518b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}