package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzht;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Sj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18483Sj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18483Sj2 f5908a = new C18483Sj2();

    /* renamed from: b */
    public static final FieldDescriptor f5909b;

    /* renamed from: c */
    public static final FieldDescriptor f5910c;

    /* renamed from: d */
    public static final FieldDescriptor f5911d;

    /* renamed from: e */
    public static final FieldDescriptor f5912e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("supportedFormats");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5909b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5910c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f5911d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("allowManualInput");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f5912e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzht zzhtVar = (zzht) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}