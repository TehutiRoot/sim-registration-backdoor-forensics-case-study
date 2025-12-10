package org.apache.commons.p028io.input;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.ThreadUtils;
import org.apache.commons.p028io.build.AbstractOrigin;
import org.apache.commons.p028io.build.AbstractOriginSupplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.file.PathUtils;
import org.apache.commons.p028io.file.attribute.FileTimes;
import org.apache.commons.p028io.input.Tailer;
import org.apache.http.cookie.ClientCookie;

/* renamed from: org.apache.commons.io.input.Tailer */
/* loaded from: classes6.dex */
public class Tailer implements Runnable, AutoCloseable {

    /* renamed from: i */
    public static final Charset f73454i = Charset.defaultCharset();

    /* renamed from: a */
    public final byte[] f73455a;

    /* renamed from: b */
    public final Tailable f73456b;

    /* renamed from: c */
    public final Charset f73457c;

    /* renamed from: d */
    public final Duration f73458d;

    /* renamed from: e */
    public final boolean f73459e;

    /* renamed from: f */
    public final TailerListener f73460f;

    /* renamed from: g */
    public final boolean f73461g;

    /* renamed from: h */
    public volatile boolean f73462h;

    /* renamed from: org.apache.commons.io.input.Tailer$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<Tailer, Builder> {

        /* renamed from: r */
        public static final Duration f73463r;

        /* renamed from: k */
        public Tailable f73464k;

        /* renamed from: l */
        public TailerListener f73465l;

        /* renamed from: n */
        public boolean f73467n;

        /* renamed from: o */
        public boolean f73468o;

        /* renamed from: m */
        public Duration f73466m = f73463r;

        /* renamed from: p */
        public boolean f73469p = true;

