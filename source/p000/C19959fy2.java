package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: fy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19959fy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19959fy2 f62002a = new C19959fy2();

    /* renamed from: b */
    public static final FieldDescriptor f62003b;

    /* renamed from: c */
    public static final FieldDescriptor f62004c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f62003b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f62004c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmw zzmwVar = (zzmw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
