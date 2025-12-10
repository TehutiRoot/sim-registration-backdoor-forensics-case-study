package io.opencensus.tags;

import io.opencensus.internal.Provider;
import io.opencensus.tags.propagation.TagPropagationComponent;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Tags {

    /* renamed from: a */
    public static final Logger f63656a = Logger.getLogger(Tags.class.getName());

    /* renamed from: b */
    public static final TagsComponent f63657b = m30169a(TagsComponent.class.getClassLoader());

    /* renamed from: a */
    public static TagsComponent m30169a(ClassLoader classLoader) {
        try {
            return (TagsComponent) Provider.createInstance(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), TagsComponent.class);
        } catch (ClassNotFoundException e) {
            f63656a.log(Level.FINE, "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (TagsComponent) Provider.createInstance(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), TagsComponent.class);
            } catch (ClassNotFoundException e2) {
                f63656a.log(Level.FINE, "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", (Throwable) e2);
                return AbstractC10671b.m30162g();
            }
        }
    }

    public static TaggingState getState() {
        return f63657b.getState();
    }

    public static TagPropagationComponent getTagPropagationComponent() {
        return f63657b.getTagPropagationComponent();
    }

    public static Tagger getTagger() {
        return f63657b.getTagger();
    }

    @Deprecated
    public static void setState(TaggingState taggingState) {
        f63657b.setState(taggingState);
    }
}
