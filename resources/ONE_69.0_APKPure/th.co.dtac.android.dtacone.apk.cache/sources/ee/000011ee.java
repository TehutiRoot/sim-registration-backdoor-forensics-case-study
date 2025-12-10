package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ss2 */
/* loaded from: classes3.dex */
public final class Ss2 implements ObjectEncoder {

    /* renamed from: A */
    public static final FieldDescriptor f5965A;

    /* renamed from: B */
    public static final FieldDescriptor f5966B;

    /* renamed from: C */
    public static final FieldDescriptor f5967C;

    /* renamed from: D */
    public static final FieldDescriptor f5968D;

    /* renamed from: E */
    public static final FieldDescriptor f5969E;

    /* renamed from: F */
    public static final FieldDescriptor f5970F;

    /* renamed from: G */
    public static final FieldDescriptor f5971G;

    /* renamed from: H */
    public static final FieldDescriptor f5972H;

    /* renamed from: I */
    public static final FieldDescriptor f5973I;

    /* renamed from: J */
    public static final FieldDescriptor f5974J;

    /* renamed from: K */
    public static final FieldDescriptor f5975K;

    /* renamed from: L */
    public static final FieldDescriptor f5976L;

    /* renamed from: M */
    public static final FieldDescriptor f5977M;

    /* renamed from: N */
    public static final FieldDescriptor f5978N;

    /* renamed from: O */
    public static final FieldDescriptor f5979O;

    /* renamed from: P */
    public static final FieldDescriptor f5980P;

    /* renamed from: Q */
    public static final FieldDescriptor f5981Q;

    /* renamed from: R */
    public static final FieldDescriptor f5982R;

    /* renamed from: S */
    public static final FieldDescriptor f5983S;

    /* renamed from: T */
    public static final FieldDescriptor f5984T;

    /* renamed from: U */
    public static final FieldDescriptor f5985U;

    /* renamed from: V */
    public static final FieldDescriptor f5986V;

    /* renamed from: W */
    public static final FieldDescriptor f5987W;

    /* renamed from: X */
    public static final FieldDescriptor f5988X;

    /* renamed from: Y */
    public static final FieldDescriptor f5989Y;

    /* renamed from: Z */
    public static final FieldDescriptor f5990Z;

    /* renamed from: a */
    public static final Ss2 f5991a = new Ss2();

    /* renamed from: a0 */
    public static final FieldDescriptor f5992a0;

    /* renamed from: b */
    public static final FieldDescriptor f5993b;

    /* renamed from: b0 */
    public static final FieldDescriptor f5994b0;

    /* renamed from: c */
    public static final FieldDescriptor f5995c;

    /* renamed from: c0 */
    public static final FieldDescriptor f5996c0;

    /* renamed from: d */
    public static final FieldDescriptor f5997d;

    /* renamed from: d0 */
    public static final FieldDescriptor f5998d0;

    /* renamed from: e */
    public static final FieldDescriptor f5999e;

    /* renamed from: e0 */
    public static final FieldDescriptor f6000e0;

    /* renamed from: f */
    public static final FieldDescriptor f6001f;

    /* renamed from: f0 */
    public static final FieldDescriptor f6002f0;

    /* renamed from: g */
    public static final FieldDescriptor f6003g;

    /* renamed from: g0 */
    public static final FieldDescriptor f6004g0;

    /* renamed from: h */
    public static final FieldDescriptor f6005h;

    /* renamed from: h0 */
    public static final FieldDescriptor f6006h0;

    /* renamed from: i */
    public static final FieldDescriptor f6007i;

    /* renamed from: i0 */
    public static final FieldDescriptor f6008i0;

    /* renamed from: j */
    public static final FieldDescriptor f6009j;

    /* renamed from: j0 */
    public static final FieldDescriptor f6010j0;

    /* renamed from: k */
    public static final FieldDescriptor f6011k;

    /* renamed from: k0 */
    public static final FieldDescriptor f6012k0;

    /* renamed from: l */
    public static final FieldDescriptor f6013l;

    /* renamed from: l0 */
    public static final FieldDescriptor f6014l0;

    /* renamed from: m */
    public static final FieldDescriptor f6015m;

    /* renamed from: m0 */
    public static final FieldDescriptor f6016m0;

