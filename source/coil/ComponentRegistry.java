package coil;

import ch.qos.logback.core.joran.action.Action;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.intercept.Interceptor;
import coil.key.Keyer;
import coil.map.Mapper;
import coil.request.Options;
import coil.util.Collections;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u00015B«\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J?\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R9\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,¨\u00066"}, m28850d2 = {"Lcoil/ComponentRegistry;", "", "", "Lcoil/intercept/Interceptor;", "interceptors", "Lkotlin/Pair;", "Lcoil/map/Mapper;", "Ljava/lang/Class;", "mappers", "Lcoil/key/Keyer;", "keyers", "Lcoil/fetch/Fetcher$Factory;", "fetcherFactories", "Lcoil/decode/Decoder$Factory;", "decoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lcoil/request/Options;", "options", "map", "(Ljava/lang/Object;Lcoil/request/Options;)Ljava/lang/Object;", "", Action.KEY_ATTRIBUTE, "(Ljava/lang/Object;Lcoil/request/Options;)Ljava/lang/String;", "Lcoil/ImageLoader;", "imageLoader", "", "startIndex", "Lcoil/fetch/Fetcher;", "newFetcher", "(Ljava/lang/Object;Lcoil/request/Options;Lcoil/ImageLoader;I)Lkotlin/Pair;", "Lcoil/fetch/SourceResult;", "result", "Lcoil/decode/Decoder;", "newDecoder", "(Lcoil/fetch/SourceResult;Lcoil/request/Options;Lcoil/ImageLoader;I)Lkotlin/Pair;", "Lcoil/ComponentRegistry$Builder;", "newBuilder", "()Lcoil/ComponentRegistry$Builder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMappers", OperatorName.CURVE_TO, "getKeyers", "d", "getFetcherFactories", "e", "getDecoderFactories", "Builder", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComponentRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n12#2,2:178\n15#2:181\n12#2,4:182\n1#3:180\n*S KotlinDebug\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n*L\n38#1:178,2\n38#1:181\n52#1:182,4\n*E\n"})
/* loaded from: classes3.dex */
public final class ComponentRegistry {

    /* renamed from: a */
    public final List f40386a;

    /* renamed from: b */
    public final List f40387b;

    /* renamed from: c */
    public final List f40388c;

    /* renamed from: d */
    public final List f40389d;

    /* renamed from: e */
    public final List f40390e;

    @Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ.\u0010\t\u001a\u00020\u0000\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\fH\u0086\b¢\u0006\u0004\b\t\u0010\u000eJ7\u0010\t\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\t\u0010\u0011J*\u0010\t\u001a\u00020\u0000\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b\t\u0010\u0014J3\u0010\t\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\t\u0010\u0015J*\u0010\t\u001a\u00020\u0000\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\b¢\u0006\u0004\b\t\u0010\u0018J3\u0010\t\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\t\u0010\u0019J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b\t\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R@\u0010'\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0$0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R<\u0010*\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0$0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R<\u0010-\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0$0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R \u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"¨\u00061"}, m28850d2 = {"Lcoil/ComponentRegistry$Builder;", "", "<init>", "()V", "Lcoil/ComponentRegistry;", "registry", "(Lcoil/ComponentRegistry;)V", "Lcoil/intercept/Interceptor;", "interceptor", ProductAction.ACTION_ADD, "(Lcoil/intercept/Interceptor;)Lcoil/ComponentRegistry$Builder;", "T", "Lcoil/map/Mapper;", "mapper", "(Lcoil/map/Mapper;)Lcoil/ComponentRegistry$Builder;", "Ljava/lang/Class;", "type", "(Lcoil/map/Mapper;Ljava/lang/Class;)Lcoil/ComponentRegistry$Builder;", "Lcoil/key/Keyer;", "keyer", "(Lcoil/key/Keyer;)Lcoil/ComponentRegistry$Builder;", "(Lcoil/key/Keyer;Ljava/lang/Class;)Lcoil/ComponentRegistry$Builder;", "Lcoil/fetch/Fetcher$Factory;", "factory", "(Lcoil/fetch/Fetcher$Factory;)Lcoil/ComponentRegistry$Builder;", "(Lcoil/fetch/Fetcher$Factory;Ljava/lang/Class;)Lcoil/ComponentRegistry$Builder;", "Lcoil/decode/Decoder$Factory;", "(Lcoil/decode/Decoder$Factory;)Lcoil/ComponentRegistry$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcoil/ComponentRegistry;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "Lkotlin/Pair;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMappers$coil_base_release", "mappers", OperatorName.CURVE_TO, "getKeyers$coil_base_release", "keyers", "d", "getFetcherFactories$coil_base_release", "fetcherFactories", "e", "getDecoderFactories$coil_base_release", "decoderFactories", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f40391a;

