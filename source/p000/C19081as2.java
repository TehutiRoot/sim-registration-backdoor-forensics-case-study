package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: as2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19081as2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19081as2 f38841a = new C19081as2();

    /* renamed from: b */
    public static final FieldDescriptor f38842b;

    /* renamed from: c */
    public static final FieldDescriptor f38843c;

    /* renamed from: d */
    public static final FieldDescriptor f38844d;

    /* renamed from: e */
    public static final FieldDescriptor f38845e;

    /* renamed from: f */
    public static final FieldDescriptor f38846f;

    /* renamed from: g */
    public static final FieldDescriptor f38847g;

    /* renamed from: h */
    public static final FieldDescriptor f38848h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f38842b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f38843c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f38844d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f38845e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f38846f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f38847g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f38848h = builder7.withProperty(zzcqVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkx zzkxVar = (zzkx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
