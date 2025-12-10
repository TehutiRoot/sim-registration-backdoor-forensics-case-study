package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.barhopper.deeplearning.zze;
import com.google.barhopper.deeplearning.zzf;
import com.google.barhopper.deeplearning.zzh;
import com.google.barhopper.deeplearning.zzi;
import com.google.barhopper.deeplearning.zzk;
import com.google.barhopper.deeplearning.zzm;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import com.google.photos.vision.barhopper.zzac;
import com.google.photos.vision.barhopper.zzad;
import com.google.photos.vision.barhopper.zzae;
import com.google.photos.vision.barhopper.zzag;
import com.google.photos.vision.barhopper.zzaj;
import com.google.photos.vision.barhopper.zzb;
import com.google.photos.vision.barhopper.zzc;
import com.google.photos.vision.barhopper.zzn;
import com.google.photos.vision.barhopper.zzp;
import com.google.photos.vision.barhopper.zzr;
import com.google.photos.vision.barhopper.zzt;
import com.google.photos.vision.barhopper.zzy;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: yd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC23164yd2 extends zzbk {

    /* renamed from: d */
    public static final int[] f108799d = {5, 7, 7, 7, 5, 5};

    /* renamed from: e */
    public static final double[][] f108800e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: a */
    public final Context f108801a;

    /* renamed from: b */
    public final RecognitionOptions f108802b;

    /* renamed from: c */
    public BarhopperV3 f108803c;

    public BinderC23164yd2(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f108802b = recognitionOptions;
        this.f108801a = context;
        recognitionOptions.setBarcodeFormats(zzbcVar.zza());
        recognitionOptions.setOutputUnrecognizedBarcodes(zzbcVar.zzb());
    }

    /* renamed from: a */
    public static zzap m232a(zzn zznVar, String str, String str2) {
        String str3 = null;
        if (zznVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int zzf = zznVar.zzf();
        int zzd = zznVar.zzd();
        int zza = zznVar.zza();
        int zzb = zznVar.zzb();
        int zzc = zznVar.zzc();
        int zze = zznVar.zze();
        boolean zzj = zznVar.zzj();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new zzap(zzf, zzd, zza, zzb, zzc, zze, zzj, str3);
    }

    /* renamed from: b */
    public final BarhopperProto$BarhopperResponse m231b(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f108803c);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, this.f108802b);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), this.f108802b);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), bArr, this.f108802b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final List zzb(IObjectWrapper iObjectWrapper, zzbu zzbuVar) {
        BarhopperProto$BarhopperResponse recognize;
        zzat zzatVar;
        zzaw zzawVar;
        zzax zzaxVar;
        zzaz zzazVar;
        zzay zzayVar;
        zzau zzauVar;
        zzaq zzaqVar;
        zzar zzarVar;
        zzas zzasVar;
        int i;
        String str;
        Point[] pointArr;
        int i2;
        zzav zzavVar;
        zzaw[] zzawVarArr;
        zzat[] zzatVarArr;
        zzao[] zzaoVarArr;
        String str2;
        String str3;
        int zzb = zzbuVar.zzb();
        int i3 = -1;
        if (zzb != -1) {
            if (zzb != 17) {
                if (zzb != 35) {
                    if (zzb != 842094169) {
                        int zzb2 = zzbuVar.zzb();
                        throw new IllegalArgumentException("Unsupported image format: " + zzb2);
                    }
                } else {
                    recognize = m231b(((Image) Preconditions.checkNotNull((Image) ObjectWrapper.unwrap(iObjectWrapper))).getPlanes()[0].getBuffer(), zzbuVar);
                }
            }
            recognize = m231b((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzbuVar);
        } else {
            recognize = ((BarhopperV3) Preconditions.checkNotNull(this.f108803c)).recognize((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), this.f108802b);
        }
        ArrayList arrayList = new ArrayList();
        Matrix uprightRotationMatrix = ImageUtils.getInstance().getUprightRotationMatrix(zzbuVar.zzd(), zzbuVar.zza(), zzbuVar.zzc());
        for (zzc zzcVar : recognize.zzc()) {
            if (zzcVar.zza() > 0 && uprightRotationMatrix != null) {
                float[] fArr = new float[8];
                List zzo = zzcVar.zzo();
                int zza = zzcVar.zza();
                for (int i4 = 0; i4 < zza; i4++) {
                    int i5 = i4 + i4;
                    fArr[i5] = ((zzae) zzo.get(i4)).zza();
                    fArr[i5 + 1] = ((zzae) zzo.get(i4)).zzb();
                }
                uprightRotationMatrix.mapPoints(fArr);
                int zzc = zzbuVar.zzc();
                for (int i6 = 0; i6 < zza; i6++) {
                    zzb zzbVar = (zzb) zzcVar.zzG();
                    int i7 = i6 + i6;
                    zzad zzc2 = zzae.zzc();
                    zzc2.zza((int) fArr[i7]);
                    zzc2.zzb((int) fArr[i7 + 1]);
                    zzbVar.zza((i6 + zzc) % zza, (zzae) zzc2.zzj());
                    zzcVar = (zzc) zzbVar.zzj();
                }
            }
            if (zzcVar.zzt()) {
                zzy zzh = zzcVar.zzh();
                zzatVar = new zzat(zzh.zzf() + i3, zzh.zzc(), zzh.zze(), zzh.zzd());
            } else {
                zzatVar = null;
            }
            if (zzcVar.zzv()) {
                zzci zzb3 = zzcVar.zzb();
                zzawVar = new zzaw(zzb3.zzd() + i3, zzb3.zzc());
            } else {
                zzawVar = null;
            }
            if (zzcVar.zzw()) {
                zzag zzj = zzcVar.zzj();
                zzaxVar = new zzax(zzj.zzc(), zzj.zzd());
            } else {
                zzaxVar = null;
            }
            if (zzcVar.zzy()) {
                com.google.photos.vision.barhopper.zzao zzl = zzcVar.zzl();
                zzazVar = new zzaz(zzl.zzd(), zzl.zzc(), zzl.zze() + i3);
            } else {
                zzazVar = null;
            }
            if (zzcVar.zzx()) {
                zzaj zzk = zzcVar.zzk();
                zzayVar = new zzay(zzk.zzc(), zzk.zzd());
            } else {
                zzayVar = null;
            }
            if (zzcVar.zzu()) {
                zzac zzi = zzcVar.zzi();
                zzauVar = new zzau(zzi.zza(), zzi.zzb());
            } else {
                zzauVar = null;
            }
            if (zzcVar.zzq()) {
                zzp zzd = zzcVar.zzd();
                String zzj2 = zzd.zzj();
                String zze = zzd.zze();
                String zzf = zzd.zzf();
                String zzh2 = zzd.zzh();
                String zzi2 = zzd.zzi();
                zzn zzb4 = zzd.zzb();
                if (zzcVar.zzm().zzn()) {
                    str2 = zzcVar.zzm().zzu();
                } else {
                    str2 = null;
                }
                zzap m232a = m232a(zzb4, str2, "DTSTART:([0-9TZ]*)");
                zzn zza2 = zzd.zza();
                if (zzcVar.zzm().zzn()) {
                    str3 = zzcVar.zzm().zzu();
                } else {
                    str3 = null;
                }
                zzaqVar = new zzaq(zzj2, zze, zzf, zzh2, zzi2, m232a, m232a(zza2, str3, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (zzcVar.zzr()) {
                zzr zze2 = zzcVar.zze();
                zzcd zza3 = zze2.zza();
                if (zza3 != null) {
                    zzavVar = new zzav(zza3.zzd(), zza3.zzi(), zza3.zzh(), zza3.zzc(), zza3.zzf(), zza3.zze(), zza3.zzj());
                } else {
                    zzavVar = null;
                }
                String zzd2 = zze2.zzd();
                String zze3 = zze2.zze();
                List zzi3 = zze2.zzi();
                if (zzi3.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[zzi3.size()];
                    for (int i8 = 0; i8 < zzi3.size(); i8++) {
                        zzawVarArr2[i8] = new zzaw(((zzci) zzi3.get(i8)).zzd() + i3, ((zzci) zzi3.get(i8)).zzc());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                List zzh3 = zze2.zzh();
                if (zzh3.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[zzh3.size()];
                    int i9 = 0;
                    while (i9 < zzh3.size()) {
                        zzatVarArr2[i9] = new zzat(((zzy) zzh3.get(i9)).zzf() + i3, ((zzy) zzh3.get(i9)).zzc(), ((zzy) zzh3.get(i9)).zze(), ((zzy) zzh3.get(i9)).zzd());
                        i9++;
                        i3 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) zze2.zzj().toArray(new String[0]);
                List zzf2 = zze2.zzf();
                if (zzf2.isEmpty()) {
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[zzf2.size()];
                    for (int i10 = 0; i10 < zzf2.size(); i10++) {
                        zzaoVarArr2[i10] = new zzao(((zzcb) zzf2.get(i10)).zzc() - 1, (String[]) ((zzcb) zzf2.get(i10)).zzb().toArray(new String[0]));
                    }
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, zzd2, zze3, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                zzarVar = null;
            }
            if (zzcVar.zzs()) {
                zzt zzf3 = zzcVar.zzf();
                zzasVar = new zzas(zzf3.zzi(), zzf3.zzk(), zzf3.zzq(), zzf3.zzo(), zzf3.zzl(), zzf3.zze(), zzf3.zzc(), zzf3.zzd(), zzf3.zzf(), zzf3.zzp(), zzf3.zzm(), zzf3.zzj(), zzf3.zzh(), zzf3.zzn());
            } else {
                zzasVar = null;
            }
            switch (zzcVar.zzz() - 1) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 8;
                    break;
                case 5:
                    i = 16;
                    break;
                case 6:
                    i = 32;
                    break;
                case 7:
                    i = 64;
                    break;
                case 8:
                    i = 128;
                    break;
                case 9:
                    i = 256;
                    break;
                case 10:
                    i = 512;
                    break;
                case 11:
                    i = 1024;
                    break;
                case 12:
                    i = 2048;
                    break;
                case 13:
                    i = 4096;
                    break;
                default:
                    i = -1;
                    break;
            }
            String zzn = zzcVar.zzn();
            if (zzcVar.zzm().zzn()) {
                str = zzcVar.zzm().zzu();
            } else {
                str = null;
            }
            byte[] zzx = zzcVar.zzm().zzx();
            List zzo2 = zzcVar.zzo();
            if (zzo2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[zzo2.size()];
                for (int i11 = 0; i11 < zzo2.size(); i11++) {
                    pointArr2[i11] = new Point(((zzae) zzo2.get(i11)).zza(), ((zzae) zzo2.get(i11)).zzb());
                }
                pointArr = pointArr2;
            }
            switch (zzcVar.zzA() - 1) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 11:
                    i2 = 11;
                    break;
                case 12:
                    i2 = 12;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            arrayList.add(new zzba(i, zzn, str, zzx, pointArr, i2, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i3 = -1;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzc() {
        if (this.f108803c != null) {
            return;
        }
        this.f108803c = new BarhopperV3();
        zzh zza = zzi.zza();
        zze zza2 = zzf.zza();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            com.google.barhopper.deeplearning.zzb zza3 = com.google.barhopper.deeplearning.zzc.zza();
            zza3.zzc(i);
            zza3.zzd(i);
            for (int i4 = 0; i4 < f108799d[i3]; i4++) {
                double[] dArr = f108800e[i2];
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) (dArr[0] * 320.0d);
                zza3.zza(f / sqrt);
                zza3.zzb(f * sqrt);
                i2++;
            }
            i += i;
            zza2.zza(zza3);
        }
        zza.zza(zza2);
        try {
            InputStream open = this.f108801a.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            InputStream open2 = this.f108801a.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
            try {
                InputStream open3 = this.f108801a.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                zzk zza4 = BarhopperV3Options.zza();
                zza.zzb(zzdb.zzs(open));
                zza4.zza(zza);
                zzm zza5 = com.google.barhopper.deeplearning.zzn.zza();
                zza5.zza(zzdb.zzs(open2));
                zza5.zzb(zzdb.zzs(open3));
                zza4.zzb(zza5);
                ((BarhopperV3) Preconditions.checkNotNull(this.f108803c)).create(zza4.zzj());
                if (open3 != null) {
                    open3.close();
                }
                if (open2 != null) {
                    open2.close();
                }
                if (open != null) {
                    open.close();
                }
            } catch (Throwable th2) {
                if (open2 != null) {
                    try {
                        open2.close();
                    } catch (Throwable th3) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to open Barcode models", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f108803c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f108803c = null;
        }
    }
}
