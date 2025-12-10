package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21314nr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21314nr2 f72486a = new C21314nr2();

    /* renamed from: b */
    public static final FieldDescriptor f72487b;

    /* renamed from: c */
    public static final FieldDescriptor f72488c;

    /* renamed from: d */
    public static final FieldDescriptor f72489d;

    /* renamed from: e */
    public static final FieldDescriptor f72490e;

    /* renamed from: f */
    public static final FieldDescriptor f72491f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f72487b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f72488c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f72489d = builder3.withProperty(zzctVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        f72490e = builder4.withProperty(zzctVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("recognizerOptions");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        f72491f = builder5.withProperty(zzctVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzes zzesVar = (zzes) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f72487b, zzesVar.zza());
        objectEncoderContext.add(f72488c, (Object) null);
        objectEncoderContext.add(f72489d, zzesVar.zzc());
        objectEncoderContext.add(f72490e, (Object) null);
        objectEncoderContext.add(f72491f, zzesVar.zzb());
    }
}
