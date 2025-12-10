package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: my2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21163my2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21163my2 f72097a = new C21163my2();

    /* renamed from: b */
    public static final FieldDescriptor f72098b;

    /* renamed from: c */
    public static final FieldDescriptor f72099c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72098b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72099c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmx zzmxVar = (zzmx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
