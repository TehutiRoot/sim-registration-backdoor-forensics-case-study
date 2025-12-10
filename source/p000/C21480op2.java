package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: op2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21480op2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21480op2 f72937a = new C21480op2();

    /* renamed from: b */
    public static final FieldDescriptor f72938b;

    /* renamed from: c */
    public static final FieldDescriptor f72939c;

    /* renamed from: d */
    public static final FieldDescriptor f72940d;

    /* renamed from: e */
    public static final FieldDescriptor f72941e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("supportedFormats");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72938b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72939c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f72940d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("allowManualInput");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f72941e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjm zzjmVar = (zzjm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
