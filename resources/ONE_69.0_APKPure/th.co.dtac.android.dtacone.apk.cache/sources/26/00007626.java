package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ForegroundInfo {

    /* renamed from: a */
    public final int f38319a;

    /* renamed from: b */
    public final int f38320b;

    /* renamed from: c */
    public final Notification f38321c;

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
        if (this.f38319a != foregroundInfo.f38319a || this.f38320b != foregroundInfo.f38320b) {
            return false;
        }
        return this.f38321c.equals(foregroundInfo.f38321c);
    }

    public int getForegroundServiceType() {
        return this.f38320b;
    }

    @NonNull
    public Notification getNotification() {
        return this.f38321c;
    }

    public int getNotificationId() {
        return this.f38319a;
    }

    public int hashCode() {
        return (((this.f38319a * 31) + this.f38320b) * 31) + this.f38321c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f38319a + ", mForegroundServiceType=" + this.f38320b + ", mNotification=" + this.f38321c + '}';
    }

    public ForegroundInfo(int i, @NonNull Notification notification, int i2) {
        this.f38319a = i;
        this.f38321c = notification;
        this.f38320b = i2;
    }
}