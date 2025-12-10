package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: gq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20107gq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20107gq2 f62315a = new C20107gq2();

    /* renamed from: b */
    public static final FieldDescriptor f62316b;

    /* renamed from: c */
    public static final FieldDescriptor f62317c;

    /* renamed from: d */
    public static final FieldDescriptor f62318d;

    /* renamed from: e */
    public static final FieldDescriptor f62319e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f62316b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f62317c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f62318d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("objectInfos");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f62319e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzki zzkiVar = (zzki) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
