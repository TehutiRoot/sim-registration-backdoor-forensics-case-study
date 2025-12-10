package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21290nj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21290nj2 f72430a = new C21290nj2();

    /* renamed from: b */
    public static final FieldDescriptor f72431b;

    /* renamed from: c */
    public static final FieldDescriptor f72432c;

    /* renamed from: d */
    public static final FieldDescriptor f72433d;

    /* renamed from: e */
    public static final FieldDescriptor f72434e;

    /* renamed from: f */
    public static final FieldDescriptor f72435f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f72431b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f72432c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f72433d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f72434e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelInitializationMs");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f72435f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhx zzhxVar = (zzhx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
