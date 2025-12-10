package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzo implements BarcodeSource {

    /* renamed from: a */
    public final zzu f57101a;

    public zzo(zzu zzuVar) {
        this.f57101a = zzuVar;
    }

    /* renamed from: a */
    public static Barcode.CalendarDateTime m37187a(com.google.android.gms.internal.mlkit_vision_barcode.zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd, zzjVar.zze, zzjVar.zzf, zzjVar.zzg, zzjVar.zzh);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Rect getBoundingBox() {
        zzu zzuVar = this.f57101a;
        if (zzuVar.zze != null) {
            int i = 0;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            while (true) {
                Point[] pointArr = zzuVar.zze;
                if (i < pointArr.length) {
                    Point point = pointArr[i];
                    i4 = Math.min(i4, point.x);
                    i2 = Math.max(i2, point.x);
                    i5 = Math.min(i5, point.y);
                    i3 = Math.max(i3, point.y);
                    i++;
                } else {
                    return new Rect(i4, i5, i2, i3);
                }
            }
        } else {
            return null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.CalendarEvent getCalendarEvent() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar = this.f57101a.zzl;
        if (zzkVar == null) {
            return null;
        }
        return new Barcode.CalendarEvent(zzkVar.zza, zzkVar.zzb, zzkVar.zzc, zzkVar.zzd, zzkVar.zze, m37187a(zzkVar.zzf), m37187a(zzkVar.zzg));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.ContactInfo getContactInfo() {
        List arrayList;
        zzl zzlVar = this.f57101a.zzm;
        Barcode.PersonName personName = null;
        if (zzlVar == null) {
            return null;
        }
        zzp zzpVar = zzlVar.zza;
        if (zzpVar != null) {
            personName = new Barcode.PersonName(zzpVar.zza, zzpVar.zzb, zzpVar.zzc, zzpVar.zzd, zzpVar.zze, zzpVar.zzf, zzpVar.zzg);
        }
        Barcode.PersonName personName2 = personName;
        String str = zzlVar.zzb;
        String str2 = zzlVar.zzc;
        zzq[] zzqVarArr = zzlVar.zzd;
        ArrayList arrayList2 = new ArrayList();
        if (zzqVarArr != null) {
            for (zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList2.add(new Barcode.Phone(zzqVar.zzb, zzqVar.zza));
                }
            }
        }
        zzn[] zznVarArr = zzlVar.zze;
        ArrayList arrayList3 = new ArrayList();
        if (zznVarArr != null) {
            for (zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList3.add(new Barcode.Email(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd));
                }
            }
        }
        String[] strArr = zzlVar.zzf;
        if (strArr != null) {
            arrayList = Arrays.asList(strArr);
        } else {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zziVarArr = zzlVar.zzg;
        ArrayList arrayList4 = new ArrayList();
        if (zziVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList4.add(new Barcode.Address(zziVar.zza, zziVar.zzb));
                }
            }
        }
        return new Barcode.ContactInfo(personName2, str, str2, arrayList2, arrayList3, list, arrayList4);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Point[] getCornerPoints() {
        return this.f57101a.zze;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final String getDisplayValue() {
        return this.f57101a.zzc;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.DriverLicense getDriverLicense() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar = this.f57101a.zzn;
        if (zzmVar == null) {
            return null;
        }
        return new Barcode.DriverLicense(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzmVar.zzm, zzmVar.zzn);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Email getEmail() {
        zzn zznVar = this.f57101a.zzf;
        if (zznVar != null) {
            return new Barcode.Email(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.f57101a.zza;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.GeoPoint getGeoPoint() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzo zzoVar = this.f57101a.zzk;
        if (zzoVar != null) {
            return new Barcode.GeoPoint(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Phone getPhone() {
        zzq zzqVar = this.f57101a.zzg;
        if (zzqVar != null) {
            return new Barcode.Phone(zzqVar.zzb, zzqVar.zza);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final byte[] getRawBytes() {
        return this.f57101a.zzo;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final String getRawValue() {
        return this.f57101a.zzb;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Sms getSms() {
        zzr zzrVar = this.f57101a.zzh;
        if (zzrVar != null) {
            return new Barcode.Sms(zzrVar.zza, zzrVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.UrlBookmark getUrl() {
        zzs zzsVar = this.f57101a.zzj;
        if (zzsVar != null) {
            return new Barcode.UrlBookmark(zzsVar.zza, zzsVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.f57101a.zzd;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.WiFi getWifi() {
        zzt zztVar = this.f57101a.zzi;
        if (zztVar != null) {
            return new Barcode.WiFi(zztVar.zza, zztVar.zzb, zztVar.zzc);
        }
        return null;
    }
}