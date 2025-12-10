package com.google.firebase.p015ml.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.firebase.p015ml.vision.barcode.internal.zzd;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode */
/* loaded from: classes4.dex */
public class FirebaseVisionBarcode {
    public static final int FORMAT_ALL_FORMATS = 0;
    public static final int FORMAT_AZTEC = 4096;
    public static final int FORMAT_CODABAR = 8;
    public static final int FORMAT_CODE_128 = 1;
    public static final int FORMAT_CODE_39 = 2;
    public static final int FORMAT_CODE_93 = 4;
    public static final int FORMAT_DATA_MATRIX = 16;
    public static final int FORMAT_EAN_13 = 32;
    public static final int FORMAT_EAN_8 = 64;
    public static final int FORMAT_ITF = 128;
    public static final int FORMAT_PDF417 = 2048;
    public static final int FORMAT_QR_CODE = 256;
    public static final int FORMAT_UNKNOWN = -1;
    public static final int FORMAT_UPC_A = 512;
    public static final int FORMAT_UPC_E = 1024;
    public static final int TYPE_CALENDAR_EVENT = 11;
    public static final int TYPE_CONTACT_INFO = 1;
    public static final int TYPE_DRIVER_LICENSE = 12;
    public static final int TYPE_EMAIL = 2;
    public static final int TYPE_GEO = 10;
    public static final int TYPE_ISBN = 3;
    public static final int TYPE_PHONE = 4;
    public static final int TYPE_PRODUCT = 5;
    public static final int TYPE_SMS = 6;
    public static final int TYPE_TEXT = 7;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_URL = 8;
    public static final int TYPE_WIFI = 9;

    /* renamed from: b */
    public static final SparseArray f55843b;

    /* renamed from: c */
    public static final SparseArray f55844c;

    /* renamed from: a */
    public final zzd f55845a;

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Address */
    /* loaded from: classes4.dex */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final int f55846a;

        /* renamed from: b */
        public final String[] f55847b;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Address$AddressType */
        /* loaded from: classes4.dex */
        public @interface AddressType {
        }

        public Address(int i, String[] strArr) {
            this.f55846a = i;
            this.f55847b = strArr;
        }

        @NonNull
        public String[] getAddressLines() {
            return this.f55847b;
        }

