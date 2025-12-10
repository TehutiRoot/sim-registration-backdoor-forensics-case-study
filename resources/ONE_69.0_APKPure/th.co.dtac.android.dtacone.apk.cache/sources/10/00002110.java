package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.SilentAudioStream;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(21)
/* loaded from: classes.dex */
public class SilentAudioStream implements AudioStream {

    /* renamed from: a */
    public final AtomicBoolean f12016a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f12017b = new AtomicBoolean(false);

    /* renamed from: c */
    public final int f12018c;

    /* renamed from: d */
    public final int f12019d;

    /* renamed from: e */
    public byte[] f12020e;

    /* renamed from: f */
    public long f12021f;

    /* renamed from: g */
    public AudioStream.AudioStreamCallback f12022g;

    /* renamed from: h */
    public Executor f12023h;

    public SilentAudioStream(@NonNull AudioSettings audioSettings) {
        this.f12018c = audioSettings.getBytesPerFrame();
        this.f12019d = audioSettings.getSampleRate();
    }

    /* renamed from: a */
    public static /* synthetic */ void m62080a(AudioStream.AudioStreamCallback audioStreamCallback) {
        audioStreamCallback.onSilenceStateChanged(true);
    }

    /* renamed from: b */
    public static void m62079b(long j) {
        long m62076e = j - m62076e();
        if (m62076e > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(m62076e));
            } catch (InterruptedException e) {
                Logger.m63170w("SilentAudioStream", "Ignore interruption", e);
            }
        }
    }

    /* renamed from: c */
    private void m62078c() {
        Preconditions.checkState(!this.f12017b.get(), "AudioStream has been released.");
    }

    /* renamed from: d */
    private void m62077d() {
        Preconditions.checkState(this.f12016a.get(), "AudioStream has not been started.");
    }

    /* renamed from: e */
    public static long m62076e() {
        return System.nanoTime();
    }

    /* renamed from: g */
    public final void m62074g() {
        final AudioStream.AudioStreamCallback audioStreamCallback = this.f12022g;
        Executor executor = this.f12023h;
        if (audioStreamCallback != null && executor != null) {
            executor.execute(new Runnable() { // from class: TJ1
                @Override // java.lang.Runnable
                public final void run() {
                    SilentAudioStream.m62080a(AudioStream.AudioStreamCallback.this);
                }
            });
        }
    }

    /* renamed from: h */
    public final void m62073h(ByteBuffer byteBuffer, int i) {
        boolean z;
        if (i <= byteBuffer.remaining()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        byte[] bArr = this.f12020e;
        if (bArr == null || bArr.length < i) {
            this.f12020e = new byte[i];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f12020e, 0, i).limit(i + position).position(position);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        m62078c();
        m62077d();
        long sizeToFrameCount = AudioUtils.sizeToFrameCount(byteBuffer.remaining(), this.f12018c);
        int frameCountToSize = (int) AudioUtils.frameCountToSize(sizeToFrameCount, this.f12018c);
        if (frameCountToSize <= 0) {
            return AudioStream.PacketInfo.m62109of(0, this.f12021f);
        }
        long frameCountToDurationNs = this.f12021f + AudioUtils.frameCountToDurationNs(sizeToFrameCount, this.f12019d);
        m62079b(frameCountToDurationNs);
        m62073h(byteBuffer, frameCountToSize);
        AudioStream.PacketInfo m62109of = AudioStream.PacketInfo.m62109of(frameCountToSize, this.f12021f);
        this.f12021f = frameCountToDurationNs;
        return m62109of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.f12017b.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.f12016a.get(), "AudioStream can not be started when setCallback.");
        m62078c();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.f12022g = audioStreamCallback;
        this.f12023h = executor;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        m62078c();
        if (this.f12016a.getAndSet(true)) {
            return;
        }
        this.f12021f = m62076e();
        m62074g();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        m62078c();
        this.f12016a.set(false);
    }
}