        /* renamed from: b */
        public final List f40392b;

        /* renamed from: c */
        public final List f40393c;

        /* renamed from: d */
        public final List f40394d;

        /* renamed from: e */
        public final List f40395e;

        public Builder() {
            this.f40391a = new ArrayList();
            this.f40392b = new ArrayList();
            this.f40393c = new ArrayList();
            this.f40394d = new ArrayList();
            this.f40395e = new ArrayList();
        }

        @NotNull
        public final Builder add(@NotNull Interceptor interceptor) {
            this.f40391a.add(interceptor);
            return this;
        }

        @NotNull
        public final ComponentRegistry build() {
            return new ComponentRegistry(Collections.toImmutableList(this.f40391a), Collections.toImmutableList(this.f40392b), Collections.toImmutableList(this.f40393c), Collections.toImmutableList(this.f40394d), Collections.toImmutableList(this.f40395e), null);
        }

        @NotNull
        public final List<Decoder.Factory> getDecoderFactories$coil_base_release() {
            return this.f40395e;
        }

        @NotNull
        public final List<Pair<Fetcher.Factory<? extends Object>, Class<? extends Object>>> getFetcherFactories$coil_base_release() {
            return this.f40394d;
        }

        @NotNull
        public final List<Interceptor> getInterceptors$coil_base_release() {
            return this.f40391a;
        }

        @NotNull
        public final List<Pair<Keyer<? extends Object>, Class<? extends Object>>> getKeyers$coil_base_release() {
            return this.f40393c;
        }

        @NotNull
        public final List<Pair<Mapper<? extends Object, ?>, Class<? extends Object>>> getMappers$coil_base_release() {
            return this.f40392b;
        }

