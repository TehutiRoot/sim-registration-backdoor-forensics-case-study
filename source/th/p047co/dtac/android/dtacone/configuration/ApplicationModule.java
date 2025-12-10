package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import dagger.Module;
import dagger.Provides;
import id.zelory.compressor.Compressor;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.PermissionManager;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.manager.security.OneSecurePin;
import th.p047co.dtac.android.dtacone.manager.security.OneSecurePinSerializer;
import th.p047co.dtac.android.dtacone.manager.security.PinEncryption;
import th.p047co.dtac.android.dtacone.manager.security.SecurePin;
import th.p047co.dtac.android.dtacone.manager.security.SecurePinSerializer;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0015H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0017¢\u0006\u0004\b3\u00104J'\u00108\u001a\u0002072\u0006\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/ApplicationModule;", "", "Landroid/app/Application;", "application", "", "mixpanelToken", "<init>", "(Landroid/app/Application;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "repository", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "pref", "Lcom/google/gson/Gson;", "provideGson", "(Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;)Lcom/google/gson/Gson;", "Lth/co/dtac/android/dtacone/manager/bus/RxBus;", "provideRxBus", "()Lth/co/dtac/android/dtacone/manager/bus/RxBus;", "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "provideMixpanel", "()Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "Lid/zelory/compressor/Compressor;", "provideCompressor", "(Landroid/app/Application;)Lid/zelory/compressor/Compressor;", "Lth/co/dtac/android/dtacone/util/FileUtil;", "provideFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "provideBitmap", "(Lth/co/dtac/android/dtacone/util/FileUtil;)Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "provideDrawIdCard", "(Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;)Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "compressor", "Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "provideCompressImage", "(Lth/co/dtac/android/dtacone/util/FileUtil;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lid/zelory/compressor/Compressor;)Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "Lth/co/dtac/android/dtacone/manager/PermissionManager;", "providePermissionManager", "()Lth/co/dtac/android/dtacone/manager/PermissionManager;", "Landroid/content/Context;", "provideContext", "()Landroid/content/Context;", "Lcom/google/android/gms/vision/face/FaceDetector;", "provideFaceDetector", "()Lcom/google/android/gms/vision/face/FaceDetector;", "Lcom/google/mlkit/vision/face/FaceDetector;", "provideFaceDetectorMlKit", "()Lcom/google/mlkit/vision/face/FaceDetector;", "detector", "detectorMlKit", "Lth/co/dtac/android/dtacone/manager/face/FaceDetection;", "provideFaceDetection", "(Lcom/google/android/gms/vision/face/FaceDetector;Lcom/google/mlkit/vision/face/FaceDetector;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;)Lth/co/dtac/android/dtacone/manager/face/FaceDetection;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Application;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule */
/* loaded from: classes7.dex */
public class ApplicationModule {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Application f83086a;

    /* renamed from: b */
    public final String f83087b;

    public ApplicationModule(@NotNull Application application, @NotNull String mixpanelToken) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mixpanelToken, "mixpanelToken");
        this.f83086a = application;
        this.f83087b = mixpanelToken;
    }

    @Provides
    @Singleton
    @NotNull
    public BitmapUtil provideBitmap(@NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        return new BitmapUtil(fileUtil, this.f83086a);
    }

    @Provides
    @Singleton
    @NotNull
    public CompressImage provideCompressImage(@NotNull FileUtil fileUtil, @NotNull Rx2ThreadService threadService, @NotNull Compressor compressor) {
        Intrinsics.checkNotNullParameter(fileUtil, "fileUtil");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        return new CompressImage(fileUtil, threadService, compressor);
    }

    @Provides
    @Singleton
    @NotNull
    public final Compressor provideCompressor(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Compressor(application);
    }

    @Provides
    @Singleton
    @NotNull
    public final Context provideContext() {
        return this.f83086a;
    }

    @Provides
    @Singleton
    @NotNull
    public final DrawBitmap provideDrawIdCard(@NotNull BitmapUtil bitmapUtil) {
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        return new DrawBitmap(this.f83086a, bitmapUtil);
    }

    @Provides
    @Singleton
    @NotNull
    public FaceDetection provideFaceDetection(@NotNull FaceDetector detector, @NotNull com.google.mlkit.vision.face.FaceDetector detectorMlKit, @NotNull PreferencesRepository pref) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(detectorMlKit, "detectorMlKit");
        Intrinsics.checkNotNullParameter(pref, "pref");
        return new FaceDetection(detector, detectorMlKit, pref);
    }

    @Provides
    @Singleton
    @NotNull
    public FaceDetector provideFaceDetector() {
        FaceDetector build = new FaceDetector.Builder(this.f83086a).setTrackingEnabled(false).setLandmarkType(0).setClassificationType(0).setMode(1).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(application)\n   …                 .build()");
        return build;
    }

    @Provides
    @Singleton
    @NotNull
    public com.google.mlkit.vision.face.FaceDetector provideFaceDetectorMlKit() {
        FaceDetectorOptions build = new FaceDetectorOptions.Builder().setPerformanceMode(2).setLandmarkMode(2).setClassificationMode(2).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ALL)\n            .build()");
        com.google.mlkit.vision.face.FaceDetector client = com.google.mlkit.vision.face.FaceDetection.getClient(build);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(options)");
        return client;
    }

    @Provides
    @Singleton
    @NotNull
    public FileUtil provideFileUtil() {
        return new FileUtil(this.f83086a);
    }

    @Provides
    @Singleton
    @NotNull
    public Gson provideGson(@NotNull RtrRx2Repository repository, @NotNull PreferencesRepository pref) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pref, "pref");
        try {
            SecurePinSerializer securePinSerializer = new SecurePinSerializer(repository, new PinEncryption());
            Gson create = new GsonBuilder().registerTypeAdapter(SecurePin.class, securePinSerializer).registerTypeAdapter(OneSecurePin.class, new OneSecurePinSerializer(repository)).setPrettyPrinting().setLenient().create();
            Intrinsics.checkNotNullExpressionValue(create, "GsonBuilder()\n          …                .create()");
            return create;
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Provides
    @Singleton
    @NotNull
    public final MixpanelAPI provideMixpanel() {
        MixpanelAPI mixpanelAPI = MixpanelAPI.getInstance(this.f83086a, this.f83087b);
        Intrinsics.checkNotNullExpressionValue(mixpanelAPI, "getInstance(application, mixpanelToken)");
        return mixpanelAPI;
    }

    @Provides
    @Singleton
    @NotNull
    public final PermissionManager providePermissionManager() {
        return new PermissionManager();
    }

    @Provides
    @Singleton
    @NotNull
    public final RxBus<Object> provideRxBus() {
        RxBus<Object> createSimple = RxBus.createSimple();
        Intrinsics.checkNotNullExpressionValue(createSimple, "createSimple()");
        return createSimple;
    }
}
