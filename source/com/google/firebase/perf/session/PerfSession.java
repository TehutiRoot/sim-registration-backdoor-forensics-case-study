package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.p016v1.PerfSession;
import com.google.firebase.perf.p016v1.SessionVerbosity;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C8578a();

    /* renamed from: a */
    public final String f56233a;

    /* renamed from: b */
    public final Timer f56234b;

    /* renamed from: c */
    public boolean f56235c;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    /* loaded from: classes4.dex */
    public class C8578a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (C8578a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public /* synthetic */ PerfSession(Parcel parcel, C8578a c8578a) {
        this(parcel);
    }

    @Nullable
    public static com.google.firebase.perf.p016v1.PerfSession[] buildAndSort(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.p016v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.p016v1.PerfSession[list.size()];
        com.google.firebase.perf.p016v1.PerfSession build = list.get(0).build();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.p016v1.PerfSession build2 = list.get(i).build();
            if (!z && list.get(i).isVerbose()) {
                perfSessionArr[0] = build2;
                perfSessionArr[i] = build;
                z = true;
            } else {
                perfSessionArr[i] = build2;
            }
        }
        if (!z) {
            perfSessionArr[0] = build;
        }
        return perfSessionArr;
    }

    public static PerfSession createWithId(@NonNull String str) {
        PerfSession perfSession = new PerfSession(str.replace(HelpFormatter.DEFAULT_OPT_PREFIX, ""), new Clock());
        perfSession.setGaugeAndEventCollectionEnabled(shouldCollectGaugesAndEvents());
        return perfSession;
    }

    public static boolean shouldCollectGaugesAndEvents() {
        ConfigResolver configResolver = ConfigResolver.getInstance();
        if (configResolver.isPerformanceMonitoringEnabled() && Math.random() < configResolver.getSessionsSamplingRate()) {
            return true;
        }
        return false;
    }

    public com.google.firebase.perf.p016v1.PerfSession build() {
        PerfSession.Builder sessionId = com.google.firebase.perf.p016v1.PerfSession.newBuilder().setSessionId(this.f56233a);
        if (this.f56235c) {
            sessionId.addSessionVerbosity(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return sessionId.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer getTimer() {
        return this.f56234b;
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.f56235c;
    }

    public boolean isSessionRunningTooLong() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f56234b.getDurationMicros()) > ConfigResolver.getInstance().getSessionsMaxDurationMinutes()) {
            return true;
        }
        return false;
    }

    public boolean isVerbose() {
        return this.f56235c;
    }

    public String sessionId() {
        return this.f56233a;
    }

    public void setGaugeAndEventCollectionEnabled(boolean z) {
        this.f56235c = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.f56233a);
        parcel.writeByte(this.f56235c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f56234b, 0);
    }

    @VisibleForTesting(otherwise = 3)
    public PerfSession(String str, Clock clock) {
        this.f56235c = false;
        this.f56233a = str;
        this.f56234b = clock.getTime();
    }

    public PerfSession(Parcel parcel) {
        this.f56235c = false;
        this.f56233a = parcel.readString();
        this.f56235c = parcel.readByte() != 0;
        this.f56234b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
