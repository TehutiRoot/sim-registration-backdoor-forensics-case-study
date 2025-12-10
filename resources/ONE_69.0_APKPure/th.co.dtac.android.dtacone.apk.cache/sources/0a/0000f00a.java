package org.apache.commons.p028io.input;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.p028io.input.ObservableInputStream;

/* renamed from: org.apache.commons.io.input.TimestampedObserver */
/* loaded from: classes6.dex */
public class TimestampedObserver extends ObservableInputStream.Observer {

    /* renamed from: a */
    public volatile Instant f73566a;

    /* renamed from: b */
    public final Instant f73567b;

    public TimestampedObserver() {
        Instant now;
        now = Instant.now();
        this.f73567b = now;
    }

    @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
    public void closed() throws IOException {
        Instant now;
        now = Instant.now();
        this.f73566a = now;
    }

    public Instant getCloseInstant() {
        return this.f73566a;
    }

    public Instant getOpenInstant() {
        return this.f73567b;
    }

    public Duration getOpenToCloseDuration() {
        Duration between;
        between = Duration.between(this.f73567b, this.f73566a);
        return between;
    }

    public Duration getOpenToNowDuration() {
        Instant now;
        Duration between;
        Instant instant = this.f73567b;
        now = Instant.now();
        between = Duration.between(instant, now);
        return between;
    }

    public boolean isClosed() {
        if (this.f73566a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "TimestampedObserver [openInstant=" + this.f73567b + ", closeInstant=" + this.f73566a + "]";
    }
}