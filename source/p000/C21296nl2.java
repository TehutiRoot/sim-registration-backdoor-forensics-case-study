package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21296nl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21296nl2 f72447a = new C21296nl2();

    /* renamed from: b */
    public static final FieldDescriptor f72448b;

    /* renamed from: c */
    public static final FieldDescriptor f72449c;

    /* renamed from: d */
    public static final FieldDescriptor f72450d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f72448b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isDownloaded");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f72449c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f72450d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzir zzirVar = (zzir) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
