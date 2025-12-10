package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CaptureConfig {
    public static final int TEMPLATE_TYPE_NONE = -1;

    /* renamed from: a */
    public final List f11109a;

    /* renamed from: b */
    public final Config f11110b;

    /* renamed from: c */
    public final int f11111c;

    /* renamed from: d */
    public final Range f11112d;

    /* renamed from: e */
    public final List f11113e;

    /* renamed from: f */
    public final boolean f11114f;

    /* renamed from: g */
    public final TagBundle f11115g;

    /* renamed from: h */
    public final CameraCaptureResult f11116h;
    public static final Config.Option<Integer> OPTION_ROTATION = Config.Option.create("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_JPEG_QUALITY = Config.Option.create("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: i */
    public static final Config.Option f11108i = Config.Option.create("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* loaded from: classes.dex */
    public interface OptionUnpacker {
        void unpack(@NonNull UseCaseConfig<?> useCaseConfig, @NonNull Builder builder);
    }

    public CaptureConfig(List list, Config config, int i, Range range, List list2, boolean z, TagBundle tagBundle, CameraCaptureResult cameraCaptureResult) {
        this.f11109a = list;
        this.f11110b = config;
        this.f11111c = i;
        this.f11112d = range;
        this.f11113e = Collections.unmodifiableList(list2);
        this.f11114f = z;
        this.f11115g = tagBundle;
        this.f11116h = cameraCaptureResult;
    }

    @NonNull
    public static CaptureConfig defaultEmptyCaptureConfig() {
        return new Builder().build();
    }

    @NonNull
    public List<CameraCaptureCallback> getCameraCaptureCallbacks() {
        return this.f11113e;
    }

    @Nullable
    public CameraCaptureResult getCameraCaptureResult() {
        return this.f11116h;
    }

    @NonNull
    public Range<Integer> getExpectedFrameRateRange() {
        Range<Integer> range = (Range) this.f11110b.retrieveOption(f11108i, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        Objects.requireNonNull(range);
        return range;
    }

    @NonNull
    public Config getImplementationOptions() {
        return this.f11110b;
    }

    @NonNull
    public List<DeferrableSurface> getSurfaces() {
        return Collections.unmodifiableList(this.f11109a);
    }

    @NonNull
    public TagBundle getTagBundle() {
        return this.f11115g;
    }

    public int getTemplateType() {
        return this.f11111c;
    }

    public boolean isUseRepeatingSurface() {
        return this.f11114f;
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Set f11117a;

        /* renamed from: b */
        public MutableConfig f11118b;

        /* renamed from: c */
        public int f11119c;

        /* renamed from: d */
        public Range f11120d;

        /* renamed from: e */
        public List f11121e;

        /* renamed from: f */
        public boolean f11122f;

        /* renamed from: g */
        public MutableTagBundle f11123g;

        /* renamed from: h */
        public CameraCaptureResult f11124h;

        public Builder() {
            this.f11117a = new HashSet();
            this.f11118b = MutableOptionsBundle.create();
            this.f11119c = -1;
            this.f11120d = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            this.f11121e = new ArrayList();
            this.f11122f = false;
            this.f11123g = MutableTagBundle.create();
        }

        @NonNull
        public static Builder createFrom(@NonNull UseCaseConfig<?> useCaseConfig) {
            OptionUnpacker captureOptionUnpacker = useCaseConfig.getCaptureOptionUnpacker(null);
            if (captureOptionUnpacker != null) {
                Builder builder = new Builder();
                captureOptionUnpacker.unpack(useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        @NonNull
        public static Builder from(@NonNull CaptureConfig captureConfig) {
            return new Builder(captureConfig);
        }

        public void addAllCameraCaptureCallbacks(@NonNull Collection<CameraCaptureCallback> collection) {
            for (CameraCaptureCallback cameraCaptureCallback : collection) {
                addCameraCaptureCallback(cameraCaptureCallback);
            }
        }

        public void addAllTags(@NonNull TagBundle tagBundle) {
            this.f11123g.addTagBundle(tagBundle);
        }

        public void addCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            if (this.f11121e.contains(cameraCaptureCallback)) {
                return;
            }
            this.f11121e.add(cameraCaptureCallback);
        }

        public <T> void addImplementationOption(@NonNull Config.Option<T> option, @NonNull T t) {
            this.f11118b.insertOption(option, t);
        }

        public void addImplementationOptions(@NonNull Config config) {
            for (Config.Option<?> option : config.listOptions()) {
                Object retrieveOption = this.f11118b.retrieveOption(option, null);
                Object retrieveOption2 = config.retrieveOption(option);
                if (retrieveOption instanceof MultiValueSet) {
                    ((MultiValueSet) retrieveOption).addAll(((MultiValueSet) retrieveOption2).getAllItems());
                } else {
                    if (retrieveOption2 instanceof MultiValueSet) {
                        retrieveOption2 = ((MultiValueSet) retrieveOption2).m69186clone();
                    }
                    this.f11118b.insertOption(option, config.getOptionPriority(option), retrieveOption2);
                }
            }
        }

        public void addSurface(@NonNull DeferrableSurface deferrableSurface) {
            this.f11117a.add(deferrableSurface);
        }

        public void addTag(@NonNull String str, @NonNull Object obj) {
            this.f11123g.putTag(str, obj);
        }

        @NonNull
        public CaptureConfig build() {
            return new CaptureConfig(new ArrayList(this.f11117a), OptionsBundle.from(this.f11118b), this.f11119c, this.f11120d, new ArrayList(this.f11121e), this.f11122f, TagBundle.from(this.f11123g), this.f11124h);
        }

        public void clearSurfaces() {
            this.f11117a.clear();
        }

        @Nullable
        public Range<Integer> getExpectedFrameRateRange() {
            return (Range) this.f11118b.retrieveOption(CaptureConfig.f11108i, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        }

        @NonNull
        public Config getImplementationOptions() {
            return this.f11118b;
        }

        @NonNull
        public Set<DeferrableSurface> getSurfaces() {
            return this.f11117a;
        }

        @Nullable
        public Object getTag(@NonNull String str) {
            return this.f11123g.getTag(str);
        }

        public int getTemplateType() {
            return this.f11119c;
        }

        public boolean isUseRepeatingSurface() {
            return this.f11122f;
        }

        public boolean removeCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            return this.f11121e.remove(cameraCaptureCallback);
        }

        public void removeSurface(@NonNull DeferrableSurface deferrableSurface) {
            this.f11117a.remove(deferrableSurface);
        }

        public void setCameraCaptureResult(@NonNull CameraCaptureResult cameraCaptureResult) {
            this.f11124h = cameraCaptureResult;
        }

        public void setExpectedFrameRateRange(@NonNull Range<Integer> range) {
            addImplementationOption(CaptureConfig.f11108i, range);
        }

        public void setImplementationOptions(@NonNull Config config) {
            this.f11118b = MutableOptionsBundle.from(config);
        }

        public void setTemplateType(int i) {
            this.f11119c = i;
        }

        public void setUseRepeatingSurface(boolean z) {
            this.f11122f = z;
        }

        public Builder(CaptureConfig captureConfig) {
            HashSet hashSet = new HashSet();
            this.f11117a = hashSet;
            this.f11118b = MutableOptionsBundle.create();
            this.f11119c = -1;
            this.f11120d = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            this.f11121e = new ArrayList();
            this.f11122f = false;
            this.f11123g = MutableTagBundle.create();
            hashSet.addAll(captureConfig.f11109a);
            this.f11118b = MutableOptionsBundle.from(captureConfig.f11110b);
            this.f11119c = captureConfig.f11111c;
            this.f11120d = captureConfig.f11112d;
            this.f11121e.addAll(captureConfig.getCameraCaptureCallbacks());
            this.f11122f = captureConfig.isUseRepeatingSurface();
            this.f11123g = MutableTagBundle.from(captureConfig.getTagBundle());
        }
    }
}
