package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzht;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18631Vi2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18631Vi2 f6794a = new C18631Vi2();

    /* renamed from: b */
    public static final FieldDescriptor f6795b;

    /* renamed from: c */
    public static final FieldDescriptor f6796c;

    /* renamed from: d */
    public static final FieldDescriptor f6797d;

    /* renamed from: e */
    public static final FieldDescriptor f6798e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("supportedFormats");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f6795b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f6796c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f6797d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("allowManualInput");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f6798e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzht zzhtVar = (zzht) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
