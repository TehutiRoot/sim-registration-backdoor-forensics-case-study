package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.Preconditions;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.p026ws.WebSocketProtocol;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExifData {

    /* renamed from: c */
    public static final String[] f11285c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d */
    public static final C17050xT[] f11286d;

    /* renamed from: e */
    public static final C17050xT[] f11287e;

    /* renamed from: f */
    public static final C17050xT[] f11288f;

    /* renamed from: g */
    public static final C17050xT[] f11289g;

    /* renamed from: h */
    public static final C17050xT[] f11290h;

    /* renamed from: i */
    public static final C17050xT[][] f11291i;

    /* renamed from: j */
    public static final HashSet f11292j;

    /* renamed from: a */
    public final List f11293a;

    /* renamed from: b */
    public final ByteOrder f11294b;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: c */
        public static final Pattern f11295c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        public static final Pattern f11296d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        public static final Pattern f11297e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        public static final List f11298f = Collections.list(new C2536a());

        /* renamed from: a */
        public final List f11299a = Collections.list(new C2537b());

        /* renamed from: b */
        public final ByteOrder f11300b;

        /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder$a */
        /* loaded from: classes.dex */
        public class C2536a implements Enumeration {

            /* renamed from: a */
            public int f11301a = 0;

            @Override // java.util.Enumeration
            /* renamed from: a */
            public HashMap nextElement() {
                C17050xT[] c17050xTArr;
                HashMap hashMap = new HashMap();
                for (C17050xT c17050xT : ExifData.f11291i[this.f11301a]) {
                    hashMap.put(c17050xT.f108379b, c17050xT);
                }
                this.f11301a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.f11301a < ExifData.f11291i.length) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder$b */
        /* loaded from: classes.dex */
        public class C2537b implements Enumeration {

            /* renamed from: a */
            public int f11302a = 0;

            public C2537b() {
                Builder.this = r1;
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map nextElement() {
                this.f11302a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.f11302a < ExifData.f11291i.length) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder$c */
        /* loaded from: classes.dex */
        public class C2538c implements Enumeration {

            /* renamed from: a */
            public final Enumeration f11304a;

            public C2538c() {
                Builder.this = r1;
                this.f11304a = Collections.enumeration(r1.f11299a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map nextElement() {
                return new HashMap((Map) this.f11304a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f11304a.hasMoreElements();
            }
        }

        public Builder(ByteOrder byteOrder) {
            this.f11300b = byteOrder;
        }

        /* renamed from: a */
        public static Pair m62861a(String str) {
            int intValue;
            int i;
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair m62861a = m62861a(split[0]);
                if (((Integer) m62861a.first).intValue() == 2) {
                    return m62861a;
                }
                for (int i2 = 1; i2 < split.length; i2++) {
                    Pair m62861a2 = m62861a(split[i2]);
                    if (!((Integer) m62861a2.first).equals(m62861a.first) && !((Integer) m62861a2.second).equals(m62861a.first)) {
                        intValue = -1;
                    } else {
                        intValue = ((Integer) m62861a.first).intValue();
                    }
                    if (((Integer) m62861a.second).intValue() != -1 && (((Integer) m62861a2.first).equals(m62861a.second) || ((Integer) m62861a2.second).equals(m62861a.second))) {
                        i = ((Integer) m62861a.second).intValue();
                    } else {
                        i = -1;
                    }
                    if (intValue == -1 && i == -1) {
                        return new Pair(2, -1);
                    }
                    if (intValue == -1) {
                        m62861a = new Pair(Integer.valueOf(i), -1);
                    } else if (i == -1) {
                        m62861a = new Pair(Integer.valueOf(intValue), -1);
                    }
                }
                return m62861a;
            } else if (str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                String[] split2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair(10, 5);
                            }
                            return new Pair(5, -1);
                        }
                        return new Pair(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i3 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i3 >= 0 && parseLong <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return new Pair(3, 4);
                        }
                        if (i3 < 0) {
                            return new Pair(9, -1);
                        }
                        return new Pair(4, -1);
                    } catch (NumberFormatException unused2) {
                        Double.parseDouble(str);
                        return new Pair(12, -1);
                    }
                } catch (NumberFormatException unused3) {
                    return new Pair(2, -1);
                }
            }
        }

        /* renamed from: b */
        public final void m62860b(String str, String str2, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            m62859c(str, str2, list);
        }

        @NonNull
        public ExifData build() {
            ArrayList list = Collections.list(new C2538c());
            if (!((Map) list.get(1)).isEmpty()) {
                m62860b(ExifInterface.TAG_EXPOSURE_PROGRAM, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_EXIF_VERSION, "0230", list);
                m62860b(ExifInterface.TAG_COMPONENTS_CONFIGURATION, "1,2,3,0", list);
                m62860b(ExifInterface.TAG_METERING_MODE, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                m62860b(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, String.valueOf(2), list);
                m62860b(ExifInterface.TAG_FILE_SOURCE, String.valueOf(3), list);
                m62860b(ExifInterface.TAG_SCENE_TYPE, String.valueOf(1), list);
                m62860b(ExifInterface.TAG_CUSTOM_RENDERED, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_SCENE_CAPTURE_TYPE, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_CONTRAST, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_SATURATION, String.valueOf(0), list);
                m62860b(ExifInterface.TAG_SHARPNESS, String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                m62860b(ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                m62860b(ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                m62860b(ExifInterface.TAG_GPS_TRACK_REF, "T", list);
                m62860b(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, "T", list);
                m62860b(ExifInterface.TAG_GPS_DEST_BEARING_REF, "T", list);
                m62860b(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new ExifData(this.f11300b, list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:177:0x018c, code lost:
            if (r7 != r0) goto L98;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m62859c(java.lang.String r18, java.lang.String r19, java.util.List r20) {
            /*
                Method dump skipped, instructions count: 768
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.Builder.m62859c(java.lang.String, java.lang.String, java.util.List):void");
        }

        @NonNull
        public Builder removeAttribute(@NonNull String str) {
            m62859c(str, null, this.f11299a);
            return this;
        }

        @NonNull
        public Builder setAttribute(@NonNull String str, @NonNull String str2) {
            m62859c(str, str2, this.f11299a);
            return this;
        }

        @NonNull
        public Builder setExposureTimeNanos(long j) {
            return setAttribute(ExifInterface.TAG_EXPOSURE_TIME, String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        @NonNull
        public Builder setFlashState(@NonNull CameraCaptureMetaData.FlashState flashState) {
            int i;
            if (flashState == CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i2 = C2539a.f11306a[flashState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        Logger.m63223w("ExifData", "Unknown flash state: " + flashState);
                        return this;
                    }
                    i = 1;
                } else {
                    i = 32;
                }
            } else {
                i = 0;
            }
            if ((i & 1) == 1) {
                setAttribute(ExifInterface.TAG_LIGHT_SOURCE, String.valueOf(4));
            }
            return setAttribute(ExifInterface.TAG_FLASH, String.valueOf(i));
        }

        @NonNull
        public Builder setFocalLength(float f) {
            return setAttribute(ExifInterface.TAG_FOCAL_LENGTH, new C17809Im0(f * 1000.0f, 1000L).toString());
        }

        @NonNull
        public Builder setImageHeight(int i) {
            return setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i));
        }

        @NonNull
        public Builder setImageWidth(int i) {
            return setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
        }

        @NonNull
        public Builder setIso(int i) {
            return setAttribute(ExifInterface.TAG_SENSITIVITY_TYPE, String.valueOf(3)).setAttribute(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, String.valueOf(Math.min(65535, i)));
        }

        @NonNull
        public Builder setLensFNumber(float f) {
            return setAttribute(ExifInterface.TAG_F_NUMBER, String.valueOf(f));
        }

        @NonNull
        public Builder setOrientationDegrees(int i) {
            int i2;
            if (i != 0) {
                if (i != 90) {
                    if (i != 180) {
                        if (i != 270) {
                            Logger.m63223w("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 1;
            }
            return setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i2));
        }

        @NonNull
        public Builder setWhiteBalanceMode(@NonNull WhiteBalanceMode whiteBalanceMode) {
            String valueOf;
            int i = C2539a.f11307b[whiteBalanceMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(1);
                }
            } else {
                valueOf = String.valueOf(0);
            }
            return setAttribute(ExifInterface.TAG_WHITE_BALANCE, valueOf);
        }
    }

    /* loaded from: classes.dex */
    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2539a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11306a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f11307b;

        static {
            int[] iArr = new int[WhiteBalanceMode.values().length];
            f11307b = iArr;
            try {
                iArr[WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11307b[WhiteBalanceMode.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraCaptureMetaData.FlashState.values().length];
            f11306a = iArr2;
            try {
                iArr2[CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11306a[CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11306a[CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        C17050xT[] c17050xTArr = {new C17050xT(ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new C17050xT(ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new C17050xT(ExifInterface.TAG_MAKE, 271, 2), new C17050xT(ExifInterface.TAG_MODEL, 272, 2), new C17050xT(ExifInterface.TAG_ORIENTATION, 274, 3), new C17050xT(ExifInterface.TAG_X_RESOLUTION, 282, 5), new C17050xT(ExifInterface.TAG_Y_RESOLUTION, 283, 5), new C17050xT(ExifInterface.TAG_RESOLUTION_UNIT, 296, 3), new C17050xT(ExifInterface.TAG_SOFTWARE, 305, 2), new C17050xT(ExifInterface.TAG_DATETIME, 306, 2), new C17050xT(ExifInterface.TAG_Y_CB_CR_POSITIONING, 531, 3), new C17050xT("SubIFDPointer", 330, 4), new C17050xT("ExifIFDPointer", 34665, 4), new C17050xT("GPSInfoIFDPointer", 34853, 4)};
        f11286d = c17050xTArr;
        C17050xT[] c17050xTArr2 = {new C17050xT(ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new C17050xT(ExifInterface.TAG_F_NUMBER, 33437, 5), new C17050xT(ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new C17050xT(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new C17050xT(ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new C17050xT(ExifInterface.TAG_EXIF_VERSION, 36864, 2), new C17050xT(ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new C17050xT(ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new C17050xT(ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new C17050xT(ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new C17050xT(ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new C17050xT(ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new C17050xT(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new C17050xT(ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new C17050xT(ExifInterface.TAG_METERING_MODE, 37383, 3), new C17050xT(ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new C17050xT(ExifInterface.TAG_FLASH, 37385, 3), new C17050xT(ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new C17050xT(ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new C17050xT(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new C17050xT(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new C17050xT(ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new C17050xT(ExifInterface.TAG_COLOR_SPACE, 40961, 3), new C17050xT(ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new C17050xT(ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new C17050xT("InteroperabilityIFDPointer", 40965, 4), new C17050xT(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new C17050xT(ExifInterface.TAG_SENSING_METHOD, 41495, 3), new C17050xT(ExifInterface.TAG_FILE_SOURCE, 41728, 7), new C17050xT(ExifInterface.TAG_SCENE_TYPE, 41729, 7), new C17050xT(ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new C17050xT(ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new C17050xT(ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new C17050xT(ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new C17050xT(ExifInterface.TAG_CONTRAST, 41992, 3), new C17050xT(ExifInterface.TAG_SATURATION, 41993, 3), new C17050xT(ExifInterface.TAG_SHARPNESS, 41994, 3)};
        f11287e = c17050xTArr2;
        C17050xT[] c17050xTArr3 = {new C17050xT(ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new C17050xT(ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new C17050xT(ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new C17050xT(ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new C17050xT(ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new C17050xT(ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new C17050xT(ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new C17050xT(ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new C17050xT(ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new C17050xT(ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new C17050xT(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new C17050xT(ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new C17050xT(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        f11288f = c17050xTArr3;
        f11289g = new C17050xT[]{new C17050xT("SubIFDPointer", 330, 4), new C17050xT("ExifIFDPointer", 34665, 4), new C17050xT("GPSInfoIFDPointer", 34853, 4), new C17050xT("InteroperabilityIFDPointer", 40965, 4)};
        C17050xT[] c17050xTArr4 = {new C17050xT(ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        f11290h = c17050xTArr4;
        f11291i = new C17050xT[][]{c17050xTArr, c17050xTArr2, c17050xTArr3, c17050xTArr4};
        f11292j = new HashSet(Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_GPS_TIMESTAMP));
    }

    public ExifData(ByteOrder byteOrder, List list) {
        boolean z;
        if (list.size() == f11291i.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Malformed attributes list. Number of IFDs mismatch.");
        this.f11294b = byteOrder;
        this.f11293a = list;
    }

    @NonNull
    public static Builder builderForDevice() {
        return new Builder(ByteOrder.BIG_ENDIAN).setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(1)).setAttribute(ExifInterface.TAG_X_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_Y_RESOLUTION, "72/1").setAttribute(ExifInterface.TAG_RESOLUTION_UNIT, String.valueOf(2)).setAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING, String.valueOf(1)).setAttribute(ExifInterface.TAG_MAKE, Build.MANUFACTURER).setAttribute(ExifInterface.TAG_MODEL, Build.MODEL);
    }

    @NonNull
    public static ExifData create(@NonNull ImageProxy imageProxy, int i) {
        Builder builderForDevice = builderForDevice();
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builderForDevice);
        }
        builderForDevice.setOrientationDegrees(i);
        return builderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    /* renamed from: a */
    public Map m62863a(int i) {
        int length = f11291i.length;
        Preconditions.checkArgumentInRange(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f11293a.get(i);
    }

    /* renamed from: b */
    public final C16897vT m62862b(String str) {
        if (ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i = 0; i < f11291i.length; i++) {
            C16897vT c16897vT = (C16897vT) ((Map) this.f11293a.get(i)).get(str);
            if (c16897vT != null) {
                return c16897vT;
            }
        }
        return null;
    }

    @Nullable
    public String getAttribute(@NonNull String str) {
        C16897vT m62862b = m62862b(str);
        if (m62862b != null) {
            if (!f11292j.contains(str)) {
                return m62862b.m1032k(this.f11294b);
            }
            if (str.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                int i = m62862b.f107692a;
                if (i != 5 && i != 10) {
                    Logger.m63223w("ExifData", "GPS Timestamp format is not rational. format=" + m62862b.f107692a);
                    return null;
                }
                C17809Im0[] c17809Im0Arr = (C17809Im0[]) m62862b.m1031l(this.f11294b);
                if (c17809Im0Arr != null && c17809Im0Arr.length == 3) {
                    return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (((float) c17809Im0Arr[0].m67872b()) / ((float) c17809Im0Arr[0].m67873a()))), Integer.valueOf((int) (((float) c17809Im0Arr[1].m67872b()) / ((float) c17809Im0Arr[1].m67873a()))), Integer.valueOf((int) (((float) c17809Im0Arr[2].m67872b()) / ((float) c17809Im0Arr[2].m67873a()))));
                }
                Logger.m63223w("ExifData", "Invalid GPS Timestamp array. array=" + Arrays.toString(c17809Im0Arr));
                return null;
            }
            try {
                return Double.toString(m62862b.m1033j(this.f11294b));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @NonNull
    public ByteOrder getByteOrder() {
        return this.f11294b;
    }
}
