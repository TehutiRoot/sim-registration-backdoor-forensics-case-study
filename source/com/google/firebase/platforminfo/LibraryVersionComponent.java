package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* loaded from: classes4.dex */
public class LibraryVersionComponent {

    /* loaded from: classes4.dex */
    public interface VersionExtractor<T> {
        String extract(T t);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC17797Ii0 m37824b(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
        return AbstractC17797Ii0.m67880a(str, versionExtractor.extract((Context) componentContainer.get(Context.class)));
    }

    public static Component<?> create(String str, String str2) {
        return Component.intoSet(AbstractC17797Ii0.m67880a(str, str2), AbstractC17797Ii0.class);
    }

    public static Component<?> fromContext(final String str, final VersionExtractor<Context> versionExtractor) {
        return Component.intoSetBuilder(AbstractC17797Ii0.class).add(Dependency.required(Context.class)).factory(new ComponentFactory() { // from class: Ji0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                AbstractC17797Ii0 m37824b;
                m37824b = LibraryVersionComponent.m37824b(str, versionExtractor, componentContainer);
                return m37824b;
            }
        }).build();
    }
}
