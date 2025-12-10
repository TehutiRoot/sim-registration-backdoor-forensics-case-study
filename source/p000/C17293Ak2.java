package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ak2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17293Ak2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17293Ak2 f184a = new C17293Ak2();

    /* renamed from: b */
    public static final FieldDescriptor f185b;

    /* renamed from: c */
    public static final FieldDescriptor f186c;

    /* renamed from: d */
    public static final FieldDescriptor f187d;

    /* renamed from: e */
    public static final FieldDescriptor f188e;

    /* renamed from: f */
    public static final FieldDescriptor f189f;

    /* renamed from: g */
    public static final FieldDescriptor f190g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("mode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f185b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("landmark");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f186c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classification");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f187d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("prominentFaceOnly");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f188e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tracking");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f189f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f190g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlu zzluVar = (zzlu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
