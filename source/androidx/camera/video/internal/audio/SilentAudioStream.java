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
    public final AtomicBoolean f11928a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f11929b = new AtomicBoolean(false);

    /* renamed from: c */
    public final int f11930c;

    /* renamed from: d */
    public final int f11931d;

    /* renamed from: e */
    public byte[] f11932e;

    /* renamed from: f */
    public long f11933f;

    /* renamed from: g */
    public AudioStream.AudioStreamCallback f11934g;

    /* renamed from: h */
    public Executor f11935h;

    public SilentAudioStream(@NonNull AudioSettings audioSettings) {
        this.f11930c = audioSettings.getBytesPerFrame();
        this.f11931d = audioSettings.getSampleRate();
    }

    /* renamed from: a */
    public static /* synthetic */ void m62132a(AudioStream.AudioStreamCallback audioStreamCallback) {
        audioStreamCallback.onSilenceStateChanged(true);
    }

    /* renamed from: b */
    public static void m62131b(long j) {
        long m62128e = j - m62128e();
        if (m62128e > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(m62128e));
            } catch (InterruptedException e) {
                Logger.m63222w("SilentAudioStream", "Ignore interruption", e);
            }
        }
    }

    /* renamed from: c */
    private void m62130c() {
        Preconditions.checkState(!this.f11929b.get(), "AudioStream has been released.");
    }

    /* renamed from: d */
    private void m62129d() {
        Preconditions.checkState(this.f11928a.get(), "AudioStream has not been started.");
    }

    /* renamed from: e */
    public static long m62128e() {
        return System.nanoTime();
    }

    /* renamed from: g */
    public final void m62126g() {
        final AudioStream.AudioStreamCallback audioStreamCallback = this.f11934g;
        Executor executor = this.f11935h;
        if (audioStreamCallback != null && executor != null) {
            executor.execute(new Runnable() { // from class: WI1
                @Override // java.lang.Runnable
                public final void run() {
                    SilentAudioStream.m62132a(audioStreamCallback);
                }
            });
        }
    }

    /* renamed from: h */
    public final void m62125h(ByteBuffer byteBuffer, int i) {
        boolean z;
        if (i <= byteBuffer.remaining()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        byte[] bArr = this.f11932e;
        if (bArr == null || bArr.length < i) {
            this.f11932e = new byte[i];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f11932e, 0, i).limit(i + position).position(position);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        m62130c();
        m62129d();
        long sizeToFrameCount = AudioUtils.sizeToFrameCount(byteBuffer.remaining(), this.f11930c);
        int frameCountToSize = (int) AudioUtils.frameCountToSize(sizeToFrameCount, this.f11930c);
        if (frameCountToSize <= 0) {
            return AudioStream.PacketInfo.m62161of(0, this.f11933f);
        }
        long frameCountToDurationNs = this.f11933f + AudioUtils.frameCountToDurationNs(sizeToFrameCount, this.f11931d);
        m62131b(frameCountToDurationNs);
        m62125h(byteBuffer, frameCountToSize);
        AudioStream.PacketInfo m62161of = AudioStream.PacketInfo.m62161of(frameCountToSize, this.f11933f);
        this.f11933f = frameCountToDurationNs;
        return m62161of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.f11929b.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.f11928a.get(), "AudioStream can not be started when setCallback.");
        m62130c();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.f11934g = audioStreamCallback;
        this.f11935h = executor;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        m62130c();
        if (this.f11928a.getAndSet(true)) {
            return;
        }
        this.f11933f = m62128e();
        m62126g();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        m62130c();
        this.f11928a.set(false);
    }
}
