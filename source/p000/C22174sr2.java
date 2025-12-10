package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: sr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22174sr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22174sr2 f79914a = new C22174sr2();

    /* renamed from: b */
    public static final FieldDescriptor f79915b;

    /* renamed from: c */
    public static final FieldDescriptor f79916c;

    /* renamed from: d */
    public static final FieldDescriptor f79917d;

    /* renamed from: e */
    public static final FieldDescriptor f79918e;

    /* renamed from: f */
    public static final FieldDescriptor f79919f;

    /* renamed from: g */
    public static final FieldDescriptor f79920g;

    /* renamed from: h */
    public static final FieldDescriptor f79921h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f79915b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageSource");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f79916c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageFormat");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f79917d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageByteSize");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f79918e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageWidth");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f79919f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("imageHeight");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f79920g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("rotationDegrees");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f79921h = builder7.withProperty(zzcqVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkm zzkmVar = (zzkm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
