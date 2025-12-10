package p000;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;

/* renamed from: J60 */
/* loaded from: classes2.dex */
public class J60 extends GnssStatusCompat {

    /* renamed from: a */
    public final GnssStatus f2703a;

    /* renamed from: J60$a */
    /* loaded from: classes2.dex */
    public static class C0649a {
        @DoNotInline
        /* renamed from: a */
        public static float m67783a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m67782b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    /* renamed from: J60$b */
    /* loaded from: classes2.dex */
    public static class C0650b {
        @DoNotInline
        /* renamed from: a */
        public static float m67781a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m67780b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public J60(Object obj) {
        this.f2703a = A60.m69139a(Preconditions.checkNotNull(A60.m69139a(obj)));
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof J60) {
            equals = this.f2703a.equals(((J60) obj).f2703a);
            return equals;
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        float azimuthDegrees;
        azimuthDegrees = this.f2703a.getAzimuthDegrees(i);
        return azimuthDegrees;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0650b.m67781a(this.f2703a, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0649a.m67783a(this.f2703a, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        float cn0DbHz;
        cn0DbHz = this.f2703a.getCn0DbHz(i);
        return cn0DbHz;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        int constellationType;
        constellationType = this.f2703a.getConstellationType(i);
        return constellationType;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        float elevationDegrees;
        elevationDegrees = this.f2703a.getElevationDegrees(i);
        return elevationDegrees;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int satelliteCount;
        satelliteCount = this.f2703a.getSatelliteCount();
        return satelliteCount;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        int svid;
        svid = this.f2703a.getSvid(i);
        return svid;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        boolean hasAlmanacData;
        hasAlmanacData = this.f2703a.hasAlmanacData(i);
        return hasAlmanacData;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0650b.m67780b(this.f2703a, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0649a.m67782b(this.f2703a, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        boolean hasEphemerisData;
        hasEphemerisData = this.f2703a.hasEphemerisData(i);
        return hasEphemerisData;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f2703a.hashCode();
        return hashCode;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        boolean usedInFix;
        usedInFix = this.f2703a.usedInFix(i);
        return usedInFix;
    }
}
