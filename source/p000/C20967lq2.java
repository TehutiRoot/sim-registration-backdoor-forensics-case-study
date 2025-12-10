package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: lq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20967lq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20967lq2 f71729a = new C20967lq2();

    /* renamed from: b */
    public static final FieldDescriptor f71730b;

    /* renamed from: c */
    public static final FieldDescriptor f71731c;

    /* renamed from: d */
    public static final FieldDescriptor f71732d;

    /* renamed from: e */
    public static final FieldDescriptor f71733e;

    /* renamed from: f */
    public static final FieldDescriptor f71734f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f71730b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f71731c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f71732d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f71733e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f71734f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkj zzkjVar = (zzkj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
