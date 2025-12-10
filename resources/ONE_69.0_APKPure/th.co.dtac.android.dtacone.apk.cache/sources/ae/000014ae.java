package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzba;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18669Vg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18669Vg2 f7049a = new C18669Vg2();

    /* renamed from: b */
    public static final FieldDescriptor f7050b;

    /* renamed from: c */
    public static final FieldDescriptor f7051c;

    /* renamed from: d */
    public static final FieldDescriptor f7052d;

    /* renamed from: e */
    public static final FieldDescriptor f7053e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7050b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7051c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7052d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f7053e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzba zzbaVar = (zzba) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}