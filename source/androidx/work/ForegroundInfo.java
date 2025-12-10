package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ForegroundInfo {

    /* renamed from: a */
    public final int f38231a;

    /* renamed from: b */
    public final int f38232b;

    /* renamed from: c */
    public final Notification f38233c;

    public ForegroundInfo(int i, @NonNull Notification notification) {
        this(i, notification, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f38231a != foregroundInfo.f38231a || this.f38232b != foregroundInfo.f38232b) {
            return false;
        }
        return this.f38233c.equals(foregroundInfo.f38233c);
    }

    public int getForegroundServiceType() {
        return this.f38232b;
    }

    @NonNull
    public Notification getNotification() {
        return this.f38233c;
    }

    public int getNotificationId() {
        return this.f38231a;
    }

    public int hashCode() {
        return (((this.f38231a * 31) + this.f38232b) * 31) + this.f38233c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f38231a + ", mForegroundServiceType=" + this.f38232b + ", mNotification=" + this.f38233c + '}';
    }

    public ForegroundInfo(int i, @NonNull Notification notification, int i2) {
        this.f38231a = i;
        this.f38233c = notification;
        this.f38232b = i2;
    }
}