    /* renamed from: n */
    public static final FieldDescriptor f6017n;

    /* renamed from: n0 */
    public static final FieldDescriptor f6018n0;

    /* renamed from: o */
    public static final FieldDescriptor f6019o;

    /* renamed from: o0 */
    public static final FieldDescriptor f6020o0;

    /* renamed from: p */
    public static final FieldDescriptor f6021p;

    /* renamed from: p0 */
    public static final FieldDescriptor f6022p0;

    /* renamed from: q */
    public static final FieldDescriptor f6023q;

    /* renamed from: q0 */
    public static final FieldDescriptor f6024q0;

    /* renamed from: r */
    public static final FieldDescriptor f6025r;

    /* renamed from: r0 */
    public static final FieldDescriptor f6026r0;

    /* renamed from: s */
    public static final FieldDescriptor f6027s;

    /* renamed from: s0 */
    public static final FieldDescriptor f6028s0;

    /* renamed from: t */
    public static final FieldDescriptor f6029t;

    /* renamed from: t0 */
    public static final FieldDescriptor f6030t0;

    /* renamed from: u */
    public static final FieldDescriptor f6031u;

    /* renamed from: u0 */
    public static final FieldDescriptor f6032u0;

    /* renamed from: v */
    public static final FieldDescriptor f6033v;

    /* renamed from: v0 */
    public static final FieldDescriptor f6034v0;

    /* renamed from: w */
    public static final FieldDescriptor f6035w;

    /* renamed from: w0 */
    public static final FieldDescriptor f6036w0;

    /* renamed from: x */
    public static final FieldDescriptor f6037x;

    /* renamed from: x0 */
    public static final FieldDescriptor f6038x0;

    /* renamed from: y */
    public static final FieldDescriptor f6039y;

    /* renamed from: y0 */
    public static final FieldDescriptor f6040y0;

