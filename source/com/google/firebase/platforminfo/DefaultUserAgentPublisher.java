package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* renamed from: a */
    public final String f56312a;

    /* renamed from: b */
    public final GlobalLibraryVersionRegistrar f56313b;

    public DefaultUserAgentPublisher(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f56312a = m37827c(set);
        this.f56313b = globalLibraryVersionRegistrar;
    }

    /* renamed from: a */
    public static /* synthetic */ UserAgentPublisher m37829a(ComponentContainer componentContainer) {
        return m37828b(componentContainer);
    }

    /* renamed from: b */
    public static /* synthetic */ UserAgentPublisher m37828b(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(AbstractC17797Ii0.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    /* renamed from: c */
    public static String m37827c(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC17797Ii0 abstractC17797Ii0 = (AbstractC17797Ii0) it.next();
            sb.append(abstractC17797Ii0.mo67879b());
            sb.append('/');
            sb.append(abstractC17797Ii0.mo67878c());
            if (it.hasNext()) {
                sb.append(TokenParser.f74560SP);
            }
        }
        return sb.toString();
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(AbstractC17797Ii0.class)).factory(new ComponentFactory() { // from class: rF
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultUserAgentPublisher.m37829a(componentContainer);
            }
        }).build();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        if (this.f56313b.m37826a().isEmpty()) {
            return this.f56312a;
        }
        return this.f56312a + TokenParser.f74560SP + m37827c(this.f56313b.m37826a());
    }
}
