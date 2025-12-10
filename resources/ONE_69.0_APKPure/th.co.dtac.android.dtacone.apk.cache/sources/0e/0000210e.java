package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(21)
/* loaded from: classes.dex */
public class BufferedAudioStream implements AudioStream {

    /* renamed from: g */
    public final AudioStream f12006g;

    /* renamed from: h */
    public final int f12007h;

    /* renamed from: i */
    public final int f12008i;

    /* renamed from: j */
    public final int f12009j;

    /* renamed from: l */
    public int f12011l;

    /* renamed from: a */
    public final AtomicBoolean f12000a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f12001b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Queue f12002c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final Executor f12003d = CameraXExecutors.newSequentialExecutor(CameraXExecutors.audioExecutor());

    /* renamed from: e */
    public final Object f12004e = new Object();

    /* renamed from: f */
    public C2633a f12005f = null;

    /* renamed from: k */
    public final AtomicBoolean f12010k = new AtomicBoolean(false);

    /* renamed from: androidx.camera.video.internal.audio.BufferedAudioStream$a */
    /* loaded from: classes.dex */
    public static class C2633a {

        /* renamed from: a */
        public final int f12012a;

        /* renamed from: b */
        public final int f12013b;

        /* renamed from: c */
        public final ByteBuffer f12014c;

        /* renamed from: d */
        public long f12015d;

