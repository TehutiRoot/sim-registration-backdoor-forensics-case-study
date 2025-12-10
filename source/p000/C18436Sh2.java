package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhi;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Sh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18436Sh2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18436Sh2 f5675a = new C18436Sh2();

    /* renamed from: b */
    public static final FieldDescriptor f5676b;

    /* renamed from: c */
    public static final FieldDescriptor f5677c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxResults");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5676b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("modelType");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5677c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhi zzhiVar = (zzhi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
