package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzha;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: tx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22364tx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22364tx2 f107251a = new C22364tx2();

    /* renamed from: b */
    public static final FieldDescriptor f107252b;

    /* renamed from: c */
    public static final FieldDescriptor f107253c;

    /* renamed from: d */
    public static final FieldDescriptor f107254d;

    /* renamed from: e */
    public static final FieldDescriptor f107255e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f107252b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f107253c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f107254d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f107255e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzha zzhaVar = (zzha) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
