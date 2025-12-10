package com.google.firebase.p015ml.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcode;
import java.util.ArrayList;

/* renamed from: com.google.firebase.ml.vision.barcode.internal.zzf */
/* loaded from: classes4.dex */
public final class zzf implements zzd {

    /* renamed from: a */
    public final Barcode f55905a;

    public zzf(Barcode barcode) {
        this.f55905a = barcode;
    }

    /* renamed from: a */
    public static FirebaseVisionBarcode.CalendarDateTime m38344a(Barcode.CalendarDateTime calendarDateTime) {
        if (calendarDateTime == null) {
            return null;
        }
        return new FirebaseVisionBarcode.CalendarDateTime(calendarDateTime.year, calendarDateTime.month, calendarDateTime.day, calendarDateTime.hours, calendarDateTime.minutes, calendarDateTime.seconds, calendarDateTime.isUtc, calendarDateTime.rawValue);
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final Rect getBoundingBox() {
        return this.f55905a.getBoundingBox();
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.CalendarEvent getCalendarEvent() {
        Barcode.CalendarEvent calendarEvent = this.f55905a.calendarEvent;
        if (calendarEvent == null) {
            return null;
        }
        return new FirebaseVisionBarcode.CalendarEvent(calendarEvent.summary, calendarEvent.description, calendarEvent.location, calendarEvent.organizer, calendarEvent.status, m38344a(calendarEvent.start), m38344a(calendarEvent.end));
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.ContactInfo getContactInfo() {
        Barcode.ContactInfo contactInfo = this.f55905a.contactInfo;
        FirebaseVisionBarcode.PersonName personName = null;
        if (contactInfo == null) {
            return null;
        }
        Barcode.PersonName personName2 = contactInfo.name;
        if (personName2 != null) {
            personName = new FirebaseVisionBarcode.PersonName(personName2.formattedName, personName2.pronunciation, personName2.prefix, personName2.first, personName2.middle, personName2.last, personName2.suffix);
        }
        FirebaseVisionBarcode.PersonName personName3 = personName;
        String str = contactInfo.organization;
        String str2 = contactInfo.title;
        Barcode.Phone[] phoneArr = contactInfo.phones;
        ArrayList arrayList = new ArrayList();
        if (phoneArr != null) {
            for (Barcode.Phone phone : phoneArr) {
                if (phone != null) {
                    arrayList.add(new FirebaseVisionBarcode.Phone(phone.number, phone.type));
                }
            }
        }
        Barcode.Email[] emailArr = contactInfo.emails;
        ArrayList arrayList2 = new ArrayList();
        if (emailArr != null) {
            for (Barcode.Email email : emailArr) {
                if (email != null) {
                    arrayList2.add(new FirebaseVisionBarcode.Email(email.type, email.address, email.subject, email.body));
                }
            }
        }
        String[] strArr = contactInfo.urls;
        Barcode.Address[] addressArr = contactInfo.addresses;
        ArrayList arrayList3 = new ArrayList();
        if (addressArr != null) {
            for (Barcode.Address address : addressArr) {
                if (address != null) {
                    arrayList3.add(new FirebaseVisionBarcode.Address(address.type, address.addressLines));
                }
            }
        }
        return new FirebaseVisionBarcode.ContactInfo(personName3, str, str2, arrayList, arrayList2, strArr, arrayList3);
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final Point[] getCornerPoints() {
        return this.f55905a.cornerPoints;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final String getDisplayValue() {
        return this.f55905a.displayValue;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.DriverLicense getDriverLicense() {
        Barcode.DriverLicense driverLicense = this.f55905a.driverLicense;
        if (driverLicense == null) {
            return null;
        }
        return new FirebaseVisionBarcode.DriverLicense(driverLicense.documentType, driverLicense.firstName, driverLicense.middleName, driverLicense.lastName, driverLicense.gender, driverLicense.addressStreet, driverLicense.addressCity, driverLicense.addressState, driverLicense.addressZip, driverLicense.licenseNumber, driverLicense.issueDate, driverLicense.expiryDate, driverLicense.birthDate, driverLicense.issuingCountry);
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.Email getEmail() {
        Barcode.Email email = this.f55905a.email;
        if (email != null) {
            return new FirebaseVisionBarcode.Email(email.type, email.address, email.subject, email.body);
        }
        return null;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    public final int getFormat() {
        return this.f55905a.format;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.GeoPoint getGeoPoint() {
        Barcode.GeoPoint geoPoint = this.f55905a.geoPoint;
        if (geoPoint != null) {
            return new FirebaseVisionBarcode.GeoPoint(geoPoint.lat, geoPoint.lng);
        }
        return null;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.Phone getPhone() {
        Barcode.Phone phone = this.f55905a.phone;
        if (phone != null) {
            return new FirebaseVisionBarcode.Phone(phone.number, phone.type);
        }
        return null;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final byte[] getRawBytes() {
        return this.f55905a.rawBytes;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final String getRawValue() {
        return this.f55905a.rawValue;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.Sms getSms() {
        Barcode.Sms sms = this.f55905a.sms;
        if (sms != null) {
            return new FirebaseVisionBarcode.Sms(sms.message, sms.phoneNumber);
        }
        return null;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.UrlBookmark getUrl() {
        Barcode.UrlBookmark urlBookmark = this.f55905a.url;
        if (urlBookmark != null) {
            return new FirebaseVisionBarcode.UrlBookmark(urlBookmark.title, urlBookmark.url);
        }
        return null;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    public final int getValueType() {
        return this.f55905a.valueFormat;
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.zzd
    @Nullable
    public final FirebaseVisionBarcode.WiFi getWifi() {
        Barcode.WiFi wiFi = this.f55905a.wifi;
        if (wiFi != null) {
            return new FirebaseVisionBarcode.WiFi(wiFi.ssid, wiFi.password, wiFi.encryptionType);
        }
        return null;
    }
}
