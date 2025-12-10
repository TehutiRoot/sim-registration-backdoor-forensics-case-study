package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzki;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ar2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19078ar2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19078ar2 f38833a = new C19078ar2();

    /* renamed from: b */
    public static final FieldDescriptor f38834b;

    /* renamed from: c */
    public static final FieldDescriptor f38835c;

    /* renamed from: d */
    public static final FieldDescriptor f38836d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f38834b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f38835c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f38836d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzki zzkiVar = (zzki) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
