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
    public final BarcodeSource f57015a;

    /* renamed from: b */
    public final Rect f57016b;

    /* renamed from: c */
    public final Point[] f57017c;

    /* loaded from: classes4.dex */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final int f57018a;

        /* renamed from: b */
        public final String[] f57019b;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface AddressType {
        }

        @KeepForSdk
        public Address(int i, @NonNull String[] strArr) {
            this.f57018a = i;
            this.f57019b = strArr;
        }

        @NonNull
        public String[] getAddressLines() {
            return this.f57019b;
        }

        @AddressType
        public int getType() {
            return this.f57018a;
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
        public final int f57020a;

        /* renamed from: b */
        public final int f57021b;

        /* renamed from: c */
        public final int f57022c;

        /* renamed from: d */
        public final int f57023d;

        /* renamed from: e */
        public final int f57024e;

        /* renamed from: f */
        public final int f57025f;

        /* renamed from: g */
        public final boolean f57026g;

        /* renamed from: h */
        public final String f57027h;

        @KeepForSdk
        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable String str) {
            this.f57020a = i;
            this.f57021b = i2;
            this.f57022c = i3;
            this.f57023d = i4;
            this.f57024e = i5;
            this.f57025f = i6;
            this.f57026g = z;
            this.f57027h = str;
        }

        public int getDay() {
            return this.f57022c;
        }

        public int getHours() {
            return this.f57023d;
        }

        public int getMinutes() {
            return this.f57024e;
        }

        public int getMonth() {
            return this.f57021b;
        }

        @Nullable
        public String getRawValue() {
            return this.f57027h;
        }

        public int getSeconds() {
            return this.f57025f;
        }

        public int getYear() {
            return this.f57020a;
        }

        public boolean isUtc() {
            return this.f57026g;
        }
    }

    /* loaded from: classes4.dex */
    public static class CalendarEvent {

        /* renamed from: a */
        public final String f57028a;

        /* renamed from: b */
        public final String f57029b;

        /* renamed from: c */
        public final String f57030c;

        /* renamed from: d */
        public final String f57031d;

        /* renamed from: e */
        public final String f57032e;

        /* renamed from: f */
        public final CalendarDateTime f57033f;

        /* renamed from: g */
        public final CalendarDateTime f57034g;

        @KeepForSdk
        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CalendarDateTime calendarDateTime, @Nullable CalendarDateTime calendarDateTime2) {
            this.f57028a = str;
            this.f57029b = str2;
            this.f57030c = str3;
            this.f57031d = str4;
            this.f57032e = str5;
            this.f57033f = calendarDateTime;
            this.f57034g = calendarDateTime2;
        }

        @Nullable
        public String getDescription() {
            return this.f57029b;
        }

        @Nullable
        public CalendarDateTime getEnd() {
            return this.f57034g;
        }

        @Nullable
        public String getLocation() {
            return this.f57030c;
        }

        @Nullable
        public String getOrganizer() {
            return this.f57031d;
        }

        @Nullable
        public CalendarDateTime getStart() {
            return this.f57033f;
        }

        @Nullable
        public String getStatus() {
            return this.f57032e;
        }

        @Nullable
        public String getSummary() {
            return this.f57028a;
        }
    }

    /* loaded from: classes4.dex */
    public static class ContactInfo {

        /* renamed from: a */
        public final PersonName f57035a;

        /* renamed from: b */
        public final String f57036b;

        /* renamed from: c */
        public final String f57037c;

        /* renamed from: d */
        public final List f57038d;

        /* renamed from: e */
        public final List f57039e;

        /* renamed from: f */
        public final List f57040f;

        /* renamed from: g */
        public final List f57041g;

        @KeepForSdk
        public ContactInfo(@Nullable PersonName personName, @Nullable String str, @Nullable String str2, @NonNull List<Phone> list, @NonNull List<Email> list2, @NonNull List<String> list3, @NonNull List<Address> list4) {
            this.f57035a = personName;
            this.f57036b = str;
            this.f57037c = str2;
            this.f57038d = list;
            this.f57039e = list2;
            this.f57040f = list3;
            this.f57041g = list4;
        }

        @NonNull
        public List<Address> getAddresses() {
            return this.f57041g;
        }

        @NonNull
        public List<Email> getEmails() {
            return this.f57039e;
        }

        @Nullable
        public PersonName getName() {
            return this.f57035a;
        }

        @Nullable
        public String getOrganization() {
            return this.f57036b;
        }

        @NonNull
        public List<Phone> getPhones() {
            return this.f57038d;
        }

        @Nullable
        public String getTitle() {
            return this.f57037c;
        }

        @NonNull
        public List<String> getUrls() {
            return this.f57040f;
        }
    }

    /* loaded from: classes4.dex */
    public static class DriverLicense {

        /* renamed from: a */
        public final String f57042a;

        /* renamed from: b */
        public final String f57043b;

        /* renamed from: c */
        public final String f57044c;

        /* renamed from: d */
        public final String f57045d;

        /* renamed from: e */
        public final String f57046e;

        /* renamed from: f */
        public final String f57047f;

        /* renamed from: g */
        public final String f57048g;

        /* renamed from: h */
        public final String f57049h;

        /* renamed from: i */
        public final String f57050i;

        /* renamed from: j */
        public final String f57051j;

        /* renamed from: k */
        public final String f57052k;

        /* renamed from: l */
        public final String f57053l;

        /* renamed from: m */
        public final String f57054m;

        /* renamed from: n */
        public final String f57055n;

        @KeepForSdk
        public DriverLicense(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.f57042a = str;
            this.f57043b = str2;
            this.f57044c = str3;
            this.f57045d = str4;
            this.f57046e = str5;
            this.f57047f = str6;
            this.f57048g = str7;
            this.f57049h = str8;
            this.f57050i = str9;
            this.f57051j = str10;
            this.f57052k = str11;
            this.f57053l = str12;
            this.f57054m = str13;
            this.f57055n = str14;
        }

        @Nullable
        public String getAddressCity() {
            return this.f57048g;
        }

        @Nullable
        public String getAddressState() {
            return this.f57049h;
        }

        @Nullable
        public String getAddressStreet() {
            return this.f57047f;
        }

        @Nullable
        public String getAddressZip() {
            return this.f57050i;
        }

        @Nullable
        public String getBirthDate() {
            return this.f57054m;
        }

        @Nullable
        public String getDocumentType() {
            return this.f57042a;
        }

        @Nullable
        public String getExpiryDate() {
            return this.f57053l;
        }

        @Nullable
        public String getFirstName() {
            return this.f57043b;
        }

        @Nullable
        public String getGender() {
            return this.f57046e;
        }

        @Nullable
        public String getIssueDate() {
            return this.f57052k;
        }

        @Nullable
        public String getIssuingCountry() {
            return this.f57055n;
        }

        @Nullable
        public String getLastName() {
            return this.f57045d;
        }

        @Nullable
        public String getLicenseNumber() {
            return this.f57051j;
        }

        @Nullable
        public String getMiddleName() {
            return this.f57044c;
        }
    }

    /* loaded from: classes4.dex */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* renamed from: a */
        public final int f57056a;

        /* renamed from: b */
        public final String f57057b;

        /* renamed from: c */
        public final String f57058c;

        /* renamed from: d */
        public final String f57059d;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface FormatType {
        }

        @KeepForSdk
        public Email(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f57056a = i;
            this.f57057b = str;
            this.f57058c = str2;
            this.f57059d = str3;
        }

        @Nullable
        public String getAddress() {
            return this.f57057b;
        }

        @Nullable
        public String getBody() {
            return this.f57059d;
        }

        @Nullable
        public String getSubject() {
            return this.f57058c;
        }

        @FormatType
        public int getType() {
            return this.f57056a;
        }
    }

    /* loaded from: classes4.dex */
    public static class GeoPoint {

        /* renamed from: a */
        public final double f57060a;

        /* renamed from: b */
        public final double f57061b;

        @KeepForSdk
        public GeoPoint(double d, double d2) {
            this.f57060a = d;
            this.f57061b = d2;
        }

        public double getLat() {
            return this.f57060a;
        }

        public double getLng() {
            return this.f57061b;
        }
    }

    /* loaded from: classes4.dex */
    public static class PersonName {

        /* renamed from: a */
        public final String f57062a;

        /* renamed from: b */
        public final String f57063b;

        /* renamed from: c */
        public final String f57064c;

        /* renamed from: d */
        public final String f57065d;

        /* renamed from: e */
        public final String f57066e;

        /* renamed from: f */
        public final String f57067f;

        /* renamed from: g */
        public final String f57068g;

        @KeepForSdk
        public PersonName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.f57062a = str;
            this.f57063b = str2;
            this.f57064c = str3;
            this.f57065d = str4;
            this.f57066e = str5;
            this.f57067f = str6;
            this.f57068g = str7;
        }

        @Nullable
        public String getFirst() {
            return this.f57065d;
        }

        @Nullable
        public String getFormattedName() {
            return this.f57062a;
        }

        @Nullable
        public String getLast() {
            return this.f57067f;
        }

        @Nullable
        public String getMiddle() {
            return this.f57066e;
        }

        @Nullable
        public String getPrefix() {
            return this.f57064c;
        }

        @Nullable
        public String getPronunciation() {
            return this.f57063b;
        }

        @Nullable
        public String getSuffix() {
            return this.f57068g;
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
        public final String f57069a;

        /* renamed from: b */
        public final int f57070b;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface FormatType {
        }

        @KeepForSdk
        public Phone(@Nullable String str, int i) {
            this.f57069a = str;
            this.f57070b = i;
        }

        @Nullable
        public String getNumber() {
            return this.f57069a;
        }

        @FormatType
        public int getType() {
            return this.f57070b;
        }
    }

    /* loaded from: classes4.dex */
    public static class Sms {

        /* renamed from: a */
        public final String f57071a;

        /* renamed from: b */
        public final String f57072b;

        @KeepForSdk
        public Sms(@Nullable String str, @Nullable String str2) {
            this.f57071a = str;
            this.f57072b = str2;
        }

        @Nullable
        public String getMessage() {
            return this.f57071a;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.f57072b;
        }
    }

    /* loaded from: classes4.dex */
    public static class UrlBookmark {

        /* renamed from: a */
        public final String f57073a;

        /* renamed from: b */
        public final String f57074b;

        @KeepForSdk
        public UrlBookmark(@Nullable String str, @Nullable String str2) {
            this.f57073a = str;
            this.f57074b = str2;
        }

        @Nullable
        public String getTitle() {
            return this.f57073a;
        }

        @Nullable
        public String getUrl() {
            return this.f57074b;
        }
    }

    /* loaded from: classes4.dex */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;

        /* renamed from: a */
        public final String f57075a;

        /* renamed from: b */
        public final String f57076b;

        /* renamed from: c */
        public final int f57077c;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes4.dex */
        public @interface EncryptionType {
        }

        @KeepForSdk
        public WiFi(@Nullable String str, @Nullable String str2, int i) {
            this.f57075a = str;
            this.f57076b = str2;
            this.f57077c = i;
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.f57077c;
        }

        @Nullable
        public String getPassword() {
            return this.f57076b;
        }

        @Nullable
        public String getSsid() {
            return this.f57075a;
        }
    }

    @KeepForSdk
    public Barcode(@NonNull BarcodeSource barcodeSource) {
        this(barcodeSource, null);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.f57016b;
    }

    @Nullable
    public CalendarEvent getCalendarEvent() {
        return this.f57015a.getCalendarEvent();
    }

    @Nullable
    public ContactInfo getContactInfo() {
        return this.f57015a.getContactInfo();
    }

    @Nullable
    public Point[] getCornerPoints() {
        return this.f57017c;
    }

    @Nullable
    public String getDisplayValue() {
        return this.f57015a.getDisplayValue();
    }

    @Nullable
    public DriverLicense getDriverLicense() {
        return this.f57015a.getDriverLicense();
    }

    @Nullable
    public Email getEmail() {
        return this.f57015a.getEmail();
    }

    @BarcodeFormat
    public int getFormat() {
        int format = this.f57015a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    @Nullable
    public GeoPoint getGeoPoint() {
        return this.f57015a.getGeoPoint();
    }

    @Nullable
    public Phone getPhone() {
        return this.f57015a.getPhone();
    }

    @Nullable
    public byte[] getRawBytes() {
        byte[] rawBytes = this.f57015a.getRawBytes();
        if (rawBytes != null) {
            return Arrays.copyOf(rawBytes, rawBytes.length);
        }
        return null;
    }

    @Nullable
    public String getRawValue() {
        return this.f57015a.getRawValue();
    }

    @Nullable
    public Sms getSms() {
        return this.f57015a.getSms();
    }

    @Nullable
    public UrlBookmark getUrl() {
        return this.f57015a.getUrl();
    }

    @BarcodeValueType
    public int getValueType() {
        return this.f57015a.getValueType();
    }

    @Nullable
    public WiFi getWifi() {
        return this.f57015a.getWifi();
    }

    @KeepForSdk
    public Barcode(@NonNull BarcodeSource barcodeSource, @Nullable Matrix matrix) {
        this.f57015a = (BarcodeSource) Preconditions.checkNotNull(barcodeSource);
        Rect boundingBox = barcodeSource.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            CommonConvertUtils.transformRect(boundingBox, matrix);
        }
        this.f57016b = boundingBox;
        Point[] cornerPoints = barcodeSource.getCornerPoints();
        if (cornerPoints != null && matrix != null) {
            CommonConvertUtils.transformPointArray(cornerPoints, matrix);
        }
        this.f57017c = cornerPoints;
    }
}