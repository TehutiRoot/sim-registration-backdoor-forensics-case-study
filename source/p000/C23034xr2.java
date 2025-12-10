package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23034xr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23034xr2 f108525a = new C23034xr2();

    /* renamed from: b */
    public static final FieldDescriptor f108526b;

    /* renamed from: c */
    public static final FieldDescriptor f108527c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorSpace");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108526b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f108527c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzku zzkuVar = (zzku) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
