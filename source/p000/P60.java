package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;
import java.util.Iterator;

/* renamed from: P60 */
/* loaded from: classes2.dex */
public class P60 extends GnssStatusCompat {

    /* renamed from: a */
    public final GpsStatus f4644a;

    /* renamed from: b */
    public int f4645b;

    /* renamed from: c */
    public Iterator f4646c;

    /* renamed from: d */
    public int f4647d;

    /* renamed from: e */
    public GpsSatellite f4648e;

    public P60(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.f4644a = gpsStatus2;
        this.f4645b = -1;
        this.f4646c = gpsStatus2.getSatellites().iterator();
        this.f4647d = -1;
        this.f4648e = null;
    }

    /* renamed from: a */
    public static int m66914a(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i > 200 && i <= 235) {
            return 5;
        }
        if (i >= 193 && i <= 200) {
            return 4;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m66912c(int i) {
        int m66914a = m66914a(i);
        if (m66914a != 2) {
            if (m66914a != 3) {
                if (m66914a == 5) {
                    return i - 200;
                }
                return i;
            }
            return i - 64;
        }
        return i + 87;
    }

    /* renamed from: b */
    public final GpsSatellite m66913b(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f4644a) {
            try {
                if (i < this.f4647d) {
                    this.f4646c = this.f4644a.getSatellites().iterator();
                    this.f4647d = -1;
                }
                while (true) {
                    int i2 = this.f4647d;
                    if (i2 >= i) {
                        break;
                    }
                    this.f4647d = i2 + 1;
                    if (!this.f4646c.hasNext()) {
                        this.f4648e = null;
                        break;
                    }
                    this.f4648e = (GpsSatellite) this.f4646c.next();
                }
                gpsSatellite = this.f4648e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P60)) {
            return false;
        }
        return this.f4644a.equals(((P60) obj).f4644a);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        return m66913b(i).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        return m66913b(i).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return m66914a(m66913b(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        return m66913b(i).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i;
        synchronized (this.f4644a) {
            try {
                if (this.f4645b == -1) {
                    for (GpsSatellite gpsSatellite : this.f4644a.getSatellites()) {
                        this.f4645b++;
                    }
                    this.f4645b++;
                }
                i = this.f4645b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            return m66913b(i).getPrn();
        }
        return m66912c(m66913b(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        return m66913b(i).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        return m66913b(i).hasEphemeris();
    }

    public int hashCode() {
        return this.f4644a.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        return m66913b(i).usedInFix();
    }
}
