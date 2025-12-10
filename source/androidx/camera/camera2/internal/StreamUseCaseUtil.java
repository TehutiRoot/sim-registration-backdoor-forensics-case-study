package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2429j;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class StreamUseCaseUtil {
    public static final Config.Option<Long> STREAM_USE_CASE_STREAM_SPEC_OPTION = Config.Option.create("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: a */
    public static final Map f10442a;

    /* renamed from: b */
    public static final Map f10443b;

    static {
        HashMap hashMap = new HashMap();
        f10442a = hashMap;
        HashMap hashMap2 = new HashMap();
        f10443b = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.PREVIEW;
            hashSet.add(captureType);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(captureType);
            hashSet2.add(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            hashSet3.add(captureType2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            hashSet4.add(captureType3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType2);
            hashSet5.add(captureType3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType3);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* renamed from: a */
    public static boolean m63734a(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains((Long) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean areCaptureTypesEligible(@NonNull Map<Integer, AttachedSurfaceInfo> map, @NonNull Map<Integer, UseCaseConfig<?>> map2, @NonNull List<SurfaceConfig> list) {
        List<UseCaseConfigFactory.CaptureType> emptyList;
        UseCaseConfigFactory.CaptureType captureType;
        for (int i = 0; i < list.size(); i++) {
            long streamUseCase = list.get(i).getStreamUseCase();
            if (map.containsKey(Integer.valueOf(i))) {
                AttachedSurfaceInfo attachedSurfaceInfo = map.get(Integer.valueOf(i));
                if (attachedSurfaceInfo.getCaptureTypes().size() == 1) {
                    captureType = attachedSurfaceInfo.getCaptureTypes().get(0);
                } else {
                    captureType = UseCaseConfigFactory.CaptureType.STREAM_SHARING;
                }
                if (!m63732c(captureType, streamUseCase, attachedSurfaceInfo.getCaptureTypes())) {
                    return false;
                }
            } else if (map2.containsKey(Integer.valueOf(i))) {
                UseCaseConfig<?> useCaseConfig = map2.get(Integer.valueOf(i));
                UseCaseConfigFactory.CaptureType captureType2 = useCaseConfig.getCaptureType();
                if (useCaseConfig.getCaptureType() == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
                    emptyList = ((StreamSharingConfig) useCaseConfig).getCaptureTypes();
                } else {
                    emptyList = Collections.emptyList();
                }
                if (!m63732c(captureType2, streamUseCase, emptyList)) {
                    return false;
                }
            } else {
                throw new AssertionError("SurfaceConfig does not map to any use case");
            }
        }
        return true;
    }

    public static boolean areStreamUseCasesAvailableForSurfaceConfigs(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull List<SurfaceConfig> list) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            long[] jArr = (long[]) cameraCharacteristicsCompat.get(key);
            if (jArr == null || jArr.length == 0) {
                return false;
            }
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            for (SurfaceConfig surfaceConfig : list) {
                if (!hashSet.contains(Long.valueOf(surfaceConfig.getStreamUseCase()))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Config m63733b(Config config, long j) {
        Config.Option<Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (config.containsOption(option) && ((Long) config.retrieveOption(option)).longValue() == j) {
            return null;
        }
        MutableOptionsBundle from = MutableOptionsBundle.from(config);
        from.insertOption(option, Long.valueOf(j));
        return new Camera2ImplConfig(from);
    }

    /* renamed from: c */
    public static boolean m63732c(UseCaseConfigFactory.CaptureType captureType, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            Map map = f10443b;
            if (!map.containsKey(Long.valueOf(j))) {
                return false;
            }
            Set set = (Set) map.get(Long.valueOf(j));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((UseCaseConfigFactory.CaptureType) it.next())) {
                    return false;
                }
            }
            return true;
        }
        Map map2 = f10442a;
        if (!map2.containsKey(Long.valueOf(j)) || !((Set) map2.get(Long.valueOf(j))).contains(captureType)) {
            return false;
        }
        return true;
    }

    public static boolean containsZslUseCase(@NonNull List<AttachedSurfaceInfo> list, @NonNull List<UseCaseConfig<?>> list2) {
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            if (m63730e(attachedSurfaceInfo.getImplementationOptions(), attachedSurfaceInfo.getCaptureTypes().get(0))) {
                return true;
            }
        }
        for (UseCaseConfig<?> useCaseConfig : list2) {
            if (m63730e(useCaseConfig, useCaseConfig.getCaptureType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m63731d(java.util.List r10, java.util.List r11, java.util.Set r12) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
            boolean r1 = r10.hasNext()
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3e
            java.lang.Object r10 = r10.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r10 = (androidx.camera.core.impl.AttachedSurfaceInfo) r10
            androidx.camera.core.impl.Config r1 = r10.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r6 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r1 = r1.containsOption(r6)
            if (r1 != 0) goto L28
        L25:
            r10 = 0
            r1 = 1
            goto L40
        L28:
            androidx.camera.core.impl.Config r10 = r10.getImplementationOptions()
            java.lang.Object r10 = r10.retrieveOption(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r6 = r10.longValue()
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 != 0) goto L3b
            goto L25
        L3b:
            r10 = 1
        L3c:
            r1 = 0
            goto L40
        L3e:
            r10 = 0
            goto L3c
        L40:
            java.util.Iterator r11 = r11.iterator()
        L44:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r11.next()
            androidx.camera.core.impl.UseCaseConfig r6 = (androidx.camera.core.impl.UseCaseConfig) r6
            androidx.camera.core.impl.Config$Option<java.lang.Long> r7 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r8 = r6.containsOption(r7)
            if (r8 != 0) goto L5f
            if (r10 == 0) goto L5d
            m63729f()
        L5d:
            r1 = 1
            goto L44
        L5f:
            java.lang.Object r6 = r6.retrieveOption(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r7 = r6.longValue()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto L73
            if (r10 == 0) goto L5d
            m63729f()
            goto L5d
        L73:
            if (r1 == 0) goto L78
            m63729f()
        L78:
            r0.add(r6)
            r10 = 1
            goto L44
        L7d:
            if (r1 != 0) goto L86
            boolean r10 = m63734a(r12, r0)
            if (r10 == 0) goto L86
            goto L87
        L86:
            r4 = 0
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.StreamUseCaseUtil.m63731d(java.util.List, java.util.List, java.util.Set):boolean");
    }

    /* renamed from: e */
    public static boolean m63730e(Config config, UseCaseConfigFactory.CaptureType captureType) {
        if (((Boolean) config.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        Config.Option<Integer> option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (!config.containsOption(option) || TemplateTypeUtil.getSessionConfigTemplateType(captureType, ((Integer) config.retrieveOption(option)).intValue()) != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static void m63729f() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    @NonNull
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static Camera2ImplConfig getStreamSpecImplementationOptions(@NonNull UseCaseConfig<?> useCaseConfig) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        Config.Option<?> option = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
        if (useCaseConfig.containsOption(option)) {
            create.insertOption(option, (Long) useCaseConfig.retrieveOption(option));
        }
        Config.Option<?> option2 = UseCaseConfig.OPTION_ZSL_DISABLED;
        if (useCaseConfig.containsOption(option2)) {
            create.insertOption(option2, (Boolean) useCaseConfig.retrieveOption(option2));
        }
        Config.Option<?> option3 = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (useCaseConfig.containsOption(option3)) {
            create.insertOption(option3, (Integer) useCaseConfig.retrieveOption(option3));
        }
        Config.Option<?> option4 = ImageInputConfig.OPTION_INPUT_FORMAT;
        if (useCaseConfig.containsOption(option4)) {
            create.insertOption(option4, (Integer) useCaseConfig.retrieveOption(option4));
        }
        return new Camera2ImplConfig(create);
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static boolean isStreamUseCaseSupported(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            long[] jArr = (long[]) cameraCharacteristicsCompat.get(key);
            if (jArr == null || jArr.length == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static boolean populateStreamUseCaseStreamSpecOptionWithInteropOverride(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, StreamSpec> map, @NonNull Map<AttachedSurfaceInfo, StreamSpec> map2) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<UseCaseConfig> arrayList = new ArrayList(map.keySet());
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            Preconditions.checkNotNull(attachedSurfaceInfo.getImplementationOptions());
        }
        for (UseCaseConfig useCaseConfig : arrayList) {
            Preconditions.checkNotNull(((StreamSpec) Preconditions.checkNotNull(map.get(useCaseConfig))).getImplementationOptions());
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) cameraCharacteristicsCompat.get(key);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            if (m63731d(list, arrayList, hashSet)) {
                for (AttachedSurfaceInfo attachedSurfaceInfo2 : list) {
                    Config implementationOptions = attachedSurfaceInfo2.getImplementationOptions();
                    Config m63733b = m63733b(implementationOptions, ((Long) implementationOptions.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION)).longValue());
                    if (m63733b != null) {
                        map2.put(attachedSurfaceInfo2, attachedSurfaceInfo2.toStreamSpec(m63733b));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UseCaseConfig<?> useCaseConfig2 = (UseCaseConfig) it.next();
                    StreamSpec streamSpec = map.get(useCaseConfig2);
                    Config implementationOptions2 = streamSpec.getImplementationOptions();
                    Config m63733b2 = m63733b(implementationOptions2, ((Long) implementationOptions2.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION)).longValue());
                    if (m63733b2 != null) {
                        map.put(useCaseConfig2, streamSpec.toBuilder().setImplementationOptions(m63733b2).build());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(@NonNull Map<UseCaseConfig<?>, StreamSpec> map, @NonNull Map<AttachedSurfaceInfo, StreamSpec> map2, @NonNull Map<Integer, AttachedSurfaceInfo> map3, @NonNull Map<Integer, UseCaseConfig<?>> map4, @NonNull List<SurfaceConfig> list) {
        for (int i = 0; i < list.size(); i++) {
            long streamUseCase = list.get(i).getStreamUseCase();
            if (map3.containsKey(Integer.valueOf(i))) {
                AttachedSurfaceInfo attachedSurfaceInfo = map3.get(Integer.valueOf(i));
                Config m63733b = m63733b(attachedSurfaceInfo.getImplementationOptions(), streamUseCase);
                if (m63733b != null) {
                    map2.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(m63733b));
                }
            } else if (map4.containsKey(Integer.valueOf(i))) {
                UseCaseConfig<?> useCaseConfig = map4.get(Integer.valueOf(i));
                StreamSpec streamSpec = map.get(useCaseConfig);
                Config m63733b2 = m63733b(streamSpec.getImplementationOptions(), streamUseCase);
                if (m63733b2 != null) {
                    map.put(useCaseConfig, streamSpec.toBuilder().setImplementationOptions(m63733b2).build());
                }
            } else {
                throw new AssertionError("SurfaceConfig does not map to any use case");
            }
        }
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static void populateSurfaceToStreamUseCaseMapping(@NonNull Collection<SessionConfig> collection, @NonNull Collection<UseCaseConfig<?>> collection2, @NonNull Map<DeferrableSurface, Long> map) {
        ArrayList arrayList = new ArrayList(collection2);
        for (SessionConfig sessionConfig : collection) {
            Config implementationOptions = sessionConfig.getImplementationOptions();
            Config.Option<Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (implementationOptions.containsOption(option) && sessionConfig.getSurfaces().size() != 1) {
                Logger.m63228e("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(sessionConfig.getSurfaces().size())));
                return;
            } else if (sessionConfig.getImplementationOptions().containsOption(option)) {
                int i = 0;
                for (SessionConfig sessionConfig2 : collection) {
                    if (((UseCaseConfig) arrayList.get(i)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                        map.put(sessionConfig2.getSurfaces().get(0), 1L);
                    } else {
                        Config implementationOptions2 = sessionConfig2.getImplementationOptions();
                        Config.Option<Long> option2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        if (implementationOptions2.containsOption(option2)) {
                            map.put(sessionConfig2.getSurfaces().get(0), (Long) sessionConfig2.getImplementationOptions().retrieveOption(option2));
                        }
                    }
                    i++;
                }
                return;
            }
        }
    }

    public static boolean shouldUseStreamUseCase(@NonNull C2429j.AbstractC2431b abstractC2431b) {
        if (abstractC2431b.mo63394a() == 0 && abstractC2431b.mo63393b() == 8) {
            return true;
        }
        return false;
    }
}
