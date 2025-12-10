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
    public final AudioStream f11918g;

    /* renamed from: h */
    public final int f11919h;

    /* renamed from: i */
    public final int f11920i;

    /* renamed from: j */
    public final int f11921j;

    /* renamed from: l */
    public int f11923l;

    /* renamed from: a */
    public final AtomicBoolean f11912a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f11913b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Queue f11914c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final Executor f11915d = CameraXExecutors.newSequentialExecutor(CameraXExecutors.audioExecutor());

    /* renamed from: e */
    public final Object f11916e = new Object();

    /* renamed from: f */
    public C2651a f11917f = null;

    /* renamed from: k */
    public final AtomicBoolean f11922k = new AtomicBoolean(false);

    /* renamed from: androidx.camera.video.internal.audio.BufferedAudioStream$a */
    /* loaded from: classes.dex */
    public static class C2651a {

        /* renamed from: a */
        public final int f11924a;

        /* renamed from: b */
        public final int f11925b;

        /* renamed from: c */
        public final ByteBuffer f11926c;

        /* renamed from: d */
        public long f11927d;

        public C2651a(ByteBuffer byteBuffer, AudioStream.PacketInfo packetInfo, int i, int i2) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit == packetInfo.getSizeInBytes()) {
                this.f11924a = i;
                this.f11925b = i2;
                this.f11926c = byteBuffer;
                this.f11927d = packetInfo.getTimestampNs();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + packetInfo.getSizeInBytes());
        }

        /* renamed from: a */
        public int m62134a() {
            return this.f11926c.remaining();
        }

        /* renamed from: b */
        public AudioStream.PacketInfo m62133b(ByteBuffer byteBuffer) {
            int remaining;
            long j = this.f11927d;
            int position = this.f11926c.position();
            int position2 = byteBuffer.position();
            if (this.f11926c.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f11927d += AudioUtils.frameCountToDurationNs(AudioUtils.sizeToFrameCount(remaining, this.f11924a), this.f11925b);
                ByteBuffer duplicate = this.f11926c.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = this.f11926c.remaining();
                byteBuffer.put(this.f11926c).limit(position2 + remaining).position(position2);
            }
            this.f11926c.position(position + remaining);
            return AudioStream.PacketInfo.m62161of(remaining, j);
        }
    }

    public BufferedAudioStream(@NonNull AudioStream audioStream, @NonNull AudioSettings audioSettings) {
        boolean z;
        this.f11918g = audioStream;
        int bytesPerFrame = audioSettings.getBytesPerFrame();
        this.f11919h = bytesPerFrame;
        int sampleRate = audioSettings.getSampleRate();
        this.f11920i = sampleRate;
        if (bytesPerFrame > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "mBytesPerFrame must be greater than 0.");
        Preconditions.checkArgument(((long) sampleRate) > 0, "mSampleRate must be greater than 0.");
        this.f11921j = 500;
        this.f11923l = bytesPerFrame * 1024;
    }

    /* renamed from: a */
    public static /* synthetic */ void m62151a(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62139m();
    }

    /* renamed from: b */
    public static /* synthetic */ void m62150b(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62140l();
    }

    /* renamed from: c */
    public static /* synthetic */ void m62149c(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62142j();
    }

    /* renamed from: d */
    public static /* synthetic */ void m62148d(BufferedAudioStream bufferedAudioStream, int i) {
        bufferedAudioStream.m62138n(i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m62147e(BufferedAudioStream bufferedAudioStream, AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        bufferedAudioStream.m62141k(audioStreamCallback, executor);
    }

    /* renamed from: f */
    public static /* synthetic */ void m62146f(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.m62143i();
    }

    /* renamed from: g */
    private void m62145g() {
        Preconditions.checkState(!this.f11913b.get(), "AudioStream has been released.");
    }

    /* renamed from: h */
    private void m62144h() {
        Preconditions.checkState(this.f11912a.get(), "AudioStream has not been started.");
    }

    /* renamed from: i */
    public final void m62143i() {
        if (!this.f11922k.get()) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f11923l);
        C2651a c2651a = new C2651a(allocateDirect, this.f11918g.read(allocateDirect), this.f11919h, this.f11920i);
        int i = this.f11921j;
        synchronized (this.f11916e) {
            try {
                this.f11914c.offer(c2651a);
                while (this.f11914c.size() > i) {
                    this.f11914c.poll();
                    Logger.m63223w("BufferedAudioStream", "Drop audio data due to full of queue.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f11922k.get()) {
            this.f11915d.execute(new Runnable() { // from class: Rc
                {
                    BufferedAudioStream.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BufferedAudioStream.m62146f(BufferedAudioStream.this);
                }
            });
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m62142j() {
        this.f11922k.set(false);
        this.f11918g.release();
        synchronized (this.f11916e) {
            this.f11917f = null;
            this.f11914c.clear();
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m62141k(AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        this.f11918g.setCallback(audioStreamCallback, executor);
    }

    /* renamed from: l */
    public final /* synthetic */ void m62140l() {
        try {
            this.f11918g.start();
            m62137o();
        } catch (AudioStream.AudioStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void m62139m() {
        this.f11922k.set(false);
        this.f11918g.stop();
        synchronized (this.f11916e) {
            this.f11917f = null;
            this.f11914c.clear();
        }
    }

    /* renamed from: o */
    public final void m62137o() {
        if (this.f11922k.getAndSet(true)) {
            return;
        }
        m62143i();
    }

    /* renamed from: p */
    public final void m62138n(int i) {
        int i2 = this.f11923l;
        if (i2 == i) {
            return;
        }
        int i3 = this.f11919h;
        this.f11923l = (i / i3) * i3;
        Logger.m63230d("BufferedAudioStream", "Update buffer size from " + i2 + " to " + this.f11923l);
    }

    /* renamed from: q */
    public final void m62135q(final int i) {
        this.f11915d.execute(new Runnable() { // from class: Pc
            {
                BufferedAudioStream.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62148d(BufferedAudioStream.this, i);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        boolean z;
        m62145g();
        m62144h();
        m62135q(byteBuffer.remaining());
        AudioStream.PacketInfo m62161of = AudioStream.PacketInfo.m62161of(0, 0L);
        do {
            synchronized (this.f11916e) {
                try {
                    C2651a c2651a = this.f11917f;
                    this.f11917f = null;
                    if (c2651a == null) {
                        c2651a = (C2651a) this.f11914c.poll();
                    }
                    if (c2651a != null) {
                        m62161of = c2651a.m62133b(byteBuffer);
                        if (c2651a.m62134a() > 0) {
                            this.f11917f = c2651a;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (m62161of.getSizeInBytes() <= 0 && this.f11912a.get() && !this.f11913b.get()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    Logger.m63222w("BufferedAudioStream", "Interruption while waiting for audio data", e);
                }
            }
        } while (z);
        return m62161of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.f11913b.getAndSet(true)) {
            return;
        }
        this.f11915d.execute(new Runnable() { // from class: Qc
            {
                BufferedAudioStream.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62149c(BufferedAudioStream.this);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable final AudioStream.AudioStreamCallback audioStreamCallback, @Nullable final Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.f11912a.get(), "AudioStream can not be started when setCallback.");
        m62145g();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.f11915d.execute(new Runnable() { // from class: Nc
            {
                BufferedAudioStream.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62147e(BufferedAudioStream.this, audioStreamCallback, executor);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException, IllegalStateException {
        m62145g();
        if (this.f11912a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: Oc
            {
                BufferedAudioStream.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62150b(BufferedAudioStream.this);
            }
        }, null);
        this.f11915d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            this.f11912a.set(false);
            throw new AudioStream.AudioStreamException(e);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws IllegalStateException {
        m62145g();
        if (!this.f11912a.getAndSet(false)) {
            return;
        }
        this.f11915d.execute(new Runnable() { // from class: Mc
            {
                BufferedAudioStream.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m62151a(BufferedAudioStream.this);
            }
        });
    }
}