        public final /* synthetic */ <T> Builder add(Mapper<T, ?> mapper) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return add(mapper, Object.class);
        }

        @NotNull
        public final <T> Builder add(@NotNull Mapper<T, ?> mapper, @NotNull Class<T> cls) {
            this.f40392b.add(TuplesKt.m28844to(mapper, cls));
            return this;
        }

        public final /* synthetic */ <T> Builder add(Keyer<T> keyer) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return add(keyer, Object.class);
        }

        @NotNull
        public final <T> Builder add(@NotNull Keyer<T> keyer, @NotNull Class<T> cls) {
            this.f40393c.add(TuplesKt.m28844to(keyer, cls));
            return this;
        }

        public final /* synthetic */ <T> Builder add(Fetcher.Factory<T> factory) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return add(factory, Object.class);
        }

        public Builder(@NotNull ComponentRegistry componentRegistry) {
            this.f40391a = CollectionsKt___CollectionsKt.toMutableList((Collection) componentRegistry.getInterceptors());
            this.f40392b = CollectionsKt___CollectionsKt.toMutableList((Collection) componentRegistry.getMappers());
            this.f40393c = CollectionsKt___CollectionsKt.toMutableList((Collection) componentRegistry.getKeyers());
            this.f40394d = CollectionsKt___CollectionsKt.toMutableList((Collection) componentRegistry.getFetcherFactories());
            this.f40395e = CollectionsKt___CollectionsKt.toMutableList((Collection) componentRegistry.getDecoderFactories());
        }

        @NotNull
        public final <T> Builder add(@NotNull Fetcher.Factory<T> factory, @NotNull Class<T> cls) {
            this.f40394d.add(TuplesKt.m28844to(factory, cls));
            return this;
        }

        @NotNull
        public final Builder add(@NotNull Decoder.Factory factory) {
            this.f40395e.add(factory);
            return this;
        }
    }

    public /* synthetic */ ComponentRegistry(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public static /* synthetic */ Pair newDecoder$default(ComponentRegistry componentRegistry, SourceResult sourceResult, Options options, ImageLoader imageLoader, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return componentRegistry.newDecoder(sourceResult, options, imageLoader, i);
    }

    public static /* synthetic */ Pair newFetcher$default(ComponentRegistry componentRegistry, Object obj, Options options, ImageLoader imageLoader, int i, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return componentRegistry.newFetcher(obj, options, imageLoader, i);
    }

    @NotNull
    public final List<Decoder.Factory> getDecoderFactories() {
        return this.f40390e;
    }

    @NotNull
    public final List<Pair<Fetcher.Factory<? extends Object>, Class<? extends Object>>> getFetcherFactories() {
        return this.f40389d;
    }

    @NotNull
    public final List<Interceptor> getInterceptors() {
        return this.f40386a;
    }

    @NotNull
    public final List<Pair<Keyer<? extends Object>, Class<? extends Object>>> getKeyers() {
        return this.f40388c;
    }

    @NotNull
    public final List<Pair<Mapper<? extends Object, ? extends Object>, Class<? extends Object>>> getMappers() {
        return this.f40387b;
    }

    @Nullable
    public final String key(@NotNull Object obj, @NotNull Options options) {
        List list = this.f40388c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            Keyer keyer = (Keyer) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(keyer, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String key = keyer.key(obj, options);
                if (key != null) {
                    return key;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Object map(@NotNull Object obj, @NotNull Options options) {
        List list = this.f40387b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            Mapper mapper = (Mapper) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(mapper, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object map = mapper.map(obj, options);
                if (map != null) {
                    obj = map;
                }
            }
        }
        return obj;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @JvmOverloads
    @Nullable
    public final Pair<Decoder, Integer> newDecoder(@NotNull SourceResult sourceResult, @NotNull Options options, @NotNull ImageLoader imageLoader) {
        return newDecoder$default(this, sourceResult, options, imageLoader, 0, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final Pair<Fetcher, Integer> newFetcher(@NotNull Object obj, @NotNull Options options, @NotNull ImageLoader imageLoader) {
        return newFetcher$default(this, obj, options, imageLoader, 0, 8, null);
    }

    public ComponentRegistry(List list, List list2, List list3, List list4, List list5) {
        this.f40386a = list;
        this.f40387b = list2;
        this.f40388c = list3;
        this.f40389d = list4;
        this.f40390e = list5;
    }

    @JvmOverloads
    @Nullable
    public final Pair<Decoder, Integer> newDecoder(@NotNull SourceResult sourceResult, @NotNull Options options, @NotNull ImageLoader imageLoader, int i) {
        int size = this.f40390e.size();
        while (i < size) {
            Decoder create = ((Decoder.Factory) this.f40390e.get(i)).create(sourceResult, options, imageLoader);
            if (create != null) {
                return TuplesKt.m28844to(create, Integer.valueOf(i));
            }
            i++;
        }
        return null;
    }

    @JvmOverloads
    @Nullable
    public final Pair<Fetcher, Integer> newFetcher(@NotNull Object obj, @NotNull Options options, @NotNull ImageLoader imageLoader, int i) {
        int size = this.f40389d.size();
        while (i < size) {
            Pair pair = (Pair) this.f40389d.get(i);
            Fetcher.Factory factory = (Fetcher.Factory) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(factory, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                Fetcher create = factory.create(obj, options, imageLoader);
                if (create != null) {
                    return TuplesKt.m28844to(create, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }

    public ComponentRegistry() {
        this(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }
}
