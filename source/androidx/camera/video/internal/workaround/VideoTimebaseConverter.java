package androidx.camera.video.internal.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.TimeProvider;

@RequiresApi(21)
/* loaded from: classes.dex */
public class VideoTimebaseConverter {

    /* renamed from: a */
    public final TimeProvider f12106a;

    /* renamed from: b */
    public long f12107b = -1;

    /* renamed from: c */
    public Timebase f12108c;

    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2679a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12109a;

        static {
            int[] iArr = new int[Timebase.values().length];
            f12109a = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12109a[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VideoTimebaseConverter(@NonNull TimeProvider timeProvider, @Nullable Timebase timebase) {
        this.f12106a = timeProvider;
        this.f12108c = timebase;
    }

    /* renamed from: a */
    public final long m61935a() {
        long j = Long.MAX_VALUE;
        long j2 = 0;
        for (int i = 0; i < 3; i++) {
            long uptimeUs = this.f12106a.uptimeUs();
            long realtimeUs = this.f12106a.realtimeUs();
            long uptimeUs2 = this.f12106a.uptimeUs();
            long j3 = uptimeUs2 - uptimeUs;
            if (i == 0 || j3 < j) {
                j2 = realtimeUs - ((uptimeUs + uptimeUs2) >> 1);
                j = j3;
            }
        }
        return Math.max(0L, j2);
    }

    /* renamed from: b */
    public final boolean m61934b(long j) {
        if (Math.abs(j - this.f12106a.realtimeUs()) < Math.abs(j - this.f12106a.uptimeUs())) {
            return true;
        }
        return false;
    }

    public long convertToUptimeUs(long j) {
        if (this.f12108c == null) {
            if (m61934b(j)) {
                this.f12108c = Timebase.REALTIME;
            } else {
                this.f12108c = Timebase.UPTIME;
            }
            Logger.m63230d("VideoTimebaseConverter", "Detect input timebase = " + this.f12108c);
        }
        int i = C2679a.f12109a[this.f12108c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return j;
            }
            throw new AssertionError("Unknown timebase: " + this.f12108c);
        }
        if (this.f12107b == -1) {
            this.f12107b = m61935a();
            Logger.m63230d("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f12107b);
        }
        return j - this.f12107b;
    }
}
