package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vr2 */
/* loaded from: classes3.dex */
public final class Vr2 implements ObjectEncoder {

    /* renamed from: A */
    public static final FieldDescriptor f6839A;

    /* renamed from: B */
    public static final FieldDescriptor f6840B;

    /* renamed from: C */
    public static final FieldDescriptor f6841C;

    /* renamed from: D */
    public static final FieldDescriptor f6842D;

    /* renamed from: E */
    public static final FieldDescriptor f6843E;

    /* renamed from: F */
    public static final FieldDescriptor f6844F;

    /* renamed from: G */
    public static final FieldDescriptor f6845G;

    /* renamed from: H */
    public static final FieldDescriptor f6846H;

    /* renamed from: I */
    public static final FieldDescriptor f6847I;

    /* renamed from: J */
    public static final FieldDescriptor f6848J;

    /* renamed from: K */
    public static final FieldDescriptor f6849K;

    /* renamed from: L */
    public static final FieldDescriptor f6850L;

    /* renamed from: M */
    public static final FieldDescriptor f6851M;

    /* renamed from: N */
    public static final FieldDescriptor f6852N;

    /* renamed from: O */
    public static final FieldDescriptor f6853O;

    /* renamed from: P */
    public static final FieldDescriptor f6854P;

    /* renamed from: Q */
    public static final FieldDescriptor f6855Q;

    /* renamed from: R */
    public static final FieldDescriptor f6856R;

    /* renamed from: S */
    public static final FieldDescriptor f6857S;

    /* renamed from: T */
    public static final FieldDescriptor f6858T;

    /* renamed from: U */
    public static final FieldDescriptor f6859U;

    /* renamed from: V */
    public static final FieldDescriptor f6860V;

    /* renamed from: W */
    public static final FieldDescriptor f6861W;

    /* renamed from: X */
    public static final FieldDescriptor f6862X;

    /* renamed from: Y */
    public static final FieldDescriptor f6863Y;

    /* renamed from: Z */
    public static final FieldDescriptor f6864Z;

    /* renamed from: a */
    public static final Vr2 f6865a = new Vr2();

    /* renamed from: a0 */
    public static final FieldDescriptor f6866a0;

    /* renamed from: b */
    public static final FieldDescriptor f6867b;

    /* renamed from: b0 */
    public static final FieldDescriptor f6868b0;

    /* renamed from: c */
    public static final FieldDescriptor f6869c;

    /* renamed from: c0 */
    public static final FieldDescriptor f6870c0;

    /* renamed from: d */
    public static final FieldDescriptor f6871d;

    /* renamed from: d0 */
    public static final FieldDescriptor f6872d0;

    /* renamed from: e */
    public static final FieldDescriptor f6873e;

    /* renamed from: e0 */
    public static final FieldDescriptor f6874e0;

    /* renamed from: f */
    public static final FieldDescriptor f6875f;

    /* renamed from: f0 */
    public static final FieldDescriptor f6876f0;

    /* renamed from: g */
    public static final FieldDescriptor f6877g;

    /* renamed from: g0 */
    public static final FieldDescriptor f6878g0;

    /* renamed from: h */
    public static final FieldDescriptor f6879h;

    /* renamed from: h0 */
    public static final FieldDescriptor f6880h0;

    /* renamed from: i */
    public static final FieldDescriptor f6881i;

    /* renamed from: i0 */
    public static final FieldDescriptor f6882i0;

    /* renamed from: j */
    public static final FieldDescriptor f6883j;

    /* renamed from: j0 */
    public static final FieldDescriptor f6884j0;

    /* renamed from: k */
    public static final FieldDescriptor f6885k;

    /* renamed from: k0 */
    public static final FieldDescriptor f6886k0;

    /* renamed from: l */
    public static final FieldDescriptor f6887l;

    /* renamed from: l0 */
    public static final FieldDescriptor f6888l0;

    /* renamed from: m */
    public static final FieldDescriptor f6889m;

    /* renamed from: m0 */
    public static final FieldDescriptor f6890m0;

    /* renamed from: n */
    public static final FieldDescriptor f6891n;

    /* renamed from: n0 */
    public static final FieldDescriptor f6892n0;

    /* renamed from: o */
    public static final FieldDescriptor f6893o;

