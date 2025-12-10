package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20765kg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20765kg2 f67976a = new C20765kg2();

    /* renamed from: b */
    public static final FieldDescriptor f67977b;

    /* renamed from: c */
    public static final FieldDescriptor f67978c;

    /* renamed from: d */
    public static final FieldDescriptor f67979d;

    /* renamed from: e */
    public static final FieldDescriptor f67980e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f67977b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f67978c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f67979d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("options");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f67980e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbg zzbgVar = (zzbg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
