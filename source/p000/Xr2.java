package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zznc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Xr2 */
/* loaded from: classes3.dex */
public final class Xr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Xr2 f7596a = new Xr2();

    /* renamed from: b */
    public static final FieldDescriptor f7597b;

    /* renamed from: c */
    public static final FieldDescriptor f7598c;

    /* renamed from: d */
    public static final FieldDescriptor f7599d;

    /* renamed from: e */
    public static final FieldDescriptor f7600e;

    /* renamed from: f */
    public static final FieldDescriptor f7601f;

    /* renamed from: g */
    public static final FieldDescriptor f7602g;

    /* renamed from: h */
    public static final FieldDescriptor f7603h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f7597b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f7598c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f7599d = builder3.withProperty(zzayVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        f7600e = builder4.withProperty(zzayVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        f7601f = builder5.withProperty(zzayVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        f7602g = builder6.withProperty(zzayVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        f7603h = builder7.withProperty(zzayVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f7597b, zzncVar.zzc());
        objectEncoderContext.add(f7598c, zzncVar.zzf());
        objectEncoderContext.add(f7599d, zzncVar.zza());
        objectEncoderContext.add(f7600e, zzncVar.zze());
        objectEncoderContext.add(f7601f, zzncVar.zzb());
        objectEncoderContext.add(f7602g, zzncVar.zzd());
        objectEncoderContext.add(f7603h, (Object) null);
    }
}
