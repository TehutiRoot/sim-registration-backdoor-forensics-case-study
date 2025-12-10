package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ax2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19096ax2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19096ax2 f38882a = new C19096ax2();

    /* renamed from: b */
    public static final FieldDescriptor f38883b;

    /* renamed from: c */
    public static final FieldDescriptor f38884c;

    /* renamed from: d */
    public static final FieldDescriptor f38885d;

    /* renamed from: e */
    public static final FieldDescriptor f38886e;

    /* renamed from: f */
    public static final FieldDescriptor f38887f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f38883b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f38884c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f38885d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f38886e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("recognizerOptions");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f38887f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgw zzgwVar = (zzgw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
