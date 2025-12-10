package com.google.mlkit.vision.barcode.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class Barcode {
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

    /* renamed from: a */
    public final BarcodeSource f57003a;

    /* renamed from: b */
    public final Rect f57004b;

    /* renamed from: c */
    public final Point[] f57005c;

    /* loaded from: classes4.dex */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final int f57006a;

        /* renamed from: b */
        public final String[] f57007b;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface AddressType {
        }

        @KeepForSdk
        public Address(int i, @NonNull String[] strArr) {
            this.f57006a = i;
            this.f57007b = strArr;
        }

        @NonNull
        public String[] getAddressLines() {
            return this.f57007b;
        }

        @AddressType
        public int getType() {
            return this.f57006a;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface BarcodeFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface BarcodeValueType {
    }

    /* loaded from: classes4.dex */
    public static class CalendarDateTime {

        /* renamed from: a */
        public final int f57008a;

        /* renamed from: b */
        public final int f57009b;

        /* renamed from: c */
        public final int f57010c;

        /* renamed from: d */
        public final int f57011d;

        /* renamed from: e */
        public final int f57012e;

        /* renamed from: f */
        public final int f57013f;

        /* renamed from: g */
        public final boolean f57014g;

        /* renamed from: h */
        public final String f57015h;

        @KeepForSdk
        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable String str) {
            this.f57008a = i;
            this.f57009b = i2;
            this.f57010c = i3;
            this.f57011d = i4;
            this.f57012e = i5;
            this.f57013f = i6;
            this.f57014g = z;
            this.f57015h = str;
        }

        public int getDay() {
            return this.f57010c;
        }

        public int getHours() {
            return this.f57011d;
        }

        public int getMinutes() {
            return this.f57012e;
        }

        public int getMonth() {
            return this.f57009b;
        }

        @Nullable
        public String getRawValue() {
            return this.f57015h;
        }

        public int getSeconds() {
            return this.f57013f;
        }

        public int getYear() {
            return this.f57008a;
        }

        public boolean isUtc() {
            return this.f57014g;
        }
    }

    /* loaded from: classes4.dex */
    public static class CalendarEvent {

        /* renamed from: a */
        public final String f57016a;

        /* renamed from: b */
        public final String f57017b;

        /* renamed from: c */
        public final String f57018c;

        /* renamed from: d */
        public final String f57019d;

        /* renamed from: e */
        public final String f57020e;

        /* renamed from: f */
        public final CalendarDateTime f57021f;

        /* renamed from: g */
        public final CalendarDateTime f57022g;

        @KeepForSdk
        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CalendarDateTime calendarDateTime, @Nullable CalendarDateTime calendarDateTime2) {
            this.f57016a = str;
            this.f57017b = str2;
            this.f57018c = str3;
            this.f57019d = str4;
            this.f57020e = str5;
            this.f57021f = calendarDateTime;
            this.f57022g = calendarDateTime2;
        }

        @Nullable
        public String getDescription() {
            return this.f57017b;
        }

        @Nullable
        public CalendarDateTime getEnd() {
            return this.f57022g;
        }

        @Nullable
        public String getLocation() {
            return this.f57018c;
        }

        @Nullable
        public String getOrganizer() {
            return this.f57019d;
        }

        @Nullable
        public CalendarDateTime getStart() {
            return this.f57021f;
        }

        @Nullable
        public String getStatus() {
            return this.f57020e;
        }

        @Nullable
        public String getSummary() {
            return this.f57016a;
        }
    }

    /* loaded from: classes4.dex */
    public static class ContactInfo {

        /* renamed from: a */
        public final PersonName f57023a;

        /* renamed from: b */
        public final String f57024b;

        /* renamed from: c */
        public final String f57025c;

        /* renamed from: d */
        public final List f57026d;

        /* renamed from: e */
        public final List f57027e;

        /* renamed from: f */
        public final List f57028f;

        /* renamed from: g */
        public final List f57029g;

        @KeepForSdk
        public ContactInfo(@Nullable PersonName personName, @Nullable String str, @Nullable String str2, @NonNull List<Phone> list, @NonNull List<Email> list2, @NonNull List<String> list3, @NonNull List<Address> list4) {
            this.f57023a = personName;
            this.f57024b = str;
            this.f57025c = str2;
            this.f57026d = list;
            this.f57027e = list2;
            this.f57028f = list3;
            this.f57029g = list4;
        }

        @NonNull
        public List<Address> getAddresses() {
            return this.f57029g;
        }

        @NonNull
        public List<Email> getEmails() {
            return this.f57027e;
        }

        @Nullable
        public PersonName getName() {
            return this.f57023a;
        }

        @Nullable
        public String getOrganization() {
            return this.f57024b;
        }

        @NonNull
        public List<Phone> getPhones() {
            return this.f57026d;
        }

        @Nullable
        public String getTitle() {
            return this.f57025c;
        }

        @NonNull
        public List<String> getUrls() {
            return this.f57028f;
        }
    }

    /* loaded from: classes4.dex */
    public static class DriverLicense {

        /* renamed from: a */
        public final String f57030a;

        /* renamed from: b */
        public final String f57031b;

        /* renamed from: c */
        public final String f57032c;

        /* renamed from: d */
        public final String f57033d;

        /* renamed from: e */
        public final String f57034e;

        /* renamed from: f */
        public final String f57035f;

        /* renamed from: g */
        public final String f57036g;

        /* renamed from: h */
        public final String f57037h;

        /* renamed from: i */
        public final String f57038i;

        /* renamed from: j */
        public final String f57039j;

        /* renamed from: k */
        public final String f57040k;

        /* renamed from: l */
        public final String f57041l;

        /* renamed from: m */
        public final String f57042m;

        /* renamed from: n */
        public final String f57043n;

        @KeepForSdk
        public DriverLicense(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.f57030a = str;
            this.f57031b = str2;
            this.f57032c = str3;
            this.f57033d = str4;
            this.f57034e = str5;
            this.f57035f = str6;
            this.f57036g = str7;
            this.f57037h = str8;
            this.f57038i = str9;
            this.f57039j = str10;
            this.f57040k = str11;
            this.f57041l = str12;
            this.f57042m = str13;
            this.f57043n = str14;
        }

        @Nullable
        public String getAddressCity() {
            return this.f57036g;
        }

        @Nullable
        public String getAddressState() {
            return this.f57037h;
        }

        @Nullable
        public String getAddressStreet() {
            return this.f57035f;
        }

        @Nullable
        public String getAddressZip() {
            return this.f57038i;
        }

        @Nullable
        public String getBirthDate() {
            return this.f57042m;
        }

        @Nullable
        public String getDocumentType() {
            return this.f57030a;
        }

        @Nullable
        public String getExpiryDate() {
            return this.f57041l;
        }

        @Nullable
        public String getFirstName() {
            return this.f57031b;
        }

        @Nullable
        public String getGender() {
            return this.f57034e;
        }

        @Nullable
        public String getIssueDate() {
            return this.f57040k;
        }

        @Nullable
        public String getIssuingCountry() {
            return this.f57043n;
        }

        @Nullable
        public String getLastName() {
            return this.f57033d;
        }

        @Nullable
        public String getLicenseNumber() {
            return this.f57039j;
        }

        @Nullable
        public String getMiddleName() {
            return this.f57032c;
        }
    }

    /* loaded from: classes4.dex */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final int f57044a;

        /* renamed from: b */
        public final String f57045b;

        /* renamed from: c */
        public final String f57046c;

        /* renamed from: d */
        public final String f57047d;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface FormatType {
        }

        @KeepForSdk
        public Email(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f57044a = i;
            this.f57045b = str;
            this.f57046c = str2;
            this.f57047d = str3;
        }

        @Nullable
        public String getAddress() {
            return this.f57045b;
        }

        @Nullable
        public String getBody() {
            return this.f57047d;
        }

        @Nullable
        public String getSubject() {
            return this.f57046c;
        }

        @FormatType
        public int getType() {
            return this.f57044a;
        }
    }

    /* loaded from: classes4.dex */
    public static class GeoPoint {

        /* renamed from: a */
        public final double f57048a;

        /* renamed from: b */
        public final double f57049b;

        @KeepForSdk
        public GeoPoint(double d, double d2) {
            this.f57048a = d;
            this.f57049b = d2;
        }

        public double getLat() {
            return this.f57048a;
        }

        public double getLng() {
            return this.f57049b;
        }
    }

    /* loaded from: classes4.dex */
    public static class PersonName {

        /* renamed from: a */
        public final String f57050a;

        /* renamed from: b */
        public final String f57051b;

        /* renamed from: c */
        public final String f57052c;

        /* renamed from: d */
        public final String f57053d;

        /* renamed from: e */
        public final String f57054e;

        /* renamed from: f */
        public final String f57055f;

        /* renamed from: g */
        public final String f57056g;

        @KeepForSdk
        public PersonName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.f57050a = str;
            this.f57051b = str2;
            this.f57052c = str3;
            this.f57053d = str4;
            this.f57054e = str5;
            this.f57055f = str6;
            this.f57056g = str7;
        }

        @Nullable
        public String getFirst() {
            return this.f57053d;
        }

        @Nullable
        public String getFormattedName() {
            return this.f57050a;
        }

        @Nullable
        public String getLast() {
            return this.f57055f;
        }

        @Nullable
        public String getMiddle() {
            return this.f57054e;
        }

        @Nullable
        public String getPrefix() {
            return this.f57052c;
        }

        @Nullable
        public String getPronunciation() {
            return this.f57051b;
        }

        @Nullable
        public String getSuffix() {
            return this.f57056g;
        }
    }

    /* loaded from: classes4.dex */
    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final String f57057a;

        /* renamed from: b */
        public final int f57058b;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface FormatType {
        }

        @KeepForSdk
        public Phone(@Nullable String str, int i) {
            this.f57057a = str;
            this.f57058b = i;
        }

        @Nullable
        public String getNumber() {
            return this.f57057a;
        }

        @FormatType
        public int getType() {
            return this.f57058b;
        }
    }

    /* loaded from: classes4.dex */
    public static class Sms {

        /* renamed from: a */
        public final String f57059a;

        /* renamed from: b */
        public final String f57060b;

        @KeepForSdk
        public Sms(@Nullable String str, @Nullable String str2) {
            this.f57059a = str;
            this.f57060b = str2;
        }

        @Nullable
        public String getMessage() {
            return this.f57059a;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.f57060b;
        }
    }

    /* loaded from: classes4.dex */
    public static class UrlBookmark {

        /* renamed from: a */
        public final String f57061a;

        /* renamed from: b */
        public final String f57062b;

        @KeepForSdk
        public UrlBookmark(@Nullable String str, @Nullable String str2) {
            this.f57061a = str;
            this.f57062b = str2;
        }

        @Nullable
        public String getTitle() {
            return this.f57061a;
        }

        @Nullable
        public String getUrl() {
            return this.f57062b;
        }
    }

    /* loaded from: classes4.dex */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;

        /* renamed from: a */
        public final String f57063a;

        /* renamed from: b */
        public final String f57064b;

        /* renamed from: c */
        public final int f57065c;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface EncryptionType {
        }

        @KeepForSdk
        public WiFi(@Nullable String str, @Nullable String str2, int i) {
            this.f57063a = str;
            this.f57064b = str2;
            this.f57065c = i;
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.f57065c;
        }

        @Nullable
        public String getPassword() {
            return this.f57064b;
        }

        @Nullable
        public String getSsid() {
            return this.f57063a;
        }
    }

    @KeepForSdk
    public Barcode(@NonNull BarcodeSource barcodeSource) {
        this(barcodeSource, null);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.f57004b;
    }

    @Nullable
    public CalendarEvent getCalendarEvent() {
        return this.f57003a.getCalendarEvent();
    }

    @Nullable
    public ContactInfo getContactInfo() {
        return this.f57003a.getContactInfo();
    }

    @Nullable
    public Point[] getCornerPoints() {
        return this.f57005c;
    }

    @Nullable
    public String getDisplayValue() {
        return this.f57003a.getDisplayValue();
    }

    @Nullable
    public DriverLicense getDriverLicense() {
        return this.f57003a.getDriverLicense();
    }

    @Nullable
    public Email getEmail() {
        return this.f57003a.getEmail();
    }

    @BarcodeFormat
    public int getFormat() {
        int format = this.f57003a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    @Nullable
    public GeoPoint getGeoPoint() {
        return this.f57003a.getGeoPoint();
    }

    @Nullable
    public Phone getPhone() {
        return this.f57003a.getPhone();
    }

    @Nullable
    public byte[] getRawBytes() {
        byte[] rawBytes = this.f57003a.getRawBytes();
        if (rawBytes != null) {
            return Arrays.copyOf(rawBytes, rawBytes.length);
        }
        return null;
    }

    @Nullable
    public String getRawValue() {
        return this.f57003a.getRawValue();
    }

    @Nullable
    public Sms getSms() {
        return this.f57003a.getSms();
    }

    @Nullable
    public UrlBookmark getUrl() {
        return this.f57003a.getUrl();
    }

    @BarcodeValueType
    public int getValueType() {
        return this.f57003a.getValueType();
    }

    @Nullable
    public WiFi getWifi() {
        return this.f57003a.getWifi();
    }

    @KeepForSdk
    public Barcode(@NonNull BarcodeSource barcodeSource, @Nullable Matrix matrix) {
        this.f57003a = (BarcodeSource) Preconditions.checkNotNull(barcodeSource);
        Rect boundingBox = barcodeSource.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            CommonConvertUtils.transformRect(boundingBox, matrix);
        }
        this.f57004b = boundingBox;
        Point[] cornerPoints = barcodeSource.getCornerPoints();
        if (cornerPoints != null && matrix != null) {
            CommonConvertUtils.transformPointArray(cornerPoints, matrix);
        }
        this.f57005c = cornerPoints;
    }
}
