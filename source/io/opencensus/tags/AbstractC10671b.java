package io.opencensus.tags;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.opencensus.common.Scope;
import io.opencensus.internal.NoopScope;
import io.opencensus.internal.Utils;
import io.opencensus.tags.propagation.TagContextBinarySerializer;
import io.opencensus.tags.propagation.TagContextTextFormat;
import io.opencensus.tags.propagation.TagPropagationComponent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.opencensus.tags.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10671b {

    /* renamed from: io.opencensus.tags.b$b */
    /* loaded from: classes5.dex */
    public static final class C10673b extends TagContext {

        /* renamed from: a */
        public static final TagContext f63659a = new C10673b();

        @Override // io.opencensus.tags.TagContext
        public Iterator getIterator() {
            return Collections.emptySet().iterator();
        }
    }

    /* renamed from: io.opencensus.tags.b$c */
    /* loaded from: classes5.dex */
    public static final class C10674c extends TagContextBinarySerializer {

        /* renamed from: a */
        public static final TagContextBinarySerializer f63660a = new C10674c();

        /* renamed from: b */
        public static final byte[] f63661b = new byte[0];

        @Override // io.opencensus.tags.propagation.TagContextBinarySerializer
        public TagContext fromByteArray(byte[] bArr) {
            Utils.checkNotNull(bArr, "bytes");
            return AbstractC10671b.m30168a();
        }

        @Override // io.opencensus.tags.propagation.TagContextBinarySerializer
        public byte[] toByteArray(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            return f63661b;
        }
    }

    /* renamed from: io.opencensus.tags.b$e */
    /* loaded from: classes5.dex */
    public static final class C10676e extends TagContextTextFormat {

        /* renamed from: a */
        public static final C10676e f63663a = new C10676e();

        @Override // io.opencensus.tags.propagation.TagContextTextFormat
        public TagContext extract(Object obj, TagContextTextFormat.Getter getter) {
            Utils.checkNotNull(obj, "carrier");
            Utils.checkNotNull(getter, "getter");
            return AbstractC10671b.m30168a();
        }

        @Override // io.opencensus.tags.propagation.TagContextTextFormat
        public List fields() {
            return Collections.emptyList();
        }

        @Override // io.opencensus.tags.propagation.TagContextTextFormat
        public void inject(TagContext tagContext, Object obj, TagContextTextFormat.Setter setter) {
            Utils.checkNotNull(tagContext, "tagContext");
            Utils.checkNotNull(obj, "carrier");
            Utils.checkNotNull(setter, "setter");
        }
    }

    /* renamed from: io.opencensus.tags.b$f */
    /* loaded from: classes5.dex */
    public static final class C10677f extends TagPropagationComponent {

        /* renamed from: a */
        public static final TagPropagationComponent f63664a = new C10677f();

        @Override // io.opencensus.tags.propagation.TagPropagationComponent
        public TagContextBinarySerializer getBinarySerializer() {
            return AbstractC10671b.m30167b();
        }

        @Override // io.opencensus.tags.propagation.TagPropagationComponent
        public TagContextTextFormat getCorrelationContextFormat() {
            return AbstractC10671b.m30165d();
        }
    }

    /* renamed from: io.opencensus.tags.b$g */
    /* loaded from: classes5.dex */
    public static final class C10678g extends Tagger {

        /* renamed from: a */
        public static final Tagger f63665a = new C10678g();

        @Override // io.opencensus.tags.Tagger
        public TagContextBuilder currentBuilder() {
            return AbstractC10671b.m30166c();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContext empty() {
            return AbstractC10671b.m30168a();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContextBuilder emptyBuilder() {
            return AbstractC10671b.m30166c();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContext getCurrentTagContext() {
            return AbstractC10671b.m30168a();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContextBuilder toBuilder(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            return AbstractC10671b.m30166c();
        }

        @Override // io.opencensus.tags.Tagger
        public Scope withTagContext(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            return NoopScope.getInstance();
        }
    }

    /* renamed from: io.opencensus.tags.b$h */
    /* loaded from: classes5.dex */
    public static final class C10679h extends TagsComponent {

        /* renamed from: a */
        public volatile boolean f63666a;

        public C10679h() {
        }

        @Override // io.opencensus.tags.TagsComponent
        public TaggingState getState() {
            this.f63666a = true;
            return TaggingState.DISABLED;
        }

        @Override // io.opencensus.tags.TagsComponent
        public TagPropagationComponent getTagPropagationComponent() {
            return AbstractC10671b.m30164e();
        }

        @Override // io.opencensus.tags.TagsComponent
        public Tagger getTagger() {
            return AbstractC10671b.m30163f();
        }

        @Override // io.opencensus.tags.TagsComponent
        public void setState(TaggingState taggingState) {
            Utils.checkNotNull(taggingState, RemoteConfigConstants.ResponseFieldKey.STATE);
            Utils.checkState(!this.f63666a, "State was already read, cannot set state.");
        }
    }

    /* renamed from: a */
    public static TagContext m30168a() {
        return C10673b.f63659a;
    }

    /* renamed from: b */
    public static TagContextBinarySerializer m30167b() {
        return C10674c.f63660a;
    }

    /* renamed from: c */
    public static TagContextBuilder m30166c() {
        return C10675d.f63662c;
    }

    /* renamed from: d */
    public static TagContextTextFormat m30165d() {
        return C10676e.f63663a;
    }

    /* renamed from: e */
    public static TagPropagationComponent m30164e() {
        return C10677f.f63664a;
    }

    /* renamed from: f */
    public static Tagger m30163f() {
        return C10678g.f63665a;
    }

    /* renamed from: g */
    public static TagsComponent m30162g() {
        return new C10679h();
    }

    /* renamed from: io.opencensus.tags.b$d */
    /* loaded from: classes5.dex */
    public static final class C10675d extends TagContextBuilder {

        /* renamed from: c */
        public static final TagContextBuilder f63662c = new C10675d();

        @Override // io.opencensus.tags.TagContextBuilder
        public TagContext build() {
            return AbstractC10671b.m30168a();
        }

        @Override // io.opencensus.tags.TagContextBuilder
        public Scope buildScoped() {
            return NoopScope.getInstance();
        }

        @Override // io.opencensus.tags.TagContextBuilder
        public TagContextBuilder put(TagKey tagKey, TagValue tagValue) {
            Utils.checkNotNull(tagKey, Action.KEY_ATTRIBUTE);
            Utils.checkNotNull(tagValue, "value");
            return this;
        }

        @Override // io.opencensus.tags.TagContextBuilder
        public TagContextBuilder remove(TagKey tagKey) {
            Utils.checkNotNull(tagKey, Action.KEY_ATTRIBUTE);
            return this;
        }

        @Override // io.opencensus.tags.TagContextBuilder
        public TagContextBuilder put(TagKey tagKey, TagValue tagValue, TagMetadata tagMetadata) {
            Utils.checkNotNull(tagKey, Action.KEY_ATTRIBUTE);
            Utils.checkNotNull(tagValue, "value");
            Utils.checkNotNull(tagMetadata, "tagMetadata");
            return this;
        }
    }
}