        @AddressType
        public int getType() {
            return this.f55846a;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$BarcodeFormat */
    /* loaded from: classes4.dex */
    public @interface BarcodeFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$BarcodeValueType */
    /* loaded from: classes4.dex */
    public @interface BarcodeValueType {
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$CalendarDateTime */
    /* loaded from: classes4.dex */
    public static class CalendarDateTime {

        /* renamed from: a */
        public final int f55848a;

        /* renamed from: b */
        public final int f55849b;

        /* renamed from: c */
        public final int f55850c;

        /* renamed from: d */
        public final int f55851d;

        /* renamed from: e */
        public final int f55852e;

        /* renamed from: f */
        public final int f55853f;

        /* renamed from: g */
        public final boolean f55854g;

        /* renamed from: h */
        public final String f55855h;

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable String str) {
            this.f55848a = i;
            this.f55849b = i2;
            this.f55850c = i3;
            this.f55851d = i4;
            this.f55852e = i5;
            this.f55853f = i6;
            this.f55854g = z;
            this.f55855h = str;
        }

        public int getDay() {
            return this.f55850c;
        }

        public int getHours() {
            return this.f55851d;
        }

        public int getMinutes() {
            return this.f55852e;
        }

        public int getMonth() {
            return this.f55849b;
        }

        @Nullable
        public String getRawValue() {
            return this.f55855h;
        }

        public int getSeconds() {
            return this.f55853f;
        }

        public int getYear() {
            return this.f55848a;
        }

        public boolean isUtc() {
            return this.f55854g;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$CalendarEvent */
    /* loaded from: classes4.dex */
    public static class CalendarEvent {

        /* renamed from: a */
        public final String f55856a;

        /* renamed from: b */
        public final String f55857b;

        /* renamed from: c */
        public final String f55858c;

        /* renamed from: d */
        public final String f55859d;

        /* renamed from: e */
        public final String f55860e;

        /* renamed from: f */
        public final CalendarDateTime f55861f;

        /* renamed from: g */
        public final CalendarDateTime f55862g;

        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CalendarDateTime calendarDateTime, @Nullable CalendarDateTime calendarDateTime2) {
            this.f55856a = str;
            this.f55857b = str2;
            this.f55858c = str3;
            this.f55859d = str4;
            this.f55860e = str5;
            this.f55861f = calendarDateTime;
            this.f55862g = calendarDateTime2;
        }

        @Nullable
        public String getDescription() {
            return this.f55857b;
        }

        @Nullable
        public CalendarDateTime getEnd() {
            return this.f55862g;
        }

        @Nullable
        public String getLocation() {
            return this.f55858c;
        }

        @Nullable
        public String getOrganizer() {
            return this.f55859d;
        }

        @Nullable
        public CalendarDateTime getStart() {
            return this.f55861f;
        }

        @Nullable
        public String getStatus() {
            return this.f55860e;
        }

        @Nullable
        public String getSummary() {
            return this.f55856a;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$ContactInfo */
    /* loaded from: classes4.dex */
    public static class ContactInfo {

        /* renamed from: a */
        public final PersonName f55863a;

        /* renamed from: b */
        public final String f55864b;

        /* renamed from: c */
        public final String f55865c;

        /* renamed from: d */
        public final List f55866d;

        /* renamed from: e */
        public final List f55867e;

        /* renamed from: f */
        public final String[] f55868f;

        /* renamed from: g */
        public final List f55869g;

        public ContactInfo(@Nullable PersonName personName, @Nullable String str, @Nullable String str2, @NonNull List<Phone> list, @NonNull List<Email> list2, @Nullable String[] strArr, @NonNull List<Address> list3) {
            this.f55863a = personName;
            this.f55864b = str;
            this.f55865c = str2;
            this.f55866d = list;
            this.f55867e = list2;
            this.f55868f = strArr;
            this.f55869g = list3;
        }

        @NonNull
        public List<Address> getAddresses() {
            return this.f55869g;
        }

        @NonNull
        public List<Email> getEmails() {
            return this.f55867e;
        }

        @Nullable
        public PersonName getName() {
            return this.f55863a;
        }

        @Nullable
        public String getOrganization() {
            return this.f55864b;
        }

        @NonNull
        public List<Phone> getPhones() {
            return this.f55866d;
        }

        @Nullable
        public String getTitle() {
            return this.f55865c;
        }

        @Nullable
        public String[] getUrls() {
            return this.f55868f;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$DriverLicense */
    /* loaded from: classes4.dex */
    public static class DriverLicense {

        /* renamed from: a */
        public final String f55870a;

        /* renamed from: b */
        public final String f55871b;

        /* renamed from: c */
        public final String f55872c;

        /* renamed from: d */
        public final String f55873d;

        /* renamed from: e */
        public final String f55874e;

        /* renamed from: f */
        public final String f55875f;

        /* renamed from: g */
        public final String f55876g;

        /* renamed from: h */
        public final String f55877h;

        /* renamed from: i */
        public final String f55878i;

        /* renamed from: j */
        public final String f55879j;

        /* renamed from: k */
        public final String f55880k;

        /* renamed from: l */
        public final String f55881l;

        /* renamed from: m */
        public final String f55882m;

        /* renamed from: n */
        public final String f55883n;

        public DriverLicense(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.f55870a = str;
            this.f55871b = str2;
            this.f55872c = str3;
            this.f55873d = str4;
            this.f55874e = str5;
            this.f55875f = str6;
            this.f55876g = str7;
            this.f55877h = str8;
            this.f55878i = str9;
            this.f55879j = str10;
            this.f55880k = str11;
            this.f55881l = str12;
            this.f55882m = str13;
            this.f55883n = str14;
        }

        @Nullable
        public String getAddressCity() {
            return this.f55876g;
        }

        @Nullable
        public String getAddressState() {
            return this.f55877h;
        }

        @Nullable
        public String getAddressStreet() {
            return this.f55875f;
        }

        @Nullable
        public String getAddressZip() {
            return this.f55878i;
        }

        @Nullable
        public String getBirthDate() {
            return this.f55882m;
        }

        @Nullable
        public String getDocumentType() {
            return this.f55870a;
        }

        @Nullable
        public String getExpiryDate() {
            return this.f55881l;
        }

        @Nullable
        public String getFirstName() {
            return this.f55871b;
        }

        @Nullable
        public String getGender() {
            return this.f55874e;
        }

        @Nullable
        public String getIssueDate() {
            return this.f55880k;
        }

        @Nullable
        public String getIssuingCountry() {
            return this.f55883n;
        }

        @Nullable
        public String getLastName() {
            return this.f55873d;
        }

        @Nullable
        public String getLicenseNumber() {
            return this.f55879j;
        }

        @Nullable
        public String getMiddleName() {
            return this.f55872c;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Email */
    /* loaded from: classes4.dex */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final int f55884a;

        /* renamed from: b */
        public final String f55885b;

        /* renamed from: c */
        public final String f55886c;

        /* renamed from: d */
        public final String f55887d;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Email$FormatType */
        /* loaded from: classes4.dex */
        public @interface FormatType {
        }

        public Email(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f55884a = i;
            this.f55885b = str;
            this.f55886c = str2;
            this.f55887d = str3;
        }

        @Nullable
        public String getAddress() {
            return this.f55885b;
        }

        @Nullable
        public String getBody() {
            return this.f55887d;
        }

        @Nullable
        public String getSubject() {
            return this.f55886c;
        }

        @FormatType
        public int getType() {
            return this.f55884a;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$GeoPoint */
    /* loaded from: classes4.dex */
    public static class GeoPoint {

        /* renamed from: a */
        public final double f55888a;

        /* renamed from: b */
        public final double f55889b;

        public GeoPoint(double d, double d2) {
            this.f55888a = d;
            this.f55889b = d2;
        }

        public double getLat() {
            return this.f55888a;
        }

        public double getLng() {
            return this.f55889b;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$PersonName */
    /* loaded from: classes4.dex */
    public static class PersonName {

        /* renamed from: a */
        public final String f55890a;

        /* renamed from: b */
        public final String f55891b;

        /* renamed from: c */
        public final String f55892c;

        /* renamed from: d */
        public final String f55893d;

        /* renamed from: e */
        public final String f55894e;

        /* renamed from: f */
        public final String f55895f;

        /* renamed from: g */
        public final String f55896g;

        public PersonName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.f55890a = str;
            this.f55891b = str2;
            this.f55892c = str3;
            this.f55893d = str4;
            this.f55894e = str5;
            this.f55895f = str6;
            this.f55896g = str7;
        }

        @Nullable
        public String getFirst() {
            return this.f55893d;
        }

        @Nullable
        public String getFormattedName() {
            return this.f55890a;
        }

        @Nullable
        public String getLast() {
            return this.f55895f;
        }

        @Nullable
        public String getMiddle() {
            return this.f55894e;
        }

        @Nullable
        public String getPrefix() {
            return this.f55892c;
        }

        @Nullable
        public String getPronunciation() {
            return this.f55891b;
        }

        @Nullable
        public String getSuffix() {
            return this.f55896g;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Phone */
    /* loaded from: classes4.dex */
    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final String f55897a;

        /* renamed from: b */
        public final int f55898b;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Phone$FormatType */
        /* loaded from: classes4.dex */
        public @interface FormatType {
        }

        public Phone(@Nullable String str, int i) {
            this.f55897a = str;
            this.f55898b = i;
        }

        @Nullable
        public String getNumber() {
            return this.f55897a;
        }

        @FormatType
        public int getType() {
            return this.f55898b;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$Sms */
    /* loaded from: classes4.dex */
    public static class Sms {

        /* renamed from: a */
        public final String f55899a;

        /* renamed from: b */
        public final String f55900b;

        public Sms(@Nullable String str, @Nullable String str2) {
            this.f55899a = str;
            this.f55900b = str2;
        }

        @Nullable
        public String getMessage() {
            return this.f55899a;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.f55900b;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$UrlBookmark */
    /* loaded from: classes4.dex */
    public static class UrlBookmark {

        /* renamed from: a */
        public final String f55901a;

        /* renamed from: b */
        public final String f55902b;

        public UrlBookmark(@Nullable String str, @Nullable String str2) {
            this.f55901a = str;
            this.f55902b = str2;
        }

        @Nullable
        public String getTitle() {
            return this.f55901a;
        }

        @Nullable
        public String getUrl() {
            return this.f55902b;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$WiFi */
    /* loaded from: classes4.dex */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;

        /* renamed from: a */
        public final String f55903a;

        /* renamed from: b */
        public final String f55904b;

        /* renamed from: c */
        public final int f55905c;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode$WiFi$EncryptionType */
        /* loaded from: classes4.dex */
        public @interface EncryptionType {
        }

        public WiFi(@Nullable String str, @Nullable String str2, int i) {
            this.f55903a = str;
            this.f55904b = str2;
            this.f55905c = i;
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.f55905c;
        }

        @Nullable
        public String getPassword() {
            return this.f55904b;
        }

        @Nullable
        public String getSsid() {
            return this.f55903a;
        }
    }

    static {
        SparseArray sparseArray = new SparseArray();
        f55843b = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f55844c = sparseArray2;
        sparseArray.put(-1, zznq.zzao.zza.FORMAT_UNKNOWN);
        sparseArray.put(1, zznq.zzao.zza.FORMAT_CODE_128);
        sparseArray.put(2, zznq.zzao.zza.FORMAT_CODE_39);
        sparseArray.put(4, zznq.zzao.zza.FORMAT_CODE_93);
        sparseArray.put(8, zznq.zzao.zza.FORMAT_CODABAR);
        sparseArray.put(16, zznq.zzao.zza.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zznq.zzao.zza.FORMAT_EAN_13);
        sparseArray.put(64, zznq.zzao.zza.FORMAT_EAN_8);
        sparseArray.put(128, zznq.zzao.zza.FORMAT_ITF);
        sparseArray.put(256, zznq.zzao.zza.FORMAT_QR_CODE);
        sparseArray.put(512, zznq.zzao.zza.FORMAT_UPC_A);
        sparseArray.put(1024, zznq.zzao.zza.FORMAT_UPC_E);
        sparseArray.put(2048, zznq.zzao.zza.FORMAT_PDF417);
        sparseArray.put(4096, zznq.zzao.zza.FORMAT_AZTEC);
        sparseArray2.put(0, zznq.zzao.zzb.TYPE_UNKNOWN);
        sparseArray2.put(1, zznq.zzao.zzb.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zznq.zzao.zzb.TYPE_EMAIL);
        sparseArray2.put(3, zznq.zzao.zzb.TYPE_ISBN);
        sparseArray2.put(4, zznq.zzao.zzb.TYPE_PHONE);
        sparseArray2.put(5, zznq.zzao.zzb.TYPE_PRODUCT);
        sparseArray2.put(6, zznq.zzao.zzb.TYPE_SMS);
        sparseArray2.put(7, zznq.zzao.zzb.TYPE_TEXT);
        sparseArray2.put(8, zznq.zzao.zzb.TYPE_URL);
        sparseArray2.put(9, zznq.zzao.zzb.TYPE_WIFI);
        sparseArray2.put(10, zznq.zzao.zzb.TYPE_GEO);
        sparseArray2.put(11, zznq.zzao.zzb.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zznq.zzao.zzb.TYPE_DRIVER_LICENSE);
    }

    public FirebaseVisionBarcode(@NonNull zzd zzdVar) {
        this.f55845a = (zzd) Preconditions.checkNotNull(zzdVar);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.f55845a.getBoundingBox();
    }

    @Nullable
    public CalendarEvent getCalendarEvent() {
        return this.f55845a.getCalendarEvent();
    }

    @Nullable
    public ContactInfo getContactInfo() {
        return this.f55845a.getContactInfo();
    }

    @Nullable
    public Point[] getCornerPoints() {
        return this.f55845a.getCornerPoints();
    }

    @Nullable
    public String getDisplayValue() {
        return this.f55845a.getDisplayValue();
    }

    @Nullable
    public DriverLicense getDriverLicense() {
        return this.f55845a.getDriverLicense();
    }

    @Nullable
    public Email getEmail() {
        return this.f55845a.getEmail();
    }

    @BarcodeFormat
    public int getFormat() {
        int format = this.f55845a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    @Nullable
    public GeoPoint getGeoPoint() {
        return this.f55845a.getGeoPoint();
    }

    @Nullable
    public Phone getPhone() {
        return this.f55845a.getPhone();
    }

    @Nullable
    public byte[] getRawBytes() {
        byte[] rawBytes = this.f55845a.getRawBytes();
        if (rawBytes != null) {
            return Arrays.copyOf(rawBytes, rawBytes.length);
        }
        return null;
    }

    @Nullable
    public String getRawValue() {
        return this.f55845a.getRawValue();
    }

    @Nullable
    public Sms getSms() {
        return this.f55845a.getSms();
    }

    @Nullable
    public UrlBookmark getUrl() {
        return this.f55845a.getUrl();
    }

    @BarcodeValueType
    public int getValueType() {
        return this.f55845a.getValueType();
    }

    @Nullable
    public WiFi getWifi() {
        return this.f55845a.getWifi();
    }

    public final zznq.zzao.zza zzqq() {
        zznq.zzao.zza zzaVar = (zznq.zzao.zza) f55843b.get(getFormat());
        if (zzaVar == null) {
            return zznq.zzao.zza.FORMAT_UNKNOWN;
        }
        return zzaVar;
    }

    public final zznq.zzao.zzb zzqr() {
        zznq.zzao.zzb zzbVar = (zznq.zzao.zzb) f55844c.get(getValueType());
        if (zzbVar == null) {
            return zznq.zzao.zzb.TYPE_UNKNOWN;
        }
        return zzbVar;
    }
}