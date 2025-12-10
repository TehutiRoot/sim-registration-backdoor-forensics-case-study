package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ws2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22865ws2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22865ws2 f108166a = new C22865ws2();

    /* renamed from: b */
    public static final FieldDescriptor f108167b;

    /* renamed from: c */
    public static final FieldDescriptor f108168c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("eventType");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108167b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108168c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlb zzlbVar = (zzlb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