    /* renamed from: o0 */
    public static final FieldDescriptor f6894o0;

    /* renamed from: p */
    public static final FieldDescriptor f6895p;

    /* renamed from: p0 */
    public static final FieldDescriptor f6896p0;

    /* renamed from: q */
    public static final FieldDescriptor f6897q;

    /* renamed from: q0 */
    public static final FieldDescriptor f6898q0;

    /* renamed from: r */
    public static final FieldDescriptor f6899r;

    /* renamed from: r0 */
    public static final FieldDescriptor f6900r0;

    /* renamed from: s */
    public static final FieldDescriptor f6901s;

    /* renamed from: s0 */
    public static final FieldDescriptor f6902s0;

    /* renamed from: t */
    public static final FieldDescriptor f6903t;

    /* renamed from: t0 */
    public static final FieldDescriptor f6904t0;

    /* renamed from: u */
    public static final FieldDescriptor f6905u;

    /* renamed from: u0 */
    public static final FieldDescriptor f6906u0;

    /* renamed from: v */
    public static final FieldDescriptor f6907v;

    /* renamed from: v0 */
    public static final FieldDescriptor f6908v0;

    /* renamed from: w */
    public static final FieldDescriptor f6909w;

    /* renamed from: w0 */
    public static final FieldDescriptor f6910w0;

    /* renamed from: x */
    public static final FieldDescriptor f6911x;

    /* renamed from: x0 */
    public static final FieldDescriptor f6912x0;

    /* renamed from: y */
    public static final FieldDescriptor f6913y;

    /* renamed from: y0 */
    public static final FieldDescriptor f6914y0;

