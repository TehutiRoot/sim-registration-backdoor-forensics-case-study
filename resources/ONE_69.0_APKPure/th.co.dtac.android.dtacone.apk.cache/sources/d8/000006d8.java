package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.mlkit.vision.text.Text;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: HC2 */
/* loaded from: classes4.dex */
public abstract class HC2 {

    /* renamed from: a */
    public static final zzv f2313a = zzv.zza("\n");

    /* renamed from: b */
    public static final Comparator f2314b = new Comparator() { // from class: com.google.mlkit.vision.text.internal.zzf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzv zzvVar = HC2.f2313a;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* renamed from: a */
    public static Text m68158a(zzl[] zzlVarArr, final Matrix matrix) {
        int i = 1;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i3 = 0;
        while (i3 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i3);
            zzbh zzbhVar2 = new zzbh();
            for (int i4 = 0; i4 < sparseArray3.size(); i4 += i) {
                zzbhVar2.zza((zzl) sparseArray3.valueAt(i4));
            }
            zzbk zzb = zzbhVar2.zzb();
            List zza = zzbu.zza(zzb, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzh
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    String str;
                    String str2;
                    com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) obj;
                    zzv zzvVar = HC2.f2313a;
                    List m31669b = AbstractC19769eb2.m31669b(zzlVar2.zzb);
                    if (zzy.zzb(zzlVar2.zze)) {
                        str = "";
                    } else {
                        str = zzlVar2.zze;
                    }
                    String str3 = str;
                    Rect m31670a = AbstractC19769eb2.m31670a(m31669b);
                    if (zzy.zzb(zzlVar2.zzg)) {
                        str2 = "und";
                    } else {
                        str2 = zzlVar2.zzg;
                    }
                    String str4 = str2;
                    final Matrix matrix2 = matrix;
                    return new Text.Line(str3, m31670a, m31669b, str4, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: com.google.mlkit.vision.text.internal.zzj
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            String str5;
                            String str6;
                            com.google.android.gms.internal.mlkit_vision_text_common.zzr zzrVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzr) obj2;
                            zzv zzvVar2 = HC2.f2313a;
                            List m31669b2 = AbstractC19769eb2.m31669b(zzrVar.zzb);
                            if (zzy.zzb(zzrVar.zzd)) {
                                str5 = "";
                            } else {
                                str5 = zzrVar.zzd;
                            }
                            String str7 = str5;
                            Rect m31670a2 = AbstractC19769eb2.m31670a(m31669b2);
                            if (zzy.zzb(zzrVar.zzf)) {
                                str6 = "und";
                            } else {
                                str6 = zzrVar.zzf;
                            }
                            return new Text.Element(str7, m31670a2, m31669b2, str6, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            zzf zzfVar = ((zzl) zzb.get(i2)).zzb;
            zzcp listIterator = zzb.listIterator(i2);
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MAX_VALUE;
            while (listIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) listIterator.next()).zzb;
                double sin = Math.sin(Math.toRadians(zzfVar.zze));
                zzcp zzcpVar = listIterator;
                double cos = Math.cos(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i9 = i3;
                zzbh zzbhVar3 = zzbhVar;
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                point.offset(-zzfVar.zza, -zzfVar.zzb);
                Point point2 = r15[0];
                int i10 = point2.x;
                List list = zza;
                int i11 = point2.y;
                int i12 = (int) ((i10 * cos) + (i11 * sin));
                point2.x = i12;
                int i13 = (int) (((-i10) * sin) + (i11 * cos));
                point2.y = i13;
                Point[] pointArr = {point, new Point(zzfVar2.zzc + i12, i13), new Point(zzfVar2.zzc + i12, zzfVar2.zzd + i13), new Point(i12, i13 + zzfVar2.zzd)};
                i5 = i5;
                i6 = i6;
                i7 = i7;
                i8 = i8;
                for (int i14 = 0; i14 < 4; i14++) {
                    Point point3 = pointArr[i14];
                    i7 = Math.min(i7, point3.x);
                    i5 = Math.max(i5, point3.x);
                    i8 = Math.min(i8, point3.y);
                    i6 = Math.max(i6, point3.y);
                }
                listIterator = zzcpVar;
                zza = list;
                sparseArray = sparseArray4;
                i3 = i9;
                zzbhVar = zzbhVar3;
            }
            zzbh zzbhVar4 = zzbhVar;
            SparseArray sparseArray5 = sparseArray;
            int i15 = i3;
            List list2 = zza;
            int i16 = i6;
            int i17 = i7;
            int i18 = zzfVar.zza;
            int i19 = zzfVar.zzb;
            double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i17, i8), new Point(i5, i8), new Point(i5, i16), new Point(i17, i16)};
            int i20 = 0;
            for (int i21 = 4; i20 < i21; i21 = 4) {
                Point point4 = pointArr2[i20];
                int i22 = point4.x;
                int i23 = point4.y;
                point4.x = (int) ((i22 * cos2) - (i23 * sin2));
                point4.y = (int) ((i22 * sin2) + (i23 * cos2));
                point4.offset(i18, i19);
                i20++;
                sin2 = sin2;
            }
            List asList = Arrays.asList(pointArr2);
            zzbhVar4.zza(new Text.TextBlock(f2313a.zzb(zzbu.zza(list2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzi
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((Text.Line) obj).getText();
                }
            })), AbstractC19769eb2.m31670a(asList), asList, m68157b(list2), matrix, list2));
            i3 = i15 + 1;
            zzbhVar = zzbhVar4;
            sparseArray = sparseArray5;
            i = 1;
            i2 = 0;
        }
        zzbk zzb2 = zzbhVar.zzb();
        return new Text(f2313a.zzb(zzbu.zza(zzb2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzg
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((Text.TextBlock) obj).getText();
            }
        })), zzb2);
    }

    /* renamed from: b */
    public static String m68157b(List list) {
        int i;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String recognizedLanguage = ((Text.Line) it.next()).getRecognizedLanguage();
            if (hashMap.containsKey(recognizedLanguage)) {
                i = ((Integer) hashMap.get(recognizedLanguage)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(recognizedLanguage, Integer.valueOf(i + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (!entrySet.isEmpty()) {
            String str = (String) ((Map.Entry) Collections.max(entrySet, f2314b)).getKey();
            if (!zzy.zzb(str)) {
                return str;
            }
            return "und";
        }
        return "und";
    }
}