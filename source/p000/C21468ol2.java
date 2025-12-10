package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ol2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21468ol2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21468ol2 f72917a = new C21468ol2();

    /* renamed from: b */
    public static final FieldDescriptor f72918b;

    /* renamed from: c */
    public static final FieldDescriptor f72919c;

    /* renamed from: d */
    public static final FieldDescriptor f72920d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72918b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72919c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f72920d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdh zzdhVar = (zzdh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