        /* renamed from: q */
        public ExecutorService f73470q = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: LQ1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Tailer.Builder.m25052e(runnable);
            }
        });

        static {
            Duration ofMillis;
            ofMillis = Duration.ofMillis(1000L);
            f73463r = ofMillis;
        }

        /* renamed from: e */
        public static /* synthetic */ Thread m25052e(Runnable runnable) {
            return m25051f(runnable);
        }

        /* renamed from: f */
        public static Thread m25051f(Runnable runnable) {
            Thread thread = new Thread(runnable, "commons-io-tailer");
            thread.setDaemon(true);
            return thread;
        }

        public Builder setDelayDuration(Duration duration) {
            if (duration == null) {
                duration = f73463r;
            }
            this.f73466m = duration;
            return this;
        }

        public Builder setExecutorService(ExecutorService executorService) {
            Objects.requireNonNull(executorService, "executorService");
            this.f73470q = executorService;
            return this;
        }

        @Override // org.apache.commons.p028io.build.AbstractOriginSupplier
        public /* bridge */ /* synthetic */ AbstractOriginSupplier setOrigin(AbstractOrigin abstractOrigin) {
            return setOrigin((AbstractOrigin<?, ?>) abstractOrigin);
        }

        public Builder setReOpen(boolean z) {
            this.f73468o = z;
            return this;
        }

        public Builder setStartThread(boolean z) {
            this.f73469p = z;
            return this;
        }

        public Builder setTailFromEnd(boolean z) {
            this.f73467n = z;
            return this;
        }

        public Builder setTailable(Tailable tailable) {
            Objects.requireNonNull(tailable, "tailable");
            this.f73464k = tailable;
            return this;
        }

        public Builder setTailerListener(TailerListener tailerListener) {
            Objects.requireNonNull(tailerListener, "tailerListener");
            this.f73465l = tailerListener;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public Tailer get() {
            Tailer tailer = new Tailer(this.f73464k, getCharset(), this.f73465l, this.f73466m, this.f73467n, this.f73468o, getBufferSize());
            if (this.f73469p) {
                this.f73470q.submit(tailer);
            }
            return tailer;
        }

        @Override // org.apache.commons.p028io.build.AbstractOriginSupplier
        public Builder setOrigin(AbstractOrigin<?, ?> abstractOrigin) {
            setTailable(new C12537c(abstractOrigin.getPath(), new LinkOption[0]));
            return (Builder) super.setOrigin(abstractOrigin);
        }
    }

    /* renamed from: org.apache.commons.io.input.Tailer$RandomAccessResourceBridge */
    /* loaded from: classes6.dex */
    public interface RandomAccessResourceBridge extends Closeable {
        long getPointer() throws IOException;

        int read(byte[] bArr) throws IOException;

        void seek(long j) throws IOException;
    }

    /* renamed from: org.apache.commons.io.input.Tailer$Tailable */
    /* loaded from: classes6.dex */
    public interface Tailable {
        RandomAccessResourceBridge getRandomAccess(String str) throws FileNotFoundException;

        boolean isNewer(FileTime fileTime) throws IOException;

        FileTime lastModifiedFileTime() throws IOException;

        long size() throws IOException;
    }

    /* renamed from: org.apache.commons.io.input.Tailer$b */
    /* loaded from: classes6.dex */
    public static final class C12536b implements RandomAccessResourceBridge {

        /* renamed from: a */
        public final RandomAccessFile f73471a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f73471a.close();
        }

        @Override // org.apache.commons.p028io.input.Tailer.RandomAccessResourceBridge
        public long getPointer() {
            return this.f73471a.getFilePointer();
        }

        @Override // org.apache.commons.p028io.input.Tailer.RandomAccessResourceBridge
        public int read(byte[] bArr) {
            return this.f73471a.read(bArr);
        }

        @Override // org.apache.commons.p028io.input.Tailer.RandomAccessResourceBridge
        public void seek(long j) {
            this.f73471a.seek(j);
        }

        public C12536b(File file, String str) {
            this.f73471a = new RandomAccessFile(file, str);
        }
    }

    /* renamed from: org.apache.commons.io.input.Tailer$c */
    /* loaded from: classes6.dex */
    public static final class C12537c implements Tailable {

        /* renamed from: a */
        public final Path f73472a;

        /* renamed from: b */
        public final LinkOption[] f73473b;

        /* renamed from: a */
        public Path m25050a() {
            return this.f73472a;
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public RandomAccessResourceBridge getRandomAccess(String str) {
            File file;
            file = this.f73472a.toFile();
            return new C12536b(file, str);
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public boolean isNewer(FileTime fileTime) {
            return PathUtils.isNewer(this.f73472a, fileTime, this.f73473b);
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public FileTime lastModifiedFileTime() {
            FileTime lastModifiedTime;
            lastModifiedTime = Files.getLastModifiedTime(this.f73472a, this.f73473b);
            return lastModifiedTime;
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public long size() {
            long size;
            size = Files.size(this.f73472a);
            return size;
        }

        public String toString() {
            return "TailablePath [file=" + this.f73472a + ", linkOptions=" + Arrays.toString(this.f73473b) + "]";
        }

        public C12537c(Path path, LinkOption... linkOptionArr) {
            Objects.requireNonNull(path, ClientCookie.PATH_ATTR);
            this.f73472a = AbstractC21393oI0.m25938a(path);
            this.f73473b = linkOptionArr;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        Duration ofMillis;
        ofMillis = Duration.ofMillis(j);
        return ((Builder) builder().setFile(file)).setTailerListener(tailerListener).setCharset(charset).setDelayDuration(ofMillis).setTailFromEnd(z).setReOpen(z2).setBufferSize(i).get();
    }

    /* renamed from: b */
    public final long m25053b(RandomAccessResourceBridge randomAccessResourceBridge) {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long pointer = randomAccessResourceBridge.getPointer();
            long j = pointer;
            boolean z = false;
            while (getRun() && (read = randomAccessResourceBridge.read(this.f73455a)) != -1) {
                for (int i = 0; i < read; i++) {
                    byte b = this.f73455a[i];
                    if (b != 10) {
                        if (b != 13) {
                            if (z) {
                                this.f73460f.handle(new String(byteArrayOutputStream.toByteArray(), this.f73457c));
                                byteArrayOutputStream.reset();
                                pointer = i + j + 1;
                                z = false;
                            }
                            byteArrayOutputStream.write(b);
                        } else {
                            if (z) {
                                byteArrayOutputStream.write(13);
                            }
                            z = true;
                        }
                    } else {
                        this.f73460f.handle(new String(byteArrayOutputStream.toByteArray(), this.f73457c));
                        byteArrayOutputStream.reset();
                        pointer = i + j + 1;
                        z = false;
                    }
                }
                j = randomAccessResourceBridge.getPointer();
            }
            randomAccessResourceBridge.seek(pointer);
            TailerListener tailerListener = this.f73460f;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return pointer;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f73462h = false;
    }

    @Deprecated
    public long getDelay() {
        long millis;
        millis = this.f73458d.toMillis();
        return millis;
    }

    public Duration getDelayDuration() {
        return this.f73458d;
    }

    public File getFile() {
        File file;
        Tailable tailable = this.f73456b;
        if (tailable instanceof C12537c) {
            file = ((C12537c) tailable).m25050a().toFile();
            return file;
        }
        throw new IllegalStateException("Cannot extract java.io.File from " + this.f73456b.getClass().getName());
    }

    public boolean getRun() {
        return this.f73462h;
    }

    public Tailable getTailable() {
        return this.f73456b;
    }

    @Override // java.lang.Runnable
    public void run() {
        RandomAccessResourceBridge randomAccessResourceBridge;
        RandomAccessResourceBridge randomAccessResourceBridge2 = null;
        try {
            try {
                FileTime fileTime = FileTimes.EPOCH;
                long j = 0;
                while (getRun() && randomAccessResourceBridge2 == null) {
                    try {
                        randomAccessResourceBridge2 = this.f73456b.getRandomAccess(PDPageLabelRange.STYLE_ROMAN_LOWER);
                    } catch (FileNotFoundException unused) {
                        this.f73460f.fileNotFound();
                    }
                    if (randomAccessResourceBridge2 == null) {
                        ThreadUtils.sleep(this.f73458d);
                    } else {
                        if (this.f73459e) {
                            j = this.f73456b.size();
                        } else {
                            j = 0;
                        }
                        fileTime = this.f73456b.lastModifiedFileTime();
                        randomAccessResourceBridge2.seek(j);
                    }
                }
                while (getRun()) {
                    boolean isNewer = this.f73456b.isNewer(fileTime);
                    int i = (this.f73456b.size() > j ? 1 : (this.f73456b.size() == j ? 0 : -1));
                    if (i < 0) {
                        this.f73460f.fileRotated();
                        try {
                            randomAccessResourceBridge = this.f73456b.getRandomAccess(PDPageLabelRange.STYLE_ROMAN_LOWER);
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessResourceBridge = randomAccessResourceBridge2;
                        }
                        try {
                            try {
                                m25053b(randomAccessResourceBridge2);
                            } catch (IOException e) {
                                this.f73460f.handle(e);
                            }
                            if (randomAccessResourceBridge2 != null) {
                                try {
                                    try {
                                        randomAccessResourceBridge2.close();
                                    } catch (InterruptedException e2) {
                                        e = e2;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        Thread.currentThread().interrupt();
                                        this.f73460f.handle(e);
                                        try {
                                            IOUtils.close(randomAccessResourceBridge2);
                                        } catch (IOException e3) {
                                            e = e3;
                                            this.f73460f.handle(e);
                                            close();
                                        }
                                        close();
                                    } catch (Exception e4) {
                                        e = e4;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        this.f73460f.handle(e);
                                        try {
                                            IOUtils.close(randomAccessResourceBridge2);
                                        } catch (IOException e5) {
                                            e = e5;
                                            this.f73460f.handle(e);
                                            close();
                                        }
                                        close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        try {
                                            IOUtils.close(randomAccessResourceBridge2);
                                        } catch (IOException e6) {
                                            this.f73460f.handle(e6);
                                        }
                                        close();
                                        throw th;
                                    }
                                } catch (FileNotFoundException unused2) {
                                    j = 0;
                                    randomAccessResourceBridge2 = randomAccessResourceBridge;
                                    this.f73460f.fileNotFound();
                                    ThreadUtils.sleep(this.f73458d);
                                }
                            }
                            j = 0;
                            randomAccessResourceBridge2 = randomAccessResourceBridge;
                        } catch (Throwable th4) {
                            th = th4;
                            if (randomAccessResourceBridge2 != null) {
                                try {
                                    randomAccessResourceBridge2.close();
                                } catch (Throwable th5) {
                                    try {
                                        th.addSuppressed(th5);
                                    } catch (FileNotFoundException unused3) {
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        this.f73460f.fileNotFound();
                                        ThreadUtils.sleep(this.f73458d);
                                    }
                                }
                            }
                            throw th;
                            break;
                        }
                    } else {
                        if (i > 0) {
                            j = m25053b(randomAccessResourceBridge2);
                            fileTime = this.f73456b.lastModifiedFileTime();
                        } else if (isNewer) {
                            randomAccessResourceBridge2.seek(0L);
                            j = m25053b(randomAccessResourceBridge2);
                            fileTime = this.f73456b.lastModifiedFileTime();
                        }
                        if (this.f73461g && randomAccessResourceBridge2 != null) {
                            randomAccessResourceBridge2.close();
                        }
                        ThreadUtils.sleep(this.f73458d);
                        if (getRun() && this.f73461g) {
                            randomAccessResourceBridge2 = this.f73456b.getRandomAccess(PDPageLabelRange.STYLE_ROMAN_LOWER);
                            randomAccessResourceBridge2.seek(j);
                        }
                    }
                }
            } catch (InterruptedException e7) {
                e = e7;
            } catch (Exception e8) {
                e = e8;
            }
            try {
                IOUtils.close(randomAccessResourceBridge2);
            } catch (IOException e9) {
                e = e9;
                this.f73460f.handle(e);
                close();
            }
            close();
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Deprecated
    public void stop() {
        close();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Tailer(java.io.File r9, java.nio.charset.Charset r10, org.apache.commons.p028io.input.TailerListener r11, long r12, boolean r14, boolean r15, int r16) {
        /*
            r8 = this;
            org.apache.commons.io.input.Tailer$c r1 = new org.apache.commons.io.input.Tailer$c
            java.nio.file.Path r0 = p000.AbstractC19496dG1.m31913a(r9)
            r2 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]
            r3 = 0
            r1.<init>(r0, r2)
            java.time.Duration r4 = p000.AJ0.m69103a(r12)
            r0 = r8
            r2 = r10
            r3 = r11
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.Tailer.<init>(java.io.File, java.nio.charset.Charset, org.apache.commons.io.input.TailerListener, long, boolean, boolean, int):void");
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j) {
        this(file, tailerListener, j, false);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j, boolean z) {
        this(file, tailerListener, j, z, 8192);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        this(file, tailerListener, j, z, z2, 8192);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        this(file, f73454i, tailerListener, j, z, z2, i);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, int i) {
        this(file, tailerListener, j, z, false, i);
    }

    public Tailer(Tailable tailable, Charset charset, TailerListener tailerListener, Duration duration, boolean z, boolean z2, int i) {
        this.f73462h = true;
        Objects.requireNonNull(tailable, "tailable");
        this.f73456b = tailable;
        Objects.requireNonNull(tailerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f73460f = tailerListener;
        this.f73458d = duration;
        this.f73459e = z;
        this.f73455a = IOUtils.byteArray(i);
        tailerListener.init(this);
        this.f73461g = z2;
        this.f73457c = charset;
    }

    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener) {
        return ((Builder) builder().setFile(file)).setTailerListener(tailerListener).get();
    }

    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j);
        return tailerListener2.setDelayDuration(ofMillis).get();
    }

    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z).get();
    }

    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z).setReOpen(z2).get();
    }

    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z).setReOpen(z2).setBufferSize(i).get();
    }

    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, int i) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z).setBufferSize(i).get();
    }
}