        public C2633a(ByteBuffer byteBuffer, AudioStream.PacketInfo packetInfo, int i, int i2) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit == packetInfo.getSizeInBytes()) {
                this.f12012a = i;
                this.f12013b = i2;
                this.f12014c = byteBuffer;
                this.f12015d = packetInfo.getTimestampNs();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + packetInfo.getSizeInBytes());
        }

        /* renamed from: a */
        public int m62082a() {
            return this.f12014c.remaining();
        }

        /* renamed from: b */
        public AudioStream.PacketInfo m62081b(ByteBuffer byteBuffer) {
            int remaining;
            long j = this.f12015d;
            int position = this.f12014c.position();
            int position2 = byteBuffer.position();
            if (this.f12014c.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f12015d += AudioUtils.frameCountToDurationNs(AudioUtils.sizeToFrameCount(remaining, this.f12012a), this.f12013b);
                ByteBuffer duplicate = this.f12014c.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = this.f12014c.remaining();
                byteBuffer.put(this.f12014c).limit(position2 + remaining).position(position2);
            }
            this.f12014c.position(position + remaining);
            return AudioStream.PacketInfo.m62109of(remaining, j);
        }
    }

    public BufferedAudioStream(@NonNull AudioStream audioStream, @NonNull AudioSettings audioSettings) {
        boolean z;
        this.f12006g = audioStream;
        int bytesPerFrame = audioSettings.getBytesPerFrame();
        this.f12007h = bytesPerFrame;
        int sampleRate = audioSettings.getSampleRate();
        this.f12008i = sampleRate;
        if (bytesPerFrame > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "mBytesPerFrame must be greater than 0.");
        Preconditions.checkArgument(((long) sampleRate) > 0, "mSampleRate must be greater than 0.");
        this.f12009j = 500;
        this.f12011l = bytesPerFrame * 1024;
    }

    /* renamed from: a */
    public static /* synthetic */ void m62099a(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62087m();
    }

    /* renamed from: b */
    public static /* synthetic */ void m62098b(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62088l();
    }

    /* renamed from: c */
    public static /* synthetic */ void m62097c(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62090j();
    }

    /* renamed from: d */
    public static /* synthetic */ void m62096d(BufferedAudioStream bufferedAudioStream, int i) {
        bufferedAudioStream.m62086n(i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62095e(BufferedAudioStream bufferedAudioStream, AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        bufferedAudioStream.m62089k(audioStreamCallback, executor);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62094f(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62091i();
    }

    /* renamed from: g */
    private void m62093g() {
        Preconditions.checkState(!this.f12001b.get(), "AudioStream has been released.");
    }

    /* renamed from: h */
    private void m62092h() {
        Preconditions.checkState(this.f12000a.get(), "AudioStream has not been started.");
    }

    /* renamed from: i */
    public final void m62091i() {
        if (!this.f12010k.get()) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f12011l);
        C2633a c2633a = new C2633a(allocateDirect, this.f12006g.read(allocateDirect), this.f12007h, this.f12008i);
        int i = this.f12009j;
        synchronized (this.f12004e) {
            try {
                this.f12002c.offer(c2633a);
                while (this.f12002c.size() > i) {
                    this.f12002c.poll();
                    Logger.m63171w("BufferedAudioStream", "Drop audio data due to full of queue.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f12010k.get()) {
            this.f12003d.execute(new Runnable() { // from class: Rc
                @Override // java.lang.Runnable
                public final void run() {
                    BufferedAudioStream.m62094f(BufferedAudioStream.this);
                }
            });
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m62090j() {
        this.f12010k.set(false);
        this.f12006g.release();
        synchronized (this.f12004e) {
            this.f12005f = null;
            this.f12002c.clear();
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m62089k(AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        this.f12006g.setCallback(audioStreamCallback, executor);
    }

    /* renamed from: l */
    public final /* synthetic */ void m62088l() {
        try {
            this.f12006g.start();
            m62085o();
        } catch (AudioStream.AudioStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void m62087m() {
        this.f12010k.set(false);
        this.f12006g.stop();
        synchronized (this.f12004e) {
            this.f12005f = null;
            this.f12002c.clear();
        }
    }

    /* renamed from: o */
    public final void m62085o() {
        if (this.f12010k.getAndSet(true)) {
            return;
        }
        m62091i();
    }

    /* renamed from: p */
    public final void m62086n(int i) {
        int i2 = this.f12011l;
        if (i2 == i) {
            return;
        }
        int i3 = this.f12007h;
        this.f12011l = (i / i3) * i3;
        Logger.m63178d("BufferedAudioStream", "Update buffer size from " + i2 + " to " + this.f12011l);
    }

    /* renamed from: q */
    public final void m62083q(final int i) {
        this.f12003d.execute(new Runnable() { // from class: Pc
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62096d(BufferedAudioStream.this, i);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        boolean z;
        m62093g();
        m62092h();
        m62083q(byteBuffer.remaining());
        AudioStream.PacketInfo m62109of = AudioStream.PacketInfo.m62109of(0, 0L);
        do {
            synchronized (this.f12004e) {
                try {
                    C2633a c2633a = this.f12005f;
                    this.f12005f = null;
                    if (c2633a == null) {
                        c2633a = (C2633a) this.f12002c.poll();
                    }
                    if (c2633a != null) {
                        m62109of = c2633a.m62081b(byteBuffer);
                        if (c2633a.m62082a() > 0) {
                            this.f12005f = c2633a;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (m62109of.getSizeInBytes() <= 0 && this.f12000a.get() && !this.f12001b.get()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    Logger.m63170w("BufferedAudioStream", "Interruption while waiting for audio data", e);
                }
            }
        } while (z);
        return m62109of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.f12001b.getAndSet(true)) {
            return;
        }
        this.f12003d.execute(new Runnable() { // from class: Qc
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62097c(BufferedAudioStream.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable final AudioStream.AudioStreamCallback audioStreamCallback, @Nullable final Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.f12000a.get(), "AudioStream can not be started when setCallback.");
        m62093g();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.f12003d.execute(new Runnable() { // from class: Nc
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62095e(BufferedAudioStream.this, audioStreamCallback, executor);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException, IllegalStateException {
        m62093g();
        if (this.f12000a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: Oc
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62098b(BufferedAudioStream.this);
            }
        }, null);
        this.f12003d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            this.f12000a.set(false);
            throw new AudioStream.AudioStreamException(e);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws IllegalStateException {
        m62093g();
        if (!this.f12000a.getAndSet(false)) {
            return;
        }
        this.f12003d.execute(new Runnable() { // from class: Mc
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62099a(BufferedAudioStream.this);
            }
        });
    }
}