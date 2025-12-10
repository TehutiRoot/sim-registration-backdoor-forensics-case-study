package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zznc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Us2 */
/* loaded from: classes3.dex */
public final class Us2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Us2 f6741a = new Us2();

    /* renamed from: b */
    public static final FieldDescriptor f6742b;

    /* renamed from: c */
    public static final FieldDescriptor f6743c;

    /* renamed from: d */
    public static final FieldDescriptor f6744d;

    /* renamed from: e */
    public static final FieldDescriptor f6745e;

    /* renamed from: f */
    public static final FieldDescriptor f6746f;

    /* renamed from: g */
    public static final FieldDescriptor f6747g;

    /* renamed from: h */
    public static final FieldDescriptor f6748h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f6742b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f6743c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f6744d = builder3.withProperty(zzayVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        f6745e = builder4.withProperty(zzayVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        f6746f = builder5.withProperty(zzayVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        f6747g = builder6.withProperty(zzayVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        f6748h = builder7.withProperty(zzayVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f6742b, zzncVar.zzc());
        objectEncoderContext.add(f6743c, zzncVar.zzf());
        objectEncoderContext.add(f6744d, zzncVar.zza());
        objectEncoderContext.add(f6745e, zzncVar.zze());
        objectEncoderContext.add(f6746f, zzncVar.zzb());
        objectEncoderContext.add(f6747g, zzncVar.zzd());
        objectEncoderContext.add(f6748h, (Object) null);
    }
}