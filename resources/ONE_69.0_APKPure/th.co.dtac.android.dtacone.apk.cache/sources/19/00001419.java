package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;
import java.util.Iterator;

/* renamed from: V60 */
/* loaded from: classes2.dex */
public class V60 extends GnssStatusCompat {

    /* renamed from: a */
    public final GpsStatus f6809a;

    /* renamed from: b */
    public int f6810b;

    /* renamed from: c */
    public Iterator f6811c;

    /* renamed from: d */
    public int f6812d;

    /* renamed from: e */
    public GpsSatellite f6813e;

    public V60(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.f6809a = gpsStatus2;
        this.f6810b = -1;
        this.f6811c = gpsStatus2.getSatellites().iterator();
        this.f6812d = -1;
        this.f6813e = null;
    }

    /* renamed from: a */
    public static int m66034a(int i) {
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
    public static int m66032c(int i) {
        int m66034a = m66034a(i);
        if (m66034a != 2) {
            if (m66034a != 3) {
                if (m66034a == 5) {
                    return i - 200;
                }
                return i;
            }
            return i - 64;
        }
        return i + 87;
    }

    /* renamed from: b */
    public final GpsSatellite m66033b(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f6809a) {
            try {
                if (i < this.f6812d) {
                    this.f6811c = this.f6809a.getSatellites().iterator();
                    this.f6812d = -1;
                }
                while (true) {
                    int i2 = this.f6812d;
                    if (i2 >= i) {
                        break;
                    }
                    this.f6812d = i2 + 1;
                    if (!this.f6811c.hasNext()) {
                        this.f6813e = null;
                        break;
                    }
                    this.f6813e = (GpsSatellite) this.f6811c.next();
                }
                gpsSatellite = this.f6813e;
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
        if (!(obj instanceof V60)) {
            return false;
        }
        return this.f6809a.equals(((V60) obj).f6809a);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        return m66033b(i).getAzimuth();
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
        return m66033b(i).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return m66034a(m66033b(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        return m66033b(i).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i;
        synchronized (this.f6809a) {
            try {
                if (this.f6810b == -1) {
                    for (GpsSatellite gpsSatellite : this.f6809a.getSatellites()) {
                        this.f6810b++;
                    }
                    this.f6810b++;
                }
                i = this.f6810b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            return m66033b(i).getPrn();
        }
        return m66032c(m66033b(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        return m66033b(i).hasAlmanac();
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
        return m66033b(i).hasEphemeris();
    }

    public int hashCode() {
        return this.f6809a.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        return m66033b(i).usedInFix();
    }
}