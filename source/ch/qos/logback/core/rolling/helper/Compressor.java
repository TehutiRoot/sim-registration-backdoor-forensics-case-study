package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.util.concurrent.Future;
import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public class Compressor extends ContextAwareBase {

    /* renamed from: c */
    public final CompressionMode f40065c;

    /* renamed from: ch.qos.logback.core.rolling.helper.Compressor$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5486a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40066a;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            f40066a = iArr;
            try {
                iArr[CompressionMode.GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40066a[CompressionMode.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40066a[CompressionMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ch.qos.logback.core.rolling.helper.Compressor$b */
    /* loaded from: classes.dex */
    public class RunnableC5487b implements Runnable {

        /* renamed from: a */
        public final String f40067a;

        /* renamed from: b */
        public final String f40068b;

        /* renamed from: c */
        public final String f40069c;

        public RunnableC5487b(String str, String str2, String str3) {
            this.f40067a = str;
            this.f40068b = str2;
            this.f40069c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Compressor.this.compress(this.f40067a, this.f40068b, this.f40069c);
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.f40065c = compressionMode;
    }

    public static String computeFileNameStrWithoutCompSuffix(String str, CompressionMode compressionMode) {
        int i;
        int length = str.length();
        int i2 = C5486a.f40066a[compressionMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return str;
                }
                throw new IllegalStateException("Execution should not reach this point");
            } else if (!str.endsWith(".zip")) {
                return str;
            } else {
                i = length - 4;
            }
        } else if (!str.endsWith(".gz")) {
            return str;
        } else {
            i = length - 3;
        }
        return str.substring(0, i);
    }

    public Future<?> asyncCompress(String str, String str2, String str3) throws RolloverFailure {
        return this.context.getScheduledExecutorService().submit(new RunnableC5487b(str, str2, str3));
    }

    /* renamed from: b */
    public ZipEntry m51390b(String str) {
        return new ZipEntry(computeFileNameStrWithoutCompSuffix(str, this.f40065c));
    }

    public void compress(String str, String str2, String str3) {
        int i = C5486a.f40066a[this.f40065c.ordinal()];
        if (i == 1) {
            m51388g(str, str2);
        } else if (i == 2) {
            m51387i(str, str2, str3);
        } else if (i == 3) {
            throw new UnsupportedOperationException("compress method called in NONE compression mode");
        }
    }

    /* renamed from: d */
    public void m51389d(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51388g(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.m51388g(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m51387i(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.m51387i(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String toString() {
        return getClass().getName();
    }
}
