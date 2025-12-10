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
    public final TimeProvider f12194a;

    /* renamed from: b */
    public long f12195b = -1;

    /* renamed from: c */
    public Timebase f12196c;

    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2661a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12197a;

        static {
            int[] iArr = new int[Timebase.values().length];
            f12197a = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12197a[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VideoTimebaseConverter(@NonNull TimeProvider timeProvider, @Nullable Timebase timebase) {
        this.f12194a = timeProvider;
        this.f12196c = timebase;
    }

    /* renamed from: a */
    public final long m61883a() {
        long j = Long.MAX_VALUE;
        long j2 = 0;
        for (int i = 0; i < 3; i++) {
            long uptimeUs = this.f12194a.uptimeUs();
            long realtimeUs = this.f12194a.realtimeUs();
            long uptimeUs2 = this.f12194a.uptimeUs();
            long j3 = uptimeUs2 - uptimeUs;
            if (i == 0 || j3 < j) {
                j2 = realtimeUs - ((uptimeUs + uptimeUs2) >> 1);
                j = j3;
            }
        }
        return Math.max(0L, j2);
    }

    /* renamed from: b */
    public final boolean m61882b(long j) {
        if (Math.abs(j - this.f12194a.realtimeUs()) < Math.abs(j - this.f12194a.uptimeUs())) {
            return true;
        }
        return false;
    }

    public long convertToUptimeUs(long j) {
        if (this.f12196c == null) {
            if (m61882b(j)) {
                this.f12196c = Timebase.REALTIME;
            } else {
                this.f12196c = Timebase.UPTIME;
            }
            Logger.m63178d("VideoTimebaseConverter", "Detect input timebase = " + this.f12196c);
        }
        int i = C2661a.f12197a[this.f12196c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return j;
            }
            throw new AssertionError("Unknown timebase: " + this.f12196c);
        }
        if (this.f12195b == -1) {
            this.f12195b = m61883a();
            Logger.m63178d("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f12195b);
        }
        return j - this.f12195b;
    }
}