    /* renamed from: z */
    public static final FieldDescriptor f6915z;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("systemInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6867b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventName");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f6869c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isThickClient");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(37);
        f6871d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientType");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(61);
        f6873e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelDownloadLogEvent");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(3);
        f6875f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customModelLoadLogEvent");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(20);
        f6877g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("customModelInferenceLogEvent");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(4);
        f6879h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customModelCreateLogEvent");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(29);
        f6881i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("onDeviceFaceDetectionLogEvent");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(5);
        f6883j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("onDeviceFaceLoadLogEvent");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(59);
        f6885k = builder10.withProperty(zzcqVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("onDeviceTextDetectionLogEvent");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(6);
        f6887l = builder11.withProperty(zzcqVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("onDeviceTextDetectionLoadLogEvent");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(79);
        f6889m = builder12.withProperty(zzcqVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("onDeviceBarcodeDetectionLogEvent");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(7);
        f6891n = builder13.withProperty(zzcqVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("onDeviceBarcodeLoadLogEvent");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(58);
        f6893o = builder14.withProperty(zzcqVar14.zzb()).build();
        FieldDescriptor.Builder builder15 = FieldDescriptor.builder("onDeviceImageLabelCreateLogEvent");
        zzcq zzcqVar15 = new zzcq();
        zzcqVar15.zza(48);
        f6895p = builder15.withProperty(zzcqVar15.zzb()).build();
        FieldDescriptor.Builder builder16 = FieldDescriptor.builder("onDeviceImageLabelLoadLogEvent");
        zzcq zzcqVar16 = new zzcq();
        zzcqVar16.zza(49);
        f6897q = builder16.withProperty(zzcqVar16.zzb()).build();
        FieldDescriptor.Builder builder17 = FieldDescriptor.builder("onDeviceImageLabelDetectionLogEvent");
        zzcq zzcqVar17 = new zzcq();
        zzcqVar17.zza(18);
        f6899r = builder17.withProperty(zzcqVar17.zzb()).build();
        FieldDescriptor.Builder builder18 = FieldDescriptor.builder("onDeviceObjectCreateLogEvent");
        zzcq zzcqVar18 = new zzcq();
        zzcqVar18.zza(26);
        f6901s = builder18.withProperty(zzcqVar18.zzb()).build();
        FieldDescriptor.Builder builder19 = FieldDescriptor.builder("onDeviceObjectLoadLogEvent");
        zzcq zzcqVar19 = new zzcq();
        zzcqVar19.zza(27);
        f6903t = builder19.withProperty(zzcqVar19.zzb()).build();
        FieldDescriptor.Builder builder20 = FieldDescriptor.builder("onDeviceObjectInferenceLogEvent");
        zzcq zzcqVar20 = new zzcq();
        zzcqVar20.zza(28);
        f6905u = builder20.withProperty(zzcqVar20.zzb()).build();
        FieldDescriptor.Builder builder21 = FieldDescriptor.builder("onDevicePoseDetectionLogEvent");
        zzcq zzcqVar21 = new zzcq();
        zzcqVar21.zza(44);
        f6907v = builder21.withProperty(zzcqVar21.zzb()).build();
        FieldDescriptor.Builder builder22 = FieldDescriptor.builder("onDeviceSegmentationLogEvent");
        zzcq zzcqVar22 = new zzcq();
        zzcqVar22.zza(45);
        f6909w = builder22.withProperty(zzcqVar22.zzb()).build();
        FieldDescriptor.Builder builder23 = FieldDescriptor.builder("onDeviceSmartReplyLogEvent");
        zzcq zzcqVar23 = new zzcq();
        zzcqVar23.zza(19);
        f6911x = builder23.withProperty(zzcqVar23.zzb()).build();
        FieldDescriptor.Builder builder24 = FieldDescriptor.builder("onDeviceLanguageIdentificationLogEvent");
        zzcq zzcqVar24 = new zzcq();
        zzcqVar24.zza(21);
        f6913y = builder24.withProperty(zzcqVar24.zzb()).build();
        FieldDescriptor.Builder builder25 = FieldDescriptor.builder("onDeviceTranslationLogEvent");
        zzcq zzcqVar25 = new zzcq();
        zzcqVar25.zza(22);
        f6915z = builder25.withProperty(zzcqVar25.zzb()).build();
        FieldDescriptor.Builder builder26 = FieldDescriptor.builder("cloudFaceDetectionLogEvent");
        zzcq zzcqVar26 = new zzcq();
        zzcqVar26.zza(8);
        f6839A = builder26.withProperty(zzcqVar26.zzb()).build();
        FieldDescriptor.Builder builder27 = FieldDescriptor.builder("cloudCropHintDetectionLogEvent");
        zzcq zzcqVar27 = new zzcq();
        zzcqVar27.zza(9);
        f6840B = builder27.withProperty(zzcqVar27.zzb()).build();
        FieldDescriptor.Builder builder28 = FieldDescriptor.builder("cloudDocumentTextDetectionLogEvent");
        zzcq zzcqVar28 = new zzcq();
        zzcqVar28.zza(10);
        f6841C = builder28.withProperty(zzcqVar28.zzb()).build();
        FieldDescriptor.Builder builder29 = FieldDescriptor.builder("cloudImagePropertiesDetectionLogEvent");
        zzcq zzcqVar29 = new zzcq();
        zzcqVar29.zza(11);
        f6842D = builder29.withProperty(zzcqVar29.zzb()).build();
        FieldDescriptor.Builder builder30 = FieldDescriptor.builder("cloudImageLabelDetectionLogEvent");
        zzcq zzcqVar30 = new zzcq();
        zzcqVar30.zza(12);
        f6843E = builder30.withProperty(zzcqVar30.zzb()).build();
        FieldDescriptor.Builder builder31 = FieldDescriptor.builder("cloudLandmarkDetectionLogEvent");
        zzcq zzcqVar31 = new zzcq();
        zzcqVar31.zza(13);
        f6844F = builder31.withProperty(zzcqVar31.zzb()).build();
        FieldDescriptor.Builder builder32 = FieldDescriptor.builder("cloudLogoDetectionLogEvent");
        zzcq zzcqVar32 = new zzcq();
        zzcqVar32.zza(14);
        f6845G = builder32.withProperty(zzcqVar32.zzb()).build();
        FieldDescriptor.Builder builder33 = FieldDescriptor.builder("cloudSafeSearchDetectionLogEvent");
        zzcq zzcqVar33 = new zzcq();
        zzcqVar33.zza(15);
        f6846H = builder33.withProperty(zzcqVar33.zzb()).build();
        FieldDescriptor.Builder builder34 = FieldDescriptor.builder("cloudTextDetectionLogEvent");
        zzcq zzcqVar34 = new zzcq();
        zzcqVar34.zza(16);
        f6847I = builder34.withProperty(zzcqVar34.zzb()).build();
        FieldDescriptor.Builder builder35 = FieldDescriptor.builder("cloudWebSearchDetectionLogEvent");
        zzcq zzcqVar35 = new zzcq();
        zzcqVar35.zza(17);
        f6848J = builder35.withProperty(zzcqVar35.zzb()).build();
        FieldDescriptor.Builder builder36 = FieldDescriptor.builder("automlImageLabelingCreateLogEvent");
        zzcq zzcqVar36 = new zzcq();
        zzcqVar36.zza(23);
        f6849K = builder36.withProperty(zzcqVar36.zzb()).build();
        FieldDescriptor.Builder builder37 = FieldDescriptor.builder("automlImageLabelingLoadLogEvent");
        zzcq zzcqVar37 = new zzcq();
        zzcqVar37.zza(24);
        f6850L = builder37.withProperty(zzcqVar37.zzb()).build();
        FieldDescriptor.Builder builder38 = FieldDescriptor.builder("automlImageLabelingInferenceLogEvent");
        zzcq zzcqVar38 = new zzcq();
        zzcqVar38.zza(25);
        f6851M = builder38.withProperty(zzcqVar38.zzb()).build();
        FieldDescriptor.Builder builder39 = FieldDescriptor.builder("isModelDownloadedLogEvent");
        zzcq zzcqVar39 = new zzcq();
        zzcqVar39.zza(39);
        f6852N = builder39.withProperty(zzcqVar39.zzb()).build();
        FieldDescriptor.Builder builder40 = FieldDescriptor.builder("deleteModelLogEvent");
        zzcq zzcqVar40 = new zzcq();
        zzcqVar40.zza(40);
        f6853O = builder40.withProperty(zzcqVar40.zzb()).build();
        FieldDescriptor.Builder builder41 = FieldDescriptor.builder("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzcq zzcqVar41 = new zzcq();
        zzcqVar41.zza(30);
        f6854P = builder41.withProperty(zzcqVar41.zzb()).build();
        FieldDescriptor.Builder builder42 = FieldDescriptor.builder("aggregatedCustomModelInferenceLogEvent");
        zzcq zzcqVar42 = new zzcq();
        zzcqVar42.zza(31);
        f6855Q = builder42.withProperty(zzcqVar42.zzb()).build();
        FieldDescriptor.Builder builder43 = FieldDescriptor.builder("aggregatedOnDeviceFaceDetectionLogEvent");
        zzcq zzcqVar43 = new zzcq();
        zzcqVar43.zza(32);
        f6856R = builder43.withProperty(zzcqVar43.zzb()).build();
        FieldDescriptor.Builder builder44 = FieldDescriptor.builder("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzcq zzcqVar44 = new zzcq();
        zzcqVar44.zza(33);
        f6857S = builder44.withProperty(zzcqVar44.zzb()).build();
        FieldDescriptor.Builder builder45 = FieldDescriptor.builder("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzcq zzcqVar45 = new zzcq();
        zzcqVar45.zza(34);
        f6858T = builder45.withProperty(zzcqVar45.zzb()).build();
        FieldDescriptor.Builder builder46 = FieldDescriptor.builder("aggregatedOnDeviceObjectInferenceLogEvent");
        zzcq zzcqVar46 = new zzcq();
        zzcqVar46.zza(35);
        f6859U = builder46.withProperty(zzcqVar46.zzb()).build();
        FieldDescriptor.Builder builder47 = FieldDescriptor.builder("aggregatedOnDeviceTextDetectionLogEvent");
        zzcq zzcqVar47 = new zzcq();
        zzcqVar47.zza(36);
        f6860V = builder47.withProperty(zzcqVar47.zzb()).build();
        FieldDescriptor.Builder builder48 = FieldDescriptor.builder("aggregatedOnDevicePoseDetectionLogEvent");
        zzcq zzcqVar48 = new zzcq();
        zzcqVar48.zza(46);
        f6861W = builder48.withProperty(zzcqVar48.zzb()).build();
        FieldDescriptor.Builder builder49 = FieldDescriptor.builder("aggregatedOnDeviceSegmentationLogEvent");
        zzcq zzcqVar49 = new zzcq();
        zzcqVar49.zza(47);
        f6862X = builder49.withProperty(zzcqVar49.zzb()).build();
        FieldDescriptor.Builder builder50 = FieldDescriptor.builder("pipelineAccelerationInferenceEvents");
        zzcq zzcqVar50 = new zzcq();
        zzcqVar50.zza(69);
        f6863Y = builder50.withProperty(zzcqVar50.zzb()).build();
        FieldDescriptor.Builder builder51 = FieldDescriptor.builder("remoteConfigLogEvent");
        zzcq zzcqVar51 = new zzcq();
        zzcqVar51.zza(42);
        f6864Z = builder51.withProperty(zzcqVar51.zzb()).build();
        FieldDescriptor.Builder builder52 = FieldDescriptor.builder("inputImageConstructionLogEvent");
        zzcq zzcqVar52 = new zzcq();
        zzcqVar52.zza(50);
        f6866a0 = builder52.withProperty(zzcqVar52.zzb()).build();
        FieldDescriptor.Builder builder53 = FieldDescriptor.builder("leakedHandleEvent");
        zzcq zzcqVar53 = new zzcq();
        zzcqVar53.zza(51);
        f6868b0 = builder53.withProperty(zzcqVar53.zzb()).build();
        FieldDescriptor.Builder builder54 = FieldDescriptor.builder("cameraSourceLogEvent");
        zzcq zzcqVar54 = new zzcq();
        zzcqVar54.zza(52);
        f6870c0 = builder54.withProperty(zzcqVar54.zzb()).build();
        FieldDescriptor.Builder builder55 = FieldDescriptor.builder("imageLabelOptionalModuleLogEvent");
        zzcq zzcqVar55 = new zzcq();
        zzcqVar55.zza(53);
        f6872d0 = builder55.withProperty(zzcqVar55.zzb()).build();
        FieldDescriptor.Builder builder56 = FieldDescriptor.builder("languageIdentificationOptionalModuleLogEvent");
        zzcq zzcqVar56 = new zzcq();
        zzcqVar56.zza(54);
        f6874e0 = builder56.withProperty(zzcqVar56.zzb()).build();
        FieldDescriptor.Builder builder57 = FieldDescriptor.builder("faceDetectionOptionalModuleLogEvent");
        zzcq zzcqVar57 = new zzcq();
        zzcqVar57.zza(60);
        f6876f0 = builder57.withProperty(zzcqVar57.zzb()).build();
        FieldDescriptor.Builder builder58 = FieldDescriptor.builder("nlClassifierOptionalModuleLogEvent");
        zzcq zzcqVar58 = new zzcq();
        zzcqVar58.zza(55);
        f6878g0 = builder58.withProperty(zzcqVar58.zzb()).build();
        FieldDescriptor.Builder builder59 = FieldDescriptor.builder("nlClassifierClientLibraryLogEvent");
        zzcq zzcqVar59 = new zzcq();
        zzcqVar59.zza(56);
        f6880h0 = builder59.withProperty(zzcqVar59.zzb()).build();
        FieldDescriptor.Builder builder60 = FieldDescriptor.builder("accelerationAllowlistLogEvent");
        zzcq zzcqVar60 = new zzcq();
        zzcqVar60.zza(57);
        f6882i0 = builder60.withProperty(zzcqVar60.zzb()).build();
        FieldDescriptor.Builder builder61 = FieldDescriptor.builder("toxicityDetectionCreateEvent");
        zzcq zzcqVar61 = new zzcq();
        zzcqVar61.zza(62);
        f6884j0 = builder61.withProperty(zzcqVar61.zzb()).build();
        FieldDescriptor.Builder builder62 = FieldDescriptor.builder("toxicityDetectionLoadEvent");
        zzcq zzcqVar62 = new zzcq();
        zzcqVar62.zza(63);
        f6886k0 = builder62.withProperty(zzcqVar62.zzb()).build();
        FieldDescriptor.Builder builder63 = FieldDescriptor.builder("toxicityDetectionInferenceEvent");
        zzcq zzcqVar63 = new zzcq();
        zzcqVar63.zza(64);
        f6888l0 = builder63.withProperty(zzcqVar63.zzb()).build();
        FieldDescriptor.Builder builder64 = FieldDescriptor.builder("barcodeDetectionOptionalModuleLogEvent");
        zzcq zzcqVar64 = new zzcq();
        zzcqVar64.zza(65);
        f6890m0 = builder64.withProperty(zzcqVar64.zzb()).build();
        FieldDescriptor.Builder builder65 = FieldDescriptor.builder("customImageLabelOptionalModuleLogEvent");
        zzcq zzcqVar65 = new zzcq();
        zzcqVar65.zza(66);
        f6892n0 = builder65.withProperty(zzcqVar65.zzb()).build();
        FieldDescriptor.Builder builder66 = FieldDescriptor.builder("codeScannerScanApiEvent");
        zzcq zzcqVar66 = new zzcq();
        zzcqVar66.zza(67);
        f6894o0 = builder66.withProperty(zzcqVar66.zzb()).build();
        FieldDescriptor.Builder builder67 = FieldDescriptor.builder("codeScannerOptionalModuleEvent");
        zzcq zzcqVar67 = new zzcq();
        zzcqVar67.zza(68);
        f6896p0 = builder67.withProperty(zzcqVar67.zzb()).build();
        FieldDescriptor.Builder builder68 = FieldDescriptor.builder("onDeviceExplicitContentCreateLogEvent");
        zzcq zzcqVar68 = new zzcq();
        zzcqVar68.zza(70);
        f6898q0 = builder68.withProperty(zzcqVar68.zzb()).build();
        FieldDescriptor.Builder builder69 = FieldDescriptor.builder("onDeviceExplicitContentLoadLogEvent");
        zzcq zzcqVar69 = new zzcq();
        zzcqVar69.zza(71);
        f6900r0 = builder69.withProperty(zzcqVar69.zzb()).build();
        FieldDescriptor.Builder builder70 = FieldDescriptor.builder("onDeviceExplicitContentInferenceLogEvent");
        zzcq zzcqVar70 = new zzcq();
        zzcqVar70.zza(72);
        f6902s0 = builder70.withProperty(zzcqVar70.zzb()).build();
        FieldDescriptor.Builder builder71 = FieldDescriptor.builder("aggregatedOnDeviceExplicitContentLogEvent");
        zzcq zzcqVar71 = new zzcq();
        zzcqVar71.zza(73);
        f6904t0 = builder71.withProperty(zzcqVar71.zzb()).build();
        FieldDescriptor.Builder builder72 = FieldDescriptor.builder("onDeviceSelfieFaceCreateLogEvent");
        zzcq zzcqVar72 = new zzcq();
        zzcqVar72.zza(74);
        f6906u0 = builder72.withProperty(zzcqVar72.zzb()).build();
        FieldDescriptor.Builder builder73 = FieldDescriptor.builder("onDeviceSelfieFaceLoadLogEvent");
        zzcq zzcqVar73 = new zzcq();
        zzcqVar73.zza(75);
        f6908v0 = builder73.withProperty(zzcqVar73.zzb()).build();
        FieldDescriptor.Builder builder74 = FieldDescriptor.builder("onDeviceSelfieFaceLogEvent");
        zzcq zzcqVar74 = new zzcq();
        zzcqVar74.zza(76);
        f6910w0 = builder74.withProperty(zzcqVar74.zzb()).build();
        FieldDescriptor.Builder builder75 = FieldDescriptor.builder("aggregatedOnDeviceSelfieFaceLogEvent");
        zzcq zzcqVar75 = new zzcq();
        zzcqVar75.zza(77);
        f6912x0 = builder75.withProperty(zzcqVar75.zzb()).build();
        FieldDescriptor.Builder builder76 = FieldDescriptor.builder("smartReplyOptionalModuleLogEvent");
        zzcq zzcqVar76 = new zzcq();
        zzcqVar76.zza(78);
        f6914y0 = builder76.withProperty(zzcqVar76.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f6867b, zzkwVar.zzf());
        objectEncoderContext.add(f6869c, zzkwVar.zzc());
        objectEncoderContext.add(f6871d, (Object) null);
        objectEncoderContext.add(f6873e, zzkwVar.zzb());
        objectEncoderContext.add(f6875f, (Object) null);
        objectEncoderContext.add(f6877g, (Object) null);
        objectEncoderContext.add(f6879h, (Object) null);
        objectEncoderContext.add(f6881i, (Object) null);
        objectEncoderContext.add(f6883j, zzkwVar.zzd());
        objectEncoderContext.add(f6885k, zzkwVar.zze());
        objectEncoderContext.add(f6887l, (Object) null);
        objectEncoderContext.add(f6889m, (Object) null);
        objectEncoderContext.add(f6891n, (Object) null);
        objectEncoderContext.add(f6893o, (Object) null);
        objectEncoderContext.add(f6895p, (Object) null);
        objectEncoderContext.add(f6897q, (Object) null);
        objectEncoderContext.add(f6899r, (Object) null);
        objectEncoderContext.add(f6901s, (Object) null);
        objectEncoderContext.add(f6903t, (Object) null);
        objectEncoderContext.add(f6905u, (Object) null);
        objectEncoderContext.add(f6907v, (Object) null);
        objectEncoderContext.add(f6909w, (Object) null);
        objectEncoderContext.add(f6911x, (Object) null);
        objectEncoderContext.add(f6913y, (Object) null);
        objectEncoderContext.add(f6915z, (Object) null);
        objectEncoderContext.add(f6839A, (Object) null);
        objectEncoderContext.add(f6840B, (Object) null);
        objectEncoderContext.add(f6841C, (Object) null);
        objectEncoderContext.add(f6842D, (Object) null);
        objectEncoderContext.add(f6843E, (Object) null);
        objectEncoderContext.add(f6844F, (Object) null);
        objectEncoderContext.add(f6845G, (Object) null);
        objectEncoderContext.add(f6846H, (Object) null);
        objectEncoderContext.add(f6847I, (Object) null);
        objectEncoderContext.add(f6848J, (Object) null);
        objectEncoderContext.add(f6849K, (Object) null);
        objectEncoderContext.add(f6850L, (Object) null);
        objectEncoderContext.add(f6851M, (Object) null);
        objectEncoderContext.add(f6852N, (Object) null);
        objectEncoderContext.add(f6853O, (Object) null);
        objectEncoderContext.add(f6854P, (Object) null);
        objectEncoderContext.add(f6855Q, (Object) null);
        objectEncoderContext.add(f6856R, zzkwVar.zza());
        objectEncoderContext.add(f6857S, (Object) null);
        objectEncoderContext.add(f6858T, (Object) null);
        objectEncoderContext.add(f6859U, (Object) null);
        objectEncoderContext.add(f6860V, (Object) null);
        objectEncoderContext.add(f6861W, (Object) null);
        objectEncoderContext.add(f6862X, (Object) null);
        objectEncoderContext.add(f6863Y, (Object) null);
        objectEncoderContext.add(f6864Z, (Object) null);
        objectEncoderContext.add(f6866a0, (Object) null);
        objectEncoderContext.add(f6868b0, (Object) null);
        objectEncoderContext.add(f6870c0, (Object) null);
        objectEncoderContext.add(f6872d0, (Object) null);
        objectEncoderContext.add(f6874e0, (Object) null);
        objectEncoderContext.add(f6876f0, (Object) null);
        objectEncoderContext.add(f6878g0, (Object) null);
        objectEncoderContext.add(f6880h0, (Object) null);
        objectEncoderContext.add(f6882i0, (Object) null);
        objectEncoderContext.add(f6884j0, (Object) null);
        objectEncoderContext.add(f6886k0, (Object) null);
        objectEncoderContext.add(f6888l0, (Object) null);
        objectEncoderContext.add(f6890m0, (Object) null);
        objectEncoderContext.add(f6892n0, (Object) null);
        objectEncoderContext.add(f6894o0, (Object) null);
        objectEncoderContext.add(f6896p0, (Object) null);
        objectEncoderContext.add(f6898q0, (Object) null);
        objectEncoderContext.add(f6900r0, (Object) null);
        objectEncoderContext.add(f6902s0, (Object) null);
        objectEncoderContext.add(f6904t0, (Object) null);
        objectEncoderContext.add(f6906u0, (Object) null);
        objectEncoderContext.add(f6908v0, (Object) null);
        objectEncoderContext.add(f6910w0, (Object) null);
        objectEncoderContext.add(f6912x0, (Object) null);
        objectEncoderContext.add(f6914y0, (Object) null);
    }
}
