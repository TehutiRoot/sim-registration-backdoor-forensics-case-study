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
    public static final Charset f73538i = Charset.defaultCharset();

    /* renamed from: a */
    public final byte[] f73539a;

    /* renamed from: b */
    public final Tailable f73540b;

    /* renamed from: c */
    public final Charset f73541c;

    /* renamed from: d */
    public final Duration f73542d;

    /* renamed from: e */
    public final boolean f73543e;

    /* renamed from: f */
    public final TailerListener f73544f;

    /* renamed from: g */
    public final boolean f73545g;

    /* renamed from: h */
    public volatile boolean f73546h;

    /* renamed from: org.apache.commons.io.input.Tailer$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<Tailer, Builder> {

        /* renamed from: r */
        public static final Duration f73547r;

        /* renamed from: k */
        public Tailable f73548k;

        /* renamed from: l */
        public TailerListener f73549l;

        /* renamed from: n */
        public boolean f73551n;

        /* renamed from: o */
        public boolean f73552o;

        /* renamed from: m */
        public Duration f73550m = f73547r;

        /* renamed from: p */
        public boolean f73553p = true;

        /* renamed from: q */
        public ExecutorService f73554q = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: IR1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Tailer.Builder.m25242e(runnable);
            }
        });

        static {
            Duration ofMillis;
            ofMillis = Duration.ofMillis(1000L);
            f73547r = ofMillis;
        }

        /* renamed from: e */
        public static /* synthetic */ Thread m25242e(Runnable runnable) {
            return m25241f(runnable);
        }

        /* renamed from: f */
        public static Thread m25241f(Runnable runnable) {
            Thread thread = new Thread(runnable, "commons-io-tailer");
            thread.setDaemon(true);
            return thread;
        }

        public Builder setDelayDuration(Duration duration) {
            if (duration == null) {
                duration = f73547r;
            }
            this.f73550m = duration;
            return this;
        }

        public Builder setExecutorService(ExecutorService executorService) {
            Objects.requireNonNull(executorService, "executorService");
            this.f73554q = executorService;
            return this;
        }

        @Override // org.apache.commons.p028io.build.AbstractOriginSupplier
        public /* bridge */ /* synthetic */ AbstractOriginSupplier setOrigin(AbstractOrigin abstractOrigin) {
            return setOrigin((AbstractOrigin<?, ?>) abstractOrigin);
        }

        public Builder setReOpen(boolean z) {
            this.f73552o = z;
            return this;
        }

        public Builder setStartThread(boolean z) {
            this.f73553p = z;
            return this;
        }

        public Builder setTailFromEnd(boolean z) {
            this.f73551n = z;
            return this;
        }

        public Builder setTailable(Tailable tailable) {
            Objects.requireNonNull(tailable, "tailable");
            this.f73548k = tailable;
            return this;
        }

        public Builder setTailerListener(TailerListener tailerListener) {
            Objects.requireNonNull(tailerListener, "tailerListener");
            this.f73549l = tailerListener;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public Tailer get() {
            Tailer tailer = new Tailer(this.f73548k, getCharset(), this.f73549l, this.f73550m, this.f73551n, this.f73552o, getBufferSize());
            if (this.f73553p) {
                this.f73554q.submit(tailer);
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
        public final RandomAccessFile f73555a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f73555a.close();
        }

        @Override // org.apache.commons.p028io.input.Tailer.RandomAccessResourceBridge
        public long getPointer() {
            return this.f73555a.getFilePointer();
        }

        @Override // org.apache.commons.p028io.input.Tailer.RandomAccessResourceBridge
        public int read(byte[] bArr) {
            return this.f73555a.read(bArr);
        }

        @Override // org.apache.commons.p028io.input.Tailer.RandomAccessResourceBridge
        public void seek(long j) {
            this.f73555a.seek(j);
        }

        public C12536b(File file, String str) {
            this.f73555a = new RandomAccessFile(file, str);
        }
    }

    /* renamed from: org.apache.commons.io.input.Tailer$c */
    /* loaded from: classes6.dex */
    public static final class C12537c implements Tailable {

        /* renamed from: a */
        public final Path f73556a;

        /* renamed from: b */
        public final LinkOption[] f73557b;

        /* renamed from: a */
        public Path m25240a() {
            return this.f73556a;
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public RandomAccessResourceBridge getRandomAccess(String str) {
            File file;
            file = this.f73556a.toFile();
            return new C12536b(file, str);
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public boolean isNewer(FileTime fileTime) {
            return PathUtils.isNewer(this.f73556a, fileTime, this.f73557b);
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public FileTime lastModifiedFileTime() {
            FileTime lastModifiedTime;
            lastModifiedTime = Files.getLastModifiedTime(this.f73556a, this.f73557b);
            return lastModifiedTime;
        }

        @Override // org.apache.commons.p028io.input.Tailer.Tailable
        public long size() {
            long size;
            size = Files.size(this.f73556a);
            return size;
        }

        public String toString() {
            return "TailablePath [file=" + this.f73556a + ", linkOptions=" + Arrays.toString(this.f73557b) + "]";
        }

        public C12537c(Path path, LinkOption... linkOptionArr) {
            Objects.requireNonNull(path, ClientCookie.PATH_ATTR);
            this.f73556a = AbstractC22491uI0.m1223a(path);
            this.f73557b = linkOptionArr;
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
    public final long m25243b(RandomAccessResourceBridge randomAccessResourceBridge) {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long pointer = randomAccessResourceBridge.getPointer();
            long j = pointer;
            boolean z = false;
            while (getRun() && (read = randomAccessResourceBridge.read(this.f73539a)) != -1) {
                for (int i = 0; i < read; i++) {
                    byte b = this.f73539a[i];
                    if (b != 10) {
                        if (b != 13) {
                            if (z) {
                                this.f73544f.handle(new String(byteArrayOutputStream.toByteArray(), this.f73541c));
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
                        this.f73544f.handle(new String(byteArrayOutputStream.toByteArray(), this.f73541c));
                        byteArrayOutputStream.reset();
                        pointer = i + j + 1;
                        z = false;
                    }
                }
                j = randomAccessResourceBridge.getPointer();
            }
            randomAccessResourceBridge.seek(pointer);
            TailerListener tailerListener = this.f73544f;
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
        this.f73546h = false;
    }

    @Deprecated
    public long getDelay() {
        long millis;
        millis = this.f73542d.toMillis();
        return millis;
    }

    public Duration getDelayDuration() {
        return this.f73542d;
    }

    public File getFile() {
        File file;
        Tailable tailable = this.f73540b;
        if (tailable instanceof C12537c) {
            file = ((C12537c) tailable).m25240a().toFile();
            return file;
        }
        throw new IllegalStateException("Cannot extract java.io.File from " + this.f73540b.getClass().getName());
    }

    public boolean getRun() {
        return this.f73546h;
    }

    public Tailable getTailable() {
        return this.f73540b;
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
                        randomAccessResourceBridge2 = this.f73540b.getRandomAccess(PDPageLabelRange.STYLE_ROMAN_LOWER);
                    } catch (FileNotFoundException unused) {
                        this.f73544f.fileNotFound();
                    }
                    if (randomAccessResourceBridge2 == null) {
                        ThreadUtils.sleep(this.f73542d);
                    } else {
                        if (this.f73543e) {
                            j = this.f73540b.size();
                        } else {
                            j = 0;
                        }
                        fileTime = this.f73540b.lastModifiedFileTime();
                        randomAccessResourceBridge2.seek(j);
                    }
                }
                while (getRun()) {
                    boolean isNewer = this.f73540b.isNewer(fileTime);
                    int i = (this.f73540b.size() > j ? 1 : (this.f73540b.size() == j ? 0 : -1));
                    if (i < 0) {
                        this.f73544f.fileRotated();
                        try {
                            randomAccessResourceBridge = this.f73540b.getRandomAccess(PDPageLabelRange.STYLE_ROMAN_LOWER);
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessResourceBridge = randomAccessResourceBridge2;
                        }
                        try {
                            try {
                                m25243b(randomAccessResourceBridge2);
                            } catch (IOException e) {
                                this.f73544f.handle(e);
                            }
                            if (randomAccessResourceBridge2 != null) {
                                try {
                                    try {
                                        randomAccessResourceBridge2.close();
                                    } catch (InterruptedException e2) {
                                        e = e2;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        Thread.currentThread().interrupt();
                                        this.f73544f.handle(e);
                                        try {
                                            IOUtils.close(randomAccessResourceBridge2);
                                        } catch (IOException e3) {
                                            e = e3;
                                            this.f73544f.handle(e);
                                            close();
                                        }
                                        close();
                                    } catch (Exception e4) {
                                        e = e4;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        this.f73544f.handle(e);
                                        try {
                                            IOUtils.close(randomAccessResourceBridge2);
                                        } catch (IOException e5) {
                                            e = e5;
                                            this.f73544f.handle(e);
                                            close();
                                        }
                                        close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        try {
                                            IOUtils.close(randomAccessResourceBridge2);
                                        } catch (IOException e6) {
                                            this.f73544f.handle(e6);
                                        }
                                        close();
                                        throw th;
                                    }
                                } catch (FileNotFoundException unused2) {
                                    j = 0;
                                    randomAccessResourceBridge2 = randomAccessResourceBridge;
                                    this.f73544f.fileNotFound();
                                    ThreadUtils.sleep(this.f73542d);
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
                                        this.f73544f.fileNotFound();
                                        ThreadUtils.sleep(this.f73542d);
                                    }
                                }
                            }
                            throw th;
                            break;
                        }
                    } else {
                        if (i > 0) {
                            j = m25243b(randomAccessResourceBridge2);
                            fileTime = this.f73540b.lastModifiedFileTime();
                        } else if (isNewer) {
                            randomAccessResourceBridge2.seek(0L);
                            j = m25243b(randomAccessResourceBridge2);
                            fileTime = this.f73540b.lastModifiedFileTime();
                        }
                        if (this.f73545g && randomAccessResourceBridge2 != null) {
                            randomAccessResourceBridge2.close();
                        }
                        ThreadUtils.sleep(this.f73542d);
                        if (getRun() && this.f73545g) {
                            randomAccessResourceBridge2 = this.f73540b.getRandomAccess(PDPageLabelRange.STYLE_ROMAN_LOWER);
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
                this.f73544f.handle(e);
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
            java.nio.file.Path r0 = p000.AbstractC19024aH1.m65162a(r9)
            r2 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]
            r3 = 0
            r1.<init>(r0, r2)
            java.time.Duration r4 = p000.GJ0.m68289a(r12)
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
        this(file, f73538i, tailerListener, j, z, z2, i);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j, boolean z, int i) {
        this(file, tailerListener, j, z, false, i);
    }

    public Tailer(Tailable tailable, Charset charset, TailerListener tailerListener, Duration duration, boolean z, boolean z2, int i) {
        this.f73546h = true;
        Objects.requireNonNull(tailable, "tailable");
        this.f73540b = tailable;
        Objects.requireNonNull(tailerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f73544f = tailerListener;
        this.f73542d = duration;
        this.f73543e = z;
        this.f73539a = IOUtils.byteArray(i);
        tailerListener.init(this);
        this.f73545g = z2;
        this.f73541c = charset;
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