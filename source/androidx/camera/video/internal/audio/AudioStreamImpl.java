package androidx.camera.video.internal.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.AudioStreamImpl;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AudioStreamImpl implements AudioStream {

    /* renamed from: a */
    public final AudioRecord f11900a;

    /* renamed from: b */
    public final AudioSettings f11901b;

    /* renamed from: c */
    public final AtomicBoolean f11902c = new AtomicBoolean(false);

    /* renamed from: d */
    public final AtomicBoolean f11903d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicReference f11904e = new AtomicReference(null);

    /* renamed from: f */
    public final int f11905f;

    /* renamed from: g */
    public final int f11906g;

    /* renamed from: h */
    public AudioStream.AudioStreamCallback f11907h;

    /* renamed from: i */
    public Executor f11908i;

    /* renamed from: j */
    public long f11909j;

    /* renamed from: k */
    public AudioManager.AudioRecordingCallback f11910k;

    /* renamed from: androidx.camera.video.internal.audio.AudioStreamImpl$a */
    /* loaded from: classes.dex */
    public class C2650a extends AudioManager.AudioRecordingCallback {
        public C2650a() {
            AudioStreamImpl.this = r1;
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List list) {
            for (Object obj : list) {
                AudioRecordingConfiguration m68688a = AbstractC0229D7.m68688a(obj);
                if (Api24Impl.getClientAudioSessionId(m68688a) == AudioStreamImpl.this.f11900a.getAudioSessionId()) {
                    AudioStreamImpl.this.m62152i(Api29Impl.isClientSilenced(m68688a));
                    return;
                }
            }
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioStreamImpl(@NonNull AudioSettings audioSettings, @Nullable Context context) throws IllegalArgumentException, AudioStream.AudioStreamException {
        if (isSettingsSupported(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            this.f11901b = audioSettings;
            this.f11906g = audioSettings.getBytesPerFrame();
            int m62155f = m62155f(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
            Preconditions.checkState(m62155f > 0);
            int i = m62155f * 2;
            this.f11905f = i;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                AudioFormat build = new AudioFormat.Builder().setSampleRate(audioSettings.getSampleRate()).setChannelMask(AudioUtils.channelCountToChannelMask(audioSettings.getChannelCount())).setEncoding(audioSettings.getAudioFormat()).build();
                AudioRecord.Builder createAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
                if (i2 >= 31 && context != null) {
                    Api31Impl.setContext(createAudioRecordBuilder, context);
                }
                Api23Impl.setAudioSource(createAudioRecordBuilder, audioSettings.getAudioSource());
                Api23Impl.setAudioFormat(createAudioRecordBuilder, build);
                Api23Impl.setBufferSizeInBytes(createAudioRecordBuilder, i);
                this.f11900a = Api23Impl.build(createAudioRecordBuilder);
            } else {
                this.f11900a = new AudioRecord(audioSettings.getAudioSource(), audioSettings.getSampleRate(), AudioUtils.channelCountToChannelConfig(audioSettings.getChannelCount()), audioSettings.getAudioFormat(), i);
            }
            if (this.f11900a.getState() == 1) {
                return;
            }
            this.f11900a.release();
            throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(audioSettings.getSampleRate()), Integer.valueOf(audioSettings.getChannelCount()), Integer.valueOf(audioSettings.getAudioFormat())));
    }

    /* renamed from: a */
    public static /* synthetic */ void m62160a(AudioStream.AudioStreamCallback audioStreamCallback, boolean z) {
        audioStreamCallback.onSilenceStateChanged(z);
    }

    /* renamed from: d */
    public static long m62157d(int i, long j, AudioTimestamp audioTimestamp) {
        long frameCountToDurationNs = audioTimestamp.nanoTime + AudioUtils.frameCountToDurationNs(j - audioTimestamp.framePosition, i);
        if (frameCountToDurationNs < 0) {
            return 0L;
        }
        return frameCountToDurationNs;
    }

    /* renamed from: f */
    public static int m62155f(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, AudioUtils.channelCountToChannelConfig(i2), i3);
    }

    /* renamed from: g */
    public static boolean m62154g() {
        if (DeviceQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            return true;
        }
        return false;
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0 || m62155f(i, i2, i3) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m62159b() {
        Preconditions.checkState(!this.f11902c.get(), "AudioStream has been released.");
    }

    /* renamed from: c */
    public final void m62158c() {
        Preconditions.checkState(this.f11903d.get(), "AudioStream has not been started.");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m62156e() {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = -1
            if (r0 < r1) goto L30
            boolean r0 = m62154g()
            if (r0 != 0) goto L30
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r1 = r6.f11900a
            r4 = 0
            int r1 = androidx.camera.video.internal.compat.Api24Impl.getTimestamp(r1, r0, r4)
            if (r1 != 0) goto L29
            androidx.camera.video.internal.audio.AudioSettings r1 = r6.f11901b
            int r1 = r1.getSampleRate()
            long r4 = r6.f11909j
            long r0 = m62157d(r1, r4, r0)
            goto L31
        L29:
            java.lang.String r0 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            androidx.camera.core.Logger.m63223w(r0, r1)
        L30:
            r0 = r2
        L31:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L39
            long r0 = java.lang.System.nanoTime()
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.audio.AudioStreamImpl.m62156e():long");
    }

    /* renamed from: i */
    public void m62152i(final boolean z) {
        Executor executor = this.f11908i;
        final AudioStream.AudioStreamCallback audioStreamCallback = this.f11907h;
        if (executor != null && audioStreamCallback != null && !Objects.equals(this.f11904e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            executor.execute(new Runnable() { // from class: C7
                @Override // java.lang.Runnable
                public final void run() {
                    AudioStreamImpl.m62160a(audioStreamCallback, z);
                }
            });
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        long j;
        m62159b();
        m62158c();
        int read = this.f11900a.read(byteBuffer, this.f11905f);
        if (read > 0) {
            byteBuffer.limit(read);
            j = m62156e();
            this.f11909j += AudioUtils.sizeToFrameCount(read, this.f11906g);
        } else {
            j = 0;
        }
        return AudioStream.PacketInfo.m62161of(read, j);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f11902c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f11910k) != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.f11900a, audioRecordingCallback);
        }
        this.f11900a.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.f11903d.get(), "AudioStream can not be started when setCallback.");
        m62159b();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.f11907h = audioStreamCallback;
        this.f11908i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f11910k;
            if (audioRecordingCallback != null) {
                Api29Impl.unregisterAudioRecordingCallback(this.f11900a, audioRecordingCallback);
            }
            if (audioStreamCallback == null) {
                return;
            }
            if (this.f11910k == null) {
                this.f11910k = new C2650a();
            }
            Api29Impl.registerAudioRecordingCallback(this.f11900a, executor, this.f11910k);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        m62159b();
        boolean z = true;
        if (this.f11903d.getAndSet(true)) {
            return;
        }
        this.f11900a.startRecording();
        boolean z2 = false;
        if (this.f11900a.getRecordingState() == 3) {
            this.f11909j = 0L;
            this.f11904e.set(null);
            if (Build.VERSION.SDK_INT >= 29) {
                AudioRecordingConfiguration activeRecordingConfiguration = Api29Impl.getActiveRecordingConfiguration(this.f11900a);
                z2 = (activeRecordingConfiguration == null || !Api29Impl.isClientSilenced(activeRecordingConfiguration)) ? false : false;
            }
            m62152i(z2);
            return;
        }
        this.f11903d.set(false);
        throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.f11900a.getRecordingState());
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        m62159b();
        if (!this.f11903d.getAndSet(false)) {
            return;
        }
        this.f11900a.stop();
        if (this.f11900a.getRecordingState() != 1) {
            Logger.m63223w("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f11900a.getRecordingState());
        }
    }
}
