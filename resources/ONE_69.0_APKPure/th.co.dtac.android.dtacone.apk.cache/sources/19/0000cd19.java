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
public abstract class AbstractC10658b {

    /* renamed from: io.opencensus.tags.b$b */
    /* loaded from: classes5.dex */
    public static final class C10660b extends TagContext {

        /* renamed from: a */
        public static final TagContext f63722a = new C10660b();

        @Override // io.opencensus.tags.TagContext
        public Iterator getIterator() {
            return Collections.emptySet().iterator();
        }
    }

    /* renamed from: io.opencensus.tags.b$c */
    /* loaded from: classes5.dex */
    public static final class C10661c extends TagContextBinarySerializer {

        /* renamed from: a */
        public static final TagContextBinarySerializer f63723a = new C10661c();

        /* renamed from: b */
        public static final byte[] f63724b = new byte[0];

        @Override // io.opencensus.tags.propagation.TagContextBinarySerializer
        public TagContext fromByteArray(byte[] bArr) {
            Utils.checkNotNull(bArr, "bytes");
            return AbstractC10658b.m30508a();
        }

        @Override // io.opencensus.tags.propagation.TagContextBinarySerializer
        public byte[] toByteArray(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            return f63724b;
        }
    }

    /* renamed from: io.opencensus.tags.b$e */
    /* loaded from: classes5.dex */
    public static final class C10663e extends TagContextTextFormat {

        /* renamed from: a */
        public static final C10663e f63726a = new C10663e();

        @Override // io.opencensus.tags.propagation.TagContextTextFormat
        public TagContext extract(Object obj, TagContextTextFormat.Getter getter) {
            Utils.checkNotNull(obj, "carrier");
            Utils.checkNotNull(getter, "getter");
            return AbstractC10658b.m30508a();
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
    public static final class C10664f extends TagPropagationComponent {

        /* renamed from: a */
        public static final TagPropagationComponent f63727a = new C10664f();

        @Override // io.opencensus.tags.propagation.TagPropagationComponent
        public TagContextBinarySerializer getBinarySerializer() {
            return AbstractC10658b.m30507b();
        }

        @Override // io.opencensus.tags.propagation.TagPropagationComponent
        public TagContextTextFormat getCorrelationContextFormat() {
            return AbstractC10658b.m30505d();
        }
    }

    /* renamed from: io.opencensus.tags.b$g */
    /* loaded from: classes5.dex */
    public static final class C10665g extends Tagger {

        /* renamed from: a */
        public static final Tagger f63728a = new C10665g();

        @Override // io.opencensus.tags.Tagger
        public TagContextBuilder currentBuilder() {
            return AbstractC10658b.m30506c();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContext empty() {
            return AbstractC10658b.m30508a();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContextBuilder emptyBuilder() {
            return AbstractC10658b.m30506c();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContext getCurrentTagContext() {
            return AbstractC10658b.m30508a();
        }

        @Override // io.opencensus.tags.Tagger
        public TagContextBuilder toBuilder(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            return AbstractC10658b.m30506c();
        }

        @Override // io.opencensus.tags.Tagger
        public Scope withTagContext(TagContext tagContext) {
            Utils.checkNotNull(tagContext, "tags");
            return NoopScope.getInstance();
        }
    }

    /* renamed from: io.opencensus.tags.b$h */
    /* loaded from: classes5.dex */
    public static final class C10666h extends TagsComponent {

        /* renamed from: a */
        public volatile boolean f63729a;

        public C10666h() {
        }

        @Override // io.opencensus.tags.TagsComponent
        public TaggingState getState() {
            this.f63729a = true;
            return TaggingState.DISABLED;
        }

        @Override // io.opencensus.tags.TagsComponent
        public TagPropagationComponent getTagPropagationComponent() {
            return AbstractC10658b.m30504e();
        }

        @Override // io.opencensus.tags.TagsComponent
        public Tagger getTagger() {
            return AbstractC10658b.m30503f();
        }

        @Override // io.opencensus.tags.TagsComponent
        public void setState(TaggingState taggingState) {
            Utils.checkNotNull(taggingState, RemoteConfigConstants.ResponseFieldKey.STATE);
            Utils.checkState(!this.f63729a, "State was already read, cannot set state.");
        }
    }

    /* renamed from: a */
    public static TagContext m30508a() {
        return C10660b.f63722a;
    }

    /* renamed from: b */
    public static TagContextBinarySerializer m30507b() {
        return C10661c.f63723a;
    }

    /* renamed from: c */
    public static TagContextBuilder m30506c() {
        return C10662d.f63725c;
    }

    /* renamed from: d */
    public static TagContextTextFormat m30505d() {
        return C10663e.f63726a;
    }

    /* renamed from: e */
    public static TagPropagationComponent m30504e() {
        return C10664f.f63727a;
    }

    /* renamed from: f */
    public static Tagger m30503f() {
        return C10665g.f63728a;
    }

    /* renamed from: g */
    public static TagsComponent m30502g() {
        return new C10666h();
    }

    /* renamed from: io.opencensus.tags.b$d */
    /* loaded from: classes5.dex */
    public static final class C10662d extends TagContextBuilder {

        /* renamed from: c */
        public static final TagContextBuilder f63725c = new C10662d();

        @Override // io.opencensus.tags.TagContextBuilder
        public TagContext build() {
            return AbstractC10658b.m30508a();
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