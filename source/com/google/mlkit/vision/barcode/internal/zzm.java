package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzva;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzve;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzm implements BarcodeSource {

    /* renamed from: a */
    public final zzvj f57088a;

    public zzm(zzvj zzvjVar) {
        this.f57088a = zzvjVar;
    }

    /* renamed from: a */
    public static Barcode.CalendarDateTime m37196a(zzuy zzuyVar) {
        if (zzuyVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzuyVar.zzf(), zzuyVar.zzd(), zzuyVar.zza(), zzuyVar.zzb(), zzuyVar.zzc(), zzuyVar.zze(), zzuyVar.zzh(), zzuyVar.zzg());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Rect getBoundingBox() {
        Point[] zzo = this.f57088a.zzo();
        if (zzo != null) {
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            for (Point point : zzo) {
                i3 = Math.min(i3, point.x);
                i = Math.max(i, point.x);
                i4 = Math.min(i4, point.y);
                i2 = Math.max(i2, point.y);
            }
            return new Rect(i3, i4, i, i2);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.CalendarEvent getCalendarEvent() {
        zzuz zzc = this.f57088a.zzc();
        if (zzc != null) {
            return new Barcode.CalendarEvent(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), m37196a(zzc.zzb()), m37196a(zzc.zza()));
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.ContactInfo getContactInfo() {
        List arrayList;
        zzva zzd = this.f57088a.zzd();
        Barcode.PersonName personName = null;
        if (zzd == null) {
            return null;
        }
        zzve zza = zzd.zza();
        if (zza != null) {
            personName = new Barcode.PersonName(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg());
        }
        Barcode.PersonName personName2 = personName;
        String zzb = zzd.zzb();
        String zzc = zzd.zzc();
        zzvf[] zzf = zzd.zzf();
        ArrayList arrayList2 = new ArrayList();
        if (zzf != null) {
            for (zzvf zzvfVar : zzf) {
                if (zzvfVar != null) {
                    arrayList2.add(new Barcode.Phone(zzvfVar.zzb(), zzvfVar.zza()));
                }
            }
        }
        zzvc[] zze = zzd.zze();
        ArrayList arrayList3 = new ArrayList();
        if (zze != null) {
            for (zzvc zzvcVar : zze) {
                if (zzvcVar != null) {
                    arrayList3.add(new Barcode.Email(zzvcVar.zza(), zzvcVar.zzb(), zzvcVar.zzd(), zzvcVar.zzc()));
                }
            }
        }
        if (zzd.zzg() != null) {
            arrayList = Arrays.asList((String[]) Preconditions.checkNotNull(zzd.zzg()));
        } else {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        zzux[] zzd2 = zzd.zzd();
        ArrayList arrayList4 = new ArrayList();
        if (zzd2 != null) {
            for (zzux zzuxVar : zzd2) {
                if (zzuxVar != null) {
                    arrayList4.add(new Barcode.Address(zzuxVar.zza(), zzuxVar.zzb()));
                }
            }
        }
        return new Barcode.ContactInfo(personName2, zzb, zzc, arrayList2, arrayList3, list, arrayList4);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Point[] getCornerPoints() {
        return this.f57088a.zzo();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final String getDisplayValue() {
        return this.f57088a.zzl();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.DriverLicense getDriverLicense() {
        zzvb zze = this.f57088a.zze();
        if (zze != null) {
            return new Barcode.DriverLicense(zze.zzf(), zze.zzh(), zze.zzn(), zze.zzl(), zze.zzi(), zze.zzc(), zze.zza(), zze.zzb(), zze.zzd(), zze.zzm(), zze.zzj(), zze.zzg(), zze.zze(), zze.zzk());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Email getEmail() {
        zzvc zzf = this.f57088a.zzf();
        if (zzf == null) {
            return null;
        }
        return new Barcode.Email(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.f57088a.zza();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.GeoPoint getGeoPoint() {
        zzvd zzg = this.f57088a.zzg();
        if (zzg != null) {
            return new Barcode.GeoPoint(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Phone getPhone() {
        zzvf zzh = this.f57088a.zzh();
        if (zzh != null) {
            return new Barcode.Phone(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final byte[] getRawBytes() {
        return this.f57088a.zzn();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final String getRawValue() {
        return this.f57088a.zzm();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Sms getSms() {
        zzvg zzi = this.f57088a.zzi();
        if (zzi != null) {
            return new Barcode.Sms(zzi.zza(), zzi.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.UrlBookmark getUrl() {
        zzvh zzj = this.f57088a.zzj();
        if (zzj != null) {
            return new Barcode.UrlBookmark(zzj.zza(), zzj.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.f57088a.zzb();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.WiFi getWifi() {
        zzvi zzk = this.f57088a.zzk();
        if (zzk != null) {
            return new Barcode.WiFi(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }
}