    /* renamed from: z */
    public static final FieldDescriptor f6041z;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("systemInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f5993b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventName");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f5995c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isThickClient");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(37);
        f5997d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientType");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(61);
        f5999e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelDownloadLogEvent");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(3);
        f6001f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customModelLoadLogEvent");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(20);
        f6003g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("customModelInferenceLogEvent");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(4);
        f6005h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customModelCreateLogEvent");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(29);
        f6007i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("onDeviceFaceDetectionLogEvent");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(5);
        f6009j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("onDeviceFaceLoadLogEvent");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(59);
        f6011k = builder10.withProperty(zzcqVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("onDeviceTextDetectionLogEvent");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(6);
        f6013l = builder11.withProperty(zzcqVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("onDeviceTextDetectionLoadLogEvent");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(79);
        f6015m = builder12.withProperty(zzcqVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("onDeviceBarcodeDetectionLogEvent");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(7);
        f6017n = builder13.withProperty(zzcqVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("onDeviceBarcodeLoadLogEvent");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(58);
        f6019o = builder14.withProperty(zzcqVar14.zzb()).build();
        FieldDescriptor.Builder builder15 = FieldDescriptor.builder("onDeviceImageLabelCreateLogEvent");
        zzcq zzcqVar15 = new zzcq();
        zzcqVar15.zza(48);
        f6021p = builder15.withProperty(zzcqVar15.zzb()).build();
        FieldDescriptor.Builder builder16 = FieldDescriptor.builder("onDeviceImageLabelLoadLogEvent");
        zzcq zzcqVar16 = new zzcq();
        zzcqVar16.zza(49);
        f6023q = builder16.withProperty(zzcqVar16.zzb()).build();
        FieldDescriptor.Builder builder17 = FieldDescriptor.builder("onDeviceImageLabelDetectionLogEvent");
        zzcq zzcqVar17 = new zzcq();
        zzcqVar17.zza(18);
        f6025r = builder17.withProperty(zzcqVar17.zzb()).build();
        FieldDescriptor.Builder builder18 = FieldDescriptor.builder("onDeviceObjectCreateLogEvent");
        zzcq zzcqVar18 = new zzcq();
        zzcqVar18.zza(26);
        f6027s = builder18.withProperty(zzcqVar18.zzb()).build();
        FieldDescriptor.Builder builder19 = FieldDescriptor.builder("onDeviceObjectLoadLogEvent");
        zzcq zzcqVar19 = new zzcq();
        zzcqVar19.zza(27);
        f6029t = builder19.withProperty(zzcqVar19.zzb()).build();
        FieldDescriptor.Builder builder20 = FieldDescriptor.builder("onDeviceObjectInferenceLogEvent");
        zzcq zzcqVar20 = new zzcq();
        zzcqVar20.zza(28);
        f6031u = builder20.withProperty(zzcqVar20.zzb()).build();
        FieldDescriptor.Builder builder21 = FieldDescriptor.builder("onDevicePoseDetectionLogEvent");
        zzcq zzcqVar21 = new zzcq();
        zzcqVar21.zza(44);
        f6033v = builder21.withProperty(zzcqVar21.zzb()).build();
        FieldDescriptor.Builder builder22 = FieldDescriptor.builder("onDeviceSegmentationLogEvent");
        zzcq zzcqVar22 = new zzcq();
        zzcqVar22.zza(45);
        f6035w = builder22.withProperty(zzcqVar22.zzb()).build();
        FieldDescriptor.Builder builder23 = FieldDescriptor.builder("onDeviceSmartReplyLogEvent");
        zzcq zzcqVar23 = new zzcq();
        zzcqVar23.zza(19);
        f6037x = builder23.withProperty(zzcqVar23.zzb()).build();
        FieldDescriptor.Builder builder24 = FieldDescriptor.builder("onDeviceLanguageIdentificationLogEvent");
        zzcq zzcqVar24 = new zzcq();
        zzcqVar24.zza(21);
        f6039y = builder24.withProperty(zzcqVar24.zzb()).build();
        FieldDescriptor.Builder builder25 = FieldDescriptor.builder("onDeviceTranslationLogEvent");
        zzcq zzcqVar25 = new zzcq();
        zzcqVar25.zza(22);
        f6041z = builder25.withProperty(zzcqVar25.zzb()).build();
        FieldDescriptor.Builder builder26 = FieldDescriptor.builder("cloudFaceDetectionLogEvent");
        zzcq zzcqVar26 = new zzcq();
        zzcqVar26.zza(8);
        f5965A = builder26.withProperty(zzcqVar26.zzb()).build();
        FieldDescriptor.Builder builder27 = FieldDescriptor.builder("cloudCropHintDetectionLogEvent");
        zzcq zzcqVar27 = new zzcq();
        zzcqVar27.zza(9);
        f5966B = builder27.withProperty(zzcqVar27.zzb()).build();
        FieldDescriptor.Builder builder28 = FieldDescriptor.builder("cloudDocumentTextDetectionLogEvent");
        zzcq zzcqVar28 = new zzcq();
        zzcqVar28.zza(10);
        f5967C = builder28.withProperty(zzcqVar28.zzb()).build();
        FieldDescriptor.Builder builder29 = FieldDescriptor.builder("cloudImagePropertiesDetectionLogEvent");
        zzcq zzcqVar29 = new zzcq();
        zzcqVar29.zza(11);
        f5968D = builder29.withProperty(zzcqVar29.zzb()).build();
        FieldDescriptor.Builder builder30 = FieldDescriptor.builder("cloudImageLabelDetectionLogEvent");
        zzcq zzcqVar30 = new zzcq();
        zzcqVar30.zza(12);
        f5969E = builder30.withProperty(zzcqVar30.zzb()).build();
        FieldDescriptor.Builder builder31 = FieldDescriptor.builder("cloudLandmarkDetectionLogEvent");
        zzcq zzcqVar31 = new zzcq();
        zzcqVar31.zza(13);
        f5970F = builder31.withProperty(zzcqVar31.zzb()).build();
        FieldDescriptor.Builder builder32 = FieldDescriptor.builder("cloudLogoDetectionLogEvent");
        zzcq zzcqVar32 = new zzcq();
        zzcqVar32.zza(14);
        f5971G = builder32.withProperty(zzcqVar32.zzb()).build();
        FieldDescriptor.Builder builder33 = FieldDescriptor.builder("cloudSafeSearchDetectionLogEvent");
        zzcq zzcqVar33 = new zzcq();
        zzcqVar33.zza(15);
        f5972H = builder33.withProperty(zzcqVar33.zzb()).build();
        FieldDescriptor.Builder builder34 = FieldDescriptor.builder("cloudTextDetectionLogEvent");
        zzcq zzcqVar34 = new zzcq();
        zzcqVar34.zza(16);
        f5973I = builder34.withProperty(zzcqVar34.zzb()).build();
        FieldDescriptor.Builder builder35 = FieldDescriptor.builder("cloudWebSearchDetectionLogEvent");
        zzcq zzcqVar35 = new zzcq();
        zzcqVar35.zza(17);
        f5974J = builder35.withProperty(zzcqVar35.zzb()).build();
        FieldDescriptor.Builder builder36 = FieldDescriptor.builder("automlImageLabelingCreateLogEvent");
        zzcq zzcqVar36 = new zzcq();
        zzcqVar36.zza(23);
        f5975K = builder36.withProperty(zzcqVar36.zzb()).build();
        FieldDescriptor.Builder builder37 = FieldDescriptor.builder("automlImageLabelingLoadLogEvent");
        zzcq zzcqVar37 = new zzcq();
        zzcqVar37.zza(24);
        f5976L = builder37.withProperty(zzcqVar37.zzb()).build();
        FieldDescriptor.Builder builder38 = FieldDescriptor.builder("automlImageLabelingInferenceLogEvent");
        zzcq zzcqVar38 = new zzcq();
        zzcqVar38.zza(25);
        f5977M = builder38.withProperty(zzcqVar38.zzb()).build();
        FieldDescriptor.Builder builder39 = FieldDescriptor.builder("isModelDownloadedLogEvent");
        zzcq zzcqVar39 = new zzcq();
        zzcqVar39.zza(39);
        f5978N = builder39.withProperty(zzcqVar39.zzb()).build();
        FieldDescriptor.Builder builder40 = FieldDescriptor.builder("deleteModelLogEvent");
        zzcq zzcqVar40 = new zzcq();
        zzcqVar40.zza(40);
        f5979O = builder40.withProperty(zzcqVar40.zzb()).build();
        FieldDescriptor.Builder builder41 = FieldDescriptor.builder("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzcq zzcqVar41 = new zzcq();
        zzcqVar41.zza(30);
        f5980P = builder41.withProperty(zzcqVar41.zzb()).build();
        FieldDescriptor.Builder builder42 = FieldDescriptor.builder("aggregatedCustomModelInferenceLogEvent");
        zzcq zzcqVar42 = new zzcq();
        zzcqVar42.zza(31);
        f5981Q = builder42.withProperty(zzcqVar42.zzb()).build();
        FieldDescriptor.Builder builder43 = FieldDescriptor.builder("aggregatedOnDeviceFaceDetectionLogEvent");
        zzcq zzcqVar43 = new zzcq();
        zzcqVar43.zza(32);
        f5982R = builder43.withProperty(zzcqVar43.zzb()).build();
        FieldDescriptor.Builder builder44 = FieldDescriptor.builder("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzcq zzcqVar44 = new zzcq();
        zzcqVar44.zza(33);
        f5983S = builder44.withProperty(zzcqVar44.zzb()).build();
        FieldDescriptor.Builder builder45 = FieldDescriptor.builder("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzcq zzcqVar45 = new zzcq();
        zzcqVar45.zza(34);
        f5984T = builder45.withProperty(zzcqVar45.zzb()).build();
        FieldDescriptor.Builder builder46 = FieldDescriptor.builder("aggregatedOnDeviceObjectInferenceLogEvent");
        zzcq zzcqVar46 = new zzcq();
        zzcqVar46.zza(35);
        f5985U = builder46.withProperty(zzcqVar46.zzb()).build();
        FieldDescriptor.Builder builder47 = FieldDescriptor.builder("aggregatedOnDeviceTextDetectionLogEvent");
        zzcq zzcqVar47 = new zzcq();
        zzcqVar47.zza(36);
        f5986V = builder47.withProperty(zzcqVar47.zzb()).build();
        FieldDescriptor.Builder builder48 = FieldDescriptor.builder("aggregatedOnDevicePoseDetectionLogEvent");
        zzcq zzcqVar48 = new zzcq();
        zzcqVar48.zza(46);
        f5987W = builder48.withProperty(zzcqVar48.zzb()).build();
        FieldDescriptor.Builder builder49 = FieldDescriptor.builder("aggregatedOnDeviceSegmentationLogEvent");
        zzcq zzcqVar49 = new zzcq();
        zzcqVar49.zza(47);
        f5988X = builder49.withProperty(zzcqVar49.zzb()).build();
        FieldDescriptor.Builder builder50 = FieldDescriptor.builder("pipelineAccelerationInferenceEvents");
        zzcq zzcqVar50 = new zzcq();
        zzcqVar50.zza(69);
        f5989Y = builder50.withProperty(zzcqVar50.zzb()).build();
        FieldDescriptor.Builder builder51 = FieldDescriptor.builder("remoteConfigLogEvent");
        zzcq zzcqVar51 = new zzcq();
        zzcqVar51.zza(42);
        f5990Z = builder51.withProperty(zzcqVar51.zzb()).build();
        FieldDescriptor.Builder builder52 = FieldDescriptor.builder("inputImageConstructionLogEvent");
        zzcq zzcqVar52 = new zzcq();
        zzcqVar52.zza(50);
        f5992a0 = builder52.withProperty(zzcqVar52.zzb()).build();
        FieldDescriptor.Builder builder53 = FieldDescriptor.builder("leakedHandleEvent");
        zzcq zzcqVar53 = new zzcq();
        zzcqVar53.zza(51);
        f5994b0 = builder53.withProperty(zzcqVar53.zzb()).build();
        FieldDescriptor.Builder builder54 = FieldDescriptor.builder("cameraSourceLogEvent");
        zzcq zzcqVar54 = new zzcq();
        zzcqVar54.zza(52);
        f5996c0 = builder54.withProperty(zzcqVar54.zzb()).build();
        FieldDescriptor.Builder builder55 = FieldDescriptor.builder("imageLabelOptionalModuleLogEvent");
        zzcq zzcqVar55 = new zzcq();
        zzcqVar55.zza(53);
        f5998d0 = builder55.withProperty(zzcqVar55.zzb()).build();
        FieldDescriptor.Builder builder56 = FieldDescriptor.builder("languageIdentificationOptionalModuleLogEvent");
        zzcq zzcqVar56 = new zzcq();
        zzcqVar56.zza(54);
        f6000e0 = builder56.withProperty(zzcqVar56.zzb()).build();
        FieldDescriptor.Builder builder57 = FieldDescriptor.builder("faceDetectionOptionalModuleLogEvent");
        zzcq zzcqVar57 = new zzcq();
        zzcqVar57.zza(60);
        f6002f0 = builder57.withProperty(zzcqVar57.zzb()).build();
        FieldDescriptor.Builder builder58 = FieldDescriptor.builder("nlClassifierOptionalModuleLogEvent");
        zzcq zzcqVar58 = new zzcq();
        zzcqVar58.zza(55);
        f6004g0 = builder58.withProperty(zzcqVar58.zzb()).build();
        FieldDescriptor.Builder builder59 = FieldDescriptor.builder("nlClassifierClientLibraryLogEvent");
        zzcq zzcqVar59 = new zzcq();
        zzcqVar59.zza(56);
        f6006h0 = builder59.withProperty(zzcqVar59.zzb()).build();
        FieldDescriptor.Builder builder60 = FieldDescriptor.builder("accelerationAllowlistLogEvent");
        zzcq zzcqVar60 = new zzcq();
        zzcqVar60.zza(57);
        f6008i0 = builder60.withProperty(zzcqVar60.zzb()).build();
        FieldDescriptor.Builder builder61 = FieldDescriptor.builder("toxicityDetectionCreateEvent");
        zzcq zzcqVar61 = new zzcq();
        zzcqVar61.zza(62);
        f6010j0 = builder61.withProperty(zzcqVar61.zzb()).build();
        FieldDescriptor.Builder builder62 = FieldDescriptor.builder("toxicityDetectionLoadEvent");
        zzcq zzcqVar62 = new zzcq();
        zzcqVar62.zza(63);
        f6012k0 = builder62.withProperty(zzcqVar62.zzb()).build();
        FieldDescriptor.Builder builder63 = FieldDescriptor.builder("toxicityDetectionInferenceEvent");
        zzcq zzcqVar63 = new zzcq();
        zzcqVar63.zza(64);
        f6014l0 = builder63.withProperty(zzcqVar63.zzb()).build();
        FieldDescriptor.Builder builder64 = FieldDescriptor.builder("barcodeDetectionOptionalModuleLogEvent");
        zzcq zzcqVar64 = new zzcq();
        zzcqVar64.zza(65);
        f6016m0 = builder64.withProperty(zzcqVar64.zzb()).build();
        FieldDescriptor.Builder builder65 = FieldDescriptor.builder("customImageLabelOptionalModuleLogEvent");
        zzcq zzcqVar65 = new zzcq();
        zzcqVar65.zza(66);
        f6018n0 = builder65.withProperty(zzcqVar65.zzb()).build();
        FieldDescriptor.Builder builder66 = FieldDescriptor.builder("codeScannerScanApiEvent");
        zzcq zzcqVar66 = new zzcq();
        zzcqVar66.zza(67);
        f6020o0 = builder66.withProperty(zzcqVar66.zzb()).build();
        FieldDescriptor.Builder builder67 = FieldDescriptor.builder("codeScannerOptionalModuleEvent");
        zzcq zzcqVar67 = new zzcq();
        zzcqVar67.zza(68);
        f6022p0 = builder67.withProperty(zzcqVar67.zzb()).build();
        FieldDescriptor.Builder builder68 = FieldDescriptor.builder("onDeviceExplicitContentCreateLogEvent");
        zzcq zzcqVar68 = new zzcq();
        zzcqVar68.zza(70);
        f6024q0 = builder68.withProperty(zzcqVar68.zzb()).build();
        FieldDescriptor.Builder builder69 = FieldDescriptor.builder("onDeviceExplicitContentLoadLogEvent");
        zzcq zzcqVar69 = new zzcq();
        zzcqVar69.zza(71);
        f6026r0 = builder69.withProperty(zzcqVar69.zzb()).build();
        FieldDescriptor.Builder builder70 = FieldDescriptor.builder("onDeviceExplicitContentInferenceLogEvent");
        zzcq zzcqVar70 = new zzcq();
        zzcqVar70.zza(72);
        f6028s0 = builder70.withProperty(zzcqVar70.zzb()).build();
        FieldDescriptor.Builder builder71 = FieldDescriptor.builder("aggregatedOnDeviceExplicitContentLogEvent");
        zzcq zzcqVar71 = new zzcq();
        zzcqVar71.zza(73);
        f6030t0 = builder71.withProperty(zzcqVar71.zzb()).build();
        FieldDescriptor.Builder builder72 = FieldDescriptor.builder("onDeviceSelfieFaceCreateLogEvent");
        zzcq zzcqVar72 = new zzcq();
        zzcqVar72.zza(74);
        f6032u0 = builder72.withProperty(zzcqVar72.zzb()).build();
        FieldDescriptor.Builder builder73 = FieldDescriptor.builder("onDeviceSelfieFaceLoadLogEvent");
        zzcq zzcqVar73 = new zzcq();
        zzcqVar73.zza(75);
        f6034v0 = builder73.withProperty(zzcqVar73.zzb()).build();
        FieldDescriptor.Builder builder74 = FieldDescriptor.builder("onDeviceSelfieFaceLogEvent");
        zzcq zzcqVar74 = new zzcq();
        zzcqVar74.zza(76);
        f6036w0 = builder74.withProperty(zzcqVar74.zzb()).build();
        FieldDescriptor.Builder builder75 = FieldDescriptor.builder("aggregatedOnDeviceSelfieFaceLogEvent");
        zzcq zzcqVar75 = new zzcq();
        zzcqVar75.zza(77);
        f6038x0 = builder75.withProperty(zzcqVar75.zzb()).build();
        FieldDescriptor.Builder builder76 = FieldDescriptor.builder("smartReplyOptionalModuleLogEvent");
        zzcq zzcqVar76 = new zzcq();
        zzcqVar76.zza(78);
        f6040y0 = builder76.withProperty(zzcqVar76.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f5993b, zzkwVar.zzf());
        objectEncoderContext.add(f5995c, zzkwVar.zzc());
        objectEncoderContext.add(f5997d, (Object) null);
        objectEncoderContext.add(f5999e, zzkwVar.zzb());
        objectEncoderContext.add(f6001f, (Object) null);
        objectEncoderContext.add(f6003g, (Object) null);
        objectEncoderContext.add(f6005h, (Object) null);
        objectEncoderContext.add(f6007i, (Object) null);
        objectEncoderContext.add(f6009j, zzkwVar.zzd());
        objectEncoderContext.add(f6011k, zzkwVar.zze());
        objectEncoderContext.add(f6013l, (Object) null);
        objectEncoderContext.add(f6015m, (Object) null);
        objectEncoderContext.add(f6017n, (Object) null);
        objectEncoderContext.add(f6019o, (Object) null);
        objectEncoderContext.add(f6021p, (Object) null);
        objectEncoderContext.add(f6023q, (Object) null);
        objectEncoderContext.add(f6025r, (Object) null);
        objectEncoderContext.add(f6027s, (Object) null);
        objectEncoderContext.add(f6029t, (Object) null);
        objectEncoderContext.add(f6031u, (Object) null);
        objectEncoderContext.add(f6033v, (Object) null);
        objectEncoderContext.add(f6035w, (Object) null);
        objectEncoderContext.add(f6037x, (Object) null);
        objectEncoderContext.add(f6039y, (Object) null);
        objectEncoderContext.add(f6041z, (Object) null);
        objectEncoderContext.add(f5965A, (Object) null);
        objectEncoderContext.add(f5966B, (Object) null);
        objectEncoderContext.add(f5967C, (Object) null);
        objectEncoderContext.add(f5968D, (Object) null);
        objectEncoderContext.add(f5969E, (Object) null);
        objectEncoderContext.add(f5970F, (Object) null);
        objectEncoderContext.add(f5971G, (Object) null);
        objectEncoderContext.add(f5972H, (Object) null);
        objectEncoderContext.add(f5973I, (Object) null);
        objectEncoderContext.add(f5974J, (Object) null);
        objectEncoderContext.add(f5975K, (Object) null);
        objectEncoderContext.add(f5976L, (Object) null);
        objectEncoderContext.add(f5977M, (Object) null);
        objectEncoderContext.add(f5978N, (Object) null);
        objectEncoderContext.add(f5979O, (Object) null);
        objectEncoderContext.add(f5980P, (Object) null);
        objectEncoderContext.add(f5981Q, (Object) null);
        objectEncoderContext.add(f5982R, zzkwVar.zza());
        objectEncoderContext.add(f5983S, (Object) null);
        objectEncoderContext.add(f5984T, (Object) null);
        objectEncoderContext.add(f5985U, (Object) null);
        objectEncoderContext.add(f5986V, (Object) null);
        objectEncoderContext.add(f5987W, (Object) null);
        objectEncoderContext.add(f5988X, (Object) null);
        objectEncoderContext.add(f5989Y, (Object) null);
        objectEncoderContext.add(f5990Z, (Object) null);
        objectEncoderContext.add(f5992a0, (Object) null);
        objectEncoderContext.add(f5994b0, (Object) null);
        objectEncoderContext.add(f5996c0, (Object) null);
        objectEncoderContext.add(f5998d0, (Object) null);
        objectEncoderContext.add(f6000e0, (Object) null);
        objectEncoderContext.add(f6002f0, (Object) null);
        objectEncoderContext.add(f6004g0, (Object) null);
        objectEncoderContext.add(f6006h0, (Object) null);
        objectEncoderContext.add(f6008i0, (Object) null);
        objectEncoderContext.add(f6010j0, (Object) null);
        objectEncoderContext.add(f6012k0, (Object) null);
        objectEncoderContext.add(f6014l0, (Object) null);
        objectEncoderContext.add(f6016m0, (Object) null);
        objectEncoderContext.add(f6018n0, (Object) null);
        objectEncoderContext.add(f6020o0, (Object) null);
        objectEncoderContext.add(f6022p0, (Object) null);
        objectEncoderContext.add(f6024q0, (Object) null);
        objectEncoderContext.add(f6026r0, (Object) null);
        objectEncoderContext.add(f6028s0, (Object) null);
        objectEncoderContext.add(f6030t0, (Object) null);
        objectEncoderContext.add(f6032u0, (Object) null);
        objectEncoderContext.add(f6034v0, (Object) null);
        objectEncoderContext.add(f6036w0, (Object) null);
        objectEncoderContext.add(f6038x0, (Object) null);
        objectEncoderContext.add(f6040y0, (Object) null);
    }
}