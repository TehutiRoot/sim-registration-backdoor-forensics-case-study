package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ai2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19093ai2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19093ai2 f8485a = new C19093ai2();

    /* renamed from: b */
    public static final FieldDescriptor f8486b;

    /* renamed from: c */
    public static final FieldDescriptor f8487c;

    /* renamed from: d */
    public static final FieldDescriptor f8488d;

    /* renamed from: e */
    public static final FieldDescriptor f8489e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f8486b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f8487c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("eventType");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f8488d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f8489e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhf zzhfVar = (zzhf